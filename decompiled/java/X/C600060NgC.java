package X;

import com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonComponent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonComponent$onRuleTriggered$1", f = "FeedBottomSurveyButtonComponent.kt", l = {82}, m = "invokeSuspend")
public final class C600060NgC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ FeedBottomSurveyButtonComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600060NgC(FeedBottomSurveyButtonComponent feedBottomSurveyButtonComponent, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = feedBottomSurveyButtonComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600060NgC(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1");
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
            if (C599890Nfv.LIZJ(this.LLILLJJLI)) {
                C603370NlX c603370NlX = this.LLILLL.LLILZ;
                if (c603370NlX != null) {
                    Iterator<InterfaceC603390NlZ> it2 = c603370NlX.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().reset();
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C600070NgD c600070NgD = new C600070NgD(this.LLILLL, this.LLILLJJLI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c600070NgD) == objLJFF) {
                    C1C7U.LIZIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedBottomSurveyButtonComponent@d583.onRuleTriggered$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
