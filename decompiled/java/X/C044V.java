package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
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
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS150S1100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.044V, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C044V {
    public static final C044V LIZ = new C044V();
    public static final LinkedHashMap<String, Object> LIZIZ;
    public static String LIZJ;

    static {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("rd_pdp_monitor_version", "v4190");
        LIZIZ = linkedHashMap;
    }

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
        String str2;
        SkuSupply skuSupply;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "";
        if (skuItem == null || (skuSupply = skuItem.skuSupply) == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        linkedHashMap.put("seller_sku_id", str);
        if (skuItem != null && (str2 = skuItem.skuId) != null) {
            str3 = str2;
        }
        linkedHashMap.put("platform_sku_id", str3);
        return linkedHashMap;
    }

    public static void LJIIJJI(ProductPackStruct productPackStruct) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        String strValueOf;
        String str4;
        String str5;
        HashMap<String, Object> mapLJIIJ;
        Map<String, String> trackParam;
        PDPShippingModule pDPShippingModule;
        PDPShippingModuleMeta pDPShippingModuleMeta;
        String str6;
        String str7;
        String str8;
        String str9;
        HashMap<String, Object> mapLJIIJ2;
        String str10;
        ProductPrice productPrice;
        ProductPrice productPrice2;
        ProductPrice productPrice3;
        LinkedHashMap<String, Object> linkedHashMap = LIZIZ;
        linkedHashMap.put("rd_pdp_monitor_version", "v4190");
        Integer num = productPackStruct.status;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        linkedHashMap.put("product_type", String.valueOf(iIntValue));
        ProductBase productBase = productPackStruct.baseInfo;
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = null;
        if (productBase != null && (productPrice3 = productBase.priceInfo) != null) {
            str = productPrice3.originPrice;
            if (str != null && str.length() == 0) {
                str = null;
            }
        } else {
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
        String str11 = "";
        if (str == null) {
            if (str3 != null || str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        linkedHashMap.put("original_price", str);
        Integer num2 = productPackStruct.bizType;
        if (num2 != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(num2.intValue()));
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
            String str12 = warehouseTag.fulfilledBy;
            if (str12 != null) {
                str11 = str12;
            }
            linkedHashMap.put("fulfilled_by", str11);
        } else {
            linkedHashMap.put("fulfilled_by", "no_label");
        }
        ArrayList arrayList = new ArrayList();
        PickTag pickTag = productPackStruct.activityInfo;
        if (pickTag != null) {
            str4 = pickTag.logExtra;
        } else {
            str4 = null;
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(str4);
        if (mapLJIIJ3 != null) {
            arrayList.add(mapLJIIJ3);
        }
        PromotionWaist promotionWaist = productPackStruct.promotionWaist;
        if (promotionWaist != null && (str9 = promotionWaist.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str9)) != null) {
            arrayList.add(mapLJIIJ2);
        }
        C04CA.LIZ(arrayList, linkedHashMap);
        ProductBase productBase4 = productPackStruct.baseInfo;
        if (productBase4 != null) {
            String str13 = productBase4.title;
            if (str13 != null) {
                linkedHashMap.put("product_name", str13);
            }
            String str14 = productBase4.categoryName;
            if (str14 != null) {
                linkedHashMap.put("product_category", str14);
            }
        }
        SellerInfo sellerInfo = productPackStruct.sellerInfo;
        if (sellerInfo != null && (str8 = sellerInfo.sellerId) != null) {
            linkedHashMap.put("shop_id", str8);
        }
        List<SkuItem> list = productPackStruct.skus;
        String str15 = CardStruct.IStatusCode.DEFAULT;
        if (list != null) {
            Iterator<SkuItem> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num3 = it2.next().skuStatus;
                if (num3 != null && num3.intValue() == 2) {
                    str15 = "1";
                }
            }
        }
        LinkedHashMap<String, Object> linkedHashMap2 = LIZIZ;
        linkedHashMap2.put("is_sku_sold_out", str15);
        if (productPackStruct.LJII()) {
            str5 = "skc_version";
        } else {
            str5 = "sku_version";
        }
        linkedHashMap2.put("ttf_page_type", str5);
        Integer num4 = productPackStruct.bizType;
        if (num4 != null) {
            linkedHashMap2.put("biz_type", Integer.valueOf(num4.intValue()));
        }
        BrandInfo brandInfo = productPackStruct.brandInfo;
        if (brandInfo != null) {
            linkedHashMap2.put("seller_logo_type", C10473047r.LIZLLL(brandInfo));
        }
        SellerInfo sellerInfo2 = productPackStruct.sellerInfo;
        if (sellerInfo2 != null && (str7 = sellerInfo2.sellerId) != null) {
            linkedHashMap2.put("shop_id", str7);
        }
        if (Intrinsics.LJFF(productPackStruct.isPlatformProductLink, Boolean.TRUE)) {
            linkedHashMap2.putAll(productPackStruct.LIZLLL());
        }
        PDPLogisticModule pDPLogisticModule = productPackStruct.pdpLogisticModule;
        if (pDPLogisticModule != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null && (pDPShippingModuleMeta = pDPShippingModule.meta) != null && (str6 = pDPShippingModuleMeta.deliveryFlag) != null) {
            linkedHashMap2.put("delivery_flag", str6);
        }
        BCMStandardTrack bCMStandardTrack = productPackStruct.bcmStandardTrack;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            linkedHashMap2.putAll(trackParam);
        }
        String str16 = productPackStruct.daInfo;
        if (str16 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str16)) != null) {
            linkedHashMap2.putAll(mapLJIIJ);
        }
        SEACCIPaymentModule sEACCIPaymentModule = productPackStruct.seaCciPaymentModule;
        if (sEACCIPaymentModule != null) {
            seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget;
        }
        linkedHashMap2.putAll(C10473047r.LIZ(seaPaymentInstallmentPlan));
    }

    public static void LJFF(SkuPanelStarter.SkuEnterParams skuEnterParams, String str) {
        Map<String, Object> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (skuEnterParams != null && (map = skuEnterParams.trackParams) != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("message", str);
        C1018703yb.LIZIZ("rd_tiktokec_get_sku_passed_params", linkedHashMap);
    }

    public static void LJIIIIZZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZIZ);
        linkedHashMap.put("page_name", "sku");
        linkedHashMap.put("module_name", str);
        linkedHashMap.put("photo_id", str2);
        linkedHashMap.put("photo_show_type", "viewer");
        C1018703yb.LIZIZ("tiktokec_product_photo_glide", linkedHashMap);
    }

    public static void LJIIIZ(C044V c044v, String str) {
        c044v.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        C1018703yb.LIZIZ("tiktokec_rd_code_used", linkedHashMap);
    }

    public static void LJIIJ(ProductPackStruct productPackStruct, String[] strArr) {
        List<SkuItem> list;
        int i;
        String str;
        if (strArr != null) {
            String strLIZ = C036I.LIZ(strArr);
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                SkuItem skuItemLIZJ = C731902tR.LIZJ(strLIZ, list);
                LinkedHashMap<String, Object> linkedHashMap = LIZIZ;
                if (skuItemLIZJ != null && (str = skuItemLIZJ.lowStockWarning) != null && !a0.LJJJIL(str)) {
                    i = 0;
                } else {
                    i = 1;
                }
                linkedHashMap.put("is_low_stock", Integer.valueOf(i ^ 1));
            }
        }
    }

    public static void LJIIL(int i, String str, String str2) {
        try {
            LinkedHashMap<String, Object> linkedHashMap = LIZIZ;
            linkedHashMap.put("promotion_tag_id", str2);
            linkedHashMap.put("promotion_tag_type", str);
            linkedHashMap.put("promotion_tag_cnt", Integer.valueOf(i));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJII(int i, String str, ProductPackStruct productPackStruct, String[] strArr, int i2, Map map, String str2, Boolean bool) {
        List<SaleProp> list;
        SaleProp saleProp;
        int i3;
        int size;
        String strLIZ;
        String str3;
        if (productPackStruct != null && (list = productPackStruct.saleProps) != null && (saleProp = (SaleProp) ListProtector.get(list, i)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(LIZIZ);
            String str4 = "sku";
            linkedHashMap.put("page_name", "sku");
            linkedHashMap.put("module_name", "sku");
            if (productPackStruct.LJII()) {
                str4 = "skc";
            }
            linkedHashMap.put("sub_module_name", str4);
            linkedHashMap.put("pdp_sku_attr_rank", Integer.valueOf(i + 1));
            List<SalePropValue> list2 = saleProp.salePropValueList;
            if (list2 != null && list2.size() == 1) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            linkedHashMap.put("is_single_sku", Integer.valueOf(i3));
            List<SalePropValue> list3 = saleProp.salePropValueList;
            if (list3 != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            linkedHashMap.put("sku_value_cnt", Integer.valueOf(size));
            linkedHashMap.put("sku_default_type", -1);
            if (strArr != null) {
                for (String str5 : strArr) {
                    List<SalePropValue> list4 = saleProp.salePropValueList;
                    if (list4 != null) {
                        Iterator<SalePropValue> it2 = list4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SalePropValue next = it2.next();
                                if (Intrinsics.LJFF(next.propValueId, str5)) {
                                    if (next != null) {
                                        linkedHashMap.put("sku_default_type", 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (map != null && map.size() == 0) {
                strLIZ = "{}";
            } else {
                strLIZ = LIZ(map);
            }
            linkedHashMap.put("sku_tag_cnt", strLIZ);
            linkedHashMap.put("sku_attr_cnt", Integer.valueOf(productPackStruct.saleProps.size()));
            linkedHashMap.put("sku_module_image_cnt", Integer.valueOf(i2));
            if (str2 != null && !a0.LJJJIL(str2)) {
                linkedHashMap.put("positive_review_tag_percentage", str2);
            }
            if (i2 > 0) {
                str3 = "sku_image";
            } else {
                str3 = "sku_text";
            }
            linkedHashMap.put("module_show_type", str3);
            if (str != null && !a0.LJJJIL(str)) {
                linkedHashMap.put("first_category_id", str);
            }
            linkedHashMap.put("if_large_picture", Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0));
            C1018703yb.LIZIZ("tiktokec_module_show", linkedHashMap);
        }
    }

    public static void LJI(C044V c044v, View view, int i, int i2, C042Y c042y, int i3, Map map, String str, String str2, String str3, ProductPackStruct productPackStruct, String str4, PageFinder pageFinder) {
        PageFinder pageFinderVia = pageFinder;
        c044v.getClass();
        C049X c049x = new C049X();
        AwS150S1100000_1 awS150S1100000_1 = new AwS150S1100000_1((String) null, c042y, 14);
        if (pageFinderVia == null) {
            pageFinderVia = PageFinder.via(view);
        }
        C1748720vbi.LJI(view, c049x, awS150S1100000_1, str4, pageFinderVia, new C10378044a(c042y, i3, i, i2, map, productPackStruct, str, str2, str3));
    }

    public static void LIZJ(C044V c044v, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, C03W0 c03w0, Map map, Map map2, SkuSupply skuSupply, String str8, Map map3, Map map4, String str9, int i) {
        String str10 = str9;
        Map map5 = map4;
        Map map6 = map3;
        SkuSupply skuSupply2 = skuSupply;
        Map map7 = map2;
        Map map8 = map;
        C03W0 c03w02 = c03w0;
        String str11 = str7;
        String str12 = str5;
        Integer num2 = num;
        String str13 = str4;
        String str14 = str3;
        String str15 = str8;
        String str16 = str2;
        if ((i & 2) != 0) {
            str16 = null;
        }
        if ((i & 4) != 0) {
            str14 = null;
        }
        if ((i & 8) != 0) {
            str13 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str12 = null;
        }
        if ((i & 128) != 0) {
            str11 = null;
        }
        if ((i & 512) != 0) {
            c03w02 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map7 = null;
        }
        if ((i & 8192) != 0) {
            skuSupply2 = null;
        }
        if ((i & 16384) != 0) {
            str15 = null;
        }
        if ((32768 & i) != 0) {
            map6 = null;
        }
        if ((65536 & i) != 0) {
            map5 = null;
        }
        if ((i & 131072) != 0) {
            str10 = null;
        }
        c044v.getClass();
        C1018703yb.LJII("tiktokec_button_click", new C957503oj(c03w02, skuSupply2, null, num2, str, str16, str14, str13, str12, str6, str11, str15, str10, LIZIZ, map6, map5, map8, map7));
    }

    public static void LIZLLL(C044V c044v, String str, String str2, Integer num, String str3, String str4, String str5, Map map, Map map2, C03W0 c03w0, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str6, String str7, String str8, Map map3, String str9, Integer num2, SkuSupply skuSupply, String str10, String str11, SkuPanelState skuPanelState, UserRight userRight, Map map4, Integer num3, String str12, int i) {
        Integer num4 = num3;
        Map map5 = map4;
        UserRight userRight2 = userRight;
        SkuPanelState skuPanelState2 = skuPanelState;
        String str13 = str11;
        String str14 = str10;
        Integer num5 = num2;
        String str15 = str9;
        String str16 = str8;
        String str17 = str7;
        String str18 = str6;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        Boolean bool2 = bool;
        C03W0 c03w02 = c03w0;
        Map map6 = map2;
        SkuSupply skuSupply2 = skuSupply;
        Map map7 = map;
        String str19 = null;
        if ((i & 64) != 0) {
            map7 = null;
        }
        if ((i & 128) != 0) {
            map6 = null;
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
            str18 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str17 = null;
        }
        if ((i & 8192) != 0) {
            str16 = null;
        }
        if ((32768 & i) != 0) {
            str15 = null;
        }
        if ((65536 & i) != 0) {
            num5 = null;
        }
        if ((131072 & i) != 0) {
            skuSupply2 = null;
        }
        if ((262144 & i) != 0) {
            str14 = null;
        }
        if ((524288 & i) != 0) {
            str13 = null;
        }
        if ((1048576 & i) != 0) {
            skuPanelState2 = null;
        }
        if ((2097152 & i) != 0) {
            userRight2 = null;
        }
        if ((4194304 & i) != 0) {
            map5 = null;
        }
        if ((8388608 & i) != 0) {
            num4 = 0;
        }
        if ((i & 16777216) == 0) {
            str19 = str12;
        }
        c044v.getClass();
        if (map7 == null) {
            map7 = LIZIZ;
        }
        C1018703yb.LJII("tiktokec_confirm_cart", new C045B(c03w02, userRight2, skuPanelState2, skuSupply2, headerBannerDaInfo2, bool2, num, num5, num4, str15, str, str2, str3, str4, str5, str19, str18, str17, str16, str14, str13, map7, map5, map6, map3));
    }

    public static void LJ(C044V c044v, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7, Map map, String str8, Map map2, String str9, String str10, String str11, C03W0 c03w0, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str12, String str13, String str14, Map map3, String str15, String str16, Integer num6, Map map4, SkuSupply skuSupply, String str17, String str18, Map map5, LogisticDTO logisticDTO, SkuPanelState skuPanelState, UserRight userRight, Map map6, Integer num7, String str19, int i, int i2) {
        String str20 = str19;
        Map map7 = map6;
        UserRight userRight2 = userRight;
        SkuPanelState skuPanelState2 = skuPanelState;
        LogisticDTO logisticDTO2 = logisticDTO;
        Map map8 = map5;
        String str21 = str18;
        String str22 = str17;
        SkuSupply skuSupply2 = skuSupply;
        Map map9 = map4;
        Integer num8 = num6;
        String str23 = str16;
        String str24 = str15;
        String str25 = str14;
        String str26 = str13;
        String str27 = str12;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        Boolean bool2 = bool;
        C03W0 c03w02 = c03w0;
        String str28 = str11;
        String str29 = str10;
        String str30 = str9;
        Integer num9 = num7;
        Map map10 = map2;
        String str31 = str8;
        Map map11 = map;
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map11 = null;
        }
        if ((i & 8192) != 0) {
            str31 = null;
        }
        if ((i & 16384) != 0) {
            map10 = null;
        }
        if ((32768 & i) != 0) {
            str30 = null;
        }
        if ((65536 & i) != 0) {
            str29 = null;
        }
        if ((131072 & i) != 0) {
            str28 = null;
        }
        if ((262144 & i) != 0) {
            c03w02 = null;
        }
        if ((524288 & i) != 0) {
            bool2 = null;
        }
        if ((1048576 & i) != 0) {
            headerBannerDaInfo2 = null;
        }
        if ((2097152 & i) != 0) {
            str27 = null;
        }
        if ((4194304 & i) != 0) {
            str26 = null;
        }
        if ((8388608 & i) != 0) {
            str25 = null;
        }
        if ((33554432 & i) != 0) {
            str24 = null;
        }
        if ((67108864 & i) != 0) {
            str23 = null;
        }
        if ((134217728 & i) != 0) {
            num8 = null;
        }
        if ((268435456 & i) != 0) {
            map9 = null;
        }
        if ((536870912 & i) != 0) {
            skuSupply2 = null;
        }
        if ((1073741824 & i) != 0) {
            str22 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str21 = null;
        }
        if ((i2 & 1) != 0) {
            map8 = null;
        }
        if ((i2 & 2) != 0) {
            logisticDTO2 = null;
        }
        if ((i2 & 4) != 0) {
            skuPanelState2 = null;
        }
        if ((i2 & 64) != 0) {
            userRight2 = null;
        }
        if ((i2 & 128) != 0) {
            map7 = null;
        }
        if ((i2 & 256) != 0) {
            num9 = 0;
        }
        if ((i2 & 512) != 0) {
            str20 = null;
        }
        c044v.getClass();
        C1018703yb.LIZLLL("tiktokec_confirm_cart_result", new AnonymousClass0458(logisticDTO2, c03w02, userRight2, skuPanelState2, skuSupply2, headerBannerDaInfo2, bool2, num, num2, num3, num4, num5, num8, num9, str24, str, str2, str3, str4, str5, str31, str6, str7, str20, str30, str29, str28, str27, str26, str25, str23, str22, str21, null, null, null, map11, map7, map10, map8, map3, map9));
    }
}
