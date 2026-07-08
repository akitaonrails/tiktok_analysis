package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YE {
    public final Integer LIZ;
    public final String LIZIZ;
    public final List<C1555800qaY> LIZJ;
    public final Float LIZLLL;

    public C00YE() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YE)) {
            return false;
        }
        C00YE c00ye = (C00YE) obj;
        return Intrinsics.LJFF(this.LIZ, c00ye.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ye.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00ye.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00ye.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<C1555800qaY> list = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.LIZLLL;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSaleEnhancementPricePartialUpdate(displayType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mainText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buyerInfos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stockProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YE(Integer num, String str, List<C1555800qaY> list, Float f) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = f;
    }
}
