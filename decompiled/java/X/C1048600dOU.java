package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.AceSurveyUserConvert;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048600dOU {
    public static final CommerceAceSurveyInfo LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getCommerceAceSurveyInfo();
        }
        return null;
    }

    public static final String LIZJ(Aweme aweme) {
        AceSurveyUserConvert userConvert;
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ = LIZIZ(aweme);
        if (commerceAceSurveyInfoLIZIZ != null && (userConvert = commerceAceSurveyInfoLIZIZ.getUserConvert()) != null) {
            return userConvert.getCid();
        }
        return null;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        Map<String, AnoleComponentRelationModel> map;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map2;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        boolean z = false;
        if (awemeRawAdLJJIJLIJ == null) {
            return false;
        }
        AnoleModel anoleModel2 = awemeRawAdLJJIJLIJ.getAnoleModel();
        if (anoleModel2 != null && (map = anoleModel2.componentRelations) != null && map.get(EnumC1008920cMU.EXTEND_LAYER.getType()) != null && (anoleModel = awemeRawAdLJJIJLIJ.getAnoleModel()) != null && (map2 = anoleModel.components) != null && map2.get(EnumC1008920cMU.EXTEND_LAYER.getType()) != null) {
            z = true;
        }
        return Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE);
    }

    public static final boolean LJ(Aweme aweme) {
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ;
        Integer styleType;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (commerceAceSurveyInfoLIZIZ = LIZIZ(aweme)) != null && (styleType = commerceAceSurveyInfoLIZIZ.getStyleType()) != null && styleType.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final C1048930dP1 LIZ(int i, Aweme aweme, String str) {
        CommerceAceSurveyInfo commerceAceSurveyInfoLIZIZ;
        Long adId;
        String logExtra;
        String strLJIILL;
        String str2;
        Long creativeId = null;
        if (aweme == null || (commerceAceSurveyInfoLIZIZ = LIZIZ(aweme)) == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            adId = awemeRawAd.getAdId();
        } else {
            adId = null;
        }
        String strValueOf = String.valueOf(adId);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            creativeId = awemeRawAd2.getCreativeId();
        }
        String strValueOf2 = String.valueOf(creativeId);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        String str3 = "";
        if (awemeRawAd3 == null || (logExtra = awemeRawAd3.getLogExtra()) == null) {
            logExtra = "";
        }
        try {
            strLJIILL = new Gson().LJIILL(commerceAceSurveyInfoLIZIZ.getUserConvert());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            strLJIILL = "";
        }
        String brandName = commerceAceSurveyInfoLIZIZ.getBrandName();
        if (brandName != null) {
            str3 = brandName;
        }
        String strValueOf3 = String.valueOf(i);
        Integer styleType = commerceAceSurveyInfoLIZIZ.getStyleType();
        if (styleType != null && styleType.intValue() == 0) {
            str2 = "5";
        } else {
            str2 = "6";
        }
        return new C1048930dP1(strValueOf, strValueOf2, logExtra, strLJIILL, str3, strValueOf3, str2, str, String.valueOf(commerceAceSurveyInfoLIZIZ.getSendNoticeTime()));
    }
}
