package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.OverlayNativeConfig;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;

/* JADX INFO: renamed from: X.0cE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003680cE2 {
    public static final int LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OverlayNativeConfig overlayNativeConfig;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (overlayNativeConfig = awemeRawAd.getOverlayNativeConfig()) == null) {
            return 0;
        }
        return overlayNativeConfig.backgroundStyleType;
    }

    public static final String LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OverlayNativeConfig overlayNativeConfig;
        boolean z = false;
        if (aweme != null && aweme.isAd()) {
            z = true;
        }
        if (!z || (awemeRawAd = aweme.getAwemeRawAd()) == null || (overlayNativeConfig = awemeRawAd.getOverlayNativeConfig()) == null) {
            return null;
        }
        return overlayNativeConfig.closeText;
    }

    public static final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OverlayNativeConfig overlayNativeConfig;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (overlayNativeConfig = awemeRawAd.getOverlayNativeConfig()) == null) {
            return false;
        }
        return overlayNativeConfig.autoPlay;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(aweme);
        if (previewData == null || !previewData.inPublishing) {
            return false;
        }
        return true;
    }
}
