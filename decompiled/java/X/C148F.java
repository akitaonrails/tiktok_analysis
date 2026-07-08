package X;

import com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadDataContent;
import com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeUploadRequest;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148F {
    public static ProbeUploadRequest LIZ(AnonymousClass1489 anonymousClass1489) throws JSONException {
        HashMap<String, Object> map;
        Set<String> setKeySet;
        Object obj;
        HashMap<String, Object> map2;
        String str = anonymousClass1489.LJFF;
        ProbeUploadDataContent probeUploadDataContent = new ProbeUploadDataContent(anonymousClass1489.LIZLLL, anonymousClass1489.LJ, String.valueOf(System.currentTimeMillis()), anonymousClass1489, C1716590ult.LIZ());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fp_session_id", probeUploadDataContent.fpSessionId);
        jSONObject.put("mode", probeUploadDataContent.mode);
        jSONObject.put("sampled_at", probeUploadDataContent.sampledAt);
        jSONObject.put("ttuid", probeUploadDataContent.ttUid);
        JSONObject jSONObject2 = new JSONObject();
        AnonymousClass1489 anonymousClass14892 = probeUploadDataContent.snapshot;
        if (anonymousClass14892 != null && (map = anonymousClass14892.LIZJ) != null && (setKeySet = map.keySet()) != null) {
            for (String str2 : setKeySet) {
                AnonymousClass1489 anonymousClass14893 = probeUploadDataContent.snapshot;
                if (anonymousClass14893 != null && (map2 = anonymousClass14893.LIZJ) != null) {
                    obj = map2.get(str2);
                } else {
                    obj = null;
                }
                jSONObject2.put(str2, obj);
            }
        }
        jSONObject.put("snapshot", jSONObject2);
        return new ProbeUploadRequest(str, "NATIVE_ANDROID", C786410Ut5.J3(jSONObject));
    }
}
