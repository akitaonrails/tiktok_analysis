package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi$Companion$calcPaymentMethodPrice$2", f = "PaymentApi.kt", l = {243}, m = "invokeSuspend")
public final class C844703Rt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<CalcPaymentMethodPriceData>>, Object> {
    public int LL;
    public final /* synthetic */ CalcPaymentMethodPriceRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844703Rt(CalcPaymentMethodPriceRequest calcPaymentMethodPriceRequest, InterfaceC1364105Vn<? super C844703Rt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = calcPaymentMethodPriceRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844703Rt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Response response = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long j = EcPaymentIndependentPriceConfigSettings.LIZJ().requestTimeOut;
                C844803Ru c844803Ru = new C844803Ru(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c844803Ru, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2");
                    return objLJFF;
                }
            }
            response = (Response) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C1C7U.LIZIZ("PaymentApi$Companion@725.calcPaymentMethodPrice$2");
        return response;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<CalcPaymentMethodPriceData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
