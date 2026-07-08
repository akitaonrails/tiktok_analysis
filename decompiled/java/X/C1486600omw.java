package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486600omw {
    public String LIZ;
    public int LIZJ;
    public int LJ;
    public JSONObject LJI;
    public int LIZIZ = -1;
    public EnumC1486620omy LIZLLL = EnumC1486620omy.Unknown;
    public long LJFF = -1;
    public long LJII = -1;

    public final boolean LIZIZ() {
        return this.LIZJ == 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyItem{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", strategyId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", runningType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", repeat=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", Time=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", StrategyInputParams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", runnable=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", listener=");
        sbLIZ.append((Object) null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1486600omw LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C1486600omw c1486600omw = new C1486600omw();
        String strOptString = jSONObject.optString("Name");
        c1486600omw.LIZ = strOptString;
        c1486600omw.LIZIZ = C1486300omS.LJI(strOptString);
        c1486600omw.LIZJ = jSONObject.optInt("Enable");
        c1486600omw.LIZLLL = EnumC1486620omy.from(jSONObject.optInt("Type"));
        c1486600omw.LJ = jSONObject.optInt("Repeat");
        c1486600omw.LJFF = jSONObject.optLong("Time");
        c1486600omw.LJII = jSONObject.optInt("FallbackToPlayerAbr");
        c1486600omw.LJI = jSONObject.optJSONObject("StrategyInputParams");
        return c1486600omw;
    }
}
