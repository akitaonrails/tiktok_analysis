package X;

import android.app.Notification;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService;

/* JADX INFO: renamed from: X.1B7N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7N implements IDownloadNotificationManagerService {
    public static volatile C1B7N LIZIZ;
    public final IDownloadNotificationManagerService LIZ = (IDownloadNotificationManagerService) C1B82.LIZ(IDownloadNotificationManagerService.class);

    public static C1B7N LIZ() {
        if (LIZIZ == null) {
            synchronized (C1B7N.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1B7N();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void clearNotification() {
        this.LIZ.clearNotification();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final SparseArray<C1B7P> getAllNotificationItems() {
        return this.LIZ.getAllNotificationItems();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void addNotification(C1B7P c1b7p) {
        this.LIZ.addNotification(c1b7p);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void cancel(int i) {
        this.LIZ.cancel(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void cancelNotification(int i) {
        this.LIZ.cancelNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final C1B7P getNotificationItem(int i) {
        return this.LIZ.getNotificationItem(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void hideNotification(int i) {
        this.LIZ.hideNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final C1B7P removeNotification(int i) {
        return this.LIZ.removeNotification(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
    public final void notifyByService(int i, int i2, Notification notification) {
        this.LIZ.notifyByService(i, i2, notification);
    }
}
