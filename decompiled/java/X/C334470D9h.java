package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334470D9h {
    public final String LIZ;
    public final CheckoutIntent LIZIZ;
    public final CheckoutStoredUserAddress LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334470D9h)) {
            return false;
        }
        C334470D9h c334470D9h = (C334470D9h) obj;
        return Intrinsics.LJFF(this.LIZ, c334470D9h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c334470D9h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c334470D9h.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCheckoutInput(checkoutId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", address=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334470D9h(String str, CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress) {
        this.LIZ = str;
        this.LIZIZ = checkoutIntent;
        this.LIZJ = checkoutStoredUserAddress;
    }
}
