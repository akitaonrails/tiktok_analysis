package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Z6 extends C09AY implements Function1<Aweme, Boolean> {
    public C14Z6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        List<Integer> list;
        Aweme aweme2 = aweme;
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJI = C14ZW.LJI(aweme2);
        boolean zIsAd = false;
        if (c14zgLJI == null || (feedSurveyConfig = c14zgLJI.LJI) == null || (list = feedSurveyConfig.multiSurveyTypes) == null || !list.contains(Integer.valueOf(C14Z0.PROFILE_TYPE.getType()))) {
            zIsAd = aweme2.isAd();
        }
        return Boolean.valueOf(zIsAd);
    }
}
