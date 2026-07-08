package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.07nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968607nQ {
    public static final Set<Class<?>> LIZLLL = LIZIZ(JavaOnlyMap.class);
    public static final Set<Class<?>> LJ = LIZIZ(JavaOnlyArray.class);
    public final Class[] LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C1968607nQ(Method method) {
        method.setAccessible(true);
        this.LIZ = method.getParameterTypes();
    }

    public static char LIZ(Class cls) {
        if (cls.equals(Byte.TYPE)) {
            return 'b';
        }
        if (cls.equals(Byte.class)) {
            return 'B';
        }
        if (cls.equals(Short.TYPE)) {
            return 's';
        }
        if (cls.equals(Short.class)) {
            return 'S';
        }
        if (cls.equals(Long.TYPE)) {
            return 'l';
        }
        if (cls.equals(Long.class)) {
            return 'L';
        }
        if (cls.equals(Character.TYPE)) {
            return 'c';
        }
        if (cls.equals(Character.class)) {
            return 'C';
        }
        if (cls.equals(Boolean.TYPE)) {
            return 'z';
        }
        if (cls.equals(Boolean.class)) {
            return 'Z';
        }
        if (cls.equals(Integer.TYPE)) {
            return 'i';
        }
        if (cls.equals(Integer.class)) {
            return 'I';
        }
        if (cls.equals(Double.TYPE)) {
            return 'd';
        }
        if (cls.equals(Double.class)) {
            return 'D';
        }
        if (cls.equals(Float.TYPE)) {
            return 'f';
        }
        if (cls.equals(Float.class)) {
            return 'F';
        }
        if (cls.equals(String.class)) {
            return 'T';
        }
        return (char) 0;
    }

    public static Set<Class<?>> LIZIZ(Class<?> cls) {
        HashSet hashSet = new HashSet();
        hashSet.add(cls);
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            hashSet.add(superclass);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            hashSet.addAll(Arrays.asList(interfaces));
        }
        return hashSet;
    }
}
