package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$onRateDetailPageClose$1", f = "AdFollowUpAceSurveyVM.kt", l = {156}, m = "invokeSuspend")
public final class C1048640dOY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048640dOY(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC1364105Vn<? super C1048640dOY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adFollowUpAceSurveyVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048640dOY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyVM@3980.onRateDetailPageClose$1");
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
            AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LLILLJJLI;
            C2252321DDq c2252321DDq = adFollowUpAceSurveyVM.LLILLL;
            C1048920dP0 c1048920dP0 = (C1048920dP0) c2252321DDq.getValue();
            C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
            C1048920dP0 c1048920dP0LIZ = C1048920dP0.LIZ(c1048920dP0, false, 0, true, C1048570dOR.LIZ().LIZIZ(C1048600dOU.LIZJ(adFollowUpAceSurveyVM.LL)), 63);
            this.LL = 1;
            c2252321DDq.setValue(c1048920dP0LIZ);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.onRateDetailPageClose$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.onRateDetailPageClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
