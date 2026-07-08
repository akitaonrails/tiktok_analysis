package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03QN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QN {
    public static final C03QN LIZ = new C03QN();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0030 A[PHI: r1
      0x0030: PHI (r1v1 X.0vvT) = (r1v0 X.0vvT), (r1v4 X.0vvT) binds: [B:24:0x002d, B:14:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L24
            java.lang.String r0 = r4.productId
            if (r0 == 0) goto L2c
            X.0vvT r1 = X.C1759010vsJ.LIZ(r0)
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist r0 = r4.promotionWaist
            if (r0 == 0) goto L17
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CompatibleParams r0 = r0.compatibleParams
            if (r0 == 0) goto L17
            java.lang.String r2 = r0.flashSaleId
            if (r2 != 0) goto L1d
        L17:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r0 = r4.flashSale
            if (r0 == 0) goto L30
            java.lang.String r2 = r0.activityId
        L1d:
            if (r1 == 0) goto L25
            int r1 = r1.LJIIIZ
            r0 = 3
            if (r1 != r0) goto L25
        L24:
            return r3
        L25:
            if (r2 == 0) goto L24
            java.util.List r3 = java.util.Collections.singletonList(r2)
            return r3
        L2c:
            r1 = r3
            if (r4 == 0) goto L30
            goto Lb
        L30:
            r2 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LJFF(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r4
      0x0015: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v7 java.lang.String) binds: [B:9:0x0013, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[PHI: r4
      0x0023: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String), (r4v6 java.lang.String) binds: [B:9:0x0013, B:11:0x001b, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[PHI: r3 r4
      0x0026: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:15:0x0024, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r4v5 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:15:0x0024, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[PHI: r3 r4
      0x0034: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String), (r3v4 java.lang.String) binds: [B:15:0x0024, B:17:0x002c, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String), (r4v5 java.lang.String) binds: [B:15:0x0024, B:17:0x002c, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037 A[PHI: r2 r3 r4
      0x0037: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:21:0x0035, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:21:0x0035, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:21:0x0035, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo LJI(java.util.Map r6) {
        /*
            java.lang.String r5 = ""
            if (r6 == 0) goto L12
            java.lang.String r0 = "enter_from_info"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L12
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L15
        L12:
            r4 = r5
            if (r6 == 0) goto L23
        L15:
            java.lang.String r0 = "enter_from"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L23
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L26
        L23:
            r3 = r5
            if (r6 == 0) goto L34
        L26:
            java.lang.String r0 = "enter_from_merge"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L34
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L37
        L34:
            r2 = r5
            if (r6 == 0) goto L46
        L37:
            java.lang.String r0 = "previous_page"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L46
            r5 = r0
        L46:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDaInfo r1 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonDaInfo
            r1.<init>(r3, r4, r2, r5)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LJI(java.util.Map):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo");
    }

    public static String LJII(Map map) {
        Map mapLJ = C1741890vQh.LJ("entrance_info", map);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        List<String> list = C957303oh.LIZ().orderEntranceInfoKeys;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLJ.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BillInfoRequest LJIIIIZZ(BillInfoRequest billInfoRequest) {
        C03RS c03rsLIZIZ;
        BillInfoData billInfoData;
        if (!C953203o2.LIZIZ() && !C03RU.LIZ()) {
            return billInfoRequest;
        }
        String str = null;
        String strGenCacheKey = billInfoRequest.genCacheKey(null);
        boolean z = C843303Rf.LIZ;
        if (!C843303Rf.LIZJ(Integer.valueOf(billInfoRequest.getBuyType()), strGenCacheKey) || (c03rsLIZIZ = C843303Rf.LIZIZ(Integer.valueOf(billInfoRequest.getBuyType()), strGenCacheKey)) == null) {
            return billInfoRequest;
        }
        EnumC840403Qc enumC840403Qc = c03rsLIZIZ.LIZJ;
        if (enumC840403Qc != EnumC840403Qc.PRELOAD_API && enumC840403Qc != EnumC840403Qc.PRELOAD_FULL_DATA_API) {
            return billInfoRequest;
        }
        int value = C03DI.PRELOAD.getValue();
        BillInfoResponse billInfoResponse = c03rsLIZIZ.LIZIZ;
        if (billInfoResponse != null && (billInfoData = (BillInfoData) billInfoResponse.data) != null) {
            str = billInfoData.requestId;
        }
        return billInfoRequest.copy(billInfoRequest.buyerAddrId, billInfoRequest.buyType, billInfoRequest.orderShop, billInfoRequest.withProductInfo, billInfoRequest.withSellerInfo, billInfoRequest.withAddressInputItem, billInfoRequest.withPreRiskParam, billInfoRequest.promotionIds, billInfoRequest.useUserSelection, billInfoRequest.claimVoucherTypeIds, billInfoRequest.claimVoucherMetas, billInfoRequest.isNewPayment, billInfoRequest.paymentMethod, billInfoRequest.orderRequestParams, billInfoRequest.serverIssuedParams, billInfoRequest.activityIds, billInfoRequest.selectedAddonSKUIds, billInfoRequest.trafficSourceList, billInfoRequest.noticeVoucherTypeId, billInfoRequest.addOnProductInfos, billInfoRequest.oneStepOrderType, billInfoRequest.isFromFollow, billInfoRequest.billInfoParams, billInfoRequest.selectedVoucherMetas, billInfoRequest.preLogId, billInfoRequest.pageSourceInfo, billInfoRequest.clientTemplate, billInfoRequest.useBonusRedeem, billInfoRequest.extraInfo, new ChangeInfo(value, str, null, null), billInfoRequest.activityUserSelection, billInfoRequest.useActivityUserSelection, billInfoRequest.needCheckAddressUpgrade, billInfoRequest.oneClickPayContextString, billInfoRequest.addonPanelSnapInfo, billInfoRequest.ospScene, billInfoRequest.selectAddonOrderSkus, billInfoRequest.shippingAddressParam, billInfoRequest.emailAuthorizationSnapInfo, billInfoRequest.retryTime, billInfoRequest.flowType, billInfoRequest.addonScene, billInfoRequest.hideShippingAddonPanel, billInfoRequest.billInfoClientParam, billInfoRequest.identityInfo, billInfoRequest.paymentParam, billInfoRequest.payTrackInfo, billInfoRequest.couponSelectedStatus, billInfoRequest.financingDetails, billInfoRequest.previousPayOrderId, billInfoRequest.pipoErrorCodeParams, billInfoRequest.payRiskControlParams, billInfoRequest.withDonation, billInfoRequest.refundableSampleSelectStatus, billInfoRequest.displayedAddonProductId, billInfoRequest.ageConfirmStatus, billInfoRequest.oneStepFlowPageType);
    }

    public static boolean LJIIIZ(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_osp_check_login_switch", false)) {
            return true;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            C1019103yf.LIZ(EnumC1014603xw.ERR31, new RuntimeException("OrderSubmitStarter checkLogin activity == null!"), null);
            return true;
        }
        C013C c013c = new C013C();
        C03U5.LIZ(new AwS545S0100000_1(c013c, 1608), activityLIZ, null);
        return c013c.element;
    }

    public static HashMap LIZJ(IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, boolean z) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        String str4;
        StoreLabel storeLabel;
        StoreOfficialLabel storeOfficialLabel;
        String str5;
        PromotionView promotionView;
        List<PromotionItem> promotion_items;
        PickTag pickTag;
        Map<String, String> map;
        String str6;
        ProductBase productBase;
        ProductPrice productPrice;
        ProductBase productBase2;
        ProductPrice productPrice2;
        ProductBase productBase3;
        ProductPrice productPrice3;
        Integer num;
        Map<String, Object> map2;
        HashMap map3 = new HashMap();
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            map3.putAll(map2);
        }
        if (productPackStruct != null && (num = productPackStruct.status) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        map3.put("product_type", String.valueOf(iIntValue));
        if (z) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        map3.put("page_show_type", str);
        if (!map3.containsKey("previous_page")) {
            map3.put("previous_page", "product_detail");
        }
        String str7 = null;
        if (productPackStruct == null || (productBase3 = productPackStruct.baseInfo) == null || (productPrice3 = productBase3.priceInfo) == null || (str2 = productPrice3.originPrice) == null || a0.LJJJIL(str2)) {
            str2 = null;
        }
        if (productPackStruct == null || (productBase2 = productPackStruct.baseInfo) == null || (productPrice2 = productBase2.priceInfo) == null || (str3 = productPrice2.realPrice) == null || a0.LJJJIL(str3)) {
            str3 = null;
        }
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (productPrice = productBase.priceInfo) == null || (str4 = productPrice.discount) == null || a0.LJJJIL(str4)) {
            str4 = null;
        }
        String str8 = "";
        if (str2 == null) {
            if (str4 != null || str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
        }
        map3.put("original_price", str2);
        if (str4 != null) {
            if (str3 == null) {
                str3 = "";
            }
            map3.put("sale_price", str3);
        }
        if (productPackStruct != null && (map = productPackStruct.extra) != null && (str6 = map.get("mix_product_type")) != null) {
            str8 = str6;
        }
        map3.put("is_mix_product", str8);
        ArrayList arrayList = new ArrayList();
        if (productPackStruct != null && (pickTag = productPackStruct.activityInfo) != null) {
            str7 = pickTag.logExtra;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str7);
        if (mapLJIIJ != null) {
            arrayList.add(mapLJIIJ);
        }
        if (productPackStruct != null && (promotionView = productPackStruct.promotionView) != null && (promotion_items = promotionView.getPromotion_items()) != null) {
            Iterator<PromotionItem> it2 = promotion_items.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(it2.next().getLog_extra());
                if (mapLJIIJ2 != null) {
                    arrayList.add(mapLJIIJ2);
                }
            }
        }
        C04CA.LIZ(arrayList, map3);
        if (productPackStruct != null) {
            String strLIZIZ = productPackStruct.LIZIZ();
            if (strLIZIZ != null) {
                map3.put("flashsale_status", strLIZIZ);
            }
            SellerInfo sellerInfo = productPackStruct.sellerInfo;
            if (sellerInfo != null && (storeLabel = sellerInfo.storeLabel) != null && (storeOfficialLabel = storeLabel.officialLabel) != null && (str5 = storeOfficialLabel.labelTypeStr) != null && !a0.LJJJIL(str5)) {
                map3.put("logo_type", str5);
            }
        }
        return map3;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r44, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r45, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r46, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r47, int r48) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, int):com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r23, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r24, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r26, boolean r27) {
        /*
            r22 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme://ec/order_submit_v2"
            r1.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r1.append(r0)
            java.lang.String r18 = X.C2188811AlT.LIZIZ(r1)
            r5 = 0
            r1 = r23
            if (r1 == 0) goto Lbc
            java.lang.String r0 = r1.productId
            if (r0 == 0) goto Lbc
            X.0vvT r3 = X.C1759010vsJ.LIZ(r0)
        L21:
            X.00zU r0 = new X.00zU
            r0.<init>()
            r4 = r25
            if (r4 == 0) goto Lba
            r13 = 0
            r21 = 66846719(0x3fbffff, float:1.4811228E-36)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r13
            r15 = r5
            r16 = r5
            r17 = r5
            r19 = r5
            r20 = r5
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r7 = com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L43:
            if (r3 == 0) goto Lb8
            if (r1 == 0) goto Lb6
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist r2 = r1.promotionWaist
            if (r2 == 0) goto L53
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CompatibleParams r2 = r2.compatibleParams
            if (r2 == 0) goto L53
            java.lang.String r4 = r2.flashSaleId
            if (r4 != 0) goto L59
        L53:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r2 = r1.flashSale
            if (r2 == 0) goto Lb6
            java.lang.String r4 = r2.activityId
        L59:
            int r3 = r3.LJIIIZ
            r2 = 3
            if (r3 == r2) goto Lb4
            if (r4 == 0) goto Lb4
            java.util.List r9 = java.util.Collections.singletonList(r4)
        L64:
            r2 = 0
            X.0408 r10 = X.AnonymousClass0408.LIZ
            r3 = r26
            if (r3 == 0) goto Lb2
            java.lang.Integer r4 = r3.bizType
        L6d:
            X.03oM r11 = X.C955103oL.LIZ(r4)
            java.lang.String r12 = "order_submit"
            r15 = 12
            r13 = r5
            r14 = r5
            int r11 = X.AnonymousClass0408.LJIIJJI(r10, r11, r12, r13, r14, r15)
            r13 = 0
            r14 = 416(0x1a0, float:5.83E-43)
            r5 = r24
            r4 = r22
            r12 = r2
            r6 = r1
            r8 = r3
            r10 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r4 = LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.element = r4
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r4 = LJIIIIZZ(r4)
            r0.element = r4
            X.03WX r6 = X.C857103Wn.LIZ(r18)
            r4 = r27
            java.util.HashMap r5 = LIZJ(r3, r1, r4)
            X.03O0 r1 = X.C03O0.LIZ
            r1.getClass()
            X.C03O0.LJJI(r5)
            X.03Hh r4 = X.C817503Hh.LL
            X.1DFB r3 = X.C0PEM.LIZJ
            X.03WS r1 = new X.03WS
            r1.<init>(r6, r0, r5, r2)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r2, r1, r0)
            return r18
        Lb2:
            r4 = r5
            goto L6d
        Lb4:
            r9 = r5
            goto L64
        Lb6:
            r4 = r5
            goto L59
        Lb8:
            r9 = r5
            goto L64
        Lba:
            r7 = r5
            goto L43
        Lbc:
            r3 = r5
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest LIZ(X.C03QN r60, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r61, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r62, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r63, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r64, java.util.List r65, java.lang.String r66, int r67, java.lang.Integer r68, boolean r69, int r70) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LIZ(X.03QN, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, java.util.List, java.lang.String, int, java.lang.Integer, boolean, int):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca A[PHI: r1
      0x00ca: PHI (r1v1 X.0vvT) = (r1v0 X.0vvT), (r1v34 X.0vvT) binds: [B:76:0x00c6, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r51, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r52, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r53, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r54, java.lang.String r55, java.lang.Integer r56, com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo r57, com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo r58, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo r59, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo r60, java.lang.Integer r61) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo, java.lang.Integer):com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0379 A[PHI: r8
      0x0379: PHI (r8v9 java.lang.String) = (r8v8 java.lang.String), (r8v13 java.lang.String) binds: [B:252:0x0376, B:232:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x037d A[PHI: r7 r8
      0x037d: PHI (r7v7 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r7v6 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r7v9 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:255:0x037a, B:235:0x032c] A[DONT_GENERATE, DONT_INLINE]
      0x037d: PHI (r8v10 java.lang.String) = (r8v9 java.lang.String), (r8v12 java.lang.String) binds: [B:255:0x037a, B:235:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x039b A[PHI: r8
      0x039b: PHI (r8v6 java.lang.String) = (r8v5 java.lang.String), (r8v15 java.lang.String) binds: [B:267:0x0397, B:174:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee A[PHI: r3
      0x00ee: PHI (r3v20 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r3v26 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r3v28 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:82:0x012f, B:65:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132 A[PHI: r3
      0x0132: PHI (r3v25 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r3v20 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r3v26 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:67:0x00f0, B:82:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0136 A[PHI: r2 r3
      0x0136: PHI (r2v74 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice) = 
      (r2v70 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice)
      (r2v75 com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice)
     binds: [B:70:0x00f6, B:85:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r3v24 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = 
      (r3v21 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
      (r3v25 com.ss.android.ugc.aweme.ecommerce.service.vo.Image)
     binds: [B:70:0x00f6, B:85:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(X.C03QN r102, android.content.Context r103, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r104, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r105, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r106, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r107, boolean r108, java.lang.String r109, java.lang.Integer r110, java.lang.String r111, java.lang.String r112, java.lang.Integer r113, java.lang.Integer r114, int r115, int r116, com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo r117, java.lang.Float r118, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo r119, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo r120, int r121, int r122, int r123) {
        /*
            Method dump skipped, instruction units count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03QN.LJIIJ(X.03QN, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, int, com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo, java.lang.Float, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo, int, int, int):void");
    }
}
