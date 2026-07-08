package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS1S3001000_25;

/* JADX INFO: renamed from: X.0sca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633940sca extends AbsDownloadListener {
    public final /* synthetic */ C11PQ<C1633900scW> LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ C1431920nMk LLILLL;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        this.LL.onNext(new C1633900scW(this.LLILLJJLI, new C1633050sb9(EnumC1641480sok.INFO_STICKER_STATE_NOT_DOWNLOAD), 0, null, 8));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        long curBytes;
        long totalBytes;
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            curBytes = downloadInfo.getCurBytes();
            totalBytes = downloadInfo.getTotalBytes();
        } else {
            curBytes = 0;
            totalBytes = 100;
        }
        int i = (int) ((((double) (curBytes * 1.0f)) / totalBytes) * ((double) 100.0f));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMStickerDownloader : download progress = ");
        sbLIZ.append(i);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.onNext(new C1633900scW(this.LLILLJJLI, new C1633050sb9(EnumC1641480sok.INFO_STICKER_STATE_DOWNLOADING), Integer.valueOf(i), null, 8));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        C201955140j.LJIIL("IMStickerDownloader : start download");
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C201955140j.LJIIL("IMStickerDownloader :success");
        if (this.LLILLJJLI.getUnzipPath().length() == 0) {
            this.LLILLJJLI.setUnzipPath(((InterfaceC1633950scb) this.LLILLL.LIZIZ.getValue()).LIZIZ(this.LLILLJJLI));
        }
        this.LL.onNext(new C1633900scW(this.LLILLJJLI, new C1633050sb9(EnumC1641480sok.INFO_STICKER_STATE_DOWNLOAD_SUCCESS), null, null, 12));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int errorCode;
        String errorMessage;
        this.LL.onNext(new C1633900scW(this.LLILLJJLI, new C1633050sb9(EnumC1641480sok.INFO_STICKER_STATE_DOWNLOAD_FAILED), null, baseException, 4));
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLILLJJLI.getFileUrl().getUrlList(), null, null, null, 0, null, null, 63);
        String strLJII = C1462560oAA.LJII(this.LLILLJJLI.getTags());
        if (baseException != null) {
            errorCode = baseException.getErrorCode();
            errorMessage = baseException.getErrorMessage();
            if (errorMessage == null) {
            }
            C1634980seG.LIZ("edit_sticker_click_download_failed", new AwS1S3001000_25(errorCode, errorMessage, strLJJLIIIJ, strLJII, 0));
        }
        errorCode = -1;
        errorMessage = "";
        C1634980seG.LIZ("edit_sticker_click_download_failed", new AwS1S3001000_25(errorCode, errorMessage, strLJJLIIIJ, strLJII, 0));
    }

    public C1633940sca(C11PQ<C1633900scW> c11pq, Effect effect, C1431920nMk c1431920nMk) {
        this.LL = c11pq;
        this.LLILLJJLI = effect;
        this.LLILLL = c1431920nMk;
    }
}
