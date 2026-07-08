package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828950WfV {
    public static boolean LIZ(Context context, int i) {
        if (!LIZIZ(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), "com.google.android.gms", 64);
            C828930WfT c828930WfTLIZ = C828930WfT.LIZ(context);
            c828930WfTLIZ.getClass();
            if (packageInfoY3 == null) {
                return false;
            }
            if (!C828930WfT.LIZLLL(packageInfoY3, false) && (!C828930WfT.LIZLLL(packageInfoY3, true) || !C829090Wfj.honorsDebugCertificates(c828930WfTLIZ.LIZ))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(Context context, int i, String str) {
        C812460Vu0 c812460Vu0LIZ = C812450Vtz.LIZ(context);
        c812460Vu0LIZ.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C786410Ut5.H2(c812460Vu0LIZ.LIZ, "appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
