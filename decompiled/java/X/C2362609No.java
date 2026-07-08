package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2362609No {
    public static float LIZIZ() {
        long jLLIFFJFJJ = -1;
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                jLLIFFJFJJ = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyDY7Lowj2ETKyDluATvJaflj0xB6U=", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyDY7Lowj2ETKyDluATvJaflj0xB6U=", null));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jLLIFFJFJJ / 1048576.0f;
    }

    public static String LIZ(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfoV3 = C786410Ut5.V3(packageManager, context.getPackageName(), 0);
            if (applicationInfoV3 == null) {
                return "";
            }
            return applicationInfoV3.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1553130qWF.LJ("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    public static String LIZJ(Context context) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }
}
