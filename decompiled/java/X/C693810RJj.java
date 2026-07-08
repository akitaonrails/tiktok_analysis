package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0RJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693810RJj {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        String uid;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme.getIsTikTokStory() && !AwemeExtKt.canShareToStory(aweme)) {
            return false;
        }
        User userLIZ = C10EU.LIZ();
        if (userLIZ != null) {
            uid = userLIZ.getUid();
        } else {
            uid = null;
        }
        if (!C729510SjV.LJJJJL(videoItemParams.getAweme(), uid) || !C729510SjV.LJJIJIL(videoItemParams.getAweme())) {
            return false;
        }
        return true;
    }
}
