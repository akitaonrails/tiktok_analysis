package X;

import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B65, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B65 extends C1B64 {
    public final /* synthetic */ IDownloadDepend LLILLJJLI;

    public C1B65(IDownloadDepend iDownloadDepend) {
        this.LLILLJJLI = iDownloadDepend;
    }

    @Override // X.C1B63
    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        this.LLILLJJLI.monitorLogSend(downloadInfo, baseException, i);
    }
}
