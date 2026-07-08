package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService;

/* JADX INFO: renamed from: X.1B8A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B8A implements IDownloadRetrySchedulerService {
    public static volatile C1B8A LIZIZ;
    public final IDownloadRetrySchedulerService LIZ = (IDownloadRetrySchedulerService) C1B82.LIZ(IDownloadRetrySchedulerService.class);

    public static C1B8A LIZ() {
        if (LIZIZ == null) {
            synchronized (C1B8A.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1B8A();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void scheduleRetryWhenHasTaskConnected() {
        this.LIZ.scheduleRetryWhenHasTaskConnected();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void scheduleRetryWhenHasTaskSucceed() {
        this.LIZ.scheduleRetryWhenHasTaskSucceed();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void doSchedulerRetry(int i) {
        this.LIZ.doSchedulerRetry(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void setRetryScheduleHandler(InterfaceC2199991B8j interfaceC2199991B8j) {
        this.LIZ.setRetryScheduleHandler(null);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void tryCancelScheduleRetry(int i) {
        this.LIZ.tryCancelScheduleRetry(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
    public final void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        this.LIZ.tryStartScheduleRetry(downloadInfo);
    }
}
