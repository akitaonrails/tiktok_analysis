package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: renamed from: X.0V4V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4V {
    public static boolean LIZ(Context context) {
        try {
            if (C786410Ut5.b4(GoogleApiAvailability.getInstance(), context) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
