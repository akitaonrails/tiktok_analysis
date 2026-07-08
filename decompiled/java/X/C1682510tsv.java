package X;

import kotlin.jvm.internal.AwS33S0102000_25;

/* JADX INFO: renamed from: X.0tsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682510tsv extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public InterfaceC1679150tnV LLJJ;

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    public C1682510tsv(InterfaceC1679150tnV interfaceC1679150tnV) {
        this.LLJJ = interfaceC1679150tnV;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float fLIZ = this.LLJJ.LIZ(interfaceC1689940u4u.getLayoutDirection());
        float fLIZLLL = this.LLJJ.LIZLLL();
        float fLIZJ = this.LLJJ.LIZJ(interfaceC1689940u4u.getLayoutDirection());
        float fLIZIZ = this.LLJJ.LIZIZ();
        boolean z4 = false;
        float f = 0;
        if (Float.compare(fLIZ, f) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (Float.compare(fLIZLLL, f) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (Float.compare(fLIZJ, f) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (Float.compare(fLIZIZ, f) >= 0) {
            z4 = true;
        }
        if (!(z4 & z6)) {
            C1679560toA.LIZ("Padding must be non-negative");
        }
        int iLJLLJ = interfaceC1689940u4u.LJLLJ(fLIZ);
        int iLJLLJ2 = interfaceC1689940u4u.LJLLJ(fLIZJ) + iLJLLJ;
        int iLJLLJ3 = interfaceC1689940u4u.LJLLJ(fLIZLLL);
        int iLJLLJ4 = interfaceC1689940u4u.LJLLJ(fLIZIZ) + iLJLLJ3;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LJIIIIZZ(-iLJLLJ2, -iLJLLJ4, j));
        return interfaceC1689940u4u.LJLJJL(C1682390tsj.LJI(abstractC1686530tzPLJJJJZ.LL + iLJLLJ2, j), C1682390tsj.LJFF(abstractC1686530tzPLJJJJZ.LLILLJJLI + iLJLLJ4, j), C2097608Jq.LJ(), new AwS33S0102000_25(iLJLLJ, iLJLLJ3, abstractC1686530tzPLJJJJZ, 3));
    }
}
