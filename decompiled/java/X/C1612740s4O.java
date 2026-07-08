package X;

import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612740s4O {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, IapSubscriptionProduct> LJ;
    public final Map<String, String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612740s4O)) {
            return false;
        }
        C1612740s4O c1612740s4O = (C1612740s4O) obj;
        return Intrinsics.LJFF(this.LIZ, c1612740s4O.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1612740s4O.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1612740s4O.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1612740s4O.LIZLLL) && Intrinsics.LJFF(this.LJ, c1612740s4O.LJ) && Intrinsics.LJFF(this.LJFF, c1612740s4O.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionMarketplacePricingResult(basePlanIdToProductId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priceMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currencyCodeMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gpCurrencyCodeMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", matchedOfferMap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", clientParamMap=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1612740s4O(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Map<String, IapSubscriptionProduct> map5, Map<String, String> map6) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = map4;
        this.LJ = map5;
        this.LJFF = map6;
    }
}
