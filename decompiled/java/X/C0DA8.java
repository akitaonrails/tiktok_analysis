package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA8 extends AbstractC334890DAx {
    public final CheckoutStoredUserAddress LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DA8) && Intrinsics.LJFF(this.LIZ, ((C0DA8) obj).LIZ);
    }

    public final int hashCode() {
        CheckoutStoredUserAddress checkoutStoredUserAddress = this.LIZ;
        if (checkoutStoredUserAddress == null) {
            return 0;
        }
        return checkoutStoredUserAddress.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressChanged(address=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DA8(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        this.LIZ = checkoutStoredUserAddress;
    }
}
