package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.02vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C743002vE extends C035N<C730002t8> implements InterfaceC769702zX {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730002t8(0);
    }

    public C743002vE(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC769702zX
    public final void LJJIIJ(BillInfoData billInfoData, boolean z) {
        this.LIZJ.zQ2(C724902sJ.LIZIZ(billInfoData, z, EnumC804203Ce.SINGLE_LINE, 0, false, 12));
    }
}
