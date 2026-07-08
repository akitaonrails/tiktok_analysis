package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.11gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19567111gz extends AbsDownloadListener {
    public final AbstractC19568411hC<Effect, Unit> LL;
    public final InterfaceC19568711hF<Effect, Unit> LLILLJJLI;
    public long LLILLL;
    public final C054G LLILZ;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.LLILLL = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        C23250099c.LIZLLL(this.LLILZ, C2108108Nr.LIZ, null, new C19566911gx(this, null), 2);
    }

    public C19567111gz(AbstractC19568411hC abstractC19568411hC, C19568211hA c19568211hA) {
        this.LL = abstractC19568411hC;
        this.LLILLJJLI = c19568211hA;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLILZ = C2296808zG.LIZ(C2108108Nr.LIZ.plus(c1dfkLIZ).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 21)));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String message;
        int errorCode;
        this.LL.LIZ(4);
        AbstractC19568411hC<Effect, Unit> abstractC19568411hC = this.LL;
        if (baseException != null) {
            message = baseException.getMessage();
        } else {
            message = null;
        }
        abstractC19568411hC.LJFF = new C19569211hK(baseException, -1, message);
        this.LLILLJJLI.LIZJ(this.LL);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("errorDesc", C201955140j.LJIIJJI(baseException));
        if (baseException != null) {
            errorCode = baseException.getErrorCode();
        } else {
            errorCode = 0;
        }
        c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
        C1637890six.LJ("aweme_tool_draft_amazing_infosticker_update_download_error", 1, c543670LTx.LJ());
    }
}
