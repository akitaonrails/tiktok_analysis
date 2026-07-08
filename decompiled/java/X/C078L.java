package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.078L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C078L {
    public static final int LIZ() {
        int iLJ = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("ec_search_first_enter_inflow_action_type", 0);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return iLJ;
        }
    }
}
