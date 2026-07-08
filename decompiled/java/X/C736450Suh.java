package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Suh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736450Suh {
    public static int LIZ(User user) {
        if (user != null) {
            int i = C736560Sus.LIZ[C736550Sur.LIZ(user).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return EnumC736440Sug.ELSE.getValue();
                        }
                        if (C736550Sur.LIZIZ(user)) {
                            return EnumC736440Sug.UNFOLLOW_FRIEND.getValue();
                        }
                        return EnumC736440Sug.UNFOLLOW_NOT_FRIEND.getValue();
                    }
                    if (C736550Sur.LIZIZ(user)) {
                        return EnumC736440Sug.SINGLE_FOLLOWED_FRIEND.getValue();
                    }
                    return EnumC736440Sug.SINGLE_FOLLOWED_NOT_FRIEND.getValue();
                }
                if (C736550Sur.LIZIZ(user)) {
                    return EnumC736440Sug.SINGLE_FOLLOWING_FRIEND.getValue();
                }
                return EnumC736440Sug.SINGLE_FOLLOWING_NO_FRIEND.getValue();
            }
            return EnumC736440Sug.MUTUAL.getValue();
        }
        return EnumC736440Sug.ELSE.getValue();
    }
}
