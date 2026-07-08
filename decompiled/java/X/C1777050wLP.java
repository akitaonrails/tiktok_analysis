package X;

/* JADX INFO: renamed from: X.0wLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777050wLP {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL = 20.0f;
    public final float LJ;
    public final float LJFF;
    public final int LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777050wLP)) {
            return false;
        }
        C1777050wLP c1777050wLP = (C1777050wLP) obj;
        return Float.compare(this.LIZ, c1777050wLP.LIZ) == 0 && Float.compare(this.LIZIZ, c1777050wLP.LIZIZ) == 0 && Float.compare(this.LIZJ, c1777050wLP.LIZJ) == 0 && Float.compare(this.LIZLLL, c1777050wLP.LIZLLL) == 0 && Float.compare(this.LJ, c1777050wLP.LJ) == 0 && Float.compare(this.LJFF, c1777050wLP.LJFF) == 0 && this.LJI == c1777050wLP.LJI && this.LJII == c1777050wLP.LJII && Float.compare(this.LJIIIIZZ, c1777050wLP.LJIIIIZZ) == 0 && this.LJIIIZ == c1777050wLP.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChipDimens(containerHeightDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chipPaddingStartDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", chipPaddingEndDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", teamScoreIconSizeDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rankTagHeightDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rankIconSizeDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rankTextStyleRes=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", scoreTextStyleRes=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", enigmaPlusTextSizeSp=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", enigmaRevealedTextTuxFont=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + this.LJIIIZ;
    }

    public C1777050wLP(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, int i3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = f6;
        this.LJIIIZ = i3;
    }
}
