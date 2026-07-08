package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.133q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199492133q<V> extends AbstractC2380809Uo<V> implements InterfaceC2176108fn<V> {
    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C199496133u;
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public final V get() {
        return (V) super.get();
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // X.AbstractC199488133m, com.google.common.util.concurrent.ListenableFuture
    public final void LJIIJJI(Runnable runnable, Executor executor) {
        super.LJIIJJI(runnable, executor);
    }

    @Override // X.AbstractC199488133m, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }
}
