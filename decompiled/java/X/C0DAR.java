package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAR {
    public final C0DAS LIZ;
    public final CheckoutStoredUserAddress LIZIZ;

    public C0DAR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DAR)) {
            return false;
        }
        C0DAR c0dar = (C0DAR) obj;
        return this.LIZ == c0dar.LIZ && Intrinsics.LJFF(this.LIZIZ, c0dar.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        CheckoutStoredUserAddress checkoutStoredUserAddress = this.LIZIZ;
        return iHashCode + (checkoutStoredUserAddress == null ? 0 : checkoutStoredUserAddress.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutShippingAddressState(phase=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedAddress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AbstractC334660DAa LIZ() {
        int i = C0DAT.LIZ[this.LIZ.ordinal()];
        if (i == 1) {
            return C334850DAt.LIZ;
        }
        if (i == 2) {
            return C334840DAs.LIZ;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        CheckoutStoredUserAddress checkoutStoredUserAddress = this.LIZIZ;
        return checkoutStoredUserAddress == null ? C334840DAs.LIZ : new C0DAU(checkoutStoredUserAddress);
    }

    public /* synthetic */ C0DAR(int i) {
        this(C0DAS.RESOLVING, null);
    }

    public C0DAR(C0DAS c0das, CheckoutStoredUserAddress checkoutStoredUserAddress) {
        this.LIZ = c0das;
        this.LIZIZ = checkoutStoredUserAddress;
    }
}
