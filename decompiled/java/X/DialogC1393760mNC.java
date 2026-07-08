package X;

import Y.ACListenerS155S0100000_21;
import Y.ACListenerS55S1200000_12;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1393760mNC extends DialogC1389100mFg implements C18O5 {
    public final Context LLJILJIL;
    public C712520RxC LLJILJILJ;
    public boolean LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C1393730mN9 LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public C426770GoN LLJL;
    public TuxIconView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public AnchorEventCenter LLJLLIL;
    public HomeTabAbility LLJLLL;
    public final C1402270mav LLJZ;

    @Override // X.C18O5
    public final void LJJLIIIJL() {
    }

    public final void LJLIIL() {
        String str;
        String str2;
        for (InterfaceC1393560mMs interfaceC1393560mMs : this.LLJILJILJ.LJIILL()) {
            if (interfaceC1393560mMs instanceof ShopWindowAnchorMaker) {
                ShopWindowAnchorMaker shopWindowAnchorMaker = (ShopWindowAnchorMaker) interfaceC1393560mMs;
                if (shopWindowAnchorMaker.LLJ.LJIILL() == C15MV.REGION_UNAVAILABLE) {
                    String string = C786410Ut5.N3(getContext()).getString(2131845266);
                    LJLJI(string);
                    AnchorProductInfo anchorProductInfoLJJ = shopWindowAnchorMaker.LLJ.LJJ();
                    if (anchorProductInfoLJJ != null && (str = anchorProductInfoLJJ.unavailableText) != null && (anchorProductInfoLJJ == null || (str2 = anchorProductInfoLJJ.unavailableText) == null || str2.length() != 0)) {
                        string = str;
                    }
                    LJLJI(string);
                    LJLI("tiktokec_module_show");
                    C786410Ut5.I7(new C1401860maG(anchorProductInfoLJJ, this, 5), findViewById(R.id.tv_unavailable_shop));
                }
            }
        }
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (!this.LLJJ) {
            super.dismiss();
            C1393770mND.LIZ(this);
        } else if (this.LLJJJIL || this.LLJJIJIL || ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJI()) {
            this.LLJJIJI = false;
            this.LLJJJIL = false;
            super.dismiss();
            C1393590mMv.LJ = null;
            C1393580mMu.LJ = null;
            C1393770mND.LIZ(this);
        } else {
            hide();
            Boolean bool = Boolean.FALSE;
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.getPageLifecycle().LIZIZ(this, BtmPageLifecycle.State.PAUSED);
            btmSDK.getPageLifecycle().LJFF(this, bool, null);
        }
        AnchorDialogPanelService anchorDialogPanelServiceLJII = AnchorStateServiceImpl.LJII();
        if (anchorDialogPanelServiceLJII != null) {
            anchorDialogPanelServiceLJII.LIZIZ(false);
        }
        for (InterfaceC1393560mMs interfaceC1393560mMs : this.LLJILJILJ.LJIILL()) {
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ != null) {
                interfaceC1393560mMs.yg(activityLIZ, this);
            }
        }
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(false);
        }
        C1440005kM.LIZ(new C453940Hr6(false, false, 4));
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C1391850mK7.LIZIZ(this, "multi_anchor_panel_nscreen");
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9b4vHkid3rlTCLFViKwtVN5wO6Ul1KUETxA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        AnchorDialogPanelService anchorDialogPanelServiceLJII = AnchorStateServiceImpl.LJII();
        if (anchorDialogPanelServiceLJII != null) {
            anchorDialogPanelServiceLJII.LIZIZ(true);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.getPageLifecycle().LIZIZ(this, BtmPageLifecycle.State.RESUMED);
        btmSDK.getPageLifecycle().LIZLLL(this, null, null);
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
    }

    @Override // X.C18O5
    public final ViewGroup LJJIJL() {
        return (ViewGroup) findViewById(R.id.b24);
    }

    public final void LJLIL() {
        Boolean boolValueOf;
        Function0<? extends Map<String, String>> function0;
        Map<String, String> mapInvoke;
        Function0<? extends Map<String, String>> function02;
        Map<String, String> mapInvoke2;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.azn);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        for (InterfaceC1393560mMs interfaceC1393560mMs : this.LLJILJILJ.LJIILL()) {
            if (this.LLJILLL) {
                View viewLJJJJIZL = interfaceC1393560mMs.LJJJJIZL((ViewGroup) findViewById(R.id.azn), this, C1392540mLE.LIZJ(interfaceC1393560mMs, this.LLJILJILJ, "click_list", true), this.LLJILJILJ.LJIILL().size());
                if (viewLJJJJIZL != null) {
                    View viewLIZ = C708940RrQ.LIZ(viewLJJJJIZL);
                    if (C04UD.LIZ()) {
                        viewLJJJJIZL.setTag(R.id.b0j, interfaceC1393560mMs);
                        viewLJJJJIZL.setTag(R.id.b09, this.LLJLLIL);
                    }
                    List<String> list = this.LLJILJILJ.LIZIZ.LJI;
                    if (list != null) {
                        AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
                        boolValueOf = Boolean.valueOf(C13LP.LJJJJ(anchorCommonStructData != null ? anchorCommonStructData.getComponentKey() : null, list));
                    } else {
                        boolValueOf = null;
                    }
                    viewLIZ.setTag(R.id.b0l, boolValueOf);
                    viewLIZ.setTag(R.id.b0p, this.LLJILJILJ.LIZIZ.LIZJ);
                    AnchorCommonStruct anchorCommonStructData2 = interfaceC1393560mMs.data();
                    viewLIZ.setTag(R.id.b0m, anchorCommonStructData2 != null ? anchorCommonStructData2.getComponentKey() : null);
                    viewLIZ.setTag(R.id.b0n, interfaceC1393560mMs.LJII().LJJLIIIJJIZ());
                    C1400390mXt anchorMobConfiguration = interfaceC1393560mMs.getAnchorMobConfiguration();
                    if (anchorMobConfiguration != null && (function0 = anchorMobConfiguration.LIZLLL) != null && (mapInvoke = function0.invoke()) != null) {
                        viewLIZ.setTag(R.id.b0o, mapInvoke);
                    }
                }
            } else {
                View viewLJI = interfaceC1393560mMs.LJI((ViewGroup) findViewById(R.id.azn), this, C1392540mLE.LIZJ(interfaceC1393560mMs, this.LLJILJILJ, "click_list", true), this.LLJILJILJ.LJIILL().size());
                if (viewLJI != null) {
                    View viewLIZ2 = C708940RrQ.LIZ(viewLJI);
                    viewLIZ2.setTag(R.id.b0p, this.LLJILJILJ.LIZIZ.LIZJ);
                    AnchorCommonStruct anchorCommonStructData3 = interfaceC1393560mMs.data();
                    viewLIZ2.setTag(R.id.b0m, anchorCommonStructData3 != null ? anchorCommonStructData3.getComponentKey() : null);
                    viewLIZ2.setTag(R.id.b0n, interfaceC1393560mMs.LJII().LJJLIIIJJIZ());
                    C1400390mXt anchorMobConfiguration2 = interfaceC1393560mMs.getAnchorMobConfiguration();
                    if (anchorMobConfiguration2 != null && (function02 = anchorMobConfiguration2.LIZLLL) != null && (mapInvoke2 = function02.invoke()) != null) {
                        viewLIZ2.setTag(R.id.b0o, mapInvoke2);
                    }
                }
            }
        }
    }

    public final void LJLILLLLZI() throws Throwable {
        C21578619ce c21578619ce = (C21578619ce) findViewById(R.id.b1z);
        if (c21578619ce != null) {
            c21578619ce.smoothScrollTo(0, 0);
        }
        show();
        C785410UrT.LIZIZ(this);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(this);
        C816490W1f.LIZ(this);
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0mN9, X.19Dh] */
    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (InterfaceC1393560mMs interfaceC1393560mMs : this.LLJILJILJ.LJIILL()) {
            if (interfaceC1393560mMs instanceof InterfaceC1393740mNA) {
                ((InterfaceC1393740mNA) interfaceC1393560mMs).LJIIIZ(SystemClock.elapsedRealtime());
            }
        }
        final C712520RxC c712520RxC = this.LLJILJILJ;
        ?? r1 = new InterfaceC21503119Dh(c712520RxC, this) { // from class: X.0mN9
            public final C712520RxC LL;
            public final Dialog LLILLJJLI;

            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
                for (InterfaceC1393560mMs interfaceC1393560mMs2 : this.LL.LJIILL()) {
                    if ((interfaceC1393560mMs2 instanceof AbstractC1066890drz) && Intrinsics.LJFF(((AbstractC1066890drz) interfaceC1393560mMs2).LJIILJJIL().getLocalClassName(), baseActivity.getLocalClassName())) {
                        if (interfaceC1393560mMs2 instanceof InterfaceC1393740mNA) {
                            ((InterfaceC1393740mNA) interfaceC1393560mMs2).LJIIIZ(SystemClock.elapsedRealtime());
                        }
                        interfaceC1393560mMs2.LJJJLIIL(this.LL, this.LLILLJJLI, false, true, true);
                    }
                }
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
                Iterator<InterfaceC1393560mMs> it2 = this.LL.LJIILL().iterator();
                while (it2.hasNext()) {
                    it2.next().yg(baseActivity, this.LLILLJJLI);
                }
            }

            {
                this.LL = c712520RxC;
                this.LLILLJJLI = this;
            }
        };
        this.LLJJJJ = r1;
        BaseActivity.Companion.getClass();
        C726540Sei.LIZ(r1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1393730mN9 c1393730mN9 = this.LLJJJJ;
        if (c1393730mN9 != null) {
            BaseActivity.Companion.getClass();
            BaseActivity.callback.LL.remove(c1393730mN9);
            this.LLJJJJ = null;
        }
        C04RE.LIZ.getClass();
        if (((Boolean) C04RE.LIZIZ.getValue()).booleanValue()) {
            HomeTabAbility homeTabAbility = this.LLJLLL;
            if (homeTabAbility != null) {
                homeTabAbility.Ik0(this.LLJZ);
            }
            HomeTabAbility homeTabAbility2 = this.LLJLLL;
            if (homeTabAbility2 != null) {
                homeTabAbility2.tx0(this.LLJZ);
            }
        }
    }

    @Override // X.C18O5
    public final TuxIconView LJIIJJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C18O5
    public final void LJIJJ(int i) {
        try {
            C426770GoN c426770GoN = this.LLJL;
            if (c426770GoN != null) {
                int i2 = 0;
                if (i <= 0) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, c426770GoN);
            }
            C426770GoN c426770GoN2 = this.LLJL;
            if (c426770GoN2 != null) {
                c426770GoN2.setCount(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C18O5
    public final void LJJJJLL(final AwS611S0100000_32 awS611S0100000_32) {
        ((C21578619ce) findViewById(R.id.b1z)).setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0mNE
            @Override // X.InterfaceC1809520xBm
            public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                Function1<Integer, Unit> function1 = awS611S0100000_32;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i2 - i4));
                }
            }
        });
    }

    @Override // X.C18O5
    public final void LJJJZ(int i) {
        C21578619ce c21578619ce = (C21578619ce) findViewById(R.id.b1z);
        if (c21578619ce != null) {
            c21578619ce.smoothScrollBy(0, i);
        }
    }

    public final void LJLI(String str) {
        int i;
        int i2;
        String awemeRawAdIdStr;
        String strLIZLLL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LIZLLL(this.LLJILJILJ.LIZIZ.LIZ, this.LLJILLL);
        if (strLIZLLL == null) {
            strLIZLLL = "video_multi_anchor";
        }
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        c18n0.LJIJI = "TEMAI";
        c18n0.LIZJ = this.LLJILJILJ.LIZIZ.LIZ.getAid();
        c18n0.LJJIIJZLJL = "video_shopping_list";
        c18n0.LJJIIZ = "video_multi_anchor";
        c18n0.LIZLLL = AwemeExtKt.getAuthorUid(this.LLJILJILJ.LIZIZ.LIZ);
        C712510RxB c712510RxB = this.LLJILJILJ.LIZIZ;
        c18n0.LIZIZ = c712510RxB.LIZJ;
        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(c712510RxB.LIZ), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            i = 1;
        } else {
            i = 0;
        }
        c18n0.LJIIZILJ = i;
        if (this.LLJILJILJ.LIZIZ.LIZ.isAd()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c18n0.LJIJJLI = i2;
        if (this.LLJILJILJ.LIZIZ.LIZ.isAd()) {
            awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(this.LLJILJILJ.LIZIZ.LIZ);
        } else {
            awemeRawAdIdStr = null;
        }
        c18n0.LJIL = awemeRawAdIdStr;
        c18n0.LJJI = strLIZLLL;
        C1065340dpU c1065340dpU = C1065340dpU.LIZ;
        Aweme aweme = this.LLJILJILJ.LIZIZ.LIZ;
        c1065340dpU.getClass();
        c18n0.LJJII = C1065340dpU.LIZ(aweme);
        c18n0.LJJIFFI = "video";
        c18n0.LJJJ = "product_not_available";
        iCommerceServiceLIZ.logCommerceEvents(str, c18n0);
    }

    public final void LJLIIIL(int i) {
        this.LLJJJJJIL = getContext().getString(i);
    }

    public final void LJLJI(String str) {
        C786410Ut5.LLLLZLL((TuxTextView) findViewById(R.id.tv_unavailable_shop), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_info_circle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(c419910GdJ.LIZ(this.LLJILJIL));
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, new C426960Gog(bitmapLIZIZ, C341940Daq.LIZ(6.0d)), 0, 0, 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        ((TextView) findViewById(R.id.tv_unavailable_shop)).setText(spannableStringBuilder);
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        MainActivityScope mainActivityScopeLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView;
        IECommerceAnchorService iECommerceAnchorService;
        this.LLJJIJI = true;
        super.onCreate(bundle);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLJILJIL) - C497820Jfg.LIZJ(this.LLJILJIL);
        Window window = getWindow();
        if (window != null) {
            if (iLJIIIIZZ == 0) {
                iLJIIIIZZ = -1;
            }
            window.setLayout(-1, iLJIIIIZZ);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.dr);
            View viewQe = C786410Ut5.qe(window, R.id.fpl);
            if (viewQe != null) {
                viewQe.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        setContentView(R.layout.bm5);
        final Window window2 = getWindow();
        HomeTabAbility homeTabAbilityLIZ = null;
        if (window2 != null) {
            if (this.LLJJJ) {
                window2.addFlags(2);
                window2.setDimAmount(0.5f);
                try {
                    BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((View) ((C1393820mNI) findViewById(R.id.b24)).getParent());
                    if (bottomSheetBehaviorFrom != null) {
                        bottomSheetBehaviorFrom.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0mNF
                            @Override // X.AbstractC1177930gl5
                            public final void LIZLLL(int i, View view) {
                            }

                            @Override // X.AbstractC1177930gl5
                            public final void LIZJ(View view, float f) {
                                if (f <= 0.0f) {
                                    window2.setDimAmount((1 + f) * 0.5f);
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                window2.clearFlags(2);
            }
        }
        this.LLJLL = (ConstraintLayout) findViewById(R.id.fsq);
        if (this.LLJILJILJ.LJIILL().size() == 1 && (C13LP.LJJJLL(this.LLJILJILJ.LJIILL()) instanceof ShopWindowAnchorMaker) && ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIJ() && ((iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null)) == null || !iECommerceAnchorService.LJJJJZI())) {
            ConstraintLayout constraintLayout = this.LLJLL;
            if (constraintLayout != null) {
                C786410Ut5.LJJJJL(constraintLayout);
            }
            ConstraintLayout constraintLayout2 = this.LLJLL;
            if (constraintLayout2 != null) {
                constraintLayout2.addView(C786410Ut5.LJLLJ(getContext(), R.layout.bm6, null), new ViewGroup.LayoutParams(-1, -2));
            }
        }
        ConstraintLayout constraintLayout3 = this.LLJLL;
        if (constraintLayout3 != null) {
            this.LLJJL = (ConstraintLayout) constraintLayout3.findViewById(R.id.v8b);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) constraintLayout3.findViewById(R.id.v8n);
            this.LLJL = (C426770GoN) constraintLayout3.findViewById(R.id.v8p);
            this.LLJLIL = (TuxIconView) constraintLayout3.findViewById(R.id.b23);
            this.LLJLILLLLZIIL = (TuxTextView) constraintLayout3.findViewById(R.id.b25);
        }
        ((C1393820mNI) findViewById(R.id.b24)).setMaxHeight((int) (((double) C12ES.LJIIIIZZ(getContext())) * 0.73d));
        String str = this.LLJJJJJIL;
        if (str != null && (tuxTextView = this.LLJLILLLLZIIL) != null) {
            tuxTextView.setText(str);
        }
        View viewFindViewById = findViewById(R.id.fyx);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.3d)));
            C786410Ut5.W5(viewFindViewById, layoutParams);
            viewFindViewById.setBackgroundColor(C475630Ikz.LIZIZ(R.attr.a02, viewFindViewById.getContext()));
        }
        LJLIIL();
        LJLIL();
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 174));
        }
        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService2 != null && iECommerceAnchorService2.LJJJJZI() && !this.LLJJJJLIIL) {
            this.LLJJJJLIIL = true;
            View viewFindViewById2 = findViewById(R.id.b24);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.a5a);
            }
            View viewFindViewById3 = findViewById(R.id.azn);
            if (viewFindViewById3 != null) {
                C0H1U.LJIIJ(0, viewFindViewById3);
            }
            ConstraintLayout constraintLayout4 = this.LLJLL;
            if (constraintLayout4 != null) {
                int iLIZ = C341940Daq.LIZ(52.0d);
                ViewGroup.LayoutParams layoutParams2 = constraintLayout4.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null && layoutParams2.height != iLIZ) {
                    layoutParams2.height = iLIZ;
                    C786410Ut5.m6(constraintLayout4, layoutParams2);
                }
            }
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 != null) {
                int iLIZ2 = C341940Daq.LIZ(28.0d);
                ViewGroup.LayoutParams layoutParams3 = tuxIconView2.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams.width = iLIZ2;
                    marginLayoutParams.height = iLIZ2;
                }
                int iLIZ3 = C341940Daq.LIZ(4.0d);
                tuxIconView2.setPadding(iLIZ3, iLIZ3, iLIZ3, iLIZ3);
                int iLIZ4 = C341940Daq.LIZ(20.0d);
                tuxIconView2.setIconWidth(iLIZ4);
                tuxIconView2.setIconHeight(iLIZ4);
                tuxIconView2.setBackgroundResource(R.drawable.a5c);
                tuxIconView2.setTintColorRes(R.attr.a1j);
                tuxIconView2.requestLayout();
            }
            TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView3 != null) {
                int iLIZ5 = C341940Daq.LIZ(22.0d);
                tuxIconView3.setIconWidth(iLIZ5);
                tuxIconView3.setIconHeight(iLIZ5);
            }
            View viewFindViewById4 = findViewById(R.id.fyx);
            if (viewFindViewById4 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById4);
            }
        }
        findViewById(R.id.b24).addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC785940UsK(this, 6));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.b1z);
        ViewTreeObserverOnScrollChangedListenerC480830ItN viewTreeObserverOnScrollChangedListenerC480830ItN = new ViewTreeObserverOnScrollChangedListenerC480830ItN(viewGroup);
        C786410Ut5.z3(viewGroup.getViewTreeObserver(), viewTreeObserverOnScrollChangedListenerC480830ItN);
        C786410Ut5.x3(viewGroup.getViewTreeObserver(), viewTreeObserverOnScrollChangedListenerC480830ItN);
        if (this.LLJJIJIIJIL) {
            HandlerHook.viewPost(findViewById(R.id.b24), new ARunnableS112S0100000_12(this, 328));
        }
        String str2 = this.LLJJI;
        C18IP depend = BtmSDK.INSTANCE.getDepend();
        C18IV c18iv = new C18IV(this, "a2270.b58272", true, false, false, str2, false);
        depend.getClass();
        C18IP.LJII(c18iv);
        C04RE.LIZ.getClass();
        if (((Boolean) C04RE.LIZIZ.getValue()).booleanValue()) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLJILJILJ.LIZIZ.LIZIZ);
            if (c19egLIZIZ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null) {
                homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ);
            }
            this.LLJLLL = homeTabAbilityLIZ;
            if (homeTabAbilityLIZ != null) {
                homeTabAbilityLIZ.UC1(this.LLJZ);
                homeTabAbilityLIZ.ao(this.LLJZ);
            }
        }
    }

    @Override // X.C18O5
    public final void LJJLIIIJ(String str, Function0 function0, boolean z) {
        TuxIconView tuxIconView;
        int i;
        try {
            ConstraintLayout constraintLayout = this.LLJJL;
            if (constraintLayout != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, constraintLayout);
            }
            if (str != null && (tuxIconView = this.LLJJLIIIJLLLLLLLZ) != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS55S1200000_12(function0, this, str, 2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public DialogC1393760mNC(Context context, C712520RxC c712520RxC, boolean z, boolean z2, String str) {
        super(context, R.style.aca);
        this.LLJILJIL = context;
        this.LLJILJILJ = c712520RxC;
        this.LLJILLL = z;
        this.LLJJ = z2;
        this.LLJJI = str;
        this.LLJJIII = "";
        this.LLJZ = new C1402270mav(this, 3);
    }
}
