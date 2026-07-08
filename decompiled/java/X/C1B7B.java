package X;

import android.app.Notification;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* JADX INFO: renamed from: X.1B7B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7B implements InterfaceC2199641B7a, C1B77 {
    public static final String LIZLLL = C1B7B.class.getSimpleName();
    public volatile C1B7C LIZ;
    public final C1B7F<IndependentProcessDownloadService> LIZIZ;
    public final C1B79 LIZJ = new C1B79(false);

    @Override // X.InterfaceC2199641B7a
    public final void LJIJI(DownloadInfo downloadInfo) {
    }

    @Override // X.InterfaceC2199641B7a
    public final void LIZ() {
        C1B7F<IndependentProcessDownloadService> c1b7f = this.LIZIZ;
        if (c1b7f != null) {
            c1b7f.LIZ();
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LIZLLL() {
        return this.LIZ != null;
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJJIJIL() {
        C1B7C c1b7c = this.LIZ;
        String str = LIZLLL;
        if (c1b7c == null) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str, "isServiceForeground", "AidlService is null");
            }
            return false;
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(str, "isServiceForeground", "AidlService.isServiceForeground");
        }
        try {
            return this.LIZ.LJJIJIL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void clearData() {
        if (this.LIZ == null) {
            this.LIZJ.clearData();
            return;
        }
        try {
            this.LIZ.clearData();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getAllDownloadInfo() {
        if (this.LIZ == null) {
            return this.LIZJ.getAllDownloadInfo();
        }
        try {
            return this.LIZ.getAllDownloadInfo();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloadCacheSyncSuccess() {
        if (this.LIZ == null) {
            return this.LIZJ.isDownloadCacheSyncSuccess();
        }
        try {
            return this.LIZ.isDownloadCacheSyncSuccess();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void pauseAll() {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.pauseAll();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1B7B() {
        C1B7F<IndependentProcessDownloadService> c1b7fLJIJ = C2199681B7e.LJIJ();
        this.LIZIZ = c1b7fLJIJ;
        ((C1B73) c1b7fLJIJ).LLJI = this;
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJIIIIZZ(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.LJIIIIZZ(i);
        }
        try {
            return this.LIZ.LJIIIIZZ(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJIIIZ(int i) {
        if (this.LIZ == null) {
            this.LIZJ.LJIIIZ(i);
            return;
        }
        try {
            this.LIZ.LJIIIZ(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJIILLIIL(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.LJIILLIIL(i);
        }
        try {
            return this.LIZ.LJIILLIIL(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJIIZ(boolean z) {
        C1B7C c1b7c = this.LIZ;
        String str = LIZLLL;
        if (c1b7c == null) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str, "stopForeground", "AidlService is null");
            }
        } else {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str, "stopForeground", "AidlService.stopForeground");
            }
            try {
                this.LIZ.LJJIIZ(true);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final int LJJLIIIJL(int i) {
        if (this.LIZ == null) {
            return C1B7M.LJ().LIZLLL(i);
        }
        try {
            return this.LIZ.LJJLIIIJL(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean canResume(int i) {
        if (this.LIZ == null) {
            return false;
        }
        try {
            return this.LIZ.canResume(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void forceDownloadIngoreRecommendSize(int i) {
        if (this.LIZ == null) {
            this.LIZJ.forceDownloadIngoreRecommendSize(i);
            return;
        }
        try {
            this.LIZ.forceDownloadIngoreRecommendSize(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final long getCurBytes(int i) {
        if (this.LIZ == null) {
            return 0L;
        }
        try {
            return this.LIZ.getCurBytes(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final InterfaceC19860712nF getDownloadFileUriProvider(int i) {
        if (this.LIZ != null) {
            try {
                InterfaceC19860412nC downloadFileUriProvider = this.LIZ.getDownloadFileUriProvider(i);
                if (downloadFileUriProvider == null) {
                    return null;
                }
                return new C19860612nE(downloadFileUriProvider);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC2199641B7a
    public final DownloadInfo getDownloadInfo(int i) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfo(i);
        }
        try {
            return this.LIZ.getDownloadInfo(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfoList(str);
        }
        try {
            return this.LIZ.getDownloadInfoList(str);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getDownloadInfosByFileExtension(str);
        }
        try {
            return this.LIZ.getDownloadInfosByFileExtension(str);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final C1B5Q getDownloadNotificationEventListener(int i) {
        if (this.LIZ != null) {
            try {
                C1B5O downloadNotificationEventListener = this.LIZ.getDownloadNotificationEventListener(i);
                if (downloadNotificationEventListener == null) {
                    return null;
                }
                return new C1B5P(downloadNotificationEventListener);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        if (this.LIZ != null) {
            try {
                return this.LIZ.getDownloadingDownloadInfosWithMimeType(str);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC2199641B7a
    public final C1B6D getNotificationClickCallback(int i) {
        if (this.LIZ != null) {
            try {
                C1B6B notificationClickCallback = this.LIZ.getNotificationClickCallback(i);
                if (notificationClickCallback == null) {
                    return null;
                }
                return new C1B6C(notificationClickCallback);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC2199641B7a
    public final int getStatus(int i) {
        if (this.LIZ == null) {
            return 0;
        }
        try {
            return this.LIZ.getStatus(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getSuccessedDownloadInfosWithMimeType(str);
        }
        try {
            return this.LIZ.getSuccessedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        if (this.LIZ == null) {
            return this.LIZJ.getUnCompletedDownloadInfosWithMimeType(str);
        }
        try {
            return this.LIZ.getUnCompletedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        if (this.LIZ == null) {
            return this.LIZJ.isDownloadSuccessAndFileNotExist(downloadInfo);
        }
        try {
            this.LIZ.isDownloadSuccessAndFileNotExist(downloadInfo);
            return false;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloading(int i) {
        if (this.LIZ == null) {
            return false;
        }
        try {
            return this.LIZ.isDownloading(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void restart(int i) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.restart(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void restartAllFailedDownloadTasks(List<String> list) {
        if (this.LIZ == null) {
            this.LIZJ.restartAllFailedDownloadTasks(list);
            return;
        }
        try {
            this.LIZ.restartAllFailedDownloadTasks(list);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        if (this.LIZ == null) {
            this.LIZJ.restartAllPauseReserveOnWifiDownloadTasks(list);
            return;
        }
        try {
            this.LIZ.restartAllPauseReserveOnWifiDownloadTasks(list);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void resume(int i) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.resume(i);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void setLogLevel(int i) {
        C1B7F<IndependentProcessDownloadService> c1b7f = this.LIZIZ;
        if (c1b7f != null) {
            c1b7f.setLogLevel(i);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void tryDownload(DownloadTask downloadTask) {
        C1B7F<IndependentProcessDownloadService> c1b7f;
        if (downloadTask != null && (c1b7f = this.LIZIZ) != null) {
            c1b7f.tryDownload(downloadTask);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (this.LIZ == null) {
            return this.LIZJ.updateDownloadInfo(downloadInfo);
        }
        try {
            return this.LIZ.updateDownloadInfo(downloadInfo);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJJJJ(int i, int i2) {
        if (this.LIZ != null) {
            try {
                this.LIZ.LJJJJJ(i, i2);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJLIIIJJI(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.LJJLIIIJJI(i, z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJLIIIJLJLI(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.LJJLIIIJLJLI(i, z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJLI(int i, Notification notification) {
        C1B7C c1b7c = this.LIZ;
        String str = LIZLLL;
        if (c1b7c == null) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str, "startForeground", "AidlService is null");
                return;
            }
            return;
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Id = ");
            sbLIZ.append(i);
            C1490830otl.LIZIZ(str, "startForeground", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.LIZ.LJLI(i, notification);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void cancel(int i, boolean z) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.cancel(i, z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        C1B5N c1b5n;
        if (this.LIZ != null) {
            try {
                C1B7C c1b7c = this.LIZ;
                if (c1b5q == null) {
                    c1b5n = null;
                } else {
                    c1b5n = new C1B5N(c1b5q);
                }
                c1b7c.f(i, c1b5n);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJJJZ(int i, boolean z, boolean z2) {
        if (this.LIZ == null) {
            this.LIZJ.LJJJJZ(i, z, true);
            return;
        }
        try {
            this.LIZ.LJJJJZ(i, z, true);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        if (this.LIZ == null) {
            return;
        }
        try {
            this.LIZ.setThrottleNetSpeed(i, j, i2);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LIZJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        boolean z2;
        BinderC2199601B6w binderC2199601B6w;
        if (this.LIZ == null) {
            return;
        }
        try {
            C1B7C c1b7c = this.LIZ;
            if (c1b72 == C1B72.SUB) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (iDownloadListener == null) {
                binderC2199601B6w = null;
            } else {
                binderC2199601B6w = new BinderC2199601B6w(iDownloadListener, z2);
            }
            c1b7c.LJLJJLL(i, i2, binderC2199601B6w, c1b72.ordinal(), z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        boolean z2;
        BinderC2199601B6w binderC2199601B6w;
        if (this.LIZ == null) {
            return;
        }
        try {
            C1B7C c1b7c = this.LIZ;
            if (c1b72 == C1B72.SUB) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (iDownloadListener == null) {
                binderC2199601B6w = null;
            } else {
                binderC2199601B6w = new BinderC2199601B6w(iDownloadListener, z2);
            }
            c1b7c.v0(i, i2, binderC2199601B6w, c1b72.ordinal(), z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        boolean z3;
        BinderC2199601B6w binderC2199601B6w;
        if (this.LIZ == null) {
            return;
        }
        try {
            C1B7C c1b7c = this.LIZ;
            if (c1b72 == C1B72.SUB) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (iDownloadListener == null) {
                binderC2199601B6w = null;
            } else {
                binderC2199601B6w = new BinderC2199601B6w(iDownloadListener, z3);
            }
            c1b7c.A0(i, i2, binderC2199601B6w, c1b72.ordinal(), z, z2);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
