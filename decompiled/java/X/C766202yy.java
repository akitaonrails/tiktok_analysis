package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.02yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C766202yy extends C035N<C729302t1> implements InterfaceC765702yt, InterfaceC769102zR, AnonymousClass0320 {
    public final OrderSubmitAssemViewModel LIZJ;
    public List<ShopOrderNew> LIZLLL = C13BV.INSTANCE;

    @Override // X.AnonymousClass0320
    public final boolean LJJIJLIJ() {
        return false;
    }

    @Override // X.InterfaceC765702yt
    public final Map<String, List<MainOrderInfo>> LIZJ() {
        return C7806033c.LJIILJJIL(this.LIZLLL);
    }

    @Override // X.InterfaceC765702yt
    public final boolean LJJJJ() {
        return this.LIZJ.h.LIZJ();
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729302t1(null);
    }

    public C766202yy(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC765702yt
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

    @Override // X.InterfaceC769102zR
    public final boolean LJIL(BillInfoData billInfoData) {
        InterfaceC765902yv interfaceC765902yv = (InterfaceC765902yv) this.LIZJ.vr2(InterfaceC765902yv.class);
        if (interfaceC765902yv != null && interfaceC765902yv.LJJJJI(billInfoData)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC769102zR
    public final void LJJLIIIIJ(C733902tl c733902tl) {
        C1440005kM.LIZ(new C766302yz(c733902tl));
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        this.LIZLLL = billInfoData.LIZIZ();
    }
}
