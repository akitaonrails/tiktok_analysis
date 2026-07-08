package X;

/* JADX INFO: renamed from: X.0tj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676450tj9 extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public float LLJJ;
    public boolean LLJJI;

    public C1676450tj9(float f, boolean z) {
        this.LLJJ = f;
        this.LLJJI = z;
    }

    public final long LLJJ(long j, boolean z) {
        int iRound;
        int iLJII = C1682380tsi.LJII(j);
        if (iLJII != Integer.MAX_VALUE && (iRound = Math.round(iLJII * this.LLJJ)) > 0) {
            if (!z || C1675450thX.LIZIZ(iRound, iLJII, j)) {
                return (((long) iRound) << 32) | (((long) iLJII) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long LLJJI(long j, boolean z) {
        int iRound;
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        if (iLJIIIIZZ != Integer.MAX_VALUE && (iRound = Math.round(iLJIIIIZZ / this.LLJJ)) > 0) {
            if (!z || C1675450thX.LIZIZ(iLJIIIIZZ, iRound, j)) {
                return (((long) iLJIIIIZZ) << 32) | (((long) iRound) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long LLJJIII(long j, boolean z) {
        int iLJIIIZ = C1682380tsi.LJIIIZ(j);
        int iRound = Math.round(iLJIIIZ * this.LLJJ);
        if (iRound > 0) {
            if (!z || C1675450thX.LIZIZ(iRound, iLJIIIZ, j)) {
                return (((long) iRound) << 32) | (((long) iLJIIIZ) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long LLJJIJI(long j, boolean z) {
        int iLJIIJ = C1682380tsi.LJIIJ(j);
        int iRound = Math.round(iLJIIJ / this.LLJJ);
        if (iRound > 0) {
            if (!z || C1675450thX.LIZIZ(iLJIIJ, iRound, j)) {
                return (((long) iLJIIJ) << 32) | (((long) iRound) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.LLJJ);
        }
        return interfaceC1676340tiy.LJJIJ(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.LLJJ);
        }
        return interfaceC1676340tiy.LJJIIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    @Override // X.InterfaceC20052813d8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1690350u5Z LJIILL(X.InterfaceC1689940u4u r8, X.InterfaceC1673370teB r9, long r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676450tj9.LJIILL(X.0u4u, X.0teB, long):X.0u5Z");
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.LLJJ);
        }
        return interfaceC1676340tiy.LJJII(i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.LLJJ);
        }
        return interfaceC1676340tiy.LJJIL(i);
    }
}
