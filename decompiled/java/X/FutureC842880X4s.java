package X;

import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0X4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class FutureC842880X4s implements Future<Integer> {
    public volatile boolean LL;
    public volatile boolean LLILLJJLI;
    public final Semaphore LLILLL = new Semaphore(0);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Integer get() {
        if (!this.LL && this.LLILLJJLI) {
            this.LLILLL.acquireUninterruptibly();
        }
        return Integer.valueOf(this.LL ? 0 : -1);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LL || !this.LLILLJJLI;
    }

    @Override // java.util.concurrent.Future
    public final Integer get(long j, TimeUnit timeUnit) throws InterruptedException {
        int i;
        if (!this.LL && this.LLILLJJLI) {
            this.LLILLL.tryAcquire(j, timeUnit);
        }
        if (this.LL) {
            i = 0;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
