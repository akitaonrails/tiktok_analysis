package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;

/* JADX INFO: renamed from: X.0dOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048560dOQ {
    public static final String LIZ(AwemeRawAd awemeRawAd) {
        Integer styleType;
        if (awemeRawAd == null || awemeRawAd.getCommerceAceSurveyInfo() == null) {
            return null;
        }
        CommerceAceSurveyInfo commerceAceSurveyInfo = awemeRawAd.getCommerceAceSurveyInfo();
        if (commerceAceSurveyInfo != null && (styleType = commerceAceSurveyInfo.getStyleType()) != null && styleType.intValue() == 0) {
            return "style1";
        }
        return "style2";
    }
}
