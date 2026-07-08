package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCache;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.Item;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.ShopCard;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSKUDTOV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderShopDigestV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2;
import com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitRequestParamV2;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.utils.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.utils.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.utils.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766240w3y {
    public static final C1766240w3y LIZ = new C1766240w3y();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "enter_from_info", "source_content_id", "rec_session_id", "traffic_source_list", "creative_id", "ad_id", "biz_type", "source_module", "enter_from_merge", "source_previous_page", "list_item_id");
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "campaign_channel", "start_click_time", "previous_page", "source_content_id", "enter_from_info", "rec_session_id", "traffic_source_list", "purchase_path", "saleable_sku_num", "creative_id", "ad_id", "source_module", "biz_type", "rights_content", "rights_cnt", "enter_from");
        LIZJ = listLJIIJJI;
        LIZLLL = listLJIIJJI;
    }

    public static void LJIIIIZZ(C1766250w3z c1766250w3z) {
        Image image;
        SkuPrice skuPrice;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ttec_live_apply_order_submit_preview_params", false)) {
            return;
        }
        String str = c1766250w3z.LIZIZ;
        String str2 = c1766250w3z.LIZJ;
        String str3 = c1766250w3z.LIZ;
        String str4 = c1766250w3z.LJ;
        if (str4 != null) {
            LIZ.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str4);
            image = new Image(null, null, null, null, arrayList, null, null, null, null, null, null, null, null);
        } else {
            image = null;
        }
        SinglePriceItem singlePriceItem = c1766250w3z.LJFF;
        if (singlePriceItem != null) {
            LIZ.getClass();
            skuPrice = new SkuPrice(new Price(C743702vL.LIZLLL(singlePriceItem), singlePriceItem.salePriceFormat, singlePriceItem.currency(), null, null, null, 0, null, null, null, null), null, C743702vL.LIZJ(singlePriceItem), singlePriceItem.discountFormat, null, singlePriceItem.originPriceFormat, null, null, null, 15, 14, 11, 12, Boolean.FALSE, null, null, null, null);
        } else {
            skuPrice = null;
        }
        Item item = new Item(image, null, null, null, str, str2, str3, null, skuPrice, null, null, null, null, null, null, null, c1766250w3z.LJI);
        String str5 = c1766250w3z.LIZLLL;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(item);
        ShopCard shopCard = new ShopCard(str5, null, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(shopCard);
        CartCache cartCache = new CartCache(arrayList3);
        C212391189t c212391189t = C212391189t.LIZ;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(cartCache);
        c212391189t.getClass();
        C212391189t.LIZIZ("order_submit_preview_params", "order_submit_preview_cache_params", strLJIIIIZZ);
    }

    public static Map LJFF(C1766240w3y c1766240w3y, Map map) {
        c1766240w3y.getClass();
        C1766270w41 c1766270w41 = C1766270w41.LIZ;
        c1766270w41.getClass();
        List<String> list = C1766270w41.LIZIZ;
        c1766240w3y.getClass();
        c1766270w41.getClass();
        return C1766270w41.LIZ(list, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2 LJ(X.C1766260w40 r29, java.util.Map r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766240w3y.LJ(X.0w40, java.util.Map, java.lang.String):com.ss.android.ugc.aweme.ecommerce.model.OrderSubmitEnterParamsV2");
    }

    public static void LJI(Context context, String str, String str2) {
        int iLJIILJJIL = C12ES.LJIILJJIL(C12ES.LJIIIIZZ(context) * 0.9f, context);
        C0XI4 c0xi4 = new C0XI4("sslocal://webcast_webview");
        c0xi4.LJ("title", str);
        c0xi4.LJ("gravity", "bottom");
        c0xi4.LJ("type", "popup");
        c0xi4.LJ("height", String.valueOf(iLJIILJJIL));
        c0xi4.LIZIZ(1, "hide_nav_bar");
        C0XI4 c0xi42 = new C0XI4(str2);
        c0xi42.LJ("web_bg_color", "FFFFFF");
        c0xi42.LIZIZ(0, "hide_loading");
        c0xi4.LJ("url", c0xi42.LJFF());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0xi4.LJFF());
        sbLIZ.append("&use_page_back=true&show_title_bar=true&show_title_close=true");
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJ(context, UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public final void LIZ(C1766260w40 c1766260w40, Map<String, ? extends Object> map, String str) {
        if (((Boolean) C276550Asf.LIZ.getValue()).booleanValue()) {
            OrderSubmitEnterParamsV2 orderSubmitEnterParamsV2LIZLLL = LIZLLL(c1766260w40, map, str);
            C212391189t c212391189t = C212391189t.LIZ;
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(orderSubmitEnterParamsV2LIZLLL);
            c212391189t.getClass();
            C212391189t.LIZIZ("combined_sku_order_submit_params", "combined_sku_order_req_params", strLJIIIIZZ);
        }
    }

    public final String LIZIZ(C1766260w40 c1766260w40, Map<String, ? extends Object> map, String str) throws JSONException {
        String string;
        Object obj;
        OrderSubmitRequestParam orderSubmitRequestParam = new OrderSubmitRequestParam(Collections.singletonList(new OrderShopDigest(c1766260w40.LJ, Collections.singletonList(new OrderSKUDTO(c1766260w40.LIZIZ, c1766260w40.LIZJ, 1, 1, C1741890vQh.LJIIIIZZ(LJFF(this, map)), c1766260w40.LIZLLL, null)))), 1);
        Uri uri = UriProtector.parse("aweme://ec/order_submit_v2");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme());
        builder.authority(uri.getHost());
        builder.path(uri.getPath());
        builder.appendQueryParameter("buy_type", CardStruct.IStatusCode.DEFAULT);
        builder.appendQueryParameter("requestParams", C1741890vQh.LJIIIIZZ(orderSubmitRequestParam));
        if (map == null || (obj = map.get("biz_type")) == null || (string = obj.toString()) == null) {
            string = "-1";
        }
        builder.appendQueryParameter("biz_type", string);
        String str2 = c1766260w40.LIZLLL;
        if (str2 != null) {
            builder.appendQueryParameter("chain_key", str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", c1766260w40.LIZ);
        builder.appendQueryParameter("orderRequestParams", C786410Ut5.J3(jSONObject));
        LIZ.getClass();
        List<String> list = LIZLLL;
        C1766270w41.LIZ.getClass();
        builder.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(C1766270w41.LIZ(list, map)));
        if (c1766260w40.LJFF) {
            builder.appendQueryParameter("free_shipping", "1");
        }
        C1739720vNC.LIZ(builder, str);
        return builder.build().toString();
    }

    public final OrderSubmitEnterParamsV2 LIZLLL(C1766260w40 c1766260w40, Map<String, ? extends Object> map, String str) {
        Object obj;
        int iIntValue;
        int i;
        Integer num;
        String str2 = c1766260w40.LIZIZ;
        str2.toString();
        List listSingletonList = Collections.singletonList(new OrderShopDigestV2(c1766260w40.LJ, Collections.singletonList(new OrderSKUDTOV2(str2, c1766260w40.LIZJ, 1, null, 1, null, C1741890vQh.LJIIIIZZ(LJFF(this, map)), c1766260w40.LIZLLL, null, null, null, null, null, null, null, null, null, null, null)), null));
        int i2 = c1766260w40.LJII;
        HashMap map2 = new HashMap();
        map2.put("room_id", c1766260w40.LIZ);
        OrderSubmitRequestParamV2 orderSubmitRequestParamV2 = new OrderSubmitRequestParamV2(null, listSingletonList, map2, null, null, null, 0L, null, null, null, Integer.valueOf(i2), Boolean.FALSE, null, null, null, null, null, null);
        HashMap map3 = new HashMap();
        List<String> list = LIZLLL;
        C1766270w41.LIZ.getClass();
        for (Map.Entry entry : ((HashMap) C1766270w41.LIZ(list, map)).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                map3.put(key, value);
            }
        }
        HashMap map4 = new HashMap();
        map4.put("room_id", c1766260w40.LIZ);
        String str3 = c1766260w40.LIZLLL;
        if (str3 == null) {
            str3 = "";
        }
        if (map != null) {
            obj = map.get("biz_type");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        boolean z = c1766260w40.LJFF;
        if (Intrinsics.LJFF(c1766260w40.LJI, Boolean.TRUE)) {
            i = 2;
        } else {
            i = 0;
        }
        return new OrderSubmitEnterParamsV2(orderSubmitRequestParamV2, map3, iIntValue, str3, null, null, 0, null, null, null, null, Integer.valueOf(z ? 1 : 0), map4, null, null, str, null, Integer.valueOf(i), 0);
    }

    public static String LIZJ(C1766230w3x c1766230w3x, Map map, String str, int i) throws JSONException {
        String string;
        Object obj;
        Uri uri = UriProtector.parse("aweme://ec/sku");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme());
        builder.authority(uri.getHost());
        builder.path(uri.getPath());
        builder.appendQueryParameter("product_id", c1766230w3x.LIZIZ);
        builder.appendQueryParameter("click_from", String.valueOf(i));
        builder.appendQueryParameter("visitReportParams", c1766230w3x.LIZJ);
        builder.appendQueryParameter("enter_from", "live");
        builder.appendQueryParameter("need_request", "true");
        builder.appendQueryParameter("one_step_order_type", "2");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", c1766230w3x.LIZ);
        builder.appendQueryParameter("orderRequestParams", C786410Ut5.J3(jSONObject));
        C1766240w3y c1766240w3y = LIZ;
        List<String> list = LIZJ;
        c1766240w3y.getClass();
        C1766270w41.LIZ.getClass();
        builder.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(C1766270w41.LIZ(list, map)));
        if (map == null || (obj = map.get("biz_type")) == null || (string = obj.toString()) == null) {
            string = "-1";
        }
        builder.appendQueryParameter("biz_type", string);
        EnumC1766210w3v enumC1766210w3v = c1766230w3x.LIZLLL;
        EnumC1766210w3v enumC1766210w3v2 = EnumC1766210w3v.SKC;
        if (enumC1766210w3v == enumC1766210w3v2 && ((Boolean) C276470AsX.LIZ.getValue()).booleanValue()) {
            builder.appendQueryParameter("sku_type", String.valueOf(enumC1766210w3v2.getValue()));
        }
        C1739720vNC.LIZ(builder, str);
        return builder.build().toString();
    }

    public static void LJII(Integer num, String str, Map map, Map map2) {
        if (map == null) {
            return;
        }
        C1018703yb.LIZLLL("tiktokec_confirm_sku", new C1766220w3w(map, map.get("enter_from_merge"), map.get("enter_method"), str, num, map2));
    }
}
