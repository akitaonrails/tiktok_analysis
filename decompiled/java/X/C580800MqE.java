package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580800MqE extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, downloadInfo, baseException);
                break;
            case 1:
                onFailed$1(this, downloadInfo, baseException);
                break;
            default:
                super.onFailed(downloadInfo, baseException);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, downloadInfo);
                break;
            case 1:
                onProgress$1(this, downloadInfo);
                break;
            default:
                super.onProgress(downloadInfo);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        if (1 - this.$t != 0) {
            super.onStart(downloadInfo);
        } else {
            onStart$0(this, downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onSuccessed$0(this, downloadInfo);
                break;
            case 1:
                onSuccessed$1(this, downloadInfo);
                break;
            default:
                super.onSuccessed(downloadInfo);
                break;
        }
    }

    public C580800MqE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onProgress$0(C580800MqE c580800MqE, DownloadInfo downloadInfo) {
        int downloadProcess;
        super.onProgress(downloadInfo);
        AbstractC580490Mpj abstractC580490Mpj = (AbstractC580490Mpj) c580800MqE.l0;
        if (abstractC580490Mpj != null) {
            if (downloadInfo != null) {
                downloadProcess = downloadInfo.getDownloadProcess();
                downloadInfo.getCurBytes();
                downloadInfo.getTotalBytes();
            } else {
                downloadProcess = 0;
            }
            abstractC580490Mpj.LIZIZ(downloadProcess);
        }
    }

    public static final void onProgress$1(C580800MqE c580800MqE, DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            downloadInfo.getCurBytes();
            downloadInfo.getTotalBytes();
        }
        InterfaceC534600Kxu interfaceC534600Kxu = (InterfaceC534600Kxu) c580800MqE.l0;
        if (interfaceC534600Kxu != null) {
            interfaceC534600Kxu.LIZ();
        }
    }

    public static final void onStart$0(C580800MqE c580800MqE, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        InterfaceC534600Kxu interfaceC534600Kxu = (InterfaceC534600Kxu) c580800MqE.l0;
        if (interfaceC534600Kxu != null) {
            interfaceC534600Kxu.onStart();
        }
    }

    public static final void onSuccessed$0(C580800MqE c580800MqE, DownloadInfo downloadInfo) {
        String strLIZIZ;
        super.onSuccessed(downloadInfo);
        AbstractC580490Mpj abstractC580490Mpj = (AbstractC580490Mpj) c580800MqE.l0;
        if (abstractC580490Mpj != null) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
            ShareFromWebHelper.LIZ.getClass();
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
            abstractC580490Mpj.LIZJ(strLIZIZ);
        }
    }

    public static final void onSuccessed$1(C580800MqE c580800MqE, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        InterfaceC534600Kxu interfaceC534600Kxu = (InterfaceC534600Kxu) c580800MqE.l0;
        if (interfaceC534600Kxu != null) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
            interfaceC534600Kxu.onSuccess(C2248808rW.LIZ(downloadInfo));
        }
    }

    public static final void onFailed$0(C580800MqE c580800MqE, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        AbstractC580490Mpj abstractC580490Mpj = (AbstractC580490Mpj) c580800MqE.l0;
        if (abstractC580490Mpj != null) {
            if (baseException != null) {
                baseException.getErrorMessage();
                baseException.getErrorCode();
            }
            abstractC580490Mpj.LIZ();
        }
    }

    public static final void onFailed$1(C580800MqE c580800MqE, DownloadInfo downloadInfo, BaseException baseException) {
        String errorMessage;
        super.onFailed(downloadInfo, baseException);
        InterfaceC534600Kxu interfaceC534600Kxu = (InterfaceC534600Kxu) c580800MqE.l0;
        if (interfaceC534600Kxu != null) {
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
                baseException.getErrorCode();
            } else {
                errorMessage = null;
            }
            interfaceC534600Kxu.onFailed(errorMessage);
        }
    }
}
