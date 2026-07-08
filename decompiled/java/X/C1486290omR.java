package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486290omR {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentSteeringParameters{Enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", EnableCheckAtStartup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", EnableCheckAtPlaying=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstFrameTimeoutMS=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timerMinIntervalMS=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1486290omR LIZ(JSONObject jSONObject) {
        int iOptInt;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ContentSteering");
        if (jSONObjectOptJSONObject == null || (iOptInt = jSONObjectOptJSONObject.optInt("Enable")) != 1) {
            return null;
        }
        C1486290omR c1486290omR = new C1486290omR();
        c1486290omR.LIZ = iOptInt;
        c1486290omR.LIZIZ = jSONObjectOptJSONObject.optInt("CheckAtStartup");
        c1486290omR.LIZJ = jSONObjectOptJSONObject.optInt("CheckAtPlaying");
        c1486290omR.LIZLLL = jSONObjectOptJSONObject.optInt("FirstFrameTimeoutMS", -1);
        c1486290omR.LJ = jSONObjectOptJSONObject.optInt("TimerMinIntervalMS", -1);
        return c1486290omR;
    }
}
