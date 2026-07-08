package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687170QxP {
    public static boolean LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;

    public static void LIZ(C0LAB c0lab) {
        c0lab.LJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c0lab.LJ("page_name", "mall");
        c0lab.LJ("enter_from", "mall");
        c0lab.LJ("previous_page", "task_page");
    }

    public static void LIZIZ(C0LAB c0lab) {
        String str;
        c0lab.LJ("pendant_type", "timer");
        if (C444960Hcc.LIZIZ()) {
            str = "left";
        } else {
            str = "right";
        }
        c0lab.LJ("pendant_position", str);
        c0lab.LIZ(0, "is_clickable");
        c0lab.LJ("has_popup", CardStruct.IStatusCode.DEFAULT);
    }

    public static void LIZJ(JSONObject jSONObject) {
        String strOptString;
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab);
        LIZIZ(c0lab);
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("mall_extra_info");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        c0lab.LJ("mall_extra_info", strLIZIZ);
        if (jSONObject != null) {
            strOptString = jSONObject.optString("pause_type");
        } else {
            strOptString = null;
        }
        c0lab.LJ("pause_type", strOptString);
        C1018703yb.LIZIZ("tiktokec_hover_pendant_pause", c0lab.LIZ);
    }

    public static void LIZLLL(JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        String strOptString3 = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString, "start")) {
            LIZLLL = SystemClock.elapsedRealtime();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("page_name", "search_coin");
            c0lab.LJ("path", "/tiktok/incentive/v1/task/done/activation");
            c0lab.LJ("type", "start");
            C1018703yb.LIZIZ("rd_tiktokec_request_info", c0lab.LIZ);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - LIZLLL;
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("page_name", "search_coin");
        c0lab2.LJ("path", "/tiktok/incentive/v1/task/done/activation");
        if (jSONObject != null) {
            strOptString2 = jSONObject.optString("is_success");
        } else {
            strOptString2 = null;
        }
        c0lab2.LJ("success", strOptString2);
        c0lab2.LJ("type", "end");
        if (jSONObject != null) {
            strOptString3 = jSONObject.optString("msg");
        }
        c0lab2.LJ("msg", strOptString3);
        c0lab2.LIZ(C687120QxK.LIZ().retryTime, "retry_count");
        c0lab2.LIZIZ(jElapsedRealtime, "duration");
        C1018703yb.LIZIZ("rd_tiktokec_request_info", c0lab2.LIZ);
    }
}
