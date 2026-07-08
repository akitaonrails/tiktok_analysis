package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333790D6r extends AbstractC333820D6u {
    public final LocalOrderWrapper LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C333790D6r) && Intrinsics.LJFF(this.LIZ, ((C333790D6r) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenOrderDetails(wrapper=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C333790D6r(LocalOrderWrapper localOrderWrapper) {
        this.LIZ = localOrderWrapper;
    }
}
