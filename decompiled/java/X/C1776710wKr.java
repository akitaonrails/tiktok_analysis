package X;

/* JADX INFO: renamed from: X.0wKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776710wKr extends AbstractC1776680wKo {
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
        if (!(obj instanceof C1776710wKr)) {
            return false;
        }
        C1776710wKr c1776710wKr = (C1776710wKr) obj;
        return Float.compare(this.LIZJ, c1776710wKr.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776710wKr.LIZLLL) == 0 && Float.compare(this.LJ, c1776710wKr.LJ) == 0 && this.LJFF == c1776710wKr.LJFF && this.LJI == c1776710wKr.LJI && Float.compare(this.LJII, c1776710wKr.LJII) == 0 && Float.compare(this.LJIIIIZZ, c1776710wKr.LJIIIIZZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArcTo(horizontalEllipseRadius=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", verticalEllipseRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", theta=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isMoreThanHalf=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPositiveArc=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", arcStartX=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", arcStartY=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ);
    }

    public C1776710wKr(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5) {
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
