package X;

import android.app.KeyguardManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20642615q4 {
    public static boolean LIZ() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isDeviceSecure();
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
