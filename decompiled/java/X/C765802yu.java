package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.02yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C765802yu extends C035N<C742302v7> implements AnonymousClass0312, InterfaceC765902yv {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.AnonymousClass0312
    public final void LJIIJJI() {
        this.LIZJ.LLLLLJIL = true;
    }

    @Override // X.AnonymousClass0312
    public final boolean LJJIIZ() {
        return this.LIZJ.C;
    }

    @Override // X.AnonymousClass0312
    public final boolean LJJIJIL() {
        return this.LIZJ.LLLLLJIL;
    }

    @Override // X.AnonymousClass0312
    public final boolean LJJJLIIL() {
        InterfaceC765702yt interfaceC765702yt = (InterfaceC765702yt) this.LIZJ.vr2(InterfaceC765702yt.class);
        return (interfaceC765702yt == null || interfaceC765702yt.LJJJJ()) ? false : true;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C742302v7(null);
    }

    public C765802yu(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.AnonymousClass0312
    public final boolean LJ(BillInfoData billInfoData) {
        Map<String, List<MainOrderInfo>> mapLIZJ;
        InterfaceC765702yt interfaceC765702yt = (InterfaceC765702yt) this.LIZJ.vr2(InterfaceC765702yt.class);
        List<ShopOrderNew> listLIZIZ = null;
        if (interfaceC765702yt != null) {
            mapLIZJ = interfaceC765702yt.LIZJ();
            listLIZIZ = interfaceC765702yt.LIZIZ(billInfoData);
        } else {
            mapLIZJ = null;
        }
        if ((listLIZIZ != null && !listLIZIZ.isEmpty()) || mapLIZJ == null || !(!mapLIZJ.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC765902yv
    public final boolean LJJJJI(BillInfoData billInfoData) {
        return billInfoData.LJIIJJI();
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        int i;
        LJJZZIII(new AwS580S0100000_1(billInfoData, 941));
        ((LinkedHashMap) this.LIZ).clear();
        Map<String, Object> map = this.LIZ;
        ShippingAddress shippingAddress = billInfoData.shippingAddress;
        if (shippingAddress != null && shippingAddress.shippingAddress != null) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("is_delivery_info_complete", Integer.valueOf(i));
    }
}
