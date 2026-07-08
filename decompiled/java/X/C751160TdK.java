package X;

import com.ss.android.ugc.aweme.feed.survey.frequency.AwemePromptInfo;
import com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyLocalData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyUtils$initFeedbackSurvey$1", f = "FeedbackSurveyUtils.kt", l = {247}, m = "invokeSuspend")
public final class C751160TdK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C751160TdK(InterfaceC1364105Vn<? super C751160TdK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751160TdK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FeedbackSurveyUtils@4f45.initFeedbackSurvey$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C751150TdJ c751150TdJ = new C751150TdJ(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c751150TdJ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FeedbackSurveyUtils@4f45.initFeedbackSurvey$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        C20291414aW c20291414aW = C20291414aW.LIZ;
        FeedbackSurveyLocalData feedbackSurveyLocalData = (FeedbackSurveyLocalData) pair.getFirst();
        AwemePromptInfo[] awemePromptInfoArr = (AwemePromptInfo[]) pair.getSecond();
        c20291414aW.getClass();
        C20291414aW.LIZ(feedbackSurveyLocalData, awemePromptInfoArr);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackSurveyUtils@4f45.initFeedbackSurvey$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C751160TdK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
