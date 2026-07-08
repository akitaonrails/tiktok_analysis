package Y;

import X.C1016570cYp;
import X.C1017070cZd;
import X.C1018060cbE;
import X.C1018150cbN;
import X.C1024380clQ;
import X.C1031100cwG;
import X.C1C7U;
import X.C238400w2;
import X.EnumC1008920cMU;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS180S0300000_16 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS180S0300000_16 aCallableS180S0300000_16) {
        String awesomeSplashId;
        Map<String, Aweme> mapLIZLLL;
        AwemeSplashInfo awemeSplashInfoLJJJ;
        C1018150cbN c1018150cbN = (C1018150cbN) aCallableS180S0300000_16.l0;
        List<Aweme> list = (List) aCallableS180S0300000_16.l1;
        Context context = (Context) aCallableS180S0300000_16.l2;
        c1018150cbN.getClass();
        C1C7U.LIZ("TopViewPreloadManager@b174.preload$2L");
        for (Aweme aweme : list) {
            if (!C1018150cbN.LJIILJJIL(aweme)) {
                TopViewAdEventLogger topViewAdEventLogger = new TopViewAdEventLogger(new Object[]{aweme});
                topViewAdEventLogger.logAd(C1018060cbE.LJIIIZ, aweme.getAwemeRawAd());
                if (C1017070cZd.LJJJLL(aweme) && aweme.getVideo() != null) {
                    topViewAdEventLogger.withContext(aweme.getVideo().getPlayAddr3DFallback());
                    topViewAdEventLogger.logAd(C1018060cbE.LJJIJIIJI, aweme.getAwemeRawAd());
                }
                C1018150cbN.LIZ(context, aweme);
                C1031100cwG.LIZ().LJIILIIL(aweme);
            }
        }
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIILIIL(list, "topview_preload", null);
        }
        TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
        if (topViewJsonManager != null) {
            for (Aweme aweme2 : list) {
                if (aweme2 != null) {
                    AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                    C1031100cwG.LIZ().LJIIJ();
                    statusSafety.setPrivateStatus(0);
                    statusSafety.setAllowComment(true);
                    statusSafety.setAllowShare(true);
                }
                AwemeSplashInfo awemeSplashInfoLJJJ2 = C1017070cZd.LJJJ(aweme2);
                if (awemeSplashInfoLJJJ2 != null) {
                    awemeSplashInfoLJJJ2.anchorId = AwemeExtKt.getAuthorUid(aweme2);
                }
                if (aweme2 != null && (awemeSplashInfoLJJJ = C1017070cZd.LJJJ(aweme2)) != null) {
                    awesomeSplashId = awemeSplashInfoLJJJ.getAwesomeSplashId();
                } else {
                    awesomeSplashId = null;
                }
                if (!TextUtils.isEmpty(awesomeSplashId) && (mapLIZLLL = topViewJsonManager.LIZLLL(null)) != null) {
                    mapLIZLLL.put(awesomeSplashId, aweme2);
                }
            }
            topViewJsonManager.LJII();
        }
        C1C7U.LIZIZ("TopViewPreloadManager@b174.preload$2L");
        return null;
    }

    public static final Object call$1(ACallableS180S0300000_16 aCallableS180S0300000_16) {
        C1C7U.LIZ("TopViewMultiContentHelper@c54a.getMultiContentDownloadListener$1$onSuccessed$1");
        C1016570cYp.LIZ((Aweme) aCallableS180S0300000_16.l0, EnumC1008920cMU.MULTI_CONTENT.getType(), true, ((C238400w2) aCallableS180S0300000_16.l1).element, ((DownloadInfo) aCallableS180S0300000_16.l2).getName(), ((DownloadInfo) aCallableS180S0300000_16.l2).getUrl(), "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopViewMultiContentHelper@c54a.getMultiContentDownloadListener$1$onSuccessed$1");
        return unit;
    }

    public ACallableS180S0300000_16(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
