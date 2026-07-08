package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;

/* JADX INFO: renamed from: X.03fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper", f = "PaymentBindHelper.kt", l = {302}, m = "requestPreBindWithSetting")
public final class C898903fH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PaymentBindHelper LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898903fH(PaymentBindHelper paymentBindHelper, InterfaceC1364105Vn<? super C898903fH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = paymentBindHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PaymentBindHelper@f28b.requestPreBindWithSetting$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("PaymentBindHelper@f28b.requestPreBindWithSetting$1");
        return objLJIIJ;
    }
}
