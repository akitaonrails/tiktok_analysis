package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: renamed from: X.0V4W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4W {
    public static boolean LIZ() {
        C844470XAv.LIZ.getClass();
        try {
            return C786410Ut5.b4(GoogleApiAvailability.getInstance(), C844470XAv.LIZ()) == 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
