package X;

/* JADX INFO: renamed from: X.1BCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201191BCz extends AbstractC2201091BCp<C1514210pVT> {
    public static final C2201191BCz LJFF = new C2201191BCz();
    public static final C1BD0 LJI = new C1BD0();

    @Override // X.AbstractC2201091BCp
    public final void LJIIL() {
        C1BD0 c1bd0 = LJI;
        c1bd0.LIZ();
        c1bd0.LIZJ = new C1BD9() { // from class: X.1BD5
            @Override // X.C1BD9
            public final void LIZ(C1514210pVT c1514210pVT) {
                C2201191BCz.LJFF.LJJ(c1514210pVT);
            }
        };
    }

    @Override // X.AbstractC2201091BCp
    public final C1514210pVT LJIILIIL() {
        return new C1514210pVT();
    }

    @Override // X.AbstractC2201091BCp
    public final C1514210pVT LJIILJJIL() {
        return LJI.LIZ;
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIJ() {
        LJI.LIZIZ();
    }

    @Override // X.AbstractC2201091BCp
    public final void LJIJI() {
        LJI.LIZJ();
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return C1BC9.Idle;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1514210pVT c1514210pVT, C1514210pVT c1514210pVT2) {
        if (c1514210pVT.LIZ != c1514210pVT2.LIZ) {
            return true;
        }
        return false;
    }
}
