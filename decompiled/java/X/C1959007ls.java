package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959007ls {
    public static final Method LIZ;
    public static final Method LIZIZ;

    static {
        try {
            LIZ = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Field LIZ(Class<?> cls, String str) {
        Method method;
        Field field;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZ) == null || (field = (Field) C2204961BRm.a0(method, cls, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDih4BYt7ebRxQGAxrBegGnpBgB7Ew=", null))) == null) {
            return cls.getDeclaredField(str);
        }
        return field;
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method method2;
        if (Build.VERSION.SDK_INT < 29 || (method = LIZIZ) == null || (method2 = (Method) C2204961BRm.a0(method, cls, new Object[]{str, clsArr}, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdDih4BYt7ebRxQGAxrBegGnpBgB7Ew=", null))) == null) {
            return cls.getDeclaredMethod(str, clsArr);
        }
        return method2;
    }
}
