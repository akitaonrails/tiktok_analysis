package X;

import android.graphics.Canvas;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319950kS9 {
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
        if (!LIZJ) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    LIZ = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    LIZIZ = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    LIZ = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    LIZIZ = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method = LIZ;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = LIZIZ;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LIZJ = true;
        }
        try {
            if (z) {
                Method method3 = LIZ;
                if (method3 == null) {
                    return;
                }
                method3.invoke(canvas, new Object[0]);
                return;
            }
            Method method4 = LIZIZ;
            if (method4 == null) {
                return;
            }
            method4.invoke(canvas, new Object[0]);
        } catch (IllegalAccessException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }
}
