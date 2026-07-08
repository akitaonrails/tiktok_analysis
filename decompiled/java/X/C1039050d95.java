package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.AfS185S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS113S0400000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039050d95 extends AbstractC1542100qES implements InterfaceC1028280cri, InterfaceC1056670dbV, InterfaceC1892990zMP, InterfaceC1036150d4P {
    public final InterfaceC1039110d9B LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public Space LLILZIL;
    public ViewOnClickListenerC1041980dDo LLILZLL;
    public WebKitView LLIZ;
    public SparkContext LLIZLLLIL;
    public C1038730d8Z LLJ;
    public C1027660cqi LLJI;
    public String LLJIJIL;
    public C1039020d92 LLJILJIL;
    public ACListenerS119S0200000_16 LLJILJILJ;
    public Runnable LLJILLL;
    public String LLJJ;
    public Activity LLJJI;
    public boolean LLJJIII;
    public List<String> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public String LLJJJ;
    public SparkWebViewTouchDelegate LLJJJIL;
    public C11NJ LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public volatile boolean LLJJJJLIIL;
    public volatile boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    public C1039050d95() {
        this(0);
    }

    @Override // X.InterfaceC1036150d4P
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1056670dbV
    public final ViewGroup LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJII(boolean z) {
    }

    @Override // X.InterfaceC1056670dbV
    public final int LJJIJ() {
        return R.id.vs5;
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZLLLI(SparkContext sparkContext, C1016930cZP c1016930cZP, String str, Runnable runnable) {
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLIZZ(SparkContext sparkContext) {
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        this.LLJJJJLIIL = true;
        LLLILZ();
        C11NJ c11nj = this.LLJJJJ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        this.LLJJJJ = null;
    }

    @Override // X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
    }

    @Override // X.InterfaceC1056670dbV
    public final ViewGroup LJIJJ() {
        ViewGroup viewGroup;
        View view = this.LLILLJJLI;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.y0b)) != null) {
            return viewGroup;
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        final Context baseContext = C1161970gLL.LIZIZ().LIZJ().getBaseContext();
        return new ViewGroup(baseContext) { // from class: X.0d9E
            @Override // android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            }
        };
    }

    @Override // X.InterfaceC1036150d4P
    public final void LJJJLZIJ() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LL.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LIZJ = System.currentTimeMillis();
            adWebStatBusiness.LIZLLL = false;
            adWebStatBusiness.LJ = false;
            adWebStatBusiness.LJFF = false;
            C1039200d9K c1039200d9K = adWebStatBusiness.LIZIZ;
            c1039200d9K.LJIIIIZZ = false;
            c1039200d9K.LIZLLL = false;
            c1039200d9K.LJ = false;
            c1039200d9K.LJI = null;
            c1039200d9K.LIZIZ = 0L;
            c1039200d9K.LIZ = 0L;
            c1039200d9K.LJIIIZ = false;
            c1039200d9K.LJIIJ = 0;
        }
    }

    public final boolean LJLLLLLL() {
        String url;
        List<String> list = this.LLJJIJI;
        if (list == null) {
            return false;
        }
        C08QT c08qt = new C08QT(C09RB.LJIIJJI(new C1939607ik(list)));
        while (c08qt.hasNext()) {
            String str = (String) c08qt.next();
            WebKitView webKitView = this.LLIZ;
            if (webKitView != null && (url = webKitView.getUrl()) != null && u.LJJIIJZLJL(url, str, false)) {
                return true;
            }
        }
        return false;
    }

    public final void LJLZ() {
        WebKitView webKitView = this.LLIZ;
        if (webKitView != null && webKitView.canGoBack()) {
            WebKitView webKitView2 = this.LLIZ;
            if (webKitView2 != null) {
                webKitView2.goBack();
                return;
            }
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("method", this.LLJJJ);
        C20684815ws.LJIILLIIL("h5_leave_detail", c2344009Gk.LIZ);
        this.LLJILLL.run();
        this.LLJJ = "full_screen_page_click";
    }

    public final void LJZI() {
        C11NJ c11nj = this.LLJJJJ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        C1038730d8Z c1038730d8Z = this.LLJ;
        if (c1038730d8Z != null) {
            HashMap map = new HashMap();
            Object objLIZJ = c1038730d8Z.LJJJJZ.LIZJ();
            if (objLIZJ == null) {
                objLIZJ = "";
            }
            map.put("url", objLIZJ);
            map.put("timestamp", String.valueOf(System.currentTimeMillis()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C1061730djf();
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(map), "ad_webview_close"));
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZ() {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLLILZJ() {
        if (this.LLJJJJJIL) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1036150d4P
    public final boolean onBackPress() {
        this.LLJILLL.run();
        return true;
    }

    @Override // X.InterfaceC1036150d4P
    public final void onPause() {
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZIZ();
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void onResume() {
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZJ();
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void onShow() {
        this.LLJJ = "full_screen_slide";
    }

    public C1039050d95(int i) {
        this.LL = new C1039190d9J();
        this.LLJILLL = new ARunnableS116S0100000_16(this, 282);
        this.LLJJ = "full_screen_slide";
        this.LLJJJJ = new C11NJ();
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        LJLLLL(context);
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        "TitleBar not initialized.".toString();
        throw new IllegalStateException("TitleBar not initialized.");
    }

    @Override // X.InterfaceC1056670dbV
    public final View LJIILJJIL(Context context) {
        LJLLLL(context);
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
        View view = this.LLILLL;
        if (view == null) {
            return;
        }
        ((TextView) view.findViewById(R.id.tv_title)).setTextColor(i);
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        View view = this.LLILLL;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.tlq);
        View viewFindViewById2 = view.findViewById(R.id.cu8);
        View viewFindViewById3 = view.findViewById(R.id.cv0);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this, 189), viewFindViewById);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this, 190), viewFindViewById2);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this, 191), viewFindViewById3);
        int i = C1067650dtD.LIZIZ[enumC1067700dtI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIJLIJ(SpannableString spannableString) {
        spannableString.toString();
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        View view = this.LLILLL;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        View viewFindViewById;
        int i;
        View view = this.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.juy)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, this.LLILLL);
        } else {
            C12ES.LJIILL(8, this.LLILLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0d9D] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(final InterfaceC1541990qEH interfaceC1541990qEH) {
        WebView webView;
        C1537910q7h c1537910q7h;
        C1028030crJ c1028030crJ;
        boolean zLJFF;
        String string;
        C1041880dDe c1041880dDe;
        C1537710q7N c1537710q7N;
        EnumC1067640dtC type;
        C1041600dDC c1041600dDC;
        C1027660cqi c1027660cqi;
        Boolean boolLIZJ;
        Activity activity;
        ViewOnClickListenerC1041980dDo viewOnClickListenerC1041980dDo;
        int iLIZJ;
        C1039060d96 c1039060d96;
        Boolean boolLIZJ2;
        C1028030crJ c1028030crJ2;
        Object objLIZJ;
        C1041880dDe c1041880dDe2;
        C1038730d8Z c1038730d8Z;
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJIII = true;
        String url = null;
        if (!this.LLJJL && (interfaceC1541990qEH.getHybridContext() instanceof SparkContext)) {
            SparkContext sparkContext = (SparkContext) interfaceC1541990qEH.getHybridContext();
            if (!this.LLJJJJLIIL) {
                this.LLIZLLLIL = sparkContext;
                InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                if (interfaceC1531560pxS != null && (type = interfaceC1531560pxS.getType()) != null) {
                    int i = C1067650dtD.LIZ[type.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            Object objLJFF = sparkContext.LJFF(C1027760cqs.class);
                            InterfaceC420801kM interfaceC420801kMLJJLJLI = C2214201BlK.LIZLLL().LJJLJLI(new AfS185S0100000_16(interfaceC1541990qEH, 58));
                            C11NJ c11nj = this.LLJJJJ;
                            if (c11nj != null) {
                                c11nj.LIZ(interfaceC420801kMLJJLJLI);
                            }
                            c1041600dDC = (C1041600dDC) objLJFF;
                        }
                    } else {
                        Object objLJFF2 = sparkContext.LJFF(C1038730d8Z.class);
                        this.LLJ = (C1038730d8Z) objLJFF2;
                        c1041600dDC = (C1041600dDC) objLJFF2;
                    }
                    if (c1041600dDC != null) {
                        Uri uri = UriProtector.parse(sparkContext.LJIJI());
                        Bundle bundle = (Bundle) sparkContext.LJFF(Bundle.class);
                        C1027660cqi c1027660cqi2 = new C1027660cqi();
                        C1041690dDL.LIZ(uri, bundle, c1027660cqi2);
                        this.LLJI = c1027660cqi2;
                        if (this.LLJJLIIIJLLLLLLLZ && (c1041600dDC instanceof C1038730d8Z) && (c1038730d8Z = (C1038730d8Z) c1041600dDC) != null) {
                            c1038730d8Z.LLFZ = 1;
                        }
                        this.LL.LJIIIIZZ(c1041600dDC);
                        this.LL.LJFF(this.LLJI);
                        Activity activity2 = this.LLJJI;
                        if (activity2 != null) {
                            if (this.LLJILJILJ == null) {
                                this.LLJILJILJ = new ACListenerS119S0200000_16(this, activity2, 46);
                            }
                            this.LLJILJIL = new C1039020d92(activity2, this.LLJILJILJ);
                        }
                        if (TextUtils.isEmpty((CharSequence) c1041600dDC.LJIIIIZZ.LIZJ())) {
                            C1041880dDe c1041880dDe3 = c1041600dDC.LJIIIIZZ;
                            C1038730d8Z c1038730d8Z2 = this.LLJ;
                            if (c1038730d8Z2 != null && (c1041880dDe2 = c1038730d8Z2.LJJLIIJ) != null) {
                                objLIZJ = c1041880dDe2.LIZJ();
                            } else {
                                objLIZJ = null;
                            }
                            c1041880dDe3.LIZLLL(objLIZJ);
                        }
                        C1038730d8Z c1038730d8Z3 = this.LLJ;
                        if (c1038730d8Z3 != null && (c1028030crJ2 = c1038730d8Z3.LJJJJ) != null && Intrinsics.LJFF(c1028030crJ2.LIZJ(), Boolean.TRUE)) {
                            c1041600dDC.LJJIJLIJ.LIZLLL(Boolean.FALSE);
                        }
                        if ((((c1041600dDC instanceof C1039060d96) && (c1039060d96 = (C1039060d96) c1041600dDC) != null && (boolLIZJ2 = c1039060d96.LJJLIIIJL.LIZJ()) != null && boolLIZJ2.booleanValue()) || ((c1027660cqi = this.LLJI) != null && (boolLIZJ = c1027660cqi.LJJLIIIJL.LIZJ()) != null && boolLIZJ.booleanValue())) && (viewOnClickListenerC1041980dDo = this.LLILZLL) != null) {
                            Context context = viewOnClickListenerC1041980dDo.getContext();
                            if (context != null) {
                                iLIZJ = C497820Jfg.LIZJ(context);
                            } else {
                                iLIZJ = 0;
                            }
                            viewOnClickListenerC1041980dDo.setPadding(0, iLIZJ, 0, 0);
                        }
                        C1038730d8Z c1038730d8Z4 = this.LLJ;
                        if (c1038730d8Z4 != null) {
                            C988570bpf.LIZ.getClass();
                            C1041070dCL.LIZ();
                            String str = (String) c1038730d8Z4.LJJJJZ.LIZJ();
                            if (str == null) {
                                str = "";
                            }
                            if (!TextUtils.isEmpty(str)) {
                                C1041070dCL.LIZ();
                            }
                            Boolean boolLIZJ3 = c1038730d8Z4.LJJLIIIIJ.LIZJ();
                            if (boolLIZJ3 != null && boolLIZJ3.booleanValue() && (activity = this.LLJJI) != null) {
                                C21566919al c21566919al = new C21566919al(activity);
                                c21566919al.LIZ(2131838250);
                                c21566919al.LJII(2131829423, null, false);
                                new C21566519ah(c21566919al).LIZLLL();
                            }
                        }
                        if (Intrinsics.LJFF(c1041600dDC.LIZLLL.LIZJ(), Boolean.TRUE)) {
                            C12ES.LJIILL(8, this.LLILLL);
                            C12ES.LJIILL(8, this.LLILZIL);
                        }
                    }
                }
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                if (interfaceC1541990qEH instanceof C1537710q7N) {
                    c1537710q7N = (C1537710q7N) interfaceC1541990qEH;
                } else {
                    c1537710q7N = null;
                }
                adLynxStatBusiness.LJIIJJI = c1537710q7N;
            }
            AdLynxStatBusiness adLynxStatBusiness2 = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
            if (adLynxStatBusiness2 != null) {
                String strLJIJI = interfaceC1541990qEH.getHybridContext().LJIJI();
                C1027760cqs c1027760cqsLIZ = adLynxStatBusiness2.LIZ();
                if (c1027760cqsLIZ != null && (c1028030crJ = c1027760cqsLIZ.LJJJJI) != null && Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE)) {
                    adLynxStatBusiness2.LIZIZ = true;
                    if (C123100dR.LIZ(adLynxStatBusiness2.LIZLLL)) {
                        C1027660cqi c1027660cqi3 = adLynxStatBusiness2.LIZ.LIZJ;
                        if (c1027660cqi3 != null && (c1041880dDe = c1027660cqi3.LJLILLLLZI) != null) {
                            string = c1041880dDe.toString();
                        } else {
                            string = null;
                        }
                        adLynxStatBusiness2.LIZLLL = string;
                        adLynxStatBusiness2.LIZJ = false;
                    }
                    adLynxStatBusiness2.LIZLLL("load_finish");
                    try {
                        zLJFF = Intrinsics.LJFF(JSONObjectProtectorUtils.getString(new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "lynx_landing_page_data")), "isAutoFillEnable"), "1");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        zLJFF = false;
                    }
                    C1068020dto.LJIIIZ(zLJFF);
                    C1067990dtl.LJIIJJI(zLJFF, null, false, EnumC1059300dfk.AD, null, null);
                    ((IAdLandPageSurveyService) ServiceManager.get().getService(IAdLandPageSurveyService.class)).LIZLLL(false);
                    IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) PluggableExtentionKt.pluggableSpi$default(IAdLynxLandPageUtils.class, false, false, false, 14, null);
                    if (iAdLynxLandPageUtils != null) {
                        iAdLynxLandPageUtils.LJJIZ();
                    }
                }
            }
            InterfaceC1531560pxS interfaceC1531560pxS2 = interfaceC1541990qEH.getHybridContext().hybridParams;
            if ((interfaceC1531560pxS2 instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS2) != null) {
                c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0d97
                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJJII(C1318050kP5 c1318050kP5) {
                    }

                    @Override // com.lynx.tasm.LynxViewClient
                    public final void LJIIJ() {
                        C1027760cqs c1027760cqs;
                        C1028030crJ c1028030crJ3;
                        View viewE1;
                        C1041880dDe c1041880dDe4;
                        Integer num;
                        SparkContext sparkContext2 = this.LL.LLIZLLLIL;
                        if (sparkContext2 == null || (c1027760cqs = (C1027760cqs) sparkContext2.LJFF(C1027760cqs.class)) == null || (c1028030crJ3 = c1027760cqs.LJJJJI) == null || !Intrinsics.LJFF(c1028030crJ3.LIZJ(), Boolean.TRUE)) {
                            return;
                        }
                        C1039050d95 c1039050d95 = this.LL;
                        View viewE12 = interfaceC1541990qEH.e1();
                        ViewParent parent = viewE12 != null ? viewE12.getParent() : null;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB ? (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) parent : null;
                        if (c1039050d95.LLJJIJIIJIL) {
                            return;
                        }
                        C817403Hg c817403Hg = new C817403Hg();
                        c817403Hg.element = 0.5f;
                        C1027660cqi extraParams = c1039050d95.LL.getExtraParams();
                        if (extraParams != null && (c1041880dDe4 = extraParams.LJLLILLLL) != null && (num = (Integer) c1041880dDe4.LIZJ()) != null) {
                            c817403Hg.element = (num.intValue() / 100) - 0.01f;
                        }
                        c1039050d95.LLJJIJIIJIL = true;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.setId(R.id.ab7);
                            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                            if (kitView != null && (viewE1 = kitView.e1()) != null) {
                                viewE1.setId(R.id.a_c);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        hashSet.add("ad_lynx_container");
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            C2211631BhB.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new AwS113S0400000_16(c817403Hg, (C817403Hg) c1039050d95, (C1039050d95) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) hashSet, (HashSet<String>) 6));
                        }
                    }
                });
            }
            if (interfaceC1541990qEH instanceof WebKitView) {
                WebKitView webKitView = this.LLIZ;
                if (webKitView == null || !Intrinsics.LJFF(webKitView, interfaceC1541990qEH)) {
                    WebKitView webKitView2 = (WebKitView) interfaceC1541990qEH;
                    webKitView2.setBackgroundColor(0);
                    this.LLIZ = webKitView2;
                    webKitView2.resumeTimers();
                    WebKitView webKitView3 = this.LLIZ;
                    if (webKitView3 != null) {
                        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = new SparkWebViewTouchDelegate(webKitView3, this.LLJJLIIIJLLLLLLLZ, 14);
                        this.LLJJJIL = sparkWebViewTouchDelegate;
                        webKitView3.setWebViewEventDelegate(sparkWebViewTouchDelegate);
                    }
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZ() != null) {
                        C1028210crb.LJJII(this, this.LLIZ);
                    }
                    if (C1041070dCL.LIZ() != null) {
                        C1028210crb.LIZIZ(this, this.LLIZ);
                    }
                    WebKitView webKitView4 = this.LLIZ;
                    if (webKitView4 != null) {
                        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(webKitView4, this, 131);
                        AdLandingPageConfig adLandingPageConfigLIZIZ = C1037700d6u.LIZIZ();
                        if (adLandingPageConfigLIZIZ != null) {
                            awS382S0200000_16.invoke(adLandingPageConfigLIZIZ);
                        }
                        C1038730d8Z c1038730d8Z5 = this.LLJ;
                        if (c1038730d8Z5 != null) {
                            Boolean boolLIZJ4 = c1038730d8Z5.LJJI.LIZJ();
                            if (boolLIZJ4 != null && boolLIZJ4.booleanValue()) {
                                webKitView4.setLayerType(1, null);
                            }
                            Boolean boolLIZJ5 = c1038730d8Z5.LJJLIIIJJI.LIZJ();
                            if (boolLIZJ5 != null && boolLIZJ5.booleanValue()) {
                                try {
                                    WebSettings settings = webKitView4.getSettings();
                                    C1041070dCL.LIZJ();
                                    settings.setMediaPlaybackRequiresUserGesture(true);
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C1AF0.LJ(e2);
                                    webKitView4.getSettings().setMediaPlaybackRequiresUserGesture(true);
                                }
                            }
                        }
                    }
                }
                this.LL.LJII();
                this.LL.LJ(new InterfaceC1039160d9G() { // from class: X.0d9D
                    @Override // X.InterfaceC1039160d9G
                    public final void sendEvent(String str2, JSONObject jSONObject) {
                        ((WebKitView) interfaceC1541990qEH).LIZ(str2, jSONObject);
                    }
                });
                this.LL.LJI();
            }
        }
        View viewE1 = interfaceC1541990qEH.e1();
        if ((viewE1 instanceof WebView) && (webView = (WebView) viewE1) != null) {
            url = webView.getUrl();
        }
        this.LLJIJIL = url;
        C988570bpf.LIZ.getClass();
        C1041070dCL.LIZ();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIJL(this, this.LLJIJIL);
        }
        this.LLJJL = false;
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        C1027660cqi c1027660cqi = this.LLJI;
        if (c1027660cqi != null && Intrinsics.LJFF(c1027660cqi.LJLJJI.LIZJ(), Boolean.TRUE)) {
            ((IAdLandPageSurveyService) ServiceManager.get().getService(IAdLandPageSurveyService.class)).LJI();
        }
    }

    public final void LJLLLL(Context context) {
        LLLILZJ();
        if (context != null && this.LLILLJJLI == null) {
            synchronized (this) {
                try {
                    if (this.LLILLJJLI != null) {
                        return;
                    }
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ == null) {
                        return;
                    }
                    this.LLJJI = activityLIZ;
                    View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.b4j, null);
                    this.LLILLJJLI = viewLJLLJ;
                    this.LLILLL = viewLJLLJ.findViewById(R.id.y08);
                    this.LLILZ = viewLJLLJ.findViewById(R.id.title_shadow);
                    this.LLILZIL = (Space) viewLJLLJ.findViewById(R.id.p1c);
                    this.LLILZLL = (ViewOnClickListenerC1041980dDo) viewLJLLJ.findViewById(R.id.vsp);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJZ(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[2];
        strArr[0] = "platform = ";
        if (this.LLJ != null) {
            str2 = "webview";
        } else {
            str2 = "unknown";
        }
        strArr[1] = str2;
        C2327709Ad.LJFF(sb, strArr);
        C2327709Ad.LJFF(sb, "status = ", str);
        C2327709Ad.LJFF(sb, "url = ", this.LLJIJIL);
    }

    public final void LJZL(Activity activity) throws JSONException {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJIJIL(this);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LL.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIJ(false);
        }
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LJ(false);
        }
    }

    @Override // X.InterfaceC1036150d4P
    public final void LLJI(Runnable runnable) {
        this.LLJILLL = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[PHI: r1
      0x0017: PHI (r1v1 android.webkit.WebView) = (r1v0 android.webkit.WebView), (r1v14 android.webkit.WebView) binds: [B:3:0x0005, B:10:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1036150d4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIL(java.lang.String r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039050d95.LLLIL(java.lang.String):void");
    }

    @C14EU
    public final void onEvent(C0DQL c0dql) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        SparkContext sparkContext;
        Object objLJFF;
        InterfaceC1531560pxS interfaceC1531560pxS;
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
        if (iAdLandingPagePopUpService != null) {
            if (iAdLandingPagePopUpService.LJIJI()) {
                C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
                return;
            } else if (iAdLandingPagePopUpService.LJII()) {
                C1440005kM.LIZ(new C602130NjX("closeFullScreen"));
                return;
            }
        }
        SparkContext sparkContext2 = this.LLIZLLLIL;
        EnumC1067640dtC type = null;
        if (sparkContext2 != null && (interfaceC1531560pxS = sparkContext2.hybridParams) != null) {
            type = interfaceC1531560pxS.getType();
        }
        if (type == EnumC1067640dtC.LYNX) {
            if (c0dql != null && c0dql.LIZ != 0 && (sparkContext = this.LLIZLLLIL) != null && (objLJFF = sparkContext.LJFF(InterfaceC1028200cra.class)) != null && objLJFF.hashCode() == c0dql.LIZ) {
                this.LLJJ = "full_screen_page_click";
                this.LLJILLL.run();
                return;
            }
            return;
        }
        if (c0dql == null || c0dql.LIZ == 0) {
            return;
        }
        SparkContext sparkContext3 = this.LLIZLLLIL;
        if (sparkContext3 != null && (interfaceC1541990qEHLJIJJ = sparkContext3.LJIJJ()) != null && (interfaceC1541990qEHLJIJJ instanceof WebKitView) && interfaceC1541990qEHLJIJJ.hashCode() == c0dql.LIZ) {
            this.LLJJ = "full_screen_page_click";
            this.LLJILLL.run();
            return;
        }
        WebKitView webKitView = this.LLIZ;
        if (webKitView == null || webKitView.hashCode() != c0dql.LIZ) {
            return;
        }
        this.LLJJ = "full_screen_page_click";
        this.LLJILLL.run();
    }

    @C14EU
    public final void onJsBroadcast(C1038820d8i c1038820d8i) {
        SparkWebViewTouchDelegate sparkWebViewTouchDelegate = this.LLJJJIL;
        if (sparkWebViewTouchDelegate != null) {
            sparkWebViewTouchDelegate.LIZJ(c1038820d8i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById;
        View view = this.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.jux)) != null) {
            C786410Ut5.I7(new ACListenerS119S0200000_16(this, onClickListener, 43), viewFindViewById);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById;
        View view = this.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.juy)) != null) {
            C786410Ut5.I7(onClickListener, viewFindViewById);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        View view;
        if (C1039030d93.LIZ(str) || (view = this.LLILLL) == null) {
            return;
        }
        ((TextView) view.findViewById(R.id.tv_title)).setText(str);
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        String str;
        if (c1365870leD != null) {
            str = c1365870leD.LIZLLL;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1028210crb.LJJIIJZLJL(this.LLJJI, this.LLILLL, c1365870leD);
            }
        }
    }

    @C14EU
    public void onEvent(C1039180d9I c1039180d9I) {
        C988570bpf.LIZ.getClass();
        C1041070dCL.LIZ();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Context context;
        this.LLIZLLLIL = (SparkContext) interfaceC1541990qEH.getHybridContext();
        View viewE1 = interfaceC1541990qEH.e1();
        if (viewE1 != null) {
            context = viewE1.getContext();
        } else {
            context = null;
        }
        LJLLLL(context);
        this.LLJJIII = false;
        this.LLJJL = false;
        this.LLJIJIL = str;
        C988570bpf.LIZ.getClass();
        C1041070dCL.LIZ();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJIJ(this, this.LLJIJIL);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        this.LLJJL = true;
    }
}
