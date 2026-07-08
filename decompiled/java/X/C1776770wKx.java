package X;

/* JADX INFO: renamed from: X.0wKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776770wKx extends AbstractC1776680wKo {
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
        if (!(obj instanceof C1776770wKx)) {
            return false;
        }
        C1776770wKx c1776770wKx = (C1776770wKx) obj;
        return Float.compare(this.LIZJ, c1776770wKx.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776770wKx.LIZLLL) == 0 && Float.compare(this.LJ, c1776770wKx.LJ) == 0 && Float.compare(this.LJFF, c1776770wKx.LJFF) == 0 && Float.compare(this.LJI, c1776770wKx.LJI) == 0 && Float.compare(this.LJII, c1776770wKx.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeCurveTo(dx1=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dy1=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dx2=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dy2=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", dx3=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", dy3=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C1776770wKx(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
    }
}
