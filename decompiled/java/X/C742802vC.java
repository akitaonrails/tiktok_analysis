package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C742802vC extends C035N<C729202t0> implements InterfaceC769002zQ, AnonymousClass0320 {
    public final OrderSubmitAssemViewModel LIZJ;
    public C741702v1 LIZLLL;
    public List<ShopOrderNew> LJ = C13BV.INSTANCE;

    @Override // X.InterfaceC767902zF
    public final Map<String, List<MainOrderInfo>> LIZJ() {
        return C7806033c.LJIILJJIL(this.LJ);
    }

    @Override // X.AnonymousClass0320
    public final boolean LJJIJLIJ() {
        C741702v1 c741702v1 = this.LIZLLL;
        if (c741702v1 != null) {
            return Intrinsics.LJFF(c741702v1.LIZJ, Boolean.TRUE);
        }
        return false;
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729202t0(null);
    }

    @Override // X.InterfaceC767902zF
    public final C741702v1 LJIIZILJ() {
        return this.LIZLLL;
    }

    public C742802vC(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC767902zF
    public final List<ShopOrderNew> LIZIZ(BillInfoData billInfoData) {
        return C7806033c.LJI(billInfoData);
    }

    @Override // X.InterfaceC767902zF
    public final boolean LJIJ(List<ShopOrderNew> list) {
        return C7806033c.LIZ(list);
    }

    @Override // X.AnonymousClass0320
    public final boolean LJIJJLI(BillInfoData billInfoData) {
        if (billInfoData == null || !(!C7806033c.LJI(billInfoData).isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
        this.LJ = billInfoData.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[PHI: r1 r4
      0x004c: PHI (r1v12 X.02rO) = (r1v10 X.02rO), (r1v17 X.02rO) binds: [B:45:0x0095, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r4v8 X.02rP) = (r4v6 X.02rP), (r4v11 X.02rP) binds: [B:45:0x0095, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    @Override // X.InterfaceC769002zQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r19, boolean r20, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r21, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r22, java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo>> r23) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C742802vC.LJJLIIIJL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, boolean, java.util.List, java.util.List, java.util.Map):void");
    }
}
