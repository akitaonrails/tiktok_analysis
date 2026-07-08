package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.List;

/* JADX INFO: renamed from: X.03LL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LL extends C1002203vw<OrderSubmitAssemViewModel> implements C03LQ {
    @Override // X.C03LQ
    public final List<C03LX> fC(ECBaseFragment eCBaseFragment, OspAddressViewModel ospAddressViewModel, PaymentInfoViewModel paymentInfoViewModel, OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel) {
        return C1697810uHb.LJIIJJI(new C817903Hl(LIZ(), eCBaseFragment.getView(), ospAddressViewModel, ospBottomViewModel, ospShopViewModel), new C03I6(eCBaseFragment.getView(), ospBottomViewModel, ospAddressViewModel, LIZ()), new C833503Nl(LIZ(), eCBaseFragment, paymentInfoViewModel, ospBottomViewModel), new C7955038v(ospBottomViewModel, LIZ()));
    }
}
