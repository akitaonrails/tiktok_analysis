package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZF extends C09AY implements Function1<FeedSurveyConfig, Boolean> {
    public C14ZF() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FeedSurveyConfig feedSurveyConfig) {
        String str;
        List<Integer> list;
        FeedSurvey feedSurvey;
        FeedSurveyConfig feedSurveyConfig2 = feedSurveyConfig;
        C20291314aV.LIZ.getClass();
        boolean z = false;
        if (!C20291314aV.LJIIJ(feedSurveyConfig2)) {
            if (feedSurveyConfig2 != null && (feedSurvey = feedSurveyConfig2.fixedSurvey) != null) {
                str = feedSurvey.surveyKey;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str) && ((list = feedSurveyConfig2.multiSurveyTypes) == null || !list.contains(Integer.valueOf(C14Z0.PROFILE_TYPE.getType())))) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
