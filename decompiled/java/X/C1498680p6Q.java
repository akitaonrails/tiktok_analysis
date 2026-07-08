package X;

import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.ttnet.IDownloadApi;

/* JADX INFO: renamed from: X.0p6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1498680p6Q implements InterfaceC1498840p6g {
    public final C1498670p6P LIZ = new C1498670p6P(this);

    @Override // X.InterfaceC1498840p6g
    public final boolean LIZIZ() {
        this.LIZ.getClass();
        return C1498670p6P.LIZIZ;
    }

    @Override // X.InterfaceC1498840p6g
    public final InterfaceC1498660p6O LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1498840p6g
    public final InterfaceC1500070p8f getTTNetDownloadHttpService() {
        return this.LIZ.getTTNetDownloadHttpService();
    }

    @Override // X.InterfaceC1498840p6g
    public final int LIZLLL(Throwable th) {
        return this.LIZ.LIZLLL(th);
    }

    public IDownloadApi LJ(String str) {
        return (IDownloadApi) C1515120pWw.LJIIIZ(IDownloadApi.class, str);
    }

    @Override // X.InterfaceC1498840p6g
    public final DownloadTTNetException LIZ(String str, Throwable th) {
        return this.LIZ.LIZ(str, th);
    }
}
