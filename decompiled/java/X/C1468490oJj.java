package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468490oJj {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optInt("vstyle", 0);
        this.LIZIZ = jSONObject.optInt("dimension", 0);
        this.LIZJ = jSONObject.optInt("projection_model", 0);
        this.LIZLLL = jSONObject.optInt("view_size", 0);
    }

    public final int LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }
}
