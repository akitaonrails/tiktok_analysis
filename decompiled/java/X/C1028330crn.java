package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0crn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028330crn {
    public static LandingPageSurveyModel LIZIZ;
    public static C1028340cro LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static final C1028330crn LIZ = new C1028330crn();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(465));
    public static final C01GW LJI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(436));
    public static final C01GW LJII = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(437));

    public static Keva LIZIZ() {
        return (Keva) LJFF.getValue();
    }

    public static Pair LIZ(LandingPageSurveyModel landingPageSurveyModel) {
        String str;
        if (landingPageSurveyModel == null) {
            return new Pair(Boolean.FALSE, new C1028180crY("landingPageSurvey error null"));
        }
        if (landingPageSurveyModel.enableLandingPageSurvey && landingPageSurveyModel.schemaUrl.length() != 0) {
            if (landingPageSurveyModel.skipSurveyIfSubmitted == 1 && (str = landingPageSurveyModel.surveyId) != null && str.length() != 0 && ((Set) LJII.getValue()).contains(str)) {
                return new Pair(Boolean.FALSE, new C1028180crY("survey already submitted"));
            }
            long jLongValue = 0;
            if (LIZLLL == 0 && landingPageSurveyModel.showSurveyInLoading != 1) {
                return new Pair(Boolean.FALSE, new C1028180crY("page do not load finish"));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - LIZLLL <= landingPageSurveyModel.pageDwellTime) {
                return new Pair(Boolean.FALSE, new C1028180crY("stay time not enough"));
            }
            String str2 = landingPageSurveyModel.surveyId;
            if (str2 != null && str2.length() != 0) {
                Long l = (Long) ((Map) LJI.getValue()).get(str2);
                if (l != null) {
                    jLongValue = l.longValue();
                }
            } else {
                jLongValue = LIZIZ().getLong("ad_land_last_show_time", 0L);
            }
            if (jCurrentTimeMillis - jLongValue <= landingPageSurveyModel.showSurveyTimeInterval) {
                return new Pair(Boolean.FALSE, new C1028180crY("showSurveyTimeInterval not enough"));
            }
            return new Pair(Boolean.TRUE, null);
        }
        Boolean bool = Boolean.FALSE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableLandingPageSurvey or schemaUrl error enableLandingPageSurvey = ");
        sbLIZ.append(landingPageSurveyModel.enableLandingPageSurvey);
        sbLIZ.append(" schemaUrl = ");
        sbLIZ.append(landingPageSurveyModel.schemaUrl);
        return new Pair(bool, new C1028180crY(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static void LIZLLL(long j, String str) {
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            Long lValueOf = Long.valueOf(j);
            C01GW c01gw = LJI;
            ((Map) c01gw.getValue()).put(str, lValueOf);
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Map map = (Map) c01gw.getValue();
                c1227904rF.getClass();
                c098200Yq = C1227904rF.LJI(map);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 != null) {
                LIZ.getClass();
                LIZIZ().storeString("ad_land_survey_show_time_map", str2);
                return;
            }
            return;
        }
        LIZIZ().storeLong("ad_land_last_show_time", j);
    }

    public static void LIZJ(Activity activity, String str, final Function0 function0, EnumC993340bxM enumC993340bxM) throws JSONException {
        String str2;
        String str3;
        String str4;
        String groupId;
        String str5;
        String str6;
        String strLIZIZ;
        String str7;
        IAwemeService iAwemeService;
        Aweme awemeFr;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("use_spark", "1");
        Bundle bundle = new Bundle();
        bundle.putBoolean("ad_landing_show_landing_page_survey", true);
        JSONObject jSONObject = new JSONObject();
        C1028340cro c1028340cro = LIZJ;
        String str8 = null;
        if (c1028340cro != null) {
            str2 = c1028340cro.LIZIZ;
        } else {
            str2 = null;
        }
        jSONObject.put("aid", str2);
        C1028340cro c1028340cro2 = LIZJ;
        if (c1028340cro2 != null) {
            str3 = c1028340cro2.LIZJ;
        } else {
            str3 = null;
        }
        jSONObject.put("cid", str3);
        C1028340cro c1028340cro3 = LIZJ;
        if (c1028340cro3 != null) {
            str4 = c1028340cro3.LIZJ;
        } else {
            str4 = null;
        }
        if (str4 != null && str4.length() != 0 && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null && (awemeFr = iAwemeService.Fr(str4)) != null) {
            groupId = awemeFr.getGroupId();
        } else {
            groupId = null;
        }
        jSONObject.put("gid", groupId);
        C1028340cro c1028340cro4 = LIZJ;
        if (c1028340cro4 != null) {
            str5 = c1028340cro4.LIZLLL;
        } else {
            str5 = null;
        }
        jSONObject.put("req_id", str5);
        C1028340cro c1028340cro5 = LIZJ;
        if (c1028340cro5 != null) {
            str6 = c1028340cro5.LJ;
        } else {
            str6 = null;
        }
        jSONObject.put("logExtra", str6);
        C1028340cro c1028340cro6 = LIZJ;
        if (c1028340cro6 != null) {
            strLIZIZ = c1028340cro6.LJFF;
        } else {
            strLIZIZ = null;
        }
        if (Intrinsics.LJFF(strLIZIZ, "draw_ad_button")) {
            String str9 = C1022030chd.LIZLLL;
            String str10 = C1022030chd.LIZJ;
            if (str9 != null && str9.length() != 0 && str10 != null && str10.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str9);
                sbLIZ.append('_');
                sbLIZ.append(str10);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        jSONObject.put("enterFrom", strLIZIZ);
        jSONObject.put("triggerSource", enumC993340bxM.getValue());
        LandingPageSurveyModel landingPageSurveyModel = LIZIZ;
        if (landingPageSurveyModel != null) {
            str7 = landingPageSurveyModel.surveyId;
        } else {
            str7 = null;
        }
        jSONObject.put("survey_id", str7);
        LandingPageSurveyModel landingPageSurveyModel2 = LIZIZ;
        if (landingPageSurveyModel2 != null) {
            str8 = landingPageSurveyModel2.surveyConfig;
        }
        jSONObject.put("survey_config", str8);
        C786410Ut5.LJJJI("initialData", C786410Ut5.J3(jSONObject), bundle);
        C1039050d95 c1039050d95 = new C1039050d95(0);
        C1051290dSp c1051290dSp = new C1051290dSp(EnumC1000680c9C.ONLY_RENDER, "", 0, false, new C1049260dPY("feed_land_page_survey", builderBuildUpon.toString(), bundle, C1014230cV3.LIZ("feed_land_page_survey"), new C1020460cf6(c1039050d95), false, null, false, null, null, null, null, 16352), null, false, false, 476);
        AbstractC1028360crq abstractC1028360crqLIZLLL = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(new C1028380crs("feed_land_page_survey", C0WOV.SPARK, activity, new C1029740cu4(bundle.getString("aweme_creative_id"), bundle.getString("bundle_download_app_log_extra"), bundle.getString("aweme_group_id"), Integer.valueOf(bundle.getInt("charge_type")), Integer.valueOf(bundle.getInt("ad_system_origin")), null, false, 96)), c1051290dSp);
        abstractC1028360crqLIZLLL.LJIIZILJ(new C1039230d9N(c1039050d95));
        abstractC1028360crqLIZLLL.LJIJJ(new C1039010d91(c1039050d95));
        abstractC1028360crqLIZLLL.LJIJ(new C1039100d9A(c1039050d95));
        abstractC1028360crqLIZLLL.LJJIFFI(c1051290dSp, new InterfaceC1051480dT8() { // from class: X.0crp
            @Override // X.InterfaceC1051480dT8
            public final void LIZ() {
            }

            @Override // X.InterfaceC1051480dT8
            public final void LIZIZ() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
    }
}
