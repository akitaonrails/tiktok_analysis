package X;

import Y.AObjectS13S1101000_16;
import Y.AObjectS33S0100100_16;
import Y.AObjectS8S1100100_16;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0cbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018130cbL implements IDownloadListener {
    public final long LL = System.currentTimeMillis();
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ TopViewAdEventLogger LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ IVMPreviewAdsOfflineService LLILZIL;
    public final /* synthetic */ VideoUrlModel LLILZLL;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        C1023960ckk c1023960ckk;
        if (this.LLILLJJLI) {
            c1023960ckk = C1018060cbE.LJJIJLIJ;
        } else {
            c1023960ckk = C1018060cbE.LJIIIIZZ;
        }
        this.LLILLL.logAd(c1023960ckk);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download cancel");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        C1023960ckk c1023960ckk;
        if (this.LLILLJJLI) {
            c1023960ckk = C1018060cbE.LJJIL;
        } else {
            c1023960ckk = C1018060cbE.LJII;
        }
        this.LLILLL.logAd(c1023960ckk);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download first succeed");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download pause");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        C1023960ckk c1023960ckk;
        if (this.LLILLJJLI) {
            c1023960ckk = C1018060cbE.LJJIIZI;
        } else {
            c1023960ckk = C1018060cbE.LJFF;
        }
        this.LLILLL.logAd(c1023960ckk);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download prepare");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        C1023960ckk c1023960ckk;
        AwemeSplashInfo awemeSplashInfoLJJJ;
        if (this.LLILLJJLI) {
            c1023960ckk = C1018060cbE.LJJIJ;
        } else {
            c1023960ckk = C1018060cbE.LJI;
        }
        this.LLILLL.logAd(c1023960ckk);
        Aweme aweme = this.LLILZ;
        if (aweme != null && (awemeSplashInfoLJJJ = C1017070cZd.LJJJ(aweme)) != null) {
            awemeSplashInfoLJJJ.getAwesomeSplashId();
        }
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(final DownloadInfo downloadInfo) {
        this.LLILZIL.isEnabled();
        final VideoUrlModel videoUrlModel = this.LLILZLL;
        final boolean z = this.LLILLJJLI;
        final TopViewAdEventLogger topViewAdEventLogger = this.LLILLL;
        final Aweme aweme = this.LLILZ;
        C15O7.LIZJ(new Callable() { // from class: X.0cbK
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                String strLIZIZ;
                C1023960ckk c1023960ckk;
                String strLJ;
                boolean z2;
                C1023960ckk c1023960ckk2;
                C1018130cbL c1018130cbL = this.LL;
                VideoUrlModel videoUrlModel2 = videoUrlModel;
                boolean z3 = z;
                TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                DownloadInfo downloadInfo2 = downloadInfo;
                Aweme aweme2 = aweme;
                c1018130cbL.getClass();
                if (videoUrlModel2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1018150cbN.LIZLLL);
                    sbLIZ.append(C1030680cva.LJIIIIZZ(videoUrlModel2.getUrlKey(), videoUrlModel2.getFileHash(), !TextUtils.isEmpty(videoUrlModel2.getaK()), true));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                long jLIZJ = C1293980jmG.LIZJ(strLIZIZ);
                int i = C0BSL.LIZ;
                if (i == 0) {
                    if (z3) {
                        c1023960ckk2 = C1018060cbE.LJJIZ;
                    } else {
                        C1018060cbE.LIZ.getClass();
                        c1023960ckk2 = C1018060cbE.LIZJ;
                    }
                    topViewAdEventLogger2.logAd(c1023960ckk2, new AObjectS33S0100100_16(downloadInfo2, jLIZJ, 0));
                    C1018230cbV.LIZ(aweme2, -1, null, downloadInfo2.getUrl(), true);
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
                    return null;
                }
                if (jLIZJ >= i) {
                    if (z3) {
                        c1023960ckk = C1018060cbE.LJJIZ;
                    } else {
                        C1018060cbE.LIZ.getClass();
                        c1023960ckk = C1018060cbE.LIZJ;
                    }
                    topViewAdEventLogger2.logAd(c1023960ckk, new AObjectS33S0100100_16(downloadInfo2, jLIZJ, 1));
                    if (C1017070cZd.LJJJLL(aweme2) && !z3 && videoUrlModel2 != null) {
                        C1016570cYp.LIZIZ(aweme2, EnumC1008920cMU.VIDEO_3D_FOREGROUND.getType(), true, c1018130cbL.LL, videoUrlModel2.getSourceId(), videoUrlModel2.getUrlList(), "");
                    }
                    C1018230cbV.LIZ(aweme2, -1, null, downloadInfo2.getUrl(), true);
                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
                    return null;
                }
                if (c0vsj.exists()) {
                    try {
                        length = c0vsj.isFile() ? c0vsj.length() : 0L;
                        strLJ = C1293980jmG.LJ(strLIZIZ);
                        if (strLJ != null) {
                            try {
                                if (strLJ.length() > 200) {
                                    strLJ = strLJ.substring(0, 200);
                                }
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strLJ = null;
                    }
                    c0vsj.delete();
                } else {
                    strLJ = null;
                }
                topViewAdEventLogger2.logAd(z3 ? C1018060cbE.LJJJ : C1018060cbE.LIZLLL, new AObjectS8S1100100_16(downloadInfo2, length, strLJ, 0));
                if (!C1017070cZd.LJJJLL(aweme2) || z3 || videoUrlModel2 == null) {
                    z2 = false;
                } else {
                    z2 = false;
                    C1016570cYp.LIZIZ(aweme2, EnumC1008920cMU.VIDEO_3D_FOREGROUND.getType(), false, c1018130cbL.LL, videoUrlModel2.getSourceId(), videoUrlModel2.getUrlList(), "Less than minsize");
                }
                C1018230cbV.LIZ(aweme2, -2, "Less than minsize", downloadInfo2.getUrl(), z2);
                return null;
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
        int errorCode;
        String errorMessage;
        C1023960ckk c1023960ckk;
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download failed");
        if (baseException == null) {
            errorCode = 0;
            errorMessage = "";
        } else {
            errorCode = baseException.getErrorCode();
            errorMessage = baseException.getErrorMessage();
        }
        if (this.LLILLJJLI) {
            c1023960ckk = C1018060cbE.LJJJ;
        } else {
            c1023960ckk = C1018060cbE.LIZLLL;
        }
        this.LLILLL.logAd(c1023960ckk, new AObjectS13S1101000_16(errorCode, downloadInfo, errorMessage, 0));
        if (C1017070cZd.LJJJLL(this.LLILZ) && !this.LLILLJJLI && this.LLILZLL != null) {
            C1016570cYp.LIZIZ(this.LLILZ, EnumC1008920cMU.VIDEO_3D_FOREGROUND.getType(), false, this.LL, this.LLILZLL.getSourceId(), this.LLILZLL.getUrlList(), errorMessage);
        }
        this.LLILZIL.isEnabled();
        if (errorCode == 1034 && this.LLILZLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1018150cbN.LIZLLL);
            sbLIZ.append(C1030680cva.LJIIIIZZ(this.LLILZLL.getUrlKey(), this.LLILZLL.getFileHash(), !TextUtils.isEmpty(this.LLILZLL.getaK()), true));
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        }
        C1018230cbV.LIZ(this.LLILZ, Integer.valueOf(errorCode), errorMessage, downloadInfo.getUrl(), false);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry");
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry delay");
    }

    public C1018130cbL(boolean z, TopViewAdEventLogger topViewAdEventLogger, Aweme aweme, IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService, VideoUrlModel videoUrlModel) {
        this.LLILLJJLI = z;
        this.LLILLL = topViewAdEventLogger;
        this.LLILZ = aweme;
        this.LLILZIL = iVMPreviewAdsOfflineService;
        this.LLILZLL = videoUrlModel;
    }
}
