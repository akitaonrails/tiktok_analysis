package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.1B8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2200151B8z {
    public String globalDefaultSavePath;
    public String globalDefaultSaveTempPath;
    public IDownloadProcessDispatcherService dispatcherService = (IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class);
    public IDownloadComponentManagerService componentService = (IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class);

    public void clearSqlDownloadCacheData() {
        this.componentService.clearSqlDownloadCacheData();
    }

    public void destoryDownloader() {
        this.componentService.unRegisterDownloadReceiver();
    }

    public List<DownloadInfo> getAllDownloadInfo() {
        return this.dispatcherService.getAllDownloadInfo();
    }

    public File getGlobalSaveDir() {
        return getGlobalSaveDir(this.globalDefaultSavePath);
    }

    public File getGlobalSaveTempDir() {
        return getGlobalSaveDir(this.globalDefaultSaveTempPath);
    }

    public InterfaceC1490850otn getReserveWifiStatusListener() {
        this.componentService.getReserveWifiStatusListener();
        return null;
    }

    public void initDownloadCacheImmediately() {
        this.componentService.initDownloadCacheImmediately();
    }

    public boolean isDownloadCacheSyncSuccess() {
        return this.dispatcherService.isDownloadCacheSyncSuccess();
    }

    public boolean isHttpServiceInit() {
        return this.dispatcherService.isHttpServiceInit();
    }

    public void pauseAll() {
        this.dispatcherService.pauseAll();
    }

    public void setDownloadInMultiProcess() {
        this.componentService.setDownloadInMultiProcess();
    }

    private File getGlobalSaveDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!C1294200jmc.LIZJ(c0vsj)) {
            return null;
        }
        return c0vsj;
    }

    public static DownloadTask with(Context context) {
        Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context);
        return new DownloadTask();
    }

    public boolean canResume(int i) {
        return this.dispatcherService.canResume(i);
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public void clearDownloadData(int i) {
        this.dispatcherService.clearDownloadData(i, true);
    }

    public void clearMemoryCacheData(double d) {
        this.componentService.clearMemoryCacheData(d);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        this.dispatcherService.forceDownloadIngoreRecommendSize(i);
    }

    public long getCurBytes(int i) {
        return this.dispatcherService.getCurBytes(i);
    }

    public InterfaceC19860712nF getDownloadFileUriProvider(int i) {
        return this.dispatcherService.getDownloadFileUriProvider(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        return this.dispatcherService.getDownloadInfo(i);
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        return this.dispatcherService.getDownloadInfoList(str);
    }

    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.dispatcherService.getDownloadInfosByFileExtension(str);
    }

    public C1B5Q getDownloadNotificationEventListener(int i) {
        return this.dispatcherService.getDownloadNotificationEventListener(i);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getDownloadingDownloadInfosWithMimeType(str);
    }

    public int getStatus(int i) {
        return this.dispatcherService.getStatus(i);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getSuccessedDownloadInfosWithMimeType(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.dispatcherService.getUnCompletedDownloadInfosWithMimeType(str);
    }

    public boolean isDownloadServiceForeground(int i) {
        return this.dispatcherService.isDownloadServiceForeground(i);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return this.dispatcherService.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    public boolean isDownloading(int i) {
        return this.dispatcherService.isDownloading(i);
    }

    public void pause(int i) {
        this.dispatcherService.pause(i);
    }

    public void registerDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        this.dispatcherService.registerDownloadCacheSyncListener(interfaceC2199961B8g);
    }

    public void registerDownloaderProcessConnectedListener(C1B76 c1b76) {
        this.dispatcherService.registerDownloaderProcessConnectedListener(c1b76);
    }

    public void removeTaskMainListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, C1B72.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, C1B72.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        this.dispatcherService.removeDownloadListener(i, null, C1B72.SUB, true);
    }

    public void restart(int i) {
        this.dispatcherService.restart(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllFailedDownloadTasks(list);
    }

    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        this.dispatcherService.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    public void resume(int i) {
        this.dispatcherService.resume(i);
    }

    public void setDefaultSavePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSavePath = str;
        }
    }

    public void setDefaultSaveTempPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.globalDefaultSaveTempPath = str;
        }
    }

    public void setDownloadDBListener(InterfaceC2200071B8r interfaceC2200071B8r) {
        this.componentService.setDownloadDBListener(interfaceC2200071B8r);
    }

    public void setDownloadMemoryInfoListener(InterfaceC2200081B8s interfaceC2200081B8s) {
        this.componentService.setDownloadMemoryInfoListener(interfaceC2200081B8s);
    }

    public void setDownloadNetworkHandler(IDownloadNetworkHandler iDownloadNetworkHandler) {
        this.componentService.setDownloadNetworkHandler(iDownloadNetworkHandler);
    }

    public void setDownloadThreadCheckListener(InterfaceC2200061B8q interfaceC2200061B8q) {
        this.componentService.setDownloadThreadCheckListener(interfaceC2200061B8q);
    }

    public void setLogLevel(int i) {
        this.dispatcherService.setLogLevel(i);
    }

    public void setReserveWifiStatusListener(InterfaceC1490850otn interfaceC1490850otn) {
        this.componentService.setReserveWifiStatusListener(interfaceC1490850otn);
    }

    public void unRegisterDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        this.dispatcherService.unRegisterDownloadCacheSyncListener(interfaceC2199961B8g);
    }

    public void unRegisterDownloaderProcessConnectedListener(C1B76 c1b76) {
        this.dispatcherService.unRegisterDownloaderProcessConnectedListener(c1b76);
    }

    public void updateDownloadInfo(DownloadInfo downloadInfo) {
        this.componentService.updateDownloadInfo(downloadInfo);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.MAIN, false);
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.NOTIFICATION, false);
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.SUB, false);
    }

    public void cancel(int i, boolean z) {
        this.dispatcherService.cancel(i, z);
    }

    public void clearDownloadData(int i, boolean z) {
        this.dispatcherService.clearDownloadData(i, z);
    }

    public int getDownloadId(String str, String str2) {
        return this.dispatcherService.getDownloadId(str, str2);
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return this.dispatcherService.getDownloadInfo(str, str2);
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, C1B72.MAIN, false);
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, C1B72.NOTIFICATION, false);
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.removeDownloadListener(i, iDownloadListener, C1B72.SUB, false);
    }

    public void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        this.dispatcherService.setDownloadNotificationEventListener(i, c1b5q);
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.MAIN, true);
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.NOTIFICATION, true);
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.SUB, true);
    }

    public void setThrottleNetSpeed(int i, long j) {
        setThrottleNetSpeed(i, j, 0);
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener == null) {
            return;
        }
        this.dispatcherService.addDownloadListener(i, iDownloadListener, C1B72.MAIN, true, z);
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        this.dispatcherService.setThrottleNetSpeed(i, j, i2);
    }
}
