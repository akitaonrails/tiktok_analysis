package X;

import android.text.TextUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QRR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRR {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C663050Pzb());

    public static final String LIZ(Map<String, String> map) {
        String str = map.get("group_id");
        if (str == null) {
            String str2 = map.get("aweme_id");
            if (str2 == null) {
                return map.get("from_group_id");
            }
            return str2;
        }
        return str;
    }

    public static final String LIZIZ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("group_id");
        if (strOptString.length() <= 0 && 0 == 0) {
            String strOptString2 = jSONObject.optString("aweme_id");
            if (strOptString2.length() <= 0) {
                return jSONObject.optString("from_group_id");
            }
            return strOptString2;
        }
        return strOptString;
    }

    public static final String LIZJ(Map<String, String> map) {
        String str = map.get("enter_from");
        if (str != null && str.length() > 0) {
            return str;
        }
        return map.get("enter_from_info");
    }

    public static final String LIZLLL(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("enter_from");
        if (strOptString.length() <= 0) {
            return jSONObject.optString("enter_from_info");
        }
        return strOptString;
    }

    public static final boolean LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Intrinsics.LJFF(str, "homepage_hot");
    }

    public static final boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C1109004Vk.LIZ()) {
            if (!Intrinsics.LJFF(str, "visual_search") && !Intrinsics.LJFF(str, "photo_search")) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(str, "visual_search");
    }

    public static final String LJ(JSONObject jSONObject, String str, Map map) {
        String str2;
        if (map == null || (str2 = (String) map.get(str)) == null) {
            if (jSONObject != null) {
                return jSONObject.optString(str);
            }
            return null;
        }
        return str2;
    }
}
