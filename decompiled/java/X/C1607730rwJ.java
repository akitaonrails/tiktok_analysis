package X;

/* JADX INFO: renamed from: X.0rwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607730rwJ {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1607730rwJ)) {
            return false;
        }
        C1607730rwJ c1607730rwJ = (C1607730rwJ) obj;
        return this.LIZ == c1607730rwJ.LIZ && this.LIZIZ == c1607730rwJ.LIZIZ && this.LIZJ == c1607730rwJ.LIZJ && this.LIZLLL == c1607730rwJ.LIZLLL && this.LJ == c1607730rwJ.LJ && this.LJFF == c1607730rwJ.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitAnchor(startX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", withAlpha=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", centerOrigin=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1607730rwJ(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = z;
        this.LJFF = z2;
    }
}
