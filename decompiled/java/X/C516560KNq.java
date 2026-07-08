package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516560KNq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, String str) {
        try {
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C786410Ut5.Y3(context.getPackageManager(), str, 0) == null) {
            return false;
        }
        return true;
    }
}
