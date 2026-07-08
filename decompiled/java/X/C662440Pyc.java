package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Pyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662440Pyc {
    public static final int LIZ(User user) {
        if (user != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int followStatus = user.getFollowStatus();
            if (followStatus != 0) {
                if (followStatus == 1) {
                    return 1;
                }
                if (followStatus != 2) {
                    if (followStatus == 4) {
                        return 4;
                    }
                } else {
                    C662390PyX.LIZ.getClass();
                    if (C662390PyX.LIZLLL(user)) {
                        return 2;
                    }
                    return 3;
                }
            } else if (user.getFollowerStatus() == 1) {
                return 5;
            }
            return 0;
        }
        return -1;
    }

    public static final String LIZIZ(User user) {
        if (user.getFollowStatus() == 2) {
            return "friends";
        }
        if (user.getFollowStatus() == 1) {
            return "following";
        }
        if (user.getMatchedFriendStruct() != null) {
            return "maf";
        }
        return "find_more";
    }
}
