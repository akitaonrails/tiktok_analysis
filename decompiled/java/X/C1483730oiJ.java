package X;

/* JADX INFO: renamed from: X.0oiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483730oiJ implements InterfaceC1483780oiO {
    public InterfaceC1483670oiD LIZ;
    public InterfaceC1483820oiS LIZIZ;

    @Override // X.InterfaceC1483780oiO
    public final void LIZ() {
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZIZ(C1482520ogM c1482520ogM) {
    }

    @Override // X.InterfaceC1483780oiO
    public final void LJFF(C1484040oio c1484040oio) {
    }

    @Override // X.InterfaceC1483780oiO
    public final void LJI() {
    }

    @Override // X.InterfaceC1483780oiO
    public final void resume() {
        this.LIZ.resume();
    }

    public C1483730oiJ(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LIZ = interfaceC1483670oiD;
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        this.LIZIZ = interfaceC1483820oiS;
    }

    @Override // X.InterfaceC1483780oiO
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        InterfaceC1483820oiS interfaceC1483820oiS2 = this.LIZIZ;
        if (interfaceC1483820oiS2 != null) {
            this.LIZ.LJIJJLI(interfaceC1483820oiS2.getSurface(), true);
        }
    }

    @Override // X.InterfaceC1483780oiO
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1483820oiS interfaceC1483820oiS = this.LIZIZ;
        if (interfaceC1483820oiS != null) {
            this.LIZ.setSurface(interfaceC1483820oiS.getSurface());
        }
        this.LIZ.LJJJJJL(C1479540obY.LIZ(interfaceC1479620obg, null));
    }
}
