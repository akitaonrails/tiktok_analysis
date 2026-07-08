package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZC extends C09AY implements Function1<Aweme, Boolean> {
    public C14ZC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        Question[] questionArr;
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        boolean z = false;
        if (feedSurveyLJ == null || (questionArr = feedSurveyLJ.questions) == null || questionArr.length <= 0 || C20286514Zj.LJ(feedSurveyLJ)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
