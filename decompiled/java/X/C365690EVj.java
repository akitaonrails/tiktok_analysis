package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365690EVj {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C365690EVj)) {
            return false;
        }
        C365690EVj c365690EVj = (C365690EVj) obj;
        return Intrinsics.LJFF(this.LIZ, c365690EVj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c365690EVj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c365690EVj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c365690EVj.LIZLLL);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LIZLLL;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetouchResFetchResult(isFetchAlgModelSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFetchBeautyListSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFetchAutoRetouchSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFetchSecondaryItemSuccess=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C365690EVj(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
        this.LIZLLL = bool4;
    }

    public static C365690EVj LIZ(C365690EVj c365690EVj, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        if ((i & 1) != 0) {
            bool = c365690EVj.LIZ;
        }
        if ((i & 2) != 0) {
            bool2 = c365690EVj.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool3 = c365690EVj.LIZJ;
        }
        if ((i & 8) != 0) {
            bool4 = c365690EVj.LIZLLL;
        }
        c365690EVj.getClass();
        return new C365690EVj(bool, bool2, bool3, bool4);
    }
}
