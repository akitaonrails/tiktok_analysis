package X;

import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet$show$3", f = "LightSurveyFeedbackSheet.kt", l = {124}, m = "invokeSuspend")
public final class C483000Iws extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LightSurveyFeedbackSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483000Iws(LightSurveyFeedbackSheet lightSurveyFeedbackSheet, InterfaceC1364105Vn<? super C483000Iws> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lightSurveyFeedbackSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483000Iws(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        C1C7U.LIZ("LightSurveyFeedbackSheet@7261.show$3");
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
            SurveyViewModel surveyViewModel = this.LLILLJJLI.LLILZ;
            if (surveyViewModel != null && (surveyData = surveyViewModel.LL) != null && (surveyShowMode = surveyData.showMode) != null) {
                j = surveyShowMode.showDurationMs;
            } else {
                j = 30000;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LightSurveyFeedbackSheet@7261.show$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.yx(C2097908Jt.LIZJ(new Pair("exit_method", "timeout")));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightSurveyFeedbackSheet@7261.show$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
