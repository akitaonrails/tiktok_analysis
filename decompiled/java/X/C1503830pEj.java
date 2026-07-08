package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503830pEj {
    public static volatile boolean LIZIZ;
    public static final C1503830pEj LIZ = new C1503830pEj();
    public static final String LIZJ = UUID.randomUUID().toString();

    public static void LIZ(String str, String str2, boolean z, boolean z2) {
        if (Intrinsics.LJFF(str, "stage_sug_pre_start")) {
            LIZIZ = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enable_opt", C07G3.LIZ());
        jSONObject.put("stage", str);
        jSONObject.put("is_independent_api", z);
        jSONObject.put("is_retry", z2);
        jSONObject.put("error_message", str2);
        jSONObject.put("uuid", LIZJ);
        C20684815ws.LJIJ("tako_api_init", jSONObject);
    }
}
