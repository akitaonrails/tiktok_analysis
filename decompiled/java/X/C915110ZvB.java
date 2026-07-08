package X;

import android.content.Context;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915110ZvB {
    public static void LIZ() {
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null) {
            try {
                new C0ZDN(contextLJII).LIZ(2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on vibrate, error: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LIZIZ("MultiGuestVibratorUtil", C2188811AlT.LIZIZ(sbLIZ));
                Context contextLJII2 = C497740JfY.LJII();
                if (contextLJII2 != null) {
                    try {
                        ((Vibrator) C786410Ut5.H2(contextLJII2, "vibrator")).cancel();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("cancelVibrate, error: ");
                        sbLIZ2.append(e2.getMessage());
                        C20441214yg.LIZIZ("MultiGuestVibratorUtil", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }
}
