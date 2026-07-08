package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lifecycle.task.KeepWarmJobService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.09jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2455709jn {
    public static void LIZJ(Context context) {
        int iLJIJ;
        try {
            if (Build.VERSION.SDK_INT < 24 || (iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_job_interval_min", true)) <= 0) {
                return;
            }
            long jMax = Math.max(((long) iLJIJ) * 60000, JobInfo.getMinPeriodMillis());
            JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context, "jobscheduler");
            if (jobScheduler == null) {
                return;
            }
            jobScheduler.getPendingJob(918202604);
            int iLIZJ = C2455309jj.LIZJ();
            if (LIZLLL(iLIZJ)) {
                LIZ(context, jobScheduler, iLIZJ);
            } else {
                LIZIZ(context, jobScheduler, jMax);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZLLL(int i) {
        if (i < 0) {
            return false;
        }
        int iLIZ = C2455909jp.LIZ();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4580_lifecycle_job_delay_by_daily_open_count", true) == 1) {
            if (iLIZ < 1 || Keva.getRepo("perf_job_keep_warm").getLong("terminate_utc_day", 0L) == System.currentTimeMillis() / C2455909jp.LIZ) {
                return false;
            }
            return true;
        }
        if (iLIZ < 1) {
            return false;
        }
        return true;
    }

    public static void LJ(Context context) {
        try {
            JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context, "jobscheduler");
            if (jobScheduler != null) {
                jobScheduler.cancel(918202604);
                Keva.getRepo("perf_job_keep_warm").storeInt("schedule_mode", 0);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(Context context, JobScheduler jobScheduler, int i) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C2455909jp.LIZ;
        long jMax = Math.max(((((jCurrentTimeMillis / j) + 1) * j) + TimeUnit.HOURS.toMillis(Math.max(0, Math.min(23, i)))) - System.currentTimeMillis(), 0L);
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(918202604, new ComponentName(context, (Class<?>) KeepWarmJobService.class)).setMinimumLatency(jMax).setOverrideDeadline(TimeUnit.MINUTES.toMillis(5L) + jMax).setRequiredNetworkType(1);
        if (Build.VERSION.SDK_INT >= 28) {
            requiredNetworkType.setPrefetch(true);
        }
        int iSchedule = jobScheduler.schedule(requiredNetworkType.build());
        Keva.getRepo("perf_job_keep_warm").storeInt("schedule_mode", 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedule next-day wakeup, utcHour=");
        sbLIZ.append(i);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(jMax);
        sbLIZ.append(", result=");
        if (iSchedule == 1) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(Context context, JobScheduler jobScheduler, long j) {
        String str;
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(918202604, new ComponentName(context, (Class<?>) KeepWarmJobService.class)).setPeriodic(j).setRequiredNetworkType(1);
        if (Build.VERSION.SDK_INT >= 28) {
            requiredNetworkType.setPrefetch(true);
        }
        int iSchedule = jobScheduler.schedule(requiredNetworkType.build());
        Keva.getRepo("perf_job_keep_warm").storeInt("schedule_mode", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedule periodic, intervalMs=");
        sbLIZ.append(j);
        sbLIZ.append(", result=");
        if (iSchedule == 1) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
