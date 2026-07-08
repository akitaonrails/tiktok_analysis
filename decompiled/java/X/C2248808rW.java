package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08rW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2248808rW {
    public static final String LIZ(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(downloadInfo.getSavePath());
            sbLIZ.append(downloadInfo.getName());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(downloadInfo.getSavePath());
        sbLIZ2.append(File.separator);
        sbLIZ2.append(downloadInfo.getName());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
