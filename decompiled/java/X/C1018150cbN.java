package X;

import Y.ACallableS180S0300000_16;
import Y.ACallableS422S0100000_16;
import Y.ACallableS58S1100000_3;
import Y.AObjectS13S1101000_16;
import Y.AObjectS359S0100000_16;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS9S1100000_3;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightInfo;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightVideoModel;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import com.ss.android.ugc.aweme.model.AnoleMultiContentModel;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import com.ss.android.ugc.aweme.settings.AnoleVideoPreloadModel;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018150cbN {
    public static volatile C1018150cbN LIZIZ;
    public static TopViewJsonManager LIZJ;
    public static String LIZLLL;
    public static C1016870cZJ LJ;
    public volatile InterfaceC1018210cbT LIZ;

    public static C1018150cbN LIZJ() {
        if (LIZIZ == null) {
            synchronized (C1018150cbN.class) {
                try {
                    if (LIZIZ == null) {
                        LIZLLL = C1030680cva.LJ();
                        LIZJ = new TopViewJsonManager(LIZLLL);
                        LIZIZ = new C1018150cbN();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static boolean LJI() {
        SharedPreferences sharedPreferences;
        TopViewJsonManager topViewJsonManager = LIZJ;
        if (topViewJsonManager == null || (sharedPreferences = topViewJsonManager.LIZJ) == null) {
            return false;
        }
        return sharedPreferences.getBoolean("awesome_splash_filter_enable", false);
    }

    public static InterfaceC1018210cbT LJ(String str) {
        TopViewJsonManager topViewJsonManager = LIZJ;
        topViewJsonManager.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_number", ((ConcurrentHashMap) topViewJsonManager.LJ()).size());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C20684815ws.LJIJ("topview_aweme", jSONObject);
        return (InterfaceC1018210cbT) ((ConcurrentHashMap) topViewJsonManager.LJ()).get(str);
    }

    public static Pair LJFF(InterfaceC1018210cbT interfaceC1018210cbT) {
        Pair pair;
        boolean z = true;
        if (interfaceC1018210cbT != null) {
            if (interfaceC1018210cbT.LLZZZIL() && interfaceC1018210cbT.getAwemeType() == 200) {
                TopViewAwemeRawAd topViewAwemeRawAdLIZIZ = interfaceC1018210cbT.LIZIZ();
                if (topViewAwemeRawAdLIZIZ == null) {
                    return new Pair(Boolean.FALSE, "raw ad is null");
                }
                AnoleModel anoleModel = topViewAwemeRawAdLIZIZ.getAnoleModel();
                if (anoleModel == null) {
                    return new Pair(Boolean.FALSE, "anoleModel is null");
                }
                Map<String, AnoleComponentModel> map = anoleModel.components;
                if (map != null && !map.isEmpty()) {
                    AnoleComponentModel anoleComponentModel = map.get(EnumC1008920cMU.MULTI_CONTENT.getType());
                    if (anoleComponentModel == null) {
                        return new Pair(Boolean.FALSE, "multiContentComponent is null");
                    }
                    Map<String, ? extends Object> map2 = anoleComponentModel.data;
                    if (map2 != null && !map2.isEmpty()) {
                        C1227904rF.LIZ.getClass();
                        AnoleMultiContentModel anoleMultiContentModel = (AnoleMultiContentModel) anoleComponentModel.parseDataToStructure(C1227904rF.LIZLLL(), AnoleMultiContentModel.class, null);
                        if (anoleMultiContentModel == null) {
                            return new Pair(Boolean.FALSE, "contentModel is null");
                        }
                        List<AnoleMultiContentItemModel> contentList = anoleMultiContentModel.getContentList();
                        if (contentList != null && !contentList.isEmpty()) {
                            AnoleMultiContentItemModel anoleMultiContentItemModel = (AnoleMultiContentItemModel) ListProtector.get(contentList, 0);
                            if (anoleMultiContentItemModel != null && !TextUtils.isEmpty(anoleMultiContentItemModel.getVid())) {
                                if (TextUtils.isEmpty(C1030680cva.LJII(anoleMultiContentItemModel.getVid(), anoleMultiContentItemModel.getFileHash(), !TextUtils.isEmpty(anoleMultiContentItemModel.getPlayerAccessKey()), true))) {
                                    return new Pair(Boolean.FALSE, "videoPath is null");
                                }
                                return new Pair(Boolean.TRUE, "");
                            }
                            return new Pair(Boolean.FALSE, "singleVideo is null");
                        }
                        return new Pair(Boolean.FALSE, "videoItemList is null");
                    }
                    return new Pair(Boolean.FALSE, "multiContentComponent is null");
                }
                return new Pair(Boolean.FALSE, "components is null");
            }
            if (interfaceC1018210cbT.LLZZZIL() && interfaceC1018210cbT.LIZIZ() != null && interfaceC1018210cbT.LIZIZ().getAdStyleActionModel() != null && interfaceC1018210cbT.LIZIZ().getAdStyleActionModel().logoSpotlightInfo != null) {
                LogoSpotlightInfo logoSpotlightInfo = interfaceC1018210cbT.LIZIZ().getAdStyleActionModel().logoSpotlightInfo;
                Video videoLIZ = interfaceC1018210cbT.LIZ();
                if (logoSpotlightInfo == null) {
                    pair = new Pair(Boolean.FALSE, "logoSpotlightInfo is null");
                } else {
                    LogoSpotlightVideoModel spotlightVideoModel = logoSpotlightInfo.getSpotlightVideoModel();
                    if (spotlightVideoModel != null && spotlightVideoModel.getVid() != null && spotlightVideoModel.getUrlList() != null) {
                        C1046940dLo.LIZ.getClass();
                        VideoUrlModel videoUrlModelLIZ = C1046940dLo.LIZ(spotlightVideoModel);
                        if (videoUrlModelLIZ != null && !C086I.LIZIZ(videoUrlModelLIZ.getUrlList())) {
                            if (videoLIZ == null) {
                                pair = new Pair(Boolean.FALSE, "spotlight origin video data is null");
                            } else {
                                VideoUrlModel playAddr = videoLIZ.getPlayAddr();
                                if (playAddr != null && !C086I.LIZIZ(playAddr.getUrlList())) {
                                    String strLJII = C1030680cva.LJII(videoUrlModelLIZ.getUrlKey(), videoUrlModelLIZ.getFileHash(), !TextUtils.isEmpty(videoUrlModelLIZ.getaK()), false);
                                    String strLJII2 = C1030680cva.LJII(playAddr.getUrlKey(), playAddr.getFileHash(), true ^ TextUtils.isEmpty(playAddr.getaK()), false);
                                    if (TextUtils.isEmpty(strLJII)) {
                                        String vid = spotlightVideoModel.getVid();
                                        Boolean bool = Boolean.FALSE;
                                        C1046940dLo.LIZJ.put(vid, bool);
                                        if (TextUtils.isEmpty(strLJII2)) {
                                            pair = new Pair(bool, "both spotlight and origin videoPath is null");
                                        }
                                    } else {
                                        C1046940dLo.LIZJ.put(spotlightVideoModel.getVid(), Boolean.TRUE);
                                    }
                                    pair = new Pair(Boolean.TRUE, "");
                                } else {
                                    pair = new Pair(Boolean.FALSE, "spotlight videoUrlModel is null or empty");
                                }
                            }
                        } else {
                            pair = new Pair(Boolean.FALSE, "spotlight videoUrlModel is null or empty");
                        }
                    } else {
                        pair = new Pair(Boolean.FALSE, "spotlightVideoModel is null");
                    }
                }
                if (!((Boolean) pair.first).booleanValue()) {
                    LJIIJJI(interfaceC1018210cbT.LIZIZ(), EnumC1030740cvg.LOAD_FAIL);
                }
                return pair;
            }
        }
        Video videoLIZ2 = interfaceC1018210cbT.LIZ();
        if (videoLIZ2 == null) {
            LJIIIZ(interfaceC1018210cbT);
            return new Pair(Boolean.FALSE, "video is null");
        }
        VideoUrlModel playAddr2 = videoLIZ2.getPlayAddr();
        if (playAddr2 != null && !C086I.LIZIZ(playAddr2.getUrlList())) {
            String urlKey = playAddr2.getUrlKey();
            String fileHash = playAddr2.getFileHash();
            if (TextUtils.isEmpty(playAddr2.getaK()) || playAddr2.getaK() == null) {
                z = false;
            }
            if (TextUtils.isEmpty(C1030680cva.LJII(urlKey, fileHash, z, false))) {
                LJIIJJI(interfaceC1018210cbT.LIZIZ(), EnumC1030740cvg.LOAD_FAIL);
                return new Pair(Boolean.FALSE, "video is not downloaded to local");
            }
            return new Pair(Boolean.TRUE, "");
        }
        LJIIIZ(interfaceC1018210cbT);
        return new Pair(Boolean.FALSE, "videoUrlModel is null or empty");
    }

    public static void LJIIIZ(InterfaceC1018210cbT interfaceC1018210cbT) {
        TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger();
        topViewAdEventLogger.logAd(C1018060cbE.LJIIJJI, C1017070cZd.LJIJJLI(interfaceC1018210cbT));
        if (interfaceC1018210cbT != null && interfaceC1018210cbT.LIZ() != null && interfaceC1018210cbT.LIZ().is3DVideo()) {
            topViewAdEventLogger.withContext(interfaceC1018210cbT.LIZ().getPlayAddr3DFallback());
            topViewAdEventLogger.logAd(C1018060cbE.LJJIJIIJIL, C1017070cZd.LJIJJLI(interfaceC1018210cbT));
        }
    }

    public static boolean LJIILJJIL(Aweme aweme) {
        AwemeSplashInfo splashInfo;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            splashInfo = awemeRawAd.getSplashInfo();
        } else {
            splashInfo = null;
        }
        if (splashInfo != null && splashInfo.getTopViewTestOrderType() == 1 && !((Boolean) C274710Aph.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(String str) {
        if (C0B4N.LIZ()) {
            C01GW c01gw = C0A3N.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                try {
                    C15O7.LIZJ(new ACallableS58S1100000_3(this, str, 0));
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    return;
                }
            }
            if (((Number) c01gw.getValue()).intValue() == 2) {
                C823050WQl.LIZLLL().submit(new ARunnableS9S1100000_3(this, str, 3));
                return;
            } else {
                C823050WQl.LIZLLL().submit(new ARunnableS9S1100000_3(this, str, 4));
                return;
            }
        }
        C823050WQl.LIZLLL().submit(new ARunnableS103S0100000_3(this, 21));
    }

    public final void LJII(EnumC1030740cvg enumC1030740cvg) {
        C1018230cbV.LIZIZ(this.LIZ, enumC1030740cvg.name(), false);
        if (this.LIZ != null) {
            LJIIJJI(this.LIZ.LIZIZ(), enumC1030740cvg);
            LJIIL(this.LIZ, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static void LIZ(Context context, final Aweme aweme) {
        LogoSpotlightVideoModel logoSpotlightVideoModelLJJIZ;
        final IVMPreviewAdsOfflineService iVMPreviewAdsOfflineServiceLJIIIZ;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        List<AnoleMultiContentItemModel> contentList;
        boolean z;
        InterfaceC1028550cs9 interfaceC1028550cs9LIZ;
        long j;
        AwemeRawAd awemeRawAd2;
        AnoleModel anoleModel2;
        boolean zLJI = MethodIDManager.LJI(137846);
        boolean z2 = 0;
        final TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger(new Object[]{aweme});
        TroubleshootingLogDelegate troubleshootingLogDelegate = TroubleshootingLogDelegate.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start preload TopView Aweme =");
        sbLIZ.append(aweme.getAid());
        troubleshootingLogDelegate.awesomeSplashLog(C2188811AlT.LIZIZ(sbLIZ));
        if (C1017070cZd.LLJILJILJ(aweme)) {
            troubleshootingLogDelegate.awesomeSplashLog("past data, cancel download");
            LJIIJ(aweme, EnumC1018180cbQ.PAST_DATA);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
        if (c1016730cZ5.LIZIZ(aweme) != null && aweme.getAwemeRawAd() != null) {
            c1016730cZ5.LJ(aweme.getAwemeRawAd(), c1016730cZ5.LIZIZ(aweme).geckoChannel);
        }
        C1016720cZ4 c1016720cZ4 = C1016720cZ4.LIZIZ;
        if (c1016720cZ4.LIZ(aweme) != null) {
            c1016720cZ4.LIZIZ(aweme.getAwemeRawAd(), c1016720cZ4.LIZ(aweme).geckoChannel);
        }
        AwemeSplashInfo awemeSplashInfoLJJJ = C1017070cZd.LJJJ(aweme);
        if (awemeSplashInfoLJJJ == null) {
            troubleshootingLogDelegate.awesomeSplashLog("awemeSplashInfo is null，cancel download");
            LJIIJ(aweme, EnumC1018180cbQ.SPLASH_INFO_NULL);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        int preloadType = awemeSplashInfoLJJJ.getPreloadType();
        C804440Vh4 c804440Vh4 = C036E.LIZ;
        if (!c804440Vh4.LIZIZ()) {
            troubleshootingLogDelegate.awesomeSplashLog("no network, cancel download");
            LJIIJ(aweme, EnumC1018180cbQ.NO_NETWORK);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!c804440Vh4.LIZJ() && preloadType == 1) {
            troubleshootingLogDelegate.awesomeSplashLog("not wifi, cancel download");
            LJIIJ(aweme, EnumC1018180cbQ.WIFI_ONLY);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        IDownloadService iDownloadServiceLIZLLL = C1031100cwG.LIZ().LIZLLL();
        if (iDownloadServiceLIZLLL == null) {
            LJIIJ(aweme, EnumC1018180cbQ.DOWNLOAD_SERVICE_NULL);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (C1017070cZd.LLIIIL(aweme)) {
            if (LJ == null) {
                LJ = new C1016870cZJ();
            }
            final C1016870cZJ c1016870cZJ = LJ;
            final String str = LIZLLL;
            c1016870cZJ.getClass();
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iVMPreviewAdsOfflineServiceLJIIIZ = iCommerceService.LJIIIZ()) != null) {
                if (AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LLIZLLLIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && !map.isEmpty() && (anoleComponentModel = map.get(EnumC1008920cMU.MULTI_CONTENT.getType())) != null) {
                    final C238400w2 c238400w2 = new C238400w2();
                    c238400w2.element = System.currentTimeMillis();
                    IDownloadListener iDownloadListener = new IDownloadListener() { // from class: X.0cYr
                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstSuccess(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPause(DownloadInfo downloadInfo) {
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
                            topViewAdEventLogger.logAd(C1018060cbE.LJIIIIZZ);
                            if (downloadInfo != null) {
                                C1016570cYp.LIZ(aweme, EnumC1008920cMU.MULTI_CONTENT.getType(), false, c238400w2.element, downloadInfo.getName(), downloadInfo.getUrl(), "download onCanceled.");
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstStart(DownloadInfo downloadInfo) {
                            topViewAdEventLogger.logAd(C1018060cbE.LJII);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPrepare(DownloadInfo downloadInfo) {
                            topViewAdEventLogger.logAd(C1018060cbE.LJFF);
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                            topViewAdEventLogger.logAd(C1018060cbE.LIZIZ);
                            if (downloadInfo != null) {
                                C238400w2 c238400w22 = c238400w2;
                                Aweme aweme2 = aweme;
                                c238400w22.element = System.currentTimeMillis();
                                C1016570cYp.LIZJ(EnumC1008920cMU.MULTI_CONTENT.getType(), downloadInfo.getName(), downloadInfo.getUrl(), aweme2);
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            if (downloadInfo == null) {
                                return;
                            }
                            C1016870cZJ c1016870cZJ2 = c1016870cZJ;
                            String url = downloadInfo.getUrl();
                            String savePath = downloadInfo.getSavePath();
                            String name = downloadInfo.getName();
                            String md5 = downloadInfo.getMd5();
                            IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService = iVMPreviewAdsOfflineServiceLJIIIZ;
                            TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                            Aweme aweme2 = aweme;
                            c1016870cZJ2.getClass();
                            C1016870cZJ.LIZIZ(url, savePath, name, md5, iVMPreviewAdsOfflineService, topViewAdEventLogger2, aweme2);
                            C15O7.LIZJ(new ACallableS180S0300000_16(aweme, c238400w2, downloadInfo, 1));
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws JSONException {
                            int errorCode;
                            String errorMessage;
                            if (downloadInfo == null) {
                                return;
                            }
                            if (baseException != null) {
                                errorCode = baseException.getErrorCode();
                            } else {
                                errorCode = 0;
                            }
                            if (baseException == null || (errorMessage = baseException.getErrorMessage()) == null) {
                                errorMessage = "";
                            }
                            C1016870cZJ c1016870cZJ2 = c1016870cZJ;
                            String url = downloadInfo.getUrl();
                            String savePath = downloadInfo.getSavePath();
                            String name = downloadInfo.getName();
                            String md5 = downloadInfo.getMd5();
                            IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService = iVMPreviewAdsOfflineServiceLJIIIZ;
                            TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                            Aweme aweme2 = aweme;
                            c1016870cZJ2.getClass();
                            C1016870cZJ.LIZ(url, savePath, name, md5, iVMPreviewAdsOfflineService, topViewAdEventLogger2, aweme2, errorCode, errorMessage);
                            C1016570cYp.LIZ(aweme, EnumC1008920cMU.MULTI_CONTENT.getType(), false, c238400w2.element, downloadInfo.getName(), downloadInfo.getUrl(), errorMessage);
                        }
                    };
                    C1227904rF.LIZ.getClass();
                    AnoleMultiContentModel anoleMultiContentModel = (AnoleMultiContentModel) anoleComponentModel.parseDataToStructure(C1227904rF.LIZLLL(), AnoleMultiContentModel.class, null);
                    if (anoleMultiContentModel != null && (contentList = anoleMultiContentModel.getContentList()) != null && !contentList.isEmpty()) {
                        for (final AnoleMultiContentItemModel anoleMultiContentItemModel : contentList) {
                            String vid = anoleMultiContentItemModel.getVid();
                            String playerAccessKey = anoleMultiContentItemModel.getPlayerAccessKey();
                            if (playerAccessKey != null && playerAccessKey.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            final String strLJIIIIZZ = C1030680cva.LJIIIIZZ(vid, anoleMultiContentItemModel.getFileHash(), !z, z2);
                            if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str);
                                sbLIZ2.append(strLJIIIIZZ);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                if (((AnoleVideoPreloadModel) C2249408rc.LIZIZ.getValue()).enable) {
                                    List<String> urlList = anoleMultiContentItemModel.getUrlList();
                                    String vid2 = anoleMultiContentItemModel.getVid();
                                    if (urlList != null && vid2 != null) {
                                        String fileHash = anoleMultiContentItemModel.getFileHash();
                                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                                        if (awemeRawAd3 != null && (anoleModel2 = awemeRawAd3.getAnoleModel()) != null) {
                                            j = anoleModel2.templateID;
                                        } else {
                                            j = 0;
                                        }
                                        C1016460cYe c1016460cYe = new C1016460cYe(urlList, vid2, fileHash, str, strLJIIIIZZ, anoleComponentModel, j, "ad_splash_video_preload");
                                        IAnoleService iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, z2, z2, z2, 14, null);
                                        if (iAnoleService != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                                            iAnoleService.LJIIIIZZ(c1016460cYe, awemeRawAd2, new InterfaceC1016480cYg() { // from class: X.0cYs
                                                @Override // X.InterfaceC1016480cYg
                                                public final void LIZIZ(String str2) {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("anoleVideoPreload onShotCache url:");
                                                    sbLIZ3.append(str2);
                                                    C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ3));
                                                    C1016870cZJ c1016870cZJ2 = c1016870cZJ;
                                                    Aweme aweme2 = aweme;
                                                    EnumC1018180cbQ enumC1018180cbQ = EnumC1018180cbQ.VIDEO_EXISTS;
                                                    c1016870cZJ2.getClass();
                                                    C1016870cZJ.LIZJ(aweme2, enumC1018180cbQ);
                                                }

                                                @Override // X.InterfaceC1016480cYg
                                                public final void onSuccess(String str2) {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("anoleVideoPreload onSuccess url:");
                                                    sbLIZ3.append(str2);
                                                    C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ3));
                                                    C1016870cZJ c1016870cZJ2 = c1016870cZJ;
                                                    String str3 = str;
                                                    String str4 = strLJIIIIZZ;
                                                    String fileHash2 = anoleMultiContentItemModel.getFileHash();
                                                    IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService = iVMPreviewAdsOfflineServiceLJIIIZ;
                                                    TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                                                    Aweme aweme2 = aweme;
                                                    c1016870cZJ2.getClass();
                                                    C1016870cZJ.LIZIZ(str2, str3, str4, fileHash2, iVMPreviewAdsOfflineService, topViewAdEventLogger2, aweme2);
                                                }

                                                @Override // X.InterfaceC1016480cYg
                                                public final void LIZ(String str2, int i, EnumC1016500cYi enumC1016500cYi) throws JSONException {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("anoleVideoPreload onFailure url:");
                                                    sbLIZ3.append(str2);
                                                    sbLIZ3.append(", errorCode:");
                                                    sbLIZ3.append(i);
                                                    sbLIZ3.append(", preloadFailureReason:");
                                                    sbLIZ3.append(enumC1016500cYi);
                                                    C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ3));
                                                    int i2 = C1016510cYj.LIZ[enumC1016500cYi.ordinal()];
                                                    if (i2 != 1) {
                                                        if (i2 != 2) {
                                                            if (i2 != 3) {
                                                                C1016870cZJ c1016870cZJ2 = c1016870cZJ;
                                                                String str3 = str;
                                                                String str4 = strLJIIIIZZ;
                                                                String fileHash2 = anoleMultiContentItemModel.getFileHash();
                                                                IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService = iVMPreviewAdsOfflineServiceLJIIIZ;
                                                                TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                                                                Aweme aweme2 = aweme;
                                                                String reason = enumC1016500cYi.getReason();
                                                                c1016870cZJ2.getClass();
                                                                C1016870cZJ.LIZ(str2, str3, str4, fileHash2, iVMPreviewAdsOfflineService, topViewAdEventLogger2, aweme2, i, reason);
                                                                return;
                                                            }
                                                            topViewAdEventLogger.logAd(C1018060cbE.LJIIIIZZ);
                                                            return;
                                                        }
                                                        C1016870cZJ c1016870cZJ3 = c1016870cZJ;
                                                        Aweme aweme3 = aweme;
                                                        EnumC1018180cbQ enumC1018180cbQ = EnumC1018180cbQ.VIDEO_URL_MODEL_NULL;
                                                        c1016870cZJ3.getClass();
                                                        C1016870cZJ.LIZJ(aweme3, enumC1018180cbQ);
                                                        return;
                                                    }
                                                    C1016870cZJ c1016870cZJ4 = c1016870cZJ;
                                                    Aweme aweme4 = aweme;
                                                    EnumC1018180cbQ enumC1018180cbQ2 = EnumC1018180cbQ.VIDEO_URL_LIST_NULL;
                                                    c1016870cZJ4.getClass();
                                                    C1016870cZJ.LIZJ(aweme4, enumC1018180cbQ2);
                                                }
                                            });
                                        }
                                    }
                                } else if (new C0VSJ(strLIZIZ).exists()) {
                                    C1016870cZJ.LIZJ(aweme, EnumC1018180cbQ.VIDEO_EXISTS);
                                } else {
                                    List<String> urlList2 = anoleMultiContentItemModel.getUrlList();
                                    if (urlList2 != null && !urlList2.isEmpty()) {
                                        String str2 = (String) ListProtector.get(urlList2, z2);
                                        if (str2 != null && str2.length() != 0) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.addAll(urlList2);
                                            arrayList.remove(str2);
                                            if (!iDownloadServiceLIZLLL.isDownloading(C2199681B7e.LJIILJJIL(str2, str))) {
                                                InterfaceC1028550cs9 interfaceC1028550cs9LIZ2 = C1031100cwG.LIZ();
                                                if ((interfaceC1028550cs9LIZ2 == null || !interfaceC1028550cs9LIZ2.LJJ()) && (interfaceC1028550cs9LIZ = C1031100cwG.LIZ()) != null) {
                                                    interfaceC1028550cs9LIZ.LJIILJJIL();
                                                }
                                                AbstractC2199801B7q abstractC2199801B7qWith = iDownloadServiceLIZLLL.with(str2);
                                                abstractC2199801B7qWith.LJIIIIZZ = arrayList;
                                                abstractC2199801B7qWith.LJ = str;
                                                abstractC2199801B7qWith.LIZJ = strLJIIIIZZ;
                                                abstractC2199801B7qWith.LJIIJJI = iDownloadListener;
                                                abstractC2199801B7qWith.LJIIIZ = anoleMultiContentItemModel.getFileHash();
                                                abstractC2199801B7qWith.LJIIJ = "ad_splash_video_preload";
                                                abstractC2199801B7qWith.LJFF = true;
                                                abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
                                            }
                                        } else {
                                            C1016870cZJ.LIZJ(aweme, EnumC1018180cbQ.VIDEO_URL_FIRST_NULL);
                                        }
                                    } else {
                                        C1016870cZJ.LIZJ(aweme, EnumC1018180cbQ.VIDEO_URL_LIST_NULL);
                                    }
                                }
                            }
                            z2 = 0;
                        }
                    }
                }
            } else {
                C1016870cZJ.LIZJ(aweme, EnumC1018180cbQ.PREVIEW_SERVIE_NULL);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (C1017070cZd.LLILZLL(aweme) && (logoSpotlightVideoModelLJJIZ = C1017070cZd.LJJIZ(aweme)) != null && logoSpotlightVideoModelLJJIZ.getVid() != null && logoSpotlightVideoModelLJJIZ.getUrlList() != null) {
            C1046940dLo.LIZ.getClass();
            LIZIZ(aweme, C1046940dLo.LIZ(logoSpotlightVideoModelLJJIZ), new TopViewAdEventLogger(new Object[]{aweme}), false);
        }
        ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.LJIIIIZZ(context, aweme);
        }
        Video video = aweme.getVideo();
        if (video == null) {
            troubleshootingLogDelegate.awesomeSplashLog("cancel download reason: video_null");
            LJIIJ(aweme, EnumC1018180cbQ.VIDEO_NULL);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (C1017070cZd.LJJJLL(aweme)) {
            boolean zLIZIZ = LIZIZ(aweme, playAddr, topViewAdEventLogger, false);
            VideoUrlModel playAddr3DFallback = video.getPlayAddr3DFallback();
            boolean zLIZIZ2 = LIZIZ(aweme, playAddr3DFallback, new TopViewAdEventLogger(new Object[]{aweme, playAddr3DFallback}), true);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Download 3D video, 3D result is ");
            sbLIZ3.append(zLIZIZ);
            sbLIZ3.append(" 2D fallback result is ");
            sbLIZ3.append(zLIZIZ2);
            troubleshootingLogDelegate.awesomeSplashLog("tag_topview_preload", C2188811AlT.LIZIZ(sbLIZ3));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LIZIZ(aweme, playAddr, topViewAdEventLogger, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIJ(Aweme aweme, EnumC1018180cbQ enumC1018180cbQ) {
        AwemeRawAd awemeRawAd;
        TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger(new Object[]{aweme});
        C1023960ckk c1023960ckk = C1018060cbE.LJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        topViewAdEventLogger.logAd(c1023960ckk, awemeRawAd, new AObjectS359S0100000_16(enumC1018180cbQ, 1));
        if (C1017070cZd.LJJJLL(aweme) && aweme.getVideo() != null) {
            topViewAdEventLogger.withContext(aweme.getVideo().getPlayAddr3DFallback());
            topViewAdEventLogger.logAd(C1018060cbE.LJJIJIL, aweme.getAwemeRawAd(), new AObjectS359S0100000_16(enumC1018180cbQ, 2));
        }
    }

    public static void LJIIJJI(TopViewAwemeRawAd topViewAwemeRawAd, EnumC1030740cvg enumC1030740cvg) {
        new TopViewAdEventLogger().logAd(C1018060cbE.LJIIL, topViewAwemeRawAd, new AObjectS359S0100000_16(enumC1030740cvg, 3));
    }

    public final void LJIIIIZZ(Context context, List<Aweme> list) {
        C15O7.LIZJ(new ACallableS422S0100000_16(list, 1));
        C1031100cwG.LIZ().LJIIIIZZ();
        if (LJI()) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                LJIIJ(it2.next(), EnumC1018180cbQ.LOW_DEVICE);
            }
        } else {
            if (C086I.LIZIZ(list)) {
                return;
            }
            C15O7.LIZJ(new ACallableS180S0300000_16(this, list, context, 0));
        }
    }

    public static void LJIIL(final InterfaceC1018210cbT interfaceC1018210cbT, final boolean z, final boolean z2) {
        new TopViewAdEventLogger().logAd(C1018060cbE.LJIILIIL, C1017070cZd.LJIJJLI(interfaceC1018210cbT), new Function1() { // from class: X.0cbG
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String awesomeSplashId;
                AwemeSplashInfo awemeSplashInfoLJJJI;
                InterfaceC1018210cbT interfaceC1018210cbT2 = interfaceC1018210cbT;
                boolean z3 = z;
                boolean z4 = z2;
                C1023640ckE c1023640ckE = (C1023640ckE) obj;
                C1002190cBd c1002190cBd = C1018070cbF.LJIJ;
                if (interfaceC1018210cbT2 != null && (awemeSplashInfoLJJJI = C1017070cZd.LJJJI(interfaceC1018210cbT2)) != null) {
                    awesomeSplashId = awemeSplashInfoLJJJI.getAwesomeSplashId();
                } else {
                    awesomeSplashId = null;
                }
                c1023640ckE.withParam(c1002190cBd, awesomeSplashId);
                c1023640ckE.withParam(C1018070cbF.LJIJI, String.valueOf(z3));
                c1023640ckE.withParam(C1018070cbF.LJIJJ, String.valueOf(z4));
                return null;
            }
        });
    }

    public static boolean LIZIZ(Aweme aweme, VideoUrlModel videoUrlModel, TopViewAdEventLogger topViewAdEventLogger, boolean z) {
        int status;
        C1023960ckk c1023960ckk;
        IVMPreviewAdsOfflineService iVMPreviewAdsOfflineServiceLJIIIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ();
        C1018130cbL c1018130cbL = new C1018130cbL(z, topViewAdEventLogger, aweme, iVMPreviewAdsOfflineServiceLJIIIZ, videoUrlModel);
        if (videoUrlModel == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_model_null");
            LJIIJ(aweme, EnumC1018180cbQ.VIDEO_URL_MODEL_NULL);
            return false;
        }
        videoUrlModel.setSourceId(aweme.getAid());
        String strLJIIIIZZ = C1030680cva.LJIIIIZZ(videoUrlModel.getUrlKey(), videoUrlModel.getFileHash(), !TextUtils.isEmpty(videoUrlModel.getaK()), true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL);
        sbLIZ.append(strLJIIIIZZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (new C0VSJ(strLIZIZ).exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("videoPath has download, path = ");
            sbLIZ2.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video has download, do not download again");
            LJIIJ(aweme, EnumC1018180cbQ.VIDEO_EXISTS);
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("videoPath no download, path = ");
        sbLIZ3.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        List<String> urlList = videoUrlModel.getUrlList();
        if (C086I.LIZIZ(urlList)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_list_null");
            LJIIJ(aweme, EnumC1018180cbQ.VIDEO_URL_LIST_NULL);
            return false;
        }
        String str = (String) ListProtector.get(urlList, 0);
        if (TextUtils.isEmpty(str)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video_url_first_null");
            LJIIJ(aweme, EnumC1018180cbQ.VIDEO_URL_FIRST_NULL);
            return false;
        }
        ArrayList arrayList = new ArrayList(urlList);
        arrayList.remove(str);
        int iLJIILJJIL = C2199681B7e.LJIILJJIL(str, LIZLLL);
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
        if (iDownloadServiceLIZLLL == null) {
            LJIIJ(aweme, EnumC1018180cbQ.DOWNLOAD_SERVICE_NULL);
            return false;
        }
        if (iDownloadServiceLIZLLL.isDownloading(iLJIILJJIL)) {
            LJIIJ(aweme, EnumC1018180cbQ.IS_DOWNLOADING);
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: video is downloading, not start download");
            return false;
        }
        DownloadInfo downloadInfo = iDownloadServiceLIZLLL.getDownloadInfo(iLJIILJJIL);
        if (downloadInfo != null) {
            status = downloadInfo.getStatus();
        } else {
            status = 100;
        }
        String fileHash = videoUrlModel.getFileHash();
        if (z) {
            c1023960ckk = C1018060cbE.LJJIJL;
        } else {
            c1023960ckk = C1018060cbE.LIZIZ;
        }
        topViewAdEventLogger.logAd(c1023960ckk, new AObjectS13S1101000_16(status, downloadInfo, fileHash, 2));
        if (C1017070cZd.LJJJLL(aweme) && !z) {
            String type = EnumC1008920cMU.VIDEO_3D_FOREGROUND.getType();
            String sourceId = videoUrlModel.getSourceId();
            String str2 = (String) C13LP.LJJJLZIJ(0, videoUrlModel.getUrlList());
            if (str2 == null) {
                str2 = "";
            }
            C1016570cYp.LIZJ(type, sourceId, str2, aweme);
        }
        iVMPreviewAdsOfflineServiceLJIIIZ.isEnabled();
        AbstractC2199801B7q abstractC2199801B7qWith = iDownloadServiceLIZLLL.with(str);
        abstractC2199801B7qWith.LJIIIIZZ = arrayList;
        abstractC2199801B7qWith.LJ = LIZLLL;
        abstractC2199801B7qWith.LJIIIZ = fileHash;
        abstractC2199801B7qWith.LIZJ = strLJIIIIZZ;
        abstractC2199801B7qWith.LJIIJJI = c1018130cbL;
        abstractC2199801B7qWith.LJIIJ = "ad_splash_video_preload";
        abstractC2199801B7qWith.LJFF = true;
        abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
        return true;
    }

    public static void LJIILIIL(int i, String str, String str2, boolean z) {
        if (z) {
            return;
        }
        C1031060cwC.LIZ.getClass();
        C1031060cwC.LIZJ().LJFF(i, str, str2, C1030680cva.LJ, true, true);
    }
}
