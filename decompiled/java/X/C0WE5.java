package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WE5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WE5 {
    public static final C819770WDv LIZ = new C0WE2<Executor>() { // from class: X.0WDv
        @Override // X.InterfaceC819210WBr
        public final Object get() {
            return new Executor(C807400Vlq.LIZJ()) { // from class: X.07zR
                public final Executor LL;

                {
                    this.LL = executor;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    this.LL.execute(new Runnable(runnable) { // from class: X.07zQ
                        public final Runnable LL;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SafeLoggingExecutor$SafeLoggingRunnable@c83c.run");
                            try {
                                try {
                                    this.LL.run();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1894007bO.LIZ("Executor");
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SafeLoggingExecutor$SafeLoggingRunnable@c83c.run");
                        }

                        {
                            this.LL = runnable;
                        }
                    });
                }
            };
        }
    };
}
