package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.List;

/* JADX INFO: renamed from: X.03LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public interface C03LQ extends InterfaceC1025703zj<OrderSubmitAssemViewModel> {
    List<C03LX> fC(ECBaseFragment eCBaseFragment, OspAddressViewModel ospAddressViewModel, PaymentInfoViewModel paymentInfoViewModel, OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel);
}
