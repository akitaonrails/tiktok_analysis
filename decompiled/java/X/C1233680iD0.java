package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233680iD0 implements InterfaceC111300bX {
    public final String LL;
    public final Intent LLILLJJLI;
    public final Context LLILLL;
    public final C1233650iCx LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233680iD0)) {
            return false;
        }
        C1233680iD0 c1233680iD0 = (C1233680iD0) obj;
        return Intrinsics.LJFF(this.LL, c1233680iD0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1233680iD0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1233680iD0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1233680iD0.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Context context = this.LLILLL;
        int iHashCode2 = (iHashCode + (context == null ? 0 : context.hashCode())) * 31;
        C1233650iCx c1233650iCx = this.LLILZ;
        return iHashCode2 + (c1233650iCx != null ? c1233650iCx.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TwoStepVerificationManagementHierarchyData(interstitialToken=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activityIntent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", activityContext=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", twoStepViewOptions=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1233680iD0(String str, Intent intent, TwoStepVerificationManagementActivity twoStepVerificationManagementActivity, C1233650iCx c1233650iCx) {
        this.LL = str;
        this.LLILLJJLI = intent;
        this.LLILLL = twoStepVerificationManagementActivity;
        this.LLILZ = c1233650iCx;
    }
}
