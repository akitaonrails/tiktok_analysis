package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1294060jmO
public final class C1906130zhb {
    public static C1906130zhb LIZJ;
    public static volatile long LIZLLL;
    public final SharedPreferences LIZ;
    public final SharedPreferences LIZIZ;

    public static synchronized C1906130zhb LIZ() {
        long jLIZJ = C461720I8s.LIZJ();
        if (LIZJ == null || jLIZJ != LIZLLL) {
            synchronized (C1906130zhb.class) {
                try {
                    if (LIZJ == null || jLIZJ != LIZLLL) {
                        LIZJ = new C1906130zhb();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZIZ() {
        this.LIZ.edit().putLong("maf_group_click_time", System.currentTimeMillis()).apply();
    }

    public C1906130zhb() {
        LIZLLL = C461720I8s.LIZJ();
        Context applicationContext = C1948707kD.LIZ().getApplicationContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("imbase_");
        sbLIZ.append(LIZLLL);
        this.LIZ = C810670Vr7.LIZJ(applicationContext, 0, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = C810670Vr7.LIZJ(C1948707kD.LIZ().getApplicationContext(), 0, "iuserstate");
    }
}
