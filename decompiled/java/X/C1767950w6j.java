package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.LandingPopupOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767950w6j {
    public static final C1767950w6j LIZ = new C1767950w6j();
    public static final ConcurrentHashMap<String, Integer> LIZIZ;
    public static final String LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;

    static {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("tiktokec_cart_entrance_show", 1);
        concurrentHashMap.put("tiktokec_cart_entrance_show_test", 1);
        LIZIZ = concurrentHashMap;
        LIZJ = LynxEnv.inst().getLynxVersion();
        LIZLLL = C452501pT.LIZIZ(new C1767990w6n());
        LJ = C452501pT.LIZIZ(new C1986307qH());
        LJFF = C452501pT.LIZIZ(new C07KR());
        LJI = C452501pT.LIZIZ(new C07KS());
    }

    public static String LJI() {
        C0CXF.LIZ.getClass();
        return C0CXF.LJ() ? "mall" : C0CXF.LJFF() ? "homepage_mall" : "";
    }

    public static Map LJII() {
        return (Map) LIZLLL.getValue();
    }

    public static void LJIIJ() {
        HashMap map = new HashMap();
        map.put("page_name", "mall");
        LIZ.getClass();
        map.put("enter_from", LJFF());
        C1767960w6k.LIZ.getClass();
        map.put("is_first_install_launch", C1767960w6k.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        map.put("is_first_show_mall", C1767960w6k.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJIJ("rd_tiktokec_lynx_template_retry", map);
    }

    public static String LJFF() {
        return C1767800w6U.LJ() ? "homepage_mall" : "mall";
    }

    public static void LIZ(Map map) {
        String second;
        Pair<String, String> pairLIZ;
        HashMap map2 = (HashMap) map;
        map2.put("is_first_launch", Integer.valueOf(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0));
        C1767960w6k.LIZ.getClass();
        map2.put("is_first_enter_mall", Integer.valueOf(C1767960w6k.LIZJ() ? 1 : 0));
        IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
        if (iEcUgNewInstallService == null || (pairLIZ = iEcUgNewInstallService.LIZ()) == null || (second = pairLIZ.getSecond()) == null) {
            second = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_ug_allowlist_user", second);
    }

    public static void LIZJ(Map map) {
        String str;
        for (Map.Entry entry : ((Map) LJI.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "";
        if (!map.containsKey("mall_extra_info")) {
            C1767790w6T c1767790w6T = C1767980w6m.LJII;
            if (c1767790w6T == null || (str = c1767790w6T.LJI) == null) {
                str = "";
            }
            map.put("mall_extra_info", str);
        }
        if (!map.containsKey("diversion_params")) {
            String strLIZ = C1767800w6U.LIZ();
            if (strLIZ != null) {
                str2 = strLIZ;
            }
            map.put("diversion_params", str2);
        }
        map.put("rd_mix_page", 1);
        map.put("mall_event_version", 3540);
        map.put("is_login", Integer.valueOf(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0));
        map.putAll(C2190491AoB.LIZ());
    }

    public static void LIZLLL(Map map) {
        for (Map.Entry entry : ((Map) LJFF.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void LJIIJJI(boolean z) {
        String second;
        Pair<String, String> pairLIZ;
        HashMap map = new HashMap();
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C1767960w6k.LIZ.getClass();
        map.put("coldboot_to_tab_show_duration", Long.valueOf(C1767960w6k.LIZIZ - C1150504el.LIZ().LJJII));
        long j = C1767960w6k.LIZJ;
        if (j > 0) {
            map.put("cold_task_start_time_from_tab_show", Long.valueOf(j - C1767960w6k.LIZIZ));
            map.put("cold_task_is_high_priority", Integer.valueOf(z ? 1 : 0));
        }
        IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
        if (iEcUgNewInstallService == null || (pairLIZ = iEcUgNewInstallService.LIZ()) == null || (second = pairLIZ.getSecond()) == null) {
            second = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_ug_allowlist_user", second);
        LIZ.getClass();
        map.putAll(LJII());
        LJIJ("rd_tiktokec_mall_cold_task_stat", map);
    }

    public static void LJIILL(String str) {
        HashMap map = new HashMap();
        map.put("resource_from", str);
        LIZ.getClass();
        map.put("enter_from", LJFF());
        map.put("page_name", "mall_home");
        map.putAll(LJII());
        LJIJ("rd_tiktokec_gecko_suc", map);
    }

    public static void LJIJI(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        LIZ.getClass();
        map.put("enter_from", LJI());
        LJIJ("rd_tiktokec_mall_preload_time", map);
    }

    public static void LJJI(String str) throws JSONException {
        String str2;
        String str3;
        C1767790w6T c1767790w6T;
        C1741090vPP c1741090vPP;
        C1741040vPK c1741040vPK;
        String str4;
        JSONObject jSONObject;
        String strJ3;
        Map<String, Object> map;
        long j;
        String str5;
        C1741090vPP c1741090vPP2;
        C1741040vPK c1741040vPK2;
        String str6;
        JSONObject jSONObject2;
        boolean zLJFF = Intrinsics.LJFF(str, "homepage_shop_mall");
        if (zLJFF) {
            str2 = "mall";
            str3 = "homepage_bottom_tab";
        } else {
            str2 = "homepage";
            str3 = "homepage_top_tab";
        }
        HashMap map2 = new HashMap();
        map2.put("tab_name", str2);
        map2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map2.put("mall_entrance", str3);
        LIZ.getClass();
        if (C7879035x.LIZLLL()) {
            C1767790w6T c1767790w6T2 = C1767980w6m.LJII;
            if (c1767790w6T2 != null && (c1741090vPP2 = c1767790w6T2.LIZIZ) != null && (c1741040vPK2 = c1741090vPP2.LIZJ) != null && (str6 = c1741040vPK2.LIZ) != null && !a0.LJJJIL(str6)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str6), "mall_extra_info");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    jSONObject2 = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } else {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject2.optString("mall_homepage_visited_type", "").length() == 0) {
                    jSONObject2.put("mall_homepage_visited_type", EnumC587230N1l.ROUTE_TO_SHOP.getValue());
                }
                strJ3 = C786410Ut5.J3(jSONObject2);
            } else {
                C189200o6.m2constructorimpl(Unit.LIZ);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("mall_homepage_visited_type", EnumC587230N1l.CLICK_TO_SHOP.getValue());
                strJ3 = C786410Ut5.J3(jSONObject3);
            }
        } else {
            try {
                c1767790w6T = C1767980w6m.LJII;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (c1767790w6T != null && (c1741090vPP = c1767790w6T.LIZIZ) != null && (c1741040vPK = c1741090vPP.LIZJ) != null && (str4 = c1741040vPK.LIZ) != null && !a0.LJJJIL(str4)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str4), "mall_extra_info");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                } else {
                    jSONObject = new JSONObject();
                }
                if (jSONObject.optString("mall_homepage_visited_type", "").length() == 0) {
                    jSONObject.put("mall_homepage_visited_type", EnumC587230N1l.ROUTE_TO_SHOP.getValue());
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            } else {
                C189200o6.m2constructorimpl(Unit.LIZ);
                JSONObject jSONObject32 = new JSONObject();
                jSONObject32.put("mall_homepage_visited_type", EnumC587230N1l.CLICK_TO_SHOP.getValue());
                strJ3 = C786410Ut5.J3(jSONObject32);
            }
        }
        map2.put("mall_extra_info", strJ3);
        map2.put("btm", "a2270.b99133.c0.d0");
        map2.put("is_login", Integer.valueOf(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0));
        LJIILLIIL("tiktokec_mall_entrance_show", map2);
        HashMap map3 = new HashMap();
        map3.put("tab_name", str2);
        if (!zLJFF) {
            map3.put("mall_entrance", "homepage_mall");
        }
        LIZ.getClass();
        LIZ(map3);
        C1767790w6T c1767790w6T3 = C1767980w6m.LJII;
        if (c1767790w6T3 != null && (map = c1767790w6T3.LJIILIIL) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = map.get("init_time");
            if ((obj instanceof String) && (str5 = (String) obj) != null) {
                j = CastLongProtector.parseLong(str5);
            } else {
                j = 0;
            }
            map3.put("duration", Long.valueOf(jCurrentTimeMillis - j));
            map3.putAll(map);
        }
        LJIJ("rd_tiktokec_mall_entrance_show", map3);
    }

    public static void LJJIIZI(String str) {
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, str);
        LJIJ("rd_tiktokec_not_login_to_login_action", map);
    }

    public static HashMap LJ(String str, Map map) {
        HashMap map2 = new HashMap();
        map2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        LIZ.getClass();
        map2.put("enter_from", LJFF());
        map2.put("page_name", "mall");
        map2.put("entrance_name", "shoptab_login");
        if (str == null) {
            str = "";
        }
        map2.put("previous_page", str);
        map2.put("traffic_diversion_info", C1741890vQh.LJIIIIZZ(map));
        return map2;
    }

    public static void LJIIIIZZ(Map map, Map map2) {
        HashMap map3 = new HashMap();
        map3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        LIZ.getClass();
        map3.put("enter_from", LJFF());
        map3.put("page_name", "mall");
        for (Map.Entry entry : map.entrySet()) {
            map3.put(entry.getKey(), entry.getValue());
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                map3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LJIILLIIL("tiktokec_cart_entrance_click", map3);
    }

    public static void LJIILLIIL(String str, Map map) {
        LIZJ(map);
        LIZLLL(map);
        C1018703yb.LJ(str, map);
        C1741420vPw.LIZ.getClass();
        C0NOF.LIZ.getClass();
    }

    public static void LJIJ(String str, Map map) {
        Object obj;
        Object obj2;
        LIZJ(map);
        for (Map.Entry entry : ((Map) LJ.getValue()).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "1";
        if (!map.containsKey("has_landing_deeplink")) {
            C1767960w6k.LIZ.getClass();
            if (C1767960w6k.LJII) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("has_landing_deeplink", obj2);
        }
        if (!map.containsKey("landing_deeplink_meta")) {
            C1767960w6k.LIZ.getClass();
            String str3 = C1767960w6k.LJIIIIZZ;
            if (str3 == null) {
                str3 = "";
            }
            map.put("landing_deeplink_meta", str3);
        }
        if (!map.containsKey("is_first_enter_page")) {
            C1767960w6k.LIZ.getClass();
            if (C1767960w6k.LJFF) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_first_enter_page", obj);
        }
        if (!map.containsKey("is_cold_launch")) {
            C1767960w6k.LIZ.getClass();
            if (!C1767960w6k.LJI) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_cold_launch", str2);
        }
        C1018703yb.LJ(str, map);
        C1741420vPw.LIZ.getClass();
        C0NOF.LIZ.getClass();
    }

    public static void LJIJJ(Map map, boolean z) {
        Object obj;
        Object obj2;
        HashMap map2 = new HashMap();
        LIZ.getClass();
        map2.put("enter_from", LJI());
        map2.put("page_name", "mall");
        C1767960w6k.LIZ.getClass();
        String str = "1";
        if (C1767960w6k.LIZIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_first_install_launch", obj);
        if (C1767960w6k.LIZJ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_first_show_mall", obj2);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_available", str);
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        LJIJ("rd_tiktokec_network_available", map2);
    }

    public static void LIZIZ(Map map, InterfaceC1773310wFN interfaceC1773310wFN, View view) {
        if (interfaceC1773310wFN != null) {
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", PageFinder.via((View) interfaceC1773310wFN.LIZLLL().LJ), null, 4, null).entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    map.put(key, value);
                }
            }
            return;
        }
        if (view != null) {
            for (Map.Entry entry2 : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", PageFinder.via(view), null, 4, null).entrySet()) {
                if (!map.containsKey(entry2.getKey())) {
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        value2 = "";
                    }
                    map.put(key2, value2);
                }
            }
        }
    }

    public static void LJIIIZ(String str, String str2, C1767790w6T c1767790w6T) {
        String str3;
        long j;
        String str4;
        if (c1767790w6T.LJIJI) {
            c1767790w6T.LJIJI = false;
            HashMap map = new HashMap();
            map.put("page_name", "mall");
            LIZ.getClass();
            map.put("enter_from", LJFF());
            map.put("schema", str);
            String str5 = "";
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            map.put("deeplink_from", str3);
            if (str2 == null) {
                str2 = "";
            }
            map.put("source", str2);
            String str6 = c1767790w6T.LJIIIZ;
            if (str6 != null) {
                str5 = str6;
            }
            map.put("previous_page", str5);
            Map<String, Object> map2 = c1767790w6T.LJIILIIL;
            if (map2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object obj = map2.get("init_time");
                if ((obj instanceof String) && (str4 = (String) obj) != null) {
                    j = CastLongProtector.parseLong(str4);
                } else {
                    j = 0;
                }
                map.put("duration", Long.valueOf(jCurrentTimeMillis - j));
            }
            LJIJ("rd_tiktokec_deeplink_event_send", map);
        }
    }

    public static void LJIILJJIL(int i, String str, String str2) {
        HashMap map = new HashMap();
        LIZ.getClass();
        map.put("enter_from", LJFF());
        if (str2 == null) {
            str2 = "";
        }
        map.put("previous_page", str2);
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        if (str != null) {
            map.put("page_type", str);
        }
        map.putAll(LJII());
        LJIJ("rd_tiktokec_mall_error_view_status", map);
    }

    public static void LJIJJLI(int i, long j, Map map) {
        HashMap map2 = new HashMap();
        map2.put("mall_request_type", 1);
        map2.put("stage", Integer.valueOf(i));
        map2.put("duration", Long.valueOf(j));
        LIZ.getClass();
        map2.put("enter_from", LJI());
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        LJIJ("rd_tiktokec_mall_power_preload", map2);
    }

    public static void LJJII(long j, String str, String str2) {
        HashMap map = new HashMap();
        map.put("page_name", "mall");
        LIZ.getClass();
        map.put("enter_from", LJFF());
        map.put("previous_page", str2);
        map.put("rd_page_type", "native");
        map.put("diversion_id", str);
        map.put("stage", "send_to_target");
        map.put("duration", Long.valueOf(j));
        LJIJ("rd_tiktokec_diversion", map);
    }

    public static void LJJIIJ(String str, String str2, Map map) {
        HashMap map2 = new HashMap();
        map2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map2.put("page_name", "mall");
        LIZ.getClass();
        map2.put("enter_from", LJI());
        map2.put("type", str);
        if (str2 != null) {
            map2.put("stage", str2);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        LJIJ("rd_tiktokec_mall_native", map2);
    }

    public static void LJIIZILJ(String str, Map map, InterfaceC1773310wFN interfaceC1773310wFN, InterfaceC599750Nfh interfaceC599750Nfh) {
        Object objLIZLLL;
        LIZJ(map);
        LIZLLL(map);
        if (interfaceC1773310wFN != null) {
            InterfaceC1773850wGF interfaceC1773850wGF = (InterfaceC1773850wGF) interfaceC1773310wFN.LIZJ().getService(InterfaceC1773850wGF.class);
            if (interfaceC1773850wGF != null) {
                interfaceC1773850wGF.LJFF(new C1774950wI1(str, map, 1, 1, null, 100).LIZ(), null);
                return;
            }
            return;
        }
        if (interfaceC599750Nfh != null && (objLIZLLL = interfaceC599750Nfh.LIZLLL("traffic_diversion_info", EnumC599720Nfe.NATIVE, C2097608Jq.LJ())) != null) {
            map.put("traffic_diversion_info", C1741890vQh.LJIIIIZZ(objLIZLLL));
        }
        C1768180w76.LIZ(str, null, map, false);
    }

    public static void LJJIFFI(Integer num, String str, long j, String str2) {
        int iIntValue;
        HashMap map = new HashMap();
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("rd_mix_page", 1);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        map.put("code", Integer.valueOf(iIntValue));
        if (str == null) {
            str = "none_message";
        }
        map.put("message", str);
        if (str2 == null) {
            str2 = "none_log_id";
        }
        map.put("log_id", str2);
        map.put("api_duration", Long.valueOf(j));
        LJIJ("rd_tiktokec_mall_prefetch_mix_mall_api", map);
    }

    public static void LJJIII(long j, String str, String str2, boolean z) {
        String str3;
        HashMap map = new HashMap();
        map.put("page_name", "mall");
        LIZ.getClass();
        map.put("enter_from", LJFF());
        map.put("image_type", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("uri", str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("success", str3);
        map.put("duration", Long.valueOf(j));
        LJIJ("rd_tiktokec_mall_image", map);
    }

    public static void LJJIIJZLJL(EnumC892060Yz6 enumC892060Yz6, EnumC1599680rjK enumC1599680rjK, EnumC950650aqV enumC950650aqV, Long l) {
        HashMap map = new HashMap();
        LIZ.getClass();
        map.put("enter_from", LJFF());
        map.put("stage", enumC892060Yz6.getValue());
        if (enumC1599680rjK != null) {
            map.put("refresh_type", enumC1599680rjK.getValue());
        }
        if (enumC950650aqV != null) {
            map.put("finish_type", enumC950650aqV.getValue());
        }
        if (l != null) {
            map.put("duration", Long.valueOf(l.longValue()));
        }
        LJIJ("rd_tiktokec_tab_click_refresh_in_mall", map);
    }

    public static void LJJIIZ(String str, boolean z, boolean z2, boolean z3) {
        int i;
        HashMap map = new HashMap();
        int i2 = 0;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("hit_top_experiment", Integer.valueOf(i));
        if (z2) {
            i2 = 1;
        }
        map.put("hit_bottom_experiment", Integer.valueOf(i2));
        map.put("mall_position", str);
        map.put("force_disable", Integer.valueOf(!z3 ? 1 : 0));
        LJIJ("rd_tiktokec_mall_has_shoptab_not_match", map);
    }

    public static void LJIIL(long j, String str, Map map, boolean z, boolean z2) {
        Object obj;
        HashMap map2 = new HashMap();
        LIZ.getClass();
        map2.put("enter_from", LJFF());
        String strLIZJ = C1767800w6U.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        map2.put("previous_page", strLIZJ);
        map2.put("stage", str);
        map2.put("duration", Long.valueOf(j));
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_success", obj);
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("has_failed", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ.getClass();
        map2.putAll(LJII());
        LJIJ("rd_tiktokec_mall_container_lifecycle_dur", map2);
    }

    public static void LJJ(long j, String str, Map map, boolean z, boolean z2) {
        Object obj;
        HashMap map2 = new HashMap();
        LIZ.getClass();
        map2.put("enter_from", LJFF());
        String strLIZJ = C1767800w6U.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        map2.put("previous_page", strLIZJ);
        map2.put("stage", str);
        map2.put("duration", Long.valueOf(j));
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_success", obj);
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("has_failed", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        LIZ.getClass();
        map2.putAll(LJII());
        LJIJ("rd_tiktokec_mall_stage_dur_native", map2);
    }

    public static void LJJIJ(C1767950w6j c1767950w6j, String str, String str2, String str3, String str4, Boolean bool, int i) {
        String str5;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        c1767950w6j.getClass();
        if (LandingPopupOptExperiment.LIZ().enableLifecycleTrack) {
            Pair[] pairArr = new Pair[5];
            String strLIZJ = C1767800w6U.LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            pairArr[0] = new Pair("previous_page", strLIZJ);
            pairArr[1] = new Pair("stage", str);
            if (str2 == null) {
                str2 = "";
            }
            pairArr[2] = new Pair("class_type", str2);
            if (str3 == null) {
                str3 = "";
            }
            pairArr[3] = new Pair("trigger_lifecycle", str3);
            if (str4 == null) {
                str4 = "";
            }
            pairArr[4] = new Pair("popup_container_type", str4);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (bool != null) {
                if (bool.booleanValue()) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                mapLJIIJ.put("is_open_by_overlay", str5);
            }
            LJIJ("rd_tiktokec_popup_open_stage", mapLJIIJ);
        }
    }
}
