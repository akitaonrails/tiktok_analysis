package X;

/* JADX INFO: renamed from: X.0wKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776740wKu extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776740wKu)) {
            return false;
        }
        C1776740wKu c1776740wKu = (C1776740wKu) obj;
        return Float.compare(this.LIZJ, c1776740wKu.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776740wKu.LIZLLL) == 0 && Float.compare(this.LJ, c1776740wKu.LJ) == 0 && Float.compare(this.LJFF, c1776740wKu.LJFF) == 0 && Float.compare(this.LJI, c1776740wKu.LJI) == 0 && Float.compare(this.LJII, c1776740wKu.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurveTo(x1=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", y1=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", x2=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", y2=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", x3=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", y3=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C1776740wKu(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
    }
}
