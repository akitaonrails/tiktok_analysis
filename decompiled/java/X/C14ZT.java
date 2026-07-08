package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdSurveyEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZT {
    public static long LIZIZ;
    public static long LIZJ;
    public static final C14ZT LIZ = new C14ZT();
    public static final Keva LIZLLL = Keva.getRepo("repo_multi_survey");
    public static final Map<String, Boolean> LJ = new LinkedHashMap();

    public static String LIZLLL() {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ() == null) {
            return "-1";
        }
        String strLJJIJ = AbstractC848400XPy.LJJIJ();
        return (a0.LJJJIL(strLJJIJ) || strLJJIJ == null) ? "-1" : strLJJIJ;
    }

    public static boolean LJFF(int i) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("optimize_feed_lynx_survey", true)) {
            return true;
        }
        return !C13LQ.LJLIIL(new Integer[]{Integer.valueOf(C14Z5.FORCE_VIDEO_LYNX.getType()), Integer.valueOf(C14Z5.PUSH_BOTTOM_LYNX.getType()), Integer.valueOf(C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()), Integer.valueOf(C14Z5.COMMON_BACKGROUND_LYNX.getType())}).contains(Integer.valueOf(i));
    }

    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String str;
        SurveyInfo surveyInfo;
        if (aweme == null || (surveyInfo = aweme.getSurveyInfo()) == null || (str = surveyInfo.bitParams) == null) {
            str = "";
        }
        if (C123100dR.LIZ(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c2344009Gk.LJFF(next, jSONObject.optString(next, ""));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("multi_survey", "bitparams parse error");
            }
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String aid;
        if (C14Z4.LIZ(aweme) != C14Z0.LIVE_TYPE) {
            return;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String strLJ = LJ(aweme, aid);
        if (strLJ != null) {
            String str = (String) ((ConcurrentHashMap) C0T1K.LIZ.getValue()).get(strLJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getEnterType is invoked and aid is ");
            sbLIZ.append(strLJ);
            sbLIZ.append(" enterType is ");
            sbLIZ.append(str);
            sbLIZ.append('.');
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("LiveRoomEventHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (str == null) {
                c2344009Gk.LJFF("live_entered_type", "unentered");
            } else {
                c2344009Gk.LJFF("live_entered_type", str);
            }
        }
    }

    public static void LIZJ(C2344009Gk c2344009Gk, Option[] optionArr) {
        if (optionArr != null && optionArr.length != 0) {
            c2344009Gk.LJFF("adjust_fyp_options", C13LQ.LJJJ(optionArr, null, null, null, AFwS273S0000000_29.get$arr$(331), 31));
        }
    }

    public static String LJ(Aweme aweme, String str) {
        if (C14Z7.LIZIZ(aweme)) {
            return C20286514Zj.LIZJ(str);
        }
        return str;
    }

    public static final void LJIILIIL(final String str, final Function0<? extends Map<String, String>> function0) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.07xK
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedSurveyMobHelper@b8c6.sendMobOnEventV3Wrapper$1");
                try {
                    C20684815ws.LJIILLIIL(str, function0.invoke());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedSurveyMobHelper@b8c6.sendMobOnEventV3Wrapper$1");
            }
        });
    }

    public static void LJIIL(Aweme aweme, String str, String str2) {
        String aid;
        Integer numValueOf;
        String authorUid;
        String requestId;
        String strLIZ;
        Question[] questionArr;
        Question question;
        int i;
        Map<String, Boolean> map = LJ;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, Boolean.TRUE);
        LIZJ = System.currentTimeMillis();
        Option[] optionArr = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String strLJ = LJ(aweme, aid);
        if (aweme != null) {
            C14Z7 c14z7 = C14Z7.LIZ;
            if (C14ZW.LIZLLL(aweme) == C14Z5.NOT_USE.getType()) {
                i = 1;
            } else {
                i = 0;
            }
            numValueOf = Integer.valueOf(i ^ 1);
        } else {
            numValueOf = null;
        }
        int type = C14Z4.LIZ(aweme).getType();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            requestId = aweme.getRequestId();
            C14ZW.LIZ.getClass();
            strLIZ = C14ZW.LIZ(aweme);
        } else {
            authorUid = null;
            requestId = null;
            strLIZ = null;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        int iLIZIZ = C14ZW.LIZIZ(aweme);
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        String str3 = C0X2A.LIZJ;
        String strLIZLLL = LIZLLL();
        C844470XAv.LIZ.getClass();
        int i2 = C844470XAv.LJIIJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, aweme);
        LIZIZ(c2344009Gk, aweme);
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        if (feedSurveyLJ != null && (questionArr = feedSurveyLJ.questions) != null && (question = questionArr[0]) != null) {
            optionArr = question.options;
        }
        LIZJ(c2344009Gk, optionArr);
        c2344009Gk.LIZJ(C1DD1.LIZJ(), "user_play_num");
        c2344009Gk.LIZJ(LIZLLL.getInt("key_day_aweme_count", 0), "video_play_count");
        C487630JAj c487630JAj = new C487630JAj(c2344009Gk, strLJ, str, authorUid, str2, numValueOf, type, requestId, strLIZ, iLIZLLL, iLIZIZ, curUserId, str3, strLIZLLL, i2);
        if (C20292414ag.LIZIZ(aweme)) {
            C14ZY.LIZ("tracker_prompt_feedback_survey_show");
            C14ZY.LIZ = 0;
            C14ZY.LIZIZ.clear();
        }
        LJIILIIL("survey_notify", c487630JAj);
        if (LJFF(iLIZLLL)) {
            AdSurveyEventLogger.LJ().LIZLLL(aweme, str);
        }
    }

    public static void LJI(C14ZT c14zt, Aweme aweme, C14Z0 c14z0, String str, String str2, String str3) {
        c14zt.getClass();
        LJII(aweme, c14z0, "click_result", str, str3, -1, null, str2);
    }

    public static void LJII(Aweme aweme, C14Z0 c14z0, String str, String str2, String str3, int i, String str4, String str5) {
        String aid;
        String strLIZ;
        String authorUid;
        String requestId;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        String strLJ = LJ(aweme, aid);
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZJ;
        if (aweme != null) {
            C14ZW.LIZ.getClass();
            strLIZ = C14ZW.LIZ(aweme);
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            requestId = aweme.getRequestId();
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            strLIZ = null;
            authorUid = null;
            requestId = null;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        int iLIZIZ = C14ZW.LIZIZ(aweme);
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        String str6 = C0X2A.LIZJ;
        String strLIZLLL = LIZLLL();
        C844470XAv.LIZ.getClass();
        int i2 = C844470XAv.LJIIJ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C720360SNm.LJI(aweme)) {
            c2344009Gk.LJFF("is_text_mode", "1");
        }
        LIZ(c2344009Gk, aweme);
        LIZIZ(c2344009Gk, aweme);
        LIZ.getClass();
        if (Intrinsics.LJFF(str, "SUBMIT".toLowerCase(Locale.ENGLISH)) && i >= 0) {
            c2344009Gk.LJFF("result", String.valueOf(i));
        }
        if (str4 != null) {
            c2344009Gk.LJFF("adjust_fyp_result", str4);
        }
        LJIILIIL("exit_survey", new C487620JAi(c2344009Gk, strLJ, str2, authorUid, str3, jCurrentTimeMillis, str, str5, c14z0, requestId, strLIZ, numValueOf, iLIZLLL, iLIZIZ, curUserId, str6, strLIZLLL, i2, jCurrentTimeMillis2));
        if (LJFF(iLIZLLL)) {
            AdSurveyEventLogger.LJ().LIZJ(aweme, str2, str4, str, jCurrentTimeMillis);
        }
    }

    public static void LJIIJJI(Aweme aweme, String str, String str2, String str3, Integer num, C14Z0 c14z0, String str4, Question question) {
        String strLIZ;
        Option[] optionArr;
        Option[] optionArr2;
        LIZIZ = System.currentTimeMillis();
        String strLJ = LJ(aweme, str2);
        String str5 = null;
        if (aweme != null) {
            C14ZW.LIZ.getClass();
            strLIZ = C14ZW.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        int iLIZIZ = C14ZW.LIZIZ(aweme);
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        String str6 = C0X2A.LIZJ;
        String strLIZLLL = LIZLLL();
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (question != null) {
            optionArr = question.options;
        } else {
            optionArr = null;
        }
        LIZJ(c2344009Gk, optionArr);
        LIZ(c2344009Gk, aweme);
        LIZIZ(c2344009Gk, aweme);
        LJIILIIL("secondary_survey_notify", new C487640JAk(c2344009Gk, strLJ, str, str3, num, c14z0, str4, strLIZ, iLIZLLL, iLIZIZ, curUserId, str6, strLIZLLL, i));
        if (LJFF(iLIZLLL)) {
            IAdSurveyEventLogger iAdSurveyEventLoggerLJ = AdSurveyEventLogger.LJ();
            if (question != null && (optionArr2 = question.options) != null) {
                int length = optionArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Option option = optionArr2[i2];
                    int i3 = option.id;
                    if (num != null && i3 == num.intValue()) {
                        str5 = option.name;
                        break;
                    }
                    i2++;
                }
            }
            iAdSurveyEventLoggerLJ.LIZ(aweme, str, str5);
        }
    }

    public static void LJIIIIZZ(C14ZT c14zt, Aweme aweme, C14Z0 c14z0, String str, String str2, String str3, String str4, String str5, int i) {
        int i2;
        String lowerCase = str4;
        String str6 = str3;
        String str7 = str5;
        if ((i & 32) != 0) {
            c14zt.getClass();
            lowerCase = "SINGLE_CHOICE".toLowerCase(Locale.ENGLISH);
        }
        if ((i & 64) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        c14zt.getClass();
        if (!Intrinsics.LJFF(str, "SUBMIT".toLowerCase(Locale.ENGLISH))) {
            str6 = "";
        }
        LJII(aweme, c14z0, str, str2, lowerCase, i2, str7, str6);
    }

    public static void LJIIIZ(Aweme aweme, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, C14Z0 c14z0, String str8, Option[] optionArr) {
        String strLIZ;
        String strLJJJ;
        String strLJJJ2;
        String strLJ = LJ(aweme, str5);
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        if (aweme != null) {
            C14ZW.LIZ.getClass();
            strLIZ = C14ZW.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        int iLIZIZ = C14ZW.LIZIZ(aweme);
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        String str9 = C0X2A.LIZJ;
        String strLIZLLL = LIZLLL();
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, aweme);
        LIZIZ(c2344009Gk, aweme);
        if (optionArr != null && (strLJJJ2 = C13LQ.LJJJ(optionArr, null, null, null, AFwS273S0000000_29.get$arr$(333), 31)) != null) {
            c2344009Gk.LJFF("adjust_fyp_result", strLJJJ2);
        }
        LJIILIIL("exit_secondary_survey", new C487610JAh(c2344009Gk, str, num, str2, str3, strLJ, str4, str6, str7, jCurrentTimeMillis, c14z0, str8, strLIZ, iLIZLLL, iLIZIZ, curUserId, str9, strLIZLLL, i, jCurrentTimeMillis2));
        if (LJFF(iLIZLLL)) {
            IAdSurveyEventLogger iAdSurveyEventLoggerLJ = AdSurveyEventLogger.LJ();
            if (optionArr != null) {
                strLJJJ = C13LQ.LJJJ(optionArr, ",", null, null, AFwS273S0000000_29.get$arr$(332), 30);
            } else {
                strLJJJ = null;
            }
            iAdSurveyEventLoggerLJ.LIZIZ(aweme, str4, strLJJJ, str, jCurrentTimeMillis);
        }
    }
}
