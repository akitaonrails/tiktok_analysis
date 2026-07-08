package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2414409d8 {
    public final void LIZ(Context context, String str, String str2, String str3, final InterfaceC2414709dB interfaceC2414709dB) {
        DownloadTask downloadTaskWith = C2200151B8z.with(context);
        downloadTaskWith.url(str);
        downloadTaskWith.savePath(str2);
        downloadTaskWith.name(str3);
        downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.09dA
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    downloadInfo.getCurBytes();
                    downloadInfo.getTotalBytes();
                }
                InterfaceC2414709dB interfaceC2414709dB2 = interfaceC2414709dB;
                if (interfaceC2414709dB2 != null) {
                    interfaceC2414709dB2.LIZ();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                InterfaceC2414709dB interfaceC2414709dB2 = interfaceC2414709dB;
                if (interfaceC2414709dB2 != null) {
                    interfaceC2414709dB2.onStart();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String strLIZIZ;
                super.onSuccessed(downloadInfo);
                InterfaceC2414709dB interfaceC2414709dB2 = interfaceC2414709dB;
                if (interfaceC2414709dB2 != null) {
                    if (downloadInfo != null) {
                        downloadInfo.getUrl();
                    }
                    this.getClass();
                    if (downloadInfo == null) {
                        strLIZIZ = "";
                    } else {
                        String savePath = downloadInfo.getSavePath();
                        if (savePath != null && u.LJIIZILJ(savePath, "/", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(downloadInfo.getSavePath());
                            sbLIZ.append(downloadInfo.getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(downloadInfo.getSavePath());
                            sbLIZ2.append(File.separator);
                            sbLIZ2.append(downloadInfo.getName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                    interfaceC2414709dB2.onSuccess(strLIZIZ);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                InterfaceC2414709dB interfaceC2414709dB2 = interfaceC2414709dB;
                if (interfaceC2414709dB2 != null) {
                    if (baseException != null) {
                        baseException.getErrorMessage();
                        baseException.getErrorCode();
                    }
                    interfaceC2414709dB2.onFailed();
                }
            }
        });
        downloadTaskWith.download();
    }
}
