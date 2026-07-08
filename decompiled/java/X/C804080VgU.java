package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804080VgU {
    public static boolean LIZ;

    public static void LIZ(Context context) {
        if (LIZ) {
            return;
        }
        synchronized (C804080VgU.class) {
            try {
                if (!LIZ) {
                    C804090VgV.LIZIZ().LIZJ(context);
                    LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
