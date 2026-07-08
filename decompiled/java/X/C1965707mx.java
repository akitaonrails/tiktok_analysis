package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965707mx {
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

    public static Object LIZLLL(Object obj) throws NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField("mPendingActions");
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
        return declaredField.get(obj);
    }

    public static Object LIZ(Object obj, Object... objArr) {
        try {
            return LIZIZ(obj, objArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Meet exception when call Method '");
            sbLIZ.append("getSubReason");
            sbLIZ.append("' in ");
            sbLIZ.append(obj);
            C20441214yg.LJIILIIL("JavaCalls", C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public static Object LIZIZ(Object obj, Object... objArr) throws NoSuchMethodException {
        Class[] clsArr;
        Object[] objArr2;
        Class<?> cls;
        Class<?> cls2 = obj.getClass();
        if (objArr.length > 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if (obj2 instanceof C1965807my) {
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
        Method methodLIZJ = LIZJ(cls2, clsArr);
        if (objArr.length > 0) {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj3 = objArr[i2];
                if (obj3 != null && (obj3 instanceof C1965807my)) {
                    objArr2[i2] = null;
                } else {
                    objArr2[i2] = obj3;
                }
            }
        } else {
            objArr2 = null;
        }
        return C2204961BRm.a0(methodLIZJ, obj, objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJBq+yNSOFwQP8nx/ATWQIj7J5I=", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZJ(Class cls, Class... clsArr) throws NoSuchMethodException {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("getSubReason")) {
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
            return LIZJ(cls.getSuperclass(), clsArr);
        }
        throw new NoSuchMethodException();
    }
}
