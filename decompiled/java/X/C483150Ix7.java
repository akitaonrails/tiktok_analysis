package X;

import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.livesetting.watchlive.LightSurveyDelayConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ix7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet$initOptions$1$1$onItemClickListener$1$2", f = "LightSurveyFeedbackSheet.kt", l = {222}, m = "invokeSuspend")
public final class C483150Ix7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LightSurveyFeedbackSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483150Ix7(LightSurveyFeedbackSheet lightSurveyFeedbackSheet, InterfaceC1364105Vn<? super C483150Ix7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lightSurveyFeedbackSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483150Ix7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightSurveyFeedbackSheet@7261.initOptions$1$1$onItemClickListener$1$2");
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
            long jDelay = LightSurveyDelayConfig.INSTANCE.delay();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jDelay, this) == objLJFF) {
                C1C7U.LIZIZ("LightSurveyFeedbackSheet@7261.initOptions$1$1$onItemClickListener$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.yx(C2097908Jt.LIZJ(new Pair("exit_method", "submit")));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightSurveyFeedbackSheet@7261.initOptions$1$1$onItemClickListener$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
