package X;

import android.content.Intent;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: renamed from: X.1B7F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B7F<T extends DownloadService> {
    void LIZ();

    void LIZIZ();

    IBinder LIZJ(Intent intent);

    void LIZLLL(DownloadTask downloadTask);

    void LJ();

    void setLogLevel(int i);

    void tryDownload(DownloadTask downloadTask);
}
