package X;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19502611Rw extends AtomicReference<Future<?>> implements InterfaceC420801kM {
    public static final FutureTask<Void> LLILLL;
    public static final FutureTask<Void> LLILZ;
    public static final long serialVersionUID = 1811839108042568751L;
    public final Runnable LL;
    public Thread LLILLJJLI;

    static {
        C11LT c11lt = C19487811Me.LIZIZ;
        LLILLL = new FutureTask<>(c11lt, null);
        LLILZ = new FutureTask<>(c11lt, null);
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == LLILLL || future == (futureTask = LLILZ) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.LLILLJJLI != C786410Ut5.u3());
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == LLILLL || future == LLILZ;
    }

    public Runnable getWrappedRunnable() {
        return this.LL;
    }

    public AbstractC19502611Rw(Runnable runnable) {
        this.LL = runnable;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = get();
            if (future2 != LLILLL) {
                if (future2 == LLILZ) {
                    if (this.LLILLJJLI != C786410Ut5.u3()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
