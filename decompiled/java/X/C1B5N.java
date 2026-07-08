package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B5N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B5N extends C1B5M {
    public final /* synthetic */ C1B5Q LLILLJJLI;

    @Override // X.C1B5O
    public final String M() {
        C1B5P c1b5p = (C1B5P) this.LLILLJJLI;
        c1b5p.getClass();
        try {
            return c1b5p.LIZ.M();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C1B5N(C1B5Q c1b5q) {
        this.LLILLJJLI = c1b5q;
    }

    @Override // X.C1B5O
    public final boolean LLLILZ(boolean z) {
        C1B5P c1b5p = (C1B5P) this.LLILLJJLI;
        c1b5p.getClass();
        try {
            return c1b5p.LIZ.LLLILZ(z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C1B5O
    public final void r0(int i, DownloadInfo downloadInfo, String str, String str2) {
        C1B5P c1b5p = (C1B5P) this.LLILLJJLI;
        c1b5p.getClass();
        try {
            c1b5p.LIZ.r0(i, downloadInfo, str, str2);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
