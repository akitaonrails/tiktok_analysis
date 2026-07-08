package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1688706jN implements InterfaceC1688806jO {
    public final SessionInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC876950Yaj LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688706jN)) {
            return false;
        }
        C1688706jN c1688706jN = (C1688706jN) obj;
        return Intrinsics.LJFF(this.LIZ, c1688706jN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1688706jN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1688706jN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1688706jN.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromAnySessionInfo(sessionInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationListModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1688806jO
    public final C912520Zr0 LIZ() {
        SessionInfo sessionInfo = this.LIZ;
        if (sessionInfo instanceof C909290Zln) {
            return new C1689006jQ((C909290Zln) sessionInfo, this.LIZIZ, this.LIZJ, this.LIZLLL, 16).LIZ();
        }
        if ((sessionInfo instanceof C913140Zs0) || sessionInfo.isGroupChat()) {
            return new C1688906jP(this.LIZ.getConversationId(), this.LIZIZ, this.LIZJ, null, 24).LIZ();
        }
        return null;
    }

    public C1688706jN(SessionInfo sessionInfo, String str, String str2) {
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        this.LIZ = sessionInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC876950YajLIZIZ;
    }
}
