package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2463609l4 implements Runnable {
    public final C835520Wq6 LL;

    public AbstractRunnableC2463609l4() {
    }

    public AbstractRunnableC2463609l4(C835520Wq6 c835520Wq6) {
        this.LL = c835520Wq6;
    }

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzv@fd58.run");
        try {
            try {
                LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C835520Wq6 c835520Wq6 = this.LL;
                if (c835520Wq6 != null) {
                    c835520Wq6.LIZJ(e);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzv@fd58.run");
    }
}
