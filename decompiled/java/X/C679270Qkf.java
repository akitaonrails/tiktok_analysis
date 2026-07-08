package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679270Qkf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        try {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                key = entry.getKey();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("rd_mixed_page", 1);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog2: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(C0QER c0qer, int i, String str) {
        String pageName;
        String previousPage;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (c0qer == null || (pageName = c0qer.getPageName()) == null) {
            pageName = "goods_search";
        }
        c2344009Gk.LJIIIIZZ("page_name", pageName);
        String enterSearchFrom = null;
        if (c0qer != null) {
            previousPage = c0qer.getPreviousPage();
            if (previousPage == null) {
                previousPage = c0qer.getEnterSearchFrom();
            }
        } else {
            previousPage = null;
        }
        c2344009Gk.LJIIIIZZ("previous_page", previousPage);
        if (c0qer != null) {
            enterSearchFrom = c0qer.getEnterSearchFrom();
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterSearchFrom);
        c2344009Gk.LJIIIIZZ("notice_type", "black_number");
        c2344009Gk.LIZJ(i, "notice_number");
        c2344009Gk.LJIIIIZZ("cart_entrance", "search_float_cart");
        c2344009Gk.LJIIIIZZ("search_id", str);
        LIZIZ("tiktokec_cart_entrance_number_add", c2344009Gk.LIZ);
    }
}
