package X;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TG1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TG1 extends C11RN {
    public final C0T0O LL;
    public final PriorityBlockingQueue<RunnableC740170T1r> LLILLJJLI;
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

    public C0TG1(C0T0O c0t0o, PriorityBlockingQueue<RunnableC740170T1r> priorityBlockingQueue) {
        this.LL = c0t0o;
        this.LLILLJJLI = priorityBlockingQueue;
    }

    @Override // X.C11RN
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        final RunnableC740170T1r runnableC740170T1r = new RunnableC740170T1r(this.LL, runnable);
        RunnableC19502511Rv runnableC19502511Rv = new RunnableC19502511Rv(runnableC740170T1r, this.LLILLL);
        runnableC19502511Rv.setFuture(new Future<Object>() { // from class: X.0TG4
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

            @Override // java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                return this.LL.LLILLJJLI.remove(runnableC740170T1r);
            }
        });
        this.LLILLL.LIZ(runnableC19502511Rv);
        while (this.LLILLJJLI.contains(runnableC740170T1r)) {
            this.LLILLJJLI.remove(runnableC740170T1r);
        }
        this.LLILLJJLI.offer(runnableC740170T1r, j, timeUnit);
        return runnableC19502511Rv;
    }
}
