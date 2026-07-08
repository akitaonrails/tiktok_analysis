package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D64, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D64 extends C0DAW {
    public final CheckoutIntent LIZ;
    public final C332710D2n LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D64)) {
            return false;
        }
        C0D64 c0d64 = (C0D64) obj;
        return Intrinsics.LJFF(this.LIZ, c0d64.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d64.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenThankYouPage(checkoutIntent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D64(CheckoutIntent checkoutIntent, C332710D2n c332710D2n) {
        this.LIZ = checkoutIntent;
        this.LIZIZ = c332710D2n;
    }
}
