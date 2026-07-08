package X;

import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0SCS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SCS {
    public static final boolean LIZ(VideoItemParams videoItemParams) {
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams == null) {
            return false;
        }
        int i = BubbleListAssem.LLLI;
        if (!C0ROI.LIZIZ(baseFeedPageParams, videoItemParams.getAweme(), null)) {
            return false;
        }
        C698840Rb8 c698840Rb8 = C698840Rb8.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c698840Rb8.getClass();
        if (C698840Rb8.LIZ(aweme, true)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        User author;
        AwemeRawAd awemeRawAd;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || C1017070cZd.LLIIJLIL(aweme) || !AwemeExtKt.isAdTraffic(aweme) || (author = aweme.getAuthor()) == null || !author.isAdFake() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isShowPhotoModeSlideHint()) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && awemeRawAd2.getFakeAuthor() != null) {
            return false;
        }
        return true;
    }
}
