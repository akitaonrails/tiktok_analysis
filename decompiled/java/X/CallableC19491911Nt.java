package X;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class CallableC19491911Nt<T, U> implements Callable<U>, InterfaceC1487280oo2<T, U> {
    public final U LL;

    @Override // java.util.concurrent.Callable
    public final U call() {
        return this.LL;
    }

    public CallableC19491911Nt(U u) {
        this.LL = u;
    }

    @Override // X.InterfaceC1487280oo2
    public final U apply(T t) {
        return this.LL;
    }
}
