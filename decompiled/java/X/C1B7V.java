package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.thread.WeakDownloadHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1B7V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7V {
    public static final String LJIILLIIL = C1B7V.class.getSimpleName();
    public final boolean LIZ;
    public final boolean LIZIZ;
    public DownloadInfo LIZJ;
    public final InterfaceC2199141B5c LIZLLL;
    public final Handler LJ;
    public final DownloadTask LJFF;
    public SparseArray<IDownloadListener> LJI;
    public SparseArray<IDownloadListener> LJII;
    public SparseArray<IDownloadListener> LJIIIIZZ;
    public boolean LJIIIZ;
    public volatile long LJIIJ;
    public final AtomicLong LJIIJJI = new AtomicLong();
    public boolean LJIIL = false;
    public int LJIILIIL;
    public long LJIILJJIL;
    public InterfaceC2199431B6f LJIILL;

    public final void LIZ() {
        DownloadTask downloadTask = this.LJFF;
        if (downloadTask != null) {
            this.LIZJ = downloadTask.getDownloadInfo();
            this.LJI = this.LJFF.getDownloadListeners(C1B72.MAIN);
            this.LJIIIIZZ = this.LJFF.getDownloadListeners(C1B72.NOTIFICATION);
            this.LJII = this.LJFF.getDownloadListeners(C1B72.SUB);
            this.LJIILL = this.LJFF.getMonitorDepend();
        }
    }

    public final void LIZIZ() throws BaseException {
        List<InterfaceC2199361B5y> downloadCompleteHandlers = this.LJFF.getDownloadCompleteHandlers();
        if (downloadCompleteHandlers.isEmpty()) {
            return;
        }
        DownloadInfo downloadInfo = this.LIZJ;
        LJIIL(11, null, true);
        this.LIZLLL.updateDownloadInfo(downloadInfo);
        for (InterfaceC2199361B5y interfaceC2199361B5y : downloadCompleteHandlers) {
            try {
                if (interfaceC2199361B5y.LJJLL(downloadInfo)) {
                    interfaceC2199361B5y.LJJLIIJ(downloadInfo);
                    this.LIZLLL.updateDownloadInfo(downloadInfo);
                }
            } catch (BaseException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new BaseException(1071, th);
            }
        }
    }

    public final void LIZJ() {
        this.LIZJ.setStatus(8);
        this.LIZJ.setAsyncHandleStatus(C1B7X.ASYNC_HANDLE_WAITING);
        C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
        if (c1b7gLJIILIIL != null) {
            c1b7gLJIILIIL.LJIIZILJ(this.LIZJ.getId(), this.LJFF.getHashCodeForSameTask(), 8);
        }
    }

    public final void LIZLLL() throws BaseException {
        if (this.LIZJ == null) {
            throw new BaseException(1087, "onCompleteForFileExist DownloadInfo is null");
        }
        boolean z = this.LIZ;
        String str = LJIILLIIL;
        if (!z) {
            LIZIZ();
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(this.LIZJ.getId(), str, "onCompleteForFileExist", "Success");
            }
            this.LIZJ.setSuccessByCache(true);
            LJIIL(-3, null, true);
            this.LIZLLL.LJJLIIIJLLLLLLLZ(this.LIZJ.getId(), this.LIZJ.getTotalBytes());
            this.LIZLLL.LJJJZ(this.LIZJ.getId());
            return;
        }
        LIZIZ();
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LIZJ.getId(), str, "onCompleteForFileExist", "Success for fixStartWithFileExistUpdateError");
        }
        this.LIZJ.setSuccessByCache(true);
        LJIIL(-3, null, true);
        this.LIZLLL.LJJLIIIJLLLLLLLZ(this.LIZJ.getId(), this.LIZJ.getTotalBytes());
        this.LIZLLL.updateDownloadInfo(this.LIZJ);
        this.LIZLLL.LJJJZ(this.LIZJ.getId());
    }

    public final void LJFF() {
        boolean z;
        this.LIZJ.setFirstDownload(false);
        if (!this.LIZJ.isIgnoreDataVerify() && this.LIZJ.getCurBytes() != this.LIZJ.getTotalBytes()) {
            if (C1490830otl.LIZ()) {
                String str = LJIILLIIL;
                int id = this.LIZJ.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ErrorBytesLog:");
                sbLIZ.append(this.LIZJ.getErrorBytesLog());
                C1490830otl.LIZLLL(id, str, "onCompleted", C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("current bytes is not equals to total bytes, bytes changed with process : ");
            sbLIZ2.append(this.LIZJ.getByteInvalidRetryStatus());
            LJI(new DownloadRetryNeedlessException(1027, C2188811AlT.LIZIZ(sbLIZ2)));
            return;
        }
        if (this.LIZJ.getCurBytes() <= 0) {
            if (C1490830otl.LIZ()) {
                String str2 = LJIILLIIL;
                int id2 = this.LIZJ.getId();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ErrorBytesLog:");
                sbLIZ3.append(this.LIZJ.getErrorBytesLog());
                C1490830otl.LIZLLL(id2, str2, "onCompleted", C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("curBytes is 0, bytes changed with process : ");
            sbLIZ4.append(this.LIZJ.getByteInvalidRetryStatus());
            LJI(new DownloadRetryNeedlessException(1026, C2188811AlT.LIZIZ(sbLIZ4)));
            return;
        }
        if (!this.LIZJ.isIgnoreDataVerify() && this.LIZJ.getTotalBytes() <= 0) {
            if (C1490830otl.LIZ()) {
                String str3 = LJIILLIIL;
                int id3 = this.LIZJ.getId();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("ErrorBytesLog:");
                sbLIZ5.append(this.LIZJ.getErrorBytesLog());
                C1490830otl.LIZLLL(id3, str3, "onCompleted", C2188811AlT.LIZIZ(sbLIZ5));
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("TotalBytes is 0, bytes changed with process : ");
            sbLIZ6.append(this.LIZJ.getByteInvalidRetryStatus());
            LJI(new DownloadRetryNeedlessException(1044, C2188811AlT.LIZIZ(sbLIZ6)));
            return;
        }
        if (C1490830otl.LIZ()) {
            String str4 = LJIILLIIL;
            int id4 = this.LIZJ.getId();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Start save file as target name:");
            sbLIZ7.append(this.LIZJ.getName());
            C1490830otl.LIZLLL(id4, str4, "onCompleted", C2188811AlT.LIZIZ(sbLIZ7));
        }
        InterfaceC2199431B6f monitorDepend = this.LJIILL;
        DownloadTask downloadTask = this.LJFF;
        if (downloadTask != null) {
            monitorDepend = downloadTask.getMonitorDepend();
        }
        DownloadInfo downloadInfo = this.LIZJ;
        InterfaceC2199911B8b interfaceC2199911B8b = new InterfaceC2199911B8b() { // from class: X.1B7W
            @Override // X.InterfaceC2199911B8b
            public final void onSuccess() {
                C1B7V c1b7v = this.LIZ;
                c1b7v.getClass();
                try {
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZLLL(c1b7v.LIZJ.getId(), C1B7V.LJIILLIIL, "onSaveTempFileSuccess", "Success");
                    }
                    try {
                        c1b7v.LIZIZ();
                        DownloadInfo downloadInfo2 = c1b7v.LIZJ;
                        if (downloadInfo2 == null) {
                            c1b7v.LJI(new BaseException(1087, "onSaveTempFileSuccess DownloadInfo is null"));
                            return;
                        }
                        downloadInfo2.setFirstSuccess(false);
                        c1b7v.LIZJ.setSuccessByCache(false);
                        if (c1b7v.LIZJ.getDownloadFinishTimeStamp() <= 0) {
                            c1b7v.LIZJ.setDownloadFinishTimeStamp(System.currentTimeMillis());
                        }
                        c1b7v.LJIIJJI(-3, null);
                        c1b7v.LIZLLL.LJJLIIIJLLLLLLLZ(c1b7v.LIZJ.getId(), c1b7v.LIZJ.getTotalBytes());
                        c1b7v.LIZLLL.LJJJZ(c1b7v.LIZJ.getId());
                    } catch (BaseException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1b7v.LJI(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1b7v.LJI(new BaseException(1008, C2199671B7d.LJIIL("onCompleted", th)));
                }
            }

            @Override // X.InterfaceC2199911B8b
            public final void LIZ(BaseException baseException) {
                String errorMessage;
                String str5 = C1B7V.LJIILLIIL;
                int id5 = this.LIZ.LIZJ.getId();
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("Exception: ");
                if (baseException != null) {
                    errorMessage = baseException.getErrorMessage();
                } else {
                    errorMessage = "";
                }
                sbLIZ8.append(errorMessage);
                C1490830otl.LJ(id5, str5, "saveFileAsTargetName_onFailed", C2188811AlT.LIZIZ(sbLIZ8));
                this.LIZ.LJI(baseException);
            }
        };
        if (C1490830otl.LIZ()) {
            String str5 = C2199661B7c.LIZ;
            int id5 = downloadInfo.getId();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("TargetName: ");
            sbLIZ8.append(downloadInfo.getTargetFilePath());
            C1490830otl.LIZLLL(id5, str5, "saveFileAsTargetName", C2188811AlT.LIZIZ(sbLIZ8));
        } else {
            String str6 = C2199661B7c.LIZ;
        }
        try {
            synchronized (C2199661B7c.LIZIZ) {
                try {
                    Boolean bool = C2199661B7c.LIZIZ.get(downloadInfo.getId());
                    Boolean bool2 = Boolean.TRUE;
                    if (bool == bool2) {
                        if (C1490830otl.LIZ()) {
                            C1490830otl.LIZLLL(downloadInfo.getId(), C2199661B7c.LIZ, "saveFileAsTargetName", "Has another same task is saving temp file");
                        }
                        List<InterfaceC2199911B8b> arrayList = C2199661B7c.LIZJ.get(downloadInfo.getId());
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            C2199661B7c.LIZJ.put(downloadInfo.getId(), arrayList);
                        }
                        arrayList.add(interfaceC2199911B8b);
                        return;
                    }
                    if (C1490830otl.LIZ()) {
                        String str7 = C2199661B7c.LIZ;
                        int id6 = downloadInfo.getId();
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("SaveTempFileStatusMap put id:");
                        sbLIZ9.append(downloadInfo.getId());
                        C1490830otl.LIZLLL(id6, str7, "saveFileAsTargetName", C2188811AlT.LIZIZ(sbLIZ9));
                    }
                    C2199661B7c.LIZIZ.put(downloadInfo.getId(), bool2);
                    C2199881B7y c2199881B7y = new C2199881B7y(downloadInfo.getTempPath(), downloadInfo.getTempName(), true, true);
                    C2199881B7y c2199881B7y2 = new C2199881B7y(downloadInfo.getSavePath(), downloadInfo.getName(), true, true);
                    BaseException e = null;
                    if (!downloadInfo.isForce() && c2199881B7y2.LJII() && c2199881B7y2.length() > 0 && (downloadInfo.getTotalBytes() <= 0 || c2199881B7y2.length() >= downloadInfo.getTotalBytes())) {
                        if (C1490830otl.LIZ()) {
                            C1490830otl.LIZLLL(downloadInfo.getId(), C2199661B7c.LIZ, "saveFileAsTargetName", "TargetFile exist");
                        }
                        int iLIZIZ = C2199671B7d.LIZIZ(c2199881B7y2, downloadInfo.getMd5());
                        if (iLIZIZ == 0 || iLIZIZ == 2) {
                            if (C1490830otl.LIZ()) {
                                C1490830otl.LIZLLL(downloadInfo.getId(), C2199661B7c.LIZ, "saveFileAsTargetName", "TempFile not exist , targetFile exists and md5 check valid");
                            }
                            downloadInfo.setTTMd5CheckStatus(iLIZIZ);
                            interfaceC2199911B8b.onSuccess();
                            C2199661B7c.LJIIJ(downloadInfo.getId(), null, true);
                            return;
                        }
                        if (c2199881B7y.LJII()) {
                            z = true;
                        } else {
                            BaseException baseException = new BaseException(1005, C786410Ut5.j4("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", new Object[]{downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName(), C2199671B7d.LJIILIIL(iLIZIZ)}));
                            interfaceC2199911B8b.LIZ(baseException);
                            C2199661B7c.LJIIJ(downloadInfo.getId(), baseException, false);
                            z = false;
                        }
                        if (!c2199881B7y2.LIZ()) {
                            if (!z) {
                                if (monitorDepend != null) {
                                    C2199691B7f.LJIIIIZZ(monitorDepend, downloadInfo, new BaseException(1038, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), downloadInfo.getStatus());
                                    return;
                                }
                                return;
                            } else {
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("delete targetPath file existed with md5 check invalid status:");
                                sbLIZ10.append(C2199671B7d.LJIILIIL(iLIZIZ));
                                BaseException baseException2 = new BaseException(1037, C2188811AlT.LIZIZ(sbLIZ10));
                                interfaceC2199911B8b.LIZ(baseException2);
                                C2199661B7c.LJIIJ(downloadInfo.getId(), baseException2, false);
                                return;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else if (!c2199881B7y.LJII()) {
                        BaseException baseException3 = new BaseException(1005, C786410Ut5.j4("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", new Object[]{downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName()}));
                        interfaceC2199911B8b.LIZ(baseException3);
                        C2199661B7c.LJIIJ(downloadInfo.getId(), baseException3, false);
                        return;
                    }
                    try {
                        int iLJIIIIZZ = C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIIZZ("download_finish_check_ttmd5", 2);
                        if (iLJIIIIZZ > 0) {
                            int iLIZIZ2 = C2199671B7d.LIZIZ(c2199881B7y, downloadInfo.getMd5());
                            downloadInfo.setTTMd5CheckStatus(iLIZIZ2);
                            if (iLJIIIIZZ >= 2 && iLIZIZ2 != 0 && iLIZIZ2 != 2) {
                                BaseException baseException4 = new BaseException(1034, C2199671B7d.LJIILIIL(iLIZIZ2));
                                interfaceC2199911B8b.LIZ(baseException4);
                                C2199661B7c.LJIIJ(downloadInfo.getId(), baseException4, false);
                                C2199671B7d.LJ(downloadInfo, C1294200jmc.LIZIZ(downloadInfo.getSavePath()));
                                return;
                            }
                        }
                    } catch (BaseException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!(!C2199661B7c.LJIIZILJ(c2199881B7y, c2199881B7y2))) {
                        interfaceC2199911B8b.onSuccess();
                        C2199661B7c.LJIIJ(downloadInfo.getId(), null, true);
                    } else {
                        if (0 == 0) {
                            e = new BaseException(1038, C786410Ut5.j4("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName()}));
                        }
                        interfaceC2199911B8b.LIZ(e);
                        C2199661B7c.LJIIJ(downloadInfo.getId(), e, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (C1490830otl.LIZ()) {
                String str8 = C2199661B7c.LIZ;
                int id7 = downloadInfo.getId();
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("Throwable: ");
                sbLIZ11.append(th2.getMessage());
                C1490830otl.LIZLLL(id7, str8, "saveFileAsTargetName", C2188811AlT.LIZIZ(sbLIZ11));
            }
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(C2199671B7d.LJIIL("saveFileAsTargetName", th2));
            sbLIZ12.append(Log.getStackTraceString(new Throwable("save")));
            BaseException baseException5 = new BaseException(1038, C2188811AlT.LIZIZ(sbLIZ12));
            interfaceC2199911B8b.LIZ(baseException5);
            C2199661B7c.LJIIJ(downloadInfo.getId(), baseException5, false);
        }
    }

    public final void LJIIIIZZ() {
        this.LIZJ.setStatus(-2);
        try {
            this.LIZLLL.LJJIJIIJI(this.LIZJ.getId(), this.LIZJ.getCurBytes());
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIL(-2, null, true);
    }

    public final void LJIIJ() {
        if (this.LIZJ.canSkipStatusHandler()) {
            this.LIZJ.changeSkipStatus();
            return;
        }
        if (this.LIZJ.getDownloadStartTimeStamp() <= 0) {
            this.LIZJ.setDownloadStartTimeStamp(System.currentTimeMillis());
        }
        this.LIZLLL.LJJIJL(this.LIZJ.getId());
        if (this.LIZJ.isFirstDownload()) {
            LJIIL(6, null, true);
        }
        LJIIL(2, null, true);
    }

    public final void LJI(BaseException baseException) {
        int i;
        Context contextLJFF;
        this.LIZJ.setFirstDownload(false);
        String str = LJIILLIIL;
        int id = this.LIZJ.getId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception:");
        sbLIZ.append(baseException);
        C1490830otl.LJ(id, str, "handleError", C2188811AlT.LIZIZ(sbLIZ));
        if (C1490830otl.LIZ()) {
            int id2 = this.LIZJ.getId();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Exception Trace:");
            sbLIZ2.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LJ(id2, str, "handleError", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (baseException != null && baseException.getCause() != null && (baseException.getCause() instanceof SQLiteFullException)) {
            try {
                this.LIZLLL.LJIIIIZZ(this.LIZJ.getId());
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            try {
                this.LIZLLL.LJJJ(this.LIZJ.getId(), this.LIZJ.getCurBytes());
            } catch (SQLiteException e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    this.LIZLLL.LJIIIIZZ(this.LIZJ.getId());
                } catch (SQLiteException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        if (C2199751B7l.LJFF(this.LIZJ.getId(), null).LJIIIIZZ("download_failed_check_net", 1) == 1 && C2199671B7d.LJJ(baseException) && (contextLJFF = C2199681B7e.LJFF()) != null && !C2199671B7d.LJIL(contextLJFF) && !C2199751B7l.LIZIZ().optBoolean("disable_check_no_network")) {
            baseException = new BaseException(1049, baseException.getErrorMessage());
        }
        this.LIZJ.setFailedException(baseException);
        if (baseException instanceof DownloadPauseReserveWifiException) {
            i = -2;
        } else {
            i = -1;
        }
        LJIIJJI(i, baseException);
        if (C2199751B7l.LJFF(this.LIZJ.getId(), null).LJIIIIZZ("retry_schedule", 0) > 0) {
            C1B8A.LIZ().tryStartScheduleRetry(this.LIZJ);
        }
    }

    public C1B7V(DownloadTask downloadTask, WeakDownloadHandler weakDownloadHandler) {
        this.LJFF = downloadTask;
        LIZ();
        this.LJ = weakDownloadHandler;
        this.LIZLLL = C2199681B7e.LJIIJJI();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.LIZ = C2199751B7l.LJFF(downloadInfo.getId(), null).LJI("fix_start_with_file_exist_update_error", false);
        } else {
            this.LIZ = false;
        }
        this.LIZIZ = C2199751B7l.LJFF.LJIIIIZZ("fix_anr_progress_handle_msg", 0) > 0;
    }

    public final void LJ(String str, String str2) throws BaseException {
        if (C1490830otl.LIZ()) {
            String str3 = LJIILLIIL;
            int id = this.LIZJ.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExistTargetFileName:");
            sbLIZ.append(str2);
            sbLIZ.append(" but curName is ");
            sbLIZ.append(this.LIZJ.getName());
            C1490830otl.LIZLLL(id, str3, "onCompleteForFileExist", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZ) {
            C2199661B7c.LJI(this.LIZJ, str, str2);
            LIZIZ();
            this.LIZJ.setSuccessByCache(true);
            LJIIL(-3, null, true);
            this.LIZLLL.updateDownloadInfo(this.LIZJ);
            return;
        }
        this.LIZLLL.updateDownloadInfo(this.LIZJ);
        C2199661B7c.LJI(this.LIZJ, str, str2);
        this.LIZJ.setSuccessByCache(true);
        LIZIZ();
        LJIIL(-3, null, true);
    }

    public final void LJIIIZ(BaseException baseException, boolean z) {
        int i;
        this.LIZJ.setFirstDownload(false);
        this.LJIIJJI.set(0L);
        this.LIZLLL.LJJJJ(this.LIZJ.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        LJIIL(i, baseException, true);
    }

    public final void LJIIJJI(int i, BaseException baseException) {
        LJIIL(i, baseException, true);
    }

    public final void LJII(long j, String str, String str2) {
        this.LIZJ.setTotalBytes(j);
        this.LIZJ.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.LIZJ.getName())) {
            this.LIZJ.setName(str2);
        }
        try {
            this.LIZLLL.LJJJI(this.LIZJ.getId(), str, j, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIL(3, null, true);
        this.LJIILJJIL = this.LIZJ.getMinByteIntervalForPostToMainThread(j);
        this.LJIILIIL = this.LIZJ.getMinProgressTimeMsInterval();
        this.LJIIIZ = true;
        C1B8A.LIZ().scheduleRetryWhenHasTaskConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final int r22, final com.ss.android.socialbase.downloader.exception.BaseException r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B7V.LJIIL(int, com.ss.android.socialbase.downloader.exception.BaseException, boolean):void");
    }
}
