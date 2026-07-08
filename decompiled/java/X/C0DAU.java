package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAU extends AbstractC334660DAa {
    public final CheckoutStoredUserAddress LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAU) && Intrinsics.LJFF(this.LIZ, ((C0DAU) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(address=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAU(CheckoutStoredUserAddress checkoutStoredUserAddress) {
        this.LIZ = checkoutStoredUserAddress;
    }
}
