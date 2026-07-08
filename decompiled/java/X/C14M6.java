package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.ss.android.ugc.aweme.minis.view.MinisGuidanceSheetFragment;
import java.io.File;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS114S1000000_30;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14M6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14M6 {
    public static String LIZ;
    public static String LIZIZ;

    public static void LIZ(Activity activity, Context context) {
        File cacheDir;
        if (activity != null) {
            cacheDir = activity.getCacheDir();
        } else {
            cacheDir = null;
        }
        C0VSJ c0vsj = new C0VSJ(cacheDir, "lottie_cache");
        String str = LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        String strSubstring = a0.LJLJJI(str, '/').substring(a0.LJJJJ(a0.LJLJJI(str, '/'), '/', 0, 6) + 1);
        String strSubstring2 = a0.LJLJJI(str2, '/').substring(a0.LJJJJ(a0.LJLJJI(str2, '/'), '/', 0, 6) + 1);
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, strSubstring);
        C0VSJ c0vsj3 = new C0VSJ(c0vsj, strSubstring2);
        if (c0vsj2.exists() && c0vsj3.exists()) {
            if (c0vsj2.exists() && C14M7.LIZIZ == null) {
                C14M7.LIZIZ = c0vsj2;
            }
            if (c0vsj3.exists() && C14M7.LIZ == null) {
                C14M7.LIZ = c0vsj3;
            }
            MinisGuidanceSheetFragment minisGuidanceSheetFragment = C14M7.LIZJ;
            if (minisGuidanceSheetFragment != null && minisGuidanceSheetFragment.LL == null && context != null) {
                if (C960203pA.LIZIZ(context)) {
                    File file = C14M7.LIZ;
                    if (file != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C406301i1(file, null), 3);
                    }
                } else {
                    File file2 = C14M7.LIZIZ;
                    if (file2 != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C406301i1(file2, null), 3);
                    }
                }
            }
            C14M7.LIZJ = new MinisGuidanceSheetFragment();
            if (context != null) {
                if (C960203pA.LIZIZ(context)) {
                    File file3 = C14M7.LIZ;
                    if (file3 != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C406301i1(file3, null), 3);
                        return;
                    }
                    return;
                }
                File file4 = C14M7.LIZIZ;
                if (file4 == null) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C406301i1(file4, null), 3);
            }
        }
    }

    public static void LIZJ(C19EG c19eg, C19EG c19eg2) {
        String str;
        MinisConfigSettings.UrlSetting urlSetting = MinisConfigSettings.LIZ().urlSetting;
        String str2 = null;
        if (urlSetting != null) {
            str = urlSetting.guidanceLottieLight;
        } else {
            str = null;
        }
        LIZ = str;
        MinisConfigSettings.UrlSetting urlSetting2 = MinisConfigSettings.LIZ().urlSetting;
        if (urlSetting2 != null) {
            str2 = urlSetting2.guidanceLottieDark;
        }
        LIZIZ = str2;
        String str3 = LIZ;
        if (str3 != null) {
            LIZIZ(str3, c19eg, c19eg2);
        }
        String str4 = LIZIZ;
        if (str4 != null) {
            LIZIZ(str4, c19eg, c19eg2);
        }
    }

    public static void LIZIZ(String str, final C19EG c19eg, final C19EG c19eg2) {
        try {
            C0VSJ c0vsj = new C0VSJ(c19eg.getCacheDir(), "lottie_cache");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            String strSubstring = str.substring(a0.LJJJJ(str, '/', 0, 6) + 1);
            final C0VSJ c0vsj2 = new C0VSJ(c0vsj, strSubstring);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj);
            sbLIZ.append("temp");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('/');
            sbLIZ2.append(strSubstring);
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (c0vsj2.exists()) {
                C2354709Kn.LJIJJLI(strLIZIZ2);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Lottie file already exists: ");
                sbLIZ3.append(str);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Downloading Lottie file: ");
            sbLIZ4.append(str);
            C2188811AlT.LIZIZ(sbLIZ4);
            AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            abstractC2199801B7qWith.LIZJ = strSubstring;
            abstractC2199801B7qWith.LJ = strLIZIZ;
            abstractC2199801B7qWith.LJII = 3;
            abstractC2199801B7qWith.LJJ = true;
            abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.14M5
                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String targetFilePath;
                    if (downloadInfo != null && (targetFilePath = downloadInfo.getTargetFilePath()) != null && targetFilePath.length() != 0) {
                        try {
                            C2354709Kn.LIZLLL(targetFilePath, c0vsj2.toString());
                            C14M6.LIZ(c19eg, c19eg2);
                            C2354709Kn.LJIJJLI(strLIZIZ2);
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C371410EhH.LIZJ(AFwS219S0000000_30.get$arr$(259));
                            return;
                        }
                    }
                    C371410EhH.LIZJ(new AwS114S1000000_30(strLIZIZ2, 1));
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C371410EhH.LIZJ(new AwS179S1100000_30(strLIZIZ2, baseException, 2));
                }
            };
            abstractC2199801B7qWith.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C371410EhH.LIZJ(AFwS219S0000000_30.get$arr$(260));
        }
    }
}
