package one.cafebabe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> main = Class.forName("Main");
        Method method = main.getDeclaredMethod("main", String[].class);
        method.invoke(main, (Object) new String[]{});
    }
}