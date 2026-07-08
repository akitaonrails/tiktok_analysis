package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551210qT9 {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public Boolean LJIIIZ;
    public final String LJIIJ;

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("access_key", this.LIZLLL);
        jSONObject.put("channel", this.LIZJ);
        jSONObject.put("stats_type", this.LIZIZ);
        jSONObject.put("clean_duration", this.LJI);
        long j = this.LIZ;
        if (j != 0) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, j);
        }
        int i = this.LJII;
        if (i != 0) {
            jSONObject.put("req_type", i);
        }
        int i2 = this.LJ;
        if (i2 != 0) {
            jSONObject.put("clean_type", i2);
        }
        int i3 = this.LJFF;
        if (i3 != 0) {
            jSONObject.put("clean_strategy", i3);
        }
        int i4 = this.LJIIIIZZ;
        if (i4 != 0) {
            jSONObject.put("expire_time_type", i4);
        }
        Boolean bool = this.LJIIIZ;
        if (bool != null) {
            jSONObject.put("allow_update", bool.booleanValue() ? 1 : 0);
        }
        if (!this.LJIIJ.isEmpty()) {
            jSONObject.put("tag", this.LJIIJ);
        }
    }

    public C1551210qT9(int i, int i2, int i3, long j, String str, String str2) {
        this.LJIIJ = "";
        this.LIZLLL = str;
        this.LIZJ = str2;
        this.LJI = j;
        this.LIZIZ = i;
        this.LJIIIIZZ = i2;
        this.LJ = i3;
        C179500mX.LIZ.getClass();
        this.LJIIJ = C179500mX.LIZIZ(str, str2);
    }

    public C1551210qT9(int i, int i2, int i3, long j, long j2, String str, String str2) {
        this.LJIIJ = "";
        this.LIZJ = str2;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = 1;
        this.LJI = j2;
        this.LIZIZ = i2;
        this.LIZ = j;
        this.LJII = i3;
    }
}
