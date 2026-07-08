package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20101413ky {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final C01GW LIZ;
    public final C1D1X LIZIZ;
    public final Map<String, Long> LIZJ;
    public final C01GW LIZLLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C20101413ky.class, "copySourceFilePath", "getCopySourceFilePath()Ljava/lang/String;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public C20101413ky() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZ = C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(258));
        this.LIZIZ = new C1D1X("im_alert_tone_info", "copy_source_file_path", "");
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, AFwS189S0000000_3.get$arr$(1173));
    }

    public static String LIZJ(String str) {
        String lastPathSegment = UriProtector.parse(str).getLastPathSegment();
        if (lastPathSegment == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.hashCode());
            sbLIZ.append(".mp3");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return lastPathSegment;
    }

    public final String LIZLLL(String str) {
        return new C0VSJ((String) this.LIZLLL.getValue(), LIZJ(str)).getAbsolutePath();
    }

    public final boolean LJ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return false;
        }
        C1D1X c1d1x = this.LIZIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJ;
        if (Intrinsics.LJFF(str, c1d1x.getValue(this, interfaceC2217461BqaArr[0]))) {
            return true;
        }
        try {
            C08QA.LJIILLIIL(c0vsj, new C0VSJ(new C0VSJ((String) this.LIZLLL.getValue(), "Custom Tone").getAbsolutePath()), true, 4);
            this.LIZIZ.setValue(this, interfaceC2217461BqaArr[0], str);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceCustomToneFileWith() called: e = ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
    }

    public final void LIZ(long j, final String str, final String str2, final boolean z) {
        final String strLIZLLL = LIZLLL(str);
        String strLIZ = C815620Vz6.LIZ(new C0VSJ(strLIZLLL));
        Keva keva = (Keva) this.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url_to_md5_");
        sbLIZ.append(str);
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
        if (strLIZ.length() > 0 && Intrinsics.LJFF(string, strLIZ)) {
            return;
        }
        Long l = (Long) ((LinkedHashMap) this.LIZJ).get(str);
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (0 <= jCurrentTimeMillis && jCurrentTimeMillis <= j) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadToneIfNeeded() called: try too frequently, url = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", interval = ");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append("ms < ");
                sbLIZ2.append(j);
                sbLIZ2.append("ms");
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
        }
        this.LIZJ.put(str, Long.valueOf(System.currentTimeMillis()));
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LJ = (String) this.LIZLLL.getValue();
        abstractC2199801B7qWith.LIZJ = LIZJ(str);
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.13l0
            public final void LJI(DownloadInfo downloadInfo) {
                String httpStatusMessage;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                Pair[] pairArr = new Pair[6];
                int httpStatusCode = 0;
                pairArr[0] = new Pair("resource_type", str2);
                pairArr[1] = new Pair("resource_url", str);
                if (downloadInfo != null) {
                    httpStatusCode = downloadInfo.getHttpStatusCode();
                }
                pairArr[2] = new Pair("status_code", String.valueOf(httpStatusCode));
                if (downloadInfo == null || (httpStatusMessage = downloadInfo.getHttpStatusMessage()) == null) {
                    httpStatusMessage = "";
                }
                pairArr[3] = new Pair("status_msg", httpStatusMessage);
                pairArr[4] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                pairArr[5] = new Pair("is_retry", String.valueOf(z ? 1 : 0));
                interfaceC1493505szLIZIZ.sendEvent("alert_tone_resource_download", C2097608Jq.LJIIIIZZ(pairArr));
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String strLIZ2;
                super.onSuccessed(downloadInfo);
                if (downloadInfo == null || (strLIZ2 = downloadInfo.getMd5()) == null) {
                    strLIZ2 = C815620Vz6.LIZ(new C0VSJ(strLIZLLL));
                }
                C20101413ky c20101413ky = this;
                String str3 = str;
                Keva keva2 = (Keva) c20101413ky.LIZ.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("url_to_md5_");
                sbLIZ3.append(str3);
                keva2.storeString(C2188811AlT.LIZIZ(sbLIZ3), strLIZ2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Download succeed: url = ");
                sbLIZ4.append(str);
                sbLIZ4.append(", downloadPath = ");
                sbLIZ4.append(strLIZLLL);
                sbLIZ4.append(", md5 = ");
                sbLIZ4.append(strLIZ2);
                C2188811AlT.LIZIZ(sbLIZ4);
                LJI(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                C20101413ky c20101413ky = this;
                String str3 = str;
                Keva keva2 = (Keva) c20101413ky.LIZ.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("url_to_md5_");
                sbLIZ3.append(str3);
                keva2.storeString(C2188811AlT.LIZIZ(sbLIZ3), null);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Download fail: , url = ");
                sbLIZ4.append(str);
                sbLIZ4.append(", downloadPath = ");
                sbLIZ4.append(strLIZLLL);
                C2188811AlT.LIZIZ(sbLIZ4);
                LJI(downloadInfo);
            }
        };
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIIJ = "im_alert_tone";
        abstractC2199801B7qWith.LIZJ();
    }
}
