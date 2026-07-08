package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJ8 implements Executor {
    public final Executor LLILLJJLI;
    public volatile Runnable LLILZ;
    public final ArrayDeque<C0VJ7> LL = new ArrayDeque<>();
    public final Object LLILLL = new Object();

    public final boolean LIZ() {
        boolean z;
        synchronized (this.LLILLL) {
            try {
                z = !this.LL.isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LIZIZ() {
        synchronized (this.LLILLL) {
            try {
                C0VJ7 c0vj7Poll = this.LL.poll();
                this.LLILZ = c0vj7Poll;
                if (c0vj7Poll != null) {
                    this.LLILLJJLI.execute(this.LLILZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VJ8(Executor executor) {
        this.LLILLJJLI = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.LLILLL) {
            try {
                this.LL.add((C0VJ7) new Runnable(this, runnable) { // from class: X.0VJ7
                    public final C0VJ8 LL;
                    public final Runnable LLILLJJLI;

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            try {
                                this.LLILLJJLI.run();
                                this.LL.LIZIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LL.LIZIZ();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (!C2179971ATj.LIZ(th2)) {
                                throw th2;
                            }
                        }
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = runnable;
                    }
                });
                if (this.LLILZ == null) {
                    LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
