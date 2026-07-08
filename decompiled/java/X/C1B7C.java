package X;

import android.app.Notification;
import android.os.IInterface;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* JADX INFO: renamed from: X.1B7C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B7C extends IInterface {
    void A0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z, boolean z2);

    boolean LJIIIIZZ(int i);

    void LJIIIZ(int i);

    boolean LJIILLIIL(int i);

    void LJJIIZ(boolean z);

    boolean LJJIJIL();

    void LJJJJJ(int i, int i2);

    void LJJJJZ(int i, boolean z, boolean z2);

    void LJJLIIIJJI(int i, boolean z);

    int LJJLIIIJL(int i);

    void LJJLIIIJLJLI(int i, boolean z);

    void LJLI(int i, Notification notification);

    void LJLJJLL(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z);

    void LLLLLLLLL(InterfaceC2199541B6q interfaceC2199541B6q);

    void W(InterfaceC2199581B6u interfaceC2199581B6u);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearData();

    void f(int i, C1B5O c1b5o);

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    InterfaceC19860412nC getDownloadFileUriProvider(int i);

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    C1B5O getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    C1B6B getNotificationClickCallback(int i);

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

    void setLogLevel(int i);

    void setThrottleNetSpeed(int i, long j, int i2);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);

    void v0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z);
}
