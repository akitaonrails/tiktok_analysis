package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053600Hm {
    public final String LIZ;
    public final float LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public final float[][] LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C053600Hm)) {
            return false;
        }
        C053600Hm c053600Hm = (C053600Hm) obj;
        return Intrinsics.LJFF(this.LIZ, c053600Hm.LIZ) && Float.compare(this.LIZIZ, c053600Hm.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c053600Hm.LIZJ) && this.LIZLLL == c053600Hm.LIZLLL && this.LJ == c053600Hm.LJ && Float.compare(this.LJFF, c053600Hm.LJFF) == 0 && Float.compare(this.LJI, c053600Hm.LJI) == 0 && Intrinsics.LJFF(this.LJII, c053600Hm.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OcrLocalizedWord(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", leftRatio=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rightRatio=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", quad=");
        sbLIZ.append(Arrays.toString(this.LJII));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Arrays.hashCode(this.LJII);
    }

    public C053600Hm(String str, float f, String str2, int i, int i2, float f2, float f3, float[][] fArr) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = f2;
        this.LJI = f3;
        this.LJII = fArr;
    }
}
