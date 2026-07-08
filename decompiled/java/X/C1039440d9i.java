package X;

import Y.ARunnableS20S1200000_16;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.network.LeadAdReporter;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.CommerceWebToCrossSetting;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.State;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.FailMsgModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.business.special.CWebViewInterceptor;
import com.ss.android.ugc.aweme.web.experiment.FixIabEsFocusExp;
import com.ss.android.ugc.aweme.web.experiment.OptIABGestureGoBackOrGoForwardExp;
import com.ss.android.ugc.aweme.web.service.IAdUserAgent;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;
import defpackage.h8;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS21S1100100_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039440d9i implements InterfaceC1038080d7W {
    public C1035880d3y LIZ;
    public SparkContext LIZIZ;
    public C1039450d9j LIZJ;
    public C1040740dBo LIZLLL;
    public C0X8K LJ;
    public InterfaceC1039660dA4 LJI;
    public InterfaceC1036860d5Y LJII;
    public InterfaceC1036210d4V LJIIIIZZ;
    public View.OnTouchListener LJIIIZ;
    public long LJIIJ;
    public InterfaceC1887270zDB LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public InterfaceC1036270d4b LJIILJJIL;
    public InterfaceC1039910dAT LJIILLIIL;
    public C1040940dC8 LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public List<String> LJIJJLI;
    public boolean LJIL;
    public C1054340dXk LJJI;
    public C1039720dAA LJJIFFI;
    public final C1039390d9d LJFF = new C1039390d9d();
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 596));
    public final C1039460d9k LJIIZILJ = new C1039460d9k();
    public final C01GW LJJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(304));
    public final C054G LJJII = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C1039520d9q LJJIII = new C1039520d9q(new InterfaceC1039600d9y() { // from class: X.0d9p
        @Override // X.InterfaceC1039600d9y
        public final void LIZ(String str, EnumC1039530d9r enumC1039530d9r, String str2, WebView webView) {
            InterfaceC1035500d3M interfaceC1035500d3M;
            SparkContext sparkContext = this.LIZ.LIZIZ;
            if (sparkContext != null && (interfaceC1035500d3M = (InterfaceC1035500d3M) sparkContext.LJFF(InterfaceC1035500d3M.class)) != null) {
                interfaceC1035500d3M.LIZ(str, str2, System.currentTimeMillis());
            }
            C1042130dE3.LIZ.LJIIIZ(str, "load_url", this.LIZ.LIZ, str2, null);
        }
    });

    @Override // X.InterfaceC1038080d7W
    public final void canGoBack() {
    }

    @Override // X.InterfaceC1038080d7W
    public final void canGoForward() {
    }

    @Override // X.InterfaceC1038080d7W
    public final void goBack() {
    }

    @Override // X.InterfaceC1038080d7W
    public final void goForward() {
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJFF() {
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null) {
            c1040740dBo.LJJLJ();
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final String LJIJJ() {
        return this.LJJIII.LIZIZ;
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJJI() {
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null) {
            c1040740dBo.LJJLJLI();
        }
    }

    public final C1039580d9w LJJIIZ() {
        return (C1039580d9w) this.LJJ.getValue();
    }

    public final void LJJIJ() {
        DialogFragment dialogFragment;
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext == null || (dialogFragment = (DialogFragment) sparkContext.LJFF(TuxSheet.class)) == null) {
            return;
        }
        SparkContext sparkContext2 = this.LIZIZ;
        if (sparkContext2 != null) {
            sparkContext2.LJJIIJ(TuxSheet.class, dialogFragment);
        }
        try {
            if (!dialogFragment.isAdded() || dialogFragment.getFragmentManager() == null) {
                return;
            }
            dialogFragment.dismissAllowingStateLoss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final AdWebViewClient getWebViewClient() {
        return new AdWebViewClient(this);
    }

    @Override // X.InterfaceC1038080d7W
    public final void onDestroy() {
        InterfaceC1039610d9z interfaceC1039610d9z;
        C1035900d40 resourceModel;
        C1533900q1E c1533900q1E;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        C1041180dCW.LJ(this.LIZIZ, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy ");
        C1035880d3y c1035880d3y = this.LIZ;
        sbLIZ.append(c1035880d3y != null ? c1035880d3y.getRefer() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1040110dAn c1040110dAn = C1040110dAn.LL;
        C1035880d3y c1035880d3y2 = this.LIZ;
        C1040110dAn.LIZIZ(c1035880d3y2 != null ? c1035880d3y2.getAwemeRawAd() : null, "leave_page");
        C2296808zG.LIZLLL(this.LJJII, "webView destroy");
        C0X8K c0x8k = this.LJ;
        if (c0x8k != null) {
            c0x8k.LIZIZ();
        }
        this.LJFF.LIZIZ = null;
        InterfaceC1039910dAT interfaceC1039910dAT = this.LJIILLIIL;
        if (interfaceC1039910dAT != null) {
            interfaceC1039910dAT.onDestroy();
        }
        C1039720dAA c1039720dAA = this.LJJIFFI;
        if (c1039720dAA != null) {
            C1035880d3y c1035880d3y3 = this.LIZ;
            if (Intrinsics.LJFF(c1035880d3y3 != null ? c1035880d3y3.getRefer() : null, "ad_history") && (awemeRawAd = c1035880d3y3.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                C1022670cif.LIZ.getClass();
                C1022670cif.LIZ().LIZJ(creativeIdStr);
            }
            if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJJI(c1035880d3y3)) {
                c1039720dAA.LIZIZ().LIZIZ().LJI = null;
            }
        }
        C1039580d9w c1039580d9wLJJIIZ = LJJIIZ();
        c1039580d9wLJJIIZ.LIZ = null;
        c1039580d9wLJJIIZ.LIZIZ = null;
        c1039580d9wLJJIIZ.LIZJ = null;
        c1039580d9wLJJIIZ.LJ = null;
        C989070bqT.LIZIZ = "";
        C1035880d3y c1035880d3y4 = this.LIZ;
        if (c1035880d3y4 != null && (resourceModel = c1035880d3y4.getResourceModel()) != null && (c1533900q1E = resourceModel.resourceGroup) != null) {
            C1533900q1E.LIZ(c1533900q1E, false, 3);
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().tU(this.LIZ, this.LIZIZ);
        LJJIJ();
        ICommerceAgentService iCommerceAgentService = (ICommerceAgentService) PluggableExtentionKt.pluggableSpi$default(ICommerceAgentService.class, false, false, false, 14, null);
        if (iCommerceAgentService != null) {
            iCommerceAgentService.LIZLLL();
        }
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext == null || (interfaceC1039610d9z = (InterfaceC1039610d9z) sparkContext.LJFF(InterfaceC1039610d9z.class)) == null) {
            return;
        }
        interfaceC1039610d9z.LIZLLL();
    }

    @Override // X.InterfaceC1038080d7W
    public final void LIZIZ() {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        View viewE1;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ2;
        View viewE12;
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        SparkContext sparkContext = this.LIZIZ;
        iAdWebUtils.Ou(this.LIZIZ, (sparkContext == null || (interfaceC1541990qEHLJIJJ2 = sparkContext.LJIJJ()) == null || (viewE12 = interfaceC1541990qEHLJIJJ2.e1()) == null) ? null : viewE12.getContext());
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        SparkContext sparkContext2 = this.LIZIZ;
        Context context = (sparkContext2 == null || (interfaceC1541990qEHLJIJJ = sparkContext2.LJIJJ()) == null || (viewE1 = interfaceC1541990qEHLJIJJ.e1()) == null) ? null : viewE1.getContext();
        C1035880d3y c1035880d3y = this.LIZ;
        iAdAutofillService.LJIIZILJ(context, c1035880d3y != null ? c1035880d3y.getAwemeRawAd() : null);
    }

    @Override // X.InterfaceC1038080d7W
    public final void LIZ(InterfaceC1887270zDB interfaceC1887270zDB) {
        this.LJIIJJI = interfaceC1887270zDB;
    }

    @Override // X.InterfaceC1038080d7W
    public final void LIZJ(WebView webView) {
        String refer;
        String url;
        C1041180dCW.LJ(this.LIZIZ, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause ");
        C1035880d3y c1035880d3y = this.LIZ;
        AwemeRawAd awemeRawAd = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        C2188811AlT.LIZIZ(sbLIZ);
        C1040110dAn c1040110dAn = C1040110dAn.LL;
        C1035880d3y c1035880d3y2 = this.LIZ;
        if (c1035880d3y2 != null) {
            awemeRawAd = c1035880d3y2.getAwemeRawAd();
        }
        C1040110dAn.LIZIZ(awemeRawAd, "leave_app");
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null) {
            c1040740dBo.LLIZLLLIL = System.currentTimeMillis();
            c1040740dBo.LL.setIabResume(false);
        }
        C0X8K c0x8k = this.LJ;
        if (c0x8k != null) {
            c0x8k.LJFF(webView, false);
        }
        C1039390d9d c1039390d9d = this.LJFF;
        C1035880d3y c1035880d3y3 = this.LIZ;
        if (!c1039390d9d.LIZ) {
            c1039390d9d.LIZ(true, false, c1035880d3y3);
        }
        if (webView != null) {
            webView.onPause();
        }
        List<String> list = this.LJIJJLI;
        if (list != null) {
            C08QT c08qt = new C08QT(C09RB.LJIIJJI(new C1939607ik(list)));
            while (c08qt.hasNext()) {
                String str = (String) c08qt.next();
                if (webView != null && (url = webView.getUrl()) != null && u.LJJIIJZLJL(url, str, false)) {
                    break;
                }
            }
            if (this.LJIJJ && webView != null) {
                webView.pauseTimers();
            }
        } else if (this.LJIJJ) {
            webView.pauseTimers();
        }
        LJJIJ();
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJ(InterfaceC1039910dAT interfaceC1039910dAT) {
        if (interfaceC1039910dAT != null) {
            this.LJIILLIIL = interfaceC1039910dAT;
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJI(boolean z) {
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null) {
            c1035880d3y.setTitleTruncated(z);
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIIJ(View.OnTouchListener onTouchListener) {
        this.LJIIIZ = onTouchListener;
    }

    @Override // X.InterfaceC1038080d7W
    public final C1044220dHQ LJIILIIL(WebKitView webKitView) {
        return new C1044220dHQ(webKitView, this);
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIILJJIL(int i) {
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null) {
            c1040740dBo.LLILLJJLI = i;
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIILL(String str) {
        this.LJIJI = str;
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIIZILJ(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent) {
        C1039460d9k c1039460d9k;
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null && (c1039460d9k = c1040740dBo.LLJJL) != null) {
            c1039460d9k.LIZIZ.remove(commerceLandingPageVideoShrinkComponent);
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIJI(InterfaceC1039570d9v interfaceC1039570d9v) {
        this.LJIIZILJ.LIZIZ.add(interfaceC1039570d9v);
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIJJLI(boolean z) {
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null) {
            c1035880d3y.setSecured(z ? 1 : 0);
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIL(String str) {
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null && C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1040740dBo.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJIFFI, c1040740dBo.LL.getRealCreativeIdStr(), c1040740dBo.LL.getRealLogExtra(), null, new AwS130S1100000_16(c1040740dBo, str, 11));
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJJ(String str) {
        String refer;
        C0X8K c0x8k;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadUrl ");
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        sbLIZ.append(" url ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1035990d49.LJ(this.LIZ) && C1035990d49.LJFF(str) && (c0x8k = this.LJ) != null) {
            c0x8k.LIZIZ();
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJJII(InterfaceC1039660dA4 interfaceC1039660dA4) {
        this.LJI = interfaceC1039660dA4;
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJJIII(WebView webView) {
        String refer;
        InterfaceC1036850d5X interfaceC1036850d5X;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume ");
        C1035880d3y c1035880d3y = this.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        C2188811AlT.LIZIZ(sbLIZ);
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext != null && (interfaceC1036850d5X = (InterfaceC1036850d5X) sparkContext.LJFF(InterfaceC1036850d5X.class)) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = interfaceC1036850d5X.LJII();
        }
        C1041180dCW.LIZJ(this.LIZIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII);
        if (webView != null) {
            webView.onResume();
            webView.resumeTimers();
        }
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null) {
            c1040740dBo.LLJJJ = 1;
            c1040740dBo.LL.setIabResume(true);
            if (c1040740dBo.LLIZLLLIL != 0) {
                System.currentTimeMillis();
                long j = c1040740dBo.LLIZLLLIL;
                C1039460d9k c1039460d9k = c1040740dBo.LLJJL;
                if (c1039460d9k != null) {
                    c1039460d9k.LIZLLL += System.currentTimeMillis() - j;
                }
            }
        }
        C1039390d9d c1039390d9d = this.LJFF;
        C1035880d3y c1035880d3y2 = this.LIZ;
        if (!c1039390d9d.LIZ) {
            c1039390d9d.LIZ(false, true, c1035880d3y2);
        }
        C1039720dAA c1039720dAA = this.LJJIFFI;
        if (c1039720dAA != null && ((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJJI(c1039720dAA.LIZ)) {
            c1039720dAA.LIZIZ().LJIIIIZZ(c1039720dAA.LIZ);
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJJIIJ(SparseArray<AutofillValue> sparseArray) {
        AwemeRawAd awemeRawAd;
        int size;
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (sparseArray != null) {
            size = sparseArray.size();
        } else {
            size = 0;
        }
        iAdAutofillService.LJIJJ(size, awemeRawAd);
    }

    public final boolean LJJIIJZLJL(String str) {
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null && c1035880d3y.enableNativeCheckoutInIAB() && !Intrinsics.LJFF(LJJIIZ().LIZ, Boolean.TRUE)) {
            C1041360dCo.LIZ.getClass();
            if (C1041360dCo.LIZIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJJIIZI(float f) {
        View view;
        boolean z;
        C1039450d9j c1039450d9j;
        C1039450d9j c1039450d9j2;
        if (!OptIABGestureGoBackOrGoForwardExp.LIZJ) {
            return;
        }
        SparkContext sparkContext = this.LIZIZ;
        Object objLJIJJ = null;
        if (sparkContext != null) {
            objLJIJJ = sparkContext.LJIJJ();
        }
        if ((objLJIJJ instanceof WebKitView) && (view = (View) objLJIJJ) != null) {
            C1039450d9j c1039450d9j3 = this.LIZJ;
            if (c1039450d9j3 != null && c1039450d9j3.canGoBack()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.LJIILIIL < C12ES.LIZJ(OptIABGestureGoBackOrGoForwardExp.LJFF, view.getContext())) {
                    if (f - this.LJIILIIL > C12ES.LIZJ(OptIABGestureGoBackOrGoForwardExp.LJ, view.getContext()) && (c1039450d9j2 = this.LIZJ) != null) {
                        c1039450d9j2.LIZIZ(2);
                    }
                }
            }
            int iLJIIJ = C12ES.LJIIJ(view.getContext());
            C1039450d9j c1039450d9j4 = this.LIZJ;
            if (c1039450d9j4 != null && c1039450d9j4.canGoForward()) {
                if (iLJIIJ - this.LJIILIIL < C12ES.LIZJ(OptIABGestureGoBackOrGoForwardExp.LJFF, view.getContext())) {
                    if (this.LJIILIIL - f > C12ES.LIZJ(OptIABGestureGoBackOrGoForwardExp.LJ, view.getContext()) && (c1039450d9j = this.LIZJ) != null) {
                        c1039450d9j.LJI(2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    @Override // X.InterfaceC1038080d7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.lynx.hybrid.webkit.WebKitView r6, com.bytedance.hybrid.spark.SparkContext r7) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039440d9i.LIZLLL(com.bytedance.lynx.hybrid.webkit.WebKitView, com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJII(InterfaceC1036860d5Y interfaceC1036860d5Y, InterfaceC1036210d4V interfaceC1036210d4V) {
        this.LJII = interfaceC1036860d5Y;
        this.LJIIIIZZ = interfaceC1036210d4V;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r30 != null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x060d  */
    @Override // X.InterfaceC1038080d7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C1035880d3y r30, X.InterfaceC1036270d4b r31) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039440d9i.LJIIIIZZ(X.0d3y, X.0d4b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    @Override // X.InterfaceC1038080d7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(android.webkit.WebView r25, android.view.MotionEvent r26) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039440d9i.LJIILLIIL(android.webkit.WebView, android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIJ(long j, String str) {
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null && C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1040740dBo.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJII, c1040740dBo.LL.getRealCreativeIdStr(), c1040740dBo.LL.getRealLogExtra(), null, new AwS21S1100100_16(c1040740dBo, j, str, 0));
        }
    }

    public final void LJJIJIIJI(WebView webView, String str) {
        boolean zLIZ;
        String currentUrl;
        String currentUrl2;
        String currentUrl3;
        if (!FixIabEsFocusExp.LIZIZ(this.LIZ)) {
            zLIZ = false;
        } else {
            zLIZ = FixIabEsFocusExp.LIZ("fix_focus");
        }
        String refer = null;
        if (!zLIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestWebViewFocusIfNeeded[");
            sbLIZ.append(str);
            sbLIZ.append("]: skip currentUrl=");
            C1035880d3y c1035880d3y = this.LIZ;
            if (c1035880d3y != null) {
                currentUrl3 = c1035880d3y.getCurrentUrl();
            } else {
                currentUrl3 = null;
            }
            sbLIZ.append(currentUrl3);
            sbLIZ.append(" refer=");
            C1035880d3y c1035880d3y2 = this.LIZ;
            if (c1035880d3y2 != null) {
                refer = c1035880d3y2.getRefer();
            }
            sbLIZ.append(refer);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (webView == null) {
            return;
        }
        if (webView.getParent() == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestWebViewFocusIfNeeded[");
            sbLIZ2.append(str);
            sbLIZ2.append("]: noParent currentUrl=");
            C1035880d3y c1035880d3y3 = this.LIZ;
            if (c1035880d3y3 != null) {
                currentUrl2 = c1035880d3y3.getCurrentUrl();
            } else {
                currentUrl2 = null;
            }
            sbLIZ2.append(currentUrl2);
            sbLIZ2.append(" refer=");
            C1035880d3y c1035880d3y4 = this.LIZ;
            if (c1035880d3y4 != null) {
                refer = c1035880d3y4.getRefer();
            }
            sbLIZ2.append(refer);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("requestWebViewFocusIfNeeded[");
        sbLIZ3.append(str);
        sbLIZ3.append("]: schedule currentUrl=");
        C1035880d3y c1035880d3y5 = this.LIZ;
        if (c1035880d3y5 != null) {
            currentUrl = c1035880d3y5.getCurrentUrl();
        } else {
            currentUrl = null;
        }
        sbLIZ3.append(currentUrl);
        sbLIZ3.append(" refer=");
        C1035880d3y c1035880d3y6 = this.LIZ;
        if (c1035880d3y6 != null) {
            refer = c1035880d3y6.getRefer();
        }
        sbLIZ3.append(refer);
        C2188811AlT.LIZIZ(sbLIZ3);
        HandlerHook.viewPost(webView, new ARunnableS20S1200000_16(webView, this, str, 5));
    }

    @Override // X.InterfaceC1038080d7W
    public final void onLoadUrl(WebView webView, String str) {
        String refer;
        int currentTabIndex;
        IAdLandPagePreloadService iAdLandPagePreloadService;
        String creativeIdStr;
        C1035890d3z adCommonData;
        AdWebMultiTabModel multiTapModel;
        JSONObject adInfoMethodObj;
        int i;
        boolean z;
        IThirdPartyUtilService iThirdPartyUtilService;
        Context context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadUrl additionalHttpHeaders ");
        C1035880d3y c1035880d3y = this.LIZ;
        String logExtra = null;
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        sbLIZ.append(" url ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && C123100dR.LIZ(str) && !TextUtils.equals(str, "about:blank")) {
            C1039700dA8 c1039700dA8 = C1039700dA8.LIZ;
            C1035880d3y c1035880d3y2 = this.LIZ;
            c1039700dA8.getClass();
            if (C123100dR.LIZ(str) && !TextUtils.equals(str, "about:blank") && c1035880d3y2 != null && webView != null) {
                CWebViewInterceptor.LIZ = str;
                OptIABUAExp.OptIABUAModel optIABUAModelLIZIZ = OptIABUAExp.LIZIZ();
                if (optIABUAModelLIZIZ == null) {
                    i = 0;
                } else {
                    i = optIABUAModelLIZIZ.type;
                }
                String userAgentString = webView.getSettings().getUserAgentString();
                if (i != 0 && ((u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) && (iThirdPartyUtilService = (IThirdPartyUtilService) PluggableExtentionKt.pluggableSpi$default(IThirdPartyUtilService.class, false, false, false, 14, null)) != null && iThirdPartyUtilService.LIZLLL(str) && (context = webView.getContext()) != null)) {
                    IAdUserAgent iAdUserAgent = (IAdUserAgent) PluggableExtentionKt.pluggableSpi$default(IAdUserAgent.class, false, false, false, 14, null);
                    userAgentString = iAdUserAgent != null ? iAdUserAgent.LIZ(context, webView, i) : null;
                }
                AwemeRawAd awemeRawAd = c1035880d3y2.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isEnableWebGoogleLogin()) {
                    z = true;
                } else {
                    z = false;
                }
                C786410Ut5.se(webView.getSettings(), C1039700dA8.LIZLLL(userAgentString, z));
            }
            if (this.LIZ != null && webView != null && C1035790d3p.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_iframe_autofill_optimize_enable_v2", true, false)) {
                C1035880d3y c1035880d3y3 = this.LIZ;
                if (c1035880d3y3 != null) {
                    adInfoMethodObj = c1035880d3y3.getAdInfoMethodObj();
                } else {
                    adInfoMethodObj = null;
                }
                C1067990dtl.LJJIFFI(webView, adInfoMethodObj, str, this.LIZ, Boolean.TRUE, null, null, 96);
            }
            C1035880d3y c1035880d3y4 = this.LIZ;
            if (c1035880d3y4 != null && (multiTapModel = c1035880d3y4.getMultiTapModel()) != null) {
                currentTabIndex = multiTapModel.getCurrentTabIndex();
            } else {
                currentTabIndex = 0;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_ad_web_load_start", true, true)) {
                C1035880d3y c1035880d3y5 = this.LIZ;
                if (c1035880d3y5 != null && c1035880d3y5.getLoadStarted() && currentTabIndex > 0) {
                    return;
                }
            } else {
                C1035880d3y c1035880d3y6 = this.LIZ;
                if (c1035880d3y6 != null && c1035880d3y6.getLoadStarted()) {
                    return;
                }
            }
            this.LJJIII.LIZ(str, EnumC1039530d9r.FIRST_LOAD_URL, webView);
            final C1035880d3y c1035880d3y7 = this.LIZ;
            if (c1035880d3y7 == null) {
                return;
            }
            c1035880d3y7.getWebLoadStatusModel().setStopLoading(false);
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().Fd1(this.LIZIZ);
            C1035880d3y c1035880d3y8 = this.LIZ;
            if (c1035880d3y8 != null) {
                c1035880d3y8.setCameraGranted(false);
            }
            C1035880d3y c1035880d3y9 = this.LIZ;
            if (c1035880d3y9 != null && (adCommonData = c1035880d3y9.getAdCommonData()) != null) {
                adCommonData.setHasLoad(true);
            }
            C1035880d3y c1035880d3y10 = this.LIZ;
            if (c1035880d3y10 != null) {
                c1035880d3y10.setCurrentUrlAddedTtclid(null);
            }
            C1040740dBo c1040740dBo = this.LIZLLL;
            if (c1040740dBo != null) {
                AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 152);
                c1040740dBo.LLJIJIL = System.currentTimeMillis();
                c1040740dBo.LLIZLLLIL = 0L;
                if (c1040740dBo.LLJJ) {
                    c1040740dBo.LLJILLL = System.currentTimeMillis();
                }
                c1040740dBo.LLILLL = 1;
                c1040740dBo.LLILZIL = 1;
                c1040740dBo.LLILZ = false;
                c1040740dBo.LLILZLL = 0L;
                c1040740dBo.LLIZ = 0L;
                String str2 = "";
                c1040740dBo.LJJZ("");
                c1040740dBo.LLJILJIL = System.currentTimeMillis();
                c1040740dBo.LLJILJILJ = System.currentTimeMillis();
                c1040740dBo.LLJJ = false;
                c1040740dBo.LLJJI.clear();
                c1040740dBo.LLJJIII = 0;
                c1040740dBo.LL.setJumpTimes(0);
                c1040740dBo.LLJJIJIIJIL = false;
                c1040740dBo.LLJJIJIL = -1;
                c1040740dBo.LLJJJJ = false;
                c1040740dBo.LL.getWebLoadStatusModel().setLoadingStatus(1);
                String url = c1040740dBo.LL.getUrl();
                if (url == null) {
                    url = "";
                }
                c1040740dBo.LJJZ(url);
                c1040740dBo.LLJIJIL = System.currentTimeMillis();
                c1040740dBo.LLILZLL = System.currentTimeMillis() - c1040740dBo.LL.getWebInitTime();
                c1040740dBo.LL.setBackgroundDurationFromFinish(0L);
                c1040740dBo.LL.setBackgroundDurationFromLoad(0L);
                c1040740dBo.LL.setWebPageClickCount(0);
                C1039560d9u.LIZ = null;
                c1040740dBo.LJIIIIZZ(System.currentTimeMillis(), null);
                if (C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
                    AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1040740dBo.LL);
                    C1023960ckk c1023960ckk = C2273161DyE.LIZ;
                    AwemeRawAd awemeRawAd2 = c1040740dBo.LL.getAwemeRawAd();
                    if (awemeRawAd2 != null && (creativeIdStr = awemeRawAd2.getCreativeIdStr()) != null) {
                        str2 = creativeIdStr;
                    }
                    AwemeRawAd awemeRawAd3 = c1040740dBo.LL.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        logExtra = awemeRawAd3.getLogExtra();
                    }
                    adWebEventLogger.logAd(c1023960ckk, str2, logExtra, null, new AwS130S1100000_16(c1040740dBo, str, 19));
                }
                if (C1040740dBo.LJJLIIIJILLIZJL(c1040740dBo.LL)) {
                    C1040580dBY c1040580dBY = new C1040580dBY(c1040740dBo.LL);
                    C1040750dBp.LIZ.getClass();
                    c1040580dBY.log(C1040750dBp.LIZJ, new AwS595S0100000_16(c1040740dBo, 113));
                }
                c1040740dBo.LLJJIJIIJIL = true;
                C1039460d9k c1039460d9k = c1040740dBo.LLJJL;
                if (c1039460d9k != null) {
                    c1039460d9k.LJ.set(false);
                }
                if (!c1040740dBo.LL.isPreRender() && !c1040740dBo.LL.isWebPageReuse()) {
                    EnumC1039490d9n enumC1039490d9n = EnumC1039490d9n.LOAD_URL;
                    C1039460d9k c1039460d9k2 = c1040740dBo.LLJJL;
                    if (c1039460d9k2 != null) {
                        C1039470d9l c1039470d9l = c1039460d9k2.LIZ;
                        c1039470d9l.getClass();
                        State state = c1039470d9l.LIZ;
                        c1039470d9l.LIZ(enumC1039490d9n, new State(state.viewable, false, state.sessionStarted));
                    }
                }
                if (c1040740dBo.LLJJIJIL == -1 && C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
                    if (c1040740dBo.LL.getPreloadAdWeb() == 7) {
                        c1040740dBo.LLJJIJIL = 5;
                    } else if (c1040740dBo.LL.getUseWebUrl() == 1 && ((c1040740dBo.LL.getPreloadAdWeb() == 4 || c1040740dBo.LL.isPreloadSecondPage() == 1) && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null)) {
                        iAdLandPagePreloadService.G0();
                        c1040740dBo.LLJJIJIL = C1024380clQ.LIZIZ(c1040740dBo.LL.getPreloadAdChannel(), c1040740dBo.LL.getPreloadAdScene());
                    }
                }
                awS595S0100000_16.invoke(Integer.valueOf(c1040740dBo.LLJJIJIL));
            }
            if (webView != null) {
                InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                C1521250pgp c1521250pgpBuildConfig = webViewMonitorHelper.buildConfig();
                c1521250pgpBuildConfig.LJFF = "tt_hybrid_commerce";
                c1521250pgpBuildConfig.LIZ(webView);
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
                final C00IT c00it = C00IT.ViewInst;
                final EnumC992310bvh enumC992310bvh = EnumC992310bvh.Tea;
                webViewMonitorHelper.addExtensionContext(webView, new AbstractC1039540d9s(c00it, enumC992310bvh) { // from class: X.0d9o
                    public final /* synthetic */ String LIZJ = "spark";

                    @Override // X.AbstractC1039540d9s
                    public final Map<String, Object> LIZ() {
                        return C2097608Jq.LJIIIIZZ(new Pair("bid", "tt_hybrid_commerce"), new Pair("ab_info", C2097908Jt.LIZJ(new Pair("iab_type", this.LIZJ))), new Pair("first_page", Integer.valueOf(c1035880d3y7.getFirstPage())));
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIIIZ(EnumC1039490d9n enumC1039490d9n, int i, Long l) {
        C1039460d9k c1039460d9k;
        C1040740dBo c1040740dBo = this.LIZLLL;
        if (c1040740dBo != null && (c1039460d9k = c1040740dBo.LLJJL) != null) {
            C1039470d9l c1039470d9l = c1039460d9k.LIZ;
            c1039470d9l.getClass();
            State state = c1039470d9l.LIZ;
            c1039470d9l.LIZ(enumC1039490d9n, new State(true, state.usable, state.sessionStarted));
            if (!c1039460d9k.LJ.get()) {
                c1039460d9k.LJFF = i;
                if (l != null) {
                    c1039460d9k.LJI = l.longValue();
                }
                c1039460d9k.LIZJ = System.currentTimeMillis();
                c1039460d9k.LIZLLL = 0L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v153, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v159, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v42 */
    @Override // X.InterfaceC1038080d7W
    public final void LJIIJJI(WebBackForwardList webBackForwardList, WebView webView, String str) throws JSONException {
        String refer;
        boolean zLIZ;
        AwemeRawAd awemeRawAd;
        int i;
        int i2;
        AwemeRawAd awemeRawAd2;
        Boolean boolValueOf;
        InterfaceC1035480d3K bocRuleMatcher;
        InterfaceC1035500d3M interfaceC1035500d3M;
        C0DHD c0dhd;
        AnonymousClass0956 anonymousClass0956;
        C1035880d3y c1035880d3y;
        InterfaceC1541510qDV interfaceC1541510qDV;
        String currentUrl;
        String refer2;
        String str2;
        int currentIndex;
        C238400w2 c238400w2;
        C238400w2 c238400w22;
        C238400w2 c238400w23;
        C1040740dBo c1040740dBo;
        C259800zU c259800zU;
        int i3;
        C259800zU c259800zU2;
        Integer numValueOf;
        Integer numValueOf2;
        String str3;
        long jCurrentTimeMillis;
        String creativeIdStr;
        String logExtra;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        String str4 = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHide ");
        C1035880d3y c1035880d3y2 = this.LIZ;
        if (c1035880d3y2 != null) {
            refer = c1035880d3y2.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!FixIabEsFocusExp.LIZIZ(this.LIZ)) {
            zLIZ = false;
        } else {
            zLIZ = FixIabEsFocusExp.LIZ("fix_visible");
        }
        C1041180dCW.LJ(this.LIZIZ, false);
        C1040110dAn c1040110dAn = C1040110dAn.LL;
        C1035880d3y c1035880d3y3 = this.LIZ;
        if (c1035880d3y3 != null) {
            awemeRawAd = c1035880d3y3.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1040110dAn.LIZIZ(awemeRawAd, "leave_page");
        C1035880d3y c1035880d3y4 = this.LIZ;
        if (c1035880d3y4 != null && c1035880d3y4.getClickedCloseAll()) {
            this.LJIJI = "full_screen_page_click";
        }
        String str5 = "";
        if (this.LIZLLL == null) {
            InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
            C1043510dGH.LIZ.getClass();
            C1023960ckk c1023960ckk = C1043510dGH.LJFF;
            C1035880d3y c1035880d3y5 = this.LIZ;
            if (c1035880d3y5 == null || (awemeRawAd4 = c1035880d3y5.getAwemeRawAd()) == null || (creativeIdStr = awemeRawAd4.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            C1035880d3y c1035880d3y6 = this.LIZ;
            if (c1035880d3y6 != null && (awemeRawAd3 = c1035880d3y6.getAwemeRawAd()) != null) {
                logExtra = awemeRawAd3.getLogExtra();
            } else {
                logExtra = null;
            }
            interfaceC1009950cO9.logAd(c1023960ckk, creativeIdStr, logExtra, null, new AwS595S0100000_16(this, 151));
        }
        C1040740dBo c1040740dBo2 = this.LIZLLL;
        if (c1040740dBo2 != null) {
            SparkContext sparkContext = this.LIZIZ;
            if (C123100dR.LIZ(str4)) {
                str2 = str4;
            } else {
                str2 = this.LJIJI;
            }
            AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(webView, this, 36);
            C1039550d9t.LIZ = null;
            C1039550d9t.LIZIZ = null;
            C1039550d9t.LIZJ = 1;
            C1039550d9t.LIZLLL = 0;
            C1039550d9t.LJ = null;
            C1039550d9t.LJFF = null;
            C238400w2 c238400w24 = new C238400w2();
            c238400w24.element = System.currentTimeMillis() - c1040740dBo2.LLJIJIL;
            C238400w2 c238400w25 = new C238400w2();
            c238400w25.element = c238400w24.element - c1040740dBo2.LL.getBackgroundDurationFromLoad();
            C238400w2 c238400w26 = new C238400w2();
            c238400w26.element = System.currentTimeMillis() - c1040740dBo2.LLJILLL;
            C238400w2 c238400w27 = new C238400w2();
            c238400w27.element = c238400w26.element - c1040740dBo2.LL.getBackgroundDurationFromFinish();
            if (c238400w26.element < 0 || c1040740dBo2.LLJILLL == 0) {
                c238400w26.element = 0L;
            }
            if (c238400w25.element < 0) {
                c238400w25.element = 0L;
            }
            if (c238400w27.element < 0 || c1040740dBo2.LLJILLL == 0) {
                c238400w27.element = 0L;
            }
            if (webBackForwardList != null) {
                currentIndex = webBackForwardList.getCurrentIndex();
            } else {
                currentIndex = -1;
            }
            C259800zU c259800zU3 = new C259800zU();
            c259800zU3.element = "";
            C259800zU c259800zU4 = new C259800zU();
            c259800zU4.element = "";
            if (webBackForwardList != null) {
                if (currentIndex > 0) {
                    int i4 = 0;
                    do {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((String) c259800zU3.element);
                        sbLIZ2.append(webBackForwardList.getItemAtIndex(i4).getUrl());
                        sbLIZ2.append(',');
                        c259800zU3.element = C2188811AlT.LIZIZ(sbLIZ2);
                        i4++;
                    } while (i4 < currentIndex);
                }
                if (currentIndex < webBackForwardList.getSize() - 1) {
                    int size = webBackForwardList.getSize();
                    for (int i5 = currentIndex + 1; i5 < size; i5++) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append((String) c259800zU4.element);
                        sbLIZ3.append(webBackForwardList.getItemAtIndex(i5).getUrl());
                        sbLIZ3.append(',');
                        c259800zU4.element = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
            }
            if (!c1040740dBo2.LLJJ) {
                c1040740dBo2.LJJLIIIJJIZ(webView, 1);
                awS417S0200000_16.invoke();
            } else {
                c1040740dBo2.LJIL(sparkContext);
            }
            C1039460d9k c1039460d9k = c1040740dBo2.LLJJL;
            if (c1039460d9k != null) {
                C1039470d9l c1039470d9l = c1039460d9k.LIZ;
                EnumC1039490d9n enumC1039490d9n = EnumC1039490d9n.VIEW_HIDE;
                c1039470d9l.getClass();
                State state = c1039470d9l.LIZ;
                c1039470d9l.LIZ(enumC1039490d9n, new State(false, state.usable, state.sessionStarted));
                if (c1039460d9k.LJ.get()) {
                    if (c1039460d9k.LIZJ == 0) {
                        jCurrentTimeMillis = 0;
                    } else {
                        jCurrentTimeMillis = (System.currentTimeMillis() - c1039460d9k.LIZJ) - c1039460d9k.LIZLLL;
                    }
                    for (InterfaceC1039570d9v interfaceC1039570d9v : c1039460d9k.LIZIZ) {
                        if (interfaceC1039570d9v != null) {
                            interfaceC1039570d9v.ze(jCurrentTimeMillis);
                        }
                    }
                    c1039460d9k.LJ.set(false);
                    c1039460d9k.LIZJ = System.currentTimeMillis();
                }
            }
            if (!c1040740dBo2.LLJJIJIIJIL) {
                InterfaceC1009950cO9 interfaceC1009950cO92 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
                C1043510dGH.LIZ.getClass();
                interfaceC1009950cO92.logAd(C1043510dGH.LJFF, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS595S0100000_16(c1040740dBo2, 111));
                i = 1;
            } else {
                if (C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                    JSONObject jSONObject = new JSONObject();
                    FailMsgModel failMsgModel = c1040740dBo2.LL.getFailMsgModel();
                    if (failMsgModel != null && failMsgModel.name != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        FailMsgModel failMsgModel2 = c1040740dBo2.LL.getFailMsgModel();
                        if (failMsgModel2 != null) {
                            numValueOf = Integer.valueOf(failMsgModel2.isFirstPage());
                        } else {
                            numValueOf = null;
                        }
                        jSONObject2.put("is_first_page", numValueOf);
                        FailMsgModel failMsgModel3 = c1040740dBo2.LL.getFailMsgModel();
                        if (failMsgModel3 != null) {
                            numValueOf2 = Integer.valueOf(failMsgModel3.consecutiveTimes);
                        } else {
                            numValueOf2 = null;
                        }
                        jSONObject2.put("consecutive_times", numValueOf2);
                        FailMsgModel failMsgModel4 = c1040740dBo2.LL.getFailMsgModel();
                        if (failMsgModel4 == null || (str3 = failMsgModel4.name) == null) {
                            str3 = "null";
                        }
                        jSONObject.put(str3, jSONObject2);
                    }
                    AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1040740dBo2.LL);
                    C1023960ckk c1023960ckk2 = C2274361E0k.LIZIZ;
                    String realCreativeIdStr = c1040740dBo2.LL.getRealCreativeIdStr();
                    String realLogExtra = c1040740dBo2.LL.getRealLogExtra();
                    c238400w2 = c238400w26;
                    c238400w22 = c238400w25;
                    c238400w23 = c238400w24;
                    c1040740dBo = c1040740dBo2;
                    c259800zU = c259800zU3;
                    i3 = 1;
                    c259800zU2 = c259800zU4;
                    adWebEventLogger.logAd(c1023960ckk2, realCreativeIdStr, realLogExtra, null, new C1041030dCH(c1040740dBo, c238400w27, c238400w26, c238400w25, c238400w24, webBackForwardList, c259800zU3, c259800zU4, str2, jSONObject));
                } else {
                    c238400w2 = c238400w26;
                    c238400w22 = c238400w25;
                    c238400w23 = c238400w24;
                    c1040740dBo = c1040740dBo2;
                    c259800zU = c259800zU3;
                    i3 = 1;
                    c259800zU2 = c259800zU4;
                }
                if (C1040740dBo.LJJLIIIJILLIZJL(c1040740dBo.LL)) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = c1040740dBo.LL;
                    C1040580dBY c1040580dBY = new C1040580dBY(objArr);
                    C1040750dBp.LIZ.getClass();
                    c1040580dBY.log(C1040750dBp.LJIIIIZZ, new C1040380dBE(c1040740dBo, c238400w2, c238400w27, c238400w22, c238400w23, webBackForwardList, c259800zU, c259800zU2, str2));
                }
                CommerceWebToCrossSetting.LIZ.getClass();
                if (((Boolean) CommerceWebToCrossSetting.LJ.getValue()).booleanValue() && !c1040740dBo.LL.getEnableReuseWeb()) {
                    c1040740dBo.LLJJIJIIJIL = false;
                }
                C1047720dN4 c1047720dN4 = C1047720dN4.LIZ;
                C1035880d3y c1035880d3y7 = c1040740dBo.LL;
                if (C1035790d3p.LIZ()) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2209608lC(c1035880d3y7, null), 2);
                }
                c1040740dBo.LL.setWebPageClickCount(0);
                c1040740dBo.LL.setWebPageScrollOffset(0.0f);
                c1040740dBo.LL.setAllClickCount(0);
                c1040740dBo.LL.setAllScrollCount(0);
                c1040740dBo.LL.setOnShow(false);
                i = i3;
            }
        } else {
            i = 1;
        }
        if (zLIZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onHide: pause visibility after hide callbacks currentUrl=");
            i2 = 2;
            C1035880d3y c1035880d3y8 = this.LIZ;
            if (c1035880d3y8 != null) {
                currentUrl = c1035880d3y8.getCurrentUrl();
            } else {
                currentUrl = null;
            }
            sbLIZ4.append(currentUrl);
            sbLIZ4.append(" refer=");
            C1035880d3y c1035880d3y9 = this.LIZ;
            if (c1035880d3y9 != null) {
                refer2 = c1035880d3y9.getRefer();
            } else {
                refer2 = null;
            }
            sbLIZ4.append(refer2);
            C2188811AlT.LIZIZ(sbLIZ4);
            if (webView != null) {
                webView.onPause();
            }
        } else {
            i2 = 2;
        }
        C1035880d3y c1035880d3y10 = this.LIZ;
        if (c1035880d3y10 != null) {
            awemeRawAd2 = c1035880d3y10.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        SparkContext sparkContext2 = this.LIZIZ;
        if (sparkContext2 != null && (interfaceC1541510qDV = (InterfaceC1541510qDV) sparkContext2.LJFF(InterfaceC1541510qDV.class)) != null) {
            boolValueOf = Boolean.valueOf(interfaceC1541510qDV.LIZJ());
        } else {
            boolValueOf = null;
        }
        LeadAdReporter.LIZ(awemeRawAd2, boolValueOf);
        C1039390d9d c1039390d9d = this.LJFF;
        C1035880d3y c1035880d3y11 = this.LIZ;
        c1039390d9d.LIZ = i;
        c1039390d9d.LIZ(i, false, c1035880d3y11);
        LJJIJ();
        C1035880d3y c1035880d3y12 = this.LIZ;
        if (c1035880d3y12 == null || c1035880d3y12.isNineScreen() != i || ((c1035880d3y = this.LIZ) != null && c1035880d3y.getUseNewStyle() == i)) {
            C1040740dBo c1040740dBo3 = this.LIZLLL;
            if (c1040740dBo3 != null) {
                C1035880d3y c1035880d3y13 = this.LIZ;
                if (c1035880d3y13 == null || c1035880d3y13.getUseNewStyle() != i || TextUtils.isEmpty(str4)) {
                    str4 = this.LJIJI;
                }
                C1039550d9t.LIZ = null;
                C1039550d9t.LIZIZ = null;
                C1039550d9t.LIZJ = i;
                C1039550d9t.LIZLLL = 0;
                C1039550d9t.LJ = null;
                C1039550d9t.LJFF = null;
                if (C1040740dBo.LJJLIIIIJ(c1040740dBo3.LL)) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = c1040740dBo3.LL;
                    AdWebEventLogger adWebEventLogger2 = new AdWebEventLogger(objArr2);
                    C1043510dGH c1043510dGH = C1043510dGH.LIZ;
                    if (str4 != null) {
                        str5 = str4;
                    }
                    c1043510dGH.getClass();
                    InterfaceC1023650ckF[] interfaceC1023650ckFArr = new InterfaceC1023650ckF[i];
                    InterfaceC1023650ckF[] interfaceC1023650ckFArr2 = new InterfaceC1023650ckF[i2];
                    C1043500dGG.LIZ.getClass();
                    interfaceC1023650ckFArr2[0] = C1043500dGG.LLILII;
                    interfaceC1023650ckFArr2[i] = C1043500dGG.LLILLIZIL;
                    interfaceC1023650ckFArr[0] = c1043510dGH.LJI(interfaceC1023650ckFArr2);
                    adWebEventLogger2.logAd(C1023500ck0.LIZJ("landing_ad", "close", str5, interfaceC1023650ckFArr), c1040740dBo3.LL.getRealCreativeIdStr(), c1040740dBo3.LL.getRealLogExtra(), null);
                    c1040740dBo3.LJJL();
                }
            }
            C1039720dAA c1039720dAA = this.LJJIFFI;
            if (c1039720dAA != null) {
                C1035880d3y c1035880d3y14 = this.LIZ;
                if (c1035880d3y14 != null) {
                    AwemeRawAd awemeRawAd5 = c1035880d3y14.getAwemeRawAd();
                    if (c1035880d3y14.enableNativeCheckoutInIAB() == i && awemeRawAd5 != null && awemeRawAd5.getCreativeIdStr() != null) {
                        h8 h8Var = h8.LLJ;
                        if (h8Var != null) {
                            AnonymousClass0956 anonymousClass09562 = h8Var.LLILZIL;
                            if (anonymousClass09562 != null) {
                                anonymousClass09562.LIZIZ(null);
                            }
                            h8Var.LLILZIL = null;
                            h8Var.LLILLJJLI.LIZIZ(null);
                            h8Var.LLILZ.set(0);
                            C11JF c11jf = h8Var.LLILZLL;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                        }
                        h8.LLJ = null;
                    }
                }
                if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJJI(c1035880d3y14)) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1053560dWU(c1039720dAA.LIZIZ(), i, null), i2);
                    c1039720dAA.LIZIZ().LIZIZ().LJFF = 0;
                }
                C1039850dAN c1039850dAN = c1039720dAA.LIZLLL;
                if (c1039850dAN != null && (c0dhd = c1039850dAN.LIZIZ) != null && (anonymousClass0956 = c0dhd.LJI) != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
            SparkContext sparkContext3 = this.LIZIZ;
            if (sparkContext3 != null && (interfaceC1035500d3M = (InterfaceC1035500d3M) sparkContext3.LJFF(InterfaceC1035500d3M.class)) != null) {
                interfaceC1035500d3M.onHide();
            }
            C1035880d3y c1035880d3y15 = this.LIZ;
            if (c1035880d3y15 != null && (bocRuleMatcher = c1035880d3y15.getBocRuleMatcher()) != null) {
                bocRuleMatcher.onHide();
            }
            ICommerceAgentService iCommerceAgentService = (ICommerceAgentService) PluggableExtentionKt.pluggableSpi$default(ICommerceAgentService.class, false, false, false, 14, null);
            if (iCommerceAgentService != null) {
                iCommerceAgentService.LIZLLL();
                return;
            }
            return;
        }
        C1040740dBo c1040740dBo4 = this.LIZLLL;
        if (c1040740dBo4 != null) {
            c1040740dBo4.LJJL();
        }
    }

    @Override // X.InterfaceC1038080d7W
    public final void LJIIL(WebView webView, boolean z, boolean z2) {
        InterfaceC1036190d4T interfaceC1036190d4T;
        C1039450d9j c1039450d9j;
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null && c1035880d3y.isNineScreen() == 1) {
            return;
        }
        if (z || z2) {
            SparkContext sparkContext = this.LIZIZ;
            if (sparkContext != null) {
                interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class);
            } else {
                interfaceC1036190d4T = null;
            }
            if (z2 && interfaceC1036190d4T != null && interfaceC1036190d4T.LIZ()) {
                if (webView != null) {
                    webView.requestDisallowInterceptTouchEvent(true);
                }
            } else if (OptIABGestureGoBackOrGoForwardExp.LIZJ && (c1039450d9j = this.LIZJ) != null && c1039450d9j.canGoBack()) {
                if (webView == null) {
                    return;
                }
                webView.requestDisallowInterceptTouchEvent(true);
            } else {
                if (webView == null) {
                    return;
                }
                webView.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r4
      0x001f: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:9:0x001d, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[PHI: r4
      0x002b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:9:0x001d, B:11:0x0023, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1038080d7W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(X.C1035880d3y r9, java.lang.Long r10, java.lang.String r11) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.log.AdWebEventLogger r2 = new com.ss.android.ugc.aweme.log.AdWebEventLogger
            r2.<init>()
            X.0dGH r0 = X.C1043510dGH.LIZ
            r0.getClass()
            X.0ckk r3 = X.C1043510dGH.LJJI
            java.lang.String r1 = ""
            if (r9 == 0) goto L1c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L1c
            java.lang.String r4 = r0.getCreativeIdStr()
            if (r4 != 0) goto L1f
        L1c:
            r4 = r1
            if (r9 == 0) goto L2b
        L1f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L2b
            java.lang.String r5 = r0.getLogExtra()
            if (r5 != 0) goto L2c
        L2b:
            r5 = r1
        L2c:
            r6 = 0
            kotlin.jvm.internal.AwS100S1200000_16 r7 = new kotlin.jvm.internal.AwS100S1200000_16
            r0 = 3
            r7.<init>(r9, r10, r11, r0)
            r2.logAd(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039440d9i.LJJIFFI(X.0d3y, java.lang.Long, java.lang.String):void");
    }

    @Override // X.InterfaceC1038080d7W
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC1036190d4T interfaceC1036190d4T;
        boolean z;
        InterfaceC1036400d4o interfaceC1036400d4o;
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext != null && (interfaceC1036400d4o = (InterfaceC1036400d4o) sparkContext.LJFF(InterfaceC1036400d4o.class)) != null) {
            interfaceC1036400d4o.LIZIZ(i, i2, i3, i4);
        }
        InterfaceC1039660dA4 interfaceC1039660dA4 = this.LJI;
        if (interfaceC1039660dA4 != null) {
            interfaceC1039660dA4.onScrollChanged(i, i2, i3, i4);
        }
        InterfaceC1036210d4V interfaceC1036210d4V = this.LJIIIIZZ;
        if (interfaceC1036210d4V != null) {
            interfaceC1036210d4V.LIZIZ(i, i2, i3, i4);
        }
        C1035880d3y c1035880d3y = this.LIZ;
        if (c1035880d3y != null) {
            c1035880d3y.setCurrentOffset(i2);
        }
        C1035880d3y c1035880d3y2 = this.LIZ;
        if (c1035880d3y2 != null) {
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            c1035880d3y2.setPullRefreshIsAtTop(z);
        }
        SparkContext sparkContext2 = this.LIZIZ;
        if (sparkContext2 != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext2.LJFF(InterfaceC1036190d4T.class)) != null) {
            interfaceC1036190d4T.LJIIIZ(i2);
        }
    }
}
