package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20012913Sd {
    public static final C20012913Sd LIZ = new C20012913Sd();

    public static void LIZ(Context context) {
        try {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "ai_avatar_images");
            if (c0vsj.exists()) {
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("deleting file: ");
                        sbLIZ.append(file.getName());
                        C2188811AlT.LIZIZ(sbLIZ);
                        file.delete();
                    }
                } else {
                    int i2 = C2187451AjH.LIZ;
                }
                c0vsj.delete();
                return;
            }
            int i3 = C2187451AjH.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("delete temp file failed, error: ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static Uri LIZJ(Context context, String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "ai_avatar_images");
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (u.LJJIIJZLJL(file.getName(), str, false)) {
                    int i = C2187451AjH.LIZ;
                    return Uri.fromFile(file);
                }
            }
        }
        return null;
    }

    public static void LIZIZ(final String str, final Context context, final InterfaceC20013113Sf interfaceC20013113Sf) {
        interfaceC20013113Sf.LIZIZ();
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "ai_avatar_images");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        final String strSubstring = a0.LJJJJJL('0', 64, new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8))).toString(16)).substring(0, 16);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file name: ");
        sbLIZ.append(strSubstring);
        C2188811AlT.LIZIZ(sbLIZ);
        Uri uriLIZJ = LIZJ(context, strSubstring);
        if (uriLIZJ != null) {
            interfaceC20013113Sf.LIZ(uriLIZJ, str);
            return;
        }
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = strSubstring;
        abstractC2199801B7qWith.LJII = downloadServiceManager.getRetryExpCount();
        abstractC2199801B7qWith.LJ = c0vsj.getPath();
        abstractC2199801B7qWith.LJIIL = new IDownloadListener() { // from class: X.13Se
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstStart(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFirstSuccess(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onPrepare(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download canceled, entity: ");
                sbLIZ2.append(downloadInfo);
                C2188811AlT.LIZIZ(sbLIZ2);
                interfaceC20013113Sf.LIZJ(str);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                interfaceC20013113Sf.LIZIZ();
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download listener, onSuccessed, entity: ");
                sbLIZ2.append(downloadInfo);
                C2188811AlT.LIZIZ(sbLIZ2);
                InterfaceC20013113Sf interfaceC20013113Sf2 = interfaceC20013113Sf;
                String str2 = str;
                C20012913Sd c20012913Sd = C20012913Sd.LIZ;
                String str3 = strSubstring;
                Context context2 = context;
                c20012913Sd.getClass();
                interfaceC20013113Sf2.LIZ(C20012913Sd.LIZJ(context2, str3), str2);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download failed, entity: ");
                sbLIZ2.append(downloadInfo);
                sbLIZ2.append(", e: ");
                sbLIZ2.append(baseException);
                C2188811AlT.LIZIZ(sbLIZ2);
                interfaceC20013113Sf.LIZJ(str);
            }
        };
        abstractC2199801B7qWith.LIZJ();
    }
}
