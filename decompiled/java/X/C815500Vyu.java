package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815500Vyu {
    public static Intent LIZ(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strLIZJ = LIZJ(activity.getComponentName(), activity);
            if (strLIZJ == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strLIZJ);
            try {
                if (LIZJ(componentName, activity) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent LIZIZ(ComponentName componentName, Context context) throws PackageManager.NameNotFoundException {
        String strLIZJ = LIZJ(componentName, context);
        if (strLIZJ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(C2204961BRm.LJJIJIL(componentName, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXMs354wMpiKk=", new String[]{"01789"})), strLIZJ);
        if (LIZJ(componentName2, context) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String LIZJ(ComponentName componentName, Context context) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else if (i2 >= 24) {
            i = 787072;
        } else {
            i = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return string;
    }
}
