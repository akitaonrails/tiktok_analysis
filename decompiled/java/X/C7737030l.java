package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;

/* JADX INFO: renamed from: X.030l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7737030l extends C1002203vw<OrderSubmitAssemViewModel> implements C034C {
    @Override // X.C034C
    public final void LK() {
    }

    @Override // X.C034C
    public final void Z31() {
        List<ShopOrderNew> list;
        AddonOrder addonOrder;
        Integer num;
        ExceptionUX exceptionUX;
        Integer num2;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLIZ = LIZ();
        BillInfoData billInfoData = orderSubmitAssemViewModelLIZ.LLJJI;
        if (billInfoData != null) {
            list = billInfoData.newShopOrders;
            addonOrder = billInfoData.addonOrder;
        } else {
            list = null;
            addonOrder = null;
        }
        ExceptionUX exceptionUX2 = orderSubmitAssemViewModelLIZ.LLJ;
        boolean z = exceptionUX2 != null && (((num = exceptionUX2.exceptionUXType) != null && num.intValue() == 8) || !((exceptionUX = orderSubmitAssemViewModelLIZ.LLJ) == null || (num2 = exceptionUX.exceptionUXType) == null || num2.intValue() != 17));
        if (addonOrder != null || list == null || list.isEmpty() || z) {
            return;
        }
        BillInfoData billInfoData2 = orderSubmitAssemViewModelLIZ.LLJJI;
        orderSubmitAssemViewModelLIZ.LLJJI = billInfoData2 != null ? BillInfoData.LIZ(billInfoData2, orderSubmitAssemViewModelLIZ.LLIZ, null, null, null, null, null, null, null, -2, -1, 65535) : null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0328 A[LOOP:8: B:160:0x0322->B:162:0x0328, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0387 A[PHI: r4
      0x0387: PHI (r4v13 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r4v12 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r4v18 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:171:0x0383, B:137:0x02c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x084d  */
    @Override // X.C034C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> wA0(X.C7731030f r41) {
        /*
            Method dump skipped, instruction units count: 2450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7737030l.wA0(X.030f):java.util.List");
    }
}
