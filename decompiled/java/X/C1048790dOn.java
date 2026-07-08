package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1", f = "AdFollowUpAceSurveyView.kt", l = {}, m = "invokeSuspend")
public final class C1048790dOn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;
    public final /* synthetic */ C1048750dOj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048790dOn(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, C1048750dOj c1048750dOj, InterfaceC1364105Vn<? super C1048790dOn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adFollowUpAceSurveyVM;
        this.LLILLL = c1048750dOj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1048790dOn c1048790dOn = new C1048790dOn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1048790dOn.LL = obj;
        return c1048790dOn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C05RH(this.LLILLJJLI.LLILZ));
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048770dOl(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048810dOp(interfaceC346201WaLJIILL, this.LLILLL, this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048820dOq(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048830dOr(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048840dOs(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048850dOt(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1048800dOo(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
