package X;

import com.ss.android.ugc.aweme.im.b2c.strategy.model.ChatCommonConfMetaData;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.06fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663706fL {
    public static final C1663706fL LIZ = new C1663706fL();

    public static ChatCommonConfMetaData LIZ(SessionInfo sessionInfo, IMUser iMUser, IMUser iMUser2) {
        Collection collectionLIZ;
        Iterable iterableLIZ;
        Long lLJIILIIL;
        Integer numValueOf;
        Integer num;
        int value;
        String str;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String uid;
        if (iMUser2 == null || (collectionLIZ = C1665206fa.LIZ(iMUser2)) == null) {
            collectionLIZ = C13BV.INSTANCE;
        }
        if (iMUser == null || (iterableLIZ = C1665206fa.LIZ(iMUser)) == null) {
            iterableLIZ = C13BV.INSTANCE;
        }
        if (iMUser != null && (uid = iMUser.getUid()) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(uid);
        } else {
            lLJIILIIL = null;
        }
        ArrayList arrayList = new ArrayList();
        if (sessionInfo.getEntranceType() > 1) {
            arrayList.add(Integer.valueOf(sessionInfo.getEntranceType()));
        }
        if (lLJIILIIL != null) {
            arrayList.addAll(C1665206fa.LIZJ(String.valueOf(lLJIILIIL.longValue())));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLIL(iterableLIZ, collectionLIZ), ",", null, null, 0, null, null, 62);
        String str2 = null;
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(iterableLIZ, ",", null, null, 0, null, null, 62);
        if (iMUser != null) {
            numValueOf = Integer.valueOf(iMUser.getFollowStatus());
        } else {
            numValueOf = null;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) it2.next()).intValue()));
        }
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
            num = userB2CAccountInfo.bizUserLevel;
        } else {
            num = null;
        }
        C1663606fK c1663606fKLIZ = C1663806fM.LIZ(sessionInfo, false);
        if (sessionInfo.getChatType() == 3) {
            value = EnumC869400Y8s.GROUP_CHAT.getValue();
        } else {
            value = EnumC869400Y8s.ONE_TO_ONE_CHAT.getValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildMetaDta scp: userTags: ");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", entrance_type: ");
        sbLIZ.append(arrayList);
        sbLIZ.append(", followStatus: ");
        sbLIZ.append(numValueOf);
        sbLIZ.append(", peerUserTags: ");
        sbLIZ.append(strLJJLIIIJ2);
        sbLIZ.append(", otherUserAgeLeve: ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1663606fKLIZ != null) {
            str = c1663606fKLIZ.LIZ;
            str2 = c1663606fKLIZ.LIZIZ;
        } else {
            str = null;
        }
        return new ChatCommonConfMetaData(strLJJLIIIJ, arrayList2, value, numValueOf, strLJJLIIIJ2, num, str, str2, 0L, 0L, null, 1792, null);
    }
}
