package X;

import com.bytedance.sdui.event.SDUIEventManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298550jtd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AbstractC1317090kNX abstractC1317090kNX, C1291190jhl c1291190jhl, String str) {
        if (C1317810kOh.LJIILIIL) {
            SDUIEventManager sDUIEventManager = abstractC1317090kNX.LLJJJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", c1291190jhl.LIZ);
            jSONObject.put("msg", c1291190jhl.LIZ());
            jSONObject.put("extra", str);
            sDUIEventManager.LIZIZ("sdui_error", jSONObject);
        }
    }
}
