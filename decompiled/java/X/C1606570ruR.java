package X;

import Y.ACallableS429S0100000_24;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ruR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC1294060jmO
public final class C1606570ruR {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static int LIZJ = -1;
    public static String LIZLLL = "";
    public static int LJ;

    public static final void LIZ() {
        if (LIZJ < 0 || LIZ < 0 || LIZIZ < 0 || TextUtils.isEmpty(LIZLLL)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_status", String.valueOf(LIZJ));
        jSONObject.put("push_label", LIZLLL);
        jSONObject.put("push_cold_boost_user_cache", LJ);
        long j = LIZIZ;
        long j2 = LIZ;
        if (j - j2 > 0) {
            jSONObject.put("push_total", String.valueOf(j - j2));
        }
        C15O7.LIZJ(new ACallableS429S0100000_24(jSONObject, 2));
    }
}
