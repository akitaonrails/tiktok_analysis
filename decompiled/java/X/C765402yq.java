package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.USPackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: renamed from: X.02yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C765402yq extends C035N<C765302yp> implements InterfaceC770002za {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.InterfaceC770002za
    public final Map LJJLI() {
        Map<String, List<MainOrderInfo>> mapLIZJ;
        InterfaceC765702yt interfaceC765702yt = (InterfaceC765702yt) this.LIZJ.vr2(InterfaceC765702yt.class);
        return (interfaceC765702yt == null || (mapLIZJ = interfaceC765702yt.LIZJ()) == null) ? C2097608Jq.LJ() : mapLIZJ;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C765302yp(0);
    }

    public C765402yq(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC770002za
    public final void LJII(String str, List<USPackedSku> list) {
        LJJZZIII(new AwS86S1200000_1(this, (C765402yq) str, (String) list, (List<USPackedSku>) 38));
        this.LIZJ.s0.put(str, list);
    }
}
