package X;

import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292314af extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedSurveyConfig[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20292314af(FeedSurveyConfig[] feedSurveyConfigArr) {
        super(0);
        this.LL = feedSurveyConfigArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        for (FeedSurveyConfig feedSurveyConfig : this.LL) {
            C20291714aZ c20291714aZ = C20291714aZ.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(feedSurveyConfig.feedSurveyStyle, "style_group");
            c2344009Gk.LIZJ(feedSurveyConfig.bgdVideo, "option_style");
            FeedSurvey feedSurvey = feedSurveyConfig.fixedSurvey;
            String str = feedSurvey != null ? feedSurvey.surveyKey : null;
            c20291714aZ.getClass();
            C20291714aZ.LIZ(c2344009Gk, str);
            C20684815ws.LJIILLIIL("cold_start_response", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
