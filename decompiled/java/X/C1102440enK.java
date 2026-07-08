package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0enK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102440enK extends C1102400enG {
    public final long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;

    @Override // X.C1102400enG
    public final JSONObject LIZ(long j) throws JSONException {
        JSONObject jSONObjectLIZ = super.LIZ(j);
        jSONObjectLIZ.put("continuous_watch_room_cnt", this.LJIIL);
        jSONObjectLIZ.put("continuous_quota", this.LJIILIIL);
        jSONObjectLIZ.put("continuous_quota_count", this.LJIILJJIL);
        return jSONObjectLIZ;
    }

    public C1102440enK(int i, int i2, long j, long j2, int i3, long j3, int i4) {
        super(i, i2, i3, i4, j, j2);
        this.LJIIL = j3;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
    }
}
