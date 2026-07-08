package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YG {
    public final Integer LIZ;
    public final String LIZIZ;
    public final List<C1555800qaY> LIZJ;
    public final Float LIZLLL;
    public final Long LJ;

    public C00YG() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YG)) {
            return false;
        }
        C00YG c00yg = (C00YG) obj;
        return Intrinsics.LJFF(this.LIZ, c00yg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00yg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00yg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00yg.LIZLLL) && Intrinsics.LJFF(this.LJ, c00yg.LJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<C1555800qaY> list = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.LJ;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSaleTagAreaPartialUpdate(displayType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mainText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buyerInfos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stockProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", countdownRemainTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YG(Integer num, String str, List list, Float f, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        list = (i & 4) != 0 ? null : list;
        f = (i & 8) != 0 ? null : f;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = f;
        this.LJ = null;
    }
}
