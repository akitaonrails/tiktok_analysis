package X;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20143713rn {
    public static void LIZ(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            C20143913rp.LIZ(theme);
            return;
        }
        synchronized (C20143813ro.LIZ) {
            try {
                if (!C20143813ro.LIZJ) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        C20143813ro.LIZIZ = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C20143813ro.LIZJ = true;
                }
                Method method = C20143813ro.LIZIZ;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C20143813ro.LIZIZ = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
