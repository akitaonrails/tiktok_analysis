package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.0xrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1835200xrC {
    void LIZ(DownloadInfo downloadInfo);

    void onFailed(DownloadInfo downloadInfo, BaseException baseException);

    void onPause(DownloadInfo downloadInfo);

    void onProgress(DownloadInfo downloadInfo);
}
