package X;

import Y.ARunnableS42S0400000_34;
import Y.ARunnableS6S0401000_34;
import Y.ARunnableS9S0001000_31;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.thread.WeakDownloadHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: X.1B7G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B7G implements C0T95 {
    public final boolean LJIIIIZZ;
    public final SparseArray<DownloadTask> LIZ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZIZ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZJ = new SparseArray<>();
    public final SparseArray<DownloadTask> LIZLLL = new SparseArray<>();
    public final SparseArray<SparseArray<DownloadTask>> LJ = new SparseArray<>();
    public final C1498850p6h<Integer, DownloadTask> LJFF = new C1498850p6h<>();
    public final LinkedBlockingDeque<DownloadTask> LJI = new LinkedBlockingDeque<>();
    public final WeakDownloadHandler LJIIIZ = new WeakDownloadHandler(Looper.getMainLooper(), this);
    public final InterfaceC2199141B5c LJII = C2199681B7e.LJIIJJI();

    public abstract RunnableC2199651B7b LJI(int i);

    public abstract void LJII(int i);

    public abstract boolean LJIILJJIL(int i);

    public C1B7G() {
        this.LJIIIIZZ = C2199751B7l.LJFF.LJIIIIZZ("fix_anr_isolate_engine_and_cache", 0) > 0;
    }

    public static void LIZJ(DownloadInfo downloadInfo) {
        try {
            if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != C1B7Y.DELAY_RETRY_NONE) {
                downloadInfo.setStatus(5);
                downloadInfo.setRetryDelayStatus(C1B7Y.DELAY_RETRY_NONE);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIIIZZ(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        try {
            if (this.LJI.isEmpty()) {
                LJIJJLI(downloadTask);
                this.LJI.put(downloadTask);
                return;
            }
            if (downloadInfo.getEnqueueType() == EnumC19365210pW.ENQUEUE_TAIL) {
                if (this.LJI.getFirst().getDownloadId() == downloadTask.getDownloadId() && LJIILJJIL(downloadTask.getDownloadId())) {
                    return;
                }
                Iterator<DownloadTask> it2 = this.LJI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DownloadTask next = it2.next();
                    if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                        it2.remove();
                        break;
                    }
                }
                this.LJI.put(downloadTask);
                if (!C2199751B7l.LJFF.LJI("fix_enqueue_tail_duplicated_prepare", true)) {
                    C1B7V c1b7v = new C1B7V(downloadTask, this.LJIIIZ);
                    if (!c1b7v.LIZJ.canSkipStatusHandler()) {
                        c1b7v.LIZJ.setStatus(1);
                        return;
                    }
                    return;
                }
                return;
            }
            DownloadTask first = this.LJI.getFirst();
            if (first.getDownloadId() == downloadTask.getDownloadId() && LJIILJJIL(downloadTask.getDownloadId())) {
                return;
            }
            LJIILL(first.getDownloadId());
            LJIJJLI(downloadTask);
            if (first.getDownloadId() != downloadTask.getDownloadId()) {
                this.LJI.putFirst(downloadTask);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final DownloadInfo LJIIIZ(int i) {
        if (!this.LJIIIIZZ) {
            return LJIIJ(i);
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo == null) {
            synchronized (this) {
                try {
                    DownloadTask downloadTask = this.LIZ.get(i);
                    if (downloadTask != null) {
                        downloadInfo = downloadTask.getDownloadInfo();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return downloadInfo;
        }
        return downloadInfo;
    }

    public final synchronized DownloadInfo LJIIJ(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask;
        downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo == null && (downloadTask = this.LIZ.get(i)) != null) {
            downloadInfo = downloadTask.getDownloadInfo();
        }
        return downloadInfo;
    }

    public final synchronized List<DownloadInfo> LJIIJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = this.LJII.getDownloadInfoList(str);
        if (downloadInfoList != null && !downloadInfoList.isEmpty()) {
            return downloadInfoList;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            DownloadTask downloadTaskValueAt = this.LIZ.valueAt(i);
            if (downloadTaskValueAt != null && downloadTaskValueAt.getDownloadInfo() != null && str.equals(downloadTaskValueAt.getDownloadInfo().getUrl())) {
                arrayList.add(downloadTaskValueAt.getDownloadInfo());
            }
        }
        return arrayList;
    }

    public final DownloadTask LJIIL(int i) {
        DownloadTask downloadTask;
        if (!this.LJIIIIZZ) {
            DownloadTask downloadTask2 = this.LIZ.get(i);
            if (downloadTask2 == null) {
                DownloadTask downloadTask3 = this.LIZJ.get(i);
                if (downloadTask3 == null) {
                    DownloadTask downloadTask4 = this.LIZIZ.get(i);
                    if (downloadTask4 == null) {
                        return this.LIZLLL.get(i);
                    }
                    return downloadTask4;
                }
                return downloadTask3;
            }
            return downloadTask2;
        }
        synchronized (this) {
            try {
                downloadTask = this.LIZ.get(i);
                if (downloadTask == null && (downloadTask = this.LIZJ.get(i)) == null && (downloadTask = this.LIZIZ.get(i)) == null) {
                    downloadTask = this.LIZLLL.get(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return downloadTask;
    }

    public final void LJIILL(int i) {
        if (!this.LJIIIIZZ) {
            LJIILLIIL(i);
            return;
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "pause", C2188811AlT.LIZIZ(sbLIZ));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return;
        }
        LJII(i);
        synchronized (this) {
            try {
                if (downloadInfo == null) {
                    DownloadTask downloadTask = this.LIZ.get(i);
                    if (downloadTask != null) {
                        new C1B7V(downloadTask, this.LJIIIZ).LJIIIIZZ();
                    }
                } else {
                    LIZJ(downloadInfo);
                    if (downloadInfo.getStatus() == 1) {
                        DownloadTask downloadTask2 = this.LIZ.get(i);
                        if (downloadTask2 != null) {
                            new C1B7V(downloadTask2, this.LJIIIZ).LJIIIIZZ();
                        }
                    } else if (C207234167k.LIZ(downloadInfo.getStatus())) {
                        downloadInfo.setStatus(-2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized boolean LJIILLIIL(int i) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "pause", C2188811AlT.LIZIZ(sbLIZ));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return false;
        }
        synchronized (this.LIZ) {
            try {
                LJII(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (downloadInfo == null) {
            DownloadTask downloadTask = this.LIZ.get(i);
            if (downloadTask != null) {
                new C1B7V(downloadTask, this.LJIIIZ).LJIIIIZZ();
                return true;
            }
        } else {
            LIZJ(downloadInfo);
            if (downloadInfo.getStatus() == 1) {
                DownloadTask downloadTask2 = this.LIZ.get(i);
                if (downloadTask2 != null) {
                    new C1B7V(downloadTask2, this.LJIIIZ).LJIIIIZZ();
                    return true;
                }
            } else if (C207234167k.LIZ(downloadInfo.getStatus())) {
                downloadInfo.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    public final synchronized void LJIJI(int i) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "restart", C2188811AlT.LIZIZ(sbLIZ));
        }
        DownloadTask downloadTask = this.LIZJ.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            LJIL(downloadTask);
        }
    }

    public final synchronized void LJIJJ(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.LIZLLL.get(i);
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.canReStartAsyncTask()) {
                LJIL(downloadTask);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ab A[Catch: Exception -> 0x02f5, OutOfMemoryError -> 0x032a, TryCatch #2 {Exception -> 0x02f5, OutOfMemoryError -> 0x032a, blocks: (B:117:0x02ab, B:119:0x02b1, B:121:0x02c6, B:122:0x02ce, B:124:0x02d4, B:126:0x02d8, B:127:0x02dc, B:129:0x02e8, B:131:0x02f1, B:93:0x024f, B:95:0x0255, B:97:0x0266, B:99:0x0270, B:100:0x027d, B:104:0x0286, B:106:0x028a, B:107:0x028d, B:113:0x029f, B:115:0x02a5, B:108:0x0292, B:110:0x0296, B:111:0x0299), top: B:154:0x024f }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1 A[Catch: Exception -> 0x02f5, OutOfMemoryError -> 0x032a, TryCatch #2 {Exception -> 0x02f5, OutOfMemoryError -> 0x032a, blocks: (B:117:0x02ab, B:119:0x02b1, B:121:0x02c6, B:122:0x02ce, B:124:0x02d4, B:126:0x02d8, B:127:0x02dc, B:129:0x02e8, B:131:0x02f1, B:93:0x024f, B:95:0x0255, B:97:0x0266, B:99:0x0270, B:100:0x027d, B:104:0x0286, B:106:0x028a, B:107:0x028d, B:113:0x029f, B:115:0x02a5, B:108:0x0292, B:110:0x0296, B:111:0x0299), top: B:154:0x024f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(com.ss.android.socialbase.downloader.model.DownloadTask r12) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B7G.LJIJJLI(com.ss.android.socialbase.downloader.model.DownloadTask):void");
    }

    public final synchronized void LJIL(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return;
        }
        downloadInfo.setDownloadFromReserveWifi(false);
        if (downloadInfo.getEnqueueType() != EnumC19365210pW.ENQUEUE_NONE) {
            LJIIIIZZ(downloadTask);
        } else {
            LJIJJLI(downloadTask);
        }
    }

    public final void LJJ(int i) {
        DownloadTask first;
        if (this.LJI.isEmpty()) {
            return;
        }
        DownloadTask first2 = this.LJI.getFirst();
        if (first2 != null && first2.getDownloadId() == i) {
            this.LJI.poll();
        }
        if (!this.LJI.isEmpty() && (first = this.LJI.getFirst()) != null) {
            LJIJJLI(first);
        }
    }

    @Override // X.C0T95
    public final void handleMsg(Message message) {
        DownloadTask downloadTask;
        boolean z;
        int i = message.arg1;
        int i2 = message.arg2;
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Listener hashCode: ");
            sbLIZ.append(i2);
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "handleMsg", C2188811AlT.LIZIZ(sbLIZ));
        }
        BaseException baseException = null;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            baseException = (BaseException) HandlerHook.getMessageObj(message.obj);
        }
        synchronized (this) {
            try {
                if (i2 == 0) {
                    downloadTask = this.LIZ.get(i);
                } else {
                    SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
                    if (sparseArray != null) {
                        downloadTask = sparseArray.get(i2);
                    }
                }
                if (downloadTask != null) {
                    int i3 = message.what;
                    DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                    if (downloadInfo == null) {
                        C1490830otl.LIZJ("AbsDownloadEngine", "notifyDownloadTaskStatus", "DownloadInfo is null\"");
                    } else {
                        C1B72 c1b72 = C1B72.MAIN;
                        SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(c1b72);
                        C1B72 c1b722 = C1B72.NOTIFICATION;
                        SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(c1b722);
                        if (!downloadTask.canShowNotification() && !downloadInfo.isAutoInstallWithoutNotification()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C2199621B6y.LIZ(i3, downloadListeners, true, downloadInfo, baseException, c1b72, downloadTask);
                        C2199621B6y.LIZ(i3, downloadListeners2, z, downloadInfo, baseException, c1b722, downloadTask);
                    }
                    LJIIZILJ(i, i2, message.what);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final DownloadTask LJIILIIL(int i, int i2) {
        DownloadTask downloadTask;
        synchronized (this) {
            try {
                if (i2 != 0) {
                    SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
                    if (sparseArray != null) {
                        downloadTask = sparseArray.get(i2);
                    } else {
                        downloadTask = null;
                    }
                } else {
                    downloadTask = this.LIZ.get(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return downloadTask;
    }

    public final void LJIJ(int i, int i2) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Listener hashCode: ");
            sbLIZ.append(i2);
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "removeTask", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i2 == 0) {
            this.LIZ.remove(i);
            this.LJ.remove(i);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.LJ.get(i);
        if (sparseArray != null) {
            sparseArray.remove(i2);
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("After downloadTaskWithListenerMap removeTask taskArray.size: ");
                sbLIZ2.append(sparseArray.size());
                C1490830otl.LIZLLL(i, "AbsDownloadEngine", "removeTask", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (sparseArray.size() != 0) {
                return;
            }
            this.LIZ.remove(i);
            this.LJ.remove(i);
            return;
        }
        this.LIZ.remove(i);
    }

    public final void LIZLLL(final int i, final boolean z, final boolean z2) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeleteFile:");
            sbLIZ.append(z);
            sbLIZ.append(" deleteFileIgnoreSecurity:");
            sbLIZ.append(z2);
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "clearDownloadData", C2188811AlT.LIZIZ(sbLIZ));
        }
        DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
        if (downloadInfo != null) {
            LIZJ(downloadInfo);
        }
        this.LJIIIZ.post(new ARunnableS9S0001000_31(i, 0));
        C2199681B7e.LJJIIZ(new Runnable() { // from class: X.1B7D
            public final void LIZ() {
                DownloadTask downloadTaskLJIIL;
                if (this.LLILZ.LJI(i) == null && (downloadTaskLJIIL = this.LLILZ.LJIIL(i)) != null) {
                    DownloadInfo downloadInfo2 = downloadTaskLJIIL.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = downloadTaskLJIIL.getDownloadListeners(C1B72.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                try {
                                    IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i2));
                                    if (iDownloadListener != null) {
                                        iDownloadListener.onCanceled(downloadInfo2);
                                        downloadTaskLJIIL.removeCallback(C1B72.SUB, iDownloadListener);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                }
                this.LLILZ.LJ(i, z, z2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsDownloadEngine@9f1b.clearDownloadData$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsDownloadEngine@9f1b.clearDownloadData$2");
            }
        });
    }

    public final void LJ(int i, boolean z, boolean z2) {
        if (!this.LJIIIIZZ) {
            LJFF(i, z, z2);
            return;
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeleteFile:");
            sbLIZ.append(z);
            sbLIZ.append(" deleteFileIgnoreSecurity:");
            sbLIZ.append(z2);
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "clearDownloadDataInSubThread", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new C2199881B7y(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).LIZ();
                    }
                    C2199671B7d.LJ(downloadInfo, z);
                } else {
                    C2199671B7d.LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.LJII.LJIIIIZZ(i);
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            synchronized (this) {
                try {
                    LJIIZILJ(i, 0, -4);
                    if (this.LIZJ.get(i) != null) {
                        this.LIZJ.remove(i);
                    }
                    if (this.LIZIZ.get(i) != null) {
                        this.LIZIZ.remove(i);
                    }
                    this.LJFF.remove(Integer.valueOf(i));
                    C2199751B7l.LJIIL(i);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public final synchronized void LJFF(int i, boolean z, boolean z2) {
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeleteFile:");
            sbLIZ.append(z);
            sbLIZ.append(" deleteFileIgnoreSecurity:");
            sbLIZ.append(z2);
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "clearDownloadDataInSubThread", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            DownloadInfo downloadInfo = this.LJII.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new C2199881B7y(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).LIZ();
                    }
                    C2199671B7d.LJ(downloadInfo, z);
                } else {
                    C2199671B7d.LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.LJII.LJIIIIZZ(i);
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJIIZILJ(i, 0, -4);
            if (this.LIZJ.get(i) != null) {
                this.LIZJ.remove(i);
            }
            if (this.LIZIZ.get(i) != null) {
                this.LIZIZ.remove(i);
            }
            this.LJFF.remove(Integer.valueOf(i));
            C2199751B7l.LJIIL(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:17:0x0017, B:19:0x0021, B:21:0x0029, B:22:0x002e, B:23:0x0032, B:25:0x0038, B:26:0x0042, B:27:0x0056, B:28:0x005d, B:29:0x006e, B:31:0x0078, B:33:0x0080, B:34:0x0085, B:35:0x0088), top: B:41:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIIZILJ(int r4, int r5, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = -7
            if (r6 == r0) goto L6e
            r0 = -6
            if (r6 == r0) goto L5d
            r0 = -4
            if (r6 == r0) goto L56
            r0 = -3
            if (r6 == r0) goto L42
            r0 = -1
            if (r6 == r0) goto L6e
            r0 = 7
            if (r6 == r0) goto L32
            r0 = 8
            if (r6 != r0) goto L8b
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L2e
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L2e
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L8d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L8d
        L2e:
            r3.LJJ(r4)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L32:
            boolean r0 = X.C1490830otl.LIZ()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L8b
            java.lang.String r2 = "AbsDownloadEngine"
            java.lang.String r1 = "refreshDownloadTaskMap"
            java.lang.String r0 = "Retry delay disable"
            X.C1490830otl.LJ(r4, r2, r1, r0)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L42:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch: java.lang.Throwable -> L8d
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L8d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L8d
            r3.LJIJ(r4, r5)     // Catch: java.lang.Throwable -> L8d
            r3.LJJ(r4)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L56:
            r3.LJIJ(r4, r5)     // Catch: java.lang.Throwable -> L8d
            r3.LJJ(r4)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L5d:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch: java.lang.Throwable -> L8d
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L8d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L8d
            r3.LJIJ(r4, r5)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L6e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L88
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L85
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L8d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L8d
        L85:
            r3.LJIJ(r4, r5)     // Catch: java.lang.Throwable -> L8d
        L88:
            r3.LJJ(r4)     // Catch: java.lang.Throwable -> L8d
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B7G.LJIIZILJ(int, int, int):void");
    }

    public final void LIZ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        if (!this.LJIIIIZZ) {
            LIZIZ(i, i2, iDownloadListener, c1b72, z, z2);
            return;
        }
        synchronized (this) {
            try {
                DownloadTask downloadTaskLJIIL = LJIIL(i);
                if (downloadTaskLJIIL != null) {
                    downloadTaskLJIIL.addDownloadListener(i2, iDownloadListener, c1b72, z);
                    DownloadInfo downloadInfo = downloadTaskLJIIL.getDownloadInfo();
                    if (z2 && downloadInfo != null && !LJIILJJIL(i) && ((c1b72 == C1B72.MAIN || c1b72 == C1B72.NOTIFICATION) && (c1b72 != C1B72.NOTIFICATION || downloadInfo.canShowNotification()))) {
                        this.LJIIIZ.post(new ARunnableS6S0401000_34(iDownloadListener, downloadInfo.getStatus(), downloadInfo, downloadTaskLJIIL, c1b72, 0));
                    }
                    return;
                }
                DownloadInfo downloadInfo2 = this.LJII.getDownloadInfo(i);
                synchronized (this) {
                    if (downloadInfo2 != null) {
                        try {
                            if (downloadInfo2.getStatus() != -3) {
                                DownloadTask downloadTask = this.LJFF.get(Integer.valueOf(i));
                                if (downloadTask == null) {
                                    downloadTask = new DownloadTask(downloadInfo2);
                                    this.LJFF.put(Integer.valueOf(i), downloadTask);
                                }
                                downloadTask.addDownloadListener(i2, iDownloadListener, c1b72, z);
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void LIZIZ(int i, int i2, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        DownloadTask downloadTaskLJIIL = LJIIL(i);
        if (downloadTaskLJIIL != null) {
            downloadTaskLJIIL.addDownloadListener(i2, iDownloadListener, c1b72, z);
            DownloadInfo downloadInfo = downloadTaskLJIIL.getDownloadInfo();
            if (z2 && downloadInfo != null && !LJIILJJIL(i) && ((c1b72 == C1B72.MAIN || c1b72 == C1B72.NOTIFICATION) && (c1b72 != C1B72.NOTIFICATION || downloadInfo.canShowNotification()))) {
                this.LJIIIZ.post(new ARunnableS42S0400000_34(iDownloadListener, downloadInfo, downloadTaskLJIIL, c1b72, 4));
            }
        } else {
            DownloadInfo downloadInfo2 = this.LJII.getDownloadInfo(i);
            if (downloadInfo2 != null && downloadInfo2.getStatus() != -3) {
                DownloadTask downloadTask = this.LJFF.get(Integer.valueOf(i));
                if (downloadTask == null) {
                    downloadTask = new DownloadTask(downloadInfo2);
                    this.LJFF.put(Integer.valueOf(i), downloadTask);
                }
                downloadTask.addDownloadListener(i2, iDownloadListener, c1b72, z);
            }
        }
    }
}
