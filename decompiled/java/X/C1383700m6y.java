package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* JADX INFO: renamed from: X.0m6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383700m6y {
    public static final boolean LIZ(AbstractC1382740m5Q abstractC1382740m5Q, String str) {
        File fileLIZLLL;
        if (abstractC1382740m5Q == null || (fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(str))) == null || !fileLIZLLL.exists()) {
            return false;
        }
        C2199771B7n c2199771B7n = new C2199771B7n();
        DownloadInfo downloadInfo = new DownloadInfo();
        c2199771B7n.LIZLLL = fileLIZLLL.getParent();
        c2199771B7n.LIZ = fileLIZLLL.getName();
        downloadInfo.setCurBytes(fileLIZLLL.length());
        downloadInfo.setTotalBytes(fileLIZLLL.length());
        AbsDownloadListener absDownloadListener = abstractC1382740m5Q.LIZIZ;
        if (absDownloadListener != null) {
            absDownloadListener.onProgress(downloadInfo);
        }
        AbsDownloadListener absDownloadListener2 = abstractC1382740m5Q.LIZIZ;
        if (absDownloadListener2 != null) {
            absDownloadListener2.onSuccessed(c2199771B7n.LIZ());
            return true;
        }
        return true;
    }

    public static final boolean LIZIZ(AbstractC1382740m5Q abstractC1382740m5Q, String str) {
        if (str == null || abstractC1382740m5Q == null) {
            return false;
        }
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        String strLIZLLL = c912070ZqH.LJ().LIZLLL(str);
        if (strLIZLLL == null || !c912070ZqH.LJ().LJFF(strLIZLLL)) {
            return false;
        }
        C2199771B7n c2199771B7n = new C2199771B7n();
        DownloadInfo downloadInfo = new DownloadInfo();
        if (c912070ZqH.LJ().LJII(strLIZLLL)) {
            InterfaceC1383710m6z interfaceC1383710m6zLJ = c912070ZqH.LJ();
            C844470XAv.LIZ.getClass();
            strLIZLLL = interfaceC1383710m6zLJ.LIZ(C844470XAv.LIZ(), strLIZLLL);
            if (strLIZLLL == null) {
                return false;
            }
        }
        C0VSJ c0vsj = new C0VSJ(strLIZLLL);
        c2199771B7n.LIZLLL = c0vsj.getParent();
        c2199771B7n.LIZ = c0vsj.getName();
        long fileSize = c912070ZqH.LJ().getFileSize(str) * ((long) 1024);
        downloadInfo.setCurBytes(fileSize);
        downloadInfo.setTotalBytes(fileSize);
        AbsDownloadListener absDownloadListener = abstractC1382740m5Q.LIZIZ;
        if (absDownloadListener != null) {
            absDownloadListener.onProgress(downloadInfo);
        }
        AbsDownloadListener absDownloadListener2 = abstractC1382740m5Q.LIZIZ;
        if (absDownloadListener2 != null) {
            absDownloadListener2.onSuccessed(c2199771B7n.LIZ());
            return true;
        }
        return true;
    }
}
