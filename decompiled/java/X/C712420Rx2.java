package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712420Rx2 {
    public static boolean LIZ(Aweme aweme) {
        InteractPermission interactPermission;
        InteractionPermission allowStorySwitchToPost;
        Story story;
        if (aweme != null && (interactPermission = aweme.getInteractPermission()) != null && (allowStorySwitchToPost = interactPermission.getAllowStorySwitchToPost()) != null && allowStorySwitchToPost.status == 0 && (story = aweme.getStory()) != null && StoryKt.isExpired(story)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoItemParams videoItemParams, String str) {
        String from;
        C2189821An6 c2189821An6;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        if (Intrinsics.LJFF(from, "STORY_ENTRANCE_ARCHIVE")) {
            return Intrinsics.LJFF(videoItemParams.getAweme().getAid(), str);
        }
        return true;
    }
}
