package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334570D9r {
    public final CheckoutIntent LIZ;
    public final CheckoutStoredUserAddress LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334570D9r)) {
            return false;
        }
        C334570D9r c334570D9r = (C334570D9r) obj;
        return Intrinsics.LJFF(this.LIZ, c334570D9r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c334570D9r.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateCheckoutInput(intent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", address=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334570D9r(CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress) {
        this.LIZ = checkoutIntent;
        this.LIZIZ = checkoutStoredUserAddress;
    }
}
