package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$buildState$1$1$1", f = "AdFollowUpAceSurveyView.kt", l = {257}, m = "invokeSuspend")
public final class C1048770dOl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C1048920dP0> LLILLJJLI;
    public final /* synthetic */ C1048750dOj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048770dOl(InterfaceC346201Wa<C1048920dP0> interfaceC346201Wa, C1048750dOj c1048750dOj, InterfaceC1364105Vn<? super C1048770dOl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1048750dOj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048770dOl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1$1");
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
            InterfaceC346201Wa<C1048920dP0> interfaceC346201Wa = this.LLILLJJLI;
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLL, 4);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyView@4e80.buildState$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
