package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.08NT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NT {
    static {
        C0VI8.LIZIZ("ProcessUtils");
    }

    public static boolean LIZ(Context context, C0VHM c0vhm) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> listLJII;
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C08NT.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VI8.LIZ().getClass();
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
                if (activityManager != null && (listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dTF6Tg0zW9KSQlgzTlyNa0aIFeLDaFc2iQj4/7IR1w/N/t9k7w==", new String[]{"01789"}))) != null && !listLJII.isEmpty()) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            processName = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    processName = null;
                } else {
                    processName = null;
                }
            }
        }
        c0vhm.getClass();
        if (!TextUtils.isEmpty(null)) {
            return TextUtils.equals(processName, null);
        }
        return TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
