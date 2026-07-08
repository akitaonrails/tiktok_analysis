package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967007nA {
    public static final HashMap<Class, HashMap<String, Method>> LIZ = new HashMap<>();

    public static HashMap<String, Method> LIZ(Class<?> cls) {
        HashMap<Class, HashMap<String, Method>> map = LIZ;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        HashMap<String, Method> map2 = new HashMap<>();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getAnnotation(InterfaceC1967107nB.class) != null) {
                map2.put(method.getName(), method);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            map2.putAll(LIZ(superclass));
        }
        LIZ.put(cls, map2);
        return map2;
    }
}
