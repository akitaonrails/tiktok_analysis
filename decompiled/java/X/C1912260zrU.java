package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912260zrU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C1B8G LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912260zrU(int i, C1B8G c1b8g, String str, String str2, String str3, String str4, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = c1b8g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(this.LL);
        abstractC2199801B7qWith.LJ = this.LLILLJJLI;
        abstractC2199801B7qWith.LIZJ = this.LLILLL;
        abstractC2199801B7qWith.LJIIJ = this.LLILZ;
        abstractC2199801B7qWith.LJII = this.LLILZIL;
        final C1B8G c1b8g = this.LLIZ;
        abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.1B8C
            public static C1897470zTd LJI(DownloadInfo downloadInfo) {
                String url = downloadInfo.getUrl();
                String targetFilePath = downloadInfo.getTargetFilePath();
                downloadInfo.getRetryCount();
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
                return new C1897470zTd(url, targetFilePath);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    LJI(downloadInfo);
                }
                c1b8g2.onCanceled();
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    LJI(downloadInfo);
                }
                c1b8g2.LIZ();
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                C1897470zTd c1897470zTdLJI;
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    c1897470zTdLJI = LJI(downloadInfo);
                } else {
                    c1897470zTdLJI = null;
                }
                c1b8g2.LJ(c1897470zTdLJI);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C1897470zTd c1897470zTdLJI;
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    c1897470zTdLJI = LJI(downloadInfo);
                } else {
                    c1897470zTdLJI = null;
                }
                c1b8g2.LIZLLL(c1897470zTdLJI);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                C1897470zTd c1897470zTdLJI;
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    c1897470zTdLJI = LJI(downloadInfo);
                    c1897470zTdLJI.LIZJ = baseException;
                    if (baseException != null) {
                        baseException.getErrorCode();
                        baseException.getErrorMessage();
                    }
                } else {
                    c1897470zTdLJI = null;
                }
                c1b8g2.LIZJ(c1897470zTdLJI);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                C1B8G c1b8g2 = c1b8g;
                if (downloadInfo != null) {
                    LJI(downloadInfo);
                }
                c1b8g2.LIZIZ();
            }
        };
        if (this.LLILZLL) {
            abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.0zrV
                @Override // X.InterfaceC2329409Au
                public final void onStart(int i) {
                }
            });
        } else {
            abstractC2199801B7qWith.LIZJ();
        }
        return Unit.LIZ;
    }
}
