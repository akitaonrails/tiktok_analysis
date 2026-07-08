package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;

/* JADX INFO: renamed from: X.03v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996703v3 {
    public static final boolean LIZ(SkuItem skuItem) {
        int iIntValue;
        Integer num = skuItem.stockNum;
        if (num == null) {
            return false;
        }
        int iIntValue2 = num.intValue();
        Integer num2 = skuItem.minBuyQuantity;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue2 <= 0 || iIntValue2 < iIntValue) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0438  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r30, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r31, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r32) {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C996703v3.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM):void");
    }
}
