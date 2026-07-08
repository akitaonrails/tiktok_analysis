package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2499809qu extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 5:
                onCanceled$0(this, downloadInfo);
                break;
            case 6:
            case 7:
            default:
                super.onCanceled(downloadInfo);
                break;
            case 8:
                onCanceled$1(this, downloadInfo);
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
            case 3:
                onFailed$3(this, downloadInfo, baseException);
                break;
            case 4:
                onFailed$4(this, downloadInfo, baseException);
                break;
            case 5:
                onFailed$5(this, downloadInfo, baseException);
                break;
            case 6:
                onFailed$6(this, downloadInfo, baseException);
                break;
            case 7:
                onFailed$7(this, downloadInfo, baseException);
                break;
            case 8:
                onFailed$8(this, downloadInfo, baseException);
                break;
            default:
                super.onFailed(downloadInfo, baseException);
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
            case 3:
                onSuccessed$3(this, downloadInfo);
                break;
            case 4:
                onSuccessed$4(this, downloadInfo);
                break;
            case 5:
                onSuccessed$5(this, downloadInfo);
                break;
            case 6:
                onSuccessed$6(this, downloadInfo);
                break;
            case 7:
                onSuccessed$7(this, downloadInfo);
                break;
            case 8:
                onSuccessed$8(this, downloadInfo);
                break;
            default:
                super.onSuccessed(downloadInfo);
                break;
        }
    }

    public C2499809qu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCanceled$0(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$1(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        C2249008rY c2249008rY = new C2249008rY(3);
        C189200o6.m2constructorimpl(c2249008rY);
        interfaceC20236714Gf.resumeWith(c2249008rY);
    }

    public static final void onSuccessed$0(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) c2499809qu.l0;
            if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(downloadInfo.getSavePath());
                sbLIZ.append(downloadInfo.getName());
                interfaceC2329309At.onSuccess(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(downloadInfo.getSavePath());
            sbLIZ2.append('/');
            sbLIZ2.append(downloadInfo.getName());
            interfaceC2329309At.onSuccess(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        ((InterfaceC2329309At) c2499809qu.l0).onSuccess("");
    }

    public static final void onSuccessed$1(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) c2499809qu.l0;
            if (u.LJIIZILJ(downloadInfo.getSavePath(), "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(downloadInfo.getSavePath());
                sbLIZ.append(downloadInfo.getName());
                interfaceC2329309At.onSuccess(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(downloadInfo.getSavePath());
            sbLIZ2.append('/');
            sbLIZ2.append(downloadInfo.getName());
            interfaceC2329309At.onSuccess(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        ((InterfaceC2329309At) c2499809qu.l0).onSuccess("");
    }

    public static final void onSuccessed$2(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        String savePath;
        super.onSuccessed(downloadInfo);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String name = null;
        if (downloadInfo != null) {
            savePath = downloadInfo.getSavePath();
        } else {
            savePath = null;
        }
        sbLIZ.append(savePath);
        if (downloadInfo != null) {
            name = downloadInfo.getName();
        }
        sbLIZ.append(name);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499809qu.l0;
        C189200o6.m2constructorimpl(strLIZIZ);
        interfaceC1364105Vn.resumeWith(strLIZIZ);
    }

    public static final void onSuccessed$3(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccessed: ");
        sbLIZ.append(downloadInfo);
        C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
        ((AbsDownloadListener) c2499809qu.l0).onSuccessed(downloadInfo);
    }

    public static final void onSuccessed$4(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        C189200o6.m2constructorimpl(downloadInfo);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(downloadInfo);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC20236714Gf.resumeWith(c189200o6M1boximpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccessed$5(X.C2499809qu r2, com.ss.android.socialbase.downloader.model.DownloadInfo r3) {
        /*
            java.lang.Object r2 = r2.l0
            X.14Gf r2 = (X.InterfaceC20236714Gf) r2
            if (r3 == 0) goto L23
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.getSavePath()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r3.getName()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L25
        L23:
            java.lang.String r0 = ""
        L25:
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2499809qu.onSuccessed$5(X.09qu, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static final void onSuccessed$6(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        String strLIZ = C2248808rW.LIZ(downloadInfo);
        if (strLIZ.length() > 0) {
            ((InterfaceC2329309At) c2499809qu.l0).onSuccess(strLIZ);
        } else {
            ((InterfaceC2329309At) c2499809qu.l0).onError(new Exception("Failed to get file path"));
        }
    }

    public static final void onSuccessed$7(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499809qu.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void onSuccessed$8(C2499809qu c2499809qu, DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(downloadInfo.getSavePath());
            sbLIZ.append(File.separator);
            sbLIZ.append(downloadInfo.getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
            C2249008rY c2249008rY = new C2249008rY(1, strLIZIZ);
            C189200o6.m2constructorimpl(c2249008rY);
            interfaceC20236714Gf.resumeWith(c2249008rY);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c2499809qu.l0;
        C2249008rY c2249008rY2 = new C2249008rY(2);
        C189200o6.m2constructorimpl(c2249008rY2);
        interfaceC20236714Gf2.resumeWith(c2249008rY2);
    }

    public static final void onFailed$0(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        ((InterfaceC2329309At) c2499809qu.l0).onSuccess("");
    }

    public static final void onFailed$1(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        ((InterfaceC2329309At) c2499809qu.l0).onSuccess("");
    }

    public static final void onFailed$2(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499809qu.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$3(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        String url;
        Throwable runtimeException;
        super.onFailed(downloadInfo, baseException);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed: ");
        if (downloadInfo != null) {
            url = downloadInfo.getUrl();
        } else {
            url = null;
        }
        sbLIZ.append(url);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (baseException != null) {
            runtimeException = baseException;
        } else {
            runtimeException = new RuntimeException();
        }
        C201955140j.LJIIIZ(c1398350mUb, "msg-log", strLIZIZ, runtimeException);
        ((AbsDownloadListener) c2499809qu.l0).onFailed(downloadInfo, baseException);
    }

    public static final void onFailed$4(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        Throwable runtimeException = baseException;
        if (baseException == null) {
            runtimeException = new RuntimeException("download failed");
        }
        C098200Yq c098200Yq = new C098200Yq(runtimeException);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC20236714Gf.resumeWith(c189200o6M1boximpl);
    }

    public static final void onFailed$5(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$6(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        InterfaceC2329309At interfaceC2329309At = (InterfaceC2329309At) c2499809qu.l0;
        Exception exc = baseException;
        if (baseException == null) {
            exc = new Exception("Download failed");
        }
        interfaceC2329309At.onError(exc);
    }

    public static final void onFailed$7(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2499809qu.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void onFailed$8(C2499809qu c2499809qu, DownloadInfo downloadInfo, BaseException baseException) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2499809qu.l0;
        C2249008rY c2249008rY = new C2249008rY(2);
        C189200o6.m2constructorimpl(c2249008rY);
        interfaceC20236714Gf.resumeWith(c2249008rY);
    }
}
