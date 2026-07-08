package X;

import Y.ARunnableS20S1200000_16;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import com.ss.android.ugc.aweme.web.service.IAdUserAgent;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0d9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039450d9j implements InterfaceC1036850d5X {
    public final SparkContext LIZ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ;
    public final C1035880d3y LIZJ;
    public final InterfaceC1036210d4V LIZLLL;

    @Override // X.InterfaceC1036850d5X
    public final int LIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getCurrentPageCount();
        }
        return 0;
    }

    @Override // X.InterfaceC1036850d5X
    public final Integer LIZJ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        return Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getCurrentWebIndex() : 0);
    }

    @Override // X.InterfaceC1036850d5X
    public final int LIZLLL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getCurrentPageOrder();
        }
        return 0;
    }

    @Override // X.InterfaceC1036850d5X
    public final void LJ() {
        AdWebMultiTabModel multiTapModel;
        AdWebMultiTabModel multiTapModel2;
        C1035880d3y c1035880d3y = this.LIZJ;
        if (c1035880d3y != null && (multiTapModel2 = c1035880d3y.getMultiTapModel()) != null) {
            multiTapModel2.setCurrentTabIndex(LIZJ().intValue());
        }
        C1035880d3y c1035880d3y2 = this.LIZJ;
        if (c1035880d3y2 != null && (multiTapModel = c1035880d3y2.getMultiTapModel()) != null) {
            multiTapModel.setTotalTabCount(LJIIIZ().intValue());
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LIZJ);
        C1023960ckk c1023960ckk = C2265581Dm0.LIZ;
        C1035880d3y c1035880d3y3 = this.LIZJ;
        adWebEventLogger.logAd(c1023960ckk, c1035880d3y3 != null ? c1035880d3y3.getAwemeRawAd() : null, new AwS595S0100000_16(this, 211));
        LJIIIIZZ();
    }

    @Override // X.InterfaceC1036850d5X
    public final void LJIIIIZZ() {
        InterfaceC1036210d4V interfaceC1036210d4V = this.LIZLLL;
        if (interfaceC1036210d4V != null) {
            interfaceC1036210d4V.LJIIIZ(canGoBack());
        }
        InterfaceC1036210d4V interfaceC1036210d4V2 = this.LIZLLL;
        if (interfaceC1036210d4V2 != null) {
            interfaceC1036210d4V2.LJII(canGoForward());
        }
        InterfaceC1036400d4o interfaceC1036400d4o = (InterfaceC1036400d4o) this.LIZ.LJFF(InterfaceC1036400d4o.class);
        if (interfaceC1036400d4o != null) {
            interfaceC1036400d4o.LJ(canGoBack(), canGoForward());
        }
    }

    @Override // X.InterfaceC1036850d5X
    public final Integer LJIIIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        return Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getWebHistorySize() : 1);
    }

    public final void LJIIJJI() {
        WebView webView;
        C1039440d9i c1039440d9i;
        InterfaceC1036620d5A interfaceC1036620d5A;
        InterfaceC1039650dA3 interfaceC1039650dA3;
        C1035880d3y c1035880d3y;
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        View viewE1 = (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) ? null : kitView.e1();
        if (!(viewE1 instanceof WebView) || (webView = (WebView) viewE1) == null) {
            return;
        }
        SparkContext sparkContext = this.LIZ;
        InterfaceC1038080d7W interfaceC1038080d7W = sparkContext != null ? (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class) : null;
        if (!(interfaceC1038080d7W instanceof C1039440d9i) || (c1039440d9i = (C1039440d9i) interfaceC1038080d7W) == null) {
            return;
        }
        String url = webView.getUrl();
        if (url == null && ((c1035880d3y = c1039440d9i.LIZ) == null || (url = c1035880d3y.getCurrentUrl()) == null)) {
            return;
        }
        C1035880d3y c1035880d3y2 = c1039440d9i.LIZ;
        if (c1035880d3y2 != null) {
            c1035880d3y2.setCurrentUrl(url);
        }
        if (C0BSZ.LIZ) {
            C1039700dA8.LIZ.getClass();
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS20S1200000_16(webView, c1039440d9i, url, 4));
            return;
        }
        C1039700dA8 c1039700dA8 = C1039700dA8.LIZ;
        C1035880d3y c1035880d3y3 = c1039440d9i.LIZ;
        c1039700dA8.getClass();
        C1039700dA8.LIZIZ(c1035880d3y3, url);
        SparkContext sparkContext2 = c1039440d9i.LIZIZ;
        if (sparkContext2 != null && (interfaceC1039650dA3 = (InterfaceC1039650dA3) sparkContext2.LJFF(InterfaceC1039650dA3.class)) != null) {
            interfaceC1039650dA3.N0();
        }
        SparkContext sparkContext3 = c1039440d9i.LIZIZ;
        if (sparkContext3 == null || (interfaceC1036620d5A = (InterfaceC1036620d5A) sparkContext3.LJFF(InterfaceC1036620d5A.class)) == null) {
            return;
        }
        interfaceC1036620d5A.N0();
    }

    @Override // X.InterfaceC1036850d5X
    public final boolean canGoBack() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIILLIIL();
    }

    @Override // X.InterfaceC1036850d5X
    public final boolean canGoForward() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIZILJ();
    }

    public final boolean LJIIJ() {
        return ((Number) C1098004Re.LIZ.getValue()).intValue() == 1 && LIZJ().intValue() > 0;
    }

    @Override // X.InterfaceC1036850d5X
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJII() {
        return this.LIZIZ;
    }

    public C1039450d9j(SparkContext sparkContext) {
        C1541940qEC c1541940qEC;
        this.LIZ = sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = null;
        if (sparkContext.LJJIJLIJ() instanceof SparkFragment) {
            C1541940qEC c1541940qEC2 = ((SparkFragment) sparkContext.LJJIJLIJ()).LLILZ;
            if (c1541940qEC2 != null) {
                sparkView = c1541940qEC2.getSparkView();
            }
        } else {
            InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
            if ((interfaceC1059280dfiLJJIJLIJ instanceof C1541940qEC) && (c1541940qEC = (C1541940qEC) interfaceC1059280dfiLJJIJLIJ) != null) {
                sparkView = c1541940qEC.getSparkView();
            }
        }
        this.LIZIZ = sparkView;
        this.LIZJ = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        this.LIZLLL = (InterfaceC1036210d4V) sparkContext.LJFF(InterfaceC1036210d4V.class);
    }

    @Override // X.InterfaceC1036850d5X
    public final void LIZIZ(int i) {
        View viewE1;
        InterfaceC1541990qEH kitView;
        boolean z;
        boolean z2;
        String second;
        Pair<Boolean, String> backUrl;
        Pair<Boolean, String> backUrl2;
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) this.LIZ.LJFF(InterfaceC1036110d4L.class);
        WebView webView = null;
        if (interfaceC1036110d4L != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIILLIIL()) {
                z = true;
            } else {
                z = false;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (backUrl2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getBackUrl()) != null && backUrl2.getFirst().booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (backUrl = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getBackUrl()) != null) {
                second = backUrl.getSecond();
            } else {
                second = null;
            }
            interfaceC1036110d4L.LJJJJZI(i, second, z, z2);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJIILLIIL()) {
            C1035880d3y c1035880d3y = this.LIZJ;
            if (c1035880d3y != null) {
                c1035880d3y.setBack(1);
            }
            C1035880d3y c1035880d3y2 = this.LIZJ;
            if (c1035880d3y2 != null) {
                c1035880d3y2.setGoForward(0);
            }
        }
        int iIntValue = LIZJ().intValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LJJIII();
        }
        LJIIIIZZ();
        if (LIZJ().intValue() != iIntValue) {
            LJIIJJI();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6.getKitView()) != null) {
                viewE1 = kitView.e1();
            } else {
                viewE1 = null;
            }
            if (viewE1 instanceof WebView) {
                webView = (WebView) viewE1;
            }
            InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LJFF(InterfaceC1036190d4T.class);
            if (interfaceC1036190d4T != null) {
                interfaceC1036190d4T.LJIILJJIL(webView);
            }
        }
    }

    @Override // X.InterfaceC1036850d5X
    public final void LJFF(SparkContext sparkContext) {
        View viewE1;
        WebView webView;
        String userAgentString;
        boolean z;
        AdWebMultiTabModel multiTapModel;
        AdWebMultiTabModel multiTapModel2;
        WebSettings settings;
        AwemeRawAd awemeRawAd;
        int i;
        String currentUrl;
        IThirdPartyUtilService iThirdPartyUtilService;
        Context context;
        String strLIZ;
        WebSettings settings2;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        AwemeRawAd awemeRawAd2 = null;
        if (sparkContext != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        } else {
            viewE1 = null;
        }
        if (viewE1 instanceof WebView) {
            webView = (WebView) viewE1;
        } else {
            webView = null;
        }
        String str = "";
        if (webView == null || (settings2 = webView.getSettings()) == null || (userAgentString = settings2.getUserAgentString()) == null) {
            userAgentString = "";
        }
        if (((Boolean) C1098104Rf.LIZ.getValue()).booleanValue()) {
            OptIABUAExp.OptIABUAModel optIABUAModelLIZIZ = OptIABUAExp.LIZIZ();
            if (optIABUAModelLIZIZ == null) {
                i = 0;
            } else {
                i = optIABUAModelLIZIZ.type;
            }
            C1035880d3y c1035880d3y = this.LIZJ;
            if (c1035880d3y == null || (currentUrl = c1035880d3y.getCurrentUrl()) == null) {
                currentUrl = "";
            }
            if (i != 0 && ((u.LJJIIJZLJL(currentUrl, "http://", false) || u.LJJIIJZLJL(currentUrl, "https://", false)) && (iThirdPartyUtilService = (IThirdPartyUtilService) PluggableExtentionKt.pluggableSpi$default(IThirdPartyUtilService.class, false, false, false, 14, null)) != null && iThirdPartyUtilService.LIZLLL(currentUrl) && webView != null && (context = webView.getContext()) != null)) {
                IAdUserAgent iAdUserAgent = (IAdUserAgent) PluggableExtentionKt.pluggableSpi$default(IAdUserAgent.class, false, false, false, 14, null);
                if (iAdUserAgent != null && (strLIZ = iAdUserAgent.LIZ(context, webView, i)) != null) {
                    str = strLIZ;
                }
                userAgentString = str;
            }
        }
        C1039700dA8 c1039700dA8 = C1039700dA8.LIZ;
        C1035880d3y c1035880d3y2 = this.LIZJ;
        if (c1035880d3y2 != null && (awemeRawAd = c1035880d3y2.getAwemeRawAd()) != null && awemeRawAd.isEnableWebGoogleLogin()) {
            z = true;
        } else {
            z = false;
        }
        c1039700dA8.getClass();
        String strLIZLLL = C1039700dA8.LIZLLL(userAgentString, z);
        if (webView != null && (settings = webView.getSettings()) != null) {
            C786410Ut5.se(settings, strLIZLLL);
        }
        C1035880d3y c1035880d3y3 = this.LIZJ;
        if (c1035880d3y3 != null && (multiTapModel2 = c1035880d3y3.getMultiTapModel()) != null) {
            multiTapModel2.setCurrentTabIndex(LIZJ().intValue());
        }
        C1035880d3y c1035880d3y4 = this.LIZJ;
        if (c1035880d3y4 != null && (multiTapModel = c1035880d3y4.getMultiTapModel()) != null) {
            multiTapModel.setTotalTabCount(LJIIIZ().intValue());
        }
        InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LJFF(InterfaceC1036190d4T.class);
        if (interfaceC1036190d4T != null) {
            interfaceC1036190d4T.LJIILJJIL(webView);
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LIZJ);
        C1023960ckk c1023960ckk = C2265601Dm2.LIZ;
        C1035880d3y c1035880d3y5 = this.LIZJ;
        if (c1035880d3y5 != null) {
            awemeRawAd2 = c1035880d3y5.getAwemeRawAd();
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd2, new AwS595S0100000_16(this, 210));
        LJIIIIZZ();
    }

    @Override // X.InterfaceC1036850d5X
    public final void LJI(int i) {
        View viewE1;
        InterfaceC1541990qEH kitView;
        WebKitView webKitView;
        boolean z;
        boolean z2;
        String second;
        Pair<Boolean, String> forwardUrl;
        Pair<Boolean, String> forwardUrl2;
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) this.LIZ.LJFF(InterfaceC1036110d4L.class);
        WebView webView = null;
        if (interfaceC1036110d4L != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIZILJ()) {
                z = true;
            } else {
                z = false;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (forwardUrl2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getForwardUrl()) != null && forwardUrl2.getFirst().booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (forwardUrl = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getForwardUrl()) != null) {
                second = forwardUrl.getSecond();
            } else {
                second = null;
            }
            interfaceC1036110d4L.LIZLLL(i, second, z, z2);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJIIZILJ()) {
            C1035880d3y c1035880d3y = this.LIZJ;
            if (c1035880d3y != null) {
                c1035880d3y.setGoForward(1);
            }
            C1035880d3y c1035880d3y2 = this.LIZJ;
            if (c1035880d3y2 != null) {
                c1035880d3y2.setBack(0);
            }
        }
        int iIntValue = LIZJ().intValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null) {
            C1530030puz.LIZIZ("SparkView", "============goForward============", sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLILZLL);
            InterfaceC1541990qEH interfaceC1541990qEH = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLILZIL;
            if ((interfaceC1541990qEH instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEH) != null) {
                if (webKitView.canGoForward()) {
                    webKitView.goForward();
                    C1530030puz.LIZIZ("SparkView", "current view goForward", webKitView.getHybridContext());
                } else if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL < ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLLF).size() - 1) {
                    WebKitView webKitView2 = (WebKitView) ListProtector.get(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLLF, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL);
                    int i2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL + 1;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL = i2;
                    WebKitView webKitView3 = (WebKitView) ListProtector.get(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLLF, i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("try change tab from ");
                    sbLIZ.append(webKitView2.getHybridContext().containerId);
                    sbLIZ.append(" to ");
                    sbLIZ.append(webKitView3.getHybridContext().containerId);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLILZLL);
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL);
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LJIJI();
                }
            }
        }
        LJIIIIZZ();
        if (LIZJ().intValue() != iIntValue) {
            LJIIJJI();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 = this.LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6.getKitView()) != null) {
                viewE1 = kitView.e1();
            } else {
                viewE1 = null;
            }
            if (viewE1 instanceof WebView) {
                webView = (WebView) viewE1;
            }
            InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LJFF(InterfaceC1036190d4T.class);
            if (interfaceC1036190d4T != null) {
                interfaceC1036190d4T.LJIILJJIL(webView);
            }
        }
    }
}
