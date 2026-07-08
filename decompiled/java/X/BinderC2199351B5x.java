package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class BinderC2199351B5x extends AbstractBinderC2199341B5w {
    public final /* synthetic */ InterfaceC2199361B5y LLILLJJLI;

    public BinderC2199351B5x(InterfaceC2199361B5y interfaceC2199361B5y) {
        this.LLILLJJLI = interfaceC2199361B5y;
    }

    @Override // X.InterfaceC2199371B5z
    public final void LJJLIIJ(DownloadInfo downloadInfo) {
        try {
            this.LLILLJJLI.LJJLIIJ(downloadInfo);
        } catch (BaseException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    @Override // X.InterfaceC2199371B5z
    public final boolean LJJLL(DownloadInfo downloadInfo) {
        return this.LLILLJJLI.LJJLL(downloadInfo);
    }
}
