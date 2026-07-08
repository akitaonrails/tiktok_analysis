package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469120oKk implements InterfaceC1469140oKm {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final long LJI;

    @Override // X.InterfaceC1469140oKm
    public final JSONObject LJLIIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.LIZIZ);
            jSONObject.put("language_id", this.LIZ);
            jSONObject.put("format", this.LIZJ);
            jSONObject.put("language", this.LJ);
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.LJFF);
            jSONObject.put("expire", this.LJI);
            jSONObject.put("sub_id", this.LIZLLL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
            return jSONObject;
        }
    }

    public final String toString() {
        JSONObject jSONObjectLJLIIIL = LJLIIIL();
        if (jSONObjectLJLIIIL.has("url") && jSONObjectLJLIIIL.has("language_id") && jSONObjectLJLIIIL.has("format") && jSONObjectLJLIIIL.has("sub_id")) {
            return C786410Ut5.J3(jSONObjectLJLIIIL);
        }
        return null;
    }

    public C1469120oKk(JSONObject jSONObject) {
        this.LIZIZ = jSONObject.optString("url");
        this.LIZ = jSONObject.optInt("language_id");
        this.LIZJ = jSONObject.optString("format");
        this.LJ = jSONObject.optString("language");
        this.LJFF = jSONObject.optInt(FollowStatusChangeMethod.PARAM_UID);
        this.LJI = jSONObject.optLong("expire");
        this.LIZLLL = jSONObject.optInt("sub_id");
    }
}
