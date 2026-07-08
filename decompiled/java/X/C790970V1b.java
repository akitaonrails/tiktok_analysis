package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790970V1b {
    public static final /* synthetic */ int LIZ = 0;

    static {
        PatternProtector.compile("^0-([\\d]+)$");
    }

    public static boolean LIZ(Context context) {
        try {
            return Settings.canDrawOverlays(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) C786410Ut5.H2(context, "appops"), Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() != 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return false;
            }
        }
    }
}
