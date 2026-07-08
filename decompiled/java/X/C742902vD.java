package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.02vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742902vD extends C035N<C729002sy> implements InterfaceC770602zg, AnonymousClass0320 {
    public final OrderSubmitAssemViewModel LIZJ;
    public List<ShopOrderNew> LIZLLL = C13BV.INSTANCE;

    @Override // X.AnonymousClass0320
    public final boolean LJJIJLIJ() {
        return false;
    }

    @Override // X.InterfaceC770502zf
    public final Map<String, List<MainOrderInfo>> LIZJ() {
        return C7806033c.LJIILJJIL(this.LIZLLL);
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729002sy(null);
    }

    public C742902vD(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC770502zf
    public final List<ShopOrderNew> LIZIZ(BillInfoData billInfoData) {
        return C7806033c.LJI(billInfoData);
    }

    @Override // X.AnonymousClass0320
    public final boolean LJIJJLI(BillInfoData billInfoData) {
        if (billInfoData == null || !(!C7806033c.LJI(billInfoData).isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC770602zg
    public final void LJII(String str, List<PackedSku> list) {
        this.LIZJ.r0.put(str, list);
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        this.LIZLLL = billInfoData.LIZIZ();
    }
}
