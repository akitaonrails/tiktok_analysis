package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.12Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723412Eu extends AbsDownloadListener {
    public AbsDownloadListener LL;

    public C19723412Eu(C19722112Eh c19722112Eh) {
        this.LL = c19722112Eh;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onCanceled(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onFirstStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onFirstSuccess(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onIntercept(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onIntercept(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onPause(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onPrepare(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onProgress(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onSuccessed(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onRetry(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        AbsDownloadListener absDownloadListener = this.LL;
        if (absDownloadListener != null) {
            absDownloadListener.onRetryDelay(downloadInfo, baseException);
        }
    }
}
