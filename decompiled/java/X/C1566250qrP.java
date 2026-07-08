package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566250qrP implements InterfaceC111300bX {
    public final C1803830x2b LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final DataChannel LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566250qrP)) {
            return false;
        }
        C1566250qrP c1566250qrP = (C1566250qrP) obj;
        return Intrinsics.LJFF(this.LL, c1566250qrP.LL) && this.LLILLJJLI == c1566250qrP.LLILLJJLI && this.LLILLL == c1566250qrP.LLILLL && this.LLILZ == c1566250qrP.LLILZ && this.LLILZIL == c1566250qrP.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1566250qrP.LLILZLL) && this.LLIZ == c1566250qrP.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1566250qrP.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        DataChannel dataChannel = this.LLIZLLLIL;
        return iHashCode2 + (dataChannel != null ? dataChannel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelHeaderParams(rechargeDialogConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFromSwitch=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPortrait=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canRedirectV3=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isStrategyFirstRecharge=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", chargeReason=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isFromLiveRoom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1566250qrP(C1803830x2b c1803830x2b, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, DataChannel dataChannel) {
        this.LL = c1803830x2b;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = str;
        this.LLIZ = z5;
        this.LLIZLLLIL = dataChannel;
    }
}
