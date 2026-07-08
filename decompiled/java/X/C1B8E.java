package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B8E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B8E {
    public final JSONObject LIZ;
    public int LIZIZ;

    public C1B8E(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    public final void LIZ(int i) {
        int iOptInt = this.LIZ.optInt("thread_count", 4);
        if (iOptInt > 16) {
            iOptInt = 16;
        }
        if (iOptInt <= 0) {
            if (this.LIZ.optInt("url_balance", 2) <= 0) {
                i = 1;
            }
        } else if (this.LIZ.optInt("url_balance", 2) == 1) {
            i = Math.min(iOptInt, i);
        } else {
            i = iOptInt;
        }
        this.LIZIZ = i;
    }
}
