package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.AwS132S1200000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014700cVo {
    public static final void LIZ(C1014730cVr c1014730cVr, String str, JSONObject jSONObject) {
        jSONObject.putOpt("componentType", c1014730cVr.LL.type);
        jSONObject.putOpt("appearCount", Integer.valueOf(c1014730cVr.LLILLL.LJIILJJIL()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("type", str);
        jSONObject2.putOpt("extra", jSONObject);
        AbstractC1028360crq abstractC1028360crq = c1014730cVr.LLJZIJLIL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIIJJI("anole_event", jSONObject2);
            return;
        }
        C1014720cVq c1014720cVq = C1014720cVq.LIZ;
        AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(c1014730cVr, str, jSONObject, 7);
        c1014720cVq.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("anole_send_event_after_render", true)) {
            return;
        }
        awS132S1200000_16.invoke();
    }
}
