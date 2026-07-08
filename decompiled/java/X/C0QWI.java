package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QWI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWI {
    public final C0QWJ LIZ;

    public final void LIZJ() throws JSONException {
        String enterSearchFrom;
        C0QER c0qer;
        C0QER c0qer2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        C0QWJ c0qwj = this.LIZ;
        if (c0qwj == null || (c0qer2 = c0qwj.LIZ) == null || (enterSearchFrom = c0qer2.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        jSONObject.put("enter_from", enterSearchFrom);
        jSONObject.put(Scene.SCENE_SERVICE, "guess_word_scene");
        C0QWJ c0qwj2 = this.LIZ;
        if (c0qwj2 != null && (c0qer = c0qwj2.LIZ) != null) {
            jSONObject.put("root_enter_from_type", c0qer.getEcSearchEntranceValue());
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktok_search_intermediate_request_send", jSONObject);
    }

    public C0QWI(C0QWJ c0qwj) {
        this.LIZ = c0qwj;
    }

    public final void LIZIZ(String str) throws JSONException {
        String enterSearchFrom;
        C0QER c0qer;
        C0QER c0qer2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        C0QWJ c0qwj = this.LIZ;
        if (c0qwj == null || (c0qer2 = c0qwj.LIZ) == null || (enterSearchFrom = c0qer2.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        jSONObject.put("enter_from", enterSearchFrom);
        jSONObject.put(Scene.SCENE_SERVICE, "guess_word_scene");
        jSONObject.put("result_type", str);
        C0QWJ c0qwj2 = this.LIZ;
        if (c0qwj2 != null && (c0qer = c0qwj2.LIZ) != null) {
            jSONObject.put("root_enter_from_type", c0qer.getEcSearchEntranceValue());
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktok_search_intermediate_request_result", jSONObject);
    }

    public static void LIZLLL(C0QWI c0qwi, String str, String str2, String str3) {
        String enterSearchFrom;
        C0QER c0qer;
        C0QER c0qer2;
        c0qwi.getClass();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, str);
        pairArr[1] = new Pair("step", str2);
        pairArr[2] = new Pair("is_force", str3);
        C0QWJ c0qwj = c0qwi.LIZ;
        Object objValueOf = "";
        if (c0qwj == null || (c0qer2 = c0qwj.LIZ) == null || (enterSearchFrom = c0qer2.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        pairArr[3] = new Pair("enter_from", enterSearchFrom);
        C0QWJ c0qwj2 = c0qwi.LIZ;
        if (c0qwj2 != null && (c0qer = c0qwj2.LIZ) != null) {
            objValueOf = Integer.valueOf(c0qer.getEcSearchEntranceValue());
        }
        pairArr[4] = new Pair("root_enter_from_type", objValueOf.toString());
        pairArr[5] = new Pair("is_history_first_screen", String.valueOf(false));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_ec_search_middle_trace", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0QWI r12, X.C0QWA r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QWI.LIZ(X.0QWI, X.0QWA, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void LJ(String str, String str2, boolean z, boolean z2, boolean z3, Integer num, Long l, boolean z4, boolean z5, Map<String, String> map) {
        String enterSearchFrom;
        Object objValueOf;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C0QER c0qer;
        C0QER c0qer2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, str);
        pairArr[1] = new Pair("step", str2);
        C0QWJ c0qwj = this.LIZ;
        if (c0qwj == null || (c0qer2 = c0qwj.LIZ) == null || (enterSearchFrom = c0qer2.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        pairArr[2] = new Pair("enter_from", enterSearchFrom);
        C0QWJ c0qwj2 = this.LIZ;
        if (c0qwj2 == null || (c0qer = c0qwj2.LIZ) == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(c0qer.getEcSearchEntranceValue());
        }
        pairArr[3] = new Pair("root_enter_from_type", objValueOf.toString());
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_ecommerce_cache", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("is_first_enter", obj2);
        if (!z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("is_leave", obj3);
        if (z4) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[7] = new Pair("is_first_screen", obj4);
        if (!z5) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_prefetch", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (num != null) {
            mapLJIIJ.put("count", String.valueOf(num.intValue()));
        }
        if (l != null) {
            mapLJIIJ.put("duration", String.valueOf(l.longValue()));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    if (value == null) {
                        value = "";
                    }
                    mapLJIIJ.put(key, value);
                }
            }
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_ec_search_blankpage_trace", mapLJIIJ);
    }
}
