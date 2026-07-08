package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03LY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LY implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final View LIZIZ;
    public final OspBottomViewModel LIZJ;

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        Context context;
        C03JV state = this.LIZ.getState();
        View view = this.LIZIZ;
        if (view != null && (context = view.getContext()) != null) {
            if (state.LLLLLJLJLL == 2) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                orderSubmitAssemViewModel.getClass();
                orderSubmitAssemViewModel.withState(new AwS580S0100000_1(orderSubmitAssemViewModel, 389));
                this.LIZ.w = 4;
                String strLIZJ = this.LIZ.LLLZLZ.LIZJ("c7497.d4784", null);
                GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData = this.LIZ.LLLZZIL;
                if (getAddonPanelLayoutResponseData != null && Intrinsics.LJFF(getAddonPanelLayoutResponseData.showPanel, Boolean.TRUE)) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                    if (orderSubmitAssemViewModel2.t != null) {
                        orderSubmitAssemViewModel2.xQ2(new AwS43S1300000_1(this, context, state, strLIZJ, 24), false);
                        C03O0 c03o0 = C03O0.LIZ;
                        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
                        OspBottomViewModel ospBottomViewModel = this.LIZJ;
                        c03o0.getClass();
                        C03O0.LLFZ(str, orderSubmitAssemViewModel3, str2, ospBottomViewModel, null, false);
                        return C03LS.SOFT_INTERCEPT;
                    }
                }
            }
            return null;
        }
        return C03LS.SOFT_INTERCEPT;
    }

    public C03LY(View view, OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = view;
        this.LIZJ = ospBottomViewModel;
    }
}
