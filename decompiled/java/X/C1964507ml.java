package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964507ml {
    public static final Map<String, Method> LIZ = new HashMap();
    public static final HashMap<Class<?>, Class<?>> LIZIZ;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        LIZIZ = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZ(Class<?> cls, String str, Class... clsArr) {
        Method declaredMethod;
        Method[] declaredMethods;
        boolean zIsAssignableFrom;
        if (cls != null) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls.toString());
                sb.append("#");
                sb.append(str);
                if (clsArr.length > 0) {
                    for (Class cls2 : clsArr) {
                        sb.append(cls2.toString());
                        sb.append("#");
                    }
                } else {
                    sb.append(Void.class.toString());
                }
                String string = sb.toString();
                Map<String, Method> map = LIZ;
                synchronized (map) {
                    try {
                        declaredMethod = (Method) ((HashMap) map).get(string);
                    } finally {
                    }
                }
                if (declaredMethod != null) {
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    return declaredMethod;
                }
                while (cls != null) {
                    try {
                        if (C1963507mb.LIZ()) {
                            if (C1963507mb.LIZ()) {
                                try {
                                    declaredMethod = C1958407lm.LIZ(cls, str, clsArr);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    declaredMethod = null;
                                }
                            } else {
                                declaredMethod = LIZ(cls, str, clsArr);
                            }
                            if (declaredMethod == null) {
                                declaredMethod = cls.getDeclaredMethod(str, clsArr);
                            }
                        } else {
                            declaredMethod = cls.getDeclaredMethod(str, clsArr);
                        }
                    } catch (NoSuchMethodException e) {
                    }
                    if (declaredMethod == null && (declaredMethods = cls.getDeclaredMethods()) != null) {
                        for (Method method : declaredMethods) {
                            if (method != null && TextUtils.equals(method.getName(), str)) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (clsArr.length == parameterTypes.length) {
                                    boolean z = true;
                                    for (int i = 0; i < clsArr.length; i++) {
                                        Class cls3 = clsArr[i];
                                        Class<?> cls4 = parameterTypes[i];
                                        if (cls4 == null) {
                                            zIsAssignableFrom = false;
                                        } else if (cls3 == null) {
                                            zIsAssignableFrom = !cls4.isPrimitive();
                                        } else {
                                            if (cls3.isPrimitive() && !cls4.isPrimitive()) {
                                                cls3 = (Class) LIZIZ.get(cls3);
                                            }
                                            boolean zIsPrimitive = cls4.isPrimitive();
                                            Class cls5 = cls4;
                                            if (zIsPrimitive) {
                                                cls5 = cls4;
                                                if (!cls3.isPrimitive()) {
                                                    cls5 = LIZIZ.get(cls4);
                                                }
                                            }
                                            zIsAssignableFrom = cls5.isAssignableFrom(cls3);
                                        }
                                        if (!zIsAssignableFrom) {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        declaredMethod = method;
                                    }
                                }
                            }
                        }
                    }
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        Map<String, Method> map2 = LIZ;
                        synchronized (map2) {
                            try {
                                ((HashMap) map2).put(string, declaredMethod);
                            } finally {
                            }
                        }
                        return declaredMethod;
                    }
                    cls = cls.getSuperclass();
                }
                return null;
            }
            throw new IllegalArgumentException("The method name must not be blank");
        }
        throw new IllegalArgumentException("The class must not be null");
    }

    public static Object LIZIZ(Class cls, String str, Object... objArr) {
        Class<?>[] clsArr;
        Class<?> cls2;
        if (objArr.length == 0) {
            objArr = C1964807mo.LIZ;
        }
        if (objArr.length != 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    cls2 = null;
                } else {
                    cls2 = obj.getClass();
                }
                clsArr[i] = cls2;
            }
        } else {
            clsArr = C1964807mo.LIZIZ;
        }
        if (clsArr.length == 0) {
            clsArr = C1964807mo.LIZIZ;
        }
        if (objArr.length == 0) {
            objArr = C1964807mo.LIZ;
        }
        Method methodLIZ = LIZ(cls, str, clsArr);
        if (methodLIZ == null) {
            return null;
        }
        return C2204961BRm.a0(methodLIZ, null, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPGXpKJLSCTCOmbJ5mIOe6MZSrX9Z2cbaQ=", null));
    }
}
