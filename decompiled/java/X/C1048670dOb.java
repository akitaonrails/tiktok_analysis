package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$surveyVisible$1", f = "AdFollowUpAceSurveyVM.kt", l = {96, 103}, m = "invokeSuspend")
public final class C1048670dOb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048670dOb(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, boolean z, InterfaceC1364105Vn<? super C1048670dOb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adFollowUpAceSurveyVM;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048670dOb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
        if (C1048570dOR.LIZ().LIZ(C1048600dOU.LIZJ(this.LLILLJJLI.LL)) != 0) {
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLILLL;
            C1048920dP0 c1048920dP0LIZ = C1048920dP0.LIZ((C1048920dP0) c2252321DDq.getValue(), this.LLILLL, 0, true, false, 183);
            this.LL = 1;
            c2252321DDq.setValue(c1048920dP0LIZ);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
            return unit22;
        }
        C2252321DDq c2252321DDq2 = this.LLILLJJLI.LLILLL;
        C1048920dP0 c1048920dP0LIZ2 = C1048920dP0.LIZ((C1048920dP0) c2252321DDq2.getValue(), this.LLILLL, 0, false, false, 247);
        this.LL = 2;
        c2252321DDq2.setValue(c1048920dP0LIZ2);
        if (Unit.LIZ == objLJFF) {
            C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.surveyVisible$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
