package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.030n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7739030n extends C035N<C729702t5> implements InterfaceC7746030u {
    public final OrderSubmitAssemViewModel LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC7746030u
    public final String LJJIJIIJIL() {
        return this.LIZJ.qR2();
    }

    @Override // X.InterfaceC7746030u
    public final boolean LJJLIIIJJI() {
        return this.LIZJ.LLILLJJLI;
    }

    @Override // X.InterfaceC7746030u
    public final int LJJLJ() {
        return this.LIZJ.LL;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729702t5(0);
    }

    @Override // X.InterfaceC7746030u
    public final String getChainKey() {
        return this.LIZJ.LLJIJIL;
    }

    @Override // X.InterfaceC7746030u
    public final boolean LJJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC7746030u
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LIZLLL;
    }

    public C7739030n(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC7746030u
    @InterfaceC1294060jmO
    public final void LJJIFFI(Function1<? super C03JV, C03JV> function1) {
        this.LIZJ.setState(function1);
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        Map<String, List<MainOrderInfo>> mapLJIILIIL = C7806033c.LJIILIIL(billInfoData);
        List<ShopOrderNew> listLJI = C7806033c.LJI(billInfoData);
        this.LIZLLL = C7806033c.LIZ(billInfoData.newShopOrders);
        if (((ArrayList) listLJI).isEmpty()) {
            mapLJIILIIL.isEmpty();
        }
        this.LJ = !r1.isEmpty();
    }
}
