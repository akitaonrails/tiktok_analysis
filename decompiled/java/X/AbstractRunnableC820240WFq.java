package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC820240WFq implements Runnable {
    public final long LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final /* synthetic */ C820210WFn LLILZ;

    public abstract void LIZ();

    public void LIZIZ() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzdn$zzb@6e0b.run");
        try {
            if (this.LLILZ.LJFF) {
                LIZIZ();
            } else {
                try {
                    LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILZ.LIZJ(e, false, this.LLILLL);
                    LIZIZ();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzdn$zzb@6e0b.run");
    }

    public AbstractRunnableC820240WFq(C820210WFn c820210WFn, boolean z) {
        this.LLILZ = c820210WFn;
        c820210WFn.LIZIZ.getClass();
        this.LL = System.currentTimeMillis();
        c820210WFn.LIZIZ.getClass();
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        this.LLILLL = z;
    }
}
