package X;

import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: renamed from: X.1B6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199591B6v {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1B9m] */
    public static C2200281B9m LIZ(final InterfaceC2200291B9n interfaceC2200291B9n) {
        if (interfaceC2200291B9n == null) {
            return null;
        }
        return new C1B70() { // from class: X.1B9m
            @Override // X.C1B70
            public final void LJJIL(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.LJJIL(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onCanceled(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onFirstStart(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onFirstSuccess(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onPause(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onPrepare(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onProgress(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onStart(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    interfaceC2200291B9n.onSuccessed(downloadInfo);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    interfaceC2200291B9n.onFailed(downloadInfo, baseException);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    interfaceC2200291B9n.onRetry(downloadInfo, baseException);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    interfaceC2200291B9n.onRetryDelay(downloadInfo, baseException);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public static void LIZIZ(DownloadTask downloadTask, InterfaceC2199581B6u interfaceC2199581B6u, C1B72 c1b72) {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i = 0; i < interfaceC2199581B6u.LLLLJ(c1b72.ordinal()); i++) {
            InterfaceC2200291B9n interfaceC2200291B9nLLIILZL = interfaceC2199581B6u.LLIILZL(c1b72.ordinal(), i);
            if (interfaceC2200291B9nLLIILZL != null) {
                sparseArray.put(interfaceC2200291B9nLLIILZL.LJLJJI(), LIZ(interfaceC2200291B9nLLIILZL));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, c1b72);
    }
}
