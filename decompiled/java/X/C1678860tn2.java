package X;

/* JADX INFO: renamed from: X.0tn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678860tn2 extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public C115T LLJJ;
    public float LLJJI;
    public float LLJJIII;

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

    public C1678860tn2(C115T c115t, float f, float f2) {
        this.LLJJ = c115t;
        this.LLJJI = f;
        this.LLJJIII = f2;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        long jLIZ;
        int i;
        int iLJIIIIZZ;
        int iLJLLJ;
        int iLJLLJ2;
        int iMax;
        int iMax2;
        C115T c115t = this.LLJJ;
        float f = this.LLJJI;
        float f2 = this.LLJJIII;
        boolean z = c115t instanceof C115S;
        if (z) {
            jLIZ = C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), 0, C1682380tsi.LJII(j));
        } else {
            jLIZ = C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j));
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(jLIZ);
        int iLJJIJL = abstractC1686530tzPLJJJJZ.LJJIJL(c115t);
        if (iLJJIJL == Integer.MIN_VALUE) {
            iLJJIJL = 0;
        }
        if (z) {
            i = abstractC1686530tzPLJJJJZ.LLILLJJLI;
            iLJIIIIZZ = C1682380tsi.LJII(j);
        } else {
            i = abstractC1686530tzPLJJJJZ.LL;
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        if (!Float.isNaN(f)) {
            iLJLLJ = interfaceC1689940u4u.LJLLJ(f);
        } else {
            iLJLLJ = 0;
        }
        int i2 = iLJIIIIZZ - i;
        int iLJ = C13LZ.LJ(iLJLLJ - iLJJIJL, 0, i2);
        if (!Float.isNaN(f2)) {
            iLJLLJ2 = interfaceC1689940u4u.LJLLJ(f2);
        } else {
            iLJLLJ2 = 0;
        }
        int iLJ2 = C13LZ.LJ((iLJLLJ2 - i) + iLJJIJL, 0, i2 - iLJ);
        if (z) {
            iMax = abstractC1686530tzPLJJJJZ.LL;
        } else {
            iMax = Math.max(abstractC1686530tzPLJJJJZ.LL + iLJ + iLJ2, C1682380tsi.LJIIJ(j));
        }
        if (z) {
            iMax2 = Math.max(abstractC1686530tzPLJJJJZ.LLILLJJLI + iLJ + iLJ2, C1682380tsi.LJIIIZ(j));
        } else {
            iMax2 = abstractC1686530tzPLJJJJZ.LLILLJJLI;
        }
        return interfaceC1689940u4u.LJLJJL(iMax, iMax2, C2097608Jq.LJ(), new C1678870tn3(c115t, f, iLJ, iMax, iLJ2, abstractC1686530tzPLJJJJZ, iMax2));
    }
}
