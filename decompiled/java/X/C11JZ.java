package X;

/* JADX INFO: renamed from: X.11JZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JZ<T, R> extends C11NZ<R> {
    public final InterfaceC19473011Gm<T> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
        C19479611Ja c19479611Ja = new C19479611Ja(interfaceC626120Oh8, this.LLILLJJLI);
        interfaceC626120Oh8.onSubscribe(c19479611Ja);
        this.LL.LIZ(c19479611Ja);
    }

    public C11JZ(InterfaceC19473011Gm<T> interfaceC19473011Gm, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
