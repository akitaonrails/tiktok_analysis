package X;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267110j4v implements InterfaceC1267260j5A, InterfaceC1267250j59 {
    public int LIZ;
    public String LIZIZ = "not_set";
    public String LIZJ = "simulcast";
    public String LIZLLL = "not_set";
    public JSONObject LJ = new JSONObject();
    public String LJFF = "not_set";

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHSimulcastFeature{enableLinkmicSimulcast=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkmicLayoutConfigId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", simulcastType='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", prevMultiStream=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", layoutConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", simulcastStreamName='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267250j59
    public final List<String> LIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267110j4v) {
            C1267110j4v c1267110j4v = (C1267110j4v) interfaceC1267260j5A;
            this.LIZ = c1267110j4v.LIZ;
            this.LIZIZ = c1267110j4v.LIZIZ;
            this.LIZJ = c1267110j4v.LIZJ;
            this.LJ = c1267110j4v.LJ;
            this.LIZLLL = c1267110j4v.LIZLLL;
            this.LJFF = c1267110j4v.LJFF;
        }
    }
}
