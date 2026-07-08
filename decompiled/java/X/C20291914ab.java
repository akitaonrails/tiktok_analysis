package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.survey.experiment.SurveyGlobalFrequencyConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291914ab {
    public static final C20291914ab LIZ = new C20291914ab();
    public static final Keva LIZIZ = Keva.getRepo("repo_survey_global");
    public static List<Long> LIZJ = new ArrayList();
    public static final long LIZLLL;
    public static final int LJ;
    public static final List<String> LJFF;
    public static final C01GW LJI;

    static {
        SurveyGlobalFrequencyConfig surveyGlobalFrequencyConfig = C20292614ai.LIZ;
        LIZLLL = ((long) surveyGlobalFrequencyConfig.surveyGlobalFrequencyDay) * 86400000;
        LJ = surveyGlobalFrequencyConfig.surveyGlobalFrequencyDisplayTime;
        LJFF = surveyGlobalFrequencyConfig.skipGlobalFrequencyControl;
        LJI = C452501pT.LIZIZ(new C20293614as());
    }

    public static void LIZIZ() {
        LIZJ.add(Long.valueOf(System.currentTimeMillis()));
        LIZIZ.storeString("key_survey_global_frequency", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LIZJ));
    }

    public static void LIZ() {
        C19719612Di.LJJIIJ(LIZJ, new C20292514ah(System.currentTimeMillis() - LIZLLL), true);
        LIZIZ.storeString("key_survey_global_frequency", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LIZJ));
    }
}
