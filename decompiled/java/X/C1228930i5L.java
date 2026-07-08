package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMGroupChatPermissionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;

/* JADX INFO: renamed from: X.0i5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228930i5L {
    public static final boolean LIZ(IMUser iMUser) {
        IMGroupChatPermissionInfo groupChatPermissionInfo;
        C1759206uk c1759206uk = C1759206uk.LIZ;
        if (C1759206uk.LIZ()) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = iMUser.getFollowStatus();
            c2201941BFw.getClass();
            if (C2201941BFw.LIZLLL(followStatus)) {
                IMUserBizInfo imUserBizInfo = iMUser.getImUserBizInfo();
                if (imUserBizInfo != null) {
                    groupChatPermissionInfo = imUserBizInfo.getGroupChatPermissionInfo();
                } else {
                    groupChatPermissionInfo = null;
                }
                if (C1382110m4P.LIZ(groupChatPermissionInfo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
