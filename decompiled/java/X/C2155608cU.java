package X;

import com.bytedance.crash.monitor.k;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2155608cU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[EmergencyChannelCustomException]: ");
        sbLIZ.append(str);
        k.LIZJ().LJII(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[EmergencyDrillCustomException]: ");
        sbLIZ.append(str);
        k.LIZJ().LJII(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        if (C2155408cS.LIZ() >= 1) {
            C793770VBv.LJII("emergency_handler_overwrite_domain_storage", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("domain", str), new Pair("config_id", str2), new Pair("config_key", str3), new Pair("config_value", str4))), null, null);
        }
    }
}
