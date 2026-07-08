package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805530x5L implements InterfaceC111300bX {
    public final InterfaceC1806590x73 LL;
    public final InterfaceC1806410x6l LLILLJJLI;
    public final C1803830x2b LLILLL;
    public final DataChannel LLILZ;
    public final C1805540x5M LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805530x5L)) {
            return false;
        }
        C1805530x5L c1805530x5L = (C1805530x5L) obj;
        return Intrinsics.LJFF(this.LL, c1805530x5L.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1805530x5L.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1805530x5L.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1805530x5L.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1805530x5L.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        DataChannel dataChannel = this.LLILZ;
        return ((iHashCode + (dataChannel == null ? 0 : dataChannel.hashCode())) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletPanelBodyParams(rechargeListener=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", performanceTracking=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rechargeDialogConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", walletLegacyParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1805530x5L(C1805180x4m c1805180x4m, InterfaceC1806410x6l interfaceC1806410x6l, C1803830x2b c1803830x2b, DataChannel dataChannel, C1805540x5M c1805540x5M) {
        this.LL = c1805180x4m;
        this.LLILLJJLI = interfaceC1806410x6l;
        this.LLILLL = c1803830x2b;
        this.LLILZ = dataChannel;
        this.LLILZIL = c1805540x5M;
    }
}
