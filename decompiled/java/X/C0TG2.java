package X;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TG2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TG2 extends C11RN {
    public final AbstractRunnableC2239851Clb LL;
    public final PriorityBlockingQueue<C0TAR> LLILLJJLI;
    public final C11NJ LLILLL = new C11NJ();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.LLILLJJLI;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        return LIZJ(runnable, 0L, TimeUnit.MILLISECONDS);
    }

    public C0TG2(AbstractRunnableC2239851Clb abstractRunnableC2239851Clb, PriorityBlockingQueue<C0TAR> priorityBlockingQueue) {
        this.LL = abstractRunnableC2239851Clb;
        this.LLILLJJLI = priorityBlockingQueue;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        final C0TAR c0tar = new C0TAR(this.LL, runnable);
        final RunnableC19502511Rv runnableC19502511Rv = new RunnableC19502511Rv(c0tar, this.LLILLL);
        runnableC19502511Rv.setFuture(new Future<Object>() { // from class: X.0TG3
            @Override // java.util.concurrent.Future
            public final Object get() {
                return null;
            }

            @Override // java.util.concurrent.Future
            public final Object get(long j2, TimeUnit timeUnit2) {
                return null;
            }

            @Override // java.util.concurrent.Future
            public final boolean isDone() {
                return false;
            }

            @Override // java.util.concurrent.Future
            public final boolean isCancelled() {
                runnableC19502511Rv.isDisposed();
                return false;
            }

            @Override // java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                return this.LL.LLILLJJLI.remove(c0tar);
            }
        });
        this.LLILLL.LIZ(runnableC19502511Rv);
        while (this.LLILLJJLI.contains(c0tar)) {
            this.LLILLJJLI.remove(c0tar);
        }
        this.LLILLJJLI.offer(c0tar, j, timeUnit);
        return runnableC19502511Rv;
    }
}
