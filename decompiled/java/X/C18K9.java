package X;

import android.app.Activity;
import android.app.ActivityManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.List;

/* JADX INFO: renamed from: X.18K9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18K9 {
    public static final C18K9 LIZ = new C18K9();

    public static void LIZ(Object obj) {
        final Activity activity;
        C1584400rKg c1584400rKg = C1584400rKg.LIZ;
        final C18KI c18ki = new C18KI(obj);
        c1584400rKg.getClass();
        if ((obj instanceof Activity) && (activity = (Activity) obj) != null) {
            if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(activity)) {
                c18ki.invoke(Boolean.FALSE);
                return;
            }
            C18KJ.LIZ.getClass();
            if (C18KJ.LIZIZ.containsKey(activity)) {
                c18ki.invoke(Boolean.FALSE);
                return;
            } else {
                C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0VvS
                    public final void LIZ() {
                        ActivityManager activityManager;
                        List<ActivityManager.AppTask> appTasks;
                        ActivityManager.AppTask appTask;
                        ActivityManager.RecentTaskInfo taskInfo;
                        boolean z = false;
                        try {
                            Object objF2 = C786410Ut5.F2(activity, "activity");
                            if ((objF2 instanceof ActivityManager) && (activityManager = (ActivityManager) objF2) != null && (appTasks = activityManager.getAppTasks()) != null && appTasks.size() > 0 && (appTask = appTasks.get(0)) != null && (taskInfo = appTask.getTaskInfo()) != null) {
                                if (taskInfo.numActivities == 1) {
                                    z = true;
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c18ki.invoke(Boolean.valueOf(z));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MainPageUtils@ea06.isOnlyMainPageV2$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MainPageUtils@ea06.isOnlyMainPageV2$1");
                    }
                });
                return;
            }
        }
        c18ki.invoke(Boolean.FALSE);
    }
}
