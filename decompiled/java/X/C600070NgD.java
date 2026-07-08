package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonComponent$onRuleTriggered$1$1", f = "FeedBottomSurveyButtonComponent.kt", l = {}, m = "invokeSuspend")
public final class C600070NgD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedBottomSurveyButtonComponent LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600070NgD(FeedBottomSurveyButtonComponent feedBottomSurveyButtonComponent, String str, InterfaceC1364105Vn<? super C600070NgD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedBottomSurveyButtonComponent;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600070NgD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1578630rBN.LJIIIZ(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1$1");
            return unit;
        }
        AssemVMLazy assemVMLazy = this.LL.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FeedBottomSurveyButtonComponent.LLILZLL;
        assemVMLazy.getValue().setState(new C5180020c(this.LLILLJJLI, 11));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
