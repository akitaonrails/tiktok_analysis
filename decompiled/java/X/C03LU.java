package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03LU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LU {
    public final OrderSubmitAssemViewModel LIZ;
    public final ECBaseFragment LIZIZ;
    public final OspBottomViewModel LIZJ;
    public final List<C03LX> LIZLLL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C03LW r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03LU.LIZ(X.03LW):void");
    }

    public final void LIZIZ(String str) {
        new C1548590qOv().LIZ(str);
        OrderSubmitAssemViewModel.AQ2(this.LIZ, this.LIZIZ.getContext(), null, null, null, 30);
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> mapHi1 = this.LIZ.hi1(false);
        c03o0.getClass();
        C03O0.LJJLIIIJLJLI(mapHi1);
        OspBottomViewModel ospBottomViewModel = this.LIZJ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
        AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(this, 936);
        ospBottomViewModel.getClass();
        OspBottomViewModel.yQ2(orderSubmitAssemViewModel, awS580S0100000_1);
        AnonymousClass0378.LIZ().LIZ("ec_close_sku_panel_opt", "{}");
    }

    public C03LU(OrderSubmitAssemViewModel orderSubmitAssemViewModel, ECBaseFragment eCBaseFragment, OspAddressViewModel ospAddressViewModel, PaymentInfoViewModel paymentInfoViewModel, OspBottomViewModel ospBottomViewModel, OspShopViewModel ospShopViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = eCBaseFragment;
        this.LIZJ = ospBottomViewModel;
    }
}
