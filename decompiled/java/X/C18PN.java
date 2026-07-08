package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18PN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PN implements C18QB {
    public final /* synthetic */ C18PS LIZ;

    public final void LIZJ() {
        C18PS c18ps = this.LIZ;
        c18ps.LLJI = false;
        int visibility = c18ps.getVisibility();
        c18ps.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c18ps);
        C18PW c18pw = c18ps.LLILLJJLI;
        if (c18pw != null) {
            c18pw.LIZIZ();
        }
    }

    public C18PN(C18PS c18ps) {
        this.LIZ = c18ps;
    }

    @Override // X.C18QB
    public final void LIZ(int i, EcUgProduct ecUgProduct, C18PU c18pu) {
        BcmParams bcmParams;
        int iIntValue;
        String str;
        String str2;
        String str3;
        Integer type;
        float fFloatValue;
        String str4;
        String str5;
        Object objLIZ;
        Map<String, Object> mapLIZIZ;
        List<PromotionItem> promotion_items;
        PromotionItem promotionItem;
        Map<String, ? extends Object> mapLIZ;
        BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
        if (bcmStandardTrackData != null && (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
            bcmParams = new BcmParams();
            bcmParams.merge(mapLIZ);
        } else {
            bcmParams = null;
        }
        C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
        Fragment fragment = this.LIZ.getFragment();
        c1741480vQ2.getClass();
        C1740600vOc c1740600vOcLIZ = C1741480vQ2.LIZ(c18pu, fragment, i, bcmParams);
        C18PS c18ps = this.LIZ;
        c18ps.LLIZLLLIL = i;
        c18ps.LLJ = ecUgProduct;
        C18PW c18pw = c18ps.LLILLJJLI;
        if (c18pw != null) {
            c18pw.LIZ(i, ecUgProduct);
        }
        if (c18ps.LLJILJIL == 0) {
            C18PM c18pm = C18PM.LIZ;
            EnumC1780190wQT enumC1780190wQT = c18ps.LLILZIL;
            Map<String, String> map = c18ps.LLILLL;
            c18pm.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C18PM.LIZ(linkedHashMap);
            linkedHashMap.put("card_name", enumC1780190wQT.getValue());
            linkedHashMap.put("product_id", C123500dV.LIZIZ(ecUgProduct.productId));
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
            linkedHashMap.put("group_id", C123500dV.LIZIZ(linkedHashMap2.get("group_id")));
            linkedHashMap.put("ad_id", C123500dV.LIZIZ(linkedHashMap2.get("ad_id")));
            linkedHashMap.put("creative_id", C123500dV.LIZIZ(linkedHashMap2.get("creative_id")));
            linkedHashMap.put("enter_from", C123500dV.LIZIZ(linkedHashMap2.get("enter_from")));
            linkedHashMap.put("previous_page", C18PO.LIZ());
            C1768000w6o.LIZ.getClass();
            C1768000w6o.LIZIZ("tiktokec_vsa_show", linkedHashMap);
        }
        int i2 = c18ps.LLJILJIL;
        c18ps.LLJILJIL = i2 + 1;
        if (i2 <= i) {
            C18PM c18pm2 = C18PM.LIZ;
            EnumC1780190wQT enumC1780190wQT2 = c18ps.LLILZIL;
            int i3 = c18ps.LLIZLLLIL;
            Map<String, String> map2 = c18ps.LLILLL;
            Map map3 = (Map) ((LinkedHashMap) c18ps.LLILZ).get(ecUgProduct.productId);
            boolean z = c18ps.LLILZLL;
            c18pm2.getClass();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            C18PM.LIZ(linkedHashMap3);
            linkedHashMap3.put("card_name", enumC1780190wQT2.getValue());
            linkedHashMap3.put("entrance_form", enumC1780190wQT2.getValue());
            String strLIZIZ = C123500dV.LIZIZ(ecUgProduct.productId);
            linkedHashMap3.put("product_id", strLIZIZ);
            Integer num = ecUgProduct.bizType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            linkedHashMap3.put("biz_type", Integer.valueOf(iIntValue));
            EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
            if (ecUgProductPrice != null) {
                str = ecUgProductPrice.currency;
            } else {
                str = null;
            }
            String strLIZIZ2 = C123500dV.LIZIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ2);
            EcUgProduct.EcUgProductPrice ecUgProductPrice2 = ecUgProduct.price;
            if (ecUgProductPrice2 != null) {
                str2 = ecUgProductPrice2.minSalesPrice;
            } else {
                str2 = null;
            }
            sbLIZ.append(C123500dV.LIZIZ(str2));
            linkedHashMap3.put("sales_price", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            EcUgProduct.EcUgProductPrice ecUgProductPrice3 = ecUgProduct.price;
            if (ecUgProductPrice3 != null) {
                str3 = ecUgProductPrice3.minOriginalPrice;
            } else {
                str3 = null;
            }
            sbLIZ2.append(C123500dV.LIZIZ(str3));
            linkedHashMap3.put("original_price", C2188811AlT.LIZIZ(sbLIZ2));
            PromotionView promotionView = ecUgProduct.promotionView;
            if (promotionView != null && (promotion_items = promotionView.getPromotion_items()) != null && (promotionItem = (PromotionItem) C13LP.LJJJLL(promotion_items)) != null) {
                type = promotionItem.getType();
            } else {
                type = null;
            }
            linkedHashMap3.put("ad_benefit_type", C123500dV.LIZIZ(type));
            linkedHashMap3.put("volume", C123500dV.LIZIZ(ecUgProduct.soldCountStr));
            Float f = ecUgProduct.productRating;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            linkedHashMap3.put("rate", Float.valueOf(fFloatValue));
            linkedHashMap3.put("item_order", Integer.valueOf(i3 + 1));
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) map2;
            linkedHashMap3.put("group_id", C123500dV.LIZIZ(linkedHashMap4.get("group_id")));
            linkedHashMap3.put("ad_id", C123500dV.LIZIZ(linkedHashMap4.get("ad_id")));
            linkedHashMap3.put("creative_id", C123500dV.LIZIZ(linkedHashMap4.get("creative_id")));
            String strLIZIZ3 = C123500dV.LIZIZ(linkedHashMap4.get("log_id"));
            linkedHashMap3.put("request_id", strLIZIZ3);
            linkedHashMap3.put("enter_from", C123500dV.LIZIZ(linkedHashMap4.get("enter_from")));
            linkedHashMap3.put("track_id", C18PM.LIZJ(i3, strLIZIZ3, strLIZIZ));
            linkedHashMap3.put("previous_page", C18PO.LIZ());
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
            linkedHashMap3.put("card_format", str4);
            if (C294640Bgk.LIZIZ()) {
                str5 = "price_tag";
            } else {
                C21278918Pb.LIZ.getClass();
                str5 = C21278918Pb.LIZJ;
            }
            linkedHashMap3.put("vsa_format", str5);
            Map mapLIZ2 = C1740590vOb.LIZ(c1740600vOcLIZ);
            if (mapLIZ2 != null) {
                linkedHashMap3.putAll(mapLIZ2);
            }
            BcmStandardTrackData bcmStandardTrackData2 = ecUgProduct.bcmStandardTrack;
            if (bcmStandardTrackData2 != null && (mapLIZIZ = C1768380w7Q.LIZIZ(bcmStandardTrackData2)) != null) {
                linkedHashMap3.putAll(mapLIZIZ);
            }
            if (map3 != null) {
                objLIZ = C7726030a.LIZ("mall_extra_info", map3);
            } else {
                objLIZ = null;
            }
            linkedHashMap3.put("mall_extra_info", C123500dV.LIZIZ(objLIZ));
            linkedHashMap3.put("shop_id", C123500dV.LIZIZ(ecUgProduct.shopId));
            C1768000w6o.LIZ.getClass();
            C1768000w6o.LIZIZ("tiktokec_card_show", linkedHashMap3);
            if (enumC1780190wQT2 == EnumC1780190wQT.AD_SINGLE_BUBBLE && z) {
                C1768000w6o.LIZIZ("tiktokec_product_show", linkedHashMap3);
            }
            C207296169u c207296169u = C207296169u.LIZ;
            EnumC207181165j enumC207181165j = EnumC207181165j.CARD_ITEM_SHOW;
            c207296169u.getClass();
            C207296169u.LIZ(enumC207181165j);
            if (Boolean.parseBoolean((String) linkedHashMap4.get("vsa_enter_shop"))) {
                C18PM.LIZIZ(linkedHashMap3, linkedHashMap4);
                C1768000w6o.LIZIZ("tiktokec_shop_entrance_show", linkedHashMap3);
            }
        }
        if (c18ps.LLJIJIL) {
            c18ps.LLJIJIL = false;
            C207296169u c207296169u2 = C207296169u.LIZ;
            EnumC207181165j enumC207181165j2 = EnumC207181165j.CARD_SHOW;
            c207296169u2.getClass();
            C207296169u.LIZ(enumC207181165j2);
        }
    }

    @Override // X.C18QB
    public final void LIZIZ(int i, EcUgProduct ecUgProduct, C18PU c18pu) {
        BcmParams bcmParams;
        Map<String, ? extends Object> mapLIZ;
        BcmStandardTrackData bcmStandardTrackData = ecUgProduct.bcmStandardTrack;
        if (bcmStandardTrackData != null && (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
            bcmParams = new BcmParams();
            bcmParams.merge(mapLIZ);
        } else {
            bcmParams = null;
        }
        C1741480vQ2 c1741480vQ2 = C1741480vQ2.LIZ;
        Fragment fragment = this.LIZ.getFragment();
        c1741480vQ2.getClass();
        this.LIZ.LJ(i, ecUgProduct, C1741480vQ2.LIZ(c18pu, fragment, i, bcmParams));
    }
}
