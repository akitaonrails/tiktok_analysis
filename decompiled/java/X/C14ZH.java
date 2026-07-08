package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZH extends C09AY implements Function1<FeedSurveyConfig, String> {
    public C14ZH() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(FeedSurveyConfig feedSurveyConfig) {
        FeedSurvey feedSurvey;
        FeedSurveyConfig feedSurveyConfig2 = feedSurveyConfig;
        if (feedSurveyConfig2 != null && (feedSurvey = feedSurveyConfig2.fixedSurvey) != null) {
            return feedSurvey.surveyKey;
        }
        return null;
    }
}
