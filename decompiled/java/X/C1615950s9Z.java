package X;

import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615950s9Z {
    public final PaymentComponentResponse LIZ;
    public final Map<String, C1615460s8m> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615950s9Z)) {
            return false;
        }
        C1615950s9Z c1615950s9Z = (C1615950s9Z) obj;
        return Intrinsics.LJFF(this.LIZ, c1615950s9Z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1615950s9Z.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, C1615460s8m> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcPaymentPurchasePanel(paymentComponentResponse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iapId2ProductDetail=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1615950s9Z(PaymentComponentResponse paymentComponentResponse, Map<String, C1615460s8m> map) {
        this.LIZ = paymentComponentResponse;
        this.LIZIZ = map;
    }
}
