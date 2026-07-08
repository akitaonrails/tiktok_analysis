package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.08Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133408Xk {
    public static Field LIZLLL(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    return declaredField;
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        throw new C2133208Xi(C786410Ut5.j4("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    public static Method LJ(Class cls, String str, Class... clsArr) {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                }
                return declaredMethod;
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        throw new C2133208Xi(C786410Ut5.j4("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    public static Object LIZJ(Class cls, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(C2204961BRm.a0(LJ(cls, "isDexOptNeeded", cls3), null, new Object[]{obj}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvGg==", new String[]{"016a9"})));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2133208Xi(C786410Ut5.j4("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    public static Object LIZ(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(C2204961BRm.a0(LJ(obj.getClass(), str, cls2), obj, new Object[]{obj2}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvGg==", new String[]{"016a9"})));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2133208Xi(C786410Ut5.j4("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    public static Object LIZIZ(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, C0VSJ c0vsj, Class cls4, Object obj3) {
        try {
            return cls.cast(C2204961BRm.a0(LJ(obj.getClass(), str, cls2, cls3, cls4), obj, new Object[]{obj2, c0vsj, obj3}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSvGg==", new String[]{"016a9"})));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C2133208Xi(C786410Ut5.j4("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }
}
