package X;

import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZS extends C09AY implements Function1<SurveyInfo, CharSequence> {
    public C14ZS() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(SurveyInfo surveyInfo) {
        return String.valueOf(surveyInfo.surveyKey);
    }
}
