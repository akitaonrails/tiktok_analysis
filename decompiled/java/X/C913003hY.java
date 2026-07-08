package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;

/* JADX INFO: renamed from: X.03hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper", f = "PaymentAppealHelper.kt", l = {73, 126}, m = "getAppealInfo")
public final class C913003hY extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public EnumC913203ha LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ PaymentAppealHelper LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C913003hY(PaymentAppealHelper paymentAppealHelper, InterfaceC1364105Vn<? super C913003hY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = paymentAppealHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentAppealHelper@457b.getAppealInfo$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZ.LIZJ(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("PaymentAppealHelper@457b.getAppealInfo$1");
        return objLIZJ;
    }
}
