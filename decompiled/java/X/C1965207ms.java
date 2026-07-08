package X;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965207ms {
    public static final Map<Class<?>, Class<?>> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZ(Class cls, Class... clsArr) throws NoSuchMethodException {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("setPermissions")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == 0) {
                    if (clsArr == null || clsArr.length == 0) {
                        method.setAccessible(true);
                        return method;
                    }
                } else if (clsArr == null) {
                    if (parameterTypes.length == 0) {
                        method.setAccessible(true);
                        return method;
                    }
                } else {
                    if (parameterTypes.length == clsArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (!parameterTypes[i].isAssignableFrom(clsArr[i])) {
                                HashMap map = (HashMap) LIZ;
                                if (!map.containsKey(parameterTypes[i]) || !map.get(parameterTypes[i]).equals(map.get(clsArr[i]))) {
                                    break;
                                }
                            }
                        }
                        method.setAccessible(true);
                        return method;
                    }
                    continue;
                }
            }
        }
        if (cls.getSuperclass() != null) {
            return LIZ(cls.getSuperclass(), clsArr);
        }
        throw new NoSuchMethodException();
    }
}
