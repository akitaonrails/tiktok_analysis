package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694400RLq {
    public static boolean LIZ(C690870R8b c690870R8b) {
        String from;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        C2189821An6 c2189821An62;
        BaseFeedPageParams baseFeedPageParams = c690870R8b.LJ;
        if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            from = c2189821An62.getFrom();
        } else {
            from = null;
        }
        if (!Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_GROUP_CHAT")) {
            BaseFeedPageParams baseFeedPageParams2 = c690870R8b.LJ;
            if (baseFeedPageParams2 != null && (c2189821An6 = baseFeedPageParams2.param) != null && (navArgModel = c2189821An6.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel.getStoryIsFromGroupChatSingleAvatar(), Boolean.TRUE)) {
                return true;
            }
            return C0BWW.LIZ();
        }
        return true;
    }

    public static boolean LIZIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        String from;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        DetailNavArgModel navArgModel;
        C2189821An6 c2189821An63;
        BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
        String from2 = null;
        if (baseFeedPageParams2 != null && (c2189821An63 = baseFeedPageParams2.param) != null) {
            from = c2189821An63.getFrom();
        } else {
            from = null;
        }
        if (Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_GROUP_CHAT") || ((baseFeedPageParams = videoItemParams.baseFeedPageParams) != null && (c2189821An62 = baseFeedPageParams.param) != null && (navArgModel = c2189821An62.getNavArgModel()) != null && Intrinsics.LJFF(navArgModel.getStoryIsFromGroupChatSingleAvatar(), Boolean.TRUE))) {
            if (!C729980SkG.LJIIIIZZ(videoItemParams.getAweme()) && !C10EU.LJIIJJI(videoItemParams.getAweme()) && !C10EU.LJIILL(videoItemParams.getAweme().getAuthor(), false)) {
                return true;
            }
            return false;
        }
        if (LIZ(c690870R8b) && C10EU.LJIILJJIL(videoItemParams.getAweme().getAuthor())) {
            String[] strArr = C0RMB.LJ;
            BaseFeedPageParams baseFeedPageParams3 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams3 != null && (c2189821An6 = baseFeedPageParams3.param) != null) {
                from2 = c2189821An6.getFrom();
            }
            if (C13LQ.LJJIJIIJI(from2, strArr) >= 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
