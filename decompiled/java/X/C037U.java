package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OrderSummaryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* JADX INFO: renamed from: X.037U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037U {
    public View LIZ;
    public OrderSubmitAssemViewModel LIZIZ;
    public OrderSummaryViewModel LIZJ;

    public final void LIZ(LaneParams laneParams) {
        String strLIZIZ;
        BillInfoData billInfoData;
        laneParams.put("module_name", "donation");
        laneParams.put("page_name", "order_submit");
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZIZ;
        if (orderSubmitAssemViewModel != null && (billInfoData = orderSubmitAssemViewModel.LLJJI) != null) {
            strLIZIZ = C839403Ps.LIZIZ(billInfoData);
        } else {
            strLIZIZ = null;
        }
        laneParams.put("product_id", String.valueOf(strLIZIZ));
    }
}
