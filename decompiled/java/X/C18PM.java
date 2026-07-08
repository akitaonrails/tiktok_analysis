package X;

import android.net.Uri;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18PM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PM {
    public static final C18PM LIZ = new C18PM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(269));

    public static void LIZ(Map map) {
        for (Map.Entry entry : ((Map) LIZIZ.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void LIZIZ(Map map, Map map2) {
        map.put("list_source_content_id", C123500dV.LIZIZ(map2.get("group_id")));
        map.put("entrance_type", "VSA_shop_now");
        map.put("author_id", C123500dV.LIZIZ(map2.get("author_id")));
        map.put("author_type", C123500dV.LIZIZ(map2.get("author_type")));
        map.put("follow_status", C123500dV.LIZIZ(map2.get("follow_status")));
    }

    public static boolean LIZLLL(String str, EnumC1780190wQT enumC1780190wQT) {
        if (str != null && !a0.LJJJIL(str)) {
            if (!C1740930vP9.LIZJ(str) && !C1740930vP9.LIZIZ(str)) {
                if (a0.LJJJIL(str)) {
                    return false;
                }
                try {
                    Uri uri = UriProtector.parse(str);
                    String path = uri.getPath();
                    if (Intrinsics.LJFF("ec", uri.getHost()) && Intrinsics.LJFF("/store", path)) {
                        if (!C1740930vP9.LIZIZ(AnonymousClass0185.LJ(uri, "landing_deeplink"))) {
                            return false;
                        }
                    } else {
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return false;
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return false;
                }
            }
        } else if (enumC1780190wQT != EnumC1780190wQT.AD_SINGLE_BUBBLE) {
            return false;
        }
        return true;
    }

    public static String LIZJ(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(C18PM c18pm, VSACardsResponse.VSACardData vSACardData, Map map, Map map2, EnumC21279418Pg enumC21279418Pg, boolean z, C1740600vOc c1740600vOc, int i) {
        List<EcUgProduct> list;
        EcUgProduct ecUgProduct;
        EnumC1780190wQT enumC1780190wQT;
        C1740600vOc c1740600vOc2 = c1740600vOc;
        boolean z2 = z;
        Map map3 = null;
        if ((i & 1) != 0) {
            vSACardData = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            c1740600vOc2 = null;
        }
        c18pm.getClass();
        if (vSACardData != null && (list = vSACardData.productList) != null && (ecUgProduct = (EcUgProduct) C13LP.LJJJLZIJ(0, list)) != null) {
            C18PS.LLJILJILJ.getClass();
            int iLIZ = C18PV.LIZ(vSACardData);
            if (iLIZ > 1) {
                enumC1780190wQT = EnumC1780190wQT.AD_MULTI_BUBBLE;
            } else if (iLIZ == 1) {
                enumC1780190wQT = EnumC1780190wQT.AD_SINGLE_BUBBLE;
            } else {
                enumC1780190wQT = EnumC1780190wQT.UNKNOWN;
            }
            if (map2 != null) {
                map3 = (Map) C7726030a.LIZ(ecUgProduct.productId, map2);
            }
            LJ(enumC1780190wQT, 0, ecUgProduct, map, map3, enumC21279418Pg, LIZLLL(vSACardData.cardSchema, enumC1780190wQT), z2, c1740600vOc2);
        }
    }

    public static void LJ(EnumC1780190wQT enumC1780190wQT, int i, EcUgProduct ecUgProduct, Map map, Map map2, EnumC21279418Pg enumC21279418Pg, boolean z, boolean z2, C1740600vOc c1740600vOc) {
        int iIntValue;
        String str;
        String str2;
        String str3;
        Integer type;
        float fFloatValue;
        List<PromotionItem> promotion_items;
        PromotionItem promotionItem;
        String str4;
        String str5;
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        linkedHashMap.put("click_area", enumC21279418Pg.getValue());
        String value = enumC1780190wQT.getValue();
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(value);
            sbLIZ.append("_old");
            value = C2188811AlT.LIZIZ(sbLIZ);
        }
        linkedHashMap.put("card_name", value);
        linkedHashMap.put("entrance_form", value);
        String strLIZIZ = C123500dV.LIZIZ(ecUgProduct.productId);
        EnumC21279418Pg enumC21279418Pg2 = EnumC21279418Pg.SHOP_TAB_ICON;
        Object objLIZ = null;
        if (enumC21279418Pg == enumC21279418Pg2 || enumC21279418Pg == EnumC21279418Pg.PRODUCT_CARD) {
            linkedHashMap.put("product_id", strLIZIZ);
            Integer num = ecUgProduct.bizType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            linkedHashMap.put("biz_type", Integer.valueOf(iIntValue));
            EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
            if (ecUgProductPrice != null) {
                str = ecUgProductPrice.currency;
            } else {
                str = null;
            }
            String strLIZIZ2 = C123500dV.LIZIZ(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            EcUgProduct.EcUgProductPrice ecUgProductPrice2 = ecUgProduct.price;
            if (ecUgProductPrice2 != null) {
                str2 = ecUgProductPrice2.minSalesPrice;
            } else {
                str2 = null;
            }
            sbLIZ2.append(C123500dV.LIZIZ(str2));
            linkedHashMap.put("sales_price", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            EcUgProduct.EcUgProductPrice ecUgProductPrice3 = ecUgProduct.price;
            if (ecUgProductPrice3 != null) {
                str3 = ecUgProductPrice3.minOriginalPrice;
            } else {
                str3 = null;
            }
            sbLIZ3.append(C123500dV.LIZIZ(str3));
            linkedHashMap.put("original_price", C2188811AlT.LIZIZ(sbLIZ3));
            PromotionView promotionView = ecUgProduct.promotionView;
            if (promotionView != null && (promotion_items = promotionView.getPromotion_items()) != null && (promotionItem = (PromotionItem) C13LP.LJJJLL(promotion_items)) != null) {
                type = promotionItem.getType();
            } else {
                type = null;
            }
            linkedHashMap.put("ad_benefit_type", C123500dV.LIZIZ(type));
            linkedHashMap.put("volume", C123500dV.LIZIZ(ecUgProduct.soldCountStr));
            Float f = ecUgProduct.productRating;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            linkedHashMap.put("rate", Float.valueOf(fFloatValue));
            linkedHashMap.put("item_order", Integer.valueOf(i + 1));
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        linkedHashMap.put("group_id", C123500dV.LIZIZ(linkedHashMap2.get("group_id")));
        linkedHashMap.put("ad_id", C123500dV.LIZIZ(linkedHashMap2.get("ad_id")));
        linkedHashMap.put("creative_id", C123500dV.LIZIZ(linkedHashMap2.get("creative_id")));
        String strLIZIZ3 = C123500dV.LIZIZ(linkedHashMap2.get("log_id"));
        linkedHashMap.put("request_id", strLIZIZ3);
        linkedHashMap.put("enter_from", C123500dV.LIZIZ(linkedHashMap2.get("enter_from")));
        linkedHashMap.put("track_id", LIZJ(i, strLIZIZ3, strLIZIZ));
        linkedHashMap.put("previous_page", C18PO.LIZ());
        int iLIZ = C294640Bgk.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ != 3) {
                    str4 = "white_card";
                } else {
                    str4 = "TT_original";
                }
            } else {
                str4 = "arrow_bubble";
            }
        } else {
            str4 = "black_card";
        }
        linkedHashMap.put("card_format", str4);
        if (C294640Bgk.LIZIZ()) {
            str5 = "price_tag";
        } else {
            C21278918Pb.LIZ.getClass();
            str5 = C21278918Pb.LIZJ;
        }
        linkedHashMap.put("vsa_format", str5);
        if (map2 != null) {
            objLIZ = C7726030a.LIZ("mall_extra_info", map2);
        }
        linkedHashMap.put("mall_extra_info", C123500dV.LIZIZ(objLIZ));
        linkedHashMap.put("shop_id", C123500dV.LIZIZ(ecUgProduct.shopId));
        Map mapLIZ = C1740590vOb.LIZ(c1740600vOc);
        if (mapLIZ != null) {
            linkedHashMap.putAll(mapLIZ);
        }
        BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
        if (bcmStandardTrackData != null && (mapLIZIZ = C1768380w7Q.LIZIZ(bcmStandardTrackData)) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        C1768000w6o.LIZ.getClass();
        C1768000w6o.LIZIZ("tiktokec_card_click", linkedHashMap);
        if (enumC1780190wQT == EnumC1780190wQT.AD_SINGLE_BUBBLE && z) {
            C1768000w6o.LIZIZ("tiktokec_product_click", linkedHashMap);
        }
        if (enumC21279418Pg == EnumC21279418Pg.PRODUCT_CARD || enumC21279418Pg == enumC21279418Pg2) {
            C207296169u c207296169u = C207296169u.LIZ;
            EnumC207181165j enumC207181165j = EnumC207181165j.CARD_OR_ICON_CLICK;
            c207296169u.getClass();
            C207296169u.LIZ(enumC207181165j);
        }
        if (Boolean.parseBoolean((String) linkedHashMap2.get("vsa_enter_shop"))) {
            LIZIZ(linkedHashMap, linkedHashMap2);
            C1768000w6o.LIZIZ("tiktokec_shop_entrance_click", linkedHashMap);
        }
    }

    public static void LJI(C18PM c18pm, String str, boolean z, int i, String str2, String str3, String str4, VSACardsResponse.VSACardData vSACardData, Map map, int i2) {
        String str5;
        EnumC1780190wQT enumC1780190wQT;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        if ((i2 & 64) != 0) {
            vSACardData = null;
        }
        if ((i2 & 128) != 0) {
            map = null;
        }
        c18pm.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", str);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str5);
        linkedHashMap.put("error_code", C123500dV.LIZIZ(Integer.valueOf(i)));
        linkedHashMap.put("fail_reason", str2);
        linkedHashMap.put("log_id", str3);
        linkedHashMap.put("enter_from", str4);
        C18PS.LLJILJILJ.getClass();
        int iLIZ = C18PV.LIZ(vSACardData);
        if (iLIZ > 1) {
            enumC1780190wQT = EnumC1780190wQT.AD_MULTI_BUBBLE;
        } else if (iLIZ == 1) {
            enumC1780190wQT = EnumC1780190wQT.AD_SINGLE_BUBBLE;
        } else {
            enumC1780190wQT = EnumC1780190wQT.UNKNOWN;
        }
        linkedHashMap.put("card_name", enumC1780190wQT.getValue());
        if (map != null && !map.isEmpty()) {
            linkedHashMap.put("group_id", C123500dV.LIZIZ(map.get("group_id")));
            linkedHashMap.put("ad_id", C123500dV.LIZIZ(map.get("ad_id")));
            linkedHashMap.put("creative_id", C123500dV.LIZIZ(map.get("creative_id")));
            linkedHashMap.put("request_id", C123500dV.LIZIZ(map.get("log_id")));
        }
        C1768000w6o.LIZ.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_vsa_stage", linkedHashMap);
    }
}
