package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.030m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7738030m extends C035N<C748802wA> implements InterfaceC7745030t {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.InterfaceC7745030t
    public final void LJIILL() {
        this.LIZJ.LLLLLLZZ = Boolean.TRUE;
    }

    @Override // X.InterfaceC7745030t
    public final C737602uM LJJIJIIJI() {
        C1013003xg c1013003xg = IPdpStarter.LIZ;
        HashMap<String, Object> map = this.LIZJ.LLLIL;
        c1013003xg.getClass();
        int iLIZ = C1013003xg.LIZ(map);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
        String strXR2 = orderSubmitAssemViewModel.XR2(orderSubmitAssemViewModel.LLLIL);
        HashMap<String, Object> map2 = this.LIZJ.LLLIL;
        return new C737602uM(iLIZ, strXR2, String.valueOf(map2 != null ? map2.get("author_id") : null));
    }

    @Override // X.InterfaceC7745030t
    public final String LJJJJLI() {
        String str;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
        SkuPanelState skuPanelState = orderSubmitAssemViewModel.LLLLLLLLLL;
        return (skuPanelState == null || (str = skuPanelState.skuId) == null) ? orderSubmitAssemViewModel.LLLLLLLZIL : str;
    }

    @Override // X.InterfaceC7745030t
    public final Integer LJJL() {
        return this.LIZJ.LLLLLLZ;
    }

    @Override // X.InterfaceC7745030t
    public final void LJJLL() {
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZJ;
        orderSubmitAssemViewModel.LLLLLLLLLL = null;
        orderSubmitAssemViewModel.LLLLLLLZIL = null;
        orderSubmitAssemViewModel.LLLLLLZ = null;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C748802wA(null);
    }

    public C7738030m(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC7745030t
    public final void LJJJIL(List<AddonProductInfo> list) {
        this.LIZJ.LLLLLLJ = list;
    }

    @Override // X.InterfaceC7745030t
    public final void LJIILLIIL(int i, String str) {
        this.LIZJ.LLLLLZIL.put(str, Integer.valueOf(i));
    }
}
