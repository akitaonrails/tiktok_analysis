package X;

import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237500iJA {
    public final CommonFlowActivity LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1237500iJA) && Intrinsics.LJFF(this.LIZ, ((C1237500iJA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmailConsentLaunchActionParams(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1237500iJA(CommonFlowActivity commonFlowActivity) {
        this.LIZ = commonFlowActivity;
    }
}
