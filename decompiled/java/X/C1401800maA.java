package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0maA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401800maA extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, downloadInfo, baseException);
                break;
            case 1:
                onFailed$1(this, downloadInfo, baseException);
                break;
            default:
                super.onFailed(downloadInfo, baseException);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, downloadInfo);
                break;
            case 1:
                onProgress$1(this, downloadInfo);
                break;
            default:
                super.onProgress(downloadInfo);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onStart$0(this, downloadInfo);
                break;
            case 1:
                onStart$1(this, downloadInfo);
                break;
            default:
                super.onStart(downloadInfo);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onSuccessed$0(this, downloadInfo);
                break;
            case 1:
                onSuccessed$1(this, downloadInfo);
                break;
            default:
                super.onSuccessed(downloadInfo);
                break;
        }
    }

    public C1401800maA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onProgress$0(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        int downloadProcess;
        long curBytes;
        long totalBytes;
        super.onProgress(downloadInfo);
        AbstractC1383500m6e abstractC1383500m6e = (AbstractC1383500m6e) c1401800maA.l0;
        if (abstractC1383500m6e != null) {
            if (downloadInfo != null) {
                downloadProcess = downloadInfo.getDownloadProcess();
                curBytes = downloadInfo.getCurBytes();
                totalBytes = downloadInfo.getTotalBytes();
            } else {
                downloadProcess = 0;
                curBytes = 0;
                totalBytes = 100;
            }
            abstractC1383500m6e.LIZJ(downloadProcess, curBytes, totalBytes);
        }
    }

    public static final void onProgress$1(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        int downloadProcess;
        super.onProgress(downloadInfo);
        AbstractC1383520m6g abstractC1383520m6g = (AbstractC1383520m6g) c1401800maA.l0;
        if (abstractC1383520m6g != null) {
            if (downloadInfo != null) {
                downloadProcess = downloadInfo.getDownloadProcess();
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            } else {
                downloadProcess = 0;
            }
            abstractC1383520m6g.LIZJ(downloadProcess);
        }
    }

    public static final void onStart$0(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        AbstractC1383500m6e abstractC1383500m6e = (AbstractC1383500m6e) c1401800maA.l0;
        if (abstractC1383500m6e != null) {
            abstractC1383500m6e.LIZLLL();
        }
    }

    public static final void onStart$1(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        AbstractC1383520m6g abstractC1383520m6g = (AbstractC1383520m6g) c1401800maA.l0;
        if (abstractC1383520m6g != null) {
            abstractC1383520m6g.LIZIZ = System.currentTimeMillis();
        }
    }

    public static final void onSuccessed$0(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        String url;
        super.onSuccessed(downloadInfo);
        AbstractC1383500m6e abstractC1383500m6e = (AbstractC1383500m6e) c1401800maA.l0;
        if (abstractC1383500m6e != null) {
            String strLIZIZ = "";
            if (downloadInfo == null || (url = downloadInfo.getUrl()) == null) {
                url = "";
            }
            C1383560m6k.LIZ.getClass();
            if (downloadInfo != null) {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(downloadInfo.getSavePath());
                    sbLIZ.append(downloadInfo.getName());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(downloadInfo.getSavePath());
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(downloadInfo.getName());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            abstractC1383500m6e.LJ(url, strLIZIZ);
        }
    }

    public static final void onSuccessed$1(C1401800maA c1401800maA, DownloadInfo downloadInfo) {
        String url;
        super.onSuccessed(downloadInfo);
        AbstractC1383520m6g abstractC1383520m6g = (AbstractC1383520m6g) c1401800maA.l0;
        if (abstractC1383520m6g != null) {
            String strLIZIZ = "";
            if (downloadInfo == null || (url = downloadInfo.getUrl()) == null) {
                url = "";
            }
            C1383660m6u.LIZ.getClass();
            if (downloadInfo != null) {
                String savePath = downloadInfo.getSavePath();
                if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(downloadInfo.getSavePath());
                    sbLIZ.append(downloadInfo.getName());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(downloadInfo.getSavePath());
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(downloadInfo.getName());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            abstractC1383520m6g.LIZLLL(url, strLIZIZ);
        }
    }

    public static final void onFailed$0(C1401800maA c1401800maA, DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        super.onFailed(downloadInfo, baseException);
        AbstractC1383500m6e abstractC1383500m6e = (AbstractC1383500m6e) c1401800maA.l0;
        if (abstractC1383500m6e != null) {
            Integer numValueOf = null;
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
                numValueOf = Integer.valueOf(baseException.getErrorCode());
            } else {
                errorMessage = null;
            }
            abstractC1383500m6e.LIZIZ(baseException, numValueOf, errorMessage);
        }
    }

    public static final void onFailed$1(C1401800maA c1401800maA, DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        super.onFailed(downloadInfo, baseException);
        AbstractC1383520m6g abstractC1383520m6g = (AbstractC1383520m6g) c1401800maA.l0;
        if (abstractC1383520m6g != null) {
            Integer numValueOf = null;
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
                numValueOf = Integer.valueOf(baseException.getErrorCode());
            } else {
                errorMessage = null;
            }
            abstractC1383520m6g.LIZIZ(baseException, numValueOf, errorMessage);
        }
    }
}
