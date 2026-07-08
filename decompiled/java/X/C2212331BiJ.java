package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1BiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2212331BiJ implements InterfaceC2213261Bjo {
    public static final boolean LIZ(C2212611Bil c2212611Bil, String str, String str2) throws JSONException {
        if (!C1293990jmH.LIZ(str) && !C1293990jmH.LIZ(str2)) {
            if (new C0VSJ(str2).exists()) {
                return true;
            }
            C0VSJ c0vsj = new C0VSJ(str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(".tmp");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                if (C2212241BiA.LIZ(str, strLIZIZ)) {
                    C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                    if (c0vsj2.renameTo(c0vsj)) {
                        C1018230cbV.LIZJ(c2212611Bil.LIZIZ, Long.valueOf(c2212611Bil.LIZ), true, null);
                        return true;
                    }
                    if (c0vsj2.exists()) {
                        c0vsj2.delete();
                    }
                    C1018230cbV.LIZJ(c2212611Bil.LIZIZ, Long.valueOf(c2212611Bil.LIZ), false, null);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C1018230cbV.LIZJ(c2212611Bil.LIZIZ, Long.valueOf(c2212611Bil.LIZ), false, th.getMessage());
            }
        }
        return false;
    }
}
