package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PayHelper$schedulePaymentProcess$job$2$2$1", f = "PayHelper.kt", l = {1911}, m = "invokeSuspend")
public final class C842403Qw extends C09AX implements Function2<ChangeInfo, InterfaceC1364105Vn<? super C842503Qx>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PaymentListRequest LLILLL;
    public final /* synthetic */ C03PI LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C842403Qw(PaymentListRequest paymentListRequest, C03PI c03pi, InterfaceC1364105Vn<? super C842403Qw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = paymentListRequest;
        this.LLILZ = c03pi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C842403Qw c842403Qw = new C842403Qw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c842403Qw.LLILLJJLI = obj;
        return c842403Qw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PayHelper@ece4.schedulePaymentProcess$job$2$2$1");
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
            ChangeInfo changeInfo = (ChangeInfo) this.LLILLJJLI;
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("call refresh in payHelper");
            PaymentListRequest paymentListRequest = this.LLILLL;
            C03PI c03pi = this.LLILZ;
            this.LL = 1;
            PaymentListRequest paymentListRequestLIZ = PaymentListRequest.LIZ(paymentListRequest, changeInfo, null, 959);
            C03SE c03se = C03PI.LJIJI;
            AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(c03pi, 156);
            c03se.getClass();
            obj = C03SE.LJIJ(paymentListRequestLIZ, awS580S0100000_1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PayHelper@ece4.schedulePaymentProcess$job$2$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PayHelper@ece4.schedulePaymentProcess$job$2$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChangeInfo changeInfo, InterfaceC1364105Vn<? super C842503Qx> interfaceC1364105Vn) {
        return ((a) create(changeInfo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
