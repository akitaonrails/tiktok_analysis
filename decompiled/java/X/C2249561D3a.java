package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcSvReEngageRecommendationParamsAdsConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcSvReEngageRecommendationParamsConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS369S0200000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249561D3a {
    public static final C2249561D3a LIZ = new C2249561D3a();

    public static boolean LIZIZ(boolean z) {
        if (z) {
            if (C1D3Y.LIZ() != C1D3V.DISABLED) {
                return true;
            }
            return false;
        }
        if (C1D3Z.LIZ() != C1D3W.DISABLED) {
            return true;
        }
        return false;
    }

    public static int LIZLLL(String str) {
        Integer numLJIIJJI;
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return 0;
    }

    public static boolean LIZJ(Map map, JSONObject jSONObject, boolean z) {
        if (!LIZIZ(z)) {
            return false;
        }
        if (z) {
            C1D3V c1d3vLIZ = C1D3Y.LIZ();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcSvReEngageRecommendationParamsAdsConfig ecSvReEngageRecommendationParamsAdsConfig = C2249571D3b.LIZ;
            EcSvReEngageRecommendationParamsAdsConfig ecSvReEngageRecommendationParamsAdsConfig2 = (EcSvReEngageRecommendationParamsAdsConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_re_engage_recommendation_params_ads", EcSvReEngageRecommendationParamsAdsConfig.class, ecSvReEngageRecommendationParamsAdsConfig);
            if (ecSvReEngageRecommendationParamsAdsConfig2 != null) {
                ecSvReEngageRecommendationParamsAdsConfig = ecSvReEngageRecommendationParamsAdsConfig2;
            }
            AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3(jSONObject, map, 17);
            int iLIZLLL = LIZLLL((String) awS369S0200000_3.invoke("has_submitted_order"));
            if (c1d3vLIZ != C1D3V.DISABLED && (!ecSvReEngageRecommendationParamsAdsConfig.isOrderSubmitRequired || iLIZLLL == 0)) {
                int i = C1D3X.LIZIZ[c1d3vLIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new C1954807lC();
                        }
                    } else {
                        return LIZ(ecSvReEngageRecommendationParamsAdsConfig.minSameVideoVisitCount, ecSvReEngageRecommendationParamsAdsConfig.minPDPStayDuration, awS369S0200000_3, ecSvReEngageRecommendationParamsAdsConfig.isScrollingRequired);
                    }
                } else {
                    return true;
                }
            }
        } else {
            C1D3W c1d3wLIZ = C1D3Z.LIZ();
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            EcSvReEngageRecommendationParamsConfig ecSvReEngageRecommendationParamsConfig = C2249581D3c.LIZ;
            EcSvReEngageRecommendationParamsConfig ecSvReEngageRecommendationParamsConfig2 = (EcSvReEngageRecommendationParamsConfig) settingsManagerLIZLLL2.LJIIIIZZ("ec_sv_re_engage_recommendation_params", EcSvReEngageRecommendationParamsConfig.class, ecSvReEngageRecommendationParamsConfig);
            if (ecSvReEngageRecommendationParamsConfig2 != null) {
                ecSvReEngageRecommendationParamsConfig = ecSvReEngageRecommendationParamsConfig2;
            }
            AwS369S0200000_3 awS369S0200000_32 = new AwS369S0200000_3(jSONObject, map, 16);
            int iLIZLLL2 = LIZLLL((String) awS369S0200000_32.invoke("has_submitted_order"));
            if (c1d3wLIZ == C1D3W.DISABLED || (ecSvReEngageRecommendationParamsConfig.isOrderSubmitRequired && iLIZLLL2 != 0)) {
                return false;
            }
            int i2 = C1D3X.LIZ[c1d3wLIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                } else {
                    return LIZ(ecSvReEngageRecommendationParamsConfig.minSameVideoVisitCount, ecSvReEngageRecommendationParamsConfig.minPDPStayDuration, awS369S0200000_32, ecSvReEngageRecommendationParamsConfig.isScrollingRequired);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZ(int i, long j, Function1 function1, boolean z) {
        boolean z2;
        long jLongValue;
        boolean z3;
        boolean z4;
        boolean z5;
        Long lLJIILIIL;
        if (LIZLLL((String) function1.invoke("is_cta_triggered")) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = (String) function1.invoke("duration_ms");
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue >= j) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (LIZLLL((String) function1.invoke("has_scrolled")) > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (LIZLLL((String) function1.invoke("same_video_visit_count")) >= i) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z) {
            z4 = false;
        }
        if (z2 || z3 || z4 || z5) {
            return true;
        }
        return false;
    }
}
