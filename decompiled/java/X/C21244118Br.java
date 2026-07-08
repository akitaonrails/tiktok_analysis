package X;

import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21244118Br extends C18C6 {
    public static final /* synthetic */ int LIZJ = 0;
    public C18BU LIZIZ;

    @Override // X.C18C6
    public final JSONObject LIZ() {
        JSONObject jSONObjectLIZ = super.LIZ();
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject("bcm_chain_debug");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            try {
                jSONObjectOptJSONObject.put("setting_version", C18CS.LIZ.LJFF());
                jSONObjectOptJSONObject.put("bcm_gecko_version", C18A2.LIZIZ);
                int[] iArr = C21244618Bw.LIZ;
                jSONObjectOptJSONObject.put("libra_version", String.valueOf(C21244618Bw.LIZIZ.getVersion()));
                jSONObjectOptJSONObject.putOpt("launch_not_init", BtmServiceImpl.INSTANCE.getNotInitOnLaunch());
                C18BU c18bu = this.LIZIZ;
                jSONObjectOptJSONObject.putOpt("chain_abnormal_detail", c18bu != null ? c18bu.LIZ() : null);
                jSONObjectOptJSONObject.putOpt("process_recovery_info", C21246118Cl.LIZIZ);
                C21246718Cr.LIZ.getClass();
                jSONObjectOptJSONObject.putOpt("deeplink", C21246718Cr.LJFF);
                HashMap<String, Object> map = C18DC.LIZIZ;
                if (!(!map.isEmpty())) {
                    map = null;
                }
                jSONObjectOptJSONObject.putOpt("launch_intent_extra", map != null ? C051S.LIZ(map) : null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            jSONObjectLIZ.put("bcm_chain_debug", jSONObjectOptJSONObject);
            return jSONObjectLIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return jSONObjectLIZ;
        }
    }
}
