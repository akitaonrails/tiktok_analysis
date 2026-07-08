package X;

import com.ss.android.ugc.aweme.story.StoryDelayPublishData;

/* JADX INFO: renamed from: X.0Mbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571860Mbo {
    public static final StoryDelayPublishData LIZ;

    static {
        StoryDelayPublishData storyDelayPublishData = new StoryDelayPublishData(false, false, 0L, 1500L, 0L, false);
        StoryDelayPublishData storyDelayPublishData2 = (StoryDelayPublishData) C0C64.LJIILLIIL().LJJII(StoryDelayPublishData.class, storyDelayPublishData, "story_delay_publish_exp", true);
        if (storyDelayPublishData2 != null) {
            storyDelayPublishData = storyDelayPublishData2;
        }
        LIZ = storyDelayPublishData;
    }
}
