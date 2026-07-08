package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694830RNh {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        C728030Sh7.LIZ.getClass();
        if (C728030Sh7.LIZ() && !Intrinsics.LJFF(videoItemParams.mFrom, "STORY_ENTRANCE_HIGHLIGHTS")) {
            StoryHighlightInfo storyHighlightInfo = videoItemParams.getAweme().storyHighlightInfo;
            if (storyHighlightInfo == null || storyHighlightInfo.primaryCollectionInfo == null) {
                StoryHighlightInfo storyHighlightInfo2 = videoItemParams.getAweme().storyHighlightInfo;
                if (storyHighlightInfo2 != null && storyHighlightInfo2.containerCollectionInfo != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
