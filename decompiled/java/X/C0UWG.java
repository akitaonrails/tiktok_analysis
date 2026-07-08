package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAbnormalExitPidGuardOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UWG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWG {
    public static boolean LIZ;
    public static ApplicationExitInfo LIZIZ;

    public static final void LIZIZ(Context context) {
        Long lLIZIZ;
        if (LiveHostAbnormalExitPidGuardOpt.enable() && context != null && ((lLIZIZ = InterfaceC772190UQv.Q3.LIZIZ()) == null || lLIZIZ.longValue() != 0)) {
            Integer numLIZIZ = InterfaceC772190UQv.S3.LIZIZ();
            int iMyPid = Process.myPid();
            if (numLIZIZ == null || numLIZIZ.intValue() != iMyPid) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportAbnormalLive(context);
            }
        }
        InterfaceC772190UQv.g3.LJFF(Long.valueOf(System.currentTimeMillis()));
    }

    public static final void LIZ(Context context, Map<String, String> map) {
        ApplicationExitInfo applicationExitInfo;
        Object next;
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        if (LIZ) {
            ApplicationExitInfo applicationExitInfo2 = LIZIZ;
            if (applicationExitInfo2 != null) {
                LIZJ(applicationExitInfo2, map);
                return;
            }
            return;
        }
        if (context == null) {
            map.put("app_exit_reason", "-1");
            map.put("app_exit_description", "context is null");
            return;
        }
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) C786410Ut5.H2(context, "activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 12);
            Object next2 = null;
            if (LiveHostAbnormalExitPidGuardOpt.enable()) {
                Integer numLIZIZ = InterfaceC772190UQv.S3.LIZIZ();
                ArrayList arrayList = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo3 : historicalProcessExitReasons) {
                    if (Intrinsics.LJFF(applicationExitInfo3.getProcessName(), context.getPackageName())) {
                        arrayList.add(applicationExitInfo3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        int pid = ((ApplicationExitInfo) next).getPid();
                        if (numLIZIZ != null && pid == numLIZIZ.intValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                applicationExitInfo = (ApplicationExitInfo) next;
                if (applicationExitInfo == null) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (it3.hasNext()) {
                            long timestamp = ((ApplicationExitInfo) next2).getTimestamp();
                            do {
                                Object next3 = it3.next();
                                long timestamp2 = ((ApplicationExitInfo) next3).getTimestamp();
                                if (timestamp < timestamp2) {
                                    next2 = next3;
                                    timestamp = timestamp2;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    applicationExitInfo = (ApplicationExitInfo) next2;
                }
                LIZ = true;
                LIZIZ = applicationExitInfo;
                LIZJ(applicationExitInfo, map);
            }
            Long lLIZIZ = InterfaceC772190UQv.g3.LIZIZ();
            if (lLIZIZ.longValue() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo4 : historicalProcessExitReasons) {
                    ApplicationExitInfo applicationExitInfo5 = applicationExitInfo4;
                    if (applicationExitInfo5.getTimestamp() >= lLIZIZ.longValue() && Intrinsics.LJFF(applicationExitInfo5.getProcessName(), context.getPackageName())) {
                        arrayList2.add(applicationExitInfo4);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        long timestamp3 = ((ApplicationExitInfo) next2).getTimestamp() - lLIZIZ.longValue();
                        do {
                            Object next4 = it4.next();
                            long timestamp4 = ((ApplicationExitInfo) next4).getTimestamp() - lLIZIZ.longValue();
                            if (timestamp3 > timestamp4) {
                                next2 = next4;
                                timestamp3 = timestamp4;
                            }
                        } while (it4.hasNext());
                    }
                }
                applicationExitInfo = (ApplicationExitInfo) next2;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo6 : historicalProcessExitReasons) {
                    if (Intrinsics.LJFF(applicationExitInfo6.getProcessName(), context.getPackageName())) {
                        arrayList3.add(applicationExitInfo6);
                    }
                }
                Iterator it5 = arrayList3.iterator();
                if (it5.hasNext()) {
                    next2 = it5.next();
                    if (it5.hasNext()) {
                        long timestamp5 = ((ApplicationExitInfo) next2).getTimestamp();
                        do {
                            Object next5 = it5.next();
                            long timestamp6 = ((ApplicationExitInfo) next5).getTimestamp();
                            if (timestamp5 < timestamp6) {
                                next2 = next5;
                                timestamp5 = timestamp6;
                            }
                        } while (it5.hasNext());
                    }
                }
                applicationExitInfo = (ApplicationExitInfo) next2;
            }
            if (applicationExitInfo == null) {
                return;
            }
            LIZ = true;
            LIZIZ = applicationExitInfo;
            LIZJ(applicationExitInfo, map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map.put("app_exit_reason", "-1");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            map.put("app_exit_description", localizedMessage);
            C20441214yg.LJI("GoLiveExitExceptionRecord", th);
        }
    }

    public static void LIZJ(ApplicationExitInfo applicationExitInfo, Map map) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        map.put("app_exit_reason", String.valueOf(applicationExitInfo.getReason()));
        String description = applicationExitInfo.getDescription();
        if (description == null) {
            description = "";
        }
        map.put("app_exit_description", description);
        map.put("app_exit_timestamp", String.valueOf(applicationExitInfo.getTimestamp()));
        map.put("app_exit_process_importance", String.valueOf(applicationExitInfo.getImportance()));
        map.put("app_exit_pss", String.valueOf(applicationExitInfo.getPss()));
        map.put("app_exit_rss", String.valueOf(applicationExitInfo.getRss()));
        map.put("app_exit_info", applicationExitInfo.toString());
    }
}
