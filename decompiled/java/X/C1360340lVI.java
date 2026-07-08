package X;

import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360340lVI {
    public static final boolean LIZ(C2189821An6 c2189821An6) {
        if (!LIZIZ(c2189821An6) && !LIZJ(c2189821An6) && !LIZLLL(c2189821An6)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(C2189821An6 c2189821An6) {
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            friendsV3DetailType = navArgModel.getFriendsV3DetailType();
        } else {
            friendsV3DetailType = null;
        }
        return Intrinsics.LJFF(friendsV3DetailType, "friends_v3_post_normal_detail");
    }

    public static final boolean LIZJ(C2189821An6 c2189821An6) {
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            friendsV3DetailType = navArgModel.getFriendsV3DetailType();
        } else {
            friendsV3DetailType = null;
        }
        return Intrinsics.LJFF(friendsV3DetailType, "friends_v3_post_simple_detail");
    }

    public static final boolean LIZLLL(C2189821An6 c2189821An6) {
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            friendsV3DetailType = navArgModel.getFriendsV3DetailType();
        } else {
            friendsV3DetailType = null;
        }
        return Intrinsics.LJFF(friendsV3DetailType, "friends_v3_repost_detail");
    }

    public static final boolean LJ(C2189821An6 c2189821An6) {
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
            friendsV3DetailType = navArgModel.getFriendsV3DetailType();
        } else {
            friendsV3DetailType = null;
        }
        return Intrinsics.LJFF(friendsV3DetailType, "friends_v3_repost_feeds_detail");
    }
}
