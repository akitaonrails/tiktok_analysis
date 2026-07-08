package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2461209kg implements Runnable {
    public final C835520Wq6 LL;

    public AbstractRunnableC2461209kg() {
    }

    public AbstractRunnableC2461209kg(C835520Wq6 c835520Wq6) {
        this.LL = c835520Wq6;
    }

    public abstract void LIZJ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zze@d14e.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zze@d14e.run");
    }

    public final void LIZ() {
        try {
            LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ(e);
        }
    }

    public void LIZIZ(Exception exc) {
        C835520Wq6 c835520Wq6 = this.LL;
        if (c835520Wq6 != null) {
            c835520Wq6.LIZJ(exc);
        }
    }
}
