package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RZH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZH {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        if (videoItemParams.getAweme() == null || (((aweme = videoItemParams.getAweme()) != null && aweme.isAd() && aweme.getAwemeRawAd() != null) || AwemeExtKt.isHotSearchAweme(videoItemParams.getAweme()) || AwemeExtKt.isHotVideoAweme(videoItemParams.getAweme()))) {
            return false;
        }
        return true;
    }
}
