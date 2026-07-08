package X;

import Y.AfS170S0100000_1;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.BindHelper$goPaymentPage$1$1", f = "BindHelper.kt", l = {170}, m = "invokeSuspend")
public final class C875503bV extends C09AX implements Function2<ChangeInfo, InterfaceC1364105Vn<? super C842503Qx>, Object> {
    public int LL;
    public final /* synthetic */ C876103bb LLILLJJLI;
    public final /* synthetic */ ListPaymentMethodRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875503bV(C876103bb c876103bb, ListPaymentMethodRequest listPaymentMethodRequest, InterfaceC1364105Vn<? super C875503bV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c876103bb;
        this.LLILLL = listPaymentMethodRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875503bV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BindHelper@eb8d.goPaymentPage$1$1");
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
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("call refresh in BindHelper for sns");
            C876103bb c876103bb = this.LLILLJJLI;
            ListPaymentMethodRequest listPaymentMethodRequest = this.LLILLL;
            this.LL = 1;
            c876103bb.getClass();
            if (listPaymentMethodRequest == null) {
                obj = null;
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                PaymentApi.LIZ.getClass();
                ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJIIIIZZ(listPaymentMethodRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS170S0100000_1(c23260099m, 12), new AfS170S0100000_1(c23260099m, 13));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BindHelper@eb8d.goPaymentPage$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BindHelper@eb8d.goPaymentPage$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChangeInfo changeInfo, InterfaceC1364105Vn<? super C842503Qx> interfaceC1364105Vn) {
        return ((a) create(changeInfo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
