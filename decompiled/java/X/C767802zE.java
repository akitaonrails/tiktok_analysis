package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C767802zE extends C035N<C731302tL> implements AnonymousClass0313 {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731302tL(0);
    }

    public C767802zE(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.AnonymousClass0313
    public final boolean LJJIZ(BillInfoData billInfoData) {
        List<ShopOrderNew> listLIZIZ;
        Map<String, List<MainOrderInfo>> mapLIZJ;
        InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZJ.vr2(InterfaceC767902zF.class);
        if (interfaceC767902zF != null) {
            C741702v1 c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ();
            if (interfaceC767902zF != null && (listLIZIZ = interfaceC767902zF.LIZIZ(billInfoData)) != null && listLIZIZ.isEmpty() && (mapLIZJ = interfaceC767902zF.LIZJ()) != null && (!mapLIZJ.isEmpty())) {
                return true;
            }
            if (c741702v1LJIIZILJ != null && Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.TRUE)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AnonymousClass0313
    public final boolean LJJJ(List<ShopOrderNew> list) {
        InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZJ.vr2(InterfaceC767902zF.class);
        if (interfaceC767902zF != null) {
            return interfaceC767902zF.LJIJ(list);
        }
        return false;
    }
}
