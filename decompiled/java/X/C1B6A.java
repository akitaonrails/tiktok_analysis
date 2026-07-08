package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B6A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B6A extends C1B69 {
    public final /* synthetic */ C1B6D LLILLJJLI;

    public C1B6A(C1B6D c1b6d) {
        this.LLILLJJLI = c1b6d;
    }

    @Override // X.C1B6B
    public final boolean LLI(DownloadInfo downloadInfo) {
        C1B6C c1b6c = (C1B6C) this.LLILLJJLI;
        c1b6c.getClass();
        try {
            return c1b6c.LIZ.LLI(downloadInfo);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C1B6B
    public final boolean LLLLLJIL(DownloadInfo downloadInfo) {
        C1B6C c1b6c = (C1B6C) this.LLILLJJLI;
        c1b6c.getClass();
        try {
            return c1b6c.LIZ.LLLLLJIL(downloadInfo);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C1B6B
    public final boolean t0(DownloadInfo downloadInfo) {
        C1B6C c1b6c = (C1B6C) this.LLILLJJLI;
        c1b6c.getClass();
        try {
            return c1b6c.LIZ.t0(downloadInfo);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
