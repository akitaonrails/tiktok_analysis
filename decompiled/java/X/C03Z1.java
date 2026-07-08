package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C03Z1 extends C2217421BqW implements Function1<PaymentMethod, Unit> {
    public C03Z1(PaymentViewModel paymentViewModel) {
        super(1, paymentViewModel, PaymentViewModel.class, "removeBindMethod", "removeBindMethod(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/dto/PaymentMethod;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PaymentMethod paymentMethod) {
        ((PaymentViewModel) this.receiver).MR2(paymentMethod);
        return Unit.LIZ;
    }
}
