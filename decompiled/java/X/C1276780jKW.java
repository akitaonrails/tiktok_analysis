package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276780jKW {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final int LJI;
    public final float LJII;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("streamId", this.LIZ);
        jSONObject.put("x", Float.valueOf(this.LIZIZ));
        jSONObject.put("y", Float.valueOf(this.LIZJ));
        jSONObject.put("w", Float.valueOf(this.LIZLLL));
        jSONObject.put("h", Float.valueOf(this.LJ));
        jSONObject.put("z", this.LJFF);
        jSONObject.put("winId", this.LJI);
        jSONObject.put("r", Float.valueOf(this.LJII));
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixLayout(streamID='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', x=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", w=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", h=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", z=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", windowID=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", r=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1276780jKW(String str, float f, float f2, float f3, float f4, int i, int i2) {
        this(f, f2, f3, f4, 0.0f, i, i2, str);
    }

    public C1276780jKW(float f, float f2, float f3, float f4, float f5, int i, int i2, String str) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = f5;
    }
}
