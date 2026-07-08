package X;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668260QJc {
    public static long LIZIZ;
    public static boolean LIZJ;
    public static int LJ;
    public static String LIZ = "";
    public static String LIZLLL = "";

    public static String LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sug_after_search", LIZJ ? 1 : 0);
        jSONObject.put("cursor_pos", LJ);
        jSONObject.put("is_cleared", LIZIZ > 0 ? 1 : 0);
        if (!TextUtils.isEmpty(LIZLLL)) {
            jSONObject.put("last_sug", LIZLLL);
        }
        long j = LIZIZ;
        if (j > 0) {
            jSONObject.put("cleared_time", j);
            jSONObject.put("content_before_clear", LIZ);
        }
        return Uri.encode(C786410Ut5.J3(jSONObject));
    }
}
