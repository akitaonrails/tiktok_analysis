package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS85S0200000_16;
import Y.ATListenerS449S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpLynxContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpSparkWebContainer;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebRecordingModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.FailMsgModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.log.IAdWebLogService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035340d36 extends FrameLayout implements GenericLifecycleObserver {
    public static final C1035490d3L LLLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILL;
    public C1036760d5O LL;
    public C1030050cuZ LLILLJJLI;
    public FrameLayout LLILLL;
    public C1037220d68 LLILZ;
    public FrameLayout LLILZIL;
    public C1035370d39 LLILZLL;
    public C1037300d6G LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public RelativeLayout LLJI;
    public TuxTextView LLJIJIL;
    public FrameLayout LLJILJIL;
    public FrameLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public SmartAvatarImageView LLJJIII;
    public C424560Gko LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public C1035360d38 LLJJJ;
    public AdPopUpLynxContainer LLJJJIL;
    public AdPopUpSparkWebContainer LLJJJJ;
    public boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public boolean LLJJL;
    public C1025930cnv LLJJLIIIJLLLLLLLZ;
    public InterfaceC1035570d3T LLJL;
    public InterfaceC1035410d3D LLJLIL;
    public InterfaceC990300bsS LLJLILLLLZIIL;
    public Function0<? extends Object> LLJLL;
    public C1025100cma LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public LynxView LLJZIJLIL;
    public SparkContext LLL;
    public ARunnableS116S0100000_16 LLLF;
    public ARunnableS85S0200000_16 LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public final C01GW LLLII;
    public final C1035400d3C LLLIIII;
    public final C01GW LLLIIIIL;
    public final OnBackPressedDispatcher LLLIIIL;
    public final C1077160e8Y LLLIIL;
    public final C01GW LLLIILIL;
    public final C1077570e9D LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public boolean LLLILZLLLI;
    public final C1035420d3E LLLIZZ;
    public final C1035350d37 LLLJ;
    public final C1035460d3I LLLJIL;
    public final ATListenerS449S0100000_16 LLLJL;
    public final C1035550d3R LLLL;
    public final C1035470d3J LLLLII;
    public volatile C1054430dXt LLLLIIIILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0d3L] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1035340d36.class, "shopifyService", "getShopifyService()Lcom/ss/android/ugc/aweme/business/shopify/ICommerceShopifyService;", 0);
        C13LE.LIZ.getClass();
        LLLLIILL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLIIL = new Object() { // from class: X.0d3L
        };
    }

    public static /* synthetic */ void getShopifyService$annotations() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final IAdLandPageSurveyService getAdLandPageSurveyService() {
        return (IAdLandPageSurveyService) this.LLLIIIIL.getValue();
    }

    private final AwemeRawAd getAwemeRawAd() {
        Aweme aweme;
        C1025100cma c1025100cma = this.LLJLLIL;
        if (c1025100cma == null || (aweme = c1025100cma.LJIIIIZZ) == null) {
            return null;
        }
        return aweme.getAwemeRawAd();
    }

    private final GestureDetector getWebViewGestureDetector() {
        return (GestureDetector) this.LLLII.getValue();
    }

    public final boolean LJIIJ() {
        AwemeRawAd awemeRawAd;
        C1035880d3y c1035880d3y;
        C1035880d3y adWebModel;
        AwemeRawAd awemeRawAd2;
        if (this.LLJJJJJIL || (((c1035880d3y = getAdWebSparkViewFromXml().LLJI) == null || (awemeRawAd2 = c1035880d3y.getAwemeRawAd()) == null || awemeRawAd2.getCreativeId().longValue() <= 0) && ((adWebModel = getAdWebSparkViewFromXml().getAdWebModel()) == null || adWebModel.getNonAdWebModel() == null))) {
            C1025930cnv c1025930cnv = this.LLJJLIIIJLLLLLLLZ;
            if (c1025930cnv == null) {
                return false;
            }
            if (!c1025930cnv.LJFF && ((awemeRawAd = c1025930cnv.LJ) == null || awemeRawAd.getWebviewPannelStyle() != 1)) {
                return false;
            }
        }
        return true;
    }

    public final TuxTextView getAdBottomBarDescNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a77);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getAdBottomBarLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a78);
            this.LLJILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getAdBottomBarTitleNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a7a);
            this.LLJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C424560Gko getAdBottomBarUserAvatarNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a7c);
            this.LLJJIJI = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final TuxIconView getAdBottomButtonNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a7e);
            this.LLJJIJIIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartAvatarImageView getAdUserBottomBarUserAvatarNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abn);
            this.LLJJIII = (SmartAvatarImageView) callbackFindViewById;
        }
        return (SmartAvatarImageView) callbackFindViewById;
    }

    public final C1036760d5O getAdWebSparkViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ac2);
            this.LL = (C1036760d5O) callbackFindViewById;
        }
        return (C1036760d5O) callbackFindViewById;
    }

    public final TuxTextView getDebugWebviewTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fh_);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final boolean getEnableWebSpark() {
        C1025930cnv c1025930cnv = this.LLJJLIIIJLLLLLLLZ;
        if (c1025930cnv != null) {
            return c1025930cnv.LJI;
        }
        return false;
    }

    public final RelativeLayout getFakeUserProfileAdBottomFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hla);
            this.LLJI = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final C1025950cnx getLoadListener() {
        return (C1025950cnx) this.LLLIILIL.getValue();
    }

    public final FrameLayout getPaddingLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.py6);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1030050cuZ getPopUpWebBottomSheetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhg);
            this.LLILLJJLI = (C1030050cuZ) callbackFindViewById;
        }
        return (C1030050cuZ) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhj);
            this.LLJJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebMarkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhk);
            this.LLJILJILJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1037300d6G getPopUpWebNaviBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhl);
            this.LLIZ = (C1037300d6G) callbackFindViewById;
        }
        return (C1037300d6G) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebNetworkErrorViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhq);
            this.LLJILJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1037220d68 getPopUpWebPageWebviewSparkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhr);
            this.LLILZ = (C1037220d68) callbackFindViewById;
        }
        return (C1037220d68) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebRetryBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rht);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getPopUpWebRoundLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhu);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1035370d39 getPopUpWebTitleBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhy);
            this.LLILZLL = (C1035370d39) callbackFindViewById;
        }
        return (C1035370d39) callbackFindViewById;
    }

    public final TuxTextView getPopUpWebTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhx);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final InterfaceC1035540d3Q getShopifyService() {
        C1054430dXt c1054430dXt = this.LLLLIIIILLL;
        if (c1054430dXt == null) {
            synchronized (this) {
                c1054430dXt = this.LLLLIIIILLL;
                if (c1054430dXt == null) {
                    C1054430dXt c1054430dXt2 = new C1054430dXt();
                    this.LLLLIIIILLL = c1054430dXt2;
                    return c1054430dXt2;
                }
            }
        }
        return c1054430dXt;
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [X.0d38] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        final Bundle bundle;
        C1035880d3y adWebModel;
        AwemeRawAd awemeRawAd;
        C1039050d95 rootContainer;
        InterfaceC1039110d9B interfaceC1039110d9B;
        DownloadBusiness downloadBusiness;
        super.onAttachedToWindow();
        C1025930cnv c1025930cnv = this.LLJJLIIIJLLLLLLLZ;
        if (c1025930cnv == null || (bundle = c1025930cnv.LIZLLL) == null) {
            return;
        }
        if (c1025930cnv.LJIIIIZZ != null) {
            this.LLJJJJJIL = true;
        }
        C622680Oba.LIZJ(this);
        C786410Ut5.LJLLJ(getContext(), R.layout.cud, this);
        FrameLayout paddingLayoutFromXml = getPaddingLayoutFromXml();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) paddingLayoutFromXml.getLayoutParams();
        C1025930cnv c1025930cnv2 = this.LLJJLIIIJLLLLLLLZ;
        marginLayoutParams.topMargin = c1025930cnv2 != null ? c1025930cnv2.LIZJ : 0;
        paddingLayoutFromXml.requestLayout();
        C14KQ.LJIIIIZZ(getContext());
        C14KQ.LJ(getContext());
        C497820Jfg.LIZJ(getContext());
        C1030050cuZ popUpWebBottomSheetFromXml = getPopUpWebBottomSheetFromXml();
        FrameLayout popUpWebRoundLayoutFromXml = getPopUpWebRoundLayoutFromXml();
        popUpWebBottomSheetFromXml.getClass();
        ((C16G1) popUpWebRoundLayoutFromXml.getLayoutParams()).LIZIZ(popUpWebBottomSheetFromXml.LLJJLIIIJLLLLLLLZ);
        String string = bundle.getString("title");
        if (TextUtils.isEmpty(string)) {
            string = bundle.getString("bundle_web_title");
        }
        if (TextUtils.isEmpty(string)) {
            C1025930cnv c1025930cnv3 = this.LLJJLIIIJLLLLLLLZ;
            if (C123100dR.LIZ(c1025930cnv3 != null ? c1025930cnv3.LIZ : null)) {
                C1025930cnv c1025930cnv4 = this.LLJJLIIIJLLLLLLLZ;
                if (UriProtector.parse(c1025930cnv4 != null ? c1025930cnv4.LIZ : null).isHierarchical()) {
                    C1025930cnv c1025930cnv5 = this.LLJJLIIIJLLLLLLLZ;
                    string = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c1025930cnv5 != null ? c1025930cnv5.LIZ : null), "title");
                }
            }
        }
        C1035370d39 popUpWebTitleBarFromXml = getPopUpWebTitleBarFromXml();
        popUpWebTitleBarFromXml.getClass();
        if (TextUtils.isEmpty(string)) {
            string = popUpWebTitleBarFromXml.getContext().getString(2131848751);
        }
        popUpWebTitleBarFromXml.LLJ = string;
        popUpWebTitleBarFromXml.getPopUpWebTitleFromXml().setText(popUpWebTitleBarFromXml.LLJ);
        C10VO.LIZIZ(popUpWebTitleBarFromXml.getPopUpWebCloseAllFromXml());
        C10VO.LIZIZ(popUpWebTitleBarFromXml.getPopUpWebGoBackFromXml());
        C10VO.LIZIZ(popUpWebTitleBarFromXml.getPopUpWebReportFromXml());
        C10VO.LIZIZ(popUpWebTitleBarFromXml.getPopUpWebShareFromXml());
        C10VO.LIZIZ(popUpWebTitleBarFromXml.getChallengePopUpWebCloseAllFromXml());
        C786410Ut5.a9(popUpWebTitleBarFromXml.getPopUpWebGoBackFromXml(), new ACListenerS151S0100000_16(popUpWebTitleBarFromXml, 18));
        C786410Ut5.a9(popUpWebTitleBarFromXml.getChallengePopUpWebCloseAllFromXml(), new ACListenerS151S0100000_16(popUpWebTitleBarFromXml, 19));
        C786410Ut5.a9(popUpWebTitleBarFromXml.getPopUpWebReportFromXml(), new ACListenerS151S0100000_16(popUpWebTitleBarFromXml, 20));
        C786410Ut5.a9(popUpWebTitleBarFromXml.getPopUpWebCloseAllFromXml(), new ACListenerS151S0100000_16(popUpWebTitleBarFromXml, 21));
        C786410Ut5.a9(popUpWebTitleBarFromXml.getPopUpWebShareFromXml(), new ACListenerS151S0100000_16(popUpWebTitleBarFromXml, 22));
        if (bundle.getBoolean("isFromChallenge")) {
            C1035370d39 popUpWebTitleBarFromXml2 = getPopUpWebTitleBarFromXml();
            C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml2.getPopUpWebGoBackFromXml(), 8);
            C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml2.getChallengePopUpWebCloseAllFromXml(), 0);
            C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml2.getPopUpWebReportFromXml(), 8);
            C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml2.getPopUpWebCloseAllFromXml(), 8);
            C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml2.getPopUpWebShareFromXml(), 8);
            C786410Ut5.LLLLZLL(popUpWebTitleBarFromXml2.getPopUpWebTitleFromXml(), 8);
        }
        if (this.LLJJJJJIL) {
            if (this.LLJJJJLIIL) {
                C1039050d95 rootContainer2 = getPopUpWebPageWebviewSparkFromXml().getRootContainer();
                if (rootContainer2 != null) {
                    rootContainer2.LLJJLIIIJLLLLLLLZ = true;
                }
                C786410Ut5.Q0(getPopUpWebPageWebviewSparkFromXml(), 0);
                getPopUpWebPageWebviewSparkFromXml().setScrollListener(new InterfaceC1037260d6C() { // from class: X.0d3B
                    @Override // X.InterfaceC1037260d6C
                    public final void onScrollChanged(int i, int i2, int i3, int i4) {
                        boolean z;
                        WebKitView webView = this.LIZ.getPopUpWebPageWebviewSparkFromXml().getWebView();
                        if (webView != null) {
                            C1035340d36 c1035340d36 = this.LIZ;
                            Bundle bundle2 = bundle;
                            int i5 = C1030050cuZ.LLJLILLLLZIIL;
                            if (webView.getScrollY() <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1030100cue.LIZ = z;
                            c1035340d36.getPopUpWebNaviBarFromXml().LIZIZ(i, i2, i3, i4);
                            c1035340d36.LJII(webView.getScrollY(), bundle2);
                        }
                    }
                });
            }
            C1036760d5O adWebSparkViewFromXml = getAdWebSparkViewFromXml();
            int visibility = adWebSparkViewFromXml.getVisibility();
            adWebSparkViewFromXml.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, adWebSparkViewFromXml);
        } else if (getEnableWebSpark()) {
            C1036760d5O adWebSparkViewFromXml2 = getAdWebSparkViewFromXml();
            int visibility2 = adWebSparkViewFromXml2.getVisibility();
            adWebSparkViewFromXml2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, adWebSparkViewFromXml2);
            getAdWebSparkViewFromXml().setScrollListener(new InterfaceC1039660dA4() { // from class: X.0d3A
                @Override // X.InterfaceC1039660dA4
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    InterfaceC1036400d4o interfaceC1036400d4o;
                    WebKitView webView = this.LIZ.getAdWebSparkViewFromXml().getWebView();
                    if (webView != null) {
                        C1035340d36 c1035340d36 = this.LIZ;
                        Bundle bundle2 = bundle;
                        int i5 = C1030050cuZ.LLJLILLLLZIIL;
                        C1030100cue.LIZ = c1035340d36.LIZ(webView.getScrollY());
                        InterfaceC1036210d4V iAdWebBottomBar = c1035340d36.getAdWebSparkViewFromXml().getIAdWebBottomBar();
                        if (iAdWebBottomBar != null) {
                            iAdWebBottomBar.LIZIZ(i, i2, i3, i4);
                        }
                        SparkContext sparkContext = c1035340d36.getAdWebSparkViewFromXml().getSparkContext();
                        if (sparkContext != null && (interfaceC1036400d4o = (InterfaceC1036400d4o) sparkContext.LJFF(InterfaceC1036400d4o.class)) != null) {
                            interfaceC1036400d4o.LIZIZ(i, i2, i3, i4);
                        }
                        c1035340d36.LJII(webView.getScrollY(), bundle2);
                    }
                }
            });
        }
        C10VO.LIZIZ(getPopUpWebRetryBtnFromXml());
        TuxTextView debugWebviewTagFromXml = getDebugWebviewTagFromXml();
        if (debugWebviewTagFromXml != null) {
            C786410Ut5.LLLLZLL(debugWebviewTagFromXml, 8);
        } else if (LJIIL()) {
            C786410Ut5.LLIIL(getFakeUserProfileAdBottomFromXml(), 0);
            getPopUpWebBottomSheetFromXml().getBehavior().LJJII = true;
        } else {
            C786410Ut5.LLIIL(getFakeUserProfileAdBottomFromXml(), 8);
        }
        C2214201BlK.LIZLLL().LIZIZ(this.LLLIIII);
        if (C1388190mED.LIZ(getContext()) != null) {
            if (getEnableWebSpark()) {
                getContext();
                C1035680d3e c1035680d3e = new C1035680d3e();
                c1035680d3e.LIZ = new InterfaceC1035710d3h() { // from class: X.0d3S
                    @Override // X.InterfaceC1035710d3h
                    public final void LIZ() {
                        if (this.LIZ.LIZLLL(true)) {
                            return;
                        }
                        this.LIZ.getClass();
                        this.LIZ.LJ(false);
                        InterfaceC1035570d3T titleBarCallback = this.LIZ.getTitleBarCallback();
                        if (titleBarCallback != null) {
                            titleBarCallback.LIZ();
                        }
                    }

                    @Override // X.InterfaceC1035710d3h
                    public final void LIZIZ() {
                        EnumC1538460q8a enumC1538460q8a;
                        AbstractC1968807nS abstractC1968807nS;
                        AbstractC1968807nS abstractC1968807nS2;
                        InterfaceC1036110d4L interfaceC1036110d4L;
                        IAdWebShareService iAdWebShareService;
                        SparkContext sparkContext = this.LIZ.getAdWebSparkViewFromXml().getSparkContext();
                        if (sparkContext != null && (iAdWebShareService = (IAdWebShareService) PluggableExtentionKt.pluggableSpi$default(IAdWebShareService.class, false, false, false, 14, null)) != null) {
                            iAdWebShareService.LIZ(sparkContext);
                        }
                        SparkContext sparkContext2 = this.LIZ.getAdWebSparkViewFromXml().getSparkContext();
                        if (sparkContext2 != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext2.LJFF(InterfaceC1036110d4L.class)) != null) {
                            interfaceC1036110d4L.LJIJI();
                        }
                        if (((Boolean) C276450AsV.LIZ.getValue()).booleanValue()) {
                            IAdWebShareService iAdWebShareService2 = (IAdWebShareService) ServiceManager.get().getService(IAdWebShareService.class);
                            SparkContext sparkContext3 = this.LIZ.getAdWebSparkViewFromXml().getSparkContext();
                            if (sparkContext3 != null) {
                                iAdWebShareService2.LIZLLL(sparkContext3, this.LIZ.getAdWebSparkViewFromXml().getWebView());
                                return;
                            }
                            return;
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = this.LIZ.getAdWebSparkViewFromXml().getSparkView();
                        if (sparkView == null || (enumC1538460q8a = sparkView.LLJLILLLLZIIL) == null) {
                            enumC1538460q8a = EnumC1538460q8a.INIT;
                        }
                        if (enumC1538460q8a.ordinal() < EnumC1538460q8a.SUCCESS.ordinal()) {
                            SparkContext sparkContext4 = this.LIZ.getAdWebSparkViewFromXml().getSparkContext();
                            if (sparkContext4 == null || (abstractC1968807nS = (AbstractC1968807nS) sparkContext4.LJFF(AbstractC1968807nS.class)) == null) {
                                return;
                            }
                            ShareH5Service.LIZ.getClass();
                            C1038660d8S.LIZ().LJIJJLI(abstractC1968807nS);
                            return;
                        }
                        SparkContext sparkContext5 = this.LIZ.getAdWebSparkViewFromXml().getSparkContext();
                        if (sparkContext5 == null || (abstractC1968807nS2 = (AbstractC1968807nS) sparkContext5.LJFF(AbstractC1968807nS.class)) == null) {
                            return;
                        }
                        C1035340d36 c1035340d36 = this.LIZ;
                        ShareH5Service.LIZ.getClass();
                        C1038660d8S.LIZ().LIZJ(abstractC1968807nS2, c1035340d36.getAdWebSparkViewFromXml().getWebView());
                    }
                };
                getAdWebSparkViewFromXml().setIAdWebTitleBar(c1035680d3e);
                getAdWebSparkViewFromXml().setIAdWebBottomBar(new C1036000d4A(getContext(), null, 14));
            }
            this.LLJJJ = new AbstractC1038400d82() { // from class: X.0d38
                {
                    super(this.LLILLJJLI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
                
                    if (r5.LLILLJJLI.getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ == 4) goto L39;
                 */
                @Override // X.InterfaceC1399350mWD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onKeyDown(int r6, android.view.KeyEvent r7) {
                    /*
                        r5 = this;
                        r3 = 0
                        r4 = 4
                        if (r6 != r4) goto L92
                        X.0d36 r0 = r5.LLILLJJLI
                        boolean r0 = r0.LJIIJJI()
                        if (r0 != 0) goto L12
                        X.0d36 r0 = r5.LLILLJJLI
                        boolean r0 = r0.LLJJL
                        if (r0 == 0) goto L92
                    L12:
                        X.0d36 r0 = r5.LLILLJJLI
                        boolean r0 = r0.LJIIL()
                        if (r0 == 0) goto L46
                        X.0d36 r0 = r5.LLILLJJLI
                        X.0cuZ r0 = r0.getPopUpWebBottomSheetFromXml()
                        com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r1 = r0.getBehavior()
                        boolean r0 = r1.LIZJ
                        if (r0 == 0) goto L75
                        r2 = -1
                    L29:
                        X.0d36 r0 = r5.LLILLJJLI
                        android.content.Context r1 = r0.getContext()
                        r0 = 1115684864(0x42800000, float:64.0)
                        float r0 = X.C12ES.LIZJ(r0, r1)
                        int r0 = (int) r0
                        if (r2 != r0) goto L46
                        X.0d36 r0 = r5.LLILLJJLI
                        X.0cuZ r0 = r0.getPopUpWebBottomSheetFromXml()
                        com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r0 = r0.getBehavior()
                        int r0 = r0.LJIIIIZZ
                        if (r0 == r4) goto L92
                    L46:
                        X.0d36 r0 = r5.LLILLJJLI
                        X.0d5O r0 = r0.getAdWebSparkViewFromXml()
                        com.bytedance.hybrid.spark.SparkContext r1 = r0.getSparkContext()
                        if (r1 == 0) goto L73
                        java.lang.Class<X.0d5X> r0 = X.InterfaceC1036850d5X.class
                        java.lang.Object r2 = r1.LJFF(r0)
                        X.0d5X r2 = (X.InterfaceC1036850d5X) r2
                    L5a:
                        X.0d36 r0 = r5.LLILLJJLI
                        boolean r0 = r0.getEnableWebSpark()
                        r1 = 1
                        if (r0 == 0) goto L78
                        boolean r0 = X.C288380BSa.LIZ
                        if (r0 == 0) goto L78
                        if (r2 == 0) goto L78
                        boolean r0 = r2.canGoBack()
                        if (r0 != r1) goto L78
                        r2.LIZIZ(r1)
                        return r1
                    L73:
                        r2 = 0
                        goto L5a
                    L75:
                        int r2 = r1.LIZIZ
                        goto L29
                    L78:
                        X.0d36 r0 = r5.LLILLJJLI
                        boolean r0 = r0.LIZLLL(r3)
                        if (r0 == 0) goto L81
                        return r1
                    L81:
                        X.0d36 r0 = r5.LLILLJJLI
                        X.0bsS r0 = r0.getKeyDownCallBack()
                        if (r0 == 0) goto L8c
                        r0.onBackPress()
                    L8c:
                        X.0d36 r0 = r5.LLILLJJLI
                        r0.LJ(r3)
                        return r1
                    L92:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1035360d38.onKeyDown(int, android.view.KeyEvent):boolean");
                }
            };
            if (this.LLJJJJJIL) {
                C1025930cnv c1025930cnv6 = this.LLJJLIIIJLLLLLLLZ;
                if (c1025930cnv6 != null && c1025930cnv6.LIZIZ != null && this.LLJJJJLIIL && (rootContainer = getPopUpWebPageWebviewSparkFromXml().getRootContainer()) != null && (interfaceC1039110d9B = rootContainer.LL) != null && (downloadBusiness = (DownloadBusiness) interfaceC1039110d9B.LIZIZ(DownloadBusiness.class)) != null) {
                    downloadBusiness.LIZJ = R.id.aah;
                }
            } else {
                C1025930cnv c1025930cnv7 = this.LLJJLIIIJLLLLLLLZ;
                if (c1025930cnv7 != null && c1025930cnv7.LIZIZ != null && getEnableWebSpark()) {
                    C1035880d3y c1035880d3y = new C1035880d3y(null, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, null, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
                    C1025930cnv c1025930cnv8 = this.LLJJLIIIJLLLLLLLZ;
                    c1035880d3y.setAwemeRawAd(c1025930cnv8 != null ? c1025930cnv8.LJ : null);
                    C1025930cnv c1025930cnv9 = this.LLJJLIIIJLLLLLLLZ;
                    c1035880d3y.setTitle((c1025930cnv9 == null || (awemeRawAd = c1025930cnv9.LJ) == null) ? null : awemeRawAd.getWebTitle());
                    c1035880d3y.setForbidJump(true);
                    c1035880d3y.setCommerceEnterFrom(bundle.getString("commerce_enter_from"));
                    getAdWebSparkViewFromXml().setAdWebModel(c1035880d3y);
                    C1036760d5O adWebSparkViewFromXml3 = getAdWebSparkViewFromXml();
                    C1025930cnv c1025930cnv10 = this.LLJJLIIIJLLLLLLLZ;
                    adWebSparkViewFromXml3.setPseudoAdData(c1025930cnv10 != null ? c1025930cnv10.LJIIIZ : null);
                }
            }
            getPopUpWebBottomSheetFromXml().setCallback(this.LLLJ);
            getPopUpWebBottomSheetFromXml().getBehavior().LJIJJLI = true;
            C786410Ut5.h9(getPopUpWebRetryBtnFromXml(), new ACListenerS151S0100000_16(this, 62));
            getPopUpWebTitleBarFromXml().setTitleBarListener(this.LLLL);
            getPopUpWebNaviBarFromXml().setNaviBarListener(this.LLLLII);
            getPopUpWebTitleBarFromXml().setOnTouchListener(new ATListenerS449S0100000_16(this, 4));
            if (this.LLJJJJJIL) {
                if (this.LLJJJJLIIL) {
                    getPopUpWebPageWebviewSparkFromXml().setOutTouchDelegate(this.LLLJL);
                }
            } else if (getEnableWebSpark()) {
                getAdWebSparkViewFromXml().setTouchListener(this.LLLJL);
            }
            if (LJIIJ()) {
                C1035370d39 popUpWebTitleBarFromXml3 = getPopUpWebTitleBarFromXml();
                popUpWebTitleBarFromXml3.getClass();
                int iLIZ = C341940Daq.LIZ(12.0d);
                C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml3.getPopUpWebShareFromXml(), 0);
                C786410Ut5.LLLLLLZZ(popUpWebTitleBarFromXml3.getPopUpWebReportFromXml(), 8);
                popUpWebTitleBarFromXml3.getPopUpWebCloseAllFromXml().setPadding(iLIZ, iLIZ, iLIZ, iLIZ);
                ViewGroup.LayoutParams layoutParams = popUpWebTitleBarFromXml3.getPopUpWebTitleBarInFromXml().getLayoutParams();
                layoutParams.height = C341940Daq.LIZ(52.5d);
                C786410Ut5.m6(popUpWebTitleBarFromXml3.getPopUpWebTitleBarInFromXml(), layoutParams);
                popUpWebTitleBarFromXml3.getPopUpWebTitleBarInFromXml().setBackgroundResource(R.drawable.ajg);
                int iLIZ2 = C341940Daq.LIZ(52.5d);
                LJJ(iLIZ2, getPopUpWebPageWebviewSparkFromXml());
                LJJ(iLIZ2, getPopUpWebNetworkErrorViewFromXml());
            }
        }
        Function0<? extends Object> function0 = this.LLJLL;
        if (function0 != null) {
            function0.invoke();
        }
        if (!this.LLJJJJJIL && getEnableWebSpark() && (adWebModel = getAdWebSparkViewFromXml().getAdWebModel()) != null) {
            adWebModel.setNineScreen(1);
        }
        C1017530caN.LJI = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC1039110d9B interfaceC1039110d9B;
        DownloadBusiness downloadBusiness;
        Activity activity;
        if (this.LLJJJJJIL) {
            if (this.LLJJJJLIIL) {
                AdPopUpLynxContainer adPopUpLynxContainer = this.LLJJJIL;
                if (adPopUpLynxContainer != null) {
                    adPopUpLynxContainer.LL.getLifecycle().removeObserver(adPopUpLynxContainer);
                }
                C1039050d95 rootContainer = getPopUpWebPageWebviewSparkFromXml().getRootContainer();
                if (rootContainer != null && (interfaceC1039110d9B = rootContainer.LL) != null && (downloadBusiness = (DownloadBusiness) interfaceC1039110d9B.LIZIZ(DownloadBusiness.class)) != null && (activity = downloadBusiness.LIZ.getActivity()) != null) {
                    int i = downloadBusiness.LIZJ;
                    if (i == 0) {
                        i = R.id.a81;
                    }
                    activity.findViewById(i);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = getPopUpWebPageWebviewSparkFromXml().LL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
            }
        } else if (getEnableWebSpark()) {
            getAdWebSparkViewFromXml().LJFF();
            AdPopUpSparkWebContainer adPopUpSparkWebContainer = this.LLJJJJ;
            if (adPopUpSparkWebContainer != null) {
                adPopUpSparkWebContainer.LL.getLifecycle().removeObserver(adPopUpSparkWebContainer);
            }
        }
        C622680Oba.LIZLLL(this);
        super.onDetachedFromWindow();
        C1035360d38 c1035360d38 = this.LLJJJ;
        if (c1035360d38 != null) {
            c1035360d38.enable(false);
        }
        this.LLJJJ = null;
        dispose();
    }

    private final EnumC1036690d5H getWebReuseMode() {
        EnumC1036690d5H webReuseMode;
        C1036760d5O adWebSparkViewFromXml = getAdWebSparkViewFromXml();
        return (adWebSparkViewFromXml == null || (webReuseMode = adWebSparkViewFromXml.getWebReuseMode()) == null) ? EnumC1036690d5H.NORMAL : webReuseMode;
    }

    public final boolean LIZIZ() {
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        return interfaceC1030370cv5 != null && interfaceC1030370cv5.nr(getAdWebSparkViewFromXml().getAdWebModel());
    }

    public final boolean LIZJ() {
        if (!LJIIL() || getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ == 4) {
            return ((Boolean) C0A6P.LIZ.getValue()).booleanValue() && getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 1 && getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ != 5;
        }
        return true;
    }

    public final boolean LJIIJJI() {
        C1030050cuZ popUpWebBottomSheetFromXml = getPopUpWebBottomSheetFromXml();
        if (popUpWebBottomSheetFromXml == null) {
            return false;
        }
        int i = popUpWebBottomSheetFromXml.LLJJLIIIJLLLLLLLZ.LJIIIIZZ;
        return i == 3 || i == 4;
    }

    public final boolean LJIIL() {
        return getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 4 || getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 5 || getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 6;
    }

    public final boolean LJIILIIL() {
        return getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 1;
    }

    public final boolean LJIILJJIL() {
        return getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x014e A[PHI: r3
      0x014e: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:36:0x0098, B:34:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035340d36.LJIIZILJ():void");
    }

    public final boolean LJJI() {
        C1025930cnv c1025930cnv;
        IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class);
        C1025930cnv c1025930cnv2 = this.LLJJLIIIJLLLLLLLZ;
        return (iAdLynxLandPageUtils.LIZLLL(c1025930cnv2 != null ? c1025930cnv2.LJ : null) || !((c1025930cnv = this.LLJJLIIIJLLLLLLLZ) == null || c1025930cnv.LJIIIIZZ == null)) && this.LLJJJJJIL;
    }

    public final void LJJII() {
        if ((getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 3 || getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 5) && getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ == 6) {
            getPopUpWebBottomSheetFromXml().LJIJJLI();
        }
    }

    public final C1029600ctq getActionMode() {
        return getPopUpWebBottomSheetFromXml().getActionMode();
    }

    public final InterfaceC1041500dD2 getAdWebInfo() {
        return getAdWebSparkViewFromXml().getAdWebModel();
    }

    public final WebKitView getAdWebSparkView() {
        return getAdWebSparkViewFromXml().getWebView();
    }

    public final boolean getFromTitleBarClick() {
        return this.LLLFZ;
    }

    public final InterfaceC990300bsS getKeyDownCallBack() {
        return this.LLJLILLLLZIIL;
    }

    public final InterfaceC1035410d3D getMBehaviorCallback() {
        return this.LLJLIL;
    }

    public final int getMDownX() {
        return this.LLLILZ;
    }

    public final int getMDownY() {
        return this.LLLILZJ;
    }

    public final C1025930cnv getParams() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getRenderType() {
        return this.LLLI;
    }

    public final InterfaceC1035570d3T getTitleBarCallback() {
        return this.LLJL;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0d3E] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0d3I] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0d3R] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0d3J] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0d3C] */
    public C1035340d36(final Context context) {
        super(context, null, 0);
        this.LLJJJJLIIL = true;
        this.LLLI = "";
        this.LLLII = C452501pT.LIZ(EnumC452301pR.NONE, new AwS417S0200000_16(context, this, 49));
        this.LLLIIII = new C11N2<Boolean>() { // from class: X.0d3C
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                InterfaceC1036110d4L interfaceC1036110d4L;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SparkContext sparkContext = this.LLILLJJLI.getAdWebSparkViewFromXml().getSparkContext();
                if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJIILL(zBooleanValue);
                }
            }
        };
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(354));
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        this.LLLIIIL = c19egLIZIZ != null ? c19egLIZIZ.getOnBackPressedDispatcher() : null;
        this.LLLIIL = new C1077160e8Y(this, 0);
        this.LLLIILIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 656));
        this.LLLIL = new C1077570e9D(this, 3);
        this.LLLIZZ = new AbstractC1024610cln() { // from class: X.0d3E
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                final C1318590kPx c1318590kPx;
                if (!this.LL.LLLILZLLLI && interfaceC1541990qEH.e1() != null && (interfaceC1541990qEH.e1() instanceof LynxView)) {
                    View viewFindViewByName = ((LynxView) interfaceC1541990qEH.e1()).findViewByName("lynx-landing-page-scroll-view-container");
                    if ((viewFindViewByName instanceof C1318590kPx) && (c1318590kPx = (C1318590kPx) viewFindViewByName) != null) {
                        c1318590kPx.setOnScrollListener(new InterfaceC1318670kQ5() { // from class: X.0d3F
                            @Override // X.InterfaceC1318670kQ5
                            public final void LIZ(int i) {
                            }

                            @Override // X.InterfaceC1318670kQ5
                            public final void LIZJ() {
                            }

                            @Override // X.InterfaceC1318670kQ5
                            public final void LJIJJ() {
                            }

                            @Override // X.InterfaceC1318670kQ5
                            public final void LJIJJLI() {
                            }

                            @Override // X.InterfaceC1318670kQ5
                            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                                boolean z;
                                int i5 = C1030050cuZ.LLJLILLLLZIIL;
                                if (c1318590kPx.getScrollY() <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C1030100cue.LIZ = z;
                            }
                        });
                    }
                    View viewE1 = interfaceC1541990qEH.e1();
                    if (viewE1 != null) {
                        viewE1.setOnTouchListener(new ATListenerS449S0100000_16(this.LL, 5));
                    }
                    this.LL.LLJZIJLIL = (LynxView) interfaceC1541990qEH.e1();
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                SparkContext sparkContext;
                C1035340d36 c1035340d36 = this.LL;
                C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                if (hybridContext instanceof SparkContext) {
                    sparkContext = (SparkContext) hybridContext;
                } else {
                    sparkContext = null;
                }
                c1035340d36.LLL = sparkContext;
                this.LL.LLLILZLLLI = false;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                this.LL.LLLILZLLLI = true;
            }
        };
        this.LLLJ = new C1035350d37(context, this);
        this.LLLJIL = new InterfaceC1026000co2() { // from class: X.0d3I
            @Override // X.InterfaceC1026000co2
            public final void LJIJJLI() {
                C1035340d36.LLLLIIL.getClass();
            }
        };
        this.LLLJL = new ATListenerS449S0100000_16(this, 10);
        this.LLLL = new InterfaceC1035450d3H() { // from class: X.0d3R
            @Override // X.InterfaceC1035450d3H
            public final void LIZ() {
                WebKitView webKitView;
                C1035340d36 c1035340d36 = this;
                if (c1035340d36.LLJJJJJIL && c1035340d36.LLJJJJLIIL && (webKitView = c1035340d36.getPopUpWebPageWebviewSparkFromXml().LLILZIL) != null && webKitView.canGoBack()) {
                    webKitView.goBack();
                }
                InterfaceC1035570d3T titleBarCallback = this.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.LIZIZ();
                }
            }

            @Override // X.InterfaceC1035450d3H
            public final void LIZIZ() {
                if (this.LIZLLL(true)) {
                    return;
                }
                this.getClass();
                this.LJ(false);
                InterfaceC1035570d3T titleBarCallback = this.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.LIZ();
                }
            }

            @Override // X.InterfaceC1035450d3H
            public final void LIZJ() {
                C1039060d96 c1039060d96;
                InterfaceC1039110d9B interfaceC1039110d9B;
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ == null) {
                    return;
                }
                C1035340d36 c1035340d36 = this;
                if (c1035340d36.LLJJJJJIL && c1035340d36.LLJJJJLIIL) {
                    C1039050d95 rootContainer = c1035340d36.getPopUpWebPageWebviewSparkFromXml().getRootContainer();
                    C1041600dDC params = null;
                    if (rootContainer != null && (interfaceC1039110d9B = rootContainer.LL) != null) {
                        params = interfaceC1039110d9B.getParams();
                    }
                    if (!(params instanceof C1038730d8Z) || (c1039060d96 = (C1039060d96) params) == null) {
                        return;
                    }
                    String str = (String) c1039060d96.LJJJJZI.LIZJ();
                    if (str == null) {
                        str = "";
                    }
                    C1039050d95 rootContainer2 = this.getPopUpWebPageWebviewSparkFromXml().getRootContainer();
                    if (rootContainer2 != null && rootContainer2.LL.LIZIZ(ReportBusiness.class) != null) {
                        C988570bpf.LIZ.getClass();
                        if (C1041070dCL.LIZ() != null) {
                            C1028210crb.LJJIFFI(activityLIZ, str);
                        }
                    }
                }
                InterfaceC1035570d3T titleBarCallback = this.getTitleBarCallback();
                if (titleBarCallback != null) {
                    titleBarCallback.LIZJ();
                }
            }

            @Override // X.InterfaceC1035450d3H
            public final void LIZLLL() {
                EnumC1538460q8a enumC1538460q8a;
                AbstractC1968807nS abstractC1968807nS;
                AbstractC1968807nS abstractC1968807nS2;
                InterfaceC1036110d4L interfaceC1036110d4L;
                if (this.LJIIJ() && this.getEnableWebSpark()) {
                    SparkContext sparkContext = this.getAdWebSparkViewFromXml().getSparkContext();
                    if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                        interfaceC1036110d4L.LJIJI();
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = this.getAdWebSparkViewFromXml().getSparkView();
                    if (sparkView == null || (enumC1538460q8a = sparkView.LLJLILLLLZIIL) == null) {
                        enumC1538460q8a = EnumC1538460q8a.INIT;
                    }
                    if (enumC1538460q8a.ordinal() < EnumC1538460q8a.SUCCESS.ordinal()) {
                        SparkContext sparkContext2 = this.getAdWebSparkViewFromXml().getSparkContext();
                        if (sparkContext2 == null || (abstractC1968807nS = (AbstractC1968807nS) sparkContext2.LJFF(AbstractC1968807nS.class)) == null) {
                            return;
                        }
                        ShareH5Service.LIZ.getClass();
                        C1038660d8S.LIZ().LJIJJLI(abstractC1968807nS);
                        return;
                    }
                    SparkContext sparkContext3 = this.getAdWebSparkViewFromXml().getSparkContext();
                    if (sparkContext3 == null || (abstractC1968807nS2 = (AbstractC1968807nS) sparkContext3.LJFF(AbstractC1968807nS.class)) == null) {
                        return;
                    }
                    C1035340d36 c1035340d36 = this;
                    ShareH5Service.LIZ.getClass();
                    C1038660d8S.LIZ().LIZJ(abstractC1968807nS2, c1035340d36.getAdWebSparkViewFromXml().getWebView());
                }
            }
        };
        this.LLLLII = new InterfaceC1037310d6H() { // from class: X.0d3J
            @Override // X.InterfaceC1037310d6H
            public final void LIZ() {
                WebKitView webKitView;
                C1035340d36 c1035340d36 = this.LIZ;
                if (!c1035340d36.LLJJJJJIL) {
                    c1035340d36.getEnableWebSpark();
                } else if (c1035340d36.LLJJJJLIIL && (webKitView = c1035340d36.getPopUpWebPageWebviewSparkFromXml().LLILZIL) != null && webKitView.canGoBack()) {
                    webKitView.goBack();
                }
            }

            @Override // X.InterfaceC1037310d6H
            public final void LIZIZ() {
                WebKitView webKitView;
                C1035340d36 c1035340d36 = this.LIZ;
                if (!c1035340d36.LLJJJJJIL) {
                    c1035340d36.getEnableWebSpark();
                } else if (c1035340d36.LLJJJJLIIL && (webKitView = c1035340d36.getPopUpWebPageWebviewSparkFromXml().LLILZIL) != null && webKitView.canGoForward()) {
                    webKitView.goForward();
                }
            }
        };
    }

    private final void setShouldHideBottomNavBar(String str) {
        if (UriProtector.parse(str).isHierarchical() && !TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "hide_bottom_nav_bar"), "1") && !TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "hide_title_bar"), "1")) {
            TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "hide_nav_bar"), "1");
        }
    }

    public final boolean LIZ(int i) {
        if (LIZIZ()) {
            if (i > 0) {
                return false;
            }
        } else if (i > 0 && (!LJIILJJIL() || getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ != 6)) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(boolean z) {
        Context context;
        Activity activityLIZ;
        if (getPopUpWebBottomSheetFromXml().getPopUpWebRoundLayoutFromXml().getY() != 0.0f) {
            return false;
        }
        if ((!(!getAdWebSparkViewFromXml().LIZ()) && !z) || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return false;
        }
        return getAdLandPageSurveyService().LIZIZ(activityLIZ, new AwS560S0100000_16(this, 169));
    }

    public final void LJ(boolean z) {
        View viewFindFocus;
        Activity activityLIZ;
        Window window;
        View decorView;
        int i;
        WebKitView webView;
        if (this.LLJJJJJIL) {
            if (this.LLJJJJLIIL && (webView = getPopUpWebPageWebviewSparkFromXml().getWebView()) != null) {
                webView.destroy();
            }
            LynxView lynxView = this.LLJZIJLIL;
            if (lynxView != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(lynxView, null);
                lynxView.removeAllViews();
            }
        }
        if (LJIIL() && !z) {
            AdPopUpWebBottomSheetBehavior<C1030050cuZ> behavior = getPopUpWebBottomSheetFromXml().getBehavior();
            if (behavior.LIZJ) {
                i = -1;
            } else {
                i = behavior.LIZIZ;
            }
            if (i != ((int) C12ES.LIZJ(64.0f, getContext()))) {
                InterfaceC1035410d3D interfaceC1035410d3D = this.LLJLIL;
                if (interfaceC1035410d3D != null) {
                    interfaceC1035410d3D.LIZJ(this.LLLJ.LIZ, Boolean.FALSE);
                }
                C786410Ut5.LJZ(8, getPopUpWebMarkFromXml());
                C786410Ut5.LLIIL(getFakeUserProfileAdBottomFromXml(), 0);
                C786410Ut5.Y4(getFakeUserProfileAdBottomFromXml(), 1.0f);
            }
            getPopUpWebBottomSheetFromXml().getBehavior().setPeekHeight((int) C12ES.LIZJ(64.0f, getContext()));
            getPopUpWebBottomSheetFromXml().LLJJLIIIJLLLLLLLZ.setState(4);
        } else {
            getPopUpWebBottomSheetFromXml().getBehavior().LJI = true;
            AdPopUpWebBottomSheetBehavior<C1030050cuZ> adPopUpWebBottomSheetBehavior = getPopUpWebBottomSheetFromXml().LLJJLIIIJLLLLLLLZ;
            int i2 = adPopUpWebBottomSheetBehavior.LJIIIIZZ;
            if (i2 == 3 || i2 == 4 || i2 == 6) {
                adPopUpWebBottomSheetBehavior.setState(5);
            }
        }
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindFocus = decorView.findFocus();
        } else {
            viewFindFocus = null;
        }
        C1069330dvv.LIZ(context, viewFindFocus);
        HandlerHook.viewRemoveCallbacks(getAdBottomButtonNewFromXml(), this.LLLF);
        HandlerHook.viewRemoveCallbacks(getAdBottomButtonNewFromXml(), this.LLLFF);
    }

    public final C03IT LJFF(User user) {
        UrlModel avatarLarger;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarLarger = user.getAvatarMedium();
        } else if (user.getAvatarThumb() != null) {
            avatarLarger = user.getAvatarThumb();
        } else {
            if (user.getAvatarLarger() != null) {
                avatarLarger = user.getAvatarLarger();
            }
            return null;
        }
        if (avatarLarger != null) {
            return new C03IT(avatarLarger.getUrlList());
        }
        return null;
    }

    public final String LJI(AwemeRawAd awemeRawAd) {
        String str;
        String pageId;
        String strLJI;
        NativeSiteConfig nativeSiteConfig;
        String webTitle = null;
        if (!((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZLLL(awemeRawAd)) {
            return null;
        }
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (str = nativeSiteConfig.lynxScheme) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        if (awemeRawAd != null) {
            pageId = awemeRawAd.getPageId();
        } else {
            pageId = null;
        }
        C786410Ut5.LJJJI("page_id", pageId, bundle);
        C1037700d6u.LIZ.getClass();
        C786410Ut5.LJJJI("landPageShowType", String.valueOf(C1037700d6u.LIZLLL(awemeRawAd)), bundle);
        Uri.Builder builderBuildUpon = UriProtector.parse(C08RU.LIZ(bundle, str)).buildUpon();
        IAdLynxLandPageUtils adLynxLandPageUtil = C1029500ctg.LIZIZ.getAdLynxLandPageUtil();
        if (adLynxLandPageUtil != null) {
            strLJI = adLynxLandPageUtil.LJI(awemeRawAd, getContext(), Boolean.TRUE, Boolean.FALSE, "slide_1px", null, null);
        } else {
            strLJI = null;
        }
        builderBuildUpon.appendQueryParameter("lynx_landing_page_data", strLJI);
        if (awemeRawAd != null) {
            webTitle = awemeRawAd.getWebTitle();
        }
        builderBuildUpon.appendQueryParameter("lynx_landing_page_title", webTitle);
        return builderBuildUpon.toString();
    }

    public final void LJIIIIZZ(C1025100cma c1025100cma) {
        if (c1025100cma != null) {
            String string = UUID.randomUUID().toString();
            if (getEnableWebSpark()) {
                C1035880d3y adWebModel = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel != null) {
                    adWebModel.setFromJsb(c1025100cma.LJIIJ);
                }
                C1035880d3y adWebModel2 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel2 != null) {
                    adWebModel2.setSessionId(string);
                }
            }
        }
    }

    public final void LJIIIZ(Function0<? extends Object> function0) {
        if (getPaddingLayoutFromXml() == null) {
            this.LLJLL = function0;
        } else {
            function0.invoke();
        }
    }

    public final void LJIJI(boolean z) {
        C1025100cma c1025100cma;
        AwemeRawAd awemeRawAd;
        String commerceEnterFrom;
        String string;
        String string2;
        String requestId;
        Aweme aweme;
        C1035880d3y adWebModel;
        if (getPopUpWebBottomSheetFromXml().getPopUpWebRoundLayoutFromXml().getY() == 0.0f && (c1025100cma = this.LLJLLIL) != null && (awemeRawAd = c1025100cma.LIZIZ) != null) {
            if (z) {
                if (!getEnableWebSpark() || (adWebModel = getAdWebSparkViewFromXml().getAdWebModel()) == null || (commerceEnterFrom = adWebModel.getCommerceEnterFrom()) == null) {
                    commerceEnterFrom = "";
                }
                LandingPageSurveyModel landingPageSurvey = awemeRawAd.getLandingPageSurvey();
                if (landingPageSurvey != null) {
                    IAdLandPageSurveyService adLandPageSurveyService = getAdLandPageSurveyService();
                    Long adId = awemeRawAd.getAdId();
                    if (adId == null || (string = adId.toString()) == null) {
                        string = "";
                    }
                    Long creativeId = awemeRawAd.getCreativeId();
                    if (creativeId == null || (string2 = creativeId.toString()) == null) {
                        string2 = "";
                    }
                    C1025100cma c1025100cma2 = this.LLJLLIL;
                    if (c1025100cma2 == null || (aweme = c1025100cma2.LJIIIIZZ) == null || (requestId = aweme.getRequestId()) == null) {
                        requestId = "";
                    }
                    adLandPageSurveyService.LJII(commerceEnterFrom, string, string2, requestId, awemeRawAd.getLogExtra(), landingPageSurvey.schemaUrl, landingPageSurvey.enableLandingPageSurvey, landingPageSurvey.showSurveyTimeInterval, landingPageSurvey.pageDwellTime);
                    return;
                }
                return;
            }
            getAdLandPageSurveyService().LIZ();
        }
    }

    public final void LJIJJ(boolean z) {
        SparkContext sparkContext;
        InterfaceC1038080d7W interfaceC1038080d7W;
        C1035910d41 webLoadStatusModel;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        WebKitView webKitView;
        if (this.LLJJJJJIL) {
            if (this.LLJJJJLIIL) {
                WebKitView webView = getPopUpWebPageWebviewSparkFromXml().getWebView();
                if (webView != null) {
                    webView.loadUrl("about:blank");
                } else {
                    SparkContext sparkContext2 = this.LLL;
                    if (sparkContext2 != null) {
                        interfaceC1541990qEHLJIJJ = sparkContext2.LJIJJ();
                    } else {
                        interfaceC1541990qEHLJIJJ = null;
                    }
                    if ((interfaceC1541990qEHLJIJJ instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEHLJIJJ) != null) {
                        webKitView.loadUrl("about:blank");
                    }
                }
                this.LLL = null;
            }
            LynxView lynxView = this.LLJZIJLIL;
            if (lynxView != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(lynxView, null);
                lynxView.removeAllViews();
                return;
            }
            return;
        }
        C1025100cma c1025100cma = this.LLJLLIL;
        if (c1025100cma != null && c1025100cma.LJIIL) {
            return;
        }
        if (getEnableWebSpark() && LIZIZ()) {
            C1035880d3y adWebModel = getAdWebSparkViewFromXml().getAdWebModel();
            if (adWebModel != null) {
                adWebModel.setOnLoadUrlCheck(false);
            }
            C1036760d5O adWebSparkViewFromXml = getAdWebSparkViewFromXml();
            adWebSparkViewFromXml.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reLoad ");
            sbLIZ.append("about:blank");
            C2188811AlT.LIZIZ(sbLIZ);
            WebKitView webKitView2 = adWebSparkViewFromXml.LLIZ;
            if (webKitView2 != null) {
                C1542640qFK c1542640qFK = C1542620qFI.LIZ;
                c1542640qFK.get().LIZ.push(new C2286671Eev[0]);
                webKitView2.loadUrl("about:blank");
                c1542640qFK.get().LIZ.pop();
            }
            C1035880d3y adWebModel2 = getAdWebSparkViewFromXml().getAdWebModel();
            if (adWebModel2 != null && (webLoadStatusModel = adWebModel2.getWebLoadStatusModel()) != null) {
                webLoadStatusModel.setStopLoading(true);
            }
        }
        if (!z) {
            return;
        }
        C1025930cnv c1025930cnv = this.LLJJLIIIJLLLLLLLZ;
        if ((c1025930cnv != null && c1025930cnv.LJII) || (sparkContext = getAdWebSparkViewFromXml().getSparkContext()) == null || (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) == null) {
            return;
        }
        interfaceC1038080d7W.onDestroy();
    }

    public final void LJIJJLI(EnumC1036690d5H enumC1036690d5H) {
        C1036760d5O adWebSparkViewFromXml = getAdWebSparkViewFromXml();
        if (adWebSparkViewFromXml != null) {
            adWebSparkViewFromXml.setWebReuseMode(enumC1036690d5H);
        }
    }

    public final void LJIL(String str) throws JSONException {
        InterfaceC1039110d9B interfaceC1039110d9B;
        AdLynxStatBusiness adLynxStatBusiness;
        InterfaceC1039110d9B interfaceC1039110d9B2;
        AdWebStatBusiness adWebStatBusiness;
        C1039050d95 rootContainer = getPopUpWebPageWebviewSparkFromXml().getRootContainer();
        if (rootContainer != null && (interfaceC1039110d9B2 = rootContainer.LL) != null && (adWebStatBusiness = (AdWebStatBusiness) interfaceC1039110d9B2.LIZIZ(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.LJIIJ(true);
        }
        C1039050d95 rootContainer2 = getPopUpWebPageWebviewSparkFromXml().getRootContainer();
        if (rootContainer2 != null && (interfaceC1039110d9B = rootContainer2.LL) != null && (adLynxStatBusiness = (AdLynxStatBusiness) interfaceC1039110d9B.LIZIZ(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.LJ(true);
        }
        if (getEnableWebSpark()) {
            getAdWebSparkViewFromXml().LJ(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(X.C1025100cma r21) {
        /*
            Method dump skipped, instruction units count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035340d36.LJJIFFI(X.0cma):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        WebKitView webView;
        if (motionEvent != null) {
            if (getPopUpWebBottomSheetFromXml().getActionMode().LIZJ == 3 && getPopUpWebBottomSheetFromXml().getBehavior().LJIIIIZZ != 3) {
                getActionMode().LIZIZ(motionEvent);
            }
            getWebViewGestureDetector().onTouchEvent(motionEvent);
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLLILZ = (int) motionEvent.getX();
                    this.LLLILZJ = (int) motionEvent.getY();
                    if (LIZJ()) {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (numValueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - this.LLLILZ) > Math.abs(motionEvent.getY() - this.LLLILZJ)) {
                        if (LIZJ()) {
                            requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                } else if (numValueOf.intValue() == 1 && getEnableWebSpark() && !LIZIZ() && (webView = getAdWebSparkViewFromXml().getWebView()) != null) {
                    int i = C1030050cuZ.LLJLILLLLZIIL;
                    C1030100cue.LIZ = LIZ(webView.getScrollY());
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageCloseEvent(C1035440d3G c1035440d3G) {
        C1037220d68 popUpWebPageWebviewSparkFromXml;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        View viewE1;
        WebKitView webView;
        if (c1035440d3G.LIZIZ) {
            if (getEnableWebSpark() && (webView = getAdWebSparkViewFromXml().getWebView()) != null && c1035440d3G.LIZ == webView.hashCode()) {
                LJ(false);
                return;
            }
            return;
        }
        if (this.LLJJJJLIIL && (popUpWebPageWebviewSparkFromXml = getPopUpWebPageWebviewSparkFromXml()) != null && (sparkView = popUpWebPageWebviewSparkFromXml.getSparkView()) != null && (kitView = sparkView.getKitView()) != null && (viewE1 = kitView.e1()) != null && viewE1.hashCode() == c1035440d3G.LIZ) {
            LJ(false);
        }
    }

    public final void setAdBottomBarDescNewFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setAdBottomBarLayoutFromXml(LinearLayout linearLayout) {
        this.LLJILLL = linearLayout;
    }

    public final void setAdBottomBarTitleNewFromXml(TuxTextView tuxTextView) {
        this.LLJJ = tuxTextView;
    }

    public final void setAdBottomBarUserAvatarNewFromXml(C424560Gko c424560Gko) {
        this.LLJJIJI = c424560Gko;
    }

    public final void setAdBottomButtonNewFromXml(TuxIconView tuxIconView) {
        this.LLJJIJIIJIL = tuxIconView;
    }

    public final void setAdUserBottomBarUserAvatarNewFromXml(SmartAvatarImageView smartAvatarImageView) {
        this.LLJJIII = smartAvatarImageView;
    }

    public final void setAdWebSparkViewFromXml(C1036760d5O c1036760d5O) {
        this.LL = c1036760d5O;
    }

    public final void setDebugWebviewTagFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setFakeUserProfileAdBottomFromXml(RelativeLayout relativeLayout) {
        this.LLJI = relativeLayout;
    }

    public final void setFromAdButtonClick(boolean z) {
        this.LLLFFI = z;
    }

    public final void setFromTitleBarClick(boolean z) {
        this.LLLFZ = z;
    }

    public final void setKeyDownCallBack(InterfaceC990300bsS interfaceC990300bsS) {
        this.LLJLILLLLZIIL = interfaceC990300bsS;
    }

    public final void setMBehaviorCallback(InterfaceC1035410d3D interfaceC1035410d3D) {
        this.LLJLIL = interfaceC1035410d3D;
    }

    public final void setMDownX(int i) {
        this.LLLILZ = i;
    }

    public final void setMDownY(int i) {
        this.LLLILZJ = i;
    }

    public final void setPaddingLayoutFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setParams(C1025930cnv c1025930cnv) {
        this.LLJJLIIIJLLLLLLLZ = c1025930cnv;
    }

    public final void setPopUpWebBottomSheetFromXml(C1030050cuZ c1030050cuZ) {
        this.LLILLJJLI = c1030050cuZ;
    }

    public final void setPopUpWebLayoutFromXml(FrameLayout frameLayout) {
        this.LLJJIJIL = frameLayout;
    }

    public final void setPopUpWebMarkFromXml(FrameLayout frameLayout) {
        this.LLJILJILJ = frameLayout;
    }

    public final void setPopUpWebNaviBarFromXml(C1037300d6G c1037300d6G) {
        this.LLIZ = c1037300d6G;
    }

    public final void setPopUpWebNetworkErrorViewFromXml(FrameLayout frameLayout) {
        this.LLJILJIL = frameLayout;
    }

    public final void setPopUpWebPageWebviewSparkFromXml(C1037220d68 c1037220d68) {
        this.LLILZ = c1037220d68;
    }

    public final void setPopUpWebRetryBtnFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setPopUpWebRoundLayoutFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setPopUpWebTitleBarFromXml(C1035370d39 c1035370d39) {
        this.LLILZLL = c1035370d39;
    }

    public final void setPopUpWebTitleFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setRenderType(String str) {
        this.LLLI = str;
    }

    public final void setShouldStartAnimation(boolean z) {
        this.LLJZ = z;
    }

    public final void setTitleBarCallback(InterfaceC1035570d3T interfaceC1035570d3T) {
        this.LLJL = interfaceC1035570d3T;
    }

    public final void setUseLynxLandingPage(boolean z) {
        this.LLJJJJJIL = z;
    }

    public static void LJIJ(WebKitView webKitView, C1035880d3y c1035880d3y) {
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 != null) {
            interfaceC1030370cv5.HT0(webKitView, c1035880d3y, true);
        }
    }

    public final void LJII(int i, Bundle bundle) {
        if (bundle.getBoolean("isFromChallenge")) {
            if (i > C341940Daq.LIZ(32.0d)) {
                if (getPopUpWebTitleFromXml().getVisibility() == 8) {
                    C786410Ut5.LLLLZLL(getPopUpWebTitleFromXml(), 0);
                }
            } else {
                if (getPopUpWebTitleFromXml().getVisibility() != 0) {
                    return;
                }
                C786410Ut5.LLLLZLL(getPopUpWebTitleFromXml(), 8);
            }
        }
    }

    public final void LJIILLIIL(String str, String str2) {
        String string;
        String creativeIdStr;
        String logExtra;
        InterfaceC1036110d4L interfaceC1036110d4L;
        String initialData;
        int iIsPseudoAd;
        int iIntValue;
        Integer anchorType;
        String strLIZLLL = str2;
        C1025100cma c1025100cma = this.LLJLLIL;
        if (c1025100cma != null) {
            if (!C703302op.LIZ(strLIZLLL)) {
                if (C703302op.LIZ(c1025100cma.LJ)) {
                    strLIZLLL = c1025100cma.LJ;
                } else {
                    strLIZLLL = C1026350cob.LIZLLL(Integer.valueOf(c1025100cma.LIZLLL));
                }
            }
            if (getEnableWebSpark()) {
                C1035880d3y adWebModel = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel != null) {
                    adWebModel.setFromJsb(c1025100cma.LJIIJ);
                }
                C1035880d3y adWebModel2 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel2 != null) {
                    adWebModel2.setWebInitTime(System.currentTimeMillis());
                }
                C1035880d3y adWebModel3 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel3 != null) {
                    adWebModel3.setRefer(strLIZLLL);
                }
                C1035880d3y adWebModel4 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel4 != null) {
                    NonAdWebModel nonAdWebModel = c1025100cma.LJIILIIL;
                    if (nonAdWebModel != null && (anchorType = nonAdWebModel.getAnchorType()) != null) {
                        iIntValue = anchorType.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    adWebModel4.setAnchorType(iIntValue);
                }
                C1035880d3y adWebModel5 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel5 != null) {
                    NonAdWebModel nonAdWebModel2 = c1025100cma.LJIILIIL;
                    if (nonAdWebModel2 == null || (iIsPseudoAd = nonAdWebModel2.isPseudoAd()) == null) {
                        iIsPseudoAd = 0;
                    }
                    adWebModel5.setPseudoAd(iIsPseudoAd);
                }
                C1035880d3y adWebModel6 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel6 != null) {
                    adWebModel6.setNonAdWebModel(c1025100cma.LJIILIIL);
                }
                C1035880d3y adWebModel7 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel7 != null) {
                    NonAdWebModel nonAdWebModel3 = c1025100cma.LJIILIIL;
                    if (nonAdWebModel3 != null) {
                        initialData = nonAdWebModel3.getInitialData();
                    } else {
                        initialData = null;
                    }
                    adWebModel7.setInitialData(initialData);
                }
                C1035880d3y adWebModel8 = getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel8 == null || (string = adWebModel8.getSessionId()) == null || a0.LJJJIL(string)) {
                    string = UUID.randomUUID().toString();
                    C1035880d3y adWebModel9 = getAdWebSparkViewFromXml().getAdWebModel();
                    if (adWebModel9 != null) {
                        adWebModel9.setSessionId(string);
                    }
                }
                IAdWebLogService iAdWebLogServiceLJIIIZ = AdWebLogService.LJIIIZ();
                AwemeRawAd awemeRawAd = c1025100cma.LIZIZ;
                if (awemeRawAd != null) {
                    creativeIdStr = awemeRawAd.getCreativeIdStr();
                } else {
                    creativeIdStr = null;
                }
                AwemeRawAd awemeRawAd2 = c1025100cma.LIZIZ;
                if (awemeRawAd2 != null) {
                    logExtra = awemeRawAd2.getLogExtra();
                } else {
                    logExtra = null;
                }
                boolean z = c1025100cma.LJIIJ;
                int i = c1025100cma.LJIIJJI;
                getEnableWebSpark();
                iAdWebLogServiceLJIIIZ.LIZJ(creativeIdStr, logExtra, string, strLIZLLL, str, z, i, 1, getAdWebSparkViewFromXml().getAdWebModel());
                SparkContext sparkContext = getAdWebSparkViewFromXml().getSparkContext();
                if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJIIIIZZ(System.currentTimeMillis(), null);
                }
            }
        }
    }

    public final void LJJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r13, int r14, X.C1025100cma r15) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035340d36.LJIILL(java.lang.String, int, X.0cma):void");
    }
}
