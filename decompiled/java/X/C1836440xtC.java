package X;

import android.net.Uri;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.highlight.LiveHighlightDownloaderSettingEnable;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836440xtC {
    public static String LIZ(String str, String str2) {
        String string;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('0');
                    sbLIZ2.append(hexString);
                    hexString = C2188811AlT.LIZIZ(sbLIZ2);
                }
                stringBuffer.append(hexString);
            }
            string = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getMD5String. exception. e=");
            sbLIZ3.append(e);
            C20441214yg.LJ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ3));
            string = null;
        }
        sbLIZ.append(string);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0xtE] */
    public static void LIZIZ(String str, final String str2, final String str3, final InterfaceC1836480xtG interfaceC1836480xtG) {
        C20441214yg.LJIIIZ("DownloadHighLightFileImpl", "internalDownloadHighLightVideo");
        C1811980xFk c1811980xFk = C1811980xFk.LIZ;
        final ?? r4 = new InterfaceC1836490xtH() { // from class: X.0xtE
            @Override // X.InterfaceC1836490xtH
            public final void onCanceled() {
                Map<String, Object> map = C1338270kvh.LIZ;
                try {
                    C497740JfY.LJII().getContentResolver().delete(UriProtector.parse(str2), null, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ("DownloadHighLightFileImpl", "delete cache failure");
                }
                interfaceC1836480xtG.LIZ(0, 2, "cancel by user");
            }

            @Override // X.InterfaceC1836490xtH
            public final void LIZ(BaseException baseException) {
                Map<String, Object> map = C1338270kvh.LIZ;
                interfaceC1836480xtG.LIZ(1, baseException.getErrorCode(), baseException.getErrorMessage());
            }

            @Override // X.InterfaceC1836490xtH
            public final void LIZIZ(DownloadInfo downloadInfo) {
                Map<String, Object> map = C1338270kvh.LIZ;
                interfaceC1836480xtG.LJJI(downloadInfo.getSavePath(), downloadInfo.getName());
            }

            public final void LIZJ(int i) {
                Map<String, Object> map = C1338270kvh.LIZ;
                interfaceC1836480xtG.LIZIZ(i);
            }

            @Override // X.InterfaceC1836490xtH
            public final void onProgress(DownloadInfo downloadInfo) {
                interfaceC1836480xtG.onProgress(downloadInfo);
            }
        };
        c1811980xFk.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadFile. fileName=");
        sbLIZ.append(str3);
        sbLIZ.append(", url=");
        sbLIZ.append(str);
        sbLIZ.append(", async=");
        sbLIZ.append(false);
        C20441214yg.LJIIIZ("FileDownloader", C2188811AlT.LIZIZ(sbLIZ));
        DownloadTask downloadTaskWith = C2200151B8z.with(C497740JfY.LJII());
        downloadTaskWith.url(str);
        downloadTaskWith.name(str3);
        downloadTaskWith.savePath(str2);
        downloadTaskWith.subThreadListener(new AbsDownloadListener(str3, str2, r4) { // from class: X.0xtF
            public final /* synthetic */ InterfaceC1836490xtH LL;

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                super.onCanceled(downloadInfo);
                Map<String, Object> map = C1338270kvh.LIZ;
                InterfaceC1836490xtH interfaceC1836490xtH = this.LL;
                if (interfaceC1836490xtH != null) {
                    interfaceC1836490xtH.onCanceled();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                Map<String, Object> map = C1338270kvh.LIZ;
                InterfaceC1836490xtH interfaceC1836490xtH = this.LL;
                if (interfaceC1836490xtH != null) {
                    interfaceC1836490xtH.onProgress(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                super.onSuccessed(downloadInfo);
                Map<String, Object> map = C1338270kvh.LIZ;
                InterfaceC1836490xtH interfaceC1836490xtH = this.LL;
                if (interfaceC1836490xtH != null) {
                    interfaceC1836490xtH.LIZIZ(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                Map<String, Object> map = C1338270kvh.LIZ;
                InterfaceC1836490xtH interfaceC1836490xtH = this.LL;
                if (interfaceC1836490xtH != null) {
                    interfaceC1836490xtH.LIZ(baseException);
                }
            }

            {
                this.LL = r4;
            }
        });
        if (LiveHighlightDownloaderSettingEnable.INSTANCE.enable()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("segment_config", new JSONObject());
                downloadTaskWith.downloadSetting(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            downloadTaskWith.retryCount(5);
        }
        r4.LIZJ(downloadTaskWith.download());
    }

    public final void LIZJ(final C19EG c19eg, final String str, String str2, String str3, final InterfaceC1836480xtG interfaceC1836480xtG) {
        final String name;
        String name2;
        String savePath;
        C1811980xFk.LIZ.getClass();
        final DownloadInfo downloadInfoLIZ = C1811980xFk.LIZ(str);
        if (downloadInfoLIZ == null) {
            name = LIZ(str3, str2);
        } else {
            name = downloadInfoLIZ.getName();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            DownloadInfo downloadInfoLIZ2 = C1811980xFk.LIZ(str);
            if (downloadInfoLIZ2 == null) {
                name2 = LIZ(str3, str2);
            } else {
                name2 = downloadInfoLIZ2.getName();
            }
            Uri uriLJIIIIZZ = C2400409as.LJIIIIZZ(c19eg, name2);
            if (C2400409as.LJIIIZ(c19eg, uriLJIIIIZZ)) {
                interfaceC1836480xtG.LJJI(uriLJIIIIZZ.toString(), name2);
                C20441214yg.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                return;
            }
            if (downloadInfoLIZ2 == null) {
                Uri uriLIZLLL = C2400409as.LIZLLL(c19eg, name2);
                if (uriLIZLLL != null) {
                    savePath = uriLIZLLL.toString();
                } else {
                    savePath = "";
                }
            } else {
                savePath = downloadInfoLIZ2.getSavePath();
            }
            LIZIZ(str, savePath, name2, interfaceC1836480xtG);
            return;
        }
        new C0UT9(c19eg, TokenCert.Companion.with("bpea-mobile_highlight_store_video")).LIZ(new C142V() { // from class: X.0xtD
            @Override // X.C142V
            public final void LIZ(String... strArr) {
                StringBuilder sb = new StringBuilder();
                for (String str4 : strArr) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(' ');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPermissionDenied: ");
                sbLIZ2.append((Object) sb);
                C20441214yg.LJ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1836480xtG interfaceC1836480xtG2 = interfaceC1836480xtG;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((Object) sb);
                sbLIZ3.append(" deny");
                interfaceC1836480xtG2.LIZ(0, 1, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // X.C142V
            public final void LIZIZ(String... strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPermissionReqStart: ");
                sbLIZ.append(strArr);
                C20441214yg.LIZIZ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ));
                Arrays.copyOf(strArr, strArr.length);
            }

            @Override // X.C142V
            public final void LIZJ(String... strArr) throws Throwable {
                String savePath2;
                Uri uriLJIIIIZZ2 = C2400409as.LJIIIIZZ(c19eg, name);
                if (C2400409as.LJIIIZ(c19eg, uriLJIIIIZZ2)) {
                    interfaceC1836480xtG.LJJI(uriLJIIIIZZ2.toString(), name);
                    C20441214yg.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                    return;
                }
                DownloadInfo downloadInfo = downloadInfoLIZ;
                if (downloadInfo == null) {
                    C1836440xtC c1836440xtC = this;
                    C19EG c19eg2 = c19eg;
                    String str4 = name;
                    c1836440xtC.getClass();
                    Uri uriLIZLLL2 = C2400409as.LIZLLL(c19eg2, str4);
                    if (uriLIZLLL2 != null) {
                        savePath2 = uriLIZLLL2.toString();
                    } else {
                        savePath2 = "";
                    }
                } else {
                    savePath2 = downloadInfo.getSavePath();
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                C1836440xtC c1836440xtC2 = this;
                String str5 = str;
                String str6 = name;
                InterfaceC1836480xtG interfaceC1836480xtG2 = interfaceC1836480xtG;
                c1836440xtC2.getClass();
                C1836440xtC.LIZIZ(str5, savePath2, str6, interfaceC1836480xtG2);
            }

            @Override // X.C142V
            public final void LIZLLL(String... strArr) {
                StringBuilder sb = new StringBuilder();
                for (String str4 : strArr) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(' ');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPermissionDeniedWithReason: ");
                sbLIZ2.append((Object) sb);
                C20441214yg.LIZIZ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC1836480xtG interfaceC1836480xtG2 = interfaceC1836480xtG;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((Object) sb);
                sbLIZ3.append(" deny");
                interfaceC1836480xtG2.LIZ(0, 1, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // X.C142V
            public final void LJFF(String... strArr) throws Throwable {
                boolean z;
                boolean z2;
                if (C838410Wul.LIZ(c19eg, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (C838410Wul.LIZ(c19eg, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPermissionGoSettingConfirm. readPermission=");
                sbLIZ.append(z);
                sbLIZ.append(", writePermission=");
                sbLIZ.append(z2);
                C20441214yg.LIZIZ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ));
                if (z && z2) {
                    Uri uriLJIIIIZZ2 = C2400409as.LJIIIIZZ(c19eg, name);
                    if (C2400409as.LJIIIZ(c19eg, uriLJIIIIZZ2)) {
                        interfaceC1836480xtG.LJJI(uriLJIIIIZZ2.toString(), name);
                        C20441214yg.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (String str4 : strArr) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str4);
                    sbLIZ2.append(' ');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                InterfaceC1836480xtG interfaceC1836480xtG2 = interfaceC1836480xtG;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((Object) sb);
                sbLIZ3.append(" deny");
                interfaceC1836480xtG2.LIZ(0, 1, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // X.C142V
            public final void LJ(String str4, String... strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPermissionDeniedWithReason: ");
                sbLIZ.append(strArr);
                sbLIZ.append(", reason=");
                sbLIZ.append(str4);
                C20441214yg.LIZIZ("DownloadHighLightFileImpl", C2188811AlT.LIZIZ(sbLIZ));
                Arrays.copyOf(strArr, strArr.length);
            }
        }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
