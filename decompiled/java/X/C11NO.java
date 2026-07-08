package X;

/* JADX INFO: renamed from: X.11NO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NO<T> extends C11NN<T> implements InterfaceCallableC1559550qgb<T> {
    public final T LLILLJJLI;

    @Override // X.InterfaceCallableC1559550qgb, java.util.concurrent.Callable
    public final T call() {
        return this.LLILLJJLI;
    }

    public C11NO(T t) {
        this.LLILLJJLI = t;
    }

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) {
        c11m9.onSubscribe(new C11NR(c11m9, this.LLILLJJLI));
    }
}
