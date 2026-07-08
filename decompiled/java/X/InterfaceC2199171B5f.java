package X;

import android.os.IInterface;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* JADX INFO: renamed from: X.1B5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2199171B5f extends IInterface {
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

    DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j);

    DownloadInfo LJJZZI(int i, long j);

    boolean LJL();

    void N(boolean z);

    void clearData();

    void d1(C1B5G c1b5g);

    List<DownloadInfo> getAllDownloadInfo();

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean updateDownloadInfo(DownloadInfo downloadInfo);
}
