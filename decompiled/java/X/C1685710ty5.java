package X;

/* JADX INFO: renamed from: X.0ty5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685710ty5 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final int hashCode() {
        return (((((((C1685910tyP.LJIIJ(this.LIZ) * 31) + C1685910tyP.LJIIJ(this.LIZIZ)) * 31) + C1685910tyP.LJIIJ(this.LIZJ)) * 31) + C1685910tyP.LJIIJ(this.LIZLLL)) * 31) + C1685910tyP.LJIIJ(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContextMenuColors(backgroundColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(", textColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(", iconColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZJ));
        sbLIZ.append(", disabledTextColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZLLL));
        sbLIZ.append(", disabledIconColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1685710ty5)) {
            return false;
        }
        C1685710ty5 c1685710ty5 = (C1685710ty5) obj;
        if (C1685910tyP.LJ(this.LIZ, c1685710ty5.LIZ) && C1685910tyP.LJ(this.LIZIZ, c1685710ty5.LIZIZ) && C1685910tyP.LJ(this.LIZJ, c1685710ty5.LIZJ) && C1685910tyP.LJ(this.LIZLLL, c1685710ty5.LIZLLL) && C1685910tyP.LJ(this.LJ, c1685710ty5.LJ)) {
            return true;
        }
        return false;
    }

    public C1685710ty5(long j, long j2, long j3, long j4, long j5) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
    }
}
