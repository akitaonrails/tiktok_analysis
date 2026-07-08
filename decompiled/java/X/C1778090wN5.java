package X;

/* JADX INFO: renamed from: X.0wN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778090wN5 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778090wN5)) {
            return false;
        }
        C1778090wN5 c1778090wN5 = (C1778090wN5) obj;
        return Float.compare(this.LIZ, c1778090wN5.LIZ) == 0 && Float.compare(this.LIZIZ, c1778090wN5.LIZIZ) == 0 && Float.compare(this.LIZJ, c1778090wN5.LIZJ) == 0 && Float.compare(this.LIZLLL, c1778090wN5.LIZLLL) == 0 && Float.compare(this.LJ, c1778090wN5.LJ) == 0 && Float.compare(this.LJFF, c1778090wN5.LJFF) == 0 && this.LJI == c1778090wN5.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(bias=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", winHeightDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loseHeightDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loseIconWDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", loseIconHDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enlarge=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public C1778090wN5(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
        this.LJI = z;
    }
}
