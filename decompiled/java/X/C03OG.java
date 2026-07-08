package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03OG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OrderSubmitAssemViewModel LL;
    public final /* synthetic */ PaymentInfo LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL = "place_order";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OG(OrderSubmitAssemViewModel orderSubmitAssemViewModel, PaymentInfo paymentInfo, Context context, String str) {
        super(0);
        this.LL = orderSubmitAssemViewModel;
        this.LLILLJJLI = paymentInfo;
        this.LLILLL = context;
        this.LLILZ = str;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [X.03P3] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PaymentMethodsData paymentMethodsData;
        String str;
        PaymentMethod paymentMethod = null;
        OrderSubmitAssemViewModel.JQ2(this.LL, this.LLILLJJLI, true, true, null, null, false, false, false, 504);
        C03Q4 c03q4 = C03Q4.LIZ;
        if (C03Q4.LJJ(c03q4, this.LLILLJJLI.LIZIZ)) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LL;
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            if (billInfoData != null) {
                paymentMethodsData = billInfoData.paymentMethods;
                str = billInfoData.billInfoParams;
            } else {
                paymentMethodsData = null;
                str = null;
            }
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(orderSubmitAssemViewModel);
            PaymentInfo paymentInfo = this.LLILLJJLI;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            }
            String value = C03OW.OSP_ANCHOR.getValue();
            String string = UUID.randomUUID().toString();
            final OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LL;
            final Context context = this.LLILLL;
            final String str2 = this.LLILZ;
            final String str3 = this.LLILZIL;
            C03Q4.LJIJJLI(c03q4, true, paymentMethodsData, str, viewModelScope, paymentMethod, false, value, string, new C03QH() { // from class: X.03P3
                @Override // X.C03QH
                public final void onFailed() {
                    orderSubmitAssemViewModel2.XQ2();
                }

                @Override // X.C03QH
                public final void onSuccess() {
                    OrderSubmitAssemViewModel.IS2(orderSubmitAssemViewModel2, context, str2, str3);
                }
            }, 32);
        } else {
            OrderSubmitAssemViewModel.IS2(this.LL, this.LLILLL, this.LLILZ, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
