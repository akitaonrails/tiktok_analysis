package X;

/* JADX INFO: renamed from: X.0css, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029000css<I> implements InterfaceC1028790csX<I> {
    public final InterfaceC1029080ct0<I> LIZ;

    public C1029000css(InterfaceC1029080ct0<I> interfaceC1029080ct0) {
        this.LIZ = interfaceC1029080ct0;
    }

    @Override // X.InterfaceC1028790csX
    public final C1029000css LIZ(final InterfaceC1029080ct0 interfaceC1029080ct0) {
        return new C1029000css(new InterfaceC1029080ct0() { // from class: X.0csz
            @Override // X.InterfaceC1029080ct0
            public final void LIZIZ(C1029060csy c1029060csy) {
                C1029000css c1029000css = this.LIZ;
                InterfaceC1029080ct0 interfaceC1029080ct02 = interfaceC1029080ct0;
                c1029000css.LIZ.LIZIZ(c1029060csy);
                interfaceC1029080ct02.LIZIZ(c1029060csy);
            }
        });
    }

    @Override // X.InterfaceC1029080ct0
    public final void LIZIZ(C1029060csy c1029060csy) {
        this.LIZ.LIZIZ(c1029060csy);
    }
}
