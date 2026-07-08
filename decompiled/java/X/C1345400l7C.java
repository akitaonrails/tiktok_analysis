package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1345400l7C extends AbstractC1345440l7G {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public boolean LJFF;

    public static final long LIZLLL(long j, long j2) {
        if (j <= -1 || j2 <= -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    @Override // X.AbstractC1345440l7G
    public final boolean LIZ() {
        if (this.LIZ.length() <= 0) {
            return false;
        }
        long j = this.LIZLLL;
        if (j <= -1) {
            return false;
        }
        long j2 = this.LJ;
        return j2 > -1 && LIZLLL(j, j2) > 0;
    }

    @Override // X.AbstractC1345440l7G
    public void LIZIZ() {
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = false;
    }

    @Override // X.AbstractC1345440l7G
    public JSONObject LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (LIZLLL(this.LIZIZ, this.LIZJ) >= 0) {
            jSONObject.put("duration", LIZLLL(this.LIZIZ, this.LIZJ));
        }
        if (LIZLLL(this.LIZIZ, this.LIZLLL) >= 0) {
            jSONObject.put("duration_before_network", LIZLLL(this.LIZIZ, this.LIZLLL));
        }
        if (LIZLLL(this.LIZLLL, this.LJ) > 0) {
            jSONObject.put("duration_network", LIZLLL(this.LIZLLL, this.LJ));
        }
        if (LIZLLL(this.LJ, this.LIZJ) >= 0) {
            jSONObject.put("duration_after_network", LIZLLL(this.LJ, this.LIZJ));
        }
        jSONObject.put("is_poor_network", this.LJFF);
        return jSONObject;
    }

    public C1345400l7C(long j, long j2, long j3, long j4, String str, boolean z) {
        super(str);
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = z;
    }
}
