package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10tG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19388410tG {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final boolean LJII;

    public C19388410tG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19388410tG)) {
            return false;
        }
        C19388410tG c19388410tG = (C19388410tG) obj;
        return this.LIZ == c19388410tG.LIZ && this.LIZIZ == c19388410tG.LIZIZ && Float.compare(this.LIZJ, c19388410tG.LIZJ) == 0 && this.LIZLLL == c19388410tG.LIZLLL && Float.compare(this.LJ, c19388410tG.LJ) == 0 && Float.compare(this.LJFF, c19388410tG.LJFF) == 0 && Float.compare(this.LJI, c19388410tG.LJI) == 0 && this.LJII == c19388410tG.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMagnifierConfig(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialZoom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strokeColorRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", strokeWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", elevation=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", clippingEnabled=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public C19388410tG(int i) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        float fLIZIZ2 = C418440Gaw.LIZIZ(2);
        float fLIZIZ3 = C418440Gaw.LIZIZ(200);
        this.LIZ = iLIZIZ;
        this.LIZIZ = iLIZIZ2;
        this.LIZJ = 1.5f;
        this.LIZLLL = R.attr.zj;
        this.LJ = fLIZIZ;
        this.LJFF = fLIZIZ2;
        this.LJI = fLIZIZ3;
        this.LJII = true;
    }
}
