package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067790dtR {
    public static void LIZ(JSONObject jSONObject) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report normalized url:");
        sbLIZ.append(jSONObject);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "RomaSDK", 2);
        C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_pv_normalized_url");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }
}
