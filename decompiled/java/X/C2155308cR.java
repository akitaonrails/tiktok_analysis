package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigDomain;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigPayload;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2155308cR {
    public static boolean LIZ;

    public static final void LIZ() {
        Map<EmergencyConfigDomain, C2155708cV> map = C08NF.LIZ;
        EmergencyConfigDomain emergencyConfigDomain = EmergencyConfigDomain.LIBRA;
        String strName = emergencyConfigDomain.name();
        if (C2155408cS.LIZ() >= 1) {
            C793770VBv.LJII("emergency_domain_server_updated", new JSONObject(C2097908Jt.LIZJ(new Pair("domain", strName))), null, null);
        }
        if (C08NF.LIZ.get(emergencyConfigDomain) != null) {
            C2155708cV.LIZ();
            EmergencyConfigPayload emergencyConfigPayload = C2155708cV.LIZIZ;
            if (emergencyConfigPayload != null) {
                C2155708cV.LIZ.getClass();
                String strName2 = C2155708cV.LIZJ.name();
                String str = emergencyConfigPayload.configId;
                if (C2155408cS.LIZ() >= 1) {
                    C793770VBv.LJII("emergency_handler_on_server_update", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("domain", strName2), new Pair("config_id", str))), null, null);
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onServerUpdate: No handler for domain=");
            sbLIZ.append(emergencyConfigDomain);
            C2155608cU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_config_7", true, false)) {
            C2155608cU.LIZJ("emergency_drill_config_7");
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "emergency_drill_config_8", true, false)) {
            C2155608cU.LIZJ("emergency_drill_config_8");
        }
    }

    public static final void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(196656);
        if (!LIZ) {
            LIZ = true;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
