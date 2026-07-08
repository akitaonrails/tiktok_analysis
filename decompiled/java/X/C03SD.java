package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;

/* JADX INFO: renamed from: X.03SD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper", f = "PaymentCacheHelper.kt", l = {370}, m = "fetchRegionInfo")
public final class C03SD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PaymentCacheHelper LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03SD(PaymentCacheHelper paymentCacheHelper, InterfaceC1364105Vn<? super C03SD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = paymentCacheHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentCacheHelper@550e.fetchRegionInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("PaymentCacheHelper@550e.fetchRegionInfo$1");
        return objLIZLLL;
    }
}
