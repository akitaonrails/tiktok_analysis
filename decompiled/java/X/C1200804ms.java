package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1200804ms {
    public final List<String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200804ms)) {
            return false;
        }
        C1200804ms c1200804ms = (C1200804ms) obj;
        return Intrinsics.LJFF(this.LIZ, c1200804ms.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1200804ms.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1200804ms.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1200804ms.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionMarketplacePricingInput(productIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", basePlanIdToOfferId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productIdToCurrencyCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", basePlanIdToProductId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1200804ms(List<String> list, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = map3;
    }
}
