package X;

/* JADX INFO: renamed from: X.11MV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MV<T> extends AbstractC19486711Lt implements InterfaceC478520Ipe<T> {
    public final C098D<T> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;
    public final boolean LLILLL = false;

    @Override // X.InterfaceC478520Ipe
    public final C11NZ<T> LIZJ() {
        final C098D<T> c098d = this.LL;
        final InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2 = this.LLILLJJLI;
        final boolean z = this.LLILLL;
        return new C11J7<T, T>(c098d, interfaceC1487280oo2, z) { // from class: X.11MW
            public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;
            public final boolean LLILLL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C11MX(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL));
            }

            {
                this.LLILLJJLI = interfaceC1487280oo2;
                this.LLILLL = z;
            }
        };
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) {
        this.LL.LIZIZ(new C11MY(c11iy, this.LLILLJJLI, this.LLILLL));
    }

    public C11MV(C098D c098d, InterfaceC1487280oo2 interfaceC1487280oo2) {
        this.LL = c098d;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
