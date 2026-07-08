package X;

import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617000sBG extends AbstractC1617020sBI {
    public final String LIZ;
    public final IapSubscriptionProduct LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1617000sBG)) {
            return false;
        }
        C1617000sBG c1617000sBG = (C1617000sBG) obj;
        return Intrinsics.LJFF(this.LIZ, c1617000sBG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1617000sBG.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        IapSubscriptionProduct iapSubscriptionProduct = this.LIZIZ;
        return iHashCode + (iapSubscriptionProduct == null ? 0 : iapSubscriptionProduct.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(clientParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchedOffer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1617000sBG(IapSubscriptionProduct iapSubscriptionProduct, String str) {
        this.LIZ = str;
        this.LIZIZ = iapSubscriptionProduct;
    }
}
