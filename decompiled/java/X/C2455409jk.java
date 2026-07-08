package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2455409jk {
    public static boolean LIZ(BaseActivity baseActivity, String str, String str2) {
        String packageName = baseActivity.getPackageName();
        boolean z = false;
        if (packageName == null || a0.LJJJIL(packageName)) {
            return false;
        }
        String string = a0.LJLIIIL(str).toString();
        String string2 = a0.LJLIIIL(str2).toString();
        if (string.length() != 0 && string2.length() != 0) {
            PackageManager packageManager = baseActivity.getPackageManager();
            try {
                ComponentName componentName = new ComponentName(packageName, string);
                ComponentName componentName2 = new ComponentName(packageName, string2);
                try {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    packageManager.setComponentEnabledSetting(componentName2, 2, 1);
                    z = true;
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return z;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }
}
