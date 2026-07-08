package X;

import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS30S0001000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$rateStarClick$1", f = "AdFollowUpAceSurveyVM.kt", l = {77, 79}, m = "invokeSuspend")
public final class C1048630dOX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048630dOX(AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, int i, InterfaceC1364105Vn<? super C1048630dOX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adFollowUpAceSurveyVM;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048630dOX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyVM@3980.rateStarClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.rateStarClick$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAdExperienceEventLogger iAdExperienceEventLogger = this.LLILLJJLI.LLILLJJLI;
            if (iAdExperienceEventLogger != null) {
                C1048520dOM.LIZ.getClass();
                iAdExperienceEventLogger.logAd(C1048520dOM.LJFF, new AwS30S0001000_16(this.LLILLL, 2));
            }
            C01GW<C1048720dOg> c01gw = C1048720dOg.LIZJ;
            C1048720dOg c1048720dOgLIZ = C1048570dOR.LIZ();
            String strLIZJ = C1048600dOU.LIZJ(this.LLILLJJLI.LL);
            int i2 = this.LLILLL;
            if (strLIZJ == null) {
                c1048720dOgLIZ.getClass();
            } else {
                C603820NmG<String, C1048730dOh> c603820NmG = c1048720dOgLIZ.LIZIZ;
                if (c603820NmG != null) {
                    c603820NmG.LIZLLL(strLIZJ, new C1048730dOh(i2, false, 4));
                }
            }
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLILLL;
            C1048920dP0 c1048920dP0LIZ = C1048920dP0.LIZ((C1048920dP0) c2252321DDq.getValue(), false, this.LLILLL, false, false, 239);
            this.LL = 1;
            c2252321DDq.setValue(c1048920dP0LIZ);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.rateStarClick$1");
                return objLJFF;
            }
        }
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZIL;
        this.LL = 2;
        if (c2252331DDr.emit(true, this) == objLJFF) {
            C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.rateStarClick$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.rateStarClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
