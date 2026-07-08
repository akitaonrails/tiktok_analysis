package X;

import android.net.Uri;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.EcomBcmTrack;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0csD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028590csD {
    public static final String LIZ(int i, Aweme aweme, String str) {
        String lowerCase;
        boolean zIsSponsored;
        String str2;
        String btmPageId;
        EcomBcmTrack ecomBcmTrack;
        BcmStandardTrack bcmStandardTrack;
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        Map<String, String> map = null;
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.getDefault());
        } else {
            lowerCase = null;
        }
        if (!C13LP.LJJJJ(lowerCase, C13LQ.LJLIIL(new String[]{"aweme", "snssdk1180", "snssdk1123", "sslocal"}))) {
            return str;
        }
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ != null) {
            zIsSponsored = awemeRawAdLJJIJLIJ.isSponsored();
        } else {
            zIsSponsored = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zIsSponsored);
        if (i != 1) {
            if (i != 8) {
                if (i != 70) {
                    return str;
                }
                str2 = "c56482.d0";
            } else {
                str2 = "c04171.d75792";
            }
        } else {
            Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
            str2 = "c6053.d2507";
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (btmPageId = awemeRawAd.getBtmPageId()) != null && btmPageId.length() != 0) {
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = str2;
            c21244318Bt.LIZIZ = PageFinder.via(btmPageId);
            C212367188v c212367188v = BcmParams.Companion;
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (ecomBcmTrack = awemeRawAd2.getEcomBcmTrack()) != null && (bcmStandardTrack = ecomBcmTrack.singleProduct) != null) {
                map = bcmStandardTrack.chainParam;
            }
            c212367188v.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZJ(map);
            return uri.buildUpon().appendQueryParameter("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt)).build().toString();
        }
        return str;
    }
}
