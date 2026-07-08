package X;

/* JADX INFO: renamed from: X.0ti6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675800ti6 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1675800ti6)) {
            return false;
        }
        C1675800ti6 c1675800ti6 = (C1675800ti6) obj;
        return this.LIZ == c1675800ti6.LIZ && this.LIZIZ == c1675800ti6.LIZIZ && this.LIZJ == c1675800ti6.LIZJ && Float.compare(this.LIZLLL, c1675800ti6.LIZLLL) == 0 && Float.compare(this.LJ, c1675800ti6.LJ) == 0 && Float.compare(this.LJFF, c1675800ti6.LJFF) == 0 && Float.compare(this.LJI, c1675800ti6.LJI) == 0 && Float.compare(this.LJII, c1675800ti6.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarSlot(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", travelFactor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", collapsedScale=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", collapsedAlpha=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", collapseStiffness=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", expandStiffness=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C1675800ti6(float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = f3;
        this.LJI = f4;
        this.LJII = f5;
    }
}
