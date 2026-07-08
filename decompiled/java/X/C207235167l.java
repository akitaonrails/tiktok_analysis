package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import org.json.JSONException;

/* JADX INFO: renamed from: X.167l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207235167l extends AbsDownloadListener implements C0U3O {
    public final C207209166l LL;
    public Function1<? super DownloadInfo, Unit> LLILLJJLI;
    public Function1<? super DownloadInfo, Unit> LLILLL;
    public Function2<? super DownloadInfo, ? super BaseException, Unit> LLILZ;
    public Function1<? super DownloadInfo, Unit> LLILZIL;
    public Function1<? super DownloadInfo, Unit> LLILZLL;
    public Function1<? super DownloadInfo, Unit> LLIZ;
    public volatile long LLIZLLLIL;
    public volatile long LLJ;

    public final void LJI() {
        this.LLJ += System.currentTimeMillis() - this.LLIZLLLIL;
    }

    public C207235167l(C207209166l c207209166l) {
        this.LL = c207209166l;
    }

    @Override // X.C0U3O
    public final void LIZ(AFwS245S0000000_12 aFwS245S0000000_12) {
        this.LLIZ = aFwS245S0000000_12;
    }

    @Override // X.C0U3O
    public final void LIZIZ(Function2<? super DownloadInfo, ? super BaseException, Unit> function2) {
        this.LLILZ = function2;
    }

    @Override // X.C0U3O
    public final void LIZJ(Function1<? super DownloadInfo, Unit> function1) {
        this.LLILZIL = function1;
    }

    @Override // X.C0U3O
    public final void LIZLLL(Function1<? super DownloadInfo, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    @Override // X.C0U3O
    public final void LJ(Function1<? super DownloadInfo, Unit> function1) {
        this.LLILZLL = function1;
    }

    @Override // X.C0U3O
    public final void LJFF(Function1<? super DownloadInfo, Unit> function1) {
        this.LLILLL = function1;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) throws JSONException {
        super.onCanceled(downloadInfo);
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancel file=");
        sbLIZ.append(this.LL);
        C0UND.LIZ("FileDownloadListener#onCanceled", C2188811AlT.LIZIZ(sbLIZ));
        C176600m4.LIZLLL(new AwS432S0200000_31(this, downloadInfo, 89), this.LL.LJIIL);
        LJI();
        C207211166n c207211166nLIZ = C207208166k.LIZ(this.LL);
        if (c207211166nLIZ != null) {
            c207211166nLIZ.LIZJ.put("duration", this.LLJ);
            c207211166nLIZ.LIZIZ.put("file_status", 2);
            C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ.LIZIZ, c207211166nLIZ.LIZJ, c207211166nLIZ.LIZLLL);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancel file=");
        sbLIZ.append(this.LL);
        C0UND.LIZ("FileDownloadListener#onCanceled", C2188811AlT.LIZIZ(sbLIZ));
        C176600m4.LIZLLL(new AwS432S0200000_31(this, downloadInfo, 90), this.LL.LJIIL);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        C176600m4.LIZLLL(new AwS432S0200000_31(this, downloadInfo, 91), this.LL.LJIIL);
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgress=");
        sbLIZ.append(downloadInfo);
        sbLIZ.append(" file=");
        sbLIZ.append(this.LL);
        C0UND.LIZ("FileDownloadListener#onProgress", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        C176600m4.LIZLLL(new AwS432S0200000_31(this, downloadInfo, 92), this.LL.LJIIL);
        this.LLIZLLLIL = System.currentTimeMillis();
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start file=");
        sbLIZ.append(this.LL);
        C0UND.LIZ("FileDownloadListener#onStart", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) throws JSONException {
        boolean z;
        super.onSuccessed(downloadInfo);
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success file=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C0UND.LIZ("FileDownloadListener#onSuccessed", C2188811AlT.LIZIZ(sbLIZ));
        C176600m4.LIZLLL(new AwS432S0200000_31(this, downloadInfo, 93), this.LL.LJIIL);
        LJI();
        C207211166n c207211166nLIZ = C207208166k.LIZ(this.LL);
        if (c207211166nLIZ != null) {
            c207211166nLIZ.LIZJ.put("duration", this.LLJ);
            c207211166nLIZ.LIZIZ.put("file_status", 0);
            C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ.LIZIZ, c207211166nLIZ.LIZJ, c207211166nLIZ.LIZLLL);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
        String message;
        int errorCode;
        String errorMessage;
        super.onFailed(downloadInfo, baseException);
        C0UND c0undLIZ = C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed file=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" exception=");
        if (baseException != null) {
            message = baseException.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0undLIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LiveFileService-");
        sbLIZ2.append("FileDownloadListener#onFailed");
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
        C176600m4.LIZLLL(new AwS275S0300000_31(this, downloadInfo, baseException, 31), this.LL.LJIIL);
        LJI();
        C207211166n c207211166nLIZ = C207208166k.LIZ(this.LL);
        if (c207211166nLIZ != null) {
            c207211166nLIZ.LIZJ.put("duration", this.LLJ);
            c207211166nLIZ.LIZIZ.put("file_status", 1);
            if (baseException != null) {
                errorCode = baseException.getErrorCode();
                errorMessage = baseException.getErrorMessage();
                if (errorMessage == null) {
                }
                c207211166nLIZ.LIZIZ.put("error_code", errorCode);
                c207211166nLIZ.LIZLLL.put("error_msg", errorMessage);
                C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ.LIZIZ, c207211166nLIZ.LIZJ, c207211166nLIZ.LIZLLL);
            }
            errorCode = -1;
            errorMessage = "";
            c207211166nLIZ.LIZIZ.put("error_code", errorCode);
            c207211166nLIZ.LIZLLL.put("error_msg", errorMessage);
            C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ.LIZIZ, c207211166nLIZ.LIZJ, c207211166nLIZ.LIZLLL);
        }
    }
}
