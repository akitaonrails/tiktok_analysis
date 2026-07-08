package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class CallableC19502411Ru implements Callable<Void>, InterfaceC420801kM {
    public static final FutureTask<Void> LLILZLL = new FutureTask<>(C19487811Me.LIZIZ, null);
    public final Runnable LL;
    public final ExecutorService LLILZ;
    public Thread LLILZIL;
    public final AtomicReference<Future<?>> LLILLL = new AtomicReference<>();
    public final AtomicReference<Future<?>> LLILLJJLI = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.LLILLL;
        FutureTask<Void> futureTask = LLILZLL;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.LLILZIL != C786410Ut5.u3());
        }
        Future<?> andSet2 = this.LLILLJJLI.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.LLILZIL != C786410Ut5.u3());
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.get() == LLILZLL;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.LLILZIL = C786410Ut5.u3();
        try {
            this.LL.run();
            Future<?> futureSubmit = this.LLILZ.submit(this);
            loop0: while (true) {
                Future<?> future = this.LLILLJJLI.get();
                if (future != LLILZLL) {
                    AtomicReference<Future<?>> atomicReference = this.LLILLJJLI;
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.LLILZIL != C786410Ut5.u3());
            }
            this.LLILZIL = null;
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL = null;
            C19489211Ms.LIZIZ(th);
            return null;
        }
    }

    public final void LIZ(Future<?> future) {
        while (true) {
            Future<?> future2 = this.LLILLL.get();
            boolean z = false;
            if (future2 == LLILZLL) {
                if (this.LLILZIL != C786410Ut5.u3()) {
                    z = true;
                }
                future.cancel(z);
                return;
            } else {
                AtomicReference<Future<?>> atomicReference = this.LLILLL;
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    public CallableC19502411Ru(Runnable runnable, ExecutorService executorService) {
        this.LL = runnable;
        this.LLILZ = executorService;
    }
}
