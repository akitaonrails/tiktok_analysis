package X;

import android.app.ActivityManager;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.18Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250518Ed extends C18E7 {
    public static Boolean LJFF;
    public static int LJI;
    public static final C21250518Ed LJ = new C21250518Ed();
    public static int LJII = -1;

    public static void LJIIJ() {
        ActivityManager.AppTask appTask;
        ActivityManager.RecentTaskInfo taskInfo;
        try {
            Application applicationLIZIZ = C18IP.LIZ.LIZIZ();
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) (applicationLIZIZ != null ? C786410Ut5.G2(applicationLIZIZ, "activity") : null)).getAppTasks();
            LJII = (appTasks == null || (appTask = appTasks.get(0)) == null || (taskInfo = appTask.getTaskInfo()) == null) ? 0 : taskInfo.numActivities;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJII = 0;
        }
    }

    public C21250518Ed() {
        super(EnumC21250718Ef.BackProcess, 1031, 1030);
    }

    public static boolean LJIIJJI() {
        return LJI > 0;
    }
}
