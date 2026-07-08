package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AJ {
    public final String LIZ;
    public final C053800Ho LIZIZ;
    public final List<C053600Hm> LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AJ)) {
            return false;
        }
        C00AJ c00aj = (C00AJ) obj;
        return Intrinsics.LJFF(this.LIZ, c00aj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00aj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00aj.LIZJ) && Float.compare(this.LIZLLL, c00aj.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OcrItemResult(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", box=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", words=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C053800Ho c053800Ho = this.LIZIZ;
        return ((((iHashCode + (c053800Ho != null ? c053800Ho.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C00AJ(String str, C053800Ho c053800Ho, List<C053600Hm> list, float f) {
        this.LIZ = str;
        this.LIZIZ = c053800Ho;
        this.LIZJ = list;
        this.LIZLLL = f;
    }
}
