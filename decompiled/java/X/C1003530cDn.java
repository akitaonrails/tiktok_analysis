package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.OverlayNativeConfig;

/* JADX INFO: renamed from: X.0cDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003530cDn implements InterfaceC1003550cDp {
    public static final String LIZ(Aweme aweme) {
        if (!TextUtils.isEmpty(C1003680cE2.LIZIZ(aweme))) {
            return C1003680cE2.LIZIZ(aweme);
        }
        return C1BWL.LIZJ().getString(2131834545);
    }

    public static final String LIZIZ(Aweme aweme) {
        OverlayNativeConfig overlayNativeConfig;
        String str;
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (overlayNativeConfig = awemeRawAd.getOverlayNativeConfig()) == null || (str = overlayNativeConfig.descText) == null) {
                return aweme.getDesc();
            }
            return str;
        }
        return null;
    }
}
