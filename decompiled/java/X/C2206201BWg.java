package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1BWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206201BWg {
    public ExecutorService LIZ;

    public final void LIZ(Runnable runnable) {
        ExecutorService executorService = this.LIZ;
        if (executorService != null && executorService.isShutdown()) {
            this.LIZ = null;
        }
        ExecutorService executorServiceLIZ = this.LIZ;
        if (executorServiceLIZ == null) {
            synchronized (this) {
                try {
                    executorServiceLIZ = this.LIZ;
                    if (executorServiceLIZ == null) {
                        executorServiceLIZ = C2206191BWf.LIZ.LIZ("preload-dispatch-executor");
                        this.LIZ = executorServiceLIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (executorServiceLIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        executorServiceLIZ.execute(runnable);
    }
}
