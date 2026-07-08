package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959307lv {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public static final Method LIZLLL;

    static {
        try {
            LIZ = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            LIZJ = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            LIZLLL = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Class<?> LIZ(String str) {
        Method method;
        Class<?> cls;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZLLL) == null || (cls = (Class) C2204961BRm.a0(method, null, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDhmoxD6t2uqII1A+ybTCMwl7TNSg==", null))) == null) {
            return Class.forName(str);
        }
        return cls;
    }

    public static Constructor LIZIZ(Class<?> cls, Class<?>... clsArr) {
        Method method;
        Constructor constructor;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZJ) == null || (constructor = (Constructor) C2204961BRm.a0(method, cls, new Object[]{clsArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDhmoxD6t2uqII1A+ybTCMwl7TNSg==", null))) == null) {
            return cls.getDeclaredConstructor(clsArr);
        }
        return constructor;
    }

    public static Field LIZJ(Class<?> cls, String str) {
        Method method;
        Field field;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (field = (Field) C2204961BRm.a0(method, cls, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDhmoxD6t2uqII1A+ybTCMwl7TNSg==", null))) == null) {
            return cls.getDeclaredField(str);
        }
        return field;
    }

    public static Object LJ(Object obj, String str) {
        try {
            Field fieldLIZJ = LIZJ(obj.getClass(), str);
            fieldLIZJ.setAccessible(true);
            return fieldLIZJ.get(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Method LIZLLL(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (method2 = (Method) C2204961BRm.a0(method, cls, new Object[]{str, clsArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDhmoxD6t2uqII1A+ybTCMwl7TNSg==", null))) == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method2;
    }
}
