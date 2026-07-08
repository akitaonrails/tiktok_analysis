package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ot2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490380ot2 {
    public static void LIZ(String str, JSONObject jSONObject, String str2, int i) {
        try {
            InterfaceC1493280oxi tTNetDepend = TTNetInit.getTTNetDepend();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("module_type", str);
            if (i != Integer.MAX_VALUE) {
                jSONObject2.put("code", i);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("message", str2);
            }
            jSONObject2.put("detail_log", jSONObject);
            Logger.debug();
            tTNetDepend.LJII("ttnet_all_log", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
