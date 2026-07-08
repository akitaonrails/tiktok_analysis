package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537400q6s {
    public static long LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C1537400q6s LIZ = new C1537400q6s();
    public static String LJFF = "others";

    public static void LIZ(String str, String str2) throws JSONException {
        if (LIZLLL) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        jSONObject.put("bid", str2);
        jSONObject.put("app_start_to_now", LIZJ - LIZIZ);
        C1BX5 c1bx5 = C1BX5.LIZIZ;
        jSONObject.put("hit_warm_up", c1bx5.LJJI());
        jSONObject.put("webview_start_chromium_task_finished", c1bx5.LJIILLIIL());
        jSONObject.put("webview_warm_up_task_finished", c1bx5.LJ());
        jSONObject.put("has_warm_up", LJ);
        jSONObject.put("warm_up_source", LJFF);
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.onEventV3("webview_cold_start", jSONObject);
        }
        LIZLLL = true;
    }
}
