package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411110mpB {
    public static final Integer LIZIZ(String str) {
        if (Intrinsics.LJFF(str, EnumC1411100mpA.GENERAL_ERROR.getValue())) {
            return Integer.valueOf(R.raw.icon_emoji_dislike);
        }
        if (Intrinsics.LJFF(str, EnumC1411100mpA.NETWORK_ERROR.getValue())) {
            return Integer.valueOf(R.raw.icon_wifi_slash);
        }
        if (Intrinsics.LJFF(str, EnumC1411100mpA.PAYMENT_ERROR.getValue())) {
            return Integer.valueOf(R.raw.icon_exclamation_mark_triangle);
        }
        return null;
    }

    public static final JSONObject LIZ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("ui_type", str);
        }
        if (str2 != null) {
            jSONObject.put("reason", str2);
        }
        return jSONObject;
    }
}
