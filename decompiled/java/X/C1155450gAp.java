package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155450gAp implements InterfaceC0148002o {
    public final C1164460gPM LL;

    public C1155450gAp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155450gAp) && Intrinsics.LJFF(this.LL, ((C1155450gAp) obj).LL);
    }

    public final int hashCode() {
        C1164460gPM c1164460gPM = this.LL;
        if (c1164460gPM == null) {
            return 0;
        }
        return c1164460gPM.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAiSummaryFeedBannerVMState(aiSummaryInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155450gAp(C1164460gPM c1164460gPM) {
        this.LL = c1164460gPM;
    }
}
