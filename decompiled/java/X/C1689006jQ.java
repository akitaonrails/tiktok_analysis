package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689006jQ implements InterfaceC1688806jO {
    public final C909290Zln LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC876950Yaj LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689006jQ)) {
            return false;
        }
        C1689006jQ c1689006jQ = (C1689006jQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1689006jQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1689006jQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1689006jQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1689006jQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1689006jQ.LJ);
    }

    public final int hashCode() {
        C909290Zln c909290Zln = this.LIZ;
        int iHashCode = (((c909290Zln == null ? 0 : c909290Zln.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromSingleSessionInfo(sessionInfo=");
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
        String conversationId;
        String uid;
        C909290Zln c909290Zln = this.LIZ;
        if (c909290Zln != null && (conversationId = c909290Zln.getConversationId()) != null) {
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJ = C069P.LIZ().LJ().LJ(this.LIZ.getSingleChatFromUserId(), null);
            if ((iMUserLJ == null && (iMUserLJ = this.LIZ.getSingleChatFromUser()) == null) || (uid = iMUserLJ.getUid()) == null) {
                return null;
            }
            boolean zIsBlock = iMUserLJ.isBlock();
            C0Y8T c0y8tLIZ = this.LIZLLL.LIZ(conversationId);
            if (c0y8tLIZ == null) {
                return null;
            }
            long conversationShortId = c0y8tLIZ.getConversationShortId();
            UrlModel displayAvatar = iMUserLJ.getDisplayAvatar();
            String nickName = iMUserLJ.getNickName();
            int followingCount = iMUserLJ.getFollowingCount();
            int followerCount = iMUserLJ.getFollowerCount();
            int followStatus = iMUserLJ.getFollowStatus();
            if (conversationId.length() != 0 && conversationShortId > 0) {
                int chatType = this.LIZ.getChatType();
                List listLLD = C13LP.LLD(2, a0.LJJLIIIJ(this.LIZ.getConversationId(), new char[]{':'}, false, 0, 6));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLLD) {
                    if (!Intrinsics.LJFF(obj, ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId())) {
                        arrayList.add(obj);
                    }
                }
                String str = (String) C13LP.LJJJLL(arrayList);
                String strValueOf = String.valueOf(conversationShortId);
                if (str != null) {
                    uid = str;
                }
                C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
                String name = coreInfo != null ? coreInfo.getName() : null;
                IReportUtils.LIZ.getClass();
                return new C912520Zr0(strValueOf, uid, conversationId, conversationShortId, C1703106lh.LIZJ(iMUserLJ), Boolean.valueOf(zIsBlock), "im", chatType, this.LIZIZ, name, 0, this.LIZ.isHighRiskConversation(), this.LIZ.isMediaMsgMasking(), nickName, displayAvatar, Integer.valueOf(followingCount), Integer.valueOf(followerCount), Integer.valueOf(followStatus), iMUserLJ.getRecType(), "", this.LIZJ, this.LJ);
            }
        }
        return null;
    }

    public C1689006jQ(C909290Zln c909290Zln, String str, String str2, InterfaceC876950Yaj interfaceC876950Yaj, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        interfaceC876950Yaj = (i & 8) != 0 ? C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ) : interfaceC876950Yaj;
        String str3 = (i & 16) != 0 ? "" : null;
        this.LIZ = c909290Zln;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC876950Yaj;
        this.LJ = str3;
    }
}
