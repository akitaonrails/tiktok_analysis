package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1468300oJQ implements InterfaceC1467850oIh {
    public final double[] LIZ = {0.54551238d, -0.03129748d, 0.19721764d, 0.24254935d, 0.01385684d, -1.56912212d, -0.40001913d, -0.57657028d, -0.63627456d, -0.13389704d, 0.0628909d, -0.13203807d, -0.08140563d, -0.09929551d, 0.10024534d, 0.31530643d};
    public String LIZIZ;
    public final double LIZJ;

    public C1468300oJQ() {
        JSONObject jSONObjectLIZLLL = C1309150kAj.LIZ.LIZLLL("net_quality");
        double dOptDouble = jSONObjectLIZLLL == null ? 1.0d : jSONObjectLIZLLL.optDouble("link_function_offset", 1.0d);
        this.LIZJ = dOptDouble;
        if (dOptDouble < 0.0d) {
            this.LIZJ = 1.0d;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("link function offset: ");
        sbLIZ.append(this.LIZJ);
        C1471660oOq.LIZJ("PortraitNetworkScore", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double LIZ(java.util.List<java.lang.Integer> r26, java.util.List<java.lang.Float> r27) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468300oJQ.LIZ(java.util.List, java.util.List):double");
    }
}
