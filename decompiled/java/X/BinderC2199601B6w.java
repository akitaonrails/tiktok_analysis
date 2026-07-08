package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS67S0300000_34;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class BinderC2199601B6w extends AbstractBinderC2199511B6n {
    public final /* synthetic */ IDownloadListener LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    @Override // X.InterfaceC2200291B9n
    public final int LJLJJI() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC2200291B9n
    public final void LJJIL(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.LLILLJJLI;
        if (iDownloadListener instanceof C1B70) {
            if (this.LLILLL) {
                C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 40));
            } else {
                ((C1B70) iDownloadListener).LJJIL(downloadInfo);
            }
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onCanceled(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 46));
        } else {
            this.LLILLJJLI.onCanceled(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onFirstStart(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 47));
        } else {
            this.LLILLJJLI.onFirstStart(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 48));
        } else {
            this.LLILLJJLI.onFirstSuccess(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onPause(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 44));
        } else {
            this.LLILLJJLI.onPause(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onPrepare(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 41));
        } else {
            this.LLILLJJLI.onPrepare(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onProgress(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 43));
        } else {
            this.LLILLJJLI.onProgress(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onStart(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 42));
        } else {
            this.LLILLJJLI.onStart(downloadInfo);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS103S0200000_34(downloadInfo, this, 45));
        } else {
            this.LLILLJJLI.onSuccessed(downloadInfo);
        }
    }

    public BinderC2199601B6w(IDownloadListener iDownloadListener, boolean z) {
        this.LLILLJJLI = iDownloadListener;
        this.LLILLL = z;
    }

    @Override // X.InterfaceC2200291B9n
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS67S0300000_34(downloadInfo, baseException, this, 25));
        } else {
            this.LLILLJJLI.onFailed(downloadInfo, baseException);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS67S0300000_34(downloadInfo, baseException, this, 23));
        } else {
            this.LLILLJJLI.onRetry(downloadInfo, baseException);
        }
    }

    @Override // X.InterfaceC2200291B9n
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        if (this.LLILLL) {
            C786410Ut5.LJJZZIII(C2199591B6v.LIZ, new ARunnableS67S0300000_34(downloadInfo, baseException, this, 24));
        } else {
            this.LLILLJJLI.onRetryDelay(downloadInfo, baseException);
        }
    }
}
