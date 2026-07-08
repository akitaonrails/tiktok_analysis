package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;

/* JADX INFO: renamed from: X.03fG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper", f = "PaymentBindHelper.kt", l = {984, 996}, m = "storePaymentMethodForAfterPaymentBindRetain")
public final class C898803fG extends AbstractC23140094w {
    public C897703f5 LL;
    public C914303hl LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PaymentBindHelper LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898803fG(PaymentBindHelper paymentBindHelper, InterfaceC1364105Vn<? super C898803fG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = paymentBindHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PaymentBindHelper@f28b.storePaymentMethodForAfterPaymentBindRetain$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZ.LJIIL(null, this);
        C1C7U.LIZIZ("PaymentBindHelper@f28b.storePaymentMethodForAfterPaymentBindRetain$1");
        return objLJIIL;
    }
}
