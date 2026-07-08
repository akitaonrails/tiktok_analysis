package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1B7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199831B7t implements InterfaceC2199941B8e {
    public final C2199811B7r LIZ;
    public final C20130813pi LIZIZ;
    public final C1B8N LIZJ;

    @Override // X.InterfaceC2199941B8e
    public final void LIZ(C1B8I c1b8i) {
        this.LIZIZ.LL.LIZLLL(c1b8i.LIZ, c1b8i.LIZJ);
        this.LIZ.LIZIZ.addAndGet(c1b8i.LIZJ);
    }

    public C2199831B7t(DownloadInfo downloadInfo, C1B89 c1b89, C2199811B7r c2199811B7r) throws BaseException {
        this.LIZ = c2199811B7r;
        C20130813pi c20130813piLJII = C2199661B7c.LJII(C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIIZZ("flush_buffer_size_byte", -1), downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName());
        long startOffset = downloadInfo.getStartOffset();
        try {
            c20130813piLJII.LL.LIZIZ(c2199811B7r.LIZIZ() - (startOffset < 0 ? 0L : startOffset));
            this.LIZIZ = c20130813piLJII;
            this.LIZJ = new C1B8N(c1b89, this);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new BaseException(1054, e);
        }
    }
}
