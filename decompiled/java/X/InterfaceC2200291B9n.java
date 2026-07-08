package X;

import android.os.IInterface;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2200291B9n extends IInterface {
    void LJJIL(DownloadInfo downloadInfo);

    int LJLJJI();

    void onCanceled(DownloadInfo downloadInfo);

    void onFailed(DownloadInfo downloadInfo, BaseException baseException);

    void onFirstStart(DownloadInfo downloadInfo);

    void onFirstSuccess(DownloadInfo downloadInfo);

    void onPause(DownloadInfo downloadInfo);

    void onPrepare(DownloadInfo downloadInfo);

    void onProgress(DownloadInfo downloadInfo);

    void onRetry(DownloadInfo downloadInfo, BaseException baseException);

    void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException);

    void onStart(DownloadInfo downloadInfo);

    void onSuccessed(DownloadInfo downloadInfo);
}
