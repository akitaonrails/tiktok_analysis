package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19501511Rl extends C11RN implements Runnable {
    public final boolean LL;
    public final Executor LLILLJJLI;
    public volatile boolean LLILZ;
    public final AtomicInteger LLILZIL = new AtomicInteger();
    public final C11NJ LLILZLL = new C11NJ();
    public final C19501711Rn<Runnable> LLILLL = new C19501711Rn<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILZLL.dispose();
        if (this.LLILZIL.getAndIncrement() == 0) {
            this.LLILLL.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C19501711Rn<Runnable> c19501711Rn = this.LLILLL;
            int iAddAndGet = 1;
            while (!this.LLILZ) {
                do {
                    Runnable runnablePoll = c19501711Rn.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    } else if (this.LLILZ) {
                        c19501711Rn.clear();
                        return;
                    } else {
                        iAddAndGet = this.LLILZIL.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.LLILZ);
                c19501711Rn.clear();
                return;
            }
            c19501711Rn.clear();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        InterfaceC420801kM runnableC19501811Ro;
        if (this.LLILZ) {
            return C11JT.INSTANCE;
        }
        C1701890uOB.LIZ(runnable, "run is null");
        if (this.LL) {
            runnableC19501811Ro = new RunnableC19502711Rx(runnable, this.LLILZLL);
            this.LLILZLL.LIZ(runnableC19501811Ro);
        } else {
            runnableC19501811Ro = new RunnableC19501811Ro(runnable);
        }
        this.LLILLL.offer(runnableC19501811Ro);
        if (this.LLILZIL.getAndIncrement() == 0) {
            try {
                this.LLILLJJLI.execute(this);
                return runnableC19501811Ro;
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ = true;
                this.LLILLL.clear();
                C19489211Ms.LIZIZ(e);
                return C11JT.INSTANCE;
            }
        }
        return runnableC19501811Ro;
    }

    public RunnableC19501511Rl(Executor executor, boolean z) {
        this.LLILLJJLI = executor;
        this.LL = z;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(final Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return LIZIZ(runnable);
        }
        if (this.LLILZ) {
            return C11JT.INSTANCE;
        }
        C19484811La c19484811La = new C19484811La();
        final C19484811La c19484811La2 = new C19484811La(c19484811La);
        C1701890uOB.LIZ(runnable, "run is null");
        RunnableC19502511Rv runnableC19502511Rv = new RunnableC19502511Rv(new Runnable(c19484811La2, runnable) { // from class: X.11RP
            public final C19484811La LL;
            public final Runnable LLILLJJLI;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.replace(this.LLILLL.LIZIZ(this.LLILLJJLI));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = c19484811La2;
                this.LLILLJJLI = runnable;
            }
        }, this.LLILZLL);
        this.LLILZLL.LIZ(runnableC19502511Rv);
        Executor executor = this.LLILLJJLI;
        if (executor instanceof ScheduledExecutorService) {
            try {
                runnableC19502511Rv.setFuture(((ScheduledExecutorService) executor).schedule((Callable) runnableC19502511Rv, j, timeUnit));
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZ = true;
                C19489211Ms.LIZIZ(e);
                return C11JT.INSTANCE;
            }
        } else {
            final InterfaceC420801kM interfaceC420801kMLIZJ = C19501611Rm.LIZLLL.LIZJ(runnableC19502511Rv, j, timeUnit);
            runnableC19502511Rv.setFuture(new Future<Object>(interfaceC420801kMLIZJ) { // from class: X.0TG9
                public final InterfaceC420801kM LL;

                @Override // java.util.concurrent.Future
                public final Object get() {
                    return null;
                }

                @Override // java.util.concurrent.Future
                public final Object get(long j2, TimeUnit timeUnit2) {
                    return null;
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
                    return false;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
                    return false;
                }

                {
                    this.LL = interfaceC420801kMLIZJ;
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
                    this.LL.dispose();
                    return false;
                }
            });
        }
        c19484811La.replace(runnableC19502511Rv);
        return c19484811La2;
    }
}
