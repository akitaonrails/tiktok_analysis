package X;

import Y.AgS204S0200000_16;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1$7", f = "AdFollowUpAceSurveyView.kt", l = {345}, m = "invokeSuspend")
public final class C1048800dOo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;
    public final /* synthetic */ C1048750dOj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048800dOo(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, C1048750dOj c1048750dOj, InterfaceC1364105Vn<? super C1048800dOo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adFollowUpAceSurveyVM;
        this.LLILLL = c1048750dOj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048800dOo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LLILLJJLI;
            AnonymousClass0950 anonymousClass0950 = adFollowUpAceSurveyVM.LLILZLL;
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLL, adFollowUpAceSurveyVM, 2);
            this.LL = 1;
            if (anonymousClass0950.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1$7");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
