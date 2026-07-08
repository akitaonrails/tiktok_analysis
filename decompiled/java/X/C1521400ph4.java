package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521400ph4 extends AbstractC1520150pf3 {
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Map<String, ? extends Object> LJIIIZ;

    public C1521400ph4() {
        super("jsbError");
    }

    @Override // X.AbstractC1520150pf3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsbErrorData(isSync=");
        sbLIZ.append(0);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", bridgeName=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", errorActivity=");
        sbLIZ.append((String) null);
        sbLIZ.append(", protocol=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIIJJI(0, "is_sync", jSONObject);
        C1520640pfq.LJIIJJI(this.LJI, "error_code", jSONObject);
        C1520640pfq.LJIILIIL("error_message", this.LJII, jSONObject);
        C1520640pfq.LJIILIIL("bridge_name", this.LJIIIIZZ, jSONObject);
        C1520640pfq.LJIILIIL("error_activity", null, jSONObject);
        C1520640pfq.LJIILIIL("protocol_version", null, jSONObject);
    }
}
