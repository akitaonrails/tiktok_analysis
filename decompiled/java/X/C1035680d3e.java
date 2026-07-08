package X;

import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0d3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035680d3e implements InterfaceC1036860d5Y {
    public InterfaceC1035710d3h LIZ;
    public Runnable LIZIZ;
    public C1035880d3y LIZJ;
    public WebView LIZLLL;
    public boolean LJ;
    public SparkContext LJFF;
    public InterfaceC1036850d5X LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(504));

    @Override // X.InterfaceC1036860d5Y
    public final void LIZ() {
        if (!this.LJ) {
            C1035880d3y c1035880d3y = this.LIZJ;
            if (c1035880d3y != null) {
                c1035880d3y.setClickedCloseAll(true);
            }
            this.LJIIIIZZ = true;
            this.LJII = false;
            LIZJ(null, true);
        }
        if (this.LJII) {
            return;
        }
        InterfaceC1035710d3h interfaceC1035710d3h = this.LIZ;
        if (interfaceC1035710d3h != null) {
            interfaceC1035710d3h.LIZ();
        }
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC1036860d5Y
    public final void LIZIZ() {
        InterfaceC1036110d4L interfaceC1036110d4L;
        SparkContext sparkContext = this.LJFF;
        if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJIJI();
        }
        InterfaceC1035710d3h interfaceC1035710d3h = this.LIZ;
        if (interfaceC1035710d3h != null) {
            interfaceC1035710d3h.LIZIZ();
        }
    }

    public final void LJ(boolean z) {
        C1035880d3y c1035880d3y;
        AwemeRawAd awemeRawAd;
        LandingPageSurveyModel landingPageSurvey;
        String commerceEnterFrom;
        String string;
        String string2;
        String logExtra;
        AwemeRawAd awemeRawAd2;
        String requestId;
        AwemeRawAd awemeRawAd3;
        Long creativeId;
        AwemeRawAd awemeRawAd4;
        Long adId;
        AwemeRawAd awemeRawAd5;
        AdStyleActionModel adStyleActionModel;
        C1035880d3y c1035880d3y2 = this.LIZJ;
        String refer = null;
        if (c1035880d3y2 != null && c1035880d3y2.getAwemeRawAd() != null) {
            C1035880d3y c1035880d3y3 = this.LIZJ;
            if ((c1035880d3y3 != null && (awemeRawAd5 = c1035880d3y3.getAwemeRawAd()) != null && (adStyleActionModel = awemeRawAd5.getAdStyleActionModel()) != null && (landingPageSurvey = adStyleActionModel.landingPageSurvey) != null) || ((c1035880d3y = this.LIZJ) != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageSurvey = awemeRawAd.getLandingPageSurvey()) != null)) {
                if (z) {
                    C1035880d3y c1035880d3y4 = this.LIZJ;
                    String str = "";
                    if (c1035880d3y4 == null || (commerceEnterFrom = c1035880d3y4.getCommerceEnterFrom()) == null) {
                        commerceEnterFrom = "";
                    }
                    IAdLandPageSurveyService iAdLandPageSurveyService = (IAdLandPageSurveyService) this.LJIIIZ.getValue();
                    C1035880d3y c1035880d3y5 = this.LIZJ;
                    if (c1035880d3y5 == null || (awemeRawAd4 = c1035880d3y5.getAwemeRawAd()) == null || (adId = awemeRawAd4.getAdId()) == null || (string = adId.toString()) == null) {
                        string = "";
                    }
                    C1035880d3y c1035880d3y6 = this.LIZJ;
                    if (c1035880d3y6 == null || (awemeRawAd3 = c1035880d3y6.getAwemeRawAd()) == null || (creativeId = awemeRawAd3.getCreativeId()) == null || (string2 = creativeId.toString()) == null) {
                        string2 = "";
                    }
                    C1035880d3y c1035880d3y7 = this.LIZJ;
                    if (c1035880d3y7 != null && (requestId = c1035880d3y7.getRequestId()) != null) {
                        str = requestId;
                    }
                    C1035880d3y c1035880d3y8 = this.LIZJ;
                    if (c1035880d3y8 != null && (awemeRawAd2 = c1035880d3y8.getAwemeRawAd()) != null) {
                        logExtra = awemeRawAd2.getLogExtra();
                    } else {
                        logExtra = null;
                    }
                    C1035880d3y c1035880d3y9 = this.LIZJ;
                    if (c1035880d3y9 != null) {
                        refer = c1035880d3y9.getRefer();
                    }
                    iAdLandPageSurveyService.LJ(new C1028340cro(commerceEnterFrom, string, string2, str, logExtra, refer), landingPageSurvey);
                    return;
                }
                ((IAdLandPageSurveyService) this.LJIIIZ.getValue()).LIZ();
            }
        }
    }

    @C14EU
    public final void onEvent(C0DQL c0dql) {
        WebView webView;
        if (c0dql != null && c0dql.LIZ != 0 && (webView = this.LIZLLL) != null && this.LIZIZ != null && webView.hashCode() == c0dql.LIZ) {
            C1035880d3y c1035880d3y = this.LIZJ;
            if (c1035880d3y != null) {
                c1035880d3y.setClickedCloseAll(true);
            }
            LIZJ(null, false);
        }
    }

    @Override // X.InterfaceC1036860d5Y
    public final boolean LIZJ(InterfaceC1036270d4b interfaceC1036270d4b, boolean z) {
        InterfaceC1036850d5X interfaceC1036850d5X;
        SparkContext sparkContext;
        InterfaceC1036190d4T interfaceC1036190d4T;
        Activity activityLJFF;
        C1026310coX adlpPopUpModel;
        C1028100crQ popUpCustomConfig;
        C1035880d3y c1035880d3y;
        C1026310coX adlpPopUpModel2;
        C1028100crQ popUpCustomConfig2;
        InterfaceC1036850d5X interfaceC1036850d5X2 = null;
        boolean z2 = false;
        if (this.LIZLLL != null && !z && (c1035880d3y = this.LIZJ) != null && (adlpPopUpModel2 = c1035880d3y.getAdlpPopUpModel()) != null && (popUpCustomConfig2 = adlpPopUpModel2.getPopUpCustomConfig()) != null && popUpCustomConfig2.isDirectOpenLandingPage()) {
            InterfaceC1036850d5X interfaceC1036850d5X3 = this.LJI;
            if (interfaceC1036850d5X3 != null && interfaceC1036850d5X3.canGoBack()) {
                InterfaceC1036850d5X interfaceC1036850d5X4 = this.LJI;
                if (interfaceC1036850d5X4 != null) {
                    interfaceC1036850d5X4.LIZIZ(1);
                }
                return true;
            }
            if (interfaceC1036270d4b == null) {
                return false;
            }
            interfaceC1036270d4b.ha(null, null, "system_back", null);
            return false;
        }
        SparkContext sparkContext2 = this.LJFF;
        if (sparkContext2 != null) {
            interfaceC1036850d5X2 = (InterfaceC1036850d5X) sparkContext2.LJFF(InterfaceC1036850d5X.class);
        }
        if (this.LIZLLL != null) {
            boolean z3 = C288380BSa.LIZ;
            if (z3 && interfaceC1036850d5X2 != null && interfaceC1036850d5X2.canGoBack()) {
                if (!z) {
                    interfaceC1036850d5X2.LIZIZ(1);
                    return true;
                }
            } else if (!z && ((((interfaceC1036850d5X = this.LJI) != null && !interfaceC1036850d5X.canGoBack()) || !z3) && (sparkContext = this.LJFF) != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class)) != null && interfaceC1036190d4T.LJIIL(10))) {
                return true;
            }
            InterfaceC1036850d5X interfaceC1036850d5X5 = this.LJI;
            if ((interfaceC1036850d5X5 != null && !interfaceC1036850d5X5.canGoBack()) || z) {
                ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 240);
                C1035880d3y c1035880d3y2 = this.LIZJ;
                if ((c1035880d3y2 == null || (adlpPopUpModel = c1035880d3y2.getAdlpPopUpModel()) == null || (popUpCustomConfig = adlpPopUpModel.getPopUpCustomConfig()) == null || !popUpCustomConfig.getDisableSurveyWhenClose()) && (activityLJFF = C2214201BlK.LJFF()) != null) {
                    IAdLandPageSurveyService iAdLandPageSurveyService = (IAdLandPageSurveyService) this.LJIIIZ.getValue();
                    if (iAdLandPageSurveyService != null && iAdLandPageSurveyService.LIZIZ(activityLJFF, new AwS417S0200000_16(this, aRunnableS116S0100000_16, 110))) {
                        z2 = true;
                    }
                    this.LJII = z2;
                    if (z2) {
                        return true;
                    }
                }
            }
            Runnable runnable = this.LIZIZ;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }

    @Override // X.InterfaceC1036860d5Y
    public final void LIZLLL(C1035880d3y c1035880d3y, C1035580d3U c1035580d3U, WebKitView webKitView, boolean z, SparkContext sparkContext) {
        InterfaceC1036850d5X interfaceC1036850d5X;
        if (c1035880d3y == null) {
            return;
        }
        this.LIZJ = c1035880d3y;
        this.LJFF = sparkContext;
        if (sparkContext != null) {
            interfaceC1036850d5X = (InterfaceC1036850d5X) sparkContext.LJFF(InterfaceC1036850d5X.class);
        } else {
            interfaceC1036850d5X = null;
        }
        this.LJI = interfaceC1036850d5X;
        this.LIZ = this.LIZ;
        this.LIZLLL = webKitView;
        this.LJ = z;
        if (c1035580d3U != null) {
            this.LIZ = c1035580d3U;
        }
        LJ(true);
    }
}
