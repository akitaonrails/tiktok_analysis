package X;

import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RV4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RV4 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        if (C0ST8.LIZJ(videoItemParams.getAweme()) <= 1) {
            return false;
        }
        if (!AwemeExtKt.isAdTraffic(videoItemParams.getAweme())) {
            return true;
        }
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(videoItemParams.getAweme());
        if (awemeRawAdLJJIJLIJ == null || (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) == null || !photoCarouselInfo.enableIndicatorSlide()) {
            return false;
        }
        return true;
    }
}
