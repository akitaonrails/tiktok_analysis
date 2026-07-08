package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594270NSn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(String str, String str2) throws JSONException {
        C1421105hJ.LIZLLL("rd_tiktokec_remove_lucky_bag_error", new Pair("activity_id", str), new Pair("error_msg", str2));
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("name", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("schema", str3);
            jSONObject.put("source", str4);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktok_add_short_touches_inform_live", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(int i, String str, String str2, String str3, Integer num) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("activity_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("index", str3);
            jSONObject.put("error_code", Integer.valueOf(i));
            jSONObject.put("message_type", "EcShortItemRefreshMessage");
            jSONObject.put("message_sub_type", num);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_short_touch_message", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(int i, String str, String str2, String str3, String str4) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("name", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("schema", str3);
            jSONObject.put("source", str4);
            jSONObject.put("error_code", i);
            jSONObject.put("from_client", "1");
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_short_touches_get_fail", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(Integer num, String str, String str2, String str3, String str4) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("room_id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("name", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("schema", str3);
            jSONObject.put("source", str4);
            jSONObject.put("from_client", "1");
            jSONObject.put("is_list_empty", num);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_short_touches_get", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
