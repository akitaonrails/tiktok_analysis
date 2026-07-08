package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.02xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755802xI extends C035N<C731002tI> implements InterfaceC769402zU {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.InterfaceC769402zU
    public final List<String> LJJJZ() {
        String[] strArr = this.LIZJ.N;
        if (strArr != null) {
            return C13LQ.LJJLL(strArr);
        }
        return null;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C731002tI(0);
    }

    public C755802xI(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }
}
