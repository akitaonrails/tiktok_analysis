package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389300mG0 {
    public static final String LIZ(C0RJN c0rjn) {
        C2189821An6 c2189821An6;
        String eventType;
        if (c0rjn == null || (c2189821An6 = c0rjn.LIZJ) == null || (eventType = c2189821An6.getEventType()) == null) {
            return "";
        }
        return eventType;
    }

    public static final String LIZIZ(Fragment fragment) {
        Object c098200Yq;
        Object obj = "";
        try {
            if (LJIJ(fragment)) {
                c098200Yq = "friends_v3_text_post_detail";
            } else if (LJIJI(fragment)) {
                c098200Yq = "friends_v3_text_post_history";
            } else if (C1599640rjG.LIZIZ.Pu(fragment)) {
                c098200Yq = "friends_v3_feeds";
            } else {
                if (LJIILJJIL(fragment)) {
                    return "friends_v3_post_simple_detail";
                }
                if (LJIILIIL(fragment)) {
                    return "friends_v3_post_normal_detail";
                }
                if (LJIILLIIL(fragment)) {
                    return "friends_v3_repost_detail";
                }
                if (!LJIIZILJ(fragment)) {
                    c098200Yq = "";
                } else {
                    return "friends_v3_repost_feeds_detail";
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZJ(C2189821An6 c2189821An6) {
        Object c098200Yq;
        String friendsV3DetailType;
        DetailNavArgModel navArgModel;
        Object obj = "";
        try {
            if (C1360340lVI.LIZJ(c2189821An6)) {
                return "friends_v3_post_simple_detail";
            }
            if (C1360340lVI.LIZIZ(c2189821An6)) {
                return "friends_v3_post_normal_detail";
            }
            if (C1360340lVI.LIZLLL(c2189821An6)) {
                return "friends_v3_repost_detail";
            }
            if (C1360340lVI.LJ(c2189821An6)) {
                return "friends_v3_repost_feeds_detail";
            }
            String eventType = null;
            if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null) {
                friendsV3DetailType = null;
            } else {
                friendsV3DetailType = navArgModel.getFriendsV3DetailType();
            }
            if (Intrinsics.LJFF(friendsV3DetailType, "friends_v3_text_post_detail")) {
                return "friends_v3_text_post_detail";
            }
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            }
            if (!Intrinsics.LJFF(eventType, "homepage_friends") || !C319860CgK.LIZ()) {
                c098200Yq = "";
            } else {
                c098200Yq = "friends_v3_feeds";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZLLL(C0RJN c0rjn) {
        C2189821An6 c2189821An6;
        String from;
        if (c0rjn == null || (c2189821An6 = c0rjn.LIZJ) == null || (from = c2189821An6.getFrom()) == null) {
            return "";
        }
        return from;
    }

    public static final int LJ(C0RJN c0rjn) {
        C2189821An6 c2189821An6;
        if (c0rjn != null && (c2189821An6 = c0rjn.LIZJ) != null) {
            return c2189821An6.getPageType();
        }
        return 0;
    }

    public static final boolean LJFF(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "DETAIL_AI_TAKO_VIDEO");
    }

    public static final boolean LJI(Fragment fragment) {
        String string;
        C0RJN c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
        if (c0rjnLIZIZ != null) {
            return LJII(c0rjnLIZIZ);
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "");
        } else {
            string = null;
        }
        return C13LP.LJJJJ(string, C1581990rGn.LIZIZ);
    }

    public static final boolean LJII(C0RJN c0rjn) {
        if (c0rjn != null && C1581990rGn.LIZIZ.contains(c0rjn.LIZ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "Following");
    }

    public static final boolean LJIIIZ(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "Friends");
    }

    public static final boolean LJIIJ(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        if (((Boolean) C136100fX.LIZ.getValue()).booleanValue()) {
            if (fragment != null && fragment.isAdded() && (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragment)) != null && LJIIJJI(c0rjnLIZIZ2)) {
                return true;
            }
            return false;
        }
        if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && LJIIJJI(c0rjnLIZIZ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "SCENE_DETAIL_FRIENDS");
    }

    public static final boolean LJIIL(Fragment fragment) {
        if (!LJIILIIL(fragment) && !LJIILJJIL(fragment)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        if (!LJIIJ(fragment)) {
            return false;
        }
        String str = null;
        if (fragment != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
            if (c0rjnLIZIZ != null) {
                str = c0rjnLIZIZ.LIZ;
            }
        } else {
            c0rjnLIZIZ = null;
        }
        if (!Intrinsics.LJFF(str, "SCENE_DETAIL_FRIENDS") || !C1360340lVI.LIZIZ(c0rjnLIZIZ.LIZJ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        if (LJIIJ(fragment)) {
            if (fragment != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
            } else {
                c0rjnLIZIZ = null;
            }
            if (LJIILL(c0rjnLIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILL(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "SCENE_DETAIL_FRIENDS") && C1360340lVI.LIZJ(c0rjn.LIZJ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        if (!LJIIJ(fragment)) {
            return false;
        }
        String str = null;
        if (fragment != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
            if (c0rjnLIZIZ != null) {
                str = c0rjnLIZIZ.LIZ;
            }
        } else {
            c0rjnLIZIZ = null;
        }
        if (!Intrinsics.LJFF(str, "SCENE_DETAIL_FRIENDS") || !C1360340lVI.LIZLLL(c0rjnLIZIZ.LIZJ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        C2189821An6 c2189821An6 = null;
        if (fragment != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
        } else {
            c0rjnLIZIZ = null;
        }
        if (Intrinsics.LJFF(LIZLLL(c0rjnLIZIZ), "from_repost_feed_entrance")) {
            if (fragment != null && (c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragment)) != null) {
                c2189821An6 = c0rjnLIZIZ2.LIZJ;
            }
            if (C1360340lVI.LJ(c2189821An6)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIJ(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && Intrinsics.LJFF(c0rjnLIZIZ.LIZ, "SCENE_FRIENDS_V3_TEXT")) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && Intrinsics.LJFF(c0rjnLIZIZ.LIZ, "SCENE_FRIENDS_V3_TEXT_HISTORY")) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(C0RJN c0rjn) {
        if (c0rjn != null && C1581990rGn.LIZ.contains(c0rjn.LIZ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(C0RJN c0rjn) {
        String str;
        String str2 = null;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "NEARBY_FEED_DOUBLE_COLUMN")) {
            if (c0rjn != null) {
                str2 = c0rjn.LIZ;
            }
            if (!Intrinsics.LJFF(str2, "NEARBY_FEED_INNER")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJIL(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "For You");
    }

    public static final boolean LJJ(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "Repost");
    }

    public static final boolean LJJI(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "DETAIL_STORY");
    }
}
