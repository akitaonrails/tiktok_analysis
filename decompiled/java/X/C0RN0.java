package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RN0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RN0 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        String from;
        C2189821An6 c2189821An6;
        if (C298510Bmz.LIZ()) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                from = c2189821An6.getFrom();
            } else {
                from = null;
            }
            if (Intrinsics.LJFF(from, "STORY_ENTRANCE_MUSIC_COVER_AVATAR")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
