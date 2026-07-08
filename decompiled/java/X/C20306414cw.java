package X;

import android.util.Log;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20306414cw extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onCanceled$0(this, downloadInfo);
                break;
            case 1:
                onCanceled$1(this, downloadInfo);
                break;
            default:
                super.onCanceled(downloadInfo);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, downloadInfo, baseException);
                break;
            case 1:
                onFailed$1(this, downloadInfo, baseException);
                break;
            case 2:
                onFailed$2(this, downloadInfo, baseException);
                break;
            default:
                super.onFailed(downloadInfo, baseException);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        if (1 - this.$t != 0) {
            super.onPause(downloadInfo);
        } else {
            onPause$0(this, downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, downloadInfo);
                break;
            case 1:
            default:
                super.onProgress(downloadInfo);
                break;
            case 2:
                super.onProgress(downloadInfo);
                break;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onStart$0(this, downloadInfo);
                break;
            case 1:
                onStart$1(this, downloadInfo);
                break;
            case 2:
                super.onStart(downloadInfo);
                break;
            default:
                super.onStart(downloadInfo);
                break;
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
            case 2:
                onSuccessed$2(this, downloadInfo);
                break;
            default:
                super.onSuccessed(downloadInfo);
                break;
        }
    }

    public C20306414cw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCanceled$0(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        InterfaceC20019613Us interfaceC20019613Us = ((C20019813Uu) c20306414cw.l0).LIZJ;
        if (interfaceC20019613Us != null) {
            interfaceC20019613Us.LJ();
        }
    }

    public static final void onCanceled$1(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        ((C201987141p) c20306414cw.l0).getClass();
        CountDownLatch countDownLatch = ((C201987141p) c20306414cw.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C201987141p c201987141p = (C201987141p) c20306414cw.l0;
        C201989141r c201989141r = c201987141p.LJI;
        if (c201989141r != null) {
            c201989141r.LIZJ(c201987141p.LIZIZ, c201987141p);
        }
    }

    public static final void onPause$0(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        CountDownLatch countDownLatch = ((C201987141p) c20306414cw.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static final void onProgress$0(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            C20019813Uu c20019813Uu = (C20019813Uu) c20306414cw.l0;
            if (downloadInfo.getTotalBytes() <= 0) {
                return;
            }
            int curBytes = (int) ((downloadInfo.getCurBytes() * ((long) 100)) / downloadInfo.getTotalBytes());
            InterfaceC20019613Us interfaceC20019613Us = c20019813Uu.LIZJ;
            if (interfaceC20019613Us != null) {
                interfaceC20019613Us.LIZLLL();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReuseAudioFetcher onProgress : ");
            sbLIZ.append(curBytes);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void onStart$0(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        InterfaceC20019613Us interfaceC20019613Us = ((C20019813Uu) c20306414cw.l0).LIZJ;
        if (interfaceC20019613Us != null) {
            interfaceC20019613Us.LIZ();
        }
    }

    public static final void onStart$1(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C201987141p c201987141p = (C201987141p) c20306414cw.l0;
        C201989141r c201989141r = c201987141p.LJI;
        if (c201989141r != null) {
            String str = c201987141p.LIZIZ;
            if (c201987141p instanceof C143W) {
                c201989141r.LIZ.put(str, c201987141p);
            } else {
                c201989141r.LIZIZ.put(str, c201987141p);
            }
        }
        ((C201987141p) c20306414cw.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Music Beat start time: ");
        sbLIZ.append(System.currentTimeMillis());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccessed$0(X.C20306414cw r3, com.ss.android.socialbase.downloader.model.DownloadInfo r4) {
        /*
            super.onSuccessed(r4)
            java.lang.Object r2 = r3.l0
            X.13Uu r2 = (X.C20019813Uu) r2
            if (r4 == 0) goto L21
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r4.getSavePath()
            r1.append(r0)
            java.lang.String r0 = r4.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            r2.LIZLLL = r0
            java.lang.Object r0 = r3.l0
            X.13Uu r0 = (X.C20019813Uu) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LJ
            if (r2 == 0) goto L36
            X.13Us r1 = r0.LIZJ
            if (r1 == 0) goto L36
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.LJFF
            r1.LJI(r2, r0)
        L36:
            java.lang.Object r0 = r3.l0
            X.13Uu r0 = (X.C20019813Uu) r0
            X.13Us r1 = r0.LIZJ
            if (r1 == 0) goto L43
            java.lang.String r0 = r0.LIZLLL
            r1.LJFF(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20306414cw.onSuccessed$0(X.14cw, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static final void onSuccessed$1(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        Long lValueOf;
        super.onSuccessed(downloadInfo);
        ((C201987141p) c20306414cw.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Music Beat success time: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" duration: ");
        if (downloadInfo != null) {
            lValueOf = Long.valueOf(downloadInfo.getDownloadTime());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        CountDownLatch countDownLatch = ((C201987141p) c20306414cw.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C201987141p c201987141p = (C201987141p) c20306414cw.l0;
        C201989141r c201989141r = c201987141p.LJI;
        if (c201989141r != null) {
            c201989141r.LIZJ(c201987141p.LIZIZ, c201987141p);
        }
    }

    public static final void onSuccessed$2(C20306414cw c20306414cw, DownloadInfo downloadInfo) {
        String strLIZIZ;
        super.onSuccessed(downloadInfo);
        ForwardMediaDownloader.DownloadListener downloadListener = (ForwardMediaDownloader.DownloadListener) c20306414cw.l0;
        if (downloadListener != null) {
            C201973141b.LIZ.getClass();
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
            downloadListener.onSuccess(strLIZIZ);
        }
    }

    public static final void onFailed$0(C20306414cw c20306414cw, DownloadInfo downloadInfo, BaseException baseException) {
        String stackTraceString;
        super.onFailed(downloadInfo, baseException);
        InterfaceC20019613Us interfaceC20019613Us = ((C20019813Uu) c20306414cw.l0).LIZJ;
        if (interfaceC20019613Us != null) {
            interfaceC20019613Us.LIZJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReuseAudioFetcher onFailed : ");
        if (baseException != null) {
            stackTraceString = Log.getStackTraceString(baseException);
        } else {
            stackTraceString = null;
        }
        sbLIZ.append(stackTraceString);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFailed$1(C20306414cw c20306414cw, DownloadInfo downloadInfo, BaseException baseException) {
        String connectionUrl;
        super.onFailed(downloadInfo, baseException);
        ((C201987141p) c20306414cw.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Music Beat beat url fail, cur url: ");
        Integer numValueOf = null;
        if (downloadInfo != null) {
            connectionUrl = downloadInfo.getConnectionUrl();
        } else {
            connectionUrl = null;
        }
        sbLIZ.append(connectionUrl);
        sbLIZ.append(",retry url index: ");
        if (downloadInfo != null) {
            numValueOf = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        CountDownLatch countDownLatch = ((C201987141p) c20306414cw.l0).LIZJ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C201987141p c201987141p = (C201987141p) c20306414cw.l0;
        C201989141r c201989141r = c201987141p.LJI;
        if (c201989141r != null) {
            c201989141r.LIZJ(c201987141p.LIZIZ, c201987141p);
        }
    }

    public static final void onFailed$2(C20306414cw c20306414cw, DownloadInfo downloadInfo, BaseException baseException) {
        int errorCode;
        String errorMessage;
        super.onFailed(downloadInfo, baseException);
        ForwardMediaDownloader.DownloadListener downloadListener = (ForwardMediaDownloader.DownloadListener) c20306414cw.l0;
        if (downloadListener != null) {
            if (baseException != null) {
                errorCode = baseException.getErrorCode();
            } else {
                errorCode = -1;
            }
            if (baseException != null) {
                errorMessage = baseException.getErrorMessage();
            } else {
                errorMessage = null;
            }
            ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(downloadListener, errorCode, errorMessage, baseException, null, 8, null);
        }
    }
}
