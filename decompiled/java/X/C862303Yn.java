package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03Yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C862303Yn extends C2217421BqW implements Function2<PaymentMethod, Function1<? super String, ? extends Unit>, Unit> {
    public C862303Yn(Object obj) {
        super(2, obj, PaymentViewModel.class, "getBindUrl", "getBindUrl(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/dto/PaymentMethod;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PaymentMethod paymentMethod, Function1<? super String, ? extends Unit> function1) {
        ((PaymentViewModel) this.receiver).lR2(paymentMethod, function1);
        return Unit.LIZ;
    }
}
