package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ReportUserActionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0umc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssemViewModel$reportUserAction$1", f = "GeneralPostPaymentAssemViewModel.kt", l = {83}, m = "invokeSuspend")
public final class C1717040umc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GeneralPostPaymentGuideModel LLILLJJLI;
    public final /* synthetic */ ReportUserActionRequest LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717040umc(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, ReportUserActionRequest reportUserActionRequest, Function0<Unit> function0, InterfaceC1364105Vn<? super C1717040umc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = generalPostPaymentGuideModel;
        this.LLILLL = reportUserActionRequest;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717040umc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objReportUserAction;
        C1C7U.LIZ("GeneralPostPaymentAssemViewModel@abe7.reportUserAction$1");
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
            C1717050umd c1717050umd = GeneralPostPaymentApi.LIZ;
            GeneralPostPaymentGuideModel generalPostPaymentGuideModel = this.LLILLJJLI;
            String str = generalPostPaymentGuideModel.host;
            String str2 = generalPostPaymentGuideModel.token;
            ReportUserActionRequest reportUserActionRequest = this.LLILLL;
            this.LL = 1;
            c1717050umd.getClass();
            GeneralPostPaymentApi generalPostPaymentApiLIZ = C1717050umd.LIZ(str);
            if (generalPostPaymentApiLIZ != null) {
                objReportUserAction = generalPostPaymentApiLIZ.reportUserAction(str2, reportUserActionRequest, this);
                if (objReportUserAction != C099R.LJFF()) {
                    objReportUserAction = (C0X52) objReportUserAction;
                }
            } else {
                objReportUserAction = null;
            }
            if (objReportUserAction == objLJFF) {
                C1C7U.LIZIZ("GeneralPostPaymentAssemViewModel@abe7.reportUserAction$1");
                return objLJFF;
            }
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralPostPaymentAssemViewModel@abe7.reportUserAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
