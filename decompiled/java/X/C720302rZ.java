package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720302rZ {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r15) {
        /*
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r15.newShopOrders
            if (r0 == 0) goto L6e
            java.util.Iterator r7 = r0.iterator()
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r7.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo> r0 = r0.mainOrderInfos
            if (r0 == 0) goto Ld
            java.util.Iterator r6 = r0.iterator()
        L21:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Ld
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo) r5
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO> r0 = r5.logistics
            if (r0 == 0) goto L68
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L3a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO) r0
            java.lang.String r1 = r0.logisticsServiceId
            java.lang.String r0 = r5.selectedLogisticsServiceId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3a
            r4.add(r2)
            goto L3a
        L55:
            java.lang.Object r0 = X.C13LP.LJJJLL(r4)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO) r0
            if (r0 == 0) goto L68
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.eventTrackInfo
            if (r0 == 0) goto L68
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r0)
            if (r0 == 0) goto L68
            goto L6a
        L68:
            java.lang.String r0 = ""
        L6a:
            r8.add(r0)
            goto L21
        L6e:
            java.lang.String r9 = ","
            r10 = 0
            r12 = 0
            r0 = 383(0x17f, float:5.37E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r14 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r15 = 30
            r11 = r10
            r13 = r10
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720302rZ.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData):java.lang.String");
    }

    public static final C7735030j LIZIZ(PackedSku packedSku) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        QuantityControlInfo quantityControlInfo = packedSku.quantityControlInfo;
        int iIntValue3 = 200;
        int iIntValue4 = 1;
        if (quantityControlInfo != null) {
            Integer num2 = quantityControlInfo.min;
            if (num2 != null) {
                iIntValue4 = num2.intValue();
            }
            Integer num3 = quantityControlInfo.max;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            }
            return new C7735030j(iIntValue4, iIntValue3);
        }
        Integer num4 = packedSku.stock;
        if (num4 != null) {
            iIntValue3 = num4.intValue();
            Integer num5 = packedSku.purchaseLimit;
            if (num5 != null) {
                iIntValue3 = Math.min(iIntValue3, num5.intValue());
            }
        } else {
            Integer num6 = packedSku.purchaseLimit;
            if (num6 != null) {
                iIntValue3 = num6.intValue();
            }
        }
        SkuQuantityProperty skuQuantityProperty = packedSku.quantityProperty;
        if (skuQuantityProperty != null && Intrinsics.LJFF(skuQuantityProperty.canLessThanDefaultQuantity, Boolean.FALSE) && (num = packedSku.quantityProperty.defaultAddCartQuantity) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        Integer num7 = packedSku.minBuyQuantity;
        if (num7 != null && (iIntValue2 = num7.intValue()) > 1) {
            iIntValue = iIntValue2;
        }
        if (iIntValue <= iIntValue3) {
            iIntValue4 = iIntValue;
        }
        return new C7735030j(iIntValue4, iIntValue3);
    }

    public static final int LIZLLL(PackedSku packedSku) {
        Integer num;
        if (packedSku != null && (num = packedSku.skuAmount) != null) {
            return num.intValue();
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C03P2 LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r15) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720302rZ.LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary):X.03P2");
    }

    public static final C737802uO LIZJ(MainOrderInfo mainOrderInfo, int i) {
        List<PackedSku> list;
        PackedSku packedSku;
        SkuPrice skuPrice;
        float fFloatValue;
        String currency;
        float fFloatValue2;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        String priceVal;
        Float fLJIIIIZZ3;
        if ((i != 0 && i != 2) || (list = mainOrderInfo.packedSkus) == null || (packedSku = (PackedSku) C13LP.LJJJLL(list)) == null || (skuPrice = packedSku.price) == null) {
            return null;
        }
        Price price = skuPrice.realPrice;
        if (price != null && (priceVal = price.getPriceVal()) != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
            fFloatValue = fLJIIIIZZ3.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Price price2 = skuPrice.realPrice;
        if (price2 != null) {
            currency = price2.getCurrency();
        } else {
            currency = null;
        }
        String str = skuPrice.originalPrice;
        if (str != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str)) != null) {
            fFloatValue2 = fLJIIIIZZ2.floatValue();
        } else {
            String str2 = skuPrice.originalPriceVal;
            if (str2 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str2)) != null) {
                fFloatValue2 = fLJIIIIZZ.floatValue();
            } else {
                fFloatValue2 = fFloatValue;
            }
        }
        return new C737802uO(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), currency);
    }
}
