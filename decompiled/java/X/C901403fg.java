package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$handleAfterPaymentBindRetain$1", f = "PaymentResultProcess.kt", l = {4182}, m = "invokeSuspend")
public final class C901403fg extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C897703f5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901403fg(C897703f5 c897703f5, InterfaceC1364105Vn<? super C901403fg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c897703f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901403fg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$1");
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
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            C897703f5 c897703f5 = this.LLILLJJLI;
            this.LL = 1;
            obj = paymentBindHelper.LJIIL(c897703f5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.handleAfterPaymentBindRetain$1");
        return obj;
    }
}
