package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RKL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKL {
    public static boolean LIZ(Context context, VideoItemParams videoItemParams) {
        Aweme aweme;
        if (videoItemParams == null) {
            return false;
        }
        int i = FeedStoryTagTriggerV2.LLJLIL;
        int i2 = FeedStoryTagTrigger.LLJL;
        if (C0RKM.LIZ(context, videoItemParams.getAweme(), videoItemParams.mEventType) || (aweme = videoItemParams.getAweme()) == null || !C720360SNm.LJIIIIZZ(aweme)) {
            return false;
        }
        return true;
    }
}
