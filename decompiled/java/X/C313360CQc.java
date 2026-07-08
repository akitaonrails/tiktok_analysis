package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313360CQc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, long j, String str) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("service", str);
        c2241008qG.LIZ.put("code", Integer.valueOf(i2));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG2.LIZ.put("duration", Long.valueOf(j));
        C793770VBv.LJIIJ("compliance_age_gate_api", i, jSONObjectLJ, c2241008qG2.LJ(), null);
    }
}
