package X;

import com.ss.android.ugc.aweme.feed.survey.frequency.AwemePromptInfo;
import com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyLocalData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyUtils$initFeedbackSurvey$1$data$1", f = "FeedbackSurveyUtils.kt", l = {}, m = "invokeSuspend")
public final class C751150TdJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeedbackSurveyLocalData, ? extends AwemePromptInfo[]>>, Object> {
    public C751150TdJ(InterfaceC1364105Vn<? super C751150TdJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751150TdJ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedbackSurveyUtils@4f45.initFeedbackSurvey$1$data$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20291414aW.LIZ.getClass();
        Pair pairLIZIZ = C20291414aW.LIZIZ();
        C1C7U.LIZIZ("FeedbackSurveyUtils@4f45.initFeedbackSurvey$1$data$1");
        return pairLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeedbackSurveyLocalData, ? extends AwemePromptInfo[]>> interfaceC1364105Vn) {
        return new C751150TdJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
