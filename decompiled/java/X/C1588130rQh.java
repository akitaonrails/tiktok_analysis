package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0rQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588130rQh {
    public static final boolean LIZ(Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return C123100dR.LIZ(aid);
    }

    public static final boolean LIZIZ(FriendsV3RepostModel friendsV3RepostModel) {
        String str;
        String uid;
        User user;
        Aweme aweme = null;
        if (friendsV3RepostModel != null) {
            str = friendsV3RepostModel.repostId;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            if (friendsV3RepostModel != null && (user = friendsV3RepostModel.reposter) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (C123100dR.LIZ(uid)) {
                if (friendsV3RepostModel != null) {
                    aweme = friendsV3RepostModel.repostedAweme;
                }
                if (LIZ(aweme)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
