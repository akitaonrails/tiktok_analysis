package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0THs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744340THs {
    public static final Map LIZ(String str) {
        Map mapLJ = C2097608Jq.LJ();
        if (C1533950q1J.LJ(str)) {
            try {
                mapLJ = C2348509Id.LIZIZ(new JSONObject(str));
                return mapLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str2 = C0TCX.LJIILJJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generateMap failed:");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return mapLJ;
    }
}
