package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743880TFy {
    public static boolean LIZ(Context context, String str) {
        if (context != null && str != null) {
            try {
                if (!str.isEmpty()) {
                    try {
                        if (C786410Ut5.Y3(context.getPackageManager(), str, 64) != null) {
                            return true;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }
}
