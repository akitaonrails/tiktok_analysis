package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334580D9s {
    public final CheckoutIntent LIZ;
    public final CheckoutIntent LIZIZ;
    public final C334430D9d LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334580D9s)) {
            return false;
        }
        C334580D9s c334580D9s = (C334580D9s) obj;
        return Intrinsics.LJFF(this.LIZ, c334580D9s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c334580D9s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c334580D9s.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C334430D9d c334430D9d = this.LIZJ;
        return iHashCode + (c334430D9d == null ? 0 : c334430D9d.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutProductQuantityMutation(previousIntent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updatedIntent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previousViewState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334580D9s(CheckoutIntent checkoutIntent, CheckoutIntent checkoutIntent2, C334430D9d c334430D9d) {
        this.LIZ = checkoutIntent;
        this.LIZIZ = checkoutIntent2;
        this.LIZJ = c334430D9d;
    }
}
