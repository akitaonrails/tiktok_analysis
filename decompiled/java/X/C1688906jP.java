package X;

import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06jP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1688906jP implements InterfaceC1688806jO {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC876950Yaj LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688906jP)) {
            return false;
        }
        C1688906jP c1688906jP = (C1688906jP) obj;
        return Intrinsics.LJFF(this.LIZ, c1688906jP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1688906jP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1688906jP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1688906jP.LIZLLL) && Intrinsics.LJFF(this.LJ, c1688906jP.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromGroupConversationId(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationListModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1688806jO
    public final C912520Zr0 LIZ() {
        C0Y8Y coreInfo;
        IReportUtils.LIZ.getClass();
        String strValueOf = String.valueOf(C1703106lh.LIZIZ());
        C0Y8T c0y8tLIZ = this.LIZLLL.LIZ(this.LIZ);
        long conversationShortId = c0y8tLIZ != null ? c0y8tLIZ.getConversationShortId() : 0L;
        String str = this.LIZ;
        C0Y8T c0y8tLIZ2 = this.LIZLLL.LIZ(str);
        return new C912520Zr0(strValueOf, "", str, conversationShortId, null, null, "im_group_chat", 3, this.LIZIZ, (c0y8tLIZ2 == null || (coreInfo = c0y8tLIZ2.getCoreInfo()) == null) ? null : coreInfo.getName(), 0, false, false, null, null, null, null, null, null, "", this.LIZJ, this.LJ);
    }

    public C1688906jP(String str, String str2, String str3, String str4, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = (i & 8) != 0 ? C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ) : null;
        str4 = (i & 16) != 0 ? "" : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = interfaceC876950YajLIZIZ;
        this.LJ = str4;
    }
}
