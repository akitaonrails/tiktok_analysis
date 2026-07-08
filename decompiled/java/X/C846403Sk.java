package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C846403Sk extends C2217421BqW implements Function1<EnterParams, Unit> {
    public C846403Sk(USPaymentInfoCell uSPaymentInfoCell) {
        super(1, uSPaymentInfoCell, USPaymentInfoCell.class, "injectSubPaymentMap", "injectSubPaymentMap(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/EnterParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnterParams enterParams) {
        EnterParams enterParams2 = enterParams;
        USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) this.receiver;
        if (enterParams2 != null) {
            PaymentInfoViewModel paymentInfoViewModelS5 = uSPaymentInfoCell.S5();
            enterParams2.LJJIL = C2097608Jq.LJIIIIZZ(new Pair("single_payment", C2097608Jq.LJIIZILJ(paymentInfoViewModelS5.LL)), new Pair("hybrid_payment", C2097608Jq.LJIIZILJ(paymentInfoViewModelS5.LLILLJJLI)));
        } else {
            uSPaymentInfoCell.getClass();
        }
        return Unit.LIZ;
    }
}
