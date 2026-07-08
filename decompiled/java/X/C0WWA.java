package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: renamed from: X.0WWA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWA {
    public static int LIZ(Context context) {
        try {
            return C786410Ut5.b4(GoogleApiAvailability.getInstance(), C786410Ut5.N3(context));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 1;
        }
    }
}
