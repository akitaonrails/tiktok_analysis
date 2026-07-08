package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155460gAq implements InterfaceC0148002o {
    public final C1164470gPN LL;

    public C1155460gAq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155460gAq) && Intrinsics.LJFF(this.LL, ((C1155460gAq) obj).LL);
    }

    public final int hashCode() {
        C1164470gPN c1164470gPN = this.LL;
        if (c1164470gPN == null) {
            return 0;
        }
        return c1164470gPN.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmusementFeedBannerVMState(amusementInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155460gAq(C1164470gPN c1164470gPN) {
        this.LL = c1164470gPN;
    }
}
