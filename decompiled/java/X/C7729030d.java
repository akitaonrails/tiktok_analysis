package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.030d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7729030d extends C1002203vw<OrderSubmitAssemViewModel> implements C034C {
    public final ArrayList<C719202rO> LLILLJJLI = new ArrayList<>();

    @Override // X.C034C
    public final void LK() {
    }

    @Override // X.C034C
    public final void Z31() {
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        BillInfoData billInfoData = orderSubmitAssemViewModelLIZ.LLJJI;
        if (billInfoData != null) {
            List<ShopOrderNew> list = billInfoData.newShopOrders;
            if (billInfoData.addonOrder != null || list == null || list.isEmpty()) {
                return;
            }
            BillInfoData billInfoData2 = orderSubmitAssemViewModelLIZ.LLJJI;
            orderSubmitAssemViewModelLIZ.LLJJI = billInfoData2 != null ? BillInfoData.LIZ(billInfoData2, orderSubmitAssemViewModelLIZ.LLIZ, null, null, null, null, null, null, null, -2, -1, 65535) : null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c5 A[PHI: r10
      0x02c5: PHI (r10v19 java.lang.String) = (r10v17 java.lang.String), (r10v20 java.lang.String) binds: [B:156:0x02ed, B:142:0x02c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c6 A[PHI: r8
      0x04c6: PHI (r8v2 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>) = 
      (r8v0 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
      (r8v4 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
      (r8v5 java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>)
     binds: [B:247:0x04c5, B:242:0x04b7, B:230:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05fb A[PHI: r10
      0x05fb: PHI (r10v6 boolean) = (r10v5 boolean), (r10v8 boolean) binds: [B:279:0x059c, B:281:0x05a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9 A[PHI: r7
      0x01a9: PHI (r7v12 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r7v11 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r7v16 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:89:0x01a6, B:74:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // X.C034C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> wA0(X.C7731030f r39) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7729030d.wA0(X.030f):java.util.List");
    }
}
