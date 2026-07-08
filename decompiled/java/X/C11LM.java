package X;

/* JADX INFO: renamed from: X.11LM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LM<T> extends AbstractC19484711Kz<T> implements InterfaceC1360530lVb<T> {
    public final C11NN<T> LL;
    public final T LLILLJJLI = null;

    @Override // X.InterfaceC1360530lVb
    public final C11NN<T> LIZIZ() {
        return new C11M5(this.LL, this.LLILLJJLI, true);
    }

    public C11LM(C11M6 c11m6) {
        this.LL = c11m6;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
        this.LL.LJIILL(new C11LN(interfaceC19474811He, this.LLILLJJLI));
    }
}
