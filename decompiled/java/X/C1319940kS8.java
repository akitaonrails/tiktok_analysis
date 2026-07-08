package X;

import android.graphics.Canvas;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319940kS8 {
    public static Method LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i != 28) {
            if (!LIZJ) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    LIZ = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    LIZIZ = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LIZJ = true;
            }
            try {
                if (z) {
                    Method method = LIZ;
                    if (method == null) {
                        return;
                    }
                    method.invoke(canvas, new Object[0]);
                    return;
                }
                Method method2 = LIZIZ;
                if (method2 == null) {
                    return;
                }
                method2.invoke(canvas, new Object[0]);
                return;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3.getCause());
            }
        }
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
