package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Uty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786960Uty {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        try {
            if (C786410Ut5.Y3(context.getPackageManager(), "com.bd.nproject", 1) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
