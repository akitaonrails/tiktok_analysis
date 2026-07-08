package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.HighLightReportEvent;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.ReportPinCardClickRequest;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.UserClickInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.EcommerceInfluencerServiceImpl$reportPinCardClickEvent$1", f = "EcommerceInfluencerServiceImpl.kt", l = {98}, m = "invokeSuspend")
public final class C597630NcH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C597640NcI LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597630NcH(C597640NcI c597640NcI, String str, String str2, InterfaceC1364105Vn<? super C597630NcH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c597640NcI;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597630NcH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcommerceInfluencerServiceImpl@b3c5.reportPinCardClickEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C597650NcJ c597650NcJ = this.LLILLJJLI.LLILLJJLI;
                String str = this.LLILLL;
                HighLightReportEvent highLightReportEvent = new HighLightReportEvent(new UserClickInfo(this.LLILZ));
                this.LL = 1;
                if (c597650NcJ.LL.LL.reportPinCardClick(new ReportPinCardClickRequest(str, 1, highLightReportEvent), this) == objLJFF) {
                    C1C7U.LIZIZ("EcommerceInfluencerServiceImpl@b3c5.reportPinCardClickEvent$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceInfluencerServiceImpl@b3c5.reportPinCardClickEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
