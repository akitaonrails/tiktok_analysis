package X;

import com.bytedance.ies.im.core.api.model.ExpValue;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Cuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328840Cuo {
    public static final C328840Cuo LIZ = new C328840Cuo();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C328880Cus());

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("partial_user_exp_info-");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Map LIZJ(boolean z) {
        String strLIZIZ;
        try {
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("full_user_exp_info-");
                sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = LIZIZ();
            }
            return (Map) C051M.LIZJ(LIZ().getString(strLIZIZ, ""), new TypeToken<HashMap<String, Map<String, ? extends ExpValue>>>() { // from class: X.0Cuq
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final synchronized void LIZLLL(long j) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("full_user_exp_query_time-");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
