package X;

/* JADX INFO: renamed from: X.11IW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IW<T> extends AbstractC19486711Lt implements InterfaceC478520Ipe<T> {
    public final C098D<T> LL;

    @Override // X.InterfaceC478520Ipe
    public final C11NZ<T> LIZJ() {
        final C098D<T> c098d = this.LL;
        return new C11J7<T, T>(c098d) { // from class: X.11Hs
            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(new C19476111Hr(interfaceC626120Oh8));
            }
        };
    }

    public C11IW(C11NZ c11nz) {
        this.LL = c11nz;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) {
        this.LL.LIZIZ(new C11IX(c11iy));
    }
}
