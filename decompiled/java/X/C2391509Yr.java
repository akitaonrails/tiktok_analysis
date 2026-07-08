package X;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: renamed from: X.09Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2391509Yr {
    public static final C2391509Yr LIZ = new C2391509Yr();

    public static void LIZ(C2391409Yq c2391409Yq) {
        final C2392209Yy c2392209Yy = new C2392209Yy(c2391409Yq);
        C844470XAv.LIZ.getClass();
        DownloadTask downloadTaskWith = C2200151B8z.with(C844470XAv.LIZ());
        downloadTaskWith.url(c2391409Yq.LIZ);
        downloadTaskWith.name(c2391409Yq.LIZJ);
        downloadTaskWith.monitorScene("minis_native");
        downloadTaskWith.savePath(c2391409Yq.LIZLLL);
        downloadTaskWith.subThreadListener(new IDownloadListener() { // from class: X.09Yt
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                int downloadProcess;
                C2391409Yq c2391409Yq2 = c2392209Yy.LIZ;
                InterfaceC2391809Yu interfaceC2391809Yu = c2391409Yq2.LJII;
                if (interfaceC2391809Yu != null) {
                    if (downloadInfo != null) {
                        downloadProcess = downloadInfo.getDownloadProcess();
                    } else {
                        downloadProcess = 0;
                    }
                    interfaceC2391809Yu.LIZ(c2391409Yq2, downloadProcess);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                C2391409Yq c2391409Yq2 = c2392209Yy.LIZ;
                InterfaceC2391809Yu interfaceC2391809Yu = c2391409Yq2.LJII;
                if (interfaceC2391809Yu != null) {
                    interfaceC2391809Yu.LIZIZ(c2391409Yq2);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C2391409Yq c2391409Yq2 = c2392209Yy.LIZ;
                InterfaceC2391809Yu interfaceC2391809Yu = c2391409Yq2.LJII;
                if (interfaceC2391809Yu != null) {
                    interfaceC2391809Yu.LIZJ(c2391409Yq2);
                }
                c2392209Yy.LIZ.LJII = null;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                C2391409Yq c2391409Yq2 = c2392209Yy.LIZ;
                InterfaceC2391809Yu interfaceC2391809Yu = c2391409Yq2.LJII;
                if (interfaceC2391809Yu != null) {
                    interfaceC2391809Yu.LIZLLL(c2391409Yq2, baseException);
                }
                c2392209Yy.LIZ.LJII = null;
            }
        });
        downloadTaskWith.download();
    }
}
