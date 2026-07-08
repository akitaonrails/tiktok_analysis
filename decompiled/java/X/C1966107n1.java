package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966107n1 {
    public static final Map<Class<?>, Class<?>> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(Character.class, Character.TYPE);
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

    public static Class<?>[] LIZIZ(Object... objArr) {
        Class<?> cls;
        if (objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static boolean LIZ(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        }
        if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (cls != cls2) {
                if (cls == null) {
                    if (cls2 != null) {
                        return false;
                    }
                } else if (cls2 == null && cls != null) {
                    return false;
                }
                if (!cls.isAssignableFrom(cls2)) {
                    Map<Class<?>, Class<?>> map = LIZ;
                    if (((HashMap) map).containsKey(clsArr[i])) {
                        if (!((HashMap) map).get(clsArr[i]).equals(((HashMap) map).get(clsArr2[i]))) {
                        }
                    }
                    return false;
                }
                continue;
            }
        }
        return true;
    }

    public static Object LIZJ(Class cls, Object... objArr) {
        int i;
        Class<?>[] clsArrLIZIZ = LIZIZ(objArr);
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.getName().equals("setPermissions") && LIZ(method.getParameterTypes(), clsArrLIZIZ)) {
                    method.setAccessible(true);
                    return C2204961BRm.a0(method, null, objArr, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmTvQgu0Ud0XKrhM=", null));
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method '");
        sbLIZ.append("setPermissions");
        sbLIZ.append(" not found in ");
        sbLIZ.append(cls.getName());
        throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object LIZLLL(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
