package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1APv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179051APv {
    public final int LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C2179051APv(JSONObject jSONObject) {
        this.LIZLLL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        try {
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "StatusCode");
            this.LIZ = i;
            JSONObjectProtectorUtils.getString(jSONObject, "StatusMessage");
            if (i == 0) {
                this.LIZIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "IpMap");
                this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "Symbol");
            }
            this.LIZLLL = JSONObjectProtectorUtils.getInt(jSONObject, "DnsTTL");
            this.LJ = JSONObjectProtectorUtils.getBoolean(jSONObject, "EnableIpSettings");
            this.LJFF = JSONObjectProtectorUtils.getBoolean(jSONObject, "EnablePing");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
