package X;

import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1881907Yr extends AbstractC1881807Yq {
    public final MinisSubscriptionInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1881907Yr) && Intrinsics.LJFF(this.LIZ, ((C1881907Yr) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(itemInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1881907Yr(MinisSubscriptionInfo minisSubscriptionInfo) {
        this.LIZ = minisSubscriptionInfo;
    }
}
