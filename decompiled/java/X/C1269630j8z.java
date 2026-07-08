package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269630j8z extends C1269610j8x {
    public Object LJII;
    public Object LJIIIIZZ;

    @Override // X.C1269610j8x
    public final JSONObject LIZJ(int i) {
        JSONObject jSONObjectLIZJ = super.LIZJ(i);
        if (jSONObjectLIZJ != null) {
            try {
                Object obj = this.LJII;
                if (obj != null) {
                    jSONObjectLIZJ.put("mRtcVideoEncoderConfigs", obj.toString());
                }
                Object obj2 = this.LJIIIIZZ;
                if (obj2 != null) {
                    jSONObjectLIZJ.put("mVideoPerformanceConfig", obj2.toString());
                    return jSONObjectLIZJ;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLIZJ;
    }

    public C1269630j8z(int i, EnumC1269590j8v enumC1269590j8v, int i2) {
        super(i, enumC1269590j8v, i2, null);
    }
}
