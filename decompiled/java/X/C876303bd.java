package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS615S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$tryBindPayPal$2", f = "PaymentViewModel.kt", l = {3965}, m = "invokeSuspend")
public final class C876303bd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaymentViewModel LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876303bd(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, InterfaceC1364105Vn<? super C876303bd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paymentViewModel;
        this.LLILLL = paymentMethod;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876303bd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C887503dR c887503dR;
        String str;
        C1C7U.LIZ("PaymentViewModel@e450.tryBindPayPal$2");
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
            PaymentViewModel paymentViewModel = this.LLILLJJLI;
            paymentViewModel.LLJLL = C00DJ.CHNAGE_NEW_BIND_PAYPAL;
            EnterParams enterParams = paymentViewModel.LLJ;
            String str2 = null;
            if (enterParams != null) {
                c887503dR = enterParams.LJJIJL;
            } else {
                c887503dR = null;
            }
            PaymentMethod paymentMethod = this.LLILLL;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            PaymentMethodInfo paymentMethodInfo = new PaymentMethodInfo(str, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null);
            PaymentViewModel paymentViewModel2 = this.LLILLJJLI;
            PaymentMethod paymentMethod2 = this.LLILLL;
            paymentViewModel2.LLJLILLLLZIIL = paymentMethod2;
            C897503f3 c897503f3 = C876103bb.LIZJ;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.id;
            }
            AwS615S0100000_1 awS615S0100000_1 = new AwS615S0100000_1(this.LLILLJJLI, 40);
            this.LL = 1;
            if (c897503f3.LIZLLL(null, enterParams, c887503dR, paymentMethodInfo, str2, false, awS615S0100000_1, this) == objLJFF) {
                C1C7U.LIZIZ("PaymentViewModel@e450.tryBindPayPal$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.tryBindPayPal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
