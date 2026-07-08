package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694810RNf {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        boolean z;
        boolean z2;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && aweme.getIsTikTokStory()) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null && aweme2.isSubOnlyVideo()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }
}
