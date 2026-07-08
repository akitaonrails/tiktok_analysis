package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1036760d5O extends FrameLayout {
    public static final /* synthetic */ int LLJJ = 0;
    public C1541940qEC LL;
    public AtomicBoolean LLILLJJLI;
    public SparkContext LLILLL;
    public boolean LLILZ;
    public InterfaceC1039660dA4 LLILZIL;
    public Activity LLILZLL;
    public WebKitView LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1036190d4T LLJ;
    public C1035880d3y LLJI;
    public View.OnTouchListener LLJIJIL;
    public InterfaceC1036860d5Y LLJILJIL;
    public InterfaceC1036210d4V LLJILJILJ;
    public AwemeRawAd LLJILLL;

    @C14EU
    public final void onJsBroadcast(C1038820d8i c1038820d8i) {
    }

    public final boolean LIZ() {
        InterfaceC1036850d5X interfaceC1036850d5X;
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext == null || (interfaceC1036850d5X = (InterfaceC1036850d5X) sparkContext.LJFF(InterfaceC1036850d5X.class)) == null) {
            return false;
        }
        return interfaceC1036850d5X.canGoBack();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x022c A[Catch: Exception -> 0x0241, TryCatch #0 {Exception -> 0x0241, blocks: (B:84:0x020e, B:86:0x021a, B:88:0x021e, B:91:0x0225, B:94:0x022c, B:96:0x0230, B:98:0x0236, B:101:0x023d), top: B:240:0x020e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036760d5O.LIZIZ():void");
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        C1541940qEC c1541940qEC = this.LL;
        if (c1541940qEC != null) {
            return c1541940qEC.getSparkView();
        }
        return null;
    }

    public final EnumC1036690d5H getWebReuseMode() {
        C1035920d42 reuseDataModel;
        EnumC1036690d5H enumC1036690d5H;
        C1035880d3y c1035880d3y = this.LLJI;
        return (c1035880d3y == null || (reuseDataModel = c1035880d3y.getReuseDataModel()) == null || (enumC1036690d5H = reuseDataModel.webReuseMode) == null) ? EnumC1036690d5H.NORMAL : enumC1036690d5H;
    }

    public final void LIZLLL() throws JSONException {
        InterfaceC1038080d7W interfaceC1038080d7W;
        String strLJIJI;
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 == null || !interfaceC1030370cv5.nr(this.LLJI)) {
            SparkContext sparkContext = this.LLILLL;
            if (sparkContext == null || (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) == null) {
                return;
            }
            interfaceC1038080d7W.LJJI();
            return;
        }
        SparkContext sparkContext2 = this.LLILLL;
        if (sparkContext2 == null || !sparkContext2.usePreload || this.LLILZ) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = getSparkView();
            if (sparkView != null) {
                sparkView.LJIIIIZZ();
                return;
            }
            return;
        }
        this.LLILZ = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView2 = getSparkView();
        if (sparkView2 != null) {
            SparkContext sparkContext3 = this.LLILLL;
            if (sparkContext3 == null || (strLJIJI = sparkContext3.LJIJI()) == null) {
                strLJIJI = "";
            }
            sparkView2.LJJIJLIJ(null, strLJIJI, false);
        }
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release ");
        sbLIZ.append(getSparkView() == null);
        C2188811AlT.LIZIZ(sbLIZ);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = getSparkView();
        if (sparkView != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sparkView);
        }
        this.LLIZ = null;
        this.LLILLL = null;
    }

    public final String getContainerId() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = getSparkView();
        if (sparkView == null || (sparkContext = sparkView.getSparkContext()) == null) {
            return null;
        }
        return sparkContext.containerId;
    }

    public final String getCurrentUrl() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentUrl: ");
        WebKitView webKitView = this.LLIZ;
        sbLIZ.append(webKitView != null ? webKitView.getUrl() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        WebKitView webKitView2 = this.LLIZ;
        if (webKitView2 != null) {
            return webKitView2.getUrl();
        }
        return null;
    }

    public final WebKitView getWebKitView() {
        C2429209fW.LIZ().appendDataFlowId(this.LLIZ, "402657281");
        return this.LLIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    public final Activity getActivity() {
        return this.LLILZLL;
    }

    public final C1035880d3y getAdWebModel() {
        return this.LLJI;
    }

    public final InterfaceC1036210d4V getIAdWebBottomBar() {
        return this.LLJILJILJ;
    }

    public final InterfaceC1036860d5Y getIAdWebTitleBar() {
        return this.LLJILJIL;
    }

    public final AwemeRawAd getPseudoAdData() {
        return this.LLJILLL;
    }

    public final InterfaceC1039660dA4 getScrollListener() {
        return this.LLILZIL;
    }

    public final SparkContext getSparkContext() {
        return this.LLILLL;
    }

    public final C1541940qEC getSparkCustomView() {
        return this.LL;
    }

    public final View.OnTouchListener getTouchListener() {
        return this.LLJIJIL;
    }

    public final WebKitView getWebView() {
        return this.LLIZ;
    }

    public final void LJ(String str) {
        InterfaceC1038080d7W interfaceC1038080d7W;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext != null && (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) != null) {
            WebKitView webKitView = this.LLIZ;
            WebKitView webKitView2 = null;
            if (webKitView != null) {
                webBackForwardListCopyBackForwardList = webKitView.copyBackForwardList();
            } else {
                webBackForwardListCopyBackForwardList = null;
            }
            WebKitView webKitView3 = this.LLIZ;
            if (webKitView3 != null) {
                webKitView2 = webKitView3;
            }
            interfaceC1038080d7W.LJIIJJI(webBackForwardListCopyBackForwardList, webKitView2, str);
        }
        InterfaceC1036190d4T interfaceC1036190d4T = this.LLJ;
        if (interfaceC1036190d4T != null) {
            interfaceC1036190d4T.onHide();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1036410d4p c1036410d4p) {
        String str;
        C1035880d3y c1035880d3y;
        String realCreativeIdStr;
        IAdWebUtils iAdWebUtils;
        C1069080dvW c1069080dvWQv;
        if (c1036410d4p == null) {
            return;
        }
        String str2 = c1036410d4p.LIZ;
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        if (TextUtils.equals(str2, str) && this.LLJ == null) {
            Context context = getContext();
            if (context != null && (c1035880d3y = this.LLJI) != null && (realCreativeIdStr = c1035880d3y.getRealCreativeIdStr()) != null && (iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) != null && (c1069080dvWQv = iAdWebUtils.qv(context, false, realCreativeIdStr, false)) != null) {
                SparkContext sparkContext2 = this.LLILLL;
                if (sparkContext2 != null) {
                    sparkContext2.LJJ(InterfaceC1036190d4T.class, c1069080dvWQv);
                }
                this.LLJ = c1069080dvWQv;
                C1541940qEC c1541940qEC = this.LL;
                if (c1541940qEC != null) {
                    c1069080dvWQv.getView();
                    C1036750d5N c1036750d5N = C1036750d5N.LIZ;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    c1036750d5N.getClass();
                    c1541940qEC.addView(c1069080dvWQv, C1036750d5N.LIZ(layoutParams));
                }
            }
            InterfaceC1036190d4T interfaceC1036190d4T = this.LLJ;
            if (interfaceC1036190d4T != null) {
                interfaceC1036190d4T.LIZIZ(this.LLIZ, this.LLJI, false);
            }
        }
    }

    public final void setActivity(Activity activity) {
        this.LLILZLL = activity;
    }

    public final void setAdWebModel(C1035880d3y c1035880d3y) {
        boolean zR42;
        this.LLJI = c1035880d3y;
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 != null) {
            zR42 = interfaceC1030370cv5.r42(c1035880d3y.getAwemeRawAd());
        } else {
            zR42 = false;
        }
        c1035880d3y.setEnableReuseWeb(zR42);
    }

    public final void setIAdWebBottomBar(InterfaceC1036210d4V interfaceC1036210d4V) {
        this.LLJILJILJ = interfaceC1036210d4V;
    }

    public final void setIAdWebTitleBar(InterfaceC1036860d5Y interfaceC1036860d5Y) {
        this.LLJILJIL = interfaceC1036860d5Y;
    }

    public final void setPrepared(AtomicBoolean atomicBoolean) {
        this.LLILLJJLI = atomicBoolean;
    }

    public final void setPseudoAdData(AwemeRawAd awemeRawAd) {
        this.LLJILLL = awemeRawAd;
    }

    public final void setScrollListener(InterfaceC1039660dA4 interfaceC1039660dA4) {
        this.LLILZIL = interfaceC1039660dA4;
    }

    public final void setSparkContext(SparkContext sparkContext) {
        this.LLILLL = sparkContext;
    }

    public final void setSparkCustomView(C1541940qEC c1541940qEC) {
        this.LL = c1541940qEC;
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LLJIJIL = onTouchListener;
    }

    public final void setWebReuseMode(EnumC1036690d5H enumC1036690d5H) {
        C1035920d42 reuseDataModel;
        C1035880d3y c1035880d3y = this.LLJI;
        if (c1035880d3y != null && (reuseDataModel = c1035880d3y.getReuseDataModel()) != null) {
            reuseDataModel.setWebReuseMode(enumC1036690d5H);
        }
    }

    public final void setWebView(WebKitView webKitView) {
        this.LLIZ = webKitView;
    }

    public C1036760d5O(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036760d5O.LIZJ(java.lang.String, boolean):void");
    }

    public final void LJI(AdSparkHybridContext adSparkHybridContext, InterfaceC1541990qEH interfaceC1541990qEH) {
        Boolean boolValueOf;
        int optimization;
        EnumC1036690d5H enumC1036690d5H;
        InterfaceC1036850d5X interfaceC1036850d5X;
        InterfaceC1036400d4o interfaceC1036400d4o;
        boolean zCanGoForward;
        InterfaceC1036850d5X interfaceC1036850d5X2;
        AwemeRawAd awemeRawAd;
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        WebKitView webKitView = null;
        if (interfaceC1030370cv5 != null) {
            C1035880d3y c1035880d3y = this.LLJI;
            if (c1035880d3y != null) {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            boolValueOf = Boolean.valueOf(interfaceC1030370cv5.r42(awemeRawAd));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView = getSparkView();
            boolean zCanGoForward2 = false;
            if (sparkView != null) {
                optimization = sparkView.getOptimization();
            } else {
                optimization = 0;
            }
            if (C1542210qEd.LIZIZ(Integer.valueOf(optimization))) {
                enumC1036690d5H = EnumC1036690d5H.REUSED;
            } else {
                C1035880d3y c1035880d3y2 = this.LLJI;
                if (c1035880d3y2 != null) {
                    c1035880d3y2.setWebPageReuse(true);
                }
                enumC1036690d5H = EnumC1036690d5H.REUSE_FIRST_LOAD;
            }
            setWebReuseMode(enumC1036690d5H);
            SparkContext sparkContext = this.LLILLL;
            if (sparkContext != null && (interfaceC1036400d4o = (InterfaceC1036400d4o) sparkContext.LJFF(InterfaceC1036400d4o.class)) != null) {
                boolean zLIZ = LIZ();
                SparkContext sparkContext2 = this.LLILLL;
                if (sparkContext2 != null && (interfaceC1036850d5X2 = (InterfaceC1036850d5X) sparkContext2.LJFF(InterfaceC1036850d5X.class)) != null) {
                    zCanGoForward = interfaceC1036850d5X2.canGoForward();
                } else {
                    zCanGoForward = false;
                }
                interfaceC1036400d4o.LJ(zLIZ, zCanGoForward);
            }
            InterfaceC1036210d4V interfaceC1036210d4V = this.LLJILJILJ;
            if (interfaceC1036210d4V != null) {
                interfaceC1036210d4V.LJIIIZ(LIZ());
            }
            InterfaceC1036210d4V interfaceC1036210d4V2 = this.LLJILJILJ;
            if (interfaceC1036210d4V2 != null) {
                SparkContext sparkContext3 = this.LLILLL;
                if (sparkContext3 != null && (interfaceC1036850d5X = (InterfaceC1036850d5X) sparkContext3.LJFF(InterfaceC1036850d5X.class)) != null) {
                    zCanGoForward2 = interfaceC1036850d5X.canGoForward();
                }
                interfaceC1036210d4V2.LJII(zCanGoForward2);
            }
        }
        if (interfaceC1541990qEH instanceof WebKitView) {
            webKitView = (WebKitView) interfaceC1541990qEH;
        }
        this.LLIZ = webKitView;
        C2429209fW.LIZ().appendDataFlowId(this.LLIZ, "402657281");
        C1035880d3y c1035880d3y3 = (C1035880d3y) adSparkHybridContext.LJFF(C1035880d3y.class);
        InterfaceC1036860d5Y interfaceC1036860d5Y = (InterfaceC1036860d5Y) adSparkHybridContext.LJFF(InterfaceC1036860d5Y.class);
        InterfaceC1036210d4V interfaceC1036210d4V3 = (InterfaceC1036210d4V) adSparkHybridContext.LJFF(InterfaceC1036210d4V.class);
        if (interfaceC1036860d5Y != null) {
            interfaceC1036860d5Y.LIZLLL(c1035880d3y3, null, this.LLIZ, true, adSparkHybridContext);
        }
        InterfaceC1036080d4I interfaceC1036080d4I = new InterfaceC1036080d4I() { // from class: X.0d5T
            @Override // X.InterfaceC1036080d4I
            public final void LIZ() {
                InterfaceC1036850d5X interfaceC1036850d5X3;
                SparkContext sparkContext4 = this.LIZ.getSparkContext();
                if (sparkContext4 == null || (interfaceC1036850d5X3 = (InterfaceC1036850d5X) sparkContext4.LJFF(InterfaceC1036850d5X.class)) == null) {
                    return;
                }
                interfaceC1036850d5X3.LIZIZ(0);
            }

            @Override // X.InterfaceC1036080d4I
            public final void LIZIZ() {
                InterfaceC1036850d5X interfaceC1036850d5X3;
                SparkContext sparkContext4 = this.LIZ.getSparkContext();
                if (sparkContext4 == null || (interfaceC1036850d5X3 = (InterfaceC1036850d5X) sparkContext4.LJFF(InterfaceC1036850d5X.class)) == null) {
                    return;
                }
                interfaceC1036850d5X3.LJI(0);
            }
        };
        adSparkHybridContext.LJJ(InterfaceC1036080d4I.class, interfaceC1036080d4I);
        if (interfaceC1036210d4V3 != null) {
            interfaceC1036210d4V3.setListener(interfaceC1036080d4I);
        }
    }

    public C1036760d5O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = new AtomicBoolean(false);
        C1541940qEC c1541940qEC = new C1541940qEC(context);
        this.LL = c1541940qEC;
        addView(c1541940qEC, -1, -1);
    }
}
