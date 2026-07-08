package X;

/* JADX INFO: renamed from: X.02YL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YL {
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C703402oq LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r11, boolean r12) {
        /*
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r11.newShopOrders
            r3 = 0
            if (r0 == 0) goto Lab
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew) r0
            if (r0 == 0) goto Lab
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo> r0 = r0.mainOrderInfos
            if (r0 == 0) goto Lab
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo) r0
            if (r0 == 0) goto Lab
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r0 = r0.packedSkus
            if (r0 == 0) goto Lab
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku) r0
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem r2 = r0.singlePrice
        L27:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew> r0 = r11.newShopOrders
            if (r0 == 0) goto La2
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew) r0
            if (r0 == 0) goto La2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo> r0 = r0.mainOrderInfos
            if (r0 == 0) goto La2
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo) r0
            if (r0 == 0) goto La2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku> r0 = r0.packedSkus
            if (r0 == 0) goto La2
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku) r0
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice r1 = r0.rangePrice
            if (r1 == 0) goto La3
            r0 = 1
            java.lang.String r5 = r1.discountFull
        L52:
            if (r0 == 0) goto L95
            if (r1 == 0) goto L95
            java.lang.String r6 = r1.minPricePrefix
        L58:
            java.lang.String r7 = r1.minPriceFull
        L5a:
            if (r0 == 0) goto L8e
            if (r1 == 0) goto L93
            java.lang.String r9 = r1.originPriceFull
        L60:
            if (r0 == 0) goto L87
            if (r1 == 0) goto L8c
            java.lang.Boolean r1 = r1.needIcon
        L66:
            X.02oq r2 = new X.02oq
            X.03o5 r4 = new X.03o5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r10 = 8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection r1 = r11.skuSelection
            if (r1 == 0) goto L85
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO r0 = r1.promotionLabels
        L7b:
            if (r12 == 0) goto L81
            if (r1 == 0) goto L81
            com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner r3 = r1.skuPanelWaistBanner
        L81:
            r2.<init>(r4, r0, r3)
            return r2
        L85:
            r0 = r3
            goto L7b
        L87:
            if (r2 == 0) goto L8c
            java.lang.Boolean r1 = r2.needIcon
            goto L66
        L8c:
            r1 = r3
            goto L66
        L8e:
            if (r2 == 0) goto L93
            java.lang.String r9 = r2.originPriceFull
            goto L60
        L93:
            r9 = r3
            goto L60
        L95:
            r6 = r3
            if (r0 == 0) goto L9b
            if (r1 == 0) goto La0
            goto L58
        L9b:
            if (r2 == 0) goto La0
            java.lang.String r7 = r2.salePriceFull
            goto L5a
        La0:
            r7 = r3
            goto L5a
        La2:
            r1 = r3
        La3:
            r0 = 0
            if (r2 == 0) goto La9
            java.lang.String r5 = r2.discountFull
            goto L52
        La9:
            r5 = r3
            goto L52
        Lab:
            r2 = r3
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02YL.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, boolean):X.02oq");
    }
}
