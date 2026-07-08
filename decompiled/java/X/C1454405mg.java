package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.05mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1454405mg {
    public final ExecutorService LIZ;

    public C1454405mg(ExecutorService executorService) {
        this.LIZ = executorService;
    }

    public final void LIZ(final Runnable runnable) {
        ExecutorService executorService = this.LIZ;
        if (executorService != null) {
            executorService.execute(new Runnable(runnable) { // from class: X.05mf
                public static final Object LLILLJJLI = new Object();
                public final Runnable LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReporterRunnable@2e79.run");
                    try {
                        if (((Boolean) C1474810oTv.L3.getValue()).booleanValue()) {
                            Runnable runnable2 = this.LL;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        } else {
                            synchronized (LLILLJJLI) {
                                try {
                                    Runnable runnable3 = this.LL;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReporterRunnable@2e79.run");
                }

                {
                    this.LL = runnable;
                }
            });
        }
    }
}
