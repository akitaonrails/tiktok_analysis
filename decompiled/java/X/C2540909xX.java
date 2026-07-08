package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2540909xX {
    public static final int LIZ() {
        int iLJ = 8;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("ad_phone_call_restrict_times", 8);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iLJ;
        }
    }
}
