package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;

/* JADX INFO: renamed from: X.03QT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayService", f = "OneClickPayService.kt", l = {418}, m = "doPlaceOrder")
public final class C03QT extends AbstractC23140094w {
    public BillInfoData LL;
    public Object LLILLJJLI;
    public PaymentMethod LLILLL;
    public PaymentMethodInfo LLILZ;
    public PaymentInfo LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C03QL LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QT(C03QL c03ql, InterfaceC1364105Vn<? super C03QT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c03ql;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickPayService@2466.doPlaceOrder$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("OneClickPayService@2466.doPlaceOrder$1");
        return objLIZ;
    }
}
