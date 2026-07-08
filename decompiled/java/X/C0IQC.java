package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuideDialogRepository;
import com.ss.android.ugc.profile.business.commerce.ReportTradeEntranceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IQC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.commerce.OrderCenterGuideDialogHelper$reportOrderCenterGuideDialogShowed$1", f = "OrderCenterGuidanceDialog.kt", l = {140}, m = "invokeSuspend")
public final class C0IQC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReportTradeEntranceRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IQC(ReportTradeEntranceRequest reportTradeEntranceRequest, InterfaceC1364105Vn<? super C0IQC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reportTradeEntranceRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IQC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderCenterGuideDialogHelper@4085.reportOrderCenterGuideDialogShowed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C481000Ite c481000Ite = OrderCenterGuideDialogRepository.LLILLJJLI.getValue().LL;
                ReportTradeEntranceRequest reportTradeEntranceRequest = this.LLILLJJLI;
                this.LL = 1;
                obj = c481000Ite.getInboxEntranceInfo(reportTradeEntranceRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OrderCenterGuideDialogHelper@4085.reportOrderCenterGuideDialogShowed$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderCenterGuideDialogHelper@4085.reportOrderCenterGuideDialogShowed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
