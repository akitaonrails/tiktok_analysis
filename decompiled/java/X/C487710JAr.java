package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0JAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487710JAr {
    public static final C487710JAr LIZ = new C487710JAr();

    public static int LIZ(LiveRoomStruct liveRoomStruct) {
        User user;
        if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
            C487710JAr c487710JAr = LIZ;
            int followStatus = user.getFollowStatus();
            int followerStatus = user.getFollowerStatus();
            c487710JAr.getClass();
            if (followStatus == 0 && followerStatus == 1) {
                return 3;
            }
            return followStatus;
        }
        return -1;
    }

    public static int LIZIZ(User user) {
        if (user != null) {
            C487710JAr c487710JAr = LIZ;
            int followStatus = user.getFollowStatus();
            int followerStatus = user.getFollowerStatus();
            c487710JAr.getClass();
            if (followStatus == 0 && followerStatus == 1) {
                return 3;
            }
            return followStatus;
        }
        return -1;
    }
}
