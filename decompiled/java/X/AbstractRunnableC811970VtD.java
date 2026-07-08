package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC811970VtD implements Runnable {
    public final C835520Wq6 LL;

    public AbstractRunnableC811970VtD() {
    }

    public AbstractRunnableC811970VtD(C835520Wq6 c835520Wq6) {
        this.LL = c835520Wq6;
    }

    public abstract void LIZIZ();

    public final void LIZ() {
        try {
            LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C835520Wq6 c835520Wq6 = this.LL;
            if (c835520Wq6 != null) {
                c835520Wq6.LIZJ(e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zze@b761.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zze@b761.run");
    }
}
