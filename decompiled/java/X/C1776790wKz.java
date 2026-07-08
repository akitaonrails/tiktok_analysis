package X;

/* JADX INFO: renamed from: X.0wKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776790wKz extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776790wKz)) {
            return false;
        }
        C1776790wKz c1776790wKz = (C1776790wKz) obj;
        return Float.compare(this.LIZJ, c1776790wKz.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776790wKz.LIZLLL) == 0 && Float.compare(this.LJ, c1776790wKz.LJ) == 0 && Float.compare(this.LJFF, c1776790wKz.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeReflectiveCurveTo(dx1=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dy1=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dx2=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dy2=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public C1776790wKz(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
    }
}
