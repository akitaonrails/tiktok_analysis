package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1B82, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B82 {
    public static final String LIZ = C1B82.class.getSimpleName();
    public static final ConcurrentHashMap<Class, Object> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = null;
    public static volatile boolean LIZLLL = false;

    public static boolean LIZJ() {
        String str = LIZ;
        try {
            Class<?> cls = Class.forName("com.ss.android.socialbase.downloader.service.DownloadServiceLoader");
            cls.getMethod("load", new Class[0]).invoke(cls.newInstance(), new Object[0]);
            if (!C1490830otl.LIZ()) {
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Run load :");
            sbLIZ.append("com.ss.android.socialbase.downloader.service.DownloadServiceLoader");
            sbLIZ.append(" success");
            C1490830otl.LIZIZ(str, "runLoad", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ = th.toString();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Run load :");
            sbLIZ2.append("com.ss.android.socialbase.downloader.service.DownloadServiceLoader");
            sbLIZ2.append("fail, ");
            sbLIZ2.append(th.toString());
            C1490830otl.LIZJ(str, "runLoad", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public static <T> T LIZ(Class<T> cls) {
        if (!LIZLLL) {
            synchronized (C1B82.class) {
                try {
                    if (!LIZLLL) {
                        if (LIZJ()) {
                            LIZLLL = true;
                        } else {
                            LIZIZ(IDownloadMonitorHelperService.class, new IDownloadMonitorHelperService.DefaultDownloadMonitorHelperService());
                            LIZIZ(IDownloadIdGeneratorService.class, new IDownloadIdGeneratorService.DefaultDownloadIdGeneratorService());
                            LIZIZ(IDownloadComponentManagerService.class, new IDownloadComponentManagerService.DefaultDownloadComponentManagerService());
                            LIZIZ(IDownloadProcessDispatcherService.class, new IDownloadProcessDispatcherService.DefaultDownloadProcessDispatcherService());
                            LIZIZ(IDownloadNetTrafficManagerService.class, new IDownloadNetTrafficManagerService.DefaultDownloadNetTrafficManagerService());
                            LIZIZ(IDownloadNotificationManagerService.class, new IDownloadNotificationManagerService.DefaultDownloadNotificationManagerService());
                            LIZIZ(IDownloadPreconnecterService.class, new IDownloadPreconnecterService.DefaultDownloadPreconnecterService());
                            LIZIZ(IDownloadRetrySchedulerService.class, new IDownloadRetrySchedulerService.DefaultDownloadRetrySchedulerService());
                            LIZIZ(IDownloadMultiProcService.class, new IDownloadMultiProcService.DefaultDownloadMultiProcService());
                            C1490830otl.LIZJ(LIZ, "loadDefaultService", "Run");
                            LIZLLL = true;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (T) LIZIZ.get(cls);
    }

    public static <T> void LIZIZ(Class<T> cls, T t) {
        LIZIZ.put(cls, t);
    }
}
