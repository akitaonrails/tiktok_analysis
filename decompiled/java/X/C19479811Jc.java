package X;

/* JADX INFO: renamed from: X.11Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19479811Jc<T, R> extends C11NZ<R> {
    public final C11ID<T> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
        C19479711Jb c19479711Jb = new C19479711Jb(interfaceC626120Oh8, this.LLILLJJLI);
        interfaceC626120Oh8.onSubscribe(c19479711Jb);
        this.LL.LIZ(c19479711Jb);
    }

    public C19479811Jc(C11ID<T> c11id, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) {
        this.LL = c11id;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
