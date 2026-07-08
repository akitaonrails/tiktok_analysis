package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YH extends AbstractC399701gx {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YH)) {
            return false;
        }
        C00YH c00yh = (C00YH) obj;
        return Intrinsics.LJFF(this.LIZ, c00yh.LIZ) && this.LIZIZ == c00yh.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchCategoryPageData(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forceAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YH(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
