package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160340gIi implements InterfaceC111300bX {
    public final C1163270gNR LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160340gIi)) {
            return false;
        }
        C1160340gIi c1160340gIi = (C1160340gIi) obj;
        return Intrinsics.LJFF(this.LL, c1160340gIi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1160340gIi.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WhoCanJoinPanelHierarchyData(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1160340gIi(C1163270gNR c1163270gNR, String str) {
        this.LL = c1163270gNR;
        this.LLILLJJLI = str;
    }
}
