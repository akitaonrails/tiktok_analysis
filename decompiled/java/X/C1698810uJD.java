package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1698810uJD {
    public final String LIZ;
    public int LIZIZ;
    public long LIZJ;

    public final Long LIZ() {
        int i = this.LIZIZ;
        if (i == 0) {
            return 0L;
        }
        return Long.valueOf(this.LIZJ / ((long) i));
    }

    public final void LIZIZ() {
        this.LIZJ = 0L;
        this.LIZIZ = 0;
    }

    public C1698810uJD(String str) {
        this.LIZ = "";
        this.LIZ = str;
    }

    public final void LIZLLL(String str, String str2, JSONObject jSONObject) {
        LJ(str, str2, jSONObject, 0L);
    }

    public final void LIZJ(long j, long j2, String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            this.LIZJ += (j - jSONObject.optLong(str)) - j2;
            this.LIZIZ++;
        }
    }

    public final void LJ(String str, String str2, JSONObject jSONObject, long j) {
        if (jSONObject.has(str) && jSONObject.has(str2)) {
            this.LIZJ += (jSONObject.optLong(str) - jSONObject.optLong(str2)) - j;
            this.LIZIZ++;
        }
    }
}
