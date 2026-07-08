package X;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* JADX INFO: renamed from: X.1B7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2199641B7a {
    void LIZ();

    void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2);

    void LIZJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z);

    boolean LIZLLL();

    void LJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z);

    boolean LJIIIIZZ(int i);

    void LJIIIZ(int i);

    boolean LJIILLIIL(int i);

    void LJIJI(DownloadInfo downloadInfo);

    void LJJIIZ(boolean z);

    boolean LJJIJIL();

    void LJJJJJ(int i, int i2);

    void LJJJJZ(int i, boolean z, boolean z2);

    void LJJLIIIJJI(int i, boolean z);

    int LJJLIIIJL(int i);

    void LJJLIIIJLJLI(int i, boolean z);

    void LJLI(int i, Notification notification);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearData();

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    InterfaceC19860712nF getDownloadFileUriProvider(int i);

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    C1B5Q getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    C1B6D getNotificationClickCallback(int i);

    int getStatus(int i);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo);

    boolean isDownloading(int i);

    void pauseAll();

    void restart(int i);

    void restartAllFailedDownloadTasks(List<String> list);

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list);

    void resume(int i);

    void setDownloadNotificationEventListener(int i, C1B5Q c1b5q);

    void setLogLevel(int i);

    void setThrottleNetSpeed(int i, long j, int i2);

    void tryDownload(DownloadTask downloadTask);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
