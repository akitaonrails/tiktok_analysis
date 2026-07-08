package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WTL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTL<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    public final FutureTask<V> LL;

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.LL.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LL.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LL.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ScheduledFutureImpl@3621.run");
        this.LL.run();
        C1C7U.LIZIZ("ScheduledFutureImpl@3621.run");
    }

    public C0WTL(Callable callable) {
        this.LL = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.LL.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public C0WTL(Runnable runnable, Object obj) {
        this.LL = new FutureTask<>(runnable, obj);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.LL.get(j, timeUnit);
    }
}
