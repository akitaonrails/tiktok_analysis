package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: X.0p5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1498010p5L implements Executor {
    public final /* synthetic */ Executor LL;
    public final /* synthetic */ AbstractC1497970p5H LLILLJJLI;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.LL.execute(runnable);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C1497900p5A c1497900p5A = ((C1498000p5K) this.LLILLJJLI).LJIIJJI;
            c1497900p5A.getClass();
            c1497900p5A.LJJ(new C1497800p50("Exception received from UploadDataProvider", e));
        }
    }

    public ExecutorC1498010p5L(AbstractC1497970p5H abstractC1497970p5H, Executor executor) {
        this.LLILLJJLI = abstractC1497970p5H;
        this.LL = executor;
    }
}
