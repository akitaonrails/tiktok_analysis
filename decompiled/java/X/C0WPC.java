package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: X.0WPC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WPC extends AbstractExecutorService implements InterfaceExecutorServiceC702790RhV {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C134F(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> ListenableFuture<T> submit(Callable<T> callable) {
        return (ListenableFuture) super.submit((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C134F(Executors.callable(runnable, t));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return super.submit(runnable, obj);
    }
}
