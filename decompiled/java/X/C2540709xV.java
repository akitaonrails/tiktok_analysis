package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2540709xV {
    public static final int LIZ() {
        int iLJ = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("omsdk_session_delay_second", 0);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iLJ;
        }
    }
}
