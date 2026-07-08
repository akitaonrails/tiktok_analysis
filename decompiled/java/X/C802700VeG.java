package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802700VeG {
    public static long LIZ = -1;
    public static ActivityManager.ProcessErrorStateInfo LIZIZ;

    public static boolean LIZIZ() throws Throwable {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.G2(C0VX9.LIZIZ().LIZJ, "activity");
        if (activityManager == null) {
            return false;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud8zbHL10U6nQASp3/w=", null));
        if (listLJII != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                    return false;
                }
            }
        }
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            Iterator<ActivityManager.ProcessErrorStateInfo> it2 = processesInErrorState.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.ProcessErrorStateInfo next = it2.next();
                if (next != null && next.pid == iMyPid) {
                    if (next.condition == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String LIZ(Context context) {
        ActivityManager.ProcessErrorStateInfo next;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        if (SystemClock.uptimeMillis() - LIZ < Mp4ScreenVideoLoadTimeout.CONTROL) {
            System.out.println("get_anr_info_is_time_out");
        } else {
            try {
                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
                if (activityManager != null) {
                    int i = 0;
                    loop0: while (i < 150) {
                        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                        if (processesInErrorState != null) {
                            Iterator<ActivityManager.ProcessErrorStateInfo> it2 = processesInErrorState.iterator();
                            while (it2.hasNext()) {
                                next = it2.next();
                                if (next.condition == 2) {
                                    break loop0;
                                }
                            }
                        }
                        i++;
                        if (150 == i) {
                            break;
                        }
                        SystemClock.sleep(600L);
                    }
                    System.out.println("get_anr_info_times_out");
                    next = null;
                    if (next != null && Process.myPid() == next.pid) {
                        processErrorStateInfo = LIZIZ;
                        if (processErrorStateInfo == null && C802470Vdt.LJFF(processErrorStateInfo, next)) {
                            LIZ = SystemClock.uptimeMillis();
                            return null;
                        }
                        LIZIZ = next;
                        LIZ = SystemClock.uptimeMillis();
                        return C802470Vdt.LIZLLL(next);
                    }
                } else {
                    next = null;
                    if (next != null) {
                        processErrorStateInfo = LIZIZ;
                        if (processErrorStateInfo == null) {
                        }
                        LIZIZ = next;
                        LIZ = SystemClock.uptimeMillis();
                        return C802470Vdt.LIZLLL(next);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static void LIZJ(Throwable th) {
        C801940Vd2.LIZLLL("NPTH_ANR_ERROR", th);
    }
}
