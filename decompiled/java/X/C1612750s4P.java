package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612750s4P {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612750s4P)) {
            return false;
        }
        C1612750s4P c1612750s4P = (C1612750s4P) obj;
        return Intrinsics.LJFF(this.LIZ, c1612750s4P.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1612750s4P.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1612750s4P.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1612750s4P.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionMarketplacePricingResult(priceMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currencyCodeMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", matchedOfferMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clientParamMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1612750s4P(Map<String, String> map, Map<String, String> map2, Map<String, ? extends Object> map3, Map<String, String> map4) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = map4;
    }
}
