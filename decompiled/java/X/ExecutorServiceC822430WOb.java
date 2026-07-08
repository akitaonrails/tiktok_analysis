package X;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ExecutorServiceC822430WOb implements ExecutorService {
    public final ExecutorService LL;
    public final Queue<Runnable> LLILLJJLI = new LinkedList();
    public final AtomicInteger LLILLL;

    public final synchronized void LIZ() {
        if (this.LLILLJJLI.isEmpty() || this.LLILLL.get() == 0) {
            return;
        }
        Runnable runnable = (Runnable) ((LinkedList) this.LLILLJJLI).poll();
        if (runnable != null) {
            LIZIZ(runnable);
            LIZ();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.LL.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.LL.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.LL.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.LL.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.LL.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.LL.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.LL.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.LL.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.LL.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.LL.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.LL.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.LL.submit(callable);
    }

    public final synchronized void LIZIZ(final Runnable runnable) {
        this.LLILLL.decrementAndGet();
        this.LL.execute(new Runnable() { // from class: X.0WOc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FixExecutorWrapper@c421.runTask$1");
                try {
                    runnable.run();
                    this.LLILLL.incrementAndGet();
                    this.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FixExecutorWrapper@c421.runTask$1");
            }
        });
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.LLILLL.get() > 0) {
            LIZIZ(runnable);
        } else {
            ((LinkedList) this.LLILLJJLI).add(runnable);
            LIZ();
        }
    }

    public ExecutorServiceC822430WOb(ExecutorService executorService, int i) {
        this.LL = executorService;
        if (i > 0) {
            this.LLILLL = new AtomicInteger(i);
        } else {
            "thread size must be bigger than 0".toString();
            throw new IllegalArgumentException("thread size must be bigger than 0");
        }
    }
}
