package X;

/* JADX INFO: renamed from: X.0u76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691300u76 extends AbstractC1691420u7I {
    public InterfaceC1685780tyC<?> LIZ;

    public C1691300u76(InterfaceC1685780tyC<?> interfaceC1685780tyC) {
        this.LIZ = interfaceC1685780tyC;
    }

    @Override // X.AbstractC1691420u7I
    public final boolean LIZ(AbstractC1691330u79<?> abstractC1691330u79) {
        if (abstractC1691330u79 == this.LIZ.getKey()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1691420u7I
    public final Object LIZIZ(C1691310u77 c1691310u77) {
        if (c1691310u77 != this.LIZ.getKey()) {
            C1696250uF5.LIZIZ("Check failed.");
        }
        return this.LIZ.LJIIIIZZ();
    }
}
