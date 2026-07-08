package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.commerce.OrderCenterData;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ifF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251190ifF {
    public static final C1251190ifF LIZ = new C1251190ifF();
    public static final n LIZIZ;

    static {
        n nVar = new n();
        nVar.LJJIIJ("mall_out_source", "personal_homepage.order_center_shoptab_diversion_guide.in_app");
        nVar.LJJIIJ("mall_landing_page", "mallhalforderlist");
        nVar.LJJIIJ("mall_homepage_visited_type", "2");
        LIZIZ = nVar;
    }

    public static Map LIZ(OrderCenterData orderCenterData) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        if (orderCenterData == null) {
            return null;
        }
        try {
            if (C736460Sui.LIZIZ(orderCenterData.getOrderCenterGuideSchema())) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = orderCenterData.getOrderCenterGuideSchema();
            } else {
                Uri uri = UriProtector.parse(orderCenterData.getOrderCenterSchema());
                if (uri != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "order_center_guide_schema");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), "migration_dialog_frequency")) == null) {
                return null;
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0ied
            }.getType();
            c1227904rF.getClass();
            return (Map) C1227904rF.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("page_name", "personal_homepage");
        jSONObject.put("actionsheet_name", "order_center_shoptab_diversion_guide");
        jSONObject.put("mall_extra_info", LIZIZ);
        jSONObject.put("button_name", str);
        jSONObject.put("previous_page", str2);
        LJFF("tiktokec_button_click", jSONObject);
    }

    public static void LJ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("page_name", "personal_homepage");
        jSONObject.put("tab_name", "go_to_shop_tab");
        jSONObject.put("mall_entrance", "personal_homepage.order_center_shoptab_diversion_guide.in_app");
        jSONObject.put("mall_extra_info", LIZIZ);
        jSONObject.put("enter_from", str);
        jSONObject.put("direct_text", str2);
        jSONObject.put("is_login", ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() ? 1 : 0);
        LJFF("tiktokec_mall_entrance_show", jSONObject);
    }

    public static void LJFF(String str, JSONObject jSONObject) {
        try {
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).postEvent(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(Boolean bool, String str, String str2, Map map) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("page_name", "personal_home_page");
        jSONObject.put("enter_from", str2);
        jSONObject.put("previous_page", str2);
        jSONObject.put("button_for", "orders");
        jSONObject.put("entry", "advanced_interactions");
        jSONObject.put("entry_name", str);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str3 = "red_dot";
        } else {
            str3 = "";
        }
        jSONObject.put("notice_type", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        LJFF("tiktokec_ecommerce_centre_entry_click", jSONObject);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("page_name", "personal_home_page");
        jSONObject.put("button_name", "order_center");
        jSONObject.put("previous_page", str4);
        jSONObject.put("button_for", "orders");
        jSONObject.put("entry", "advanced_interactions");
        jSONObject.put("entry_name", str);
        jSONObject.put("subsequent_page", str2);
        jSONObject.put("notice_type", str3);
        LJFF("tiktokec_button_click", jSONObject);
    }
}
