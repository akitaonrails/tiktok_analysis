package X;

import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807650VmF {
    public static void LIZ(Context context) {
        if (C807640VmE.LIZ() != null) {
            C807640VmE.LIZ();
            return;
        }
        C807640VmE c807640VmE = new C807640VmE(context);
        if (!C807660VmG.LIZ(C807640VmE.class)) {
            try {
                if (!C807660VmG.LIZ(c807640VmE)) {
                    try {
                        LocalBroadcastManager.LIZ(c807640VmE.LIZ).LIZIZ(c807640VmE, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (!C807660VmG.LIZ(C807640VmE.class)) {
            try {
                C807640VmE.LIZIZ = c807640VmE;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        C807640VmE.LIZ();
    }
}
