package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965307mt {
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

    public static Object LIZ(Object obj, Object... objArr) throws NoSuchMethodException {
        Class[] clsArr;
        Object[] objArr2;
        Class<?> cls;
        Class<?> cls2 = obj.getClass();
        if (objArr.length > 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if (obj2 instanceof C1965407mu) {
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
        Method methodLIZIZ = LIZIZ(cls2, clsArr);
        if (objArr.length > 0) {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj3 = objArr[i2];
                if (obj3 != null && (obj3 instanceof C1965407mu)) {
                    objArr2[i2] = null;
                } else {
                    objArr2[i2] = obj3;
                }
            }
        } else {
            objArr2 = null;
        }
        return C2204961BRm.a0(methodLIZIZ, obj, objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud8mZ3K2+W6UYRXu+e6qwTNMcpBq", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    public static Method LIZIZ(Class cls, Class... clsArr) throws NoSuchMethodException {
        try {
            cls = cls.getDeclaredMethod("getSubReason", clsArr);
            if (cls != 0) {
                cls.setAccessible(true);
                return cls;
            }
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            if (cls.getSuperclass() != null) {
                return LIZIZ(cls.getSuperclass(), clsArr);
            }
            throw new NoSuchMethodException();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new NoSuchMethodException();
        }
    }
}
