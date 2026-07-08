package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0xFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811980xFk {
    public static final C1811980xFk LIZ = new C1811980xFk();

    public static DownloadInfo LIZ(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C497740JfY.LJII()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str)) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }
}
