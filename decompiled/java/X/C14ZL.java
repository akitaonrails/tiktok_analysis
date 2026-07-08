package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZL extends C09AY implements Function1<Aweme, Boolean> {
    public C14ZL() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        int i;
        Aweme aweme2 = aweme;
        int iLIZLLL = C14ZW.LIZLLL(aweme2);
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJI = C14ZW.LJI(aweme2);
        boolean z = false;
        if (iLIZLLL == C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()) {
            if (c14zgLJI != null) {
                feedSurveyConfig = c14zgLJI.LJI;
            } else {
                feedSurveyConfig = null;
            }
            int i2 = C1867270ygv.LIZ;
            if (feedSurveyConfig == null || ((i = feedSurveyConfig.surveyAppearStart) > 0 && C1867270ygv.LIZ <= i)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
