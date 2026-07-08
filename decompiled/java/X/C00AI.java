package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AI {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final List<Integer> LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AI)) {
            return false;
        }
        C00AI c00ai = (C00AI) obj;
        return Intrinsics.LJFF(this.LIZ, c00ai.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ai.LIZIZ) && this.LIZJ == c00ai.LIZJ && this.LIZLLL == c00ai.LIZLLL && Intrinsics.LJFF(this.LJ, c00ai.LJ) && Float.compare(this.LJFF, c00ai.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OcrWordInfo(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public C00AI(String str, String str2, int i, int i2, List<Integer> list, float f) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = list;
        this.LJFF = f;
    }
}
