package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveSlardarUidReportOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501590Jll {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static String LIZ() {
        String strValueOf;
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        if (LIZJ()) {
            strValueOf = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getLiveScopedUserId();
        } else {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            LIZIZ = strValueOf;
        }
        LIZ = strValueOf;
        return strValueOf;
    }

    public static boolean LIZJ() {
        return LiveSlardarUidReportOptSetting.INSTANCE.isExp();
    }

    public static String LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && LIZJ()) {
            if (TextUtils.isEmpty(LIZIZ)) {
                LIZIZ = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            }
            if (!TextUtils.isEmpty(LIZIZ) && Intrinsics.LJFF(LIZIZ, str)) {
                return LIZ();
            }
            return str;
        }
        return str;
    }

    public static void LIZLLL(Map map) {
        if (!LIZJ()) {
            return;
        }
        String str = "";
        if (map.get("user_id") != null) {
            String strLIZ = LIZ();
            if (strLIZ != null) {
                str = strLIZ;
            }
            map.put("user_id", str);
            return;
        }
        if (map.get("uid") != null) {
            String strLIZ2 = LIZ();
            if (strLIZ2 != null) {
                str = strLIZ2;
            }
            map.put("uid", str);
            return;
        }
        if (map.get("current_user_id") == null) {
            return;
        }
        String strLIZ3 = LIZ();
        if (strLIZ3 != null) {
            str = strLIZ3;
        }
        map.put("current_user_id", str);
    }

    public static void LJ(HashMap map) {
        if (!LIZJ()) {
            return;
        }
        String str = "";
        if (map.get("user_id") != null) {
            String strLIZ = LIZ();
            if (strLIZ != null) {
                str = strLIZ;
            }
            map.put("user_id", str);
            return;
        }
        if (map.get("uid") != null) {
            String strLIZ2 = LIZ();
            if (strLIZ2 != null) {
                str = strLIZ2;
            }
            map.put("uid", str);
            return;
        }
        if (map.get("current_user_id") == null) {
            return;
        }
        String strLIZ3 = LIZ();
        if (strLIZ3 != null) {
            str = strLIZ3;
        }
        map.put("current_user_id", str);
    }

    public static void LJFF(JSONObject jSONObject) {
        if (!LIZJ()) {
            return;
        }
        if (!TextUtils.isEmpty(jSONObject.optString("user_id"))) {
            jSONObject.put("user_id", LIZ());
        } else if (!TextUtils.isEmpty(jSONObject.optString("uid"))) {
            jSONObject.put("uid", LIZ());
        } else {
            if (TextUtils.isEmpty(jSONObject.optString("current_user_id"))) {
                return;
            }
            jSONObject.put("current_user_id", LIZ());
        }
    }
}
