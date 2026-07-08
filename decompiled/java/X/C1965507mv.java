package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965507mv {
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

    public static <T> T LIZJ(Object obj, String str) {
        try {
            return (T) LIZLLL(obj, str);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static <T> T LIZLLL(Object obj, String str) throws NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static Object LIZ(String str, Object obj, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2;
        Class<?> cls;
        Class<?> cls2 = obj.getClass();
        if (objArr.length > 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if (obj2 instanceof C1965607mw) {
                        clsArr[i] = null;
                    } else {
                        cls = obj2.getClass();
                    }
                } else {
                    cls = null;
                }
                clsArr[i] = cls;
            }
        } else {
            clsArr = null;
        }
        Method methodLIZIZ = LIZIZ(cls2, str, clsArr);
        if (objArr.length > 0) {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj3 = objArr[i2];
                if (obj3 != null && (obj3 instanceof C1965607mw)) {
                    objArr2[i2] = null;
                } else {
                    objArr2[i2] = obj3;
                }
            }
        } else {
            objArr2 = null;
        }
        return C2204961BRm.a0(methodLIZIZ, obj, objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tdof/xwVMiSQChsBMKiswrqg==", null));
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null) {
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
            return LIZIZ(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    public static void LJ(Object obj, String str, Object obj2) {
        try {
            LJFF(obj, str, obj2);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LJFF(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        do {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new NoSuchFieldException();
                }
            }
        } while (declaredField == null);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
