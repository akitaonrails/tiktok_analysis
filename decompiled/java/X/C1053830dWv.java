package X;

/* JADX INFO: renamed from: X.0dWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053830dWv<I> implements InterfaceC1022880cj0 {
    public final InterfaceC1022880cj0<I> LIZ;

    public C1053830dWv(InterfaceC1022880cj0<I> interfaceC1022880cj0) {
        this.LIZ = interfaceC1022880cj0;
    }

    @Override // X.InterfaceC1022880cj0
    public final boolean LIZ(C1074600e4Q c1074600e4Q) {
        return this.LIZ.LIZ(c1074600e4Q);
    }

    public final C1053830dWv LIZIZ(final C1053840dWw c1053840dWw) {
        return new C1053830dWv(new InterfaceC1022880cj0() { // from class: X.0dWy
            @Override // X.InterfaceC1022880cj0
            public final boolean LIZ(C1074600e4Q c1074600e4Q) {
                if (this.LIZ.LIZ.LIZ(c1074600e4Q)) {
                    return true;
                }
                return c1053840dWw.LIZ(c1074600e4Q);
            }
        });
    }
}
