package X;

import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: renamed from: X.1B6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199621B6y {
    public static void LIZ(int i, SparseArray<IDownloadListener> sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException, C1B72 c1b72, DownloadTask downloadTask) {
        SparseArray<IDownloadListener> sparseArrayClone;
        if (z && sparseArray != null) {
            try {
                if (sparseArray.size() > 0) {
                    synchronized (sparseArray) {
                        try {
                            sparseArrayClone = sparseArray.clone();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    for (int i2 = 0; i2 < sparseArrayClone.size(); i2++) {
                        IDownloadListener iDownloadListener = sparseArrayClone.get(sparseArrayClone.keyAt(i2));
                        if (iDownloadListener != null) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            if (i != 6) {
                                                if (i != 7) {
                                                    if (i != 11) {
                                                        switch (i) {
                                                            case -7:
                                                                if (iDownloadListener instanceof AbsDownloadListener) {
                                                                    ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                                                    if (downloadTask != null) {
                                                                        downloadTask.removeCallback(c1b72, iDownloadListener);
                                                                    }
                                                                }
                                                                break;
                                                            case -6:
                                                                iDownloadListener.onFirstSuccess(downloadInfo);
                                                                break;
                                                            case -5:
                                                            case -2:
                                                                iDownloadListener.onPause(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(c1b72, iDownloadListener);
                                                                }
                                                                break;
                                                            case -4:
                                                                iDownloadListener.onCanceled(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(c1b72, iDownloadListener);
                                                                }
                                                                break;
                                                            case -3:
                                                                iDownloadListener.onSuccessed(downloadInfo);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(c1b72, iDownloadListener);
                                                                }
                                                                break;
                                                            case -1:
                                                                iDownloadListener.onFailed(downloadInfo, baseException);
                                                                if (downloadTask != null) {
                                                                    downloadTask.removeCallback(c1b72, iDownloadListener);
                                                                }
                                                                break;
                                                        }
                                                    } else if (iDownloadListener instanceof C1B70) {
                                                        ((C1B70) iDownloadListener).LJJIL(downloadInfo);
                                                    }
                                                } else {
                                                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                                                }
                                            } else {
                                                iDownloadListener.onFirstStart(downloadInfo);
                                            }
                                        } else {
                                            iDownloadListener.onRetry(downloadInfo, baseException);
                                        }
                                    } else {
                                        iDownloadListener.onProgress(downloadInfo);
                                    }
                                } else {
                                    iDownloadListener.onStart(downloadInfo);
                                }
                            } else {
                                iDownloadListener.onPrepare(downloadInfo);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
    }
}
