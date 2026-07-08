package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryJSInfoModel;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import kotlin.jvm.internal.AwS6S3100000_16;

/* JADX INFO: renamed from: X.0dAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039720dAA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public final C1035880d3y LIZ;
    public final InterfaceC1036110d4L LIZIZ;
    public Boolean LIZJ;
    public C1039850dAN LIZLLL;
    public volatile C1053550dWT LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1039720dAA.class, "adWebHistoryManager", "getAdWebHistoryManager()Lcom/ss/android/ugc/aweme/history/AdWebHistoryManager;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C1039720dAA() {
        this(null, null);
    }

    public final C1053550dWT LIZIZ() {
        C1053550dWT c1053550dWT = this.LJ;
        if (c1053550dWT == null) {
            synchronized (this) {
                c1053550dWT = this.LJ;
                if (c1053550dWT == null) {
                    C1053550dWT c1053550dWT2 = (C1053550dWT) C1807670x8n.LJJJJI();
                    this.LJ = c1053550dWT2;
                    return c1053550dWT2;
                }
            }
        }
        return c1053550dWT;
    }

    public final void LIZJ(Object obj) {
        String str;
        String adContainerId = null;
        if ((obj instanceof String) && (str = (String) obj) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1038790d8f c1038790d8f = C1038790d8f.LIZ;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            c1038790d8f.getClass();
            String strLIZ = C1038790d8f.LIZ(lValueOf);
            C1227904rF.LIZ.getClass();
            AdWebHistoryJSInfoModel adWebHistoryJSInfoModel = (AdWebHistoryJSInfoModel) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), str, AdWebHistoryJSInfoModel.class);
            C1035880d3y c1035880d3y = this.LIZ;
            if (c1035880d3y != null) {
                adContainerId = c1035880d3y.getAdContainerId();
            }
            AdWebHistoryEntity adWebHistoryEntity = new AdWebHistoryEntity(adWebHistoryJSInfoModel.url, adWebHistoryJSInfoModel.title, adWebHistoryJSInfoModel.coverUrl, Long.valueOf(jCurrentTimeMillis), strLIZ, null, null, null, null, 0, adContainerId);
            C1053550dWT c1053550dWTLIZIZ = LIZIZ();
            Boolean bool = Boolean.TRUE;
            c1053550dWTLIZIZ.LJII(adWebHistoryEntity, bool, bool, 3);
            Long l = LIZIZ().LIZIZ().LJ;
            String str2 = adWebHistoryEntity.url;
            String str3 = adWebHistoryEntity.coverUrl;
            String str4 = adWebHistoryEntity.title;
            C1040580dBY c1040580dBY = new C1040580dBY(new Object[0]);
            C1040750dBp.LIZ.getClass();
            c1040580dBY.log(C1040750dBp.LJJJ, new AwS6S3100000_16(str2, str3, str4, l, 5));
        }
    }

    public C1039720dAA(C1035880d3y c1035880d3y, InterfaceC1036110d4L interfaceC1036110d4L) {
        this.LIZ = c1035880d3y;
        this.LIZIZ = interfaceC1036110d4L;
    }

    public final void LIZ(WebKitView webKitView, C1035880d3y c1035880d3y) {
        String accessToken;
        AmazonCheckoutAdModel amazonCheckoutData;
        AmazonCheckoutAdModel amazonCheckoutData2;
        if (!(c1035880d3y instanceof C1035880d3y)) {
            return;
        }
        if (c1035880d3y.enableAmazonAd() && webKitView != null) {
            this.LIZLLL = new C1039850dAN(webKitView, this.LIZIZ, c1035880d3y);
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd != null && (amazonCheckoutData2 = awemeRawAd.getAmazonCheckoutData()) != null) {
                accessToken = amazonCheckoutData2.getAccessToken();
            } else {
                accessToken = null;
            }
            AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd2 != null && (amazonCheckoutData = awemeRawAd2.getAmazonCheckoutData()) != null) {
                amazonCheckoutData.getExpireTtlSec();
            }
            C0W7S.LIZIZ(accessToken, null);
        }
        if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJJI(this.LIZ)) {
            LIZIZ().LJIIIIZZ(this.LIZ);
            LIZIZ().LIZIZ().LJFF = 0;
        }
    }

    public final void LIZLLL(String str, String str2) {
        String adContainerId;
        if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJJI(this.LIZ)) {
            C2452409jG c2452409jGLIZIZ = LIZIZ().LIZIZ();
            if (C0DRY.LIZ(c2452409jGLIZIZ.LIZ) == 0 || C0DRY.LIZ(c2452409jGLIZIZ.LIZ) >= c2452409jGLIZIZ.LJFF) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1038790d8f c1038790d8f = C1038790d8f.LIZ;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                c1038790d8f.getClass();
                String strLIZ = C1038790d8f.LIZ(lValueOf);
                C1035880d3y c1035880d3y = this.LIZ;
                if (c1035880d3y != null) {
                    adContainerId = c1035880d3y.getAdContainerId();
                } else {
                    adContainerId = null;
                }
                AdWebHistoryEntity adWebHistoryEntity = new AdWebHistoryEntity(str, str2, null, Long.valueOf(jCurrentTimeMillis), strLIZ, null, null, null, null, 0, adContainerId);
                C1053550dWT c1053550dWTLIZIZ = LIZIZ();
                Boolean bool = Boolean.FALSE;
                c1053550dWTLIZIZ.LJII(adWebHistoryEntity, bool, bool, 4);
            }
        }
    }
}
