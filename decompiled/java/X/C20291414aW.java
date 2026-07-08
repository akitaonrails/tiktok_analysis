package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.ab.PromptConfig;
import com.ss.android.ugc.aweme.feed.model.prompt.LocalPromptOption;
import com.ss.android.ugc.aweme.feed.survey.frequency.AwemePromptInfo;
import com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyLocalData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14aW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291414aW {
    public static FeedbackSurveyLocalData LJIILIIL;
    public static final C20291414aW LIZ = new C20291414aW();
    public static final C1566110qrB<C03IT> LIZIZ = new C1566110qrB<>(16);
    public static final C1566110qrB<AwemePromptInfo> LIZJ = new C1566110qrB<>(16);
    public static final ArrayList<C20292814ak> LIZLLL = new ArrayList<>();
    public static final Keva LJ = Keva.getRepo("prompt_feedback_survey");
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static ArrayList<LocalPromptOption> LJIIIIZZ = new ArrayList<>();
    public static Map<String, LocalPromptOption> LJIIIZ = C2097608Jq.LJ();
    public static String LJIIJ = "";
    public static String LJIIJJI = "";
    public static String LJIIL = "";
    public static int LJIILJJIL = -1;
    public static int LJIILL = -1;

    public static Pair LIZIZ() {
        try {
            Gson gson = C7740030o.LIZ().getGson();
            Keva keva = LJ;
            return new Pair((FeedbackSurveyLocalData) gson.LJII(keva.getString("local_data", ""), FeedbackSurveyLocalData.class), (AwemePromptInfo[]) C7740030o.LIZ().getGson().LJII(keva.getString("local_aweme_data", ""), AwemePromptInfo[].class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair(null, null);
        }
    }

    public static void LIZ(FeedbackSurveyLocalData feedbackSurveyLocalData, AwemePromptInfo[] awemePromptInfoArr) {
        if (feedbackSurveyLocalData == null || awemePromptInfoArr == null) {
            return;
        }
        try {
            PromptConfig promptConfigLIZ = C20292414ag.LIZ();
            if (promptConfigLIZ != null && promptConfigLIZ.feedbackPosition == 0) {
                return;
            }
            C20291514aX.LIZ.getClass();
            int i = C20291514aX.LIZJ.getInt("key_day_aweme_count", 0);
            if (Calendar.getInstance().get(6) != feedbackSurveyLocalData.date) {
                int i2 = C14ZY.LIZ;
                C20684815ws.LJFF().execute(new RunnableC514901zX(new C2082508Dv(i, feedbackSurveyLocalData.start, feedbackSurveyLocalData.end), "clear_prompt_feedback_survey_config", 10));
                C14ZY.LIZ("tracker_feedback_survey_cold_launch_init");
                int i3 = feedbackSurveyLocalData.start;
                if (i < i3) {
                    C14ZY.LIZ("tracker_clear_feedback_survey_before_area");
                } else if (i < feedbackSurveyLocalData.end && i3 <= i) {
                    C14ZY.LIZ("tracker_clear_feedback_survey_in_area");
                } else {
                    C14ZY.LIZ("tracker_clear_feedback_survey_after_area");
                }
                C14ZY.LIZ = 0;
                C14ZY.LIZIZ.clear();
                Intrinsics.LJFF(LJFF, "");
                LJFF = "";
                LJI = "";
                LJII = "";
                Keva keva = LJ;
                keva.storeString("local_data", "");
                keva.storeString("local_aweme_data", "");
                return;
            }
            Keva keva2 = C14ZY.LIZIZ;
            int i4 = keva2.getInt("cold_launch_count", 0) + 1;
            C14ZY.LIZ = i4;
            keva2.storeInt("cold_launch_count", i4);
            LJI = feedbackSurveyLocalData.surveyKey;
            LJFF = feedbackSurveyLocalData.instructions;
            LJII = feedbackSurveyLocalData.content;
            LJIIJ = feedbackSurveyLocalData.fromAwemeId;
            ArrayList<LocalPromptOption> arrayList = feedbackSurveyLocalData.localPromptOptionList;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            LJIIIIZZ = arrayList;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (LocalPromptOption localPromptOption : arrayList) {
                linkedHashMap.put(localPromptOption.instructionId, localPromptOption);
            }
            LJIIIZ = linkedHashMap;
            LJIIJJI = feedbackSurveyLocalData.adjustEntrance;
            LJIIL = feedbackSurveyLocalData.adjustType;
            C1566110qrB<AwemePromptInfo> c1566110qrB = LIZJ;
            C1566100qrA c1566100qrA = c1566110qrB.LIZJ;
            C1566100qrA c1566100qrA2 = c1566110qrB.LIZLLL;
            c1566100qrA.LIZJ = c1566100qrA2;
            c1566100qrA2.LIZLLL = c1566100qrA;
            c1566110qrB.LIZIZ.clear();
            for (AwemePromptInfo awemePromptInfo : C13LQ.LJJJLL(awemePromptInfoArr)) {
                LIZJ.LIZJ(awemePromptInfo.awemeId, awemePromptInfo);
            }
            LJIILIIL = feedbackSurveyLocalData;
            C14ZY.LIZ("tracker_feedback_survey_cold_launch_init");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
