package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import com.ss.android.ugc.aweme.commercialize.model.IAdAwemeService;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpTriggerType;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.settings.AdTestCheckUrlSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0d6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037700d6u {
    public static final C1037700d6u LIZ = new C1037700d6u();

    public static final AdLandingPageConfig LIZIZ() {
        String strLIZLLL;
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZJ() == null || (strLIZLLL = C1040370dBD.LIZLLL()) == null) {
            return null;
        }
        return (AdLandingPageConfig) GsonProtectorUtils.fromJson(new Gson(), strLIZLLL, AdLandingPageConfig.class);
    }

    public static String LIZ(String str) {
        String str2;
        AdTestCheckUrlSettings.AdTestCheckUrlConfig adTestCheckUrlConfig = (AdTestCheckUrlSettings.AdTestCheckUrlConfig) AdTestCheckUrlSettings.LIZIZ.getValue();
        if (adTestCheckUrlConfig != null && adTestCheckUrlConfig.enable) {
            str2 = "crossPlatform,adtest";
        } else {
            str2 = "crossPlatform";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target_handler");
        sbLIZ.append('=');
        sbLIZ.append(str2);
        if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
            return str;
        }
        if (a0.LJJIJ(str, '?')) {
            int iLJJJ = a0.LJJJ(str, "#", 0, false, 6);
            if (iLJJJ != -1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str.substring(0, iLJJJ));
                sbLIZ2.append('&');
                sbLIZ2.append("business_from");
                sbLIZ2.append("=ad&");
                sbLIZ2.append("target_handler");
                sbLIZ2.append('=');
                sbLIZ2.append(str2);
                sbLIZ2.append(str.substring(iLJJJ));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append('&');
            sbLIZ3.append("target_handler");
            sbLIZ3.append('=');
            sbLIZ3.append(str2);
            sbLIZ3.append('&');
            sbLIZ3.append("business_from");
            sbLIZ3.append("=ad");
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append('?');
        sbLIZ4.append("target_handler");
        sbLIZ4.append('=');
        sbLIZ4.append(str2);
        sbLIZ4.append('&');
        sbLIZ4.append("business_from");
        sbLIZ4.append("=ad");
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static float LIZJ(C1035880d3y c1035880d3y) {
        int sheetRatio;
        Integer numValueOf;
        AwemeRawAd awemeRawAd;
        if (c1035880d3y != null) {
            sheetRatio = c1035880d3y.getSheetRatio();
        } else {
            sheetRatio = 0;
        }
        AutoPullUpConfig autoPullUpConfigLIZIZ = null;
        AwemeRawAd awemeRawAd2 = null;
        IAdAwemeService iAdAwemeService = (IAdAwemeService) PluggableExtentionKt.pluggableSpi$default(IAdAwemeService.class, false, false, false, 14, null);
        String refer = null;
        if (iAdAwemeService != null) {
            if (c1035880d3y != null) {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            numValueOf = Integer.valueOf(iAdAwemeService.LIZ(awemeRawAd));
            if (c1035880d3y != null) {
                awemeRawAd2 = c1035880d3y.getAwemeRawAd();
            }
            autoPullUpConfigLIZIZ = iAdAwemeService.LIZIZ(awemeRawAd2);
        } else {
            numValueOf = null;
        }
        int value = AutoPullUpTriggerType.PROFILE_INITIAL.getValue();
        if (numValueOf != null && numValueOf.intValue() == value && autoPullUpConfigLIZIZ != null && Intrinsics.LJFF(autoPullUpConfigLIZIZ.getUseEmbeddedSheet(), Boolean.TRUE)) {
            if (c1035880d3y != null) {
                refer = c1035880d3y.getRefer();
            }
            if (Intrinsics.LJFF(refer, "homepage_ad_half_to_full_screen_landing_page")) {
                return C1037720d6w.LIZ.exposurePivOnOtherPercent / 0.6f;
            }
        }
        if (sheetRatio <= 50) {
            return C1037720d6w.LIZ.exposurePivOnThreePercent;
        }
        return C1037720d6w.LIZ.exposurePivOnOtherPercent;
    }

    public static int LIZLLL(AwemeRawAd awemeRawAd) {
        NativeAuthorInfo nativeAuthorInfo;
        int iLIZ;
        if (awemeRawAd != null) {
            nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo();
        } else {
            nativeAuthorInfo = null;
        }
        if (nativeAuthorInfo == null) {
            return 0;
        }
        IAdAwemeService iAdAwemeService = (IAdAwemeService) PluggableExtentionKt.pluggableSpi$default(IAdAwemeService.class, false, false, false, 14, null);
        if (iAdAwemeService != null && (iLIZ = iAdAwemeService.LIZ(awemeRawAd)) != 0) {
            return iLIZ;
        }
        return 2;
    }
}
