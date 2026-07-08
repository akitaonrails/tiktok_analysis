package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965907mz {
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

    public static Class<?>[] LIZLLL(Object... objArr) {
        Class<?> cls;
        if (objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof C1966007n0) {
                    clsArr[i] = null;
                } else {
                    cls = obj.getClass();
                }
            } else {
                cls = null;
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static Object[] LJ(Object... objArr) {
        if (objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof C1966007n0)) {
                objArr2[i] = null;
            } else {
                objArr2[i] = obj;
            }
        }
        return objArr2;
    }

    public static <T> T LIZJ(Object obj, String str) throws NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(superclass, new Object[0]);
                    for (int i = 0; i < fieldArr.length; i++) {
                        fieldArr[i].setAccessible(true);
                        if (fieldArr[i].getType().getName().equals(str)) {
                            declaredField = fieldArr[i];
                            break;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                declaredField = null;
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static Method LIZ(Method[] methodArr, String str, Class<?>[] clsArr) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null) {
                    if (clsArr == null || clsArr.length == 0) {
                        return method;
                    }
                } else if (clsArr == null) {
                    if (parameterTypes.length == 0) {
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
                        return method;
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodLIZ = LIZ(cls.getDeclaredMethods(), str, clsArr);
        if (methodLIZ == null) {
            try {
                methodLIZ = LIZ((Method[]) Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).invoke(cls, new Object[0]), str, clsArr);
                methodLIZ.setAccessible(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                methodLIZ = null;
            }
        }
        if (methodLIZ == null) {
            if (cls.getSuperclass() != null) {
                return LIZIZ(cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
        methodLIZ.setAccessible(true);
        return methodLIZ;
    }
}
