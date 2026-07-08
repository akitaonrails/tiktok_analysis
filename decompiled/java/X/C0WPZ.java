package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WPZ extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler LL;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C0WPZ(BPEAHandler bPEAHandler) {
        this.LL = bPEAHandler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new C0WTL(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        C0WTL c0wtl = new C0WTL(runnable, null);
        execute(c0wtl);
        return c0wtl;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        C0WTL c0wtl = new C0WTL(callable);
        execute(c0wtl);
        return c0wtl;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C0WTL(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        C0WTL c0wtl = new C0WTL(runnable, obj);
        execute(c0wtl);
        return c0wtl;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C0WTL c0wtl = new C0WTL(runnable, null);
        C786410Ut5.LJLIIL(timeUnit.toMillis(j), this.LL, c0wtl);
        return c0wtl;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C0WTL c0wtl = new C0WTL(callable);
        C786410Ut5.LJLIIL(timeUnit.toMillis(j), this.LL, c0wtl);
        return c0wtl;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
