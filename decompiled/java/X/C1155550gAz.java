package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155550gAz implements InterfaceC111300bX {
    public final TakoBotInfo LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155550gAz) && Intrinsics.LJFF(this.LL, ((C1155550gAz) obj).LL);
    }

    public final int hashCode() {
        TakoBotInfo takoBotInfo = this.LL;
        if (takoBotInfo == null) {
            return 0;
        }
        return takoBotInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEnterAIBotlData(botInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155550gAz(TakoBotInfo takoBotInfo) {
        this.LL = takoBotInfo;
    }
}
