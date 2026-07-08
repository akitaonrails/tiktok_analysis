package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;

/* JADX INFO: renamed from: X.0j2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265660j2a {
    public static final ManageFollowItem LIZ(User user, boolean z) {
        SimpleUser simpleUser = new SimpleUser(user.getUid(), user.getSecUid());
        UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()));
        C1243240iSQ.LIZ.getClass();
        String strLIZ = C1243240iSQ.LIZ(user, true);
        String uniqueId = user.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        return new ManageFollowItem(z, simpleUser, userVerify, strLIZ, uniqueId, false);
    }
}
