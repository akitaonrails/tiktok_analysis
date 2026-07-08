package X;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W4A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4A {
    public static UserManager LIZ;
    public static volatile boolean LIZIZ = !LIZ();

    public static boolean LIZ() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean LIZIZ(Context context) {
        if (LIZIZ) {
            return true;
        }
        synchronized (C0W4A.class) {
            try {
                if (LIZIZ) {
                    return true;
                }
                boolean zLIZJ = LIZJ(context);
                if (zLIZJ) {
                    LIZIZ = zLIZJ;
                }
                return zLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZJ(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (LIZ == null) {
                LIZ = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = LIZ;
            if (userManager == null) {
                return true;
            }
            try {
                if (C2204961BRm.LLIIIILZ(userManager, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNOw", new String[]{"016a9"}))) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ = null;
                i++;
            }
        }
        z = z2;
        if (z2) {
            LIZ = null;
        }
        return z;
    }
}
