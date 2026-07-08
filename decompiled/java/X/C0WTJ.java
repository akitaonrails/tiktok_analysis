package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTJ extends C822650WOx {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Comparable comparable;
        if (callable instanceof Comparable) {
            comparable = (Comparable) callable;
        } else {
            comparable = null;
        }
        return new C0WTK(callable, comparable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Comparable comparable;
        if (runnable instanceof Comparable) {
            comparable = (Comparable) runnable;
        } else {
            comparable = null;
        }
        return new C0WTK(runnable, t, comparable);
    }

    public C0WTJ(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(i, i2, 8000L, timeUnit, blockingQueue);
    }
}
