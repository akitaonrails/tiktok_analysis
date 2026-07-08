package X;

/* JADX INFO: renamed from: X.11K9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K9<T> extends C11NZ<T> implements InterfaceCallableC1559550qgb<T> {
    public final T LL;

    @Override // X.InterfaceCallableC1559550qgb, java.util.concurrent.Callable
    public final T call() {
        return this.LL;
    }

    public C11K9(T t) {
        this.LL = t;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C11K8 c11k8 = new C11K8(interfaceC626120Oh8, this.LL);
        interfaceC626120Oh8.onSubscribe(c11k8);
        c11k8.run();
    }
}
