package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.traffic.model.MallExtraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209351BdV {
    public static final Map<String, String> LIZ = C2097608Jq.LJ();
    public static final Map<String, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("order_pay_success", "order_pay_success.view_order_button.in_app"), new Pair("order_pay_success_banner", "order_pay_success.banner.in_app"), new Pair("order_submit", "order_submit.place_order_button.in_app"), new Pair("rec_order_center", "order_center.rec_shop_button.in_app"), new Pair("order_center_feedscard", "order_center.rec_feedscard.in_app"), new Pair("order_list_banner", "order_list.banner.in_app"), new Pair("homepage_hot_video", "fyp_ecom_video.shop_now_button.in_app"), new Pair("homepage_hot_no_anchor_video", "fyp_no_anchor_video.shop_now_button.in_app"), new Pair("fyp_ecom_card_page_claim", "fyp_ecom_card.claim_button.in_app"), new Pair("fyp_ecom_card_page_see_more", "fyp_ecom_card.see_more_button.in_app"), new Pair("coupon_center_hover", "coupon_center_page.hover_pendant.in_app"), new Pair("pdp_banner", "product_detail.banner.in_app"), new Pair("shop_similar_product_module", "shop.similar_product_module.in_app"), new Pair("showcase_similar_product_module", "showcase.similar_product_module.in_app"), new Pair("webtoapp", "web_to_app.all.out_of_app_buy"));

    public static String LIZ(String str, String str2) {
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(str2, str), e3.d, null, null, 0, null, null, 62);
    }

    public static String LIZLLL(MallExtraInfo mallExtraInfo, List list) {
        String str = mallExtraInfo.trackId;
        String str2 = mallExtraInfo.mallLandingPage;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        C323580CmK c323580CmK = new C323580CmK(4);
        c323580CmK.LIZ(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c323580CmK.LIZIZ(list.toArray(new String[0]));
        c323580CmK.LIZ(str2);
        c323580CmK.LIZ(strValueOf);
        List listLJIJI = C13LQ.LJIJI(c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()]));
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJI) {
            if (C123100dR.LIZ((String) obj)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, e3.d, null, null, 0, null, null, 62);
    }

    public static String LJ(String str, String str2) {
        String str3 = LIZIZ.get(str);
        if (str3 == null) {
            if (str == null) {
                str = "";
            }
        } else {
            str = str3;
        }
        return LIZ(str, str2);
    }

    public static Map LIZIZ(String str, String str2, String str3, String str4, String str5) {
        Pair[] pairArr = new Pair[5];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("traffic_out_source", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("traffic_material_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("traffic_campaign_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("traffic_track_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("traffic_vt_scores", str5);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
