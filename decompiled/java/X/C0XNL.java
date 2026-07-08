package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XNL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XNL {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0XNQ());

    public static final void LJI(String str, JSONObject jSONObject) {
        C0XNK c0xnk = C0XNC.LIZ;
        if (c0xnk != null && c0xnk.LIZJ != null) {
            c0xnk.LIZIZ().getMonitor().onEvent(str, jSONObject);
        }
    }

    public static final void LIZJ(long j, String str, boolean z) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        jSONObject.put("error_code", i);
        jSONObject.put("error_desc", "");
        jSONObject.put("duration", j);
        LJI("tt_ticket_guard_add_get_ticket_headers", jSONObject);
        if (!z) {
            LIZ("zti_add_headers_to_get_ticket_request_error", "all", -1, null, null, null);
        }
    }

    public static final void LJ(long j, long j2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_on", z ? 1 : 0);
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        jSONObject.put("server_time", j / j3);
        jSONObject.put("local_time", j2 / j3);
        LIZ("zti_ntp_time_updated", "all", 0, null, C786410Ut5.J3(jSONObject), null);
    }

    public static final void LIZLLL(int i, String str, String str2, boolean z) throws JSONException {
        String str3;
        Function0 function0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", i);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        jSONObject.put("error_desc", str3);
        jSONObject.put("is_first_generate", z ? 1 : 0);
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("key_type", "ree");
        LJI("tt_ticket_guard_get_private_key", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Scene.SCENE_SERVICE, str2);
        String strJ3 = C786410Ut5.J3(jSONObject2);
        if (z) {
            function0 = null;
            LIZ("create_ree_private_key", "all", i, str, strJ3, null);
        } else {
            function0 = null;
            LIZ("load_ree_private_key", "all", i, str, strJ3, null);
        }
        if (i != 0 && !z) {
            LIZ("load_ree_private_key_error", "all", i, str, strJ3, function0);
        }
    }

    public static final void LJFF(long j, String str, String str2, boolean z) throws JSONException {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        jSONObject.put("error_code", i);
        if (str == null) {
            str = "";
        }
        jSONObject.put("error_desc", str);
        jSONObject.put("attempt_count", 1);
        jSONObject.put("duration", j);
        jSONObject.put("path", str2);
        jSONObject.put("key_type", "ree");
        LJI("tt_ticket_guard_create_signature", jSONObject);
    }

    public static void LIZ(String str, String str2, int i, String str3, String str4, Function0 function0) {
        if (!LIZ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", str);
        jSONObject.put("ticket_name", str2);
        jSONObject.put("error_code", i);
        jSONObject.put("error_desc", str3);
        Object objInvoke = str4;
        if (str4 == null) {
            if (function0 != null) {
                objInvoke = function0.invoke();
            } else {
                objInvoke = null;
            }
        }
        jSONObject.put("extra_info", String.valueOf(objInvoke));
        LJI("tt_ticket_guard_full_path", jSONObject);
    }
}
