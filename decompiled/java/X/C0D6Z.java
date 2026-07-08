package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderFirstPageCacheV1;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6Z {
    public final OrderPendingCacheV1 LIZ;
    public final OrderFirstPageCacheV1 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D6Z)) {
            return false;
        }
        C0D6Z c0d6z = (C0D6Z) obj;
        return Intrinsics.LJFF(this.LIZ, c0d6z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d6z.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrdersV2FirstFrame(pending=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D6Z(OrderPendingCacheV1 orderPendingCacheV1, OrderFirstPageCacheV1 orderFirstPageCacheV1) {
        this.LIZ = orderPendingCacheV1;
        this.LIZIZ = orderFirstPageCacheV1;
    }
}
