package X;

import android.app.Application;
import com.ss.android.common.applog.GlobalContext;

/* JADX INFO: renamed from: X.14B1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14B1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PrimeGlobalVariablesInitRunnable@6077.run");
        try {
            GlobalContext.setContext(C1BWL.LIZ());
            Application applicationLIZ = C1BWL.LIZ();
            applicationLIZ.getClass();
            C2354709Kn.LIZ = applicationLIZ;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrimeGlobalVariablesInitRunnable@6077.run");
    }
}
