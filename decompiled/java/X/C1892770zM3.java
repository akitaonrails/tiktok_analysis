package X;

import android.net.Uri;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892770zM3 {
    public static final C1892770zM3 LIZ = new C1892770zM3();
    public static boolean LIZIZ;
    public static String LIZJ;

    public static void LJII() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, LIZJ);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_webview");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("reconfirm_popup_show", map, null);
    }

    public static JSONObject LJIIIZ() {
        Object c098200Yq;
        String str = LIZJ;
        if (str == null) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (JSONObject) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static void LIZJ(C2344009Gk c2344009Gk) {
        String strOptString;
        String strOptString2;
        c2344009Gk.LJFF("enter_from", "poi_webview_page");
        JSONObject jSONObjectLJIIIZ = LJIIIZ();
        if (jSONObjectLJIIIZ != null && (strOptString2 = jSONObjectLJIIIZ.optString("enter_from")) != null && strOptString2.length() > 0) {
            c2344009Gk.LJFF("webview_enter_from", strOptString2);
        }
        JSONObject jSONObjectLJIIIZ2 = LJIIIZ();
        if (jSONObjectLJIIIZ2 != null && (strOptString = jSONObjectLJIIIZ2.optString("enter_method")) != null && strOptString.length() > 0) {
            c2344009Gk.LJFF("webview_enter_method", strOptString);
        }
    }

    public static void LJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, LIZJ);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_webview");
        c2344009Gk.LJIIIIZZ("button_name", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("reconfirm_popup_click", map, null);
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str) {
        String string;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    string = objOpt.toString();
                } else {
                    string = null;
                }
                c2344009Gk.LJFF(next, string);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, String str) {
        Uri uri = UriProtector.parse(str);
        c2344009Gk.LJIIIIZZ("page_url", str);
        c2344009Gk.LJIIIIZZ("domain_name", uri.getHost());
        c2344009Gk.LJIIIIZZ("page_path", uri.getPath());
    }

    public static void LJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZJ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("btn_name", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_transaction_webview_share_popup_click", map, null);
    }

    public static void LJFF(Long l, String str, EnumC994370bz1 enumC994370bz1, String str2) {
        String string;
        Object objOpt;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        C1189060h32.LJJ("duration", string, linkedHashMap);
        C1189060h32.LJJ("decision_type", enumC994370bz1.getValue(), linkedHashMap);
        C1189060h32.LJJ("url", str, linkedHashMap);
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        linkedHashMap.put(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_webview_navigate_decision", linkedHashMap, null);
    }

    public static void LJIIIIZZ(boolean z, boolean z2, EnumC1782960wUw enumC1782960wUw, Long l, String str, Integer num, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(z)), "scc_blocked");
        c2344009Gk.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(z2)), "is_first_load");
        c2344009Gk.LIZJ(enumC1782960wUw.getValue(), "page_load_status");
        C1189060h32.LJIJJLI(c2344009Gk, "load_time", l);
        c2344009Gk.LJIIIIZZ("host", UriProtector.parse(str).getHost());
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        if (str2 != null) {
            c2344009Gk.LJFF("error_reason", str2);
        }
        C20684815ws.LJIILLIIL("poi_webview_loaded", c2344009Gk.LIZ);
    }

    public static void LIZLLL(boolean z, String str, String str2, String str3, PageFinder pageFinder, Long l, Long l2, Long l3, String str4, boolean z2, Integer num, Integer num2, String str5) {
        String str6;
        Map mapLIZ = C308370C6x.LIZ(null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("page_loaded", str6);
        c2344009Gk.LJII(mapLIZ);
        c2344009Gk.LJIIIIZZ("bcm_chain", str2);
        LIZIZ(c2344009Gk, str);
        LIZ(c2344009Gk, LIZJ);
        c2344009Gk.LJIIIIZZ("hybrid_session_id", str3);
        if (l != null && l2 != null && l3 != null) {
            c2344009Gk.LIZLLL(l2.longValue() - l.longValue(), "native_duration");
            c2344009Gk.LIZLLL(l3.longValue() - l2.longValue(), "third_party_duration");
            c2344009Gk.LIZLLL(l3.longValue() - l.longValue(), "load_duration");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("error_reason", str4);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "origin_code");
        }
        if (str5 != null) {
            c2344009Gk.LJFF("origin_reason", str5);
        }
        c2344009Gk.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(z2)), "is_preload_webview");
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("enter_poi_webview", map, c1185050gwZ);
    }
}
