package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0VE8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VE8 {
    public static boolean LIZ(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    public static boolean LIZIZ(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
