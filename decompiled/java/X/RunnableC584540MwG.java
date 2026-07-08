package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC584540MwG implements Runnable {
    public final Runnable LL;

    @Override // java.lang.Runnable
    public final void run() {
        Object c098200Yq;
        C1C7U.LIZ("CatchingRunnable@18b2.run");
        try {
            try {
                this.LL.run();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } finally {
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null && C2200821BBo.LIZIZ) {
                throw thM5exceptionOrNullimpl;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("CatchingRunnable@18b2.run");
    }

    public RunnableC584540MwG(Runnable runnable) {
        this.LL = runnable;
    }
}
