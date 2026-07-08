package X;

import com.bytedance.keva.Keva;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445750nj3 {
    public static AbstractC2199801B7q LIZIZ;
    public static Function1<? super Boolean, Unit> LIZJ;
    public static Function0<Unit> LIZLLL;
    public static Function1<? super DownloadInfo, Unit> LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static Function1<? super String, Unit> LJIIIIZZ;
    public static final C1445750nj3 LIZ = new C1445750nj3();
    public static final Keva LJII = Keva.getRepo("repo_edit_post_local_video");
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1223));
    public static final C1445620niq LJIIJ = new AbsDownloadListener() { // from class: X.0niq
        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String targetFilePath;
            super.onSuccessed(downloadInfo);
            Function1<? super String, Unit> function1 = C1445750nj3.LJIIIIZZ;
            if (function1 != null) {
                if (downloadInfo != null) {
                    targetFilePath = downloadInfo.getTargetFilePath();
                } else {
                    targetFilePath = null;
                }
                function1.invoke(targetFilePath);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            Function1<? super String, Unit> function1 = C1445750nj3.LJIIIIZZ;
            if (function1 != null) {
                function1.invoke("");
            }
        }
    };
    public static final C1445430niX LJIIJJI = new AbsDownloadListener() { // from class: X.0niX
        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            C1445750nj3.LJFF = false;
            C1445750nj3.LJI = false;
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            C1445750nj3.LJFF = true;
            Function1<? super DownloadInfo, Unit> function1 = C1445750nj3.LJ;
            if (function1 != null) {
                function1.invoke(downloadInfo);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            C1445750nj3.LJFF = false;
            C1445750nj3.LJI = false;
            C1637890six.LJ("edit_post_download_video_error_rate", 0, new JSONObject());
            Function1<? super Boolean, Unit> function1 = C1445750nj3.LIZJ;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
            int errorCode;
            String errorMessage;
            C1445750nj3.LJFF = false;
            C1445750nj3.LJI = false;
            C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
            if (baseException == null) {
                errorCode = 1149;
            } else if (baseException.getErrorCode() != 0) {
                errorCode = baseException.getErrorCode();
            } else {
                errorCode = 1148;
            }
            JSONObject jSONObject = new JSONObject();
            if (baseException == null || (errorMessage = baseException.getErrorMessage()) == null) {
                errorMessage = "";
            }
            jSONObject.put("error_msg", errorMessage);
            C1637890six.LJ("edit_post_download_video_error_rate", errorCode, jSONObject);
            Function0<Unit> function0 = C1445750nj3.LIZLLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    };

    public static void LIZ(String str, String str2, String str3) {
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = str3;
        abstractC2199801B7qWith.LJFF = true;
        abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("edit_post", "video")));
        abstractC2199801B7qWith.LJ = str2;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIIJJI = LJIIJJI;
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIIJ = "edit_post";
        LIZIZ = abstractC2199801B7qWith;
        if (!LJI) {
            LJI = true;
            abstractC2199801B7qWith.LIZJ();
        }
    }

    public static void LIZIZ(SimVideoUrlModel simVideoUrlModel, final String str, final String str2, final String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(File.separator);
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C013C c013c = new C013C();
        if (simVideoUrlModel != null) {
            C1483340ohg.LJIIL(simVideoUrlModel, strLIZIZ, false, false, new InterfaceC1475840oVa() { // from class: X.0nj7
                @Override // X.InterfaceC1475840oVa
                public final /* synthetic */ void LIZ(long j, long j2) {
                }

                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
                    C1445750nj3.LIZ(str, str2, str3);
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z, int i, String str4) {
                    Function1<? super Boolean, Unit> function1;
                    if (z) {
                        if (!c013c.element && (function1 = C1445750nj3.LIZJ) != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                        c013c.element = true;
                        return;
                    }
                    C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
                    C1445750nj3.LIZ(str, str2, str3);
                }
            });
        } else {
            LIZ(str, str2, str3);
        }
    }
}
