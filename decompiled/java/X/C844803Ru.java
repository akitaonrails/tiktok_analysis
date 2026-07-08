package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi$Companion$calcPaymentMethodPrice$2$1", f = "PaymentApi.kt", l = {245}, m = "invokeSuspend")
public final class C844803Ru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<CalcPaymentMethodPriceData>>, Object> {
    public int LL;
    public final /* synthetic */ CalcPaymentMethodPriceRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844803Ru(CalcPaymentMethodPriceRequest calcPaymentMethodPriceRequest, InterfaceC1364105Vn<? super C844803Ru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = calcPaymentMethodPriceRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844803Ru(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2$1");
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
            PaymentApi paymentApi = (PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class);
            CalcPaymentMethodPriceRequest calcPaymentMethodPriceRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = paymentApi.LIZJ(calcPaymentMethodPriceRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<CalcPaymentMethodPriceData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
