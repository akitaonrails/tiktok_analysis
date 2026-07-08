package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.survey.experiment.SurveyGlobalFrequencyConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.14ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292614ai {
    public static final SurveyGlobalFrequencyConfig LIZ;

    static {
        SurveyGlobalFrequencyConfig surveyGlobalFrequencyConfig = new SurveyGlobalFrequencyConfig(0, 0, new ArrayList());
        SurveyGlobalFrequencyConfig surveyGlobalFrequencyConfig2 = (SurveyGlobalFrequencyConfig) SettingsManager.LIZLLL().LJIIIIZZ("survey_global_frequency", SurveyGlobalFrequencyConfig.class, surveyGlobalFrequencyConfig);
        if (surveyGlobalFrequencyConfig2 != null) {
            surveyGlobalFrequencyConfig = surveyGlobalFrequencyConfig2;
        }
        LIZ = surveyGlobalFrequencyConfig;
    }
}
