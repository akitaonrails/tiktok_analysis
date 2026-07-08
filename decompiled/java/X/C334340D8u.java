package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpRequestParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334340D8u {
    public final ShopifyEcpRequestParams LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C334340D8u) && Intrinsics.LJFF(this.LIZ, ((C334340D8u) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentSucceededContext(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334340D8u(ShopifyEcpRequestParams shopifyEcpRequestParams) {
        this.LIZ = shopifyEcpRequestParams;
    }
}
