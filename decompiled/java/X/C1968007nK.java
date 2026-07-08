package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968007nK {
    public static final Class<?>[] LIZ;
    public static final Map<Class<?>, Class<?>> LIZIZ;
    public static final Map<Class<?>, Class<?>> LIZJ;

    static {
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Class<?> cls3 = Float.TYPE;
        LIZ = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, cls, cls2, cls3, Double.TYPE};
        HashMap map = new HashMap();
        LIZIZ = map;
        LIZJ = new HashMap();
        map.put(Byte.TYPE, Byte.class);
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Short.TYPE, Short.class);
        map.put(Character.TYPE, Character.class);
        map.put(cls2, Long.class);
        map.put(cls, Integer.class);
        map.put(cls3, Float.class);
        map.put(Double.TYPE, Double.class);
        Class cls4 = Void.TYPE;
        map.put(cls4, cls4);
        for (Object obj : map.keySet()) {
            Class<?> cls5 = LIZIZ.get(obj);
            if (!obj.equals(cls5)) {
                LIZJ.put(cls5, (Class<?>) obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && (member.getDeclaringClass().getModifiers() & 7) == 0) {
                try {
                    accessibleObject.setAccessible(true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static float LIZ(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f;
        Object obj;
        float f2 = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr2[i];
            Class<?> cls2 = clsArr[i];
            if (cls.isPrimitive()) {
                if (!cls2.isPrimitive()) {
                    f = 0.1f;
                    obj = ((HashMap) LIZJ).get(cls2);
                } else {
                    f = 0.0f;
                    obj = cls2;
                }
                int i2 = 0;
                Object obj2 = obj;
                while (obj2 != cls && i2 < 7) {
                    Object[] objArr = LIZ;
                    if (obj2 == objArr[i2]) {
                        f += 0.1f;
                        if (i2 < 6) {
                            obj2 = objArr[i2 + 1];
                        }
                    }
                    i2++;
                    obj2 = obj2;
                }
            } else {
                f = 0.0f;
                Class<?> superclass = cls2;
                while (true) {
                    if (superclass != null) {
                        if (cls.equals(superclass)) {
                            break;
                        }
                        if (cls.isInterface() && LIZIZ(superclass, cls)) {
                            f += 0.25f;
                            break;
                        }
                        f += 1.0f;
                        superclass = superclass.getSuperclass();
                    } else {
                        f += 1.5f;
                        break;
                    }
                }
            }
            f2 += f;
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZIZ(Class cls, Class cls2) {
        if (cls2 == 0) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive() && cls.isPrimitive() && (cls = (Class) ((HashMap) LIZIZ).get(cls)) == null) {
            return false;
        }
        if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = (Class) ((HashMap) LIZJ).get(cls)) == null) {
            return false;
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            Class cls3 = Integer.TYPE;
            if (cls3.equals(cls)) {
                if (!Long.TYPE.equals(cls2) && !Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
            } else {
                Class cls4 = Long.TYPE;
                if (cls4.equals(cls)) {
                    if (!Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                        return false;
                    }
                } else {
                    if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                        return false;
                    }
                    Class cls5 = Float.TYPE;
                    if (cls5.equals(cls)) {
                        return Double.TYPE.equals(cls2);
                    }
                    if (Character.TYPE.equals(cls)) {
                        if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    } else if (Short.TYPE.equals(cls)) {
                        if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    } else {
                        if (!Byte.TYPE.equals(cls)) {
                            return false;
                        }
                        if (!Short.TYPE.equals(cls2) && !cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return cls2.isAssignableFrom(cls);
    }
}
