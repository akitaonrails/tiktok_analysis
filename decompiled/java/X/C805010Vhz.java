package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0Vhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805010Vhz<R> implements ListenableFuture<R> {
    public final C09AE LL;
    public final C134N<R> LLILLJJLI;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void LJIIJJI(Runnable runnable, Executor executor) {
        this.LLILLJJLI.LJIIJJI(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.LLILLJJLI.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.LLILLJJLI.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.LLILLJJLI.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LLILLJJLI.isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LLILLJJLI.LL instanceof C134U;
    }

    public C805010Vhz(C1DFK c1dfk) {
        C134N<R> c134n = new C134N<>();
        this.LL = c1dfk;
        this.LLILLJJLI = c134n;
        c1dfk.LJII(new AwS592S0100000_13((C805010Vhz) this, (C805010Vhz<Object>) 66));
    }
}
