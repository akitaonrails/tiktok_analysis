package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AK {
    public final String LIZ;
    public final float LIZIZ;
    public final List<Float> LIZJ;
    public final List<C00AI> LIZLLL;
    public final List<Integer> LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AK)) {
            return false;
        }
        C00AK c00ak = (C00AK) obj;
        return Intrinsics.LJFF(this.LIZ, c00ak.LIZ) && Float.compare(this.LIZIZ, c00ak.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c00ak.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00ak.LIZLLL) && Intrinsics.LJFF(this.LJ, c00ak.LJ) && Float.compare(this.LJFF, c00ak.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OcrDecodedText(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", charConfidences=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", words=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", validColumns=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", columnCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public C00AK(C13BV c13bv, C13BV c13bv2) {
        this("", 0.0f, c13bv, c13bv2, C13BV.INSTANCE, 0.0f);
    }

    public C00AK(String str, float f, List<Float> list, List<C00AI> list2, List<Integer> list3, float f2) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = f2;
    }
}
