package X;

import java.util.Map;

/* JADX INFO: renamed from: X.05Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345105Of {
    public static final C1345105Of LIZ = new C1345105Of();

    public static void LIZ(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FundSafetyMonitor error: ");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(map);
        C201955140j.LJIILJJIL(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
    }
}
