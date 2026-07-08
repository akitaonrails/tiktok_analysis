package X;

/* JADX INFO: renamed from: X.11QI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QI<T> extends AbstractC19486711Lt {
    public final InterfaceC19473011Gm<T> LL;

    public C11QI(AbstractC19484711Kz abstractC19484711Kz) {
        this.LL = abstractC19484711Kz;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(final C11IY c11iy) {
        this.LL.LIZ((InterfaceC19474811He<? super T>) new InterfaceC19474811He<T>(c11iy) { // from class: X.11QH
            public final C11IY LL;

            {
                this.LL = c11iy;
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                this.LL.onError(th);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.onSubscribe(interfaceC420801kM);
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(T t) {
                this.LL.onComplete();
            }
        });
    }
}
