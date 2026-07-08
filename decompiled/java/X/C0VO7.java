package X;

import Y.ARunnableS92S0000000_13;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VO7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VO7 {
    public static final void LIZ(SafeModeActivity safeModeActivity) {
        Object objH2;
        int iMyPid = Process.myPid();
        try {
            objH2 = C786410Ut5.H2(safeModeActivity, "activity");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objH2 != null) {
            List<ActivityManager.RunningAppProcessInfo> listLJII = C2204961BRm.LJII((ActivityManager) objH2, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxIfwfGvU3mg==", null));
            if (listLJII == null) {
                listLJII = C13BV.INSTANCE;
            }
            String packageName = safeModeActivity.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
                if (u.LJJIIJZLJL(runningAppProcessInfo.processName, packageName, false) && runningAppProcessInfo.pid != iMyPid) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Kill: ");
                    sbLIZ.append((Object) runningAppProcessInfo.processName);
                    sbLIZ.append(" pid: ");
                    sbLIZ.append(runningAppProcessInfo.pid);
                    C2200391B9x.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
            C786410Ut5.LJLIIL(60000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS92S0000000_13(43));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
