package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03O9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O9 extends C09AY implements InterfaceC1631620sYq<PaymentInfo, Boolean, Map<String, ? extends Object>, Unit> {
    public final /* synthetic */ PaymentHalfFragment LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03O9(PaymentHalfFragment paymentHalfFragment, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, boolean z2, String str) {
        super(3);
        this.LL = paymentHalfFragment;
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(PaymentInfo paymentInfo, Boolean bool, Map<String, ? extends Object> map) {
        String str;
        String str2;
        PaymentInfo paymentInfo2 = paymentInfo;
        this.LL.dismissAllowingStateLoss();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selected from PaymentHalfFragment, paymentInfo: $-{pm.paymentMethod?.id}, ");
        PaymentMethodInfo paymentMethodInfo = paymentInfo2.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            str = paymentMethodInfo.id;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        OrderSubmitAssemViewModel.JQ2(this.LLILLJJLI, paymentInfo2, false, false, null, null, false, false, false, 508);
        this.LLILLJJLI.RS2(paymentInfo2);
        C03O0.LIZ.getClass();
        C03O0.LJZ();
        if (this.LLILLL || this.LLILZ) {
            if (this.LLILZIL != null && C836003Ok.LIZ() && C837303Ox.LIZ().usRetryCashierRepeatedlyShown) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI;
                orderSubmitAssemViewModel.g0 = false;
                orderSubmitAssemViewModel.f351h0 = false;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLJJLI;
            if (this.LLILZIL != null) {
                str2 = "payment_retry";
            } else {
                str2 = "payment_method";
            }
            orderSubmitAssemViewModel2.LLZLLIL = str2;
            C03LU c03lu = orderSubmitAssemViewModel2.LLLL;
            if (c03lu != null) {
                orderSubmitAssemViewModel2.withState(new AwS367S0200000_1(orderSubmitAssemViewModel2, c03lu, 180));
            }
        }
        return Unit.LIZ;
    }
}
