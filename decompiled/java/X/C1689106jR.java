package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689106jR implements InterfaceC1688806jO {
    public final C869590Y9l LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC876950Yaj LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689106jR)) {
            return false;
        }
        C1689106jR c1689106jR = (C1689106jR) obj;
        return Intrinsics.LJFF(this.LIZ, c1689106jR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1689106jR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1689106jR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1689106jR.LIZLLL) && Intrinsics.LJFF(this.LJ, c1689106jR.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromMessage(message=");
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
        int i;
        String uid;
        String conversationId = this.LIZ.getConversationId();
        String strValueOf = String.valueOf(this.LIZ.getConversationShortId());
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(this.LIZ.getSender()), this.LIZ.getSecSender(), "im_local_db");
        if (iMUserLJIIL == null) {
            return null;
        }
        boolean zIsBlock = iMUserLJIIL.isBlock();
        C0Y8T c0y8tLIZ = this.LIZLLL.LIZ(conversationId);
        if (c0y8tLIZ == null) {
            return null;
        }
        boolean z = this.LIZ.getConversationType() == AbstractC1711506n3.LIZIZ;
        UrlModel displayAvatar = iMUserLJIIL.getDisplayAvatar();
        String nickName = iMUserLJIIL.getNickName();
        int followingCount = iMUserLJIIL.getFollowingCount();
        int followerCount = iMUserLJIIL.getFollowerCount();
        int followStatus = iMUserLJIIL.getFollowStatus();
        if (z) {
            i = 3;
            IReportUtils.LIZ.getClass();
            strValueOf = String.valueOf(C1703106lh.LIZIZ());
        } else {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            i = (iMHostApiLIZ == null || !iMHostApiLIZ.LJIILJJIL(c0y8tLIZ)) ? 0 : 1;
        }
        if (C1697810uHb.LJIIJJI(1812, 1816).contains(Integer.valueOf(this.LIZ.getMsgType()))) {
            uid = "";
        } else {
            uid = iMUserLJIIL.getUid();
            if (uid == null) {
                return null;
            }
        }
        String str = z ? "im_group_chat" : "im";
        long conversationShortId = c0y8tLIZ.getConversationShortId();
        C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
        String name = coreInfo != null ? coreInfo.getName() : null;
        IReportUtils.LIZ.getClass();
        return new C912520Zr0(strValueOf, uid, conversationId, conversationShortId, C1703106lh.LIZJ(iMUserLJIIL), Boolean.valueOf(zIsBlock), str, i, this.LIZIZ, name, 0, false, false, nickName, displayAvatar, Integer.valueOf(followingCount), Integer.valueOf(followerCount), Integer.valueOf(followStatus), iMUserLJIIL.getRecType(), "", this.LIZJ, this.LJ);
    }

    public C1689106jR(C869590Y9l c869590Y9l, String str, String str2, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = (i & 8) != 0 ? C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ) : null;
        str3 = (i & 16) != 0 ? "" : str3;
        this.LIZ = c869590Y9l;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC876950YajLIZIZ;
        this.LJ = str3;
    }
}
