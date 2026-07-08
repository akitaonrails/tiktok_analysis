package X;

import android.text.TextUtils;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647370PaJ {
    public static void LIZ(DynamicPatch dynamicPatch, C647340PaG c647340PaG) {
        JSONObject jSONObject = new JSONObject();
        try {
            String encodedSequence = dynamicPatch.getEncodedSequence();
            if (encodedSequence != null) {
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(encodedSequence)).entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue().toString())) {
                        jSONObject.put(entry.getKey(), RopaEncrypt.getDecryptSeq(entry.getValue().toString()).getData());
                    }
                }
                c647340PaG.LIZIZ.put("decodedSequence", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
