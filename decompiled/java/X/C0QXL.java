package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QXL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXL {
    public static boolean LIZIZ;
    public static Map<String, Object> LIZJ;
    public static Map<String, ? extends Object> LIZLLL;
    public static final C0QXL LIZ = new C0QXL();
    public static final List<String> LJ = new ArrayList();

    public static void LIZLLL() {
        String string;
        Map<String, Object> linkedHashMap;
        if (LIZJ == null) {
            try {
                Object objLJIIIIZZ = C7740030o.LIZ().getGson().LJIIIIZZ(Keva.getRepo("ecommerce_search_repo").getString("ecom_search_new_user_data", ""), new TypeToken<Map<String, Object>>() { // from class: X.0QXM
                }.getType());
                LIZIZ = Intrinsics.LIZLLL(C2327809Ae.LJIIIIZZ(String.valueOf(((Map) objLJIIIIZZ).get("ecom_search_user_type"))), 2.0f);
                linkedHashMap = (Map) objLJIIIIZZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                linkedHashMap = new LinkedHashMap<>();
            }
            LIZJ = linkedHashMap;
        }
        if (LIZLLL != null || !LIZIZ || (string = Keva.getRepo("ecommerce_search_repo").getString("ecom_search_new_user_response_data", "")) == null || string.length() == 0) {
            return;
        }
        Object objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, (Class<Object>) HashMap.class);
        LIZLLL = C19719512Dh.LJII(objFromJson) ? (Map) objFromJson : null;
    }

    public static Map LIZIZ() {
        LIZLLL();
        Map<String, ? extends Object> map = LIZLLL;
        if (map != null) {
            return map;
        }
        Map<String, Object> map2 = LIZJ;
        return map2 == null ? new LinkedHashMap() : map2;
    }

    public static String LIZ(String str) {
        return new Regex("\\s").replace(a0.LJLIIIL(str).toString(), "").toLowerCase(Locale.ROOT);
    }

    public static void LIZJ(String str, Map map) throws JSONException {
        if (Intrinsics.LIZLLL(C2327809Ae.LJIIIIZZ(String.valueOf(map.get("ecom_search_user_type"))), 2.0f) != LIZIZ) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api", "middle");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_new_user_fallback", jSONObject);
        }
        if ((!map.isEmpty()) && LIZIZ) {
            LIZLLL = map;
            Keva.getRepo("ecommerce_search_repo").storeString("ecom_search_new_user_response_data", str);
        }
    }

    public static void LJ(Uri uri, SearchResultParam searchResultParam) throws JSONException {
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        ECSearchEntranceData ecSearchEntranceData2;
        String strLIZ;
        Object obj;
        String str;
        Object obj2;
        C0QLP c0qlp;
        if (searchResultParam.getEcommerceNewUserModel() != null) {
            return;
        }
        if ((Intrinsics.LJFF(searchResultParam.getEnterMethod(), "feed_click_recom_words") || Intrinsics.LJFF(searchResultParam.getEnterMethod(), "mall_homepage_recom")) && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
            ecSearchEntranceData.updateFeatureStrategyOnce("enable_new_user_module", CardStruct.IStatusCode.DEFAULT);
        }
        C0QER searchEnterParam2 = searchResultParam.getSearchEnterParam();
        if (searchEnterParam2 != null && (ecSearchEntranceData2 = searchEnterParam2.getEcSearchEntranceData()) != null && ecSearchEntranceData2.getBooleanStrategy("enable_new_user_module")) {
            C0QXN c0qxn = null;
            String strLIZ2 = null;
            if (uri != null) {
                strLIZ = C416901jj.LIZ(uri, "ec_search_extra_info_from_mall");
            } else {
                strLIZ = null;
            }
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            if (C123100dR.LIZ(strLIZ)) {
                try {
                    linkedHashMap = (Map) C7740030o.LIZ().getGson().LJIIIIZZ(strLIZ, new TypeToken<Map<String, Object>>() { // from class: X.0QUs
                    }.getType());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    linkedHashMap = new LinkedHashMap<>();
                }
            }
            if (uri != null && ((strLIZ == null || strLIZ.length() == 0 || linkedHashMap.isEmpty()) && LIZIZ)) {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("api", "entrance");
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_ec_search_new_user_fallback", jSONObject);
            }
            LIZLLL();
            if (!linkedHashMap.isEmpty()) {
                boolean zLIZLLL = Intrinsics.LIZLLL(C2327809Ae.LJIIIIZZ(String.valueOf(linkedHashMap.get("ecom_search_user_type"))), 2.0f);
                LIZIZ = zLIZLLL;
                if (!zLIZLLL) {
                    LIZLLL = null;
                }
                LIZJ = linkedHashMap;
                ((ArrayList) LJ).clear();
                Keva.getRepo("ecommerce_search_repo").storeString("ecom_search_new_user_data", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedHashMap));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCacheWhenEnterSearch: isNewUser ");
                sbLIZ.append(LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (LIZIZ) {
                Map<String, Object> map = LIZJ;
                if (map != null) {
                    obj = map.get("new_user_page_skin");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Map<String, Object> map2 = LIZJ;
                if (map2 != null) {
                    obj2 = map2.get("new_user_page_skin_search_bar_style");
                } else {
                    obj2 = null;
                }
                if (Intrinsics.LJFF(obj2, "light")) {
                    c0qlp = C0QLP.LIGHT;
                } else if (Intrinsics.LJFF(obj2, "dark")) {
                    c0qlp = C0QLP.DARK;
                } else if (Intrinsics.LJFF(obj2, "adapt")) {
                    c0qlp = C0QLP.ADAPT;
                } else {
                    c0qlp = C0QLP.LIGHT;
                }
                C0QXN c0qxn2 = new C0QXN(true, false, c0qlp, str, EnumC669620QOi.SHOP, null, C0QXU.CHANNEL_NEW_USER.getValue(), C0QXV.SOURCE_RESULT_PAGE_NEW_USER.getValue());
                if (uri != null) {
                    strLIZ2 = C416901jj.LIZ(uri, "landing_page");
                }
                if (Intrinsics.LJFF(strLIZ2, "new_user_page")) {
                    c0qxn2.setLandingToNewUserPage(true);
                }
                c0qxn = c0qxn2;
            }
            searchResultParam.setEcommerceNewUserModel(c0qxn);
        }
    }
}
