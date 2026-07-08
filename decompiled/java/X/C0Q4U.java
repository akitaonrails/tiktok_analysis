package X;

import Y.ARunnableS0S0001000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.inter.ISearchResultForECService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q4U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4U {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZJ(String str) {
        switch (str.hashCode()) {
            case -375552706:
                if (!str.equals("mall_seven_half_page")) {
                    return str;
                }
                return "vertical_scene";
            case 1068799878:
                if (!str.equals("tiktok_product_detail")) {
                    return str;
                }
                return "vertical_scene";
            case 1614249761:
                if (!str.equals("tiktok_ecom")) {
                    return str;
                }
                return "vertical_scene";
            case 1614486073:
                if (!str.equals("tiktok_mall")) {
                    return str;
                }
                return "vertical_scene";
            case 1716042897:
                if (str.equals("tiktok_mall_channel_page")) {
                    return "vertical_scene";
                }
            default:
                return str;
        }
    }

    public static final void LIZIZ(View view, Aweme aweme, C0Q4V c0q4v) throws JSONException {
        String str;
        Boolean boolValueOf;
        Context context;
        Object obj;
        String str2;
        Map map;
        ILiveOuterService iLiveOuterService;
        Context context2;
        C0J4W c0j4wC4;
        ILiveOuterService iLiveOuterService2;
        C0J4W c0j4wC42;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        String str3;
        ISearchResultForECService iSearchResultForECService;
        if (((Boolean) C0A6T.LIZ.getValue()).booleanValue() && (iSearchResultForECService = (ISearchResultForECService) PluggableExtentionKt.pluggableSpi$default(ISearchResultForECService.class, false, false, false, 14, null)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Scene.SCENE_SERVICE, "ecom");
            iSearchResultForECService.LIZ(linkedHashMap);
        }
        AwemeBizExtKt.setSearchFeedType(aweme, c0q4v.LIZIZ);
        AwemeExtKt.appendMobParam(aweme, "enter_from_merge", c0q4v.LJFF);
        if (((Boolean) C276270AsD.LIZ.getValue()).booleanValue()) {
            AwemeExtKt.appendMobParam(aweme, "search_keyword", c0q4v.LIZLLL);
        }
        String str4 = c0q4v.LJ;
        String str5 = c0q4v.LIZLLL;
        String strLIZIZ = C2817017f.LIZIZ(c0q4v.LIZJ);
        String str6 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String str7 = c0q4v.LJIIJJI;
        Object obj2 = c0q4v.LJIIIZ.get("search_result_id");
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = "";
        }
        C1603960rqE.LIZ = new C0PPK(aweme, str4, str5, strLIZIZ, str7, str, c0q4v.LJIIJ, c0q4v.LJFF);
        C1702420uP2.LIZIZ(2000L, 2, 8);
        int i = AnonymousClass0810.LIZ.LIZJ;
        if (i == 1 || i == 2 || i == 3) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS0S0001000_3((int) 2000, 5));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str8 = c0q4v.LJIIL;
        if (str8 != null) {
            JSONObject jSONObject = new JSONObject(str8);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap3.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        for (Map.Entry<String, Object> entry : c0q4v.LJIIIZ.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap2.put("search_id", c0q4v.LJ);
        linkedHashMap2.put("search_keyword", c0q4v.LIZLLL);
        if (!((Boolean) C276390AsP.LIZ.getValue()).booleanValue() && view != null && (iSearchContextAbilityLIZ = C0Q3E.LIZ(view)) != null && (c0pcyWw1 = iSearchContextAbilityLIZ.Ww1()) != null && (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) != null && (str3 = c663990Q2r.LL) != null) {
            linkedHashMap2.put("search_entrance", str3);
        }
        linkedHashMap2.put("search_live_enter_method", "jsb");
        IECommerceArchService iECommerceArchService = (IECommerceArchService) PluggableExtentionKt.pluggableSpi$default(IECommerceArchService.class, false, false, false, 14, null);
        if (iECommerceArchService != null) {
            boolValueOf = Boolean.valueOf(iECommerceArchService.LIZ());
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && view != null) {
            Map<String, Object> map2 = c0q4v.LJIILJJIL;
            if (map2 != null) {
                for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
                }
            }
            linkedHashMap2.put("ec_inflow_scene", "ecom_search");
            C315220CXg.LIZ().LJJLIIJ(view, "c0", "d0", linkedHashMap2, null);
        }
        boolean z = false;
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService3 != null && (c0j4wC4 = iLiveOuterService3.C4()) != null && c0j4wC4.enable() && (iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j4wC42 = iLiveOuterService2.C4()) != null && c0j4wC42.LIZLLL()) {
            z = true;
        }
        if (z && Intrinsics.LJFF(c0q4v.LIZ, "live") && C1ER1.LIZIZ.LJJJLL(c0q4v.LJFF) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
            if (view != null) {
                context2 = view.getContext();
            } else {
                context2 = null;
            }
            iLiveOuterService.R3(context2, aweme);
        }
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
        smartRouteBuildRoute.withParam("video_from", c0q4v.LIZIZ);
        smartRouteBuildRoute.withParam("refer", c0q4v.LJFF);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
        smartRouteBuildRoute.withParam("tracker_data", c0q4v.LJIIL);
        String str9 = c0q4v.LJIIJJI;
        if (str9 == null) {
            str9 = "";
        }
        smartRouteBuildRoute.withParam("search_channel", LIZJ(str9));
        smartRouteBuildRoute.withParam("search_detail", ((Number) C274940Aq4.LIZIZ.getValue()).intValue());
        String str10 = c0q4v.LIZ;
        if (Intrinsics.LJFF(str10, "live")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("room_id", aweme.getAid());
            String str11 = c0q4v.LJIIJJI;
            if (str11 != null) {
                str6 = str11;
            }
            LIZ(LIZJ(str6), c0q4v.LIZIZ, c0q4v.LJI, new AwS376S0200000_10(c0q4v, jSONObject2, 157));
            smartRouteBuildRoute.withParam("ec_live_extra", C786410Ut5.J3(jSONObject2));
        } else if (Intrinsics.LJFF(str10, "video")) {
            String str12 = c0q4v.LJIIJJI;
            if (str12 != null) {
                str6 = str12;
            }
            LIZ(LIZJ(str6), c0q4v.LIZIZ, c0q4v.LJI, new AwS589S0100000_10(smartRouteBuildRoute, 663));
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            smartRouteBuildRoute.withParam((String) entry3.getKey(), (String) entry3.getValue());
        }
        Map<String, Object> map3 = c0q4v.LJIILL;
        if (map3 != null) {
            obj = map3.get("btm");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            Object obj3 = map3.get("bcm");
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = str2;
            c21244318Bt.LIZIZ = PageFinder.via(view);
            BcmParams.Companion.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZJ(map);
            String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
            if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                smartRouteBuildRoute.withParam("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
            }
        }
        if (C0QDQ.LIZIZ()) {
            String str13 = c0q4v.LJIILIIL;
            if (C123100dR.LIZ(str13) && str13 != null) {
                smartRouteBuildRoute.withParam("ec_search_traffic_source_list", str13);
            }
        }
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap2, false);
        smartRouteBuildRoute.open();
    }

    public static final void LIZ(String str, String str2, String str3, Function1<? super String, Unit> function1) {
        if (Intrinsics.LJFF(str2, "from_top_products_card")) {
            if ((C078L.LIZ() != 1 || !C1257480ipO.LIZ.getBoolean("search_invoke_inner_flow_guide_products_card", false)) && str3 != null) {
                function1.invoke(str3);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str2, "from_ecom_search_inflow_v2")) {
            return;
        }
        if (C078L.LIZ() == 1) {
            Keva keva = C1257480ipO.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search_invoke_inner_flow_guide_");
            sbLIZ.append(str);
            if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                return;
            }
        }
        if (str3 == null) {
            return;
        }
        function1.invoke(str3);
    }
}
