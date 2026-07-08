package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988580bpg {
    public static int LIZ(Context context, Aweme aweme) {
        AmazonCheckoutAdModel amazonCheckoutData;
        int iLJI = C1022030chd.LJI(context, aweme);
        if (C1017070cZd.LLJILJIL(aweme)) {
            return C475630Ikz.LIZIZ(R.attr.a04, context);
        }
        if (C1017070cZd.LLD(aweme)) {
            return C1022030chd.LJIIJJI(context, aweme);
        }
        if (!C1017070cZd.LJJLJ(aweme)) {
            return iLJI;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String backgroundColor = null;
        if (awemeRawAd != null) {
            amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
        } else {
            amazonCheckoutData = null;
        }
        C1001020c9k.LIZ.getClass();
        AmazonCtaButtonStyle amazonCtaButtonStyleLIZIZ = C1001020c9k.LIZIZ(amazonCheckoutData);
        if (amazonCtaButtonStyleLIZIZ != null) {
            backgroundColor = amazonCtaButtonStyleLIZIZ.getBackgroundColor();
        }
        Integer numLJFF = C1001020c9k.LJFF(backgroundColor);
        if (numLJFF == null) {
            return iLJI;
        }
        return numLJFF.intValue();
    }

    public static String LIZIZ(Context context, Aweme aweme) {
        String strLJJI;
        String text;
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        AmazonCheckoutAdModel amazonCheckoutData = null;
        if (interfaceC1000280c8YLIZ != null) {
            strLJJI = interfaceC1000280c8YLIZ.LJJI(context, aweme);
        } else {
            strLJJI = null;
        }
        if (C1017070cZd.LLJILJIL(aweme)) {
            return C1017070cZd.LJJIIZ(aweme);
        }
        if (C1017070cZd.LLD(aweme)) {
            return C1017070cZd.LJJIFFI(aweme);
        }
        if (!C1017070cZd.LJJLJ(aweme)) {
            return strLJJI;
        }
        C1001020c9k c1001020c9k = C1001020c9k.LIZ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
        }
        c1001020c9k.getClass();
        AmazonCtaButtonStyle amazonCtaButtonStyleLIZIZ = C1001020c9k.LIZIZ(amazonCheckoutData);
        if (amazonCtaButtonStyleLIZIZ == null || (text = amazonCtaButtonStyleLIZIZ.getText()) == null) {
            return strLJJI;
        }
        return text;
    }

    public static Integer LIZJ(Context context, Aweme aweme) {
        AmazonCheckoutAdModel amazonCheckoutData;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.ee, context);
        if (C1017070cZd.LJJLJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String textColor = null;
            if (awemeRawAd != null) {
                amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
            } else {
                amazonCheckoutData = null;
            }
            C1001020c9k.LIZ.getClass();
            AmazonCtaButtonStyle amazonCtaButtonStyleLIZIZ = C1001020c9k.LIZIZ(amazonCheckoutData);
            if (amazonCtaButtonStyleLIZIZ != null) {
                textColor = amazonCtaButtonStyleLIZIZ.getTextColor();
            }
            Integer numLJFF = C1001020c9k.LJFF(textColor);
            if (numLJFF != null) {
                return numLJFF;
            }
        }
        return numLIZ;
    }
}
