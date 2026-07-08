package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157230gDh {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1157250gDj> LIZLLL;
    public final List<C1157240gDi> LJ;
    public final List<C1781860wTA> LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157230gDh)) {
            return false;
        }
        C1157230gDh c1157230gDh = (C1157230gDh) obj;
        return Intrinsics.LJFF(this.LIZ, c1157230gDh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157230gDh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1157230gDh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1157230gDh.LIZLLL) && Intrinsics.LJFF(this.LJ, c1157230gDh.LJ) && Intrinsics.LJFF(this.LJFF, c1157230gDh.LJFF) && Intrinsics.LJFF(this.LJI, c1157230gDh.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoredData(mainTitle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", balanceAmount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bubbles=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", actionNotices=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shippingOrders=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bonusCenterSchema=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157230gDh(String str, String str2, String str3, List<C1157250gDj> list, List<C1157240gDi> list2, List<C1781860wTA> list3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = list3;
        this.LJI = str4;
    }
}
