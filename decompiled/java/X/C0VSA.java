package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VSA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSA {
    public static int LIZ(Context context) {
        try {
            Object objH2 = C786410Ut5.H2(context, "activity");
            if (objH2 != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII((ActivityManager) objH2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/Y2DiA6P3kt72Syu+ylE8ykJj", null))) {
                    if (Intrinsics.LJFF("com.ss.android.ugc.aweme", runningAppProcessInfo.processName) || Intrinsics.LJFF("com.ss.android.ugc.aweme.lite", runningAppProcessInfo.processName)) {
                        Intrinsics.LJIIJJI(Integer.valueOf(runningAppProcessInfo.pid), "main process pid is ");
                        return runningAppProcessInfo.pid;
                    }
                }
                return -1;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LLog.LIZ(th, "getMainProcessPid failed ", new Object[0]);
            return -1;
        }
    }
}
