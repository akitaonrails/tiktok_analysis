package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694840RNi {
    public static boolean LIZ(C690870R8b c690870R8b) {
        String from;
        C2189821An6 c2189821An6;
        if (C298520Bn0.LIZ()) {
            BaseFeedPageParams baseFeedPageParams = c690870R8b.LJ;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                from = c2189821An6.getFrom();
            } else {
                from = null;
            }
            if (Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_TOP_LIST")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        StoryHighlightCollection storyHighlightCollection;
        StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
        if (storyHighlightInfo != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null && storyHighlightCollection.collectionCoverUrl != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection;
        if (LIZ(c690870R8b) && (storyHighlightInfo = videoItemParams.getAweme().storyHighlightInfo) != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null && storyHighlightCollection.title != null) {
            return true;
        }
        return false;
    }
}
