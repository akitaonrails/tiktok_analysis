package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0678, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0678 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("track_name", str);
            jSONObject.put("timestamp", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            C1713870uhV.LIZIZ("rd_pipo_probe_sdk", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
