package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521470phB extends AbstractC1520150pf3 {
    public String LJI;
    public int LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;

    public C1521470phB() {
        super("jsbPerf");
    }

    @Override // X.AbstractC1520150pf3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsbInfoData(bridgeName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", statusDescription=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", protocolVersion=");
        sbLIZ.append((String) null);
        sbLIZ.append(", costTime=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", invokeTime=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", callbackTime=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", fireEventTime=");
        sbLIZ.append(0L);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIILIIL("bridge_name", this.LJI, jSONObject);
        C1520640pfq.LJIIJJI(this.LJII, "status_code", jSONObject);
        C1520640pfq.LJIILIIL("status_description", this.LJIIIIZZ, jSONObject);
        C1520640pfq.LJIILIIL("protocol_version", null, jSONObject);
        C1520640pfq.LJIIL("cost_time", this.LJIIIZ, jSONObject);
        C1520640pfq.LJIIL("invoke_ts", this.LJIIJ, jSONObject);
        C1520640pfq.LJIIL("callback_ts", this.LJIIJJI, jSONObject);
        C1520640pfq.LJIIL("fireEvent_ts", 0L, jSONObject);
    }
}
