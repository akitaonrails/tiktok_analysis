package X;

import Y.ARunnableS1S1000000_3;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.kill.RestartApplicationService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2469009lw {
    public static boolean LIZ;
    public static long LIZIZ;
    public static C11JF LIZJ;
    public static volatile C2469109lx LIZLLL;
    public static final List<InterfaceC2469309lz> LJ = new ArrayList();
    public static long LJFF = 0;
    public static long LJI = 0;

    public static boolean LIZIZ(Context context) {
        if (context == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxUdXNeNkN5BEPguyIxtfcazO1Qy7Xpjzgs", null))) {
            if (runningAppProcessInfo.importance == 100) {
                String[] strArr = runningAppProcessInfo.pkgList;
                for (String str : strArr) {
                    if (str.equals(context.getPackageName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZ(Application application, String str) throws Throwable {
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (int length = activityStack.length - 1; length > -1; length--) {
            activityStack[length].finish();
        }
        Intent intent = new Intent(application, (Class<?>) RestartApplicationService.class);
        intent.putExtra("s_FLAG_RESTART_MAIN_PROCESS", Process.myPid());
        intent.putExtra("s_FLAG_RESTART_MAIN_STRATEGY", str);
        if (application != null) {
            C2204961BRm.LJIJJLI(application, intent, new ServiceConnection() { // from class: X.09lv
                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                    Object[] objArr;
                    C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/aweme/memory/kill/LowMemoryAppKillSelf$2", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxUdXNeNkN5BEPguyIxtfcazO1Qy7Xpjzgs", null)));
                    if (c0wsuLIZIZ.LIZ || (objArr = c0wsuLIZIZ.LIZJ) == null) {
                        return;
                    }
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            }, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxUdXNeNkN5BEPguyIxtfcazO1Qy7Xpjzgs", null));
        }
    }

    public static void LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start killProcess ");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("MemorySelfKill", C2188811AlT.LIZIZ(sbLIZ));
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII) / 1000;
        String currentSessionId = AppLog.getCurrentSessionId();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("self_terminate", String.valueOf(i));
        c2344009Gk.LIZLLL(jElapsedRealtime, "launch_time");
        c2344009Gk.LIZLLL(LIZIZ, "session_duration");
        c2344009Gk.LJIIIIZZ("session_id", currentSessionId);
        C20684915wt.LJFF("prf_low_memory_self_terminate", c2344009Gk.LIZ);
        LIZIZ = 0L;
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S1000000_3(str, 2));
    }
}
