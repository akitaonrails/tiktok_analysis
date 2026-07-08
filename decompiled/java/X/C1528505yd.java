package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;

/* JADX INFO: renamed from: X.05yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528505yd {
    public static final String LIZ(String str) {
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str2;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIJI = C069P.LIZ().LJ().LJIJI(str);
        if (iMUserLJIJI == null || (imUserBizInfo = iMUserLJIJI.getImUserBizInfo()) == null || (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) == null || (str2 = userB2CAccountInfo.userTags) == null) {
            return "";
        }
        return str2;
    }
}
