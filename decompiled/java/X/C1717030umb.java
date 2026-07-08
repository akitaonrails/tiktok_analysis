package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ReportUserActionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0umb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$handleAfterPaymentBindRetain$2", f = "PaymentResultProcess.kt", l = {4190}, m = "invokeSuspend")
public final class C1717030umb extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GeneralPostPaymentGuideModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717030umb(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, InterfaceC1364105Vn<? super C1717030umb> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = generalPostPaymentGuideModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717030umb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objReportUserAction;
        C1C7U.LIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$2");
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
            GeneralPostPaymentGuideModel generalPostPaymentGuideModel = this.LLILLJJLI;
            String str = generalPostPaymentGuideModel.host;
            String str2 = generalPostPaymentGuideModel.token;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                C1717050umd c1717050umd = GeneralPostPaymentApi.LIZ;
                GeneralPostPaymentGuideModel generalPostPaymentGuideModel2 = this.LLILLJJLI;
                ReportUserActionRequest reportUserActionRequest = new ReportUserActionRequest(generalPostPaymentGuideModel2.merchantId, generalPostPaymentGuideModel2.merchantUserId, "skip", "AFTER_PAYMENT_BIND_RETAIN");
                this.LL = 1;
                c1717050umd.getClass();
                GeneralPostPaymentApi generalPostPaymentApiLIZ = C1717050umd.LIZ(str);
                if (generalPostPaymentApiLIZ != null) {
                    objReportUserAction = generalPostPaymentApiLIZ.reportUserAction(str2, reportUserActionRequest, this);
                    C099R.LJFF();
                } else {
                    objReportUserAction = null;
                }
                if (objReportUserAction == objLJFF) {
                    C1C7U.LIZIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$2");
        return unit;
    }
}
