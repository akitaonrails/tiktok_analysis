package X;

import Y.ARunnableS7S1100000_1;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03LT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LT implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final View LIZIZ;
    public final OspBottomViewModel LIZJ;

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        OspPlaceOrderButton ospPlaceOrderButton;
        String str3;
        View view;
        BillInfoData billInfoData = this.LIZ.LLJJI;
        if (billInfoData != null && (ospPlaceOrderButton = billInfoData.ospPlaceOrderButton) != null && (str3 = ospPlaceOrderButton.disableToast) != null && (view = this.LIZIZ) != null) {
            HandlerHook.viewPost(view, new ARunnableS7S1100000_1(view, str3, 7));
            C1748720vbi.LIZLLL(view, new AnonymousClass0481(), new AwS580S0100000_1(this, 1117));
            C03O0 c03o0 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
            OspBottomViewModel ospBottomViewModel = this.LIZJ;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel, null, false);
            return C03LS.PURCHASE_LIMIT;
        }
        return null;
    }

    public C03LT(View view, OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = view;
        this.LIZJ = ospBottomViewModel;
    }
}
