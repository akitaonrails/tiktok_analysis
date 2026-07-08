package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS42S0101000_31;
import Y.ARunnableS45S0101000_34;
import Y.ARunnableS8S0111000_34;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1B79, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B79 implements InterfaceC2199641B7a {
    public final C1B7G LIZ = C2199681B7e.LJIILIIL();
    public final InterfaceC2199141B5c LIZIZ = C2199681B7e.LJIIJJI();
    public final C1B7F LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.InterfaceC2199641B7a
    public final void LIZ() {
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LIZLLL() {
        C1B7F c1b7f;
        return this.LIZLLL && (c1b7f = this.LIZJ) != null && ((C1B74) c1b7f).LLILLL;
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJJIJIL() {
        C1B74 c1b74 = (C1B74) this.LIZJ;
        if (C1490830otl.LIZ()) {
            c1b74.getClass();
            String str = C1B74.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IsServiceForeground = ");
            sbLIZ.append(c1b74.LLILZ);
            C1490830otl.LIZIZ(str, "isServiceForeground", C2188811AlT.LIZIZ(sbLIZ));
        }
        return c1b74.LLILZ;
    }

    @Override // X.InterfaceC2199641B7a
    public final void clearData() {
        this.LIZIZ.clearData();
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getAllDownloadInfo() {
        InterfaceC2199141B5c interfaceC2199141B5c = this.LIZIZ;
        if (interfaceC2199141B5c != null) {
            return interfaceC2199141B5c.getAllDownloadInfo();
        }
        return null;
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LIZIZ.isDownloadCacheSyncSuccess();
    }

    @Override // X.InterfaceC2199641B7a
    public final void pauseAll() {
        LJFF(new ARunnableS131S0100000_31(this, 146));
    }

    public C1B79(boolean z) {
        if (!z) {
            this.LIZJ = C2199681B7e.LJIIZILJ();
        } else {
            this.LIZJ = C2199681B7e.LJIJ();
        }
        C2199751B7l c2199751B7l = C2199751B7l.LJFF;
        this.LIZLLL = c2199751B7l.LJI("service_alive", false);
        this.LJ = c2199751B7l.LJIIIIZZ("single_async_handle_operation", 0) > 0;
    }

    public final void LJFF(Runnable runnable) {
        if (this.LJ) {
            C2199681B7e.LJJIJIIJIL(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJIIIIZZ(int i) {
        return this.LIZIZ.LJIIIIZZ(i);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJIIIZ(int i) {
        this.LIZIZ.LJIIIZ(i);
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean LJIILLIIL(int i) {
        return this.LIZIZ.LJIILLIIL(i);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJIJI(DownloadInfo downloadInfo) {
        this.LIZIZ.LJIJI(downloadInfo);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJIIZ(boolean z) {
        C1B74 c1b74 = (C1B74) this.LIZJ;
        WeakReference<Service> weakReference = c1b74.LL;
        if (weakReference != null && weakReference.get() != null) {
            if (C1490830otl.LIZ()) {
                String str = C1B74.LLIZLLLIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Service = ");
                sbLIZ.append(c1b74.LL.get());
                sbLIZ.append(",  isServiceAlive = ");
                sbLIZ.append(c1b74.LLILLL);
                C1490830otl.LIZIZ(str, "stopForeground", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                c1b74.LLILZ = false;
                c1b74.LL.get().stopForeground(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final int LJJLIIIJL(int i) {
        return C1B7M.LJ().LIZJ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // X.InterfaceC2199641B7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canResume(int r4) {
        /*
            r3 = this;
            X.1B7G r2 = r3.LIZ
            r1 = 0
            if (r2 == 0) goto L1e
            monitor-enter(r2)
            if (r4 == 0) goto L1d
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.LIZJ     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1a:
            if (r0 == 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            monitor-exit(r2)
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B79.canResume(int):boolean");
    }

    @Override // X.InterfaceC2199641B7a
    public final void forceDownloadIngoreRecommendSize(int i) {
        LJFF(new ARunnableS45S0101000_34(this, i, 5));
    }

    @Override // X.InterfaceC2199641B7a
    public final long getCurBytes(int i) {
        DownloadInfo downloadInfo;
        InterfaceC2199141B5c interfaceC2199141B5c = this.LIZIZ;
        if (interfaceC2199141B5c == null || (downloadInfo = interfaceC2199141B5c.getDownloadInfo(i)) == null) {
            return 0L;
        }
        return downloadInfo.getCurBytes();
    }

    @Override // X.InterfaceC2199641B7a
    public final InterfaceC19860712nF getDownloadFileUriProvider(int i) {
        C1B7G c1b7g = this.LIZ;
        synchronized (c1b7g) {
            DownloadTask downloadTask = c1b7g.LIZ.get(i);
            if (downloadTask != null) {
                return downloadTask.getFileUriProvider();
            }
            DownloadTask downloadTask2 = c1b7g.LIZIZ.get(i);
            if (downloadTask2 != null) {
                return downloadTask2.getFileUriProvider();
            }
            DownloadTask downloadTask3 = c1b7g.LIZJ.get(i);
            if (downloadTask3 != null) {
                return downloadTask3.getFileUriProvider();
            }
            DownloadTask downloadTask4 = c1b7g.LIZLLL.get(i);
            if (downloadTask4 != null) {
                return downloadTask4.getFileUriProvider();
            }
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final DownloadInfo getDownloadInfo(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        ArrayList arrayList;
        C1B7G c1b7g = this.LIZ;
        if (!c1b7g.LJIIIIZZ) {
            return c1b7g.LJIIJJI(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = c1b7g.LJII.getDownloadInfoList(str);
        if (downloadInfoList != null && !downloadInfoList.isEmpty()) {
            return downloadInfoList;
        }
        synchronized (c1b7g) {
            try {
                arrayList = new ArrayList();
                int size = c1b7g.LIZ.size();
                for (int i = 0; i < size; i++) {
                    DownloadTask downloadTaskValueAt = c1b7g.LIZ.valueAt(i);
                    if (downloadTaskValueAt != null && downloadTaskValueAt.getDownloadInfo() != null && str.equals(downloadTaskValueAt.getDownloadInfo().getUrl())) {
                        arrayList.add(downloadTaskValueAt.getDownloadInfo());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return this.LIZIZ.getDownloadInfosByFileExtension(str);
    }

    @Override // X.InterfaceC2199641B7a
    public final C1B5Q getDownloadNotificationEventListener(int i) {
        C1B7G c1b7g = this.LIZ;
        synchronized (c1b7g) {
            DownloadTask downloadTask = c1b7g.LIZ.get(i);
            if (downloadTask != null) {
                return downloadTask.getNotificationEventListener();
            }
            DownloadTask downloadTask2 = c1b7g.LIZIZ.get(i);
            if (downloadTask2 != null) {
                return downloadTask2.getNotificationEventListener();
            }
            DownloadTask downloadTask3 = c1b7g.LIZJ.get(i);
            if (downloadTask3 != null) {
                return downloadTask3.getNotificationEventListener();
            }
            DownloadTask downloadTask4 = c1b7g.LIZLLL.get(i);
            if (downloadTask4 != null) {
                return downloadTask4.getNotificationEventListener();
            }
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        C1B7G c1b7g = this.LIZ;
        c1b7g.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1B7H c1b7h = C1B7J.LJIIJJI;
        c1b7h.LIZIZ();
        Iterator it2 = new ArrayList(((ConcurrentHashMap) c1b7h.LIZ).keySet()).iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            DownloadInfo downloadInfoLJIIIZ = c1b7g.LJIIIZ(((Integer) it2.next()).intValue());
            if (downloadInfoLJIIIZ != null && str.equals(downloadInfoLJIIIZ.getMimeType())) {
                arrayList.add(downloadInfoLJIIIZ);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC2199641B7a
    public final C1B6D getNotificationClickCallback(int i) {
        C1B6D notificationClickCallback;
        C1B7G c1b7g = this.LIZ;
        synchronized (c1b7g) {
            DownloadTask downloadTask = c1b7g.LIZ.get(i);
            if (downloadTask != null) {
                notificationClickCallback = downloadTask.getNotificationClickCallback();
            } else {
                DownloadTask downloadTask2 = c1b7g.LIZIZ.get(i);
                if (downloadTask2 != null) {
                    notificationClickCallback = downloadTask2.getNotificationClickCallback();
                } else {
                    DownloadTask downloadTask3 = c1b7g.LIZJ.get(i);
                    if (downloadTask3 != null) {
                        notificationClickCallback = downloadTask3.getNotificationClickCallback();
                    } else {
                        DownloadTask downloadTask4 = c1b7g.LIZLLL.get(i);
                        if (downloadTask4 != null) {
                            notificationClickCallback = downloadTask4.getNotificationClickCallback();
                        } else {
                            Context context = C2199681B7e.LIZ;
                            return null;
                        }
                    }
                }
            }
            if (notificationClickCallback != null) {
                return notificationClickCallback;
            }
            Context context2 = C2199681B7e.LIZ;
            return null;
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final int getStatus(int i) {
        DownloadInfo downloadInfoLJIIIZ = this.LIZ.LJIIIZ(i);
        if (downloadInfoLJIIIZ == null) {
            return 0;
        }
        return downloadInfoLJIIIZ.getStatus();
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.LIZIZ.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC2199641B7a
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.LIZIZ.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        int status = downloadInfo.getStatus();
        String savePath = downloadInfo.getSavePath();
        String name = downloadInfo.getName();
        if (status != -3 || C2199671B7d.LJIJI(savePath, name)) {
            return false;
        }
        LJFF(new ARunnableS8S0111000_34(this, downloadInfo.getId(), 2));
        return true;
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean isDownloading(int i) {
        return this.LIZ.LJIILJJIL(i);
    }

    @Override // X.InterfaceC2199641B7a
    public final void restart(int i) {
        LJFF(new ARunnableS42S0101000_31(i, this, 10));
    }

    @Override // X.InterfaceC2199641B7a
    public final void restartAllFailedDownloadTasks(List<String> list) {
        LJFF(new ARunnableS103S0200000_34(list, this, 30));
    }

    @Override // X.InterfaceC2199641B7a
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        LJFF(new ARunnableS103S0200000_34(list, this, 31));
    }

    @Override // X.InterfaceC2199641B7a
    public final void resume(int i) {
        LJFF(new ARunnableS45S0101000_34(this, i, 6));
    }

    @Override // X.InterfaceC2199641B7a
    public final void setLogLevel(int i) {
        C1490830otl.LIZ = i;
    }

    @Override // X.InterfaceC2199641B7a
    public final void tryDownload(DownloadTask downloadTask) {
        LJFF(new ARunnableS103S0200000_34(downloadTask, this, 29));
    }

    @Override // X.InterfaceC2199641B7a
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        return this.LIZIZ.updateDownloadInfo(downloadInfo);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJJJJ(int i, int i2) {
        if (C2199681B7e.LJJIFFI != null) {
            for (InterfaceC2199571B6t interfaceC2199571B6t : (CopyOnWriteArrayList) C2199681B7e.LJJIFFI) {
                if (interfaceC2199571B6t != null) {
                    interfaceC2199571B6t.LJJLIIIJJIZ(i2, i);
                }
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJLIIIJJI(int i, boolean z) {
        ARunnableS42S0101000_31 aRunnableS42S0101000_31 = new ARunnableS42S0101000_31(i, this, 9);
        if (z) {
            aRunnableS42S0101000_31.run();
        } else {
            LJFF(aRunnableS42S0101000_31);
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJLIIIJLJLI(int i, boolean z) {
        C1B7M.LJ().LJIIIIZZ(i, z);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJLI(int i, Notification notification) {
        C1B74 c1b74 = (C1B74) this.LIZJ;
        WeakReference<Service> weakReference = c1b74.LL;
        String str = C1B74.LLIZLLLIL;
        if (weakReference != null && weakReference.get() != null) {
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Id = ");
                sbLIZ.append(i);
                sbLIZ.append(", service = ");
                sbLIZ.append(c1b74.LL.get());
                sbLIZ.append(",  isServiceAlive = ");
                sbLIZ.append(c1b74.LLILLL);
                C1490830otl.LIZIZ(str, "startForeground", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                C786410Ut5.o3(c1b74.LL.get(), i, notification);
                c1b74.LLILZ = true;
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(str, "startForeground", "DownloadService is null");
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void cancel(int i, boolean z) {
        LJFF(new ARunnableS8S0111000_34(this, i, z, 1));
    }

    @Override // X.InterfaceC2199641B7a
    public final void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        C1B7G c1b7g = this.LIZ;
        synchronized (c1b7g) {
            DownloadTask downloadTask = c1b7g.LIZ.get(i);
            if (downloadTask != null) {
                downloadTask.setNotificationEventListener(c1b5q);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJJJJZ(final int i, final boolean z, final boolean z2) {
        LJFF(new Runnable() { // from class: X.14g5
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProcessDownloadHandler@bc34.clearDownloadData$1");
                try {
                    this.LLILZ.LIZ.LIZLLL(i, z, z2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProcessDownloadHandler@bc34.clearDownloadData$1");
            }
        });
    }

    @Override // X.InterfaceC2199641B7a
    public final void setThrottleNetSpeed(final int i, final long j, final int i2) {
        LJFF(new Runnable() { // from class: X.1B7I
            public final void LIZ() {
                C1B7G c1b7g = this.LLILZ.LIZ;
                int i3 = i;
                long j2 = j;
                int i4 = i2;
                DownloadInfo downloadInfo = c1b7g.LJII.getDownloadInfo(i3);
                if (downloadInfo != null) {
                    downloadInfo.setThrottleNetSpeed(j2, i4);
                }
                C1B7H c1b7h = C1B7J.LJIIJJI;
                if (c1b7h != null) {
                    RunnableC2199651B7b runnableC2199651B7b = (RunnableC2199651B7b) ((ConcurrentHashMap) c1b7h.LIZ).get(Integer.valueOf(i3));
                    if (runnableC2199651B7b != null) {
                        if (C2199751B7l.LJFF(runnableC2199651B7b.LLJILJIL.getId(), null).LJIIIIZZ("use_default_throttle_speed", 1) != 1) {
                            C1B8V c1b8v = runnableC2199651B7b.LLJJ;
                            if (c1b8v == null || !(c1b8v instanceof C1B8F)) {
                                return;
                            }
                            try {
                                ((C1B8F) c1b8v).LJI(j2);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                return;
                            }
                        }
                        C2199741B7k c2199741B7k = runnableC2199651B7b.LLILZIL;
                        if (c2199741B7k != null) {
                            DownloadInfo downloadInfo2 = c2199741B7k.LIZ;
                            if (downloadInfo2 != null) {
                                downloadInfo2.setThrottleNetSpeed(j2, i4);
                            }
                            c2199741B7k.LJJIIZ = true;
                            c2199741B7k.LJJIIJZLJL = true;
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProcessDownloadHandler@bc34.setThrottleNetSpeed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProcessDownloadHandler@bc34.setThrottleNetSpeed$1");
            }
        });
    }

    @Override // X.InterfaceC2199641B7a
    public final void LIZJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        this.LIZ.LIZ(i, i2, iDownloadListener, c1b72, z, true);
    }

    @Override // X.InterfaceC2199641B7a
    public final void LJ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        C1B7G c1b7g = this.LIZ;
        synchronized (c1b7g) {
            DownloadTask downloadTaskLJIIL = c1b7g.LJIIL(i);
            if (downloadTaskLJIIL != null || (downloadTaskLJIIL = c1b7g.LJFF.get(Integer.valueOf(i))) != null) {
                downloadTaskLJIIL.removeDownloadListener(i2, iDownloadListener, c1b72, z);
            }
        }
    }

    @Override // X.InterfaceC2199641B7a
    public final void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        this.LIZ.LIZ(i, i2, iDownloadListener, c1b72, z, z2);
    }
}
