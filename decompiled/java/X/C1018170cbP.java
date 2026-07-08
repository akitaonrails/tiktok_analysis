package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.settings.AnoleVideoPreloadModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0cbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018170cbP {
    public final ILikeEffectService LIZ;
    public final IDownloadService LIZIZ = (IDownloadService) PluggableExtentionKt.pluggableSpi$default(IDownloadService.class, false, false, false, 14, null);
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1641));

    public C1018170cbP(LikeEffectServiceImpl likeEffectServiceImpl) {
        this.LIZ = likeEffectServiceImpl;
    }

    public final void LIZ(final Aweme aweme) {
        IDownloadService iDownloadService;
        final String str;
        final List<String> list;
        long j;
        Map<String, AnoleComponentModel> map;
        if (aweme == null || (iDownloadService = this.LIZIZ) == null) {
            return;
        }
        AlphaVideoData alphaVideoDataLJIIL = this.LIZ.LJIIL(aweme);
        AnoleComponentModel anoleComponentModel = null;
        if (alphaVideoDataLJIIL != null) {
            str = alphaVideoDataLJIIL.vid;
            list = alphaVideoDataLJIIL.urlList;
        } else {
            str = null;
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.LIZJ.getValue());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && !list.isEmpty() && str != null && str.length() != 0) {
            if (((AnoleVideoPreloadModel) C2249408rc.LIZIZ.getValue()).enable) {
                String str2 = (String) this.LIZJ.getValue();
                String str3 = alphaVideoDataLJIIL.fileHash;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && list != null && str != null) {
                    AnoleModel anoleModel = awemeRawAd.getAnoleModel();
                    if (anoleModel != null && (map = anoleModel.components) != null) {
                        anoleComponentModel = map.get("premium_like_effect");
                    }
                    AnoleModel anoleModel2 = awemeRawAd.getAnoleModel();
                    if (anoleModel2 != null) {
                        j = anoleModel2.templateID;
                    } else {
                        j = 0;
                    }
                    C1016460cYe c1016460cYe = new C1016460cYe(list, str, str3, str2, str, anoleComponentModel, j, "commerce_add_on_like_effect");
                    IAnoleService iAnoleService = (IAnoleService) PluggableExtentionKt.pluggableSpi$default(IAnoleService.class, false, false, false, 14, null);
                    if (iAnoleService != null) {
                        iAnoleService.LJIIIIZZ(c1016460cYe, awemeRawAd, new InterfaceC1016480cYg() { // from class: X.0cYt
                            @Override // X.InterfaceC1016480cYg
                            public final void LIZ(String str4, int i, EnumC1016500cYi enumC1016500cYi) {
                            }

                            @Override // X.InterfaceC1016480cYg
                            public final void LIZIZ(String str4) {
                            }

                            @Override // X.InterfaceC1016480cYg
                            public final void onSuccess(String str4) {
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            if (!((Boolean) C0A7F.LIZ.getValue()).booleanValue()) {
                if (str.length() != 0 && !list.isEmpty()) {
                    C1482580ogS c1482580ogS = new C1482580ogS();
                    c1482580ogS.LIZ = str;
                    C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                    c1058540deW.LIZIZ = str;
                    c1058540deW.LIZLLL = list;
                    C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
                    c1482580ogSLIZ.getClass();
                    C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogSLIZ).LIZ();
                    C582130MsN.LIZ().LJ().getClass();
                    C1014030cUj.LIZ.LJIILLIIL(((Number) C0BBU.LIZ.getValue()).intValue(), Collections.singletonList(c1482560ogQLIZ));
                    return;
                }
                return;
            }
            IDownloadListener iDownloadListener = new IDownloadListener() { // from class: X.0cYq
                public final long LL = System.currentTimeMillis();

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
                    C1016570cYp.LIZIZ(aweme, "premium_like_effect", false, this.LL, str, list, "download canceled.");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    Aweme aweme2 = aweme;
                    String str4 = str;
                    String str5 = (String) C13LP.LJJJLZIJ(0, list);
                    if (str5 == null) {
                        str5 = "";
                    }
                    C1016570cYp.LIZJ("premium_like_effect", str4, str5, aweme2);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String name;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("like effect download onSuccessed name=");
                    String url = null;
                    if (downloadInfo != null) {
                        name = downloadInfo.getName();
                    } else {
                        name = null;
                    }
                    sbLIZ2.append(name);
                    sbLIZ2.append(", url=");
                    if (downloadInfo != null) {
                        url = downloadInfo.getUrl();
                    }
                    sbLIZ2.append(url);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1016570cYp.LIZIZ(aweme, "premium_like_effect", true, this.LL, str, list, "");
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    String name;
                    String url;
                    String message;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("like effect download failed name=");
                    String message2 = null;
                    if (downloadInfo != null) {
                        name = downloadInfo.getName();
                    } else {
                        name = null;
                    }
                    sbLIZ2.append(name);
                    sbLIZ2.append(", url=");
                    if (downloadInfo != null) {
                        url = downloadInfo.getUrl();
                    } else {
                        url = null;
                    }
                    sbLIZ2.append(url);
                    sbLIZ2.append(" \n error = ");
                    if (baseException != null) {
                        message2 = baseException.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Aweme aweme2 = aweme;
                    long j2 = this.LL;
                    String str4 = str;
                    List<String> list2 = list;
                    if (baseException == null || (message = baseException.getMessage()) == null) {
                        message = "download failed.";
                    }
                    C1016570cYp.LIZIZ(aweme2, "premium_like_effect", false, j2, str4, list2, message);
                }
            };
            try {
                if (new C0VSJ(strLIZIZ).exists()) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            String str4 = (String) ListProtector.get(list, 0);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.remove(str4);
            String str5 = alphaVideoDataLJIIL.fileHash;
            AbstractC2199801B7q abstractC2199801B7qWith = iDownloadService.with(str4);
            abstractC2199801B7qWith.LJIIIIZZ = arrayList;
            abstractC2199801B7qWith.LJ = (String) this.LIZJ.getValue();
            abstractC2199801B7qWith.LJIIIZ = str5;
            abstractC2199801B7qWith.LIZJ = str;
            abstractC2199801B7qWith.LJIIJJI = iDownloadListener;
            abstractC2199801B7qWith.LJIIJ = "commerce_add_on_like_effect";
            abstractC2199801B7qWith.LJFF = true;
            abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.VIDEO);
        }
    }
}
