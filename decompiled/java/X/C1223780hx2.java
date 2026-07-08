package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223780hx2 {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;

    public C1223780hx2() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223780hx2)) {
            return false;
        }
        C1223780hx2 c1223780hx2 = (C1223780hx2) obj;
        return Intrinsics.LJFF(this.LIZ, c1223780hx2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1223780hx2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1223780hx2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1223780hx2.LIZLLL) && Intrinsics.LJFF(this.LJ, c1223780hx2.LJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJ;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectListIndexItemUIConfig(indexCellPaddingBottom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textPaddingTop=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textPaddingBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tuxFont=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1223780hx2(Integer num, Integer num2, Integer num3, Integer num4, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 8) != 0 ? null : num3;
        num4 = (i & 16) != 0 ? null : num4;
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = null;
        this.LIZLLL = num3;
        this.LJ = num4;
    }
}
