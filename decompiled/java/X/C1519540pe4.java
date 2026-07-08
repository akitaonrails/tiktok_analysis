package X;

import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pe4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519540pe4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, String str) {
        LIZLLL("rd_ec_media_auto_play", C2097608Jq.LJIIIIZZ(new Pair("page_name", "mall"), new Pair("media_type", "live"), new Pair("item_id", str), new Pair("rd_page_type", "native"), new Pair("value", Integer.valueOf(i))));
    }

    public static void LIZLLL(String str, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    public static void LIZ(Boolean bool, String str, String str2, String str3) {
        Pair[] pairArr = new Pair[6];
        boolean zBooleanValue = false;
        pairArr[0] = new Pair("page_name", "live");
        pairArr[1] = new Pair("media_type", "live");
        pairArr[2] = new Pair("item_id", str2);
        pairArr[3] = new Pair("rd_page_type", "native");
        if (str3 == null) {
            str3 = "-1";
        }
        pairArr[4] = new Pair("duration", str3);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        pairArr[5] = new Pair("is_playing", Boolean.valueOf(zBooleanValue));
        LIZLLL(str, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) throws JSONException {
        LIZLLL("rd_ec_media_load", C2097608Jq.LJIIIIZZ(new Pair("page_name", "mall"), new Pair("media_type", "live"), new Pair("load_duration", str), new Pair("is_success", str2), new Pair("error_code", str3), new Pair("rd_page_type", "native"), new Pair("item_id", str4)));
    }
}
