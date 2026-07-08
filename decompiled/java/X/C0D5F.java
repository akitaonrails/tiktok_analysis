package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5F extends C0D5G {
    public final CheckoutIntent LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D5F) && Intrinsics.LJFF(this.LIZ, ((C0D5F) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Determined(intent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5F(CheckoutIntent checkoutIntent) {
        this.LIZ = checkoutIntent;
    }
}
