package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionClickInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0d49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035990d49 {
    public static AiAgentConfig LIZ(C1035880d3y c1035880d3y) {
        boolean z;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        AwemeRawAd awemeRawAd2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoCarouselProductStruct> productList;
        AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
        boolean z2 = true;
        if (awemeRawAd3 != null && (photoCarouselInfo2 = awemeRawAd3.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo2.getProductList()) != null && !productList.isEmpty()) {
            Iterator<PhotoCarouselProductStruct> it2 = productList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getBotConfig() != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if ((c1035880d3y.getAwemeRawAd() == null || ((awemeRawAd2 = c1035880d3y.getAwemeRawAd()) != null && awemeRawAd2.getEnableJumpToProduct() == 0)) && ((awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || !photoCarouselInfo.getEnableMultiCTAJump() || !Intrinsics.LJFF(c1035880d3y.getRefer(), "draw_ad_button"))) {
            z2 = false;
        }
        BotConfig botConfig = null;
        if (z2 || (z && c1035880d3y.isFromJsb())) {
            return null;
        }
        AwemeRawAd awemeRawAd4 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            botConfig = awemeRawAd4.getBotConfig();
        }
        return new AiAgentConfig(false, null, botConfig);
    }

    public static boolean LIZIZ(String str) {
        if (!((Boolean) C0AU9.LIZ.getValue()).booleanValue() || str == null || a0.LJJJIL(str) || !u.LJJIIJZLJL(str, "data:text/html", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(FeatureCenterModel featureCenterModel) {
        Integer num;
        if (featureCenterModel != null && (num = featureCenterModel.iabRecordingType) != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJ(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null && creativeId.longValue() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(String str) {
        if (C123100dR.LIZ(str) && Intrinsics.LJFF(str, "about:blank")) {
            return true;
        }
        return false;
    }

    public static boolean LJI(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str.toLowerCase(Locale.getDefault()), "http://", false) || u.LJJIIJZLJL(str.toLowerCase(Locale.getDefault()), "https://", false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJII(C1035880d3y c1035880d3y) {
        String creativeIdStr;
        SessionShowInfo sessionShowInfo;
        SessionClickInfo sessionClickInfo;
        if (c1035880d3y == null) {
            return;
        }
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        Long lValueOf = null;
        if (awemeRawAd != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        C1022670cif c1022670cif = C1022670cif.LIZ;
        if (creativeIdStr == null) {
            creativeIdStr = CardStruct.IStatusCode.DEFAULT;
        }
        c1022670cif.getClass();
        SessionInfo sessionInfoLIZJ = C1022670cif.LIZJ(creativeIdStr);
        C1035890d3z adCommonData = c1035880d3y.getAdCommonData();
        if (sessionInfoLIZJ != null && (sessionShowInfo = sessionInfoLIZJ.showSession) != null && (sessionClickInfo = sessionShowInfo.clickSession) != null) {
            lValueOf = Long.valueOf(sessionClickInfo.timeStamp);
        }
        adCommonData.setClickTimeStamp(lValueOf);
    }

    public static String LIZLLL(String str, C1035880d3y c1035880d3y, Function1 function1) {
        String lpRefer;
        String realCreativeIdStr;
        int iIsNineScreen;
        String requestId;
        try {
            n nVar = new n();
            C2274521E1a.LIZ.getClass();
            nVar.LJJIIJ(C2274521E1a.LJJJJZI.LIZ, str);
            String str2 = C2274521E1a.LJJIIZ.LIZ;
            String str3 = "";
            if (c1035880d3y == null || (lpRefer = c1035880d3y.getLpRefer()) == null) {
                lpRefer = "";
            }
            nVar.LJJIIJ(str2, lpRefer);
            if (c1035880d3y != null) {
                realCreativeIdStr = c1035880d3y.getRealCreativeIdStr();
            } else {
                realCreativeIdStr = null;
            }
            nVar.LJJIIJ("creative_id", realCreativeIdStr);
            if (c1035880d3y != null && (requestId = c1035880d3y.getRequestId()) != null) {
                str3 = requestId;
            }
            nVar.LJJIIJ("request_id", str3);
            if (c1035880d3y != null) {
                iIsNineScreen = c1035880d3y.isNineScreen();
            } else {
                iIsNineScreen = 0;
            }
            nVar.LJJIII(Integer.valueOf(iIsNineScreen), "landing_page_style");
            function1.invoke(nVar);
            return nVar.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "error";
        }
    }
}
