package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267190j53 implements InterfaceC1267260j5A {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public JSONObject LIZJ;
    public JSONObject LIZLLL;
    public int LJ;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicPerformanceStrategyFeature{enableLinkMicPerformanceStrategy=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentPerformanceLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", performanceMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", performanceLevels=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", encodeConfigs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267190j53) {
            C1267190j53 c1267190j53 = (C1267190j53) interfaceC1267260j5A;
            this.LJ = c1267190j53.LJ;
            this.LIZ = c1267190j53.LIZ;
            this.LIZIZ = c1267190j53.LIZIZ;
            this.LIZJ = c1267190j53.LIZJ;
            this.LIZLLL = c1267190j53.LIZLLL;
        }
    }
}
