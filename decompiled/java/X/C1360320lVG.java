package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360320lVG {
    public static final int LIZ(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static final boolean LIZIZ(String str) {
        return Intrinsics.LJFF(str, "friends_v3_repost_feeds_detail");
    }

    public static final boolean LIZJ(String str) {
        if (!Intrinsics.LJFF(str, "friends_v3_post_simple_detail") && !Intrinsics.LJFF(str, "friends_v3_post_normal_detail") && !Intrinsics.LJFF(str, "friends_v3_repost_detail")) {
            return false;
        }
        return true;
    }

    public static final String LIZLLL(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
