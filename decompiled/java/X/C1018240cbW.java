package X;

import Y.ACallableS16S2200000_16;
import Y.AObjectS11S0001000_16;
import Y.AObjectS13S1101000_16;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018240cbW extends C09AY implements Function0<ArrayList<InterfaceC1031110cwH>> {
    public C1018240cbW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<InterfaceC1031110cwH> invoke() {
        ArrayList<InterfaceC1031110cwH> arrayList = new ArrayList<>();
        arrayList.add(new InterfaceC1031110cwH() { // from class: X.0cbO
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(345));

            @Override // X.InterfaceC1031110cwH
            public final boolean LIZ(Aweme aweme) {
                return C1017070cZd.LJLLL(aweme);
            }

            @Override // X.InterfaceC1031110cwH
            public final void LIZIZ(Aweme aweme) {
                List<SimpleUriAndUrl> listLJI;
                AlphaVideoData alphaVideoDataLJIIL;
                String str;
                List<String> list;
                ILikeEffectService iLikeEffectService = (ILikeEffectService) this.LIZ.getValue();
                if (iLikeEffectService != null && (alphaVideoDataLJIIL = iLikeEffectService.LJIIL(aweme)) != null && (str = alphaVideoDataLJIIL.vid) != null && str.length() != 0 && (list = alphaVideoDataLJIIL.urlList) != null && !list.isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1030680cva.LJ());
                    sbLIZ.append(str);
                    C1030680cva.LJIILL(C2188811AlT.LIZIZ(sbLIZ), alphaVideoDataLJIIL.fileHash, false);
                }
                ILikeEffectService iLikeEffectService2 = (ILikeEffectService) this.LIZ.getValue();
                if (iLikeEffectService2 != null && (listLJI = iLikeEffectService2.LJI(aweme)) != null && !listLJI.isEmpty()) {
                    String strLJ = C1030680cva.LJ();
                    Iterator<SimpleUriAndUrl> it2 = listLJI.iterator();
                    while (it2.hasNext()) {
                        String uri = it2.next().getUri();
                        if (uri != null && uri.length() != 0) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLJ);
                            sbLIZ2.append(uri);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("delLikeEffectPics pic uri=");
                            sbLIZ3.append(uri);
                            C1022620cia.LIZ("LikeEffectAddOn", C2188811AlT.LIZIZ(sbLIZ3));
                            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                            if (c0vsj.isFile() && c0vsj.exists()) {
                                c0vsj.delete();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("like effect del pic uri = ");
                                sbLIZ4.append(uri);
                                sbLIZ4.append(", \n path = ");
                                sbLIZ4.append(strLIZIZ);
                                sbLIZ4.append(" delect success");
                                C1022620cia.LIZ("LikeEffectAddOn", C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("like effect del pic uri = ");
                                sbLIZ5.append(uri);
                                sbLIZ5.append(", \n path = ");
                                sbLIZ5.append(strLIZIZ);
                                sbLIZ5.append(" delect failed");
                                C1022620cia.LIZ("LikeEffectAddOn", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC1031110cwH
            public final void LIZJ(Context context, Aweme aweme) {
                List<SimpleUriAndUrl> listLJI;
                AlphaVideoData alphaVideoDataLJIIL;
                int status;
                ILikeEffectService iLikeEffectService = (ILikeEffectService) this.LIZ.getValue();
                if (iLikeEffectService != null && (alphaVideoDataLJIIL = iLikeEffectService.LJIIL(aweme)) != null) {
                    final TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger(new Object[]{aweme});
                    C1018150cbN c1018150cbNLIZJ = C1018150cbN.LIZJ();
                    final String str = alphaVideoDataLJIIL.vid;
                    List<String> list = alphaVideoDataLJIIL.urlList;
                    final String str2 = alphaVideoDataLJIIL.fileHash;
                    c1018150cbNLIZJ.getClass();
                    if (str != null && !str.isEmpty() && list != null && !list.isEmpty()) {
                        String str3 = (String) ListProtector.get(list, 0);
                        final IVMPreviewAdsOfflineService iVMPreviewAdsOfflineServiceLJIIIZ = ((ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class)).LJIIIZ();
                        IDownloadListener iDownloadListener = new IDownloadListener() { // from class: X.0cbM
                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onProgress(DownloadInfo downloadInfo) {
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onCanceled(DownloadInfo downloadInfo) {
                                topViewAdEventLogger.logAd(C1018060cbE.LJIIIIZZ);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download cancel");
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onFirstStart(DownloadInfo downloadInfo) {
                                topViewAdEventLogger.logAd(C1018060cbE.LJII);
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
                                topViewAdEventLogger.logAd(C1018060cbE.LJFF);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download prepare");
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onStart(DownloadInfo downloadInfo) {
                                topViewAdEventLogger.logAd(C1018060cbE.LJI);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download start");
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                C15O7.LIZJ(new ACallableS16S2200000_16(topViewAdEventLogger, str, str2, downloadInfo, 0));
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                int errorCode;
                                String errorMessage;
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download failed");
                                if (baseException == null) {
                                    errorCode = 0;
                                    errorMessage = "";
                                } else {
                                    errorCode = baseException.getErrorCode();
                                    errorMessage = baseException.getErrorMessage();
                                }
                                topViewAdEventLogger.logAd(C1018060cbE.LIZLLL, new AObjectS13S1101000_16(errorCode, downloadInfo, errorMessage, 1));
                                IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService = iVMPreviewAdsOfflineServiceLJIIIZ;
                                if (iVMPreviewAdsOfflineService != null) {
                                    iVMPreviewAdsOfflineService.isEnabled();
                                }
                                if (errorCode == 1034) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(C1018150cbN.LIZLLL);
                                    sbLIZ.append(C1030680cva.LJIIIIZZ(str, str2, false, false));
                                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                                    if (c0vsj.exists()) {
                                        c0vsj.delete();
                                    }
                                }
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry");
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download retry delay");
                            }
                        };
                        if (str3 != null && !str3.isEmpty()) {
                            String strLJIIIIZZ = C1030680cva.LJIIIIZZ(str, str2, false, false);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C1018150cbN.LIZLLL);
                            sbLIZ.append(strLJIIIIZZ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (new C0VSJ(strLIZIZ).exists()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("videoPath has download, path = ");
                                sbLIZ2.append(strLIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video has download, do not download again");
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("videoPath no download, path = ");
                                sbLIZ3.append(strLIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                if (C086I.LIZIZ(list)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_list_null");
                                } else if (TextUtils.isEmpty(str3)) {
                                    TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_first_null");
                                } else {
                                    ArrayList arrayList2 = new ArrayList(list);
                                    arrayList2.remove(str3);
                                    int iLJIILJJIL = C2199681B7e.LJIILJJIL(str3, C1018150cbN.LIZLLL);
                                    if (!C1031100cwG.LIZ().LJJ()) {
                                        C1031100cwG.LIZ().LJIILJJIL();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.putOpt("error_reason", "downloader_not_init");
                                            C20684815ws.LJIJ("topview_error", jSONObject);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C1AF0.LJ(e);
                                        }
                                    }
                                    IDownloadService iDownloadServiceLIZLLL = C1031100cwG.LIZ().LIZLLL();
                                    if (iDownloadServiceLIZLLL != null) {
                                        if (iDownloadServiceLIZLLL.isDownloading(iLJIILJJIL)) {
                                            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video is downloading, not start download");
                                        } else {
                                            DownloadInfo downloadInfo = iDownloadServiceLIZLLL.getDownloadInfo(iLJIILJJIL);
                                            if (downloadInfo != null) {
                                                status = downloadInfo.getStatus();
                                            } else {
                                                status = 100;
                                            }
                                            topViewAdEventLogger.logAd(C1018060cbE.LIZIZ, new AObjectS11S0001000_16(status, 0));
                                            if (iVMPreviewAdsOfflineServiceLJIIIZ != null) {
                                                iVMPreviewAdsOfflineServiceLJIIIZ.isEnabled();
                                            }
                                            AbstractC2199801B7q abstractC2199801B7qWith = iDownloadServiceLIZLLL.with(str3);
                                            abstractC2199801B7qWith.LJIIIIZZ = arrayList2;
                                            abstractC2199801B7qWith.LJ = C1018150cbN.LIZLLL;
                                            abstractC2199801B7qWith.LJIIIZ = str2;
                                            abstractC2199801B7qWith.LIZJ = strLJIIIIZZ;
                                            abstractC2199801B7qWith.LJIIJJI = iDownloadListener;
                                            abstractC2199801B7qWith.LJIIJ = "ad_splash_video_preload";
                                            abstractC2199801B7qWith.LJFF = true;
                                            abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ILikeEffectService iLikeEffectService2 = (ILikeEffectService) this.LIZ.getValue();
                if (iLikeEffectService2 != null && (listLJI = iLikeEffectService2.LJI(aweme)) != null && !listLJI.isEmpty()) {
                    String strLJ = C1030680cva.LJ();
                    for (SimpleUriAndUrl simpleUriAndUrl : listLJI) {
                        String uri = simpleUriAndUrl.getUri();
                        String url = simpleUriAndUrl.getUrl();
                        if (url != null && url.length() != 0 && uri != null && uri.length() != 0) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(strLJ);
                            sbLIZ4.append(uri);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            if (new C0VSJ(strLIZIZ2).exists()) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("download pic uri=");
                                sbLIZ5.append(uri);
                                sbLIZ5.append(", has cached");
                                C1022620cia.LIZ("LikeEffectAddOn", C2188811AlT.LIZIZ(sbLIZ5));
                            } else {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("download pic uri=");
                                sbLIZ6.append(uri);
                                sbLIZ6.append(", direct download");
                                C1022620cia.LIZ("LikeEffectAddOn", C2188811AlT.LIZIZ(sbLIZ6));
                                ILikeEffectService iLikeEffectService3 = (ILikeEffectService) this.LIZ.getValue();
                                if (iLikeEffectService3 != null) {
                                    iLikeEffectService3.LIZ(context, url, strLIZIZ2);
                                }
                            }
                        }
                    }
                }
            }
        });
        return arrayList;
    }
}
