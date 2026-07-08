package X;

/* JADX INFO: renamed from: X.0tmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678610tmd implements InterfaceC1678640tmg {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        return (((((C1685910tyP.LJIIJ(this.LIZ) * 31) + C1685910tyP.LJIIJ(this.LIZIZ)) * 31) + C1685910tyP.LJIIJ(this.LIZJ)) * 31) + C1685910tyP.LJIIJ(this.LIZLLL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1678610tmd.class != obj.getClass()) {
            return false;
        }
        C1678610tmd c1678610tmd = (C1678610tmd) obj;
        if (C1685910tyP.LJ(this.LIZ, c1678610tmd.LIZ) && C1685910tyP.LJ(this.LIZIZ, c1678610tmd.LIZIZ) && C1685910tyP.LJ(this.LIZJ, c1678610tmd.LIZJ) && C1685910tyP.LJ(this.LIZLLL, c1678610tmd.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1678640tmg
    public final C05P0 LIZ(boolean z, InterfaceC1680500tpg interfaceC1680500tpg) {
        long j;
        interfaceC1680500tpg.LJJIJIIJIL(-2133647540);
        if (z) {
            j = this.LIZIZ;
        } else {
            j = this.LIZLLL;
        }
        C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(new C1685910tyP(j), interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        return c05p0LJIIIIZZ;
    }

    @Override // X.InterfaceC1678640tmg
    public final C05P0 LIZIZ(boolean z, InterfaceC1680500tpg interfaceC1680500tpg) {
        long j;
        interfaceC1680500tpg.LJJIJIIJIL(-655254499);
        if (z) {
            j = this.LIZ;
        } else {
            j = this.LIZJ;
        }
        C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(new C1685910tyP(j), interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        return c05p0LJIIIIZZ;
    }

    public C1678610tmd(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}
