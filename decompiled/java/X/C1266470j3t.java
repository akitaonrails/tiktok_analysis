package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266470j3t implements InterfaceC1267260j5A {
    public String LIZJ;
    public int LIZ = -1;
    public String LIZIZ = "android";
    public JSONObject LIZLLL = new JSONObject();
    public JSONArray LJ = new JSONArray();
    public JSONArray LJFF = new JSONArray();
    public int LJI = -1;
    public int LJII = -1;
    public JSONObject LJIIIIZZ = new JSONObject();

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHBasicFeature{version=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", os='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", region='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", abParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", gearBitrateTableJsonArray=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", adaptiveBitrateJsonArray=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", probeAimLevel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", probeBottomLevel=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266470j3t)) {
            C1266470j3t c1266470j3t = (C1266470j3t) interfaceC1267260j5A;
            this.LIZ = c1266470j3t.LIZ;
            this.LIZIZ = c1266470j3t.LIZIZ;
            this.LIZJ = c1266470j3t.LIZJ;
            this.LIZLLL = c1266470j3t.LIZLLL;
            this.LJFF = c1266470j3t.LJFF;
            this.LJ = c1266470j3t.LJ;
            this.LJI = c1266470j3t.LJI;
            this.LJII = c1266470j3t.LJII;
            this.LJIIIIZZ = c1266470j3t.LJIIIIZZ;
        }
    }
}
