package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.performance.CreationPerformanceService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0otF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490510otF {
    public static ExecutorService LIZ(int i, String str, ExecutorService executorService) {
        if (((Boolean) C258220AAa.LIZ.getValue()).booleanValue()) {
            if (i <= 0) {
                return executorService;
            }
            return CreationPerformanceService.createICreationPerformanceServicebyMonsterPlugin(false).createFixedExecutorService(executorService, i);
        }
        if (i <= 0) {
            return executorService;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadThreadPool-");
        sbLIZ.append(str);
        sbLIZ.append("-fixed");
        C822650WOx c822650WOx = new C822650WOx(i, i, 15L, timeUnit, linkedBlockingQueue, new C08UL(C2188811AlT.LIZIZ(sbLIZ)));
        try {
            c822650WOx.allowCoreThreadTimeOut(true);
            return c822650WOx;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c822650WOx;
        }
    }
}
