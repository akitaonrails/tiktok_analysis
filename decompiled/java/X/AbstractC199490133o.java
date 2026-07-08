package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.133o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199490133o<V> extends AbstractC199488133m<V> implements InterfaceC2176108fn<V> {
    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof C199496133u;
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public V get() {
        return (V) super.get();
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public boolean isDone() {
        return super.isDone();
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // X.AbstractC199488133m, com.google.common.util.concurrent.ListenableFuture
    public void LJIIJJI(Runnable runnable, Executor executor) {
        super.LJIIJJI(runnable, executor);
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }
}
