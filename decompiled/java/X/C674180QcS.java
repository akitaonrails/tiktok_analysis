package X;

/* JADX INFO: renamed from: X.0QcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674180QcS {
    public final int LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674180QcS)) {
            return false;
        }
        C674180QcS c674180QcS = (C674180QcS) obj;
        return this.LIZ == c674180QcS.LIZ && Float.compare(this.LIZIZ, c674180QcS.LIZIZ) == 0 && Float.compare(this.LIZJ, c674180QcS.LIZJ) == 0 && Float.compare(this.LIZLLL, c674180QcS.LIZLLL) == 0 && this.LJ == c674180QcS.LJ && this.LJFF == c674180QcS.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarLayoutSnapshot(backgroundHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clearIvTranslationX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", splitViewTranslationX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", photoSearchTranslationX=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchTvEndMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", searchTvBottomMargin=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public C674180QcS(float f, float f2, float f3, int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
