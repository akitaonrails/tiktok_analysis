package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.040w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10296040w {
    public static final C10296040w LIZ = new C10296040w();
    public static final LinkedHashMap<String, Object> LIZIZ = new LinkedHashMap<>();
    public static String LIZJ;

    public static String LIZ(Map map) {
        if (map == null) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append("\":");
            sbLIZ.append(((Number) entry.getValue()).intValue());
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }

    public static Map LIZIZ(SkuItem skuItem) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SkuSupply skuSupply = skuItem.skuSupply;
        String str2 = "";
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        linkedHashMap.put("seller_sku_id", str);
        String str3 = skuItem.skuId;
        if (str3 != null) {
            str2 = str3;
        }
        linkedHashMap.put("platform_sku_id", str2);
        return linkedHashMap;
    }

    public static void LJII(ProductPackStruct productPackStruct) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        String strValueOf;
        String str4;
        String str5;
        Integer num;
        HashMap<String, Object> mapLJIIJ;
        Map<String, String> trackParam;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        String str6;
        String str7;
        String str8;
        String str9;
        HashMap<String, Object> mapLJIIJ2;
        List<PromotionItem> promotion_items;
        String str10;
        ProductPrice productPrice;
        ProductPrice productPrice2;
        ProductPrice productPrice3;
        LinkedHashMap<String, Object> linkedHashMap = LIZIZ;
        Integer num2 = productPackStruct.status;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 1;
        }
        linkedHashMap.put("product_type", String.valueOf(iIntValue));
        ProductBase productBase = productPackStruct.baseInfo;
        String str11 = null;
        if (productBase != null && (productPrice3 = productBase.priceInfo) != null) {
            str = productPrice3.originPrice;
        } else {
            str = null;
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        ProductBase productBase2 = productPackStruct.baseInfo;
        if (productBase2 != null && (productPrice2 = productBase2.priceInfo) != null) {
            str2 = productPrice2.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductBase productBase3 = productPackStruct.baseInfo;
        if (productBase3 != null && (productPrice = productBase3.priceInfo) != null) {
            str3 = productPrice.discount;
            if (str3 != null && str3.length() == 0) {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        String str12 = "";
        if (str == null) {
            if (str3 != null || str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        linkedHashMap.put("original_price", str);
        Integer num3 = productPackStruct.bizType;
        if (num3 != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(num3.intValue()));
        }
        if (str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("sale_price", str2);
        }
        Map<String, String> map = productPackStruct.extra;
        if (map == null || map.get("mix_product_type") == null) {
            strValueOf = "";
        } else {
            Map<String, String> map2 = productPackStruct.extra;
            if (map2 != null) {
                str10 = map2.get("mix_product_type");
            } else {
                str10 = null;
            }
            strValueOf = String.valueOf(str10);
        }
        linkedHashMap.put("is_mix_product", strValueOf);
        WarehouseTag warehouseTag = productPackStruct.warehouseTag;
        if (warehouseTag != null) {
            String str13 = warehouseTag.fulfilledBy;
            if (str13 != null) {
                str12 = str13;
            }
            linkedHashMap.put("fulfilled_by", str12);
        } else {
            linkedHashMap.put("fulfilled_by", "no_label");
        }
        ArrayList arrayList = new ArrayList();
        PickTag pickTag = productPackStruct.activityInfo;
        if (pickTag != null) {
            str11 = pickTag.logExtra;
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(str11);
        if (mapLJIIJ3 != null) {
            arrayList.add(mapLJIIJ3);
        }
        PromotionView promotionView = productPackStruct.promotionView;
        if (promotionView != null && (promotion_items = promotionView.getPromotion_items()) != null) {
            Iterator<PromotionItem> it2 = promotion_items.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> mapLJIIJ4 = C1741890vQh.LJIIJ(it2.next().getLog_extra());
                if (mapLJIIJ4 != null) {
                    arrayList.add(mapLJIIJ4);
                }
            }
        }
        PromotionWaist promotionWaist = productPackStruct.promotionWaist;
        if (promotionWaist != null && (str9 = promotionWaist.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str9)) != null) {
            arrayList.add(mapLJIIJ2);
        }
        LinkedHashMap<String, Object> linkedHashMap2 = LIZIZ;
        C04CA.LIZ(arrayList, linkedHashMap2);
        ProductBase productBase4 = productPackStruct.baseInfo;
        if (productBase4 != null) {
            String str14 = productBase4.title;
            if (str14 != null) {
                linkedHashMap2.put("product_name", str14);
            }
            String str15 = productBase4.categoryName;
            if (str15 != null) {
                linkedHashMap2.put("product_category", str15);
            }
        }
        SellerInfo sellerInfo = productPackStruct.sellerInfo;
        if (sellerInfo != null && (str8 = sellerInfo.sellerId) != null) {
            linkedHashMap2.put("shop_id", str8);
        }
        List<SkuItem> list = productPackStruct.skus;
        String str16 = CardStruct.IStatusCode.DEFAULT;
        if (list != null) {
            Iterator<SkuItem> it3 = list.iterator();
            while (it3.hasNext()) {
                Integer num4 = it3.next().skuStatus;
                if (num4 != null && num4.intValue() == 2) {
                    str16 = "1";
                }
            }
        }
        LinkedHashMap<String, Object> linkedHashMap3 = LIZIZ;
        linkedHashMap3.put("is_sku_sold_out", str16);
        if (productPackStruct.LJII()) {
            str4 = "skc_version";
        } else {
            str4 = "sku_version";
        }
        linkedHashMap3.put("ttf_page_type", str4);
        Integer num5 = productPackStruct.bizType;
        if (num5 != null) {
            linkedHashMap3.put("biz_type", Integer.valueOf(num5.intValue()));
        }
        BrandInfo brandInfo = productPackStruct.brandInfo;
        if (brandInfo != null) {
            linkedHashMap3.put("seller_logo_type", C10472047q.LIZIZ(brandInfo));
        }
        SellerInfo sellerInfo2 = productPackStruct.sellerInfo;
        if (sellerInfo2 != null && (str7 = sellerInfo2.sellerId) != null) {
            linkedHashMap3.put("shop_id", str7);
        }
        if (Intrinsics.LJFF(productPackStruct.isPlatformProductLink, Boolean.TRUE)) {
            linkedHashMap3.putAll(productPackStruct.LIZLLL());
        }
        PDPLogisticModule pDPLogisticModule = productPackStruct.pdpLogisticModule;
        if (pDPLogisticModule != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null && (str6 = pDPShippingModuleMeta.deliveryFlag) != null) {
            linkedHashMap3.put("delivery_flag", str6);
        }
        BCMStandardTrack bCMStandardTrack = productPackStruct.bcmStandardTrack;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            linkedHashMap3.putAll(trackParam);
        }
        String str17 = productPackStruct.daInfo;
        if (str17 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str17)) != null) {
            linkedHashMap3.putAll(mapLJIIJ);
        }
        ProductBase productBase5 = productPackStruct.baseInfo;
        if (productBase5 != null && (num = productBase5.defaultSelectedPurchaseType) != null && num.intValue() != 0 && num.intValue() == 1) {
            str5 = "subscribe";
        } else {
            str5 = "one-time purchase";
        }
        linkedHashMap3.put("purchase_method", str5);
        PurchaseMethodInfo purchaseMethodInfo = productPackStruct.purchaseMethodInfo;
        if (purchaseMethodInfo != null) {
            List<PurchaseMethodItem> list2 = purchaseMethodInfo.itemList;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<PurchaseMethodItem> it4 = list2.iterator();
                while (it4.hasNext()) {
                    Integer num6 = it4.next().purchaseMethodType;
                    int value = EnumC10415045l.SUBSCRIBE.getValue();
                    if (num6 != null && num6.intValue() == value) {
                        LIZIZ.put("is_subscribe_available", 1);
                        return;
                    }
                }
            }
        }
        LIZIZ.put("is_subscribe_available", 0);
    }

    public static void LJFF(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "sku");
        linkedHashMap.put("exception_message", str);
        linkedHashMap.put("exts", str2);
        linkedHashMap.putAll(LIZIZ);
        C1018703yb.LIZIZ("rd_tiktokec_gec_custom_exception", linkedHashMap);
    }

    public static void LJI(ProductPackStruct productPackStruct, String[] strArr) {
        List<SkuItem> list;
        int i;
        String str;
        if (strArr != null) {
            String strLIZ = C968903qZ.LIZ(strArr);
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                SkuItem skuItem = (SkuItem) C04AW.LJ(strLIZ, list);
                LinkedHashMap<String, Object> linkedHashMap = LIZIZ;
                if (skuItem != null && (str = skuItem.lowStockWarning) != null && !a0.LJJJIL(str)) {
                    i = 0;
                } else {
                    i = 1;
                }
                linkedHashMap.put("is_low_stock", Integer.valueOf(i ^ 1));
            }
        }
    }

    public static void LIZJ(C10296040w c10296040w, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, C03W0 c03w0, String str8, Map map, Map map2, SkuSupply skuSupply, String str9, int i) {
        String str10 = str9;
        Map map3 = map2;
        Map map4 = map;
        String str11 = str8;
        C03W0 c03w02 = c03w0;
        String str12 = str7;
        String str13 = str5;
        Integer num2 = num;
        String str14 = str4;
        String str15 = str3;
        SkuSupply skuSupply2 = skuSupply;
        String str16 = str2;
        if ((i & 2) != 0) {
            str16 = null;
        }
        if ((i & 4) != 0) {
            str15 = null;
        }
        if ((i & 8) != 0) {
            str14 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str13 = null;
        }
        if ((i & 128) != 0) {
            str12 = null;
        }
        if ((i & 512) != 0) {
            c03w02 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map4 = null;
        }
        if ((i & 8192) != 0) {
            map3 = null;
        }
        if ((i & 16384) != 0) {
            skuSupply2 = null;
        }
        if ((i & 32768) != 0) {
            str10 = null;
        }
        c10296040w.getClass();
        C1018703yb.LJII("tiktokec_button_click", new C957603ok(c03w02, skuSupply2, null, num2, str, str16, str15, str14, str13, str6, str12, str11, str10, LIZIZ, null, map4, map3));
    }

    public static void LIZLLL(C10296040w c10296040w, String str, String str2, Integer num, String str3, String str4, String str5, Map map, Map map2, C03W0 c03w0, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str6, String str7, String str8, String str9, Map map3, String str10, Integer num2, SkuSupply skuSupply, String str11, String str12, SkuPanelState skuPanelState, UserRight userRight, int i) {
        SkuPanelState skuPanelState2 = skuPanelState;
        String str13 = str12;
        String str14 = str11;
        SkuSupply skuSupply2 = skuSupply;
        String str15 = str10;
        String str16 = str9;
        String str17 = str8;
        String str18 = str7;
        String str19 = str6;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        Boolean bool2 = bool;
        C03W0 c03w02 = c03w0;
        Map map4 = map2;
        Integer num3 = num2;
        Map map5 = map;
        UserRight userRight2 = null;
        if ((i & 64) != 0) {
            map5 = null;
        }
        if ((i & 128) != 0) {
            map4 = null;
        }
        if ((i & 256) != 0) {
            c03w02 = null;
        }
        if ((i & 512) != 0) {
            bool2 = null;
        }
        if ((i & 1024) != 0) {
            headerBannerDaInfo2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str19 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str18 = null;
        }
        if ((i & 8192) != 0) {
            str17 = null;
        }
        if ((i & 16384) != 0) {
            str16 = null;
        }
        if ((65536 & i) != 0) {
            str15 = null;
        }
        if ((131072 & i) != 0) {
            num3 = null;
        }
        if ((262144 & i) != 0) {
            skuSupply2 = null;
        }
        if ((524288 & i) != 0) {
            str14 = null;
        }
        if ((1048576 & i) != 0) {
            str13 = null;
        }
        if ((2097152 & i) != 0) {
            skuPanelState2 = null;
        }
        if ((i & 4194304) == 0) {
            userRight2 = userRight;
        }
        c10296040w.getClass();
        if (map5 == null) {
            map5 = LIZIZ;
        }
        C1018703yb.LJII("tiktokec_confirm_cart", new C045A(c03w02, userRight2, skuPanelState2, skuSupply2, headerBannerDaInfo2, bool2, num, num3, str15, str, str2, str3, str4, str16, str5, str19, str18, str17, str14, str13, map5, map4, map3));
    }

    public static void LJ(C10296040w c10296040w, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7, Map map, String str8, Map map2, int i, int i2, String str9, String str10, String str11, C03W0 c03w0, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str12, Boolean bool2, String str13, String str14, Map map3, String str15, String str16, Integer num6, Map map4, SkuSupply skuSupply, String str17, String str18, Map map5, LogisticDTO logisticDTO, SkuPanelState skuPanelState, UserRight userRight, InsuranceInfo insuranceInfo, int i3, int i4) {
        InsuranceInfo insuranceInfo2 = insuranceInfo;
        UserRight userRight2 = userRight;
        SkuPanelState skuPanelState2 = skuPanelState;
        LogisticDTO logisticDTO2 = logisticDTO;
        Map map6 = map5;
        String str19 = str18;
        String str20 = str17;
        SkuSupply skuSupply2 = skuSupply;
        Map map7 = map4;
        Integer num7 = num6;
        String str21 = str16;
        String str22 = str15;
        String str23 = str14;
        String str24 = str13;
        Boolean bool3 = bool2;
        String str25 = str12;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        Boolean bool4 = bool;
        C03W0 c03w02 = c03w0;
        String str26 = str11;
        String str27 = str10;
        String str28 = str9;
        int i5 = i2;
        int i6 = i;
        Map map8 = map2;
        String str29 = str8;
        Map map9 = map;
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map9 = null;
        }
        if ((i3 & 8192) != 0) {
            str29 = null;
        }
        if ((i3 & 16384) != 0) {
            map8 = null;
        }
        if ((32768 & i3) != 0) {
            i6 = 0;
        }
        if ((65536 & i3) != 0) {
            i5 = 0;
        }
        if ((131072 & i3) != 0) {
            str28 = null;
        }
        if ((262144 & i3) != 0) {
            str27 = null;
        }
        if ((524288 & i3) != 0) {
            str26 = null;
        }
        if ((1048576 & i3) != 0) {
            c03w02 = null;
        }
        if ((2097152 & i3) != 0) {
            bool4 = null;
        }
        if ((4194304 & i3) != 0) {
            headerBannerDaInfo2 = null;
        }
        if ((8388608 & i3) != 0) {
            str25 = null;
        }
        if ((16777216 & i3) != 0) {
            bool3 = null;
        }
        if ((33554432 & i3) != 0) {
            str24 = null;
        }
        if ((67108864 & i3) != 0) {
            str23 = null;
        }
        if ((268435456 & i3) != 0) {
            str22 = null;
        }
        if ((536870912 & i3) != 0) {
            str21 = null;
        }
        if ((1073741824 & i3) != 0) {
            num7 = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            map7 = null;
        }
        if ((i4 & 1) != 0) {
            skuSupply2 = null;
        }
        if ((i4 & 2) != 0) {
            str20 = null;
        }
        if ((i4 & 4) != 0) {
            str19 = null;
        }
        if ((i4 & 8) != 0) {
            map6 = null;
        }
        if ((i4 & 16) != 0) {
            logisticDTO2 = null;
        }
        if ((i4 & 32) != 0) {
            skuPanelState2 = null;
        }
        if ((i4 & 512) != 0) {
            userRight2 = null;
        }
        if ((i4 & 1024) != 0) {
            insuranceInfo2 = null;
        }
        c10296040w.getClass();
        C1018703yb.LIZLLL("tiktokec_confirm_cart_result", new AnonymousClass0457(i6, i5, logisticDTO2, insuranceInfo2, c03w02, userRight2, skuPanelState2, skuSupply2, headerBannerDaInfo2, bool3, bool4, num, num2, num3, num4, num5, num7, str22, str, str2, str3, str4, str5, str29, str6, str7, str28, str27, str26, str25, str24, str23, str21, str20, str19, null, null, null, map9, map8, map6, map3, map7));
    }
}
