package X;

/* JADX INFO: renamed from: X.0wKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776720wKs extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final float LJII;
    public final float LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776720wKs)) {
            return false;
        }
        C1776720wKs c1776720wKs = (C1776720wKs) obj;
        return Float.compare(this.LIZJ, c1776720wKs.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776720wKs.LIZLLL) == 0 && Float.compare(this.LJ, c1776720wKs.LJ) == 0 && this.LJFF == c1776720wKs.LJFF && this.LJI == c1776720wKs.LJI && Float.compare(this.LJII, c1776720wKs.LJII) == 0 && Float.compare(this.LJIIIIZZ, c1776720wKs.LJIIIIZZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeArcTo(horizontalEllipseRadius=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", verticalEllipseRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", theta=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isMoreThanHalf=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPositiveArc=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", arcStartDx=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", arcStartDy=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ);
    }

    public C1776720wKs(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = f4;
        this.LJIIIIZZ = f5;
    }
}
