package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Vyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815350Vyf {
    public static final C815350Vyf LIZ = new C815350Vyf();
    public static final int LIZIZ = R.raw.icon_color_secret_replies_avatar;
    public static final Map<String, Integer> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("im_friend_online", Integer.valueOf(R.raw.icon_bitmap_sticker_hi)), new Pair("CommentAt", Integer.valueOf(R.raw.icon_color_at_circle)), new Pair("AwemeAt", Integer.valueOf(R.raw.icon_color_at_circle)), new Pair("Like", Integer.valueOf(R.raw.icon_color_like_circle)), new Pair("LikeVideoUpvoted", Integer.valueOf(R.raw.icon_color_like_circle)), new Pair("im_private", Integer.valueOf(R.raw.icon_color_paperplane_circle)), new Pair("im_group", Integer.valueOf(R.raw.icon_color_paperplane_circle)), new Pair("upvote_post", Integer.valueOf(R.raw.icon_color_repost)), new Pair("realtime_repost", Integer.valueOf(R.raw.icon_color_repost)), new Pair("FriendUpvoteMsg", Integer.valueOf(R.raw.icon_color_repost)), new Pair("upvote_video", Integer.valueOf(R.raw.icon_color_repost)), new Pair("recom_search_push", Integer.valueOf(R.raw.icon_bitmap_fire)), new Pair("hot_search_push", Integer.valueOf(R.raw.icon_bitmap_fire)), new Pair("profile_viewer", Integer.valueOf(R.raw.icon_color_foot_print_circle)), new Pair("aggrerate", Integer.valueOf(R.raw.icon_color_bell)), new Pair("user", Integer.valueOf(R.raw.icon_color_two_person_circle)), new Pair("Follow", Integer.valueOf(R.raw.icon_color_two_person_circle)), new Pair("FollowReq", Integer.valueOf(R.raw.icon_color_two_person_circle)), new Pair("ApproveFollowReq", Integer.valueOf(R.raw.icon_color_two_person_circle)), new Pair("high_value_counter_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("top_affinity_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("frequently_watched_unfollowed_uid_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("acq_video", Integer.valueOf(R.raw.icon_color_video)), new Pair("push_click_author_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("realtime_story", Integer.valueOf(R.raw.icon_color_video)), new Pair("friend_realtime_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("freq_interact_video", Integer.valueOf(R.raw.icon_color_video)), new Pair("post", Integer.valueOf(R.raw.icon_color_video)), new Pair("subscribed_post", Integer.valueOf(R.raw.icon_color_video)), new Pair("interactive_recall", Integer.valueOf(R.raw.icon_color_video)), new Pair("story", Integer.valueOf(R.raw.icon_color_video)), new Pair("real_time_news", Integer.valueOf(R.raw.icon_color_video)), new Pair("tiktok_shared_video_viewed", Integer.valueOf(R.raw.icon_color_video)), new Pair("Comment", Integer.valueOf(R.raw.icon_color_comment_circle)), new Pair("CommentReply", Integer.valueOf(R.raw.icon_color_comment_circle)), new Pair("muf_comment", Integer.valueOf(R.raw.icon_color_comment_circle)), new Pair("CommentReplyCommentUserWithItem", Integer.valueOf(R.raw.icon_color_comment_circle)), new Pair("recommend", Integer.valueOf(R.raw.icon_color_ame_effect)), new Pair("live", Integer.valueOf(R.raw.icon_color_live_circle)), new Pair("live_event_user", Integer.valueOf(R.raw.icon_color_live_circle)), new Pair("live_event_author", Integer.valueOf(R.raw.icon_color_live_circle)));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(385));
    public static final ConcurrentHashMap<Integer, Bitmap> LJ = new ConcurrentHashMap<>();
    public static final Set<Bitmap> LJFF = Collections.newSetFromMap(new ConcurrentHashMap());

    public static Bitmap LIZ(int i) {
        Object c098200Yq;
        Object obj = null;
        if (i == 0) {
            return null;
        }
        ConcurrentHashMap<Integer, Bitmap> concurrentHashMap = LJ;
        Bitmap bitmap = concurrentHashMap.get(Integer.valueOf(i));
        if (bitmap != null) {
            return bitmap;
        }
        Context contextM3 = C786410Ut5.M3(C1BWL.LIZ());
        if (contextM3 == null) {
            return null;
        }
        try {
            int i2 = (int) (64 * contextM3.getResources().getDisplayMetrics().density);
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(contextM3, i);
            tuxIconDrawable.LJII(i2);
            tuxIconDrawable.LJ(i2);
            c098200Yq = C376710Epp.LIZIZ(tuxIconDrawable);
            if (c098200Yq == null) {
                c098200Yq = null;
            } else {
                concurrentHashMap.put(Integer.valueOf(i), (Bitmap) c098200Yq);
                LJFF.add((Bitmap) c098200Yq);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Bitmap) obj;
    }

    public static int LIZIZ(String str) {
        Resources resources;
        Context contextM3 = C786410Ut5.M3(C1BWL.LIZ());
        if (contextM3 == null || (resources = contextM3.getResources()) == null) {
            return 0;
        }
        String packageName = contextM3.getPackageName();
        int iN3 = C786410Ut5.n3(resources, str, "raw", packageName);
        if (iN3 == 0) {
            return C786410Ut5.n3(resources, str, "drawable", packageName);
        }
        return iN3;
    }

    public static String LIZJ(int i) {
        Object c098200Yq;
        Resources resources;
        Object obj = null;
        try {
            Context contextM3 = C786410Ut5.M3(C1BWL.LIZ());
            if (contextM3 != null && (resources = contextM3.getResources()) != null) {
                c098200Yq = resources.getResourceEntryName(i);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str = (String) obj;
        if (str == null) {
            return "res_" + i;
        }
        return str;
    }

    public static final boolean LIZLLL(C814730Vxf c814730Vxf) {
        boolean z;
        C814840Vxq c814840Vxq;
        String str;
        if (c814730Vxf != null && (c814840Vxq = c814730Vxf.extra) != null && (str = c814840Vxq.rightFallbackResName) != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
