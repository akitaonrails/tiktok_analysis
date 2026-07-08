package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21273918Nd {
    public static final Boolean LIZIZ(Aweme aweme) {
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) == null || !Intrinsics.LJFF(shopAnchorSellingPoints.isRealBoost(), Boolean.TRUE)) {
            return null;
        }
        return Boolean.valueOf(shopAnchorSellingPoints.getEnableQcpxBoost());
    }

    public static final void LIZ(AbstractC1056160dag abstractC1056160dag, Aweme aweme) {
        int videoLength;
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        Video video;
        int showTime = 0;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            videoLength = video.getVideoLength();
        } else {
            videoLength = 0;
        }
        abstractC1056160dag.LIZ(Integer.valueOf(videoLength), "video_length");
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (C18NF.LIZ(awemeRawAd)) {
            if (awemeRawAd != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
                showTime = shopAnchorSellingPoints.getShowTime();
            }
        } else {
            showTime = C21276218Oa.LIZ().delayShowSubtitle;
        }
        abstractC1056160dag.LIZ(Integer.valueOf(showTime * LSPassThroughRecordSizeConfig.DEFAULT), "second_line_show_time");
    }
}
