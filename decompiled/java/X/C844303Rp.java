package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PayHelper$getSnsCheck$1$check$4$1", f = "PayHelper.kt", l = {}, m = "invokeSuspend")
public final class C844303Rp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<PaymentInfo, Unit> LL;
    public final /* synthetic */ PaymentInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C844303Rp(Function1<? super PaymentInfo, Unit> function1, PaymentInfo paymentInfo, InterfaceC1364105Vn<? super C844303Rp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = paymentInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844303Rp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PayHelper@ece4.getSnsCheck$1$check$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<PaymentInfo, Unit> function1 = this.LL;
        PaymentInfo paymentInfo = this.LLILLJJLI;
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            paymentMethodInfo.setChooseSave(true);
        }
        function1.invoke(paymentInfo);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PayHelper@ece4.getSnsCheck$1$check$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
