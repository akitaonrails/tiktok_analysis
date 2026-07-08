package X;

import Y.ARunnableS102S0200000_33;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.ss.android.ugc.IResourceChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.ResCheckerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1BDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2201421BDw {
    public static volatile boolean LIZ;
    public static ScheduledExecutorService LIZIZ;

    public static boolean LIZ(Context context, ResCheckerTask.LibMemMonitorParams libMemMonitorParams) {
        boolean zLJFF;
        boolean zLJIILIIL;
        boolean zLJII;
        boolean zLIZIZ;
        boolean zLJI;
        try {
            zLJFF = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJFF(context, libMemMonitorParams.pss_track_libs, libMemMonitorParams.bytehook_enable, libMemMonitorParams.pss_mode, libMemMonitorParams.hook_libc, libMemMonitorParams.dump_size, libMemMonitorParams.dump_top_num, libMemMonitorParams.stack_mode, libMemMonitorParams.other_libs, libMemMonitorParams.pss_threshold, libMemMonitorParams.pss_malloc_sample_rate, libMemMonitorParams.pss_shard_spin_count, libMemMonitorParams.pss_lock_mode);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLJFF = false;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zLJIILIIL = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIILIIL(context, libMemMonitorParams.gpu_track_libs, libMemMonitorParams.bytehook_enable, libMemMonitorParams.gpu_mode, libMemMonitorParams.gpu_threshold, libMemMonitorParams.dump_size, libMemMonitorParams.dump_top_num, libMemMonitorParams.stack_mode);
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
            zLJIILIIL = false;
        }
        if (libMemMonitorParams.thread_enable) {
            try {
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                zLJII = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJII(context);
            } catch (Throwable th5) {
                th = th5;
                TryCatchGuardChecker.doCheck(th);
                zLJII = false;
            }
        } else {
            zLJII = false;
        }
        if (libMemMonitorParams.thread_stack_enable) {
            try {
                zLIZIZ = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LIZIZ(libMemMonitorParams.thread_stack_report_threshold, context);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                zLIZIZ = false;
            }
        } else {
            zLIZIZ = false;
        }
        h hVar = libMemMonitorParams.dynamic_configs;
        if (hVar != null && hVar.size() > 0) {
            try {
                zLJI = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJI(context, libMemMonitorParams.dynamic_configs);
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                zLJI = false;
            }
        } else {
            zLJI = false;
        }
        if (!zLJFF && !zLJIILIIL && !zLJI && !zLJII && !zLIZIZ) {
            return false;
        }
        return ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIIJ(context, libMemMonitorParams.port, libMemMonitorParams.report, libMemMonitorParams.dump_stack_on_interval);
    }

    public static synchronized void LIZIZ(Context context, ResCheckerTask.LibMemMonitorParams libMemMonitorParams) {
        if (Build.VERSION.SDK_INT >= 24 && C2162308dZ.LJI(context) && !LIZ && libMemMonitorParams.intervalInS > 0 && libMemMonitorParams.delayS >= 0) {
            int i = libMemMonitorParams.probability;
            if (i > 0 && (i >= 100 || ThreadLocalRandom.current().nextInt(100) < i)) {
                if (libMemMonitorParams.debug_log) {
                    ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIIL(context);
                }
                ScheduledExecutorService scheduledExecutorServiceLJ = C807400Vlq.LJ();
                LIZIZ = scheduledExecutorServiceLJ;
                scheduledExecutorServiceLJ.schedule(new ARunnableS102S0200000_33(libMemMonitorParams, context, 19), libMemMonitorParams.delayS, TimeUnit.SECONDS);
            }
        }
    }
}
