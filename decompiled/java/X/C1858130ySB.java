package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ySB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858130ySB {
    public static long LIZIZ;
    public static long LIZJ;
    public static int LJ;
    public static final C1858130ySB LIZ = new C1858130ySB();
    public static String LIZLLL = "";
    public static int LJFF = -1;
    public static String LJI = "";

    public static void LIZ() {
        long j = LIZJ - LIZIZ;
        if (j <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", j);
        jSONObject.put("isFirst", LJ);
        jSONObject.put("card_type", LIZLLL);
        jSONObject.put("source", LJFF);
        jSONObject.put("logId", LJI);
        AppLogNewUtils.onEventV3("tako_native_perf_tracker", jSONObject);
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZLLL = "";
        LJ = 0;
        LJFF = -1;
        LJI = "";
    }
}
