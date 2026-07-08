package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS22S0201000_16;
import Y.AUListenerS148S0300000_6;
import Y.AUListenerS216S0200000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentService;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036000d4A extends AbstractC1036010d4B {
    public static long LLLLIIIILLL = -1;
    public C1036030d4D LLJILJIL;
    public FrameLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public RelativeLayout LLJJI;
    public RelativeLayout LLJJIII;
    public RelativeLayout LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public C427660Gpo LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public View LLJLIL;
    public C427660Gpo LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxIconView LLJZ;
    public RadiusLayout LLJZIJLIL;
    public LinearLayout LLL;
    public TuxTextView LLLF;
    public TuxIconView LLLFF;
    public TuxTextView LLLFFI;
    public TuxIconView LLLFZ;
    public C1016940cZQ LLLI;
    public TuxIconView LLLII;
    public TuxIconView LLLIIII;
    public SparkContext LLLIIIIL;
    public C1035880d3y LLLIIIL;
    public InterfaceC1036850d5X LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public TuxIconView LLLILZ;
    public C419220GcC LLLILZJ;
    public FrameLayout LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public final C1036060d4G LLLJL;
    public final C01GW LLLL;
    public InterfaceC1036080d4I LLLLII;

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJIIL() {
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJIILIIL() {
        this.LLLIL = true;
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJ() {
        WebView webView;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1035880d3y c1035880d3y = this.LLLIIIL;
        if (c1035880d3y == null || !c1035880d3y.aiBotEnableInIAB() || C320920Ci2.LIZ().secondJumpEnabled) {
            return;
        }
        SparkContext sparkContext = this.LLLIIIIL;
        Integer numValueOf = null;
        View viewE1 = (sparkContext == null || (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) == null) ? null : interfaceC1541990qEHLJIJJ.e1();
        if ((viewE1 instanceof WebView) && (webView = (WebView) viewE1) != null && (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) != null) {
            numValueOf = Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex());
        }
        FrameLayout frameLayout = this.LLLILZLLLI;
        if (frameLayout != null) {
            C786410Ut5.LJLLLLLL((numValueOf == null || numValueOf.intValue() != 0) ? 8 : 0, frameLayout);
        }
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJIIJ() {
        C1035880d3y c1035880d3y;
        EfficiencyComponents efficiencyComponents;
        Integer num;
        C1035880d3y c1035880d3y2;
        EfficiencyComponents efficiencyComponents2;
        List<String> list;
        SparkContext sparkContext;
        C1016280cYM c1016280cYM;
        SparkContext sparkContext2;
        InterfaceC1036110d4L interfaceC1036110d4L;
        if (this.LLLIILIL) {
            return;
        }
        if (this.LLLIL && (sparkContext2 = this.LLLIIIIL) != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext2.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LJJJLL();
        }
        LJIJJLI(true);
        C1035880d3y c1035880d3y3 = this.LLLIIIL;
        if (c1035880d3y3 != null && c1035880d3y3.isSheetVariantFullScreen() && (c1035880d3y = this.LLLIIIL) != null && (efficiencyComponents = c1035880d3y.getEfficiencyComponents()) != null && (num = efficiencyComponents.componentType) != null && num.intValue() == 1 && (c1035880d3y2 = this.LLLIIIL) != null && (efficiencyComponents2 = c1035880d3y2.getEfficiencyComponents()) != null && (list = efficiencyComponents2.aiComponents) != null && list.isEmpty() && isAttachedToWindow() && (sparkContext = this.LLLIIIIL) != null && (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) != null) {
            c1016280cYM.LIZLLL();
        }
        this.LLLIILIL = true;
        C1035880d3y c1035880d3y4 = this.LLLIIIL;
        if (c1035880d3y4 != null) {
            c1035880d3y4.setSheetExpanded(true);
        }
    }

    public final boolean LJIJ() {
        C1035880d3y c1035880d3y = this.LLLIIIL;
        return c1035880d3y != null && c1035880d3y.aiBotEnableInIAB() && C320920Ci2.LIZ().agentBarScrollHideEnable;
    }

    public final void LJIJJ() {
        getView();
        setAdWebBarMoveManager(new C1037280d6E(this, false, this.LL, this.LLILLJJLI, null, new AwS595S0100000_16(this, 396), new AwS560S0100000_16(this, 938), 48));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036000d4A.LJIL():void");
    }

    public final TuxIconView getAdWebBottomBarGoBack1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abp);
            this.LLJZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoBack2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abq);
            this.LLJJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoBack3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abr);
            this.LLJJJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoBackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abo);
            this.LLJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoForward1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abt);
            this.LLJLLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoForward2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abu);
            this.LLJJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoForward3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abv);
            this.LLJJJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getAdWebBottomBarGoForwardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abs);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1054420dXs getAdWebCheckoutView() {
        return (C1054420dXs) this.LLLL.getValue();
    }

    public final FrameLayout getAdWebEfficiencyComponentBarViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a6s);
            this.LLJILJILJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1016940cZQ getAiComponentButton() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ane);
            this.LLLI = (C1016940cZQ) callbackFindViewById;
        }
        return (C1016940cZQ) callbackFindViewById;
    }

    @Override // X.AbstractC1036010d4B
    public TimeInterpolator getAnimInterpolator() {
        return new C21388418n4();
    }

    public final C427660Gpo getAvatarViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bkz);
            this.LLJLILLLLZIIL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final C427660Gpo getAvatarViewInStyle3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bl2);
            this.LLJJL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxIconView getBaLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bmo);
            this.LLJLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getBaLabelInStyle3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bmp);
            this.LLJL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getBaLlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bmr);
            this.LLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final RadiusLayout getEfficiencyComponentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gxt);
            this.LLJZIJLIL = (RadiusLayout) callbackFindViewById;
        }
        return (RadiusLayout) callbackFindViewById;
    }

    public final TuxIconView getHistoryInStyle2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jpi);
            this.LLJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getHistoryInStyle3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jpj);
            this.LLJJJJLIIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getLeftIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mk3);
            this.LLLFF = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getLeftTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ml9);
            this.LLLFFI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getLineFromXml() {
        View view = this.LLJLIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.moq);
        this.LLJLIL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getNickNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p94);
            this.LLJLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getNickNameInStyle3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p98);
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getRightIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tld);
            this.LLLFZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getRightTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tmi);
            this.LLLF = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final RelativeLayout getStyle0FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wcx);
            this.LLJJI = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final RelativeLayout getStyle1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wcy);
            this.LLJJIII = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final RelativeLayout getStyle2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wcz);
            this.LLJJIJI = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final LinearLayout getStyle3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wd0);
            this.LLJJIJIIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public boolean getAnimatorIsRunning() {
        C1037280d6E adWebBarMoveManager = getAdWebBarMoveManager();
        if (adWebBarMoveManager != null) {
            return adWebBarMoveManager.LJIIL;
        }
        return false;
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public View getCheckoutComponent() {
        ViewGroup viewGroup;
        if (getAdWebCheckoutView().getParent() == null) {
            C1054420dXs adWebCheckoutView = getAdWebCheckoutView();
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.fc2);
            ViewParent parent = adWebCheckoutView.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(adWebCheckoutView, viewGroup);
            }
            if (viewGroup2 != null && viewGroup2.indexOfChild(adWebCheckoutView) == -1) {
                viewGroup2.addView(adWebCheckoutView);
            }
            getAdWebCheckoutView().setVisibilityObserver(this.LLLJL);
        }
        return getAdWebCheckoutView();
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIILJJIL() {
        C1038790d8f.LIZIZ();
    }

    public final C1036030d4D getAnoleContainerView() {
        return this.LLJILJIL;
    }

    public final InterfaceC1036080d4I getBottomBarListener() {
        return this.LLLLII;
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LIZLLL(MotionEvent motionEvent) {
        C1037280d6E c1037280d6E = this.LLJIJIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJFF(motionEvent);
        }
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJFF(boolean z) {
        this.LLLJIL = z;
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJI(List<CommerceAgentHint> list) {
        C1076920e8A c1076920e8ALIZIZ;
        FrameLayout frameLayout;
        List<CommerceAgentHint> cacheAgentActionQuestions;
        List<CommerceAgentHint> cacheAgentActionQuestions2;
        FrameLayout frameLayout2 = this.LLLILZLLLI;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        C1035880d3y c1035880d3y = this.LLLIIIL;
        if (c1035880d3y != null && (cacheAgentActionQuestions2 = c1035880d3y.getCacheAgentActionQuestions()) != null) {
            cacheAgentActionQuestions2.clear();
        }
        C1035880d3y c1035880d3y2 = this.LLLIIIL;
        if (c1035880d3y2 != null && (cacheAgentActionQuestions = c1035880d3y2.getCacheAgentActionQuestions()) != null) {
            cacheAgentActionQuestions.addAll(list);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (CommerceAgentHint commerceAgentHint : list) {
            int i2 = i + 1;
            if (i >= 0) {
                CommerceAgentHint commerceAgentHint2 = commerceAgentHint;
                arrayList.add(new CommerceAgentActionBarItem(i, commerceAgentHint2.text, "send", "", "", "", "", "", commerceAgentHint2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ICommerceAgentService iCommerceAgentService = (ICommerceAgentService) PluggableExtentionKt.pluggableSpi$default(ICommerceAgentService.class, false, false, false, 14, null);
        if (iCommerceAgentService != null && (c1076920e8ALIZIZ = iCommerceAgentService.LIZIZ(getContext(), arrayList, new AwS595S0100000_16(this, 398), new AwS560S0100000_16(this, 940))) != null && (frameLayout = this.LLLILZLLLI) != null) {
            frameLayout.addView(c1076920e8ALIZIZ);
        }
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJII(boolean z) {
        setGoForwardEnable(z);
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJIIIZ(boolean z) {
        setGoBackEnable(z);
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LJIIJJI(boolean z) {
        Integer numValueOf;
        Boolean boolValueOf;
        Integer numValueOf2;
        String currentUrl;
        C1035880d3y c1035880d3y;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAnoleContainerView enter: hasView=");
        sbLIZ.append(z);
        sbLIZ.append(" beforeVisibility=");
        C1036030d4D c1036030d4D = this.LLJILJIL;
        if (c1036030d4D != null) {
            numValueOf = Integer.valueOf(c1036030d4D.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" attached=");
        C1036030d4D c1036030d4D2 = this.LLJILJIL;
        if (c1036030d4D2 != null) {
            boolValueOf = Boolean.valueOf(c1036030d4D2.isAttachedToWindow());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1036030d4D c1036030d4D3 = this.LLJILJIL;
        if (c1036030d4D3 != null) {
            c1036030d4D3.setContentReady(z);
        }
        C1036030d4D c1036030d4D4 = this.LLJILJIL;
        if (c1036030d4D4 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c1036030d4D4.getVisibility();
            c1036030d4D4.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1036030d4D4);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateAnoleContainerView exit: hasView=");
        sbLIZ2.append(z);
        sbLIZ2.append(" afterVisibility=");
        C1036030d4D c1036030d4D5 = this.LLJILJIL;
        if (c1036030d4D5 != null) {
            numValueOf2 = Integer.valueOf(c1036030d4D5.getVisibility());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (!z) {
            if (LJIJ()) {
                C1035880d3y c1035880d3y2 = this.LLLIIIL;
                if (c1035880d3y2 != null && (currentUrl = c1035880d3y2.getCurrentUrl()) != null) {
                    C1041360dCo.LIZ.getClass();
                    if (!C1041360dCo.LIZIZ(currentUrl) || (c1035880d3y = this.LLLIIIL) == null || !c1035880d3y.enableNativeCheckoutInIAB()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            setAdWebBarMoveManager(null);
            return;
        }
        C786410Ut5.LJLLLLLL(0, getLineFromXml());
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIILL(boolean z) {
        C1035880d3y c1035880d3y = this.LLLIIIL;
        if (c1035880d3y != null) {
            c1035880d3y.setBottomBarShowing(z);
        }
        if (z) {
            TuxIconView tuxIconView = this.LLLILZ;
            SparkContext sparkContext = this.LLLIIIIL;
            C1038790d8f.LIZ.getClass();
            C786410Ut5.LJLIIL(300L, (Handler) C1038790d8f.LIZJ.getValue(), new ARunnableS22S0201000_16(0, sparkContext, tuxIconView, 5));
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0cZT] */
    public final void LJIJI(final int i) {
        final TuxIconView aiComponentButtonIcon;
        float f;
        final float f2;
        final C419220GcC c419220GcC = this.LLLILZJ;
        if (c419220GcC != null) {
            C1016940cZQ aiComponentButton = getAiComponentButton();
            C418860Gbc aiComponentButtonHighlightIcon = null;
            if (aiComponentButton != null) {
                aiComponentButtonIcon = aiComponentButton.getAiComponentButtonIcon();
            } else {
                aiComponentButtonIcon = null;
            }
            C1016940cZQ aiComponentButton2 = getAiComponentButton();
            if (aiComponentButton2 != null) {
                aiComponentButtonHighlightIcon = aiComponentButton2.getAiComponentButtonHighlightIcon();
            }
            final ?? r13 = new InterfaceC1036070d4H() { // from class: X.0cZT
                @Override // X.InterfaceC1036070d4H
                public final void onShowAnimationStart() {
                }

                @Override // X.InterfaceC1036070d4H
                public final void LIZ() {
                    C1016280cYM c1016280cYM;
                    IAnoleManager iAnoleManager;
                    TuxIconView aiComponentButtonIcon2;
                    C1016940cZQ aiComponentButton3 = this.LIZ.getAiComponentButton();
                    if (aiComponentButton3 != null && (aiComponentButtonIcon2 = aiComponentButton3.getAiComponentButtonIcon()) != null) {
                        aiComponentButtonIcon2.setTag("");
                    }
                    SparkContext sparkContext = this.LIZ.LLLIIIIL;
                    if (sparkContext == null || (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) == null || !c1016280cYM.LJIIIZ || (iAnoleManager = c1016280cYM.LJIIIIZZ) == null) {
                        return;
                    }
                    iAnoleManager.LJIIIIZZ("tt_iab_bottom_navigation_bar");
                }

                @Override // X.InterfaceC1036070d4H
                public final void LIZIZ() {
                    C418860Gbc aiComponentButtonHighlightIcon2;
                    C1016280cYM c1016280cYM;
                    SparkContext sparkContext = this.LIZ.LLLIIIIL;
                    if (sparkContext != null && (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) != null && c1016280cYM.LJIIIZ) {
                        IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
                        if (iAnoleManager != null) {
                            iAnoleManager.LIZ();
                        }
                        IAnoleManager iAnoleManager2 = c1016280cYM.LJIIIIZZ;
                        if (iAnoleManager2 != null) {
                            iAnoleManager2.LJIIJJI("tt_iab_bottom_navigation_bar");
                        }
                        c1016280cYM.LJIIIZ = false;
                    }
                    C1016940cZQ aiComponentButton3 = this.LIZ.getAiComponentButton();
                    if (aiComponentButton3 == null || (aiComponentButtonHighlightIcon2 = aiComponentButton3.getAiComponentButtonHighlightIcon()) == null) {
                        return;
                    }
                    aiComponentButtonHighlightIcon2.setScale(1.0f);
                }

                @Override // X.InterfaceC1036070d4H
                public final void onShowAnimationEnd() {
                    C418860Gbc aiComponentButtonHighlightIcon2;
                    C1016280cYM c1016280cYM;
                    SparkContext sparkContext = this.LIZ.LLLIIIIL;
                    if (sparkContext != null && (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) != null && !c1016280cYM.LJIIIZ) {
                        IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
                        if (iAnoleManager != null) {
                            iAnoleManager.LJIJI("tt_iab_bottom_navigation_bar");
                        }
                        c1016280cYM.LJIIIZ = true;
                    }
                    C1016940cZQ aiComponentButton3 = this.LIZ.getAiComponentButton();
                    if (aiComponentButton3 == null || (aiComponentButtonHighlightIcon2 = aiComponentButton3.getAiComponentButtonHighlightIcon()) == null) {
                        return;
                    }
                    aiComponentButtonHighlightIcon2.setScale(0.0f);
                }
            };
            if (aiComponentButtonIcon != null && aiComponentButtonHighlightIcon != null && aiComponentButtonIcon.getTag() == null) {
                if (i == 0) {
                    f = 0.0f;
                    f2 = 1.0f;
                } else {
                    f = 1.0f;
                    f2 = 0.0f;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS148S0300000_6(aiComponentButtonIcon, aiComponentButtonHighlightIcon, c419220GcC, 3));
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0d4E
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        aiComponentButtonIcon.setTag(null);
                        c419220GcC.LIZ(aiComponentButtonIcon, f2);
                        if (i == 0) {
                            InterfaceC1036070d4H interfaceC1036070d4H = r13;
                            if (interfaceC1036070d4H != null) {
                                interfaceC1036070d4H.onShowAnimationEnd();
                                return;
                            }
                            return;
                        }
                        InterfaceC1036070d4H interfaceC1036070d4H2 = r13;
                        if (interfaceC1036070d4H2 == null) {
                            return;
                        }
                        interfaceC1036070d4H2.LIZIZ();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        aiComponentButtonIcon.setTag("");
                        if (i == 0) {
                            InterfaceC1036070d4H interfaceC1036070d4H = r13;
                            if (interfaceC1036070d4H != null) {
                                interfaceC1036070d4H.onShowAnimationStart();
                                return;
                            }
                            return;
                        }
                        InterfaceC1036070d4H interfaceC1036070d4H2 = r13;
                        if (interfaceC1036070d4H2 == null) {
                            return;
                        }
                        interfaceC1036070d4H2.LIZ();
                    }
                });
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, f2);
                valueAnimatorOfFloat2.setDuration(100L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS216S0200000_6(c419220GcC, aiComponentButtonIcon, 13));
                AnimatorSet animatorSet = new AnimatorSet();
                if (i == 0) {
                    animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                } else {
                    animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
                }
                animatorSet.start();
            }
        }
    }

    public final void LJIJJLI(boolean z) {
        Integer num;
        EfficiencyComponents efficiencyComponents;
        boolean z2;
        EfficiencyComponents efficiencyComponents2;
        Integer num2;
        C419220GcC c419220GcC;
        EfficiencyComponents efficiencyComponents3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAdWebBottomBar enter: componentType=");
        C1035880d3y c1035880d3y = this.LLLIIIL;
        ViewGroup viewGroup = null;
        if (c1035880d3y != null && (efficiencyComponents3 = c1035880d3y.getEfficiencyComponents()) != null) {
            num = efficiencyComponents3.componentType;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        sbLIZ.append(" hasEfficiency=");
        C1035880d3y c1035880d3y2 = this.LLLIIIL;
        if (c1035880d3y2 != null) {
            efficiencyComponents = c1035880d3y2.getEfficiencyComponents();
        } else {
            efficiencyComponents = null;
        }
        if (efficiencyComponents != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" animationEnabled=");
        sbLIZ.append(C255750A0n.LIZ());
        sbLIZ.append(" sheetExpanded=");
        sbLIZ.append(this.LLLIILIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1035880d3y c1035880d3y3 = this.LLLIIIL;
        if (c1035880d3y3 != null && (efficiencyComponents2 = c1035880d3y3.getEfficiencyComponents()) != null && (num2 = efficiencyComponents2.componentType) != null && num2.intValue() == 1) {
            if (C255750A0n.LIZ()) {
                if (this.LLLILZJ == null) {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ce5, getAdWebEfficiencyComponentBarViewFromXml(), false);
                    if ((viewTd instanceof C419220GcC) && (c419220GcC = (C419220GcC) viewTd) != null) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cc, c419220GcC.getContext());
                        if (numLIZJ != null) {
                            int iLJIIL = C2441009hQ.LJIIL(numLIZJ.intValue(), 12);
                            c419220GcC.LLJI = iLJIIL;
                            c419220GcC.LLILZ.setColor(iLJIIL);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C12ES.LIZJ(54.0f, c419220GcC.getContext()));
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419220GcC);
                        c419220GcC.setLayoutParams(layoutParams);
                        c419220GcC.setNeedAnimation(C255750A0n.LIZ());
                        FrameLayout adWebEfficiencyComponentBarViewFromXml = getAdWebEfficiencyComponentBarViewFromXml();
                        if (adWebEfficiencyComponentBarViewFromXml != null) {
                            adWebEfficiencyComponentBarViewFromXml.addView(c419220GcC);
                        }
                    } else {
                        c419220GcC = null;
                    }
                    this.LLLILZJ = c419220GcC;
                    FrameLayout adWebEfficiencyComponentBarViewFromXml2 = getAdWebEfficiencyComponentBarViewFromXml();
                    if (adWebEfficiencyComponentBarViewFromXml2 != null) {
                        adWebEfficiencyComponentBarViewFromXml2.setClipChildren(false);
                    }
                    InterfaceC1016290cYN interfaceC1016290cYN = new InterfaceC1016290cYN() { // from class: X.0cZV
                        @Override // X.InterfaceC1016290cYN
                        public final void LIZ() {
                            C1036000d4A c1036000d4A = this.LIZ;
                            c1036000d4A.LJIJI(1);
                            c1036000d4A.setAiComponentBannerHadClosed(true);
                            c1036000d4A.setAiComponentBannerIsShowing(false);
                        }

                        @Override // X.InterfaceC1016290cYN
                        public final void LIZIZ() {
                            C1016280cYM c1016280cYM;
                            C1036000d4A c1036000d4A = this.LIZ;
                            if (c1036000d4A.getAiComponentBannerHadClosed() || c1036000d4A.getAiComponentBannerIsShowing() || c1036000d4A.getAiComponentBannerIsRendering()) {
                                return;
                            }
                            c1036000d4A.setAiComponentBannerIsRendering(true);
                            SparkContext sparkContext = c1036000d4A.LLLIIIIL;
                            if (sparkContext == null || (c1016280cYM = (C1016280cYM) sparkContext.LJFF(C1016280cYM.class)) == null) {
                                return;
                            }
                            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(c1036000d4A, 402);
                            if (c1016280cYM.LJIIIZ) {
                                return;
                            }
                            IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
                            if (iAnoleManager != null) {
                                iAnoleManager.LJIIL("now_render", new AwS595S0100000_16(awS595S0100000_16, 434));
                            }
                            IAnoleManager iAnoleManager2 = c1016280cYM.LJIIIIZZ;
                            if (iAnoleManager2 != null) {
                                iAnoleManager2.mount(c1016280cYM.LIZIZ, "tt_iab_bottom_navigation_bar", null);
                            }
                            IAnoleManager iAnoleManager3 = c1016280cYM.LJIIIIZZ;
                            if (iAnoleManager3 != null) {
                                iAnoleManager3.LIZJ();
                            }
                        }

                        @Override // X.InterfaceC1016290cYN
                        public final void LIZJ() {
                            C419220GcC c419220GcC2 = this.LIZ.LLLILZJ;
                            if (c419220GcC2 != null) {
                                C786410Ut5.LJLLLLLL(8, c419220GcC2);
                            }
                        }
                    };
                    SparkContext sparkContext = this.LLLIIIIL;
                    if (sparkContext != null) {
                        sparkContext.LJJ(InterfaceC1016290cYN.class, interfaceC1016290cYN);
                    }
                }
                InterfaceC1036050d4F interfaceC1036050d4F = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                if (interfaceC1036050d4F != null) {
                    C419220GcC c419220GcC2 = this.LLLILZJ;
                    if (c419220GcC2 != null) {
                        viewGroup = c419220GcC2;
                    }
                    interfaceC1036050d4F.Su1(viewGroup, this.LLLIIIIL, z);
                    return;
                }
                return;
            }
            InterfaceC1016300cYO interfaceC1016300cYO = new InterfaceC1016300cYO() { // from class: X.0cZU
                @Override // X.InterfaceC1016300cYO
                public final void LIZ() {
                    C418860Gbc aiComponentButtonHighlightIcon;
                    C1016280cYM c1016280cYM;
                    C1036000d4A c1036000d4A = this.LIZ;
                    SparkContext sparkContext2 = c1036000d4A.LLLIIIIL;
                    if (sparkContext2 != null && (c1016280cYM = (C1016280cYM) sparkContext2.LJFF(C1016280cYM.class)) != null && c1016280cYM.LJIIIZ) {
                        IAnoleManager iAnoleManager = c1016280cYM.LJIIIIZZ;
                        if (iAnoleManager != null) {
                            iAnoleManager.LIZ();
                        }
                        IAnoleManager iAnoleManager2 = c1016280cYM.LJIIIIZZ;
                        if (iAnoleManager2 != null) {
                            iAnoleManager2.LJIIJJI("tt_iab_bottom_navigation_bar");
                        }
                        c1016280cYM.LJIIIZ = false;
                    }
                    C1016940cZQ aiComponentButton = c1036000d4A.getAiComponentButton();
                    if (aiComponentButton != null && (aiComponentButtonHighlightIcon = aiComponentButton.getAiComponentButtonHighlightIcon()) != null) {
                        aiComponentButtonHighlightIcon.setScale(1.0f);
                    }
                    c1036000d4A.setAiComponentBannerHadClosed(true);
                    c1036000d4A.setAiComponentBannerIsShowing(false);
                }

                @Override // X.InterfaceC1016300cYO
                public final void LIZIZ() {
                    C418860Gbc aiComponentButtonHighlightIcon;
                    C1016280cYM c1016280cYM;
                    C1036000d4A c1036000d4A = this.LIZ;
                    if (c1036000d4A.getAiComponentBannerHadClosed() || c1036000d4A.getAiComponentBannerIsShowing() || c1036000d4A.getAiComponentBannerIsRendering()) {
                        return;
                    }
                    c1036000d4A.setAiComponentBannerIsRendering(true);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, c1036000d4A.getContext());
                    if (numLIZJ2 != null) {
                        int iLJIIL2 = C2441009hQ.LJIIL(numLIZJ2.intValue(), 12);
                        FrameLayout adWebEfficiencyComponentBarViewFromXml3 = c1036000d4A.getAdWebEfficiencyComponentBarViewFromXml();
                        if (adWebEfficiencyComponentBarViewFromXml3 != null) {
                            adWebEfficiencyComponentBarViewFromXml3.setBackgroundColor(iLJIIL2);
                        }
                    }
                    SparkContext sparkContext2 = c1036000d4A.LLLIIIIL;
                    if (sparkContext2 != null && (c1016280cYM = (C1016280cYM) sparkContext2.LJFF(C1016280cYM.class)) != null) {
                        C1016280cYM.LJ(c1016280cYM);
                    }
                    C1016940cZQ aiComponentButton = c1036000d4A.getAiComponentButton();
                    if (aiComponentButton != null && (aiComponentButtonHighlightIcon = aiComponentButton.getAiComponentButtonHighlightIcon()) != null) {
                        aiComponentButtonHighlightIcon.setScale(0.0f);
                    }
                    c1036000d4A.setAiComponentBannerIsShowing(true);
                }
            };
            SparkContext sparkContext2 = this.LLLIIIIL;
            if (sparkContext2 != null) {
                sparkContext2.LJJ(InterfaceC1016300cYO.class, interfaceC1016300cYO);
            }
            InterfaceC1036050d4F interfaceC1036050d4F2 = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
            if (interfaceC1036050d4F2 == null) {
                return;
            }
            FrameLayout adWebEfficiencyComponentBarViewFromXml3 = getAdWebEfficiencyComponentBarViewFromXml();
            if (adWebEfficiencyComponentBarViewFromXml3 != null) {
                viewGroup = adWebEfficiencyComponentBarViewFromXml3;
            }
            interfaceC1036050d4F2.Su1(viewGroup, this.LLLIIIIL, z);
            return;
        }
        InterfaceC1036050d4F interfaceC1036050d4F3 = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
        if (interfaceC1036050d4F3 == null) {
            return;
        }
        interfaceC1036050d4F3.Su1(getAdWebEfficiencyComponentBarViewFromXml(), this.LLLIIIIL, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036000d4A.LJJIFFI(java.lang.String):void");
    }

    public final void setAdWebBottomBarGoBack1FromXml(TuxIconView tuxIconView) {
        this.LLJZ = tuxIconView;
    }

    public final void setAdWebBottomBarGoBack2FromXml(TuxIconView tuxIconView) {
        this.LLJJJ = tuxIconView;
    }

    public final void setAdWebBottomBarGoBack3FromXml(TuxIconView tuxIconView) {
        this.LLJJJJJIL = tuxIconView;
    }

    public final void setAdWebBottomBarGoBackFromXml(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
    }

    public final void setAdWebBottomBarGoForward1FromXml(TuxIconView tuxIconView) {
        this.LLJLLL = tuxIconView;
    }

    public final void setAdWebBottomBarGoForward2FromXml(TuxIconView tuxIconView) {
        this.LLJJIJIL = tuxIconView;
    }

    public final void setAdWebBottomBarGoForward3FromXml(TuxIconView tuxIconView) {
        this.LLJJJJ = tuxIconView;
    }

    public final void setAdWebBottomBarGoForwardFromXml(TuxIconView tuxIconView) {
        this.LLJILLL = tuxIconView;
    }

    public final void setAdWebEfficiencyComponentBarViewFromXml(FrameLayout frameLayout) {
        this.LLJILJILJ = frameLayout;
    }

    public final void setAiComponentButton(C1016940cZQ c1016940cZQ) {
        this.LLLI = c1016940cZQ;
    }

    public final void setAnoleContainerView(C1036030d4D c1036030d4D) {
        this.LLJILJIL = c1036030d4D;
    }

    public final void setAvatarViewFromXml(C427660Gpo c427660Gpo) {
        this.LLJLILLLLZIIL = c427660Gpo;
    }

    public final void setAvatarViewInStyle3FromXml(C427660Gpo c427660Gpo) {
        this.LLJJL = c427660Gpo;
    }

    public final void setBaLabelFromXml(TuxIconView tuxIconView) {
        this.LLJLLIL = tuxIconView;
    }

    public final void setBaLabelInStyle3FromXml(TuxIconView tuxIconView) {
        this.LLJL = tuxIconView;
    }

    public final void setBaLlFromXml(LinearLayout linearLayout) {
        this.LLL = linearLayout;
    }

    public final void setBottomBarListener(InterfaceC1036080d4I interfaceC1036080d4I) {
        this.LLLLII = interfaceC1036080d4I;
    }

    public final void setEfficiencyComponentContainerFromXml(RadiusLayout radiusLayout) {
        this.LLJZIJLIL = radiusLayout;
    }

    public final void setGoBackEnable(boolean z) {
        float f;
        TuxIconView tuxIconView = this.LLLIIII;
        if (tuxIconView != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C786410Ut5.x5(tuxIconView, f);
        }
    }

    public final void setGoForwardEnable(boolean z) {
        float f;
        TuxIconView tuxIconView = this.LLLII;
        if (tuxIconView != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            C786410Ut5.x5(tuxIconView, f);
        }
    }

    public final void setHistoryInStyle2FromXml(TuxIconView tuxIconView) {
        this.LLJJJIL = tuxIconView;
    }

    public final void setHistoryInStyle3FromXml(TuxIconView tuxIconView) {
        this.LLJJJJLIIL = tuxIconView;
    }

    public final void setInShopifyCheckoutStatus(boolean z) {
        this.LLLJIL = z;
    }

    public final void setLeftIconFromXml(TuxIconView tuxIconView) {
        this.LLLFF = tuxIconView;
    }

    public final void setLeftTextFromXml(TuxTextView tuxTextView) {
        this.LLLFFI = tuxTextView;
    }

    public final void setLineFromXml(View view) {
        this.LLJLIL = view;
    }

    public final void setLineVisible(boolean z) {
        int i = 0;
        if (this.LLILLJJLI) {
            C786410Ut5.LJLLLLLL(0, getLineFromXml());
            return;
        }
        View lineFromXml = getLineFromXml();
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, lineFromXml);
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public void setListener(InterfaceC1036080d4I interfaceC1036080d4I) {
        this.LLLLII = interfaceC1036080d4I;
        TuxIconView tuxIconView = this.LLLIIII;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS151S0100000_16(this, 146));
        }
        TuxIconView tuxIconView2 = this.LLLII;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS151S0100000_16(this, 147));
        }
    }

    public final void setNickNameFromXml(TuxTextView tuxTextView) {
        this.LLJLL = tuxTextView;
    }

    public final void setNickNameInStyle3FromXml(TuxTextView tuxTextView) {
        this.LLJJLIIIJLLLLLLLZ = tuxTextView;
    }

    public final void setRightIconFromXml(TuxIconView tuxIconView) {
        this.LLLFZ = tuxIconView;
    }

    public final void setRightTextFromXml(TuxTextView tuxTextView) {
        this.LLLF = tuxTextView;
    }

    public final void setStyle0FromXml(RelativeLayout relativeLayout) {
        this.LLJJI = relativeLayout;
    }

    public final void setStyle1FromXml(RelativeLayout relativeLayout) {
        this.LLJJIII = relativeLayout;
    }

    public final void setStyle2FromXml(RelativeLayout relativeLayout) {
        this.LLJJIJI = relativeLayout;
    }

    public final void setStyle3FromXml(LinearLayout linearLayout) {
        this.LLJJIJIIJIL = linearLayout;
    }

    public static boolean LJJI(C1035880d3y c1035880d3y, int i) {
        C1035890d3z adCommonData;
        if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null && adCommonData.isInstantPage()) {
            return false;
        }
        return ((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJIIIZ(c1035880d3y, i);
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LIZJ(View view, IABBottomBarElement iABBottomBarElement) {
        if (!Intrinsics.LJFF(iABBottomBarElement.elementType, "tt_iab_bottom_bar_AI_element") || !(view instanceof C1016940cZQ)) {
            return;
        }
        this.LLLI = (C1016940cZQ) view;
    }

    @Override // X.AbstractC1036010d4B
    public final void LJIIZILJ(Map map, Map map2) {
        AwemeRawAd awemeRawAd;
        C1035880d3y c1035880d3y = this.LLLIIIL;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "othershow", awemeRawAd);
            if (map != null) {
                c1022820ciuLIZLLL.LIZLLL(map);
            }
            if (map2 != null) {
                c1022820ciuLIZLLL.LIZ(map2);
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    public final void LJJ(String str, String str2) {
        String str3 = str;
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            Context context = getContext();
            if (context == null) {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            }
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str4 = str2;
            }
            C1027410cqJ.LIZ(context, C1027610cqd.LIZ(str3, "", 0, 0, 0, 6, new JSONObject(str4), null, null, null, "", 1, null, 0, 0, 1, null, null, null, null, null, null, 8314880)).LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0d4G] */
    public C1036000d4A(Context context, View view, int i) {
        View viewTd;
        super(context, null, 0);
        view = (i & 8) != 0 ? null : view;
        this.LLLJL = new InterfaceC1054500dY0() { // from class: X.0d4G
            @Override // X.InterfaceC1054500dY0
            public final void Z0() {
                FrameLayout adWebEfficiencyComponentBarViewFromXml = this.LIZ.getAdWebEfficiencyComponentBarViewFromXml();
                if (adWebEfficiencyComponentBarViewFromXml != null) {
                    C786410Ut5.LJZ(0, adWebEfficiencyComponentBarViewFromXml);
                }
                this.LIZ.setLineVisible(false);
            }

            @Override // X.InterfaceC1054500dY0
            public final void onVisible() {
                FrameLayout adWebEfficiencyComponentBarViewFromXml = this.LIZ.getAdWebEfficiencyComponentBarViewFromXml();
                if (adWebEfficiencyComponentBarViewFromXml != null) {
                    C786410Ut5.LJZ(8, adWebEfficiencyComponentBarViewFromXml);
                }
                this.LIZ.setLineVisible(true);
            }
        };
        this.LLLL = C452501pT.LIZIZ(new AwS560S0100000_16(context, 941));
        setLynx(false);
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -2));
            viewTd = this;
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.li, this, true);
        }
        C786410Ut5.W5(viewTd, new ViewGroup.MarginLayoutParams(-1, -2));
        this.LLLII = getAdWebBottomBarGoForwardFromXml();
        this.LLLIIII = getAdWebBottomBarGoBackFromXml();
    }

    public final void LJJII(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        EfficiencyComponents efficiencyComponents;
        Integer num;
        if (LJJI(this.LLLIIIL, 0)) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LLIIL(getStyle0FromXml(), 8);
                    C786410Ut5.LLIIL(getStyle1FromXml(), 8);
                    C786410Ut5.LLIIL(getStyle2FromXml(), 8);
                    C786410Ut5.LJZL(0, getStyle3FromXml());
                    setNavigationBarShow(true);
                    setLineVisible(false);
                    this.LLLII = getAdWebBottomBarGoForward3FromXml();
                    this.LLLIIII = getAdWebBottomBarGoBack3FromXml();
                    TuxIconView historyInStyle3FromXml = getHistoryInStyle3FromXml();
                    this.LLLILZ = historyInStyle3FromXml;
                    if (historyInStyle3FromXml != null) {
                        C786410Ut5.a9(historyInStyle3FromXml, new ACListenerS151S0100000_16(this, 149));
                    }
                    InterfaceC1036050d4F interfaceC1036050d4F = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                    if (interfaceC1036050d4F != null) {
                        interfaceC1036050d4F.y11(0, this.LLLIIIIL, getHistoryInStyle3FromXml());
                    }
                    setAvatarView(getAvatarViewInStyle3FromXml());
                    setNickName(getNickNameInStyle3FromXml());
                    setBaLabel(getBaLabelInStyle3FromXml());
                    int iLJIILJJIL = C12ES.LJIILJJIL(C0KWF.LIZIZ(getContext()), getContext());
                    if (iLJIILJJIL < 375) {
                        TuxTextView nickName = getNickName();
                        if (nickName != null) {
                            nickName.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJIILJJIL - 228))));
                        }
                    } else {
                        TuxTextView nickName2 = getNickName();
                        if (nickName2 != null) {
                            nickName2.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJIILJJIL - 276))));
                        }
                    }
                    LJIILLIIL(getAdLpBottomModel(), getEnterProfilePageListener());
                    return;
                }
                return;
            }
            C786410Ut5.LLIIL(getStyle0FromXml(), 8);
            C786410Ut5.LLIIL(getStyle1FromXml(), 8);
            C786410Ut5.LLIIL(getStyle2FromXml(), 0);
            C786410Ut5.LJZL(8, getStyle3FromXml());
            setNavigationBarShow(true);
            setLineVisible(false);
            this.LLLII = getAdWebBottomBarGoForward2FromXml();
            this.LLLIIII = getAdWebBottomBarGoBack2FromXml();
            TuxIconView historyInStyle2FromXml = getHistoryInStyle2FromXml();
            this.LLLILZ = historyInStyle2FromXml;
            if (historyInStyle2FromXml != null) {
                C786410Ut5.a9(historyInStyle2FromXml, new ACListenerS151S0100000_16(this, 148));
            }
            InterfaceC1036050d4F interfaceC1036050d4F2 = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
            if (interfaceC1036050d4F2 == null) {
                return;
            }
            interfaceC1036050d4F2.y11(0, this.LLLIIIIL, getHistoryInStyle2FromXml());
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                C1035880d3y c1035880d3y = this.LLLIIIL;
                if (c1035880d3y != null && (efficiencyComponents = c1035880d3y.getEfficiencyComponents()) != null && (num = efficiencyComponents.componentType) != null && num.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LJJIII(getAdLpBottomModel(), getEnterProfilePageListener(), z, false, z2);
                return;
            }
            return;
        }
        RelativeLayout style0FromXml = getStyle0FromXml();
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLIIL(style0FromXml, i3);
        setNavigationBarShow(z);
        setLineVisible(false);
        C786410Ut5.LLIIL(getStyle1FromXml(), 8);
        C786410Ut5.LLIIL(getStyle2FromXml(), 8);
        C786410Ut5.LJZL(8, getStyle3FromXml());
        this.LLLII = getAdWebBottomBarGoForwardFromXml();
        this.LLLIIII = getAdWebBottomBarGoBackFromXml();
    }

    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        C1037280d6E c1037280d6E = this.LLJIJIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJ(i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    @Override // X.AbstractC1036010d4B, X.InterfaceC1036210d4V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.hybrid.spark.SparkContext r18, X.C1016930cZP r19, java.lang.String r20, java.lang.Runnable r21) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036000d4A.LJIIIIZZ(com.bytedance.hybrid.spark.SparkContext, X.0cZP, java.lang.String, java.lang.Runnable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C1016930cZP r10, java.lang.Runnable r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036000d4A.LJJIII(X.0cZP, java.lang.Runnable, boolean, boolean, boolean):void");
    }
}
