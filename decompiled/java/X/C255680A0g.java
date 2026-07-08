package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0A0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C255680A0g {
    public static final boolean LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("photomode_detail_event_opt_v2", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
