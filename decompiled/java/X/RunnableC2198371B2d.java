package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class RunnableC2198371B2d extends AbstractC2198351B2b implements Runnable {
    public volatile C1B2U LLILLJJLI;
    public volatile C1B2U LLILLL;
    public volatile boolean LLILZ;
    public volatile boolean LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CheckUrlSecManager$checkUrlRunnable@8155.run");
        try {
            if (C2198391B2f.LJFF == null) {
                C2198391B2f.LJFF = new C2192908iV();
            }
            if (C2198391B2f.LIZ().LIZIZ) {
                LJIIIIZZ(true);
                if (C2198391B2f.LIZ().LIZJ) {
                    LJIIIIZZ(false);
                }
            } else {
                LJIIIIZZ(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckUrlSecManager$checkUrlRunnable@8155.run");
    }

    public RunnableC2198371B2d(C2198401B2g c2198401B2g) {
        super(c2198401B2g);
    }

    public final void LJIIIIZZ(boolean z) {
        try {
            C2198391B2f.LJFF.LIZIZ(AbstractC2198351B2b.LIZJ(z).toString(), LIZIZ(z), new C2198381B2e(this, System.currentTimeMillis(), z));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2198351B2b.LIZLLL(e.getMessage());
        }
    }
}
