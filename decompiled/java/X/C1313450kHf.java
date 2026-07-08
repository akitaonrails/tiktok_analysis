package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.0kHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313450kHf {
    public int LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public int LJI;

    public final boolean LIZ() {
        return this.LJI == 1;
    }

    public final int hashCode() {
        int i = ((this.LJI * 31) + this.LIZ) * 31;
        float f = this.LIZIZ;
        int iFloatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.LIZJ;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.LIZLLL;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.LJ;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.LJFF;
        return iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShadowData: Color: red ");
        sbLIZ.append(Color.red(this.LIZ));
        sbLIZ.append(" green: ");
        sbLIZ.append(Color.green(this.LIZ));
        sbLIZ.append(" blue: ");
        sbLIZ.append(Color.blue(Color.blue(this.LIZ)));
        sbLIZ.append(" OffsetX: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" offsetY: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" blurRadius: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" spreadRadius: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("option: ");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1313450kHf.class != obj.getClass()) {
            return false;
        }
        C1313450kHf c1313450kHf = (C1313450kHf) obj;
        if (this.LIZ == c1313450kHf.LIZ && Float.compare(c1313450kHf.LIZIZ, this.LIZIZ) == 0 && Float.compare(c1313450kHf.LIZJ, this.LIZJ) == 0 && Float.compare(c1313450kHf.LIZLLL, this.LIZLLL) == 0 && Float.compare(c1313450kHf.LJ, this.LJ) == 0 && Float.compare(c1313450kHf.LJFF, this.LJFF) == 0 && this.LJI == c1313450kHf.LJI) {
            return true;
        }
        return false;
    }
}
