package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ugw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713520ugw {
    public final C1713590uh3 LIZ;
    public final C1714040uhm LIZIZ;
    public final C1713540ugy LIZJ;

    public C1713520ugw(C1713590uh3 c1713590uh3, C1714040uhm c1714040uhm, C1713540ugy c1713540ugy) {
        this.LIZ = c1713590uh3;
        this.LIZIZ = c1714040uhm;
        this.LIZJ = c1713540ugy;
        try {
            if (C1269004xs.LIZ().enableOptimize) {
                String strOptString = new JSONObject(new JSONObject(c1713590uh3.LIZJ).optString("verify_detail")).optString("fp_session_id");
                if (strOptString.length() > 0) {
                    c1713540ugy.LIZ = strOptString;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1713520ugw(C1713590uh3 c1713590uh3, C1714040uhm c1714040uhm, C1713540ugy c1713540ugy, int i) {
        this(c1713590uh3, (i & 2) != 0 ? C1714040uhm.LJII : c1714040uhm, (i & 4) != 0 ? new C1713540ugy(null, 7) : c1713540ugy);
    }
}
