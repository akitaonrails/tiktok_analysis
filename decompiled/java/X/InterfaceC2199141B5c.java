package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2199141B5c {
    boolean LJIIIIZZ(int i);

    void LJIIIZ(int i);

    boolean LJIILLIIL(int i);

    void LJIJI(DownloadInfo downloadInfo);

    DownloadInfo LJJIIJ(int i);

    DownloadInfo LJJIJ(int i);

    DownloadInfo LJJIJIIJI(int i, long j);

    DownloadInfo LJJIJL(int i);

    DownloadInfo LJJJ(int i, long j);

    DownloadInfo LJJJI(int i, String str, long j, String str2);

    DownloadInfo LJJJJ(int i);

    void LJJJZ(int i);

    DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j);

    DownloadInfo LJJZZI(int i, long j);

    boolean LJL();

    List<C2199811B7r> LLILLIZIL(int i);

    void LLLIIL();

    boolean LLLLII(int i, Map<Long, C2199811B7r> map);

    void clearData();

    void clearMemoryCacheData(double d);

    List<DownloadInfo> getAllDownloadInfo();

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean updateDownloadInfo(DownloadInfo downloadInfo);

    Map<Long, C2199811B7r> x(int i);
}
