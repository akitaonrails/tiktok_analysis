package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$invokeStoredPaymentMethod$1", f = "PaymentViewModel.kt", l = {3653}, m = "invokeSuspend")
public final class C879803cC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterParams LLILLJJLI;
    public final /* synthetic */ PaymentInfo LLILLL;
    public final /* synthetic */ PaymentViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C879803cC(EnterParams enterParams, PaymentInfo paymentInfo, PaymentViewModel paymentViewModel, InterfaceC1364105Vn<? super C879803cC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterParams;
        this.LLILLL = paymentInfo;
        this.LLILZ = paymentViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C879803cC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C887503dR c887503dR;
        C1C7U.LIZ("PaymentViewModel@e450.invokeStoredPaymentMethod$1");
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
            EnterParams enterParams = this.LLILLJJLI;
            PaymentInfo paymentInfo = this.LLILLL;
            PaymentViewModel paymentViewModel = this.LLILZ;
            String str = paymentViewModel.LLJLIL;
            if (enterParams != null) {
                c887503dR = enterParams.LJJIJL;
            } else {
                c887503dR = null;
            }
            PaymentMethodsData paymentMethodsData = paymentViewModel.LLJJIJIL;
            C1077804Jk c1077804Jk = new C1077804Jk(paymentViewModel, 2);
            this.LL = 1;
            if (C876103bb.LIZJ.LIZJ(enterParams, paymentInfo, str, c887503dR, paymentMethodsData, false, c1077804Jk, this) == objLJFF) {
                C1C7U.LIZIZ("PaymentViewModel@e450.invokeStoredPaymentMethod$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.invokeStoredPaymentMethod$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
