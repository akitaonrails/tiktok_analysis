package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECLatamOspFlowOpt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS16S0010000_1;

/* JADX INFO: renamed from: X.02zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C770902zj extends C035N<C731202tK> implements AnonymousClass0315 {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731202tK(0);
    }

    public C770902zj(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.AnonymousClass0315
    public final boolean LJ(BillInfoData billInfoData) {
        Map<String, List<MainOrderInfo>> mapLIZJ;
        InterfaceC770502zf interfaceC770502zf = (InterfaceC770502zf) this.LIZJ.vr2(InterfaceC770502zf.class);
        List<ShopOrderNew> listLIZIZ = null;
        if (interfaceC770502zf != null) {
            mapLIZJ = interfaceC770502zf.LIZJ();
            listLIZIZ = interfaceC770502zf.LIZIZ(billInfoData);
        } else {
            mapLIZJ = null;
        }
        if ((listLIZIZ != null && !listLIZIZ.isEmpty()) || mapLIZJ == null || !(!mapLIZJ.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0315
    public final void LJJJI(boolean z) {
        if (ECLatamOspFlowOpt.LIZ() && ECLatamOspFlowOpt.LJ() && !z) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
            if (!orderSubmitAssemViewModel.C && !orderSubmitAssemViewModel.LLLLLJIL) {
                orderSubmitAssemViewModel.setState(new AwS16S0010000_1(17));
                orderSubmitAssemViewModel.LLLLLJIL = true;
            }
        }
    }
}
