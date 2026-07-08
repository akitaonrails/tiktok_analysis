package X;

import Y.ACListenerS88S0300000_24;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS57S0300000_24;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.touchpoint.core.bottomtabbubble.CoinTabViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619460sFE extends AbstractC1592930rYR implements InterfaceC724530SbT {
    public boolean LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public final C01GW LLJJIJI;
    public C446700HfQ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    @Override // X.AbstractC1592930rYR
    public final void LIZJ(int i, boolean z) {
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJI() {
        return null;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJII() {
        return null;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJIIIZ() {
        return null;
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJI() {
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJJ() {
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJJLI() {
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJI() {
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIJ() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJIIIIZZ() {
        SmartImageView smartImageView = new SmartImageView(this.LL.getContext());
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        if ((C303940Bvk.LIZ() && !C303950Bvl.LIZ()) || C14LC.LJIIL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams.gravity = 49;
        C786410Ut5.G6(smartImageView, layoutParams);
        return smartImageView;
    }

    @Override // X.AbstractC1592930rYR
    public final TuxTextView LJIIJ() {
        TuxTextView tuxTextView = new TuxTextView(this.LL.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(LJIILLIIL(false));
        tuxTextView.setLetterSpacing(0.01f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setGravity(17);
        tuxTextView.setSingleLine(true);
        tuxTextView.setText(this.LLILZ.LIZJ);
        return tuxTextView;
    }

    public final C1295960jpS LJJIJLIJ() {
        C1295960jpS c1295960jpS = new C1295960jpS(this.LL.getContext());
        c1295960jpS.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c1295960jpS.setRepeatCount(3);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        if ((C303940Bvk.LIZ() && !C303950Bvl.LIZ()) || C14LC.LJIIL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) + iLIZIZ, iLIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        layoutParams.gravity = 49;
        C786410Ut5.s6(c1295960jpS, layoutParams);
        C786410Ut5.LLD(8, c1295960jpS);
        return c1295960jpS;
    }

    public final TuxIconDrawable LJJIZ() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LIZ = R.raw.icon_gift_fill;
        c419910GdJ.LIZLLL = Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, "#FFD464"));
        return c419910GdJ.LIZ(this.LL.getContext());
    }

    public final void LJJJIL() {
        C1295960jpS tabLottieIcon = this.LL.getTabLottieIcon();
        if (tabLottieIcon != null) {
            tabLottieIcon.pauseAnimation();
            tabLottieIcon.clearAnimation();
            C786410Ut5.LLD(8, tabLottieIcon);
        }
        ImageView tabIcon = this.LL.getTabIcon();
        if (tabIcon != null) {
            C786410Ut5.LJZI(0, tabIcon);
        }
    }

    public final void LJJJJ() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZIZ);
        if (Intrinsics.LJFF("INCENTIVE_COIN", tabChangeManagerLIZ.CQ2())) {
            return;
        }
        TabChangeManager.xQ2(tabChangeManagerLIZ, "INCENTIVE_COIN", false, null, 30);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return C0J3E.LL.getLifecycleRegistry();
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIJIL() {
        String str;
        LJIILIIL();
        LJIILL();
        C1592290rXP c1592290rXP = this.LLILZ.LIZLLL;
        C1593140rYm c1593140rYm = this.LLILLJJLI == EnumC1571190qzN.DARK ? LJIJ() ? c1592290rXP.LIZIZ : c1592290rXP.LIZLLL : LJIJ() ? c1592290rXP.LIZ : c1592290rXP.LIZJ;
        C1592950rYT c1592950rYT = this.LL;
        Integer numLIZJ = C1308910kAL.LIZJ(c1593140rYm.LIZIZ, c1592950rYT.getContext());
        c1592950rYT.setTitleTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        c1592950rYT.setTitleTuxFont(LJIILLIIL(false));
        final CoinBottomTab coinBottomTab = (CoinBottomTab) C1874850yt9.LIZ(29, CoinBottomTab.class);
        if (coinBottomTab == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text -- ");
        Title title = coinBottomTab.title;
        sbLIZ.append(title != null ? title.text : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1592950rYT c1592950rYT2 = this.LL;
        Title title2 = coinBottomTab.title;
        if (title2 == null || (str = title2.text) == null) {
            str = "";
        }
        c1592950rYT2.setTitleText(str);
        ImageView tabIcon = this.LL.getTabIcon();
        if (tabIcon != null && !Intrinsics.LJFF(this.LLJJI, coinBottomTab.iconURL)) {
            if (!((Keva) this.LLJJIJIL.getValue()).getBoolean("bottom_tab_load_success", false)) {
                this.LL.setTabIconImageDrawable(LJJIZ());
            }
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            int i = coinBottomTab.LIZ;
            Integer num = coinBottomTab.LIZJ;
            c1893680zNW.getClass();
            C1893680zNW.LJIIJJI(i, num);
            String str2 = coinBottomTab.iconURL;
            this.LLJJI = str2;
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJI(tabIcon);
            c1331670kl3LJIIIZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIZ.LJJJJJ = "coin_bottom_tab";
            c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0sFF
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    int iIntValue;
                    String message;
                    C1619460sFE c1619460sFE = this.LL;
                    c1619460sFE.LL.setTabIconImageDrawable(c1619460sFE.LJJIZ());
                    C1619460sFE c1619460sFE2 = this.LL;
                    CoinBottomTab coinBottomTab2 = coinBottomTab;
                    c1619460sFE2.getClass();
                    C1619460sFE.LJJJ(coinBottomTab2, "1");
                    C1893680zNW c1893680zNW2 = C1893680zNW.LIZ;
                    CoinBottomTab coinBottomTab3 = coinBottomTab;
                    int i2 = coinBottomTab3.LIZ;
                    Integer num2 = coinBottomTab3.LIZJ;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(uri);
                    sbLIZ2.append('_');
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "";
                    }
                    sbLIZ2.append(message);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c1893680zNW2.getClass();
                    C1893680zNW.LIZ(0, i2, iIntValue, 1, strLIZIZ);
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    int iIntValue;
                    C1619460sFE c1619460sFE = this.LL;
                    CoinBottomTab coinBottomTab2 = coinBottomTab;
                    c1619460sFE.getClass();
                    C1619460sFE.LJJJ(coinBottomTab2, "1");
                    ((Keva) this.LL.LLJJIJIL.getValue()).storeBoolean("bottom_tab_load_success", true);
                    C1893680zNW c1893680zNW2 = C1893680zNW.LIZ;
                    CoinBottomTab coinBottomTab3 = coinBottomTab;
                    int i2 = coinBottomTab3.LIZ;
                    Integer num2 = coinBottomTab3.LIZJ;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    c1893680zNW2.getClass();
                    C1893680zNW.LIZ(1, i2, iIntValue, 1, "");
                }
            });
        }
        String str3 = coinBottomTab.lottieUrl;
        if (str3 == null || str3.length() == 0 || Intrinsics.LJFF(coinBottomTab.lottieUrl, this.LLJJIII)) {
            String str4 = coinBottomTab.lottieUrl;
            if (str4 == null || str4.length() == 0) {
                LJJJIL();
                return;
            }
            return;
        }
        if (((Number) C260590AJd.LIZ.getValue()).intValue() != -1) {
            C0CN5.LIZJ(Long.valueOf(((Number) r2.getValue()).intValue()), new ARunnableS93S0200000_24(this, coinBottomTab, 40), false);
        } else {
            LJJIL(coinBottomTab);
        }
    }

    public C1619460sFE(C1592950rYT c1592950rYT) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        super(c1592950rYT);
        this.LLJJI = "";
        this.LLJJIII = "";
        this.LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(454));
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CoinTabViewModel.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(548);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        C736950SvV c736950SvV = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS264S0000000_24, null, null, null);
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(453));
        LJJIJIL();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c736950SvV.getValue(), new C2217381BqS() { // from class: X.0sFI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1619520sFK) obj).LL);
            }
        }, null, new AwS638S0100000_24(this, 122), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c736950SvV.getValue(), new C2217381BqS() { // from class: X.0sFJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1619520sFK) obj).LLILLL);
            }
        }, null, new AwS638S0100000_24(this, 123), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c736950SvV.getValue(), new C2217381BqS() { // from class: X.0sFL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1619520sFK) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 124), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c736950SvV.getValue(), new C2217381BqS() { // from class: X.0sFM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1619520sFK) obj).LLILZ;
            }
        }, null, new AwS638S0100000_24(this, 125), 6);
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
        if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, enumC1571190qzN, false)) {
            LJJIJIL();
        }
    }

    public final void LJJIL(final CoinBottomTab coinBottomTab) {
        System.currentTimeMillis();
        if (!this.LLJILLL) {
            C1295960jpS c1295960jpSLJJIJLIJ = LJJIJLIJ();
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.LLIZLLLIL = c1295960jpSLJJIJLIJ;
            c1592950rYT.addView(c1295960jpSLJJIJLIJ);
            this.LLJILLL = true;
        }
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        int i = coinBottomTab.LIZ;
        Integer num = coinBottomTab.LIZJ;
        c1893680zNW.getClass();
        C1893680zNW.LJIIJJI(i, num);
        final C1295960jpS tabLottieIcon = this.LL.getTabLottieIcon();
        if (tabLottieIcon != null) {
            ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
            if (iSpecActService != null) {
                iSpecActService.LJJJJI();
            }
            C1900090zXr c1900090zXr = (C1900090zXr) this.LLJJIJI.getValue();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            c1900090zXr.LIZ("coin_bottom_tab_lottie", coinBottomTab.lottieUrl, coinBottomTab.lottieMd5, new InterfaceC1900110zXt() { // from class: X.0sFG
                @Override // X.InterfaceC1900110zXt
                public final void LIZ(Throwable th) {
                    int iIntValue;
                    this.LIZ.LJJJIL();
                    C1893680zNW c1893680zNW2 = C1893680zNW.LIZ;
                    CoinBottomTab coinBottomTab2 = coinBottomTab;
                    int i2 = coinBottomTab2.LIZ;
                    Integer num2 = coinBottomTab2.LIZJ;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(coinBottomTab.lottieUrl);
                    sbLIZ.append('_');
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    sbLIZ.append(message);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1893680zNW2.getClass();
                    C1893680zNW.LIZ(0, i2, iIntValue, 1, strLIZIZ);
                }

                @Override // X.InterfaceC1900110zXt
                public final void LIZIZ(int i2) {
                    this.LIZ.LLJJIII = coinBottomTab.lottieUrl;
                    C786410Ut5.LLD(0, tabLottieIcon);
                    ImageView tabIcon = this.LIZ.LL.getTabIcon();
                    if (tabIcon != null) {
                        C786410Ut5.LJZI(8, tabIcon);
                    }
                    C1900090zXr c1900090zXr2 = (C1900090zXr) this.LIZ.LLJJIJI.getValue();
                    CoinBottomTab coinBottomTab2 = coinBottomTab;
                    C0VSP c0vspLIZJ = c1900090zXr2.LIZJ("coin_bottom_tab_lottie", coinBottomTab2.lottieMd5, coinBottomTab2.lottieName);
                    final C1619460sFE c1619460sFE = this.LIZ;
                    final C1295960jpS c1295960jpS = tabLottieIcon;
                    CoinBottomTab coinBottomTab3 = coinBottomTab;
                    String str = coinBottomTab3.lottieName;
                    final int i3 = coinBottomTab3.playTimes;
                    c1619460sFE.getClass();
                    C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(c0vspLIZJ, str);
                    c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0sFH
                        @Override // X.InterfaceC1292040jj8
                        public final void onResult(Object obj) {
                            c1295960jpS.setRepeatCount(i3);
                            c1295960jpS.setComposition((C1294720jnS) obj);
                            c1295960jpS.playAnimation();
                            CoinBottomTab coinBottomTab4 = (CoinBottomTab) C1874850yt9.LIZ(29, CoinBottomTab.class);
                            if (coinBottomTab4 != null) {
                                c1619460sFE.getClass();
                                C1619460sFE.LJJJ(coinBottomTab4, "2");
                            }
                        }
                    });
                    c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0sFN
                        @Override // X.InterfaceC1292040jj8
                        public final void onResult(Object obj) {
                            c1619460sFE.LJJJIL();
                        }
                    });
                }
            });
        }
    }

    public final void LJJJI(BottomTabBubble bottomTabBubble) {
        AbstractC1896090zRP abstractC1896090zRP;
        Activity activityLJIILL;
        String str;
        String str2;
        GradientDrawable.Orientation orientation;
        View contentView;
        if (bottomTabBubble == null) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            bottomTabBubble = (BottomTabBubble) C2178808gE.LIZ().LJ(36);
            if (bottomTabBubble == null) {
                return;
            }
        }
        if (bottomTabBubble.LIZ() && !C1619800sFm.LIZIZ.LJIILIIL() && (abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)) != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
            C446700HfQ c446700HfQ = new C446700HfQ(activityLJIILL);
            this.LLJJIJIIJIL = c446700HfQ;
            C1592950rYT c1592950rYT = this.LL;
            TextView textView = (TextView) c446700HfQ.getContentView().findViewById(R.id.cbv);
            Title title = bottomTabBubble.title;
            int[] iArrLLII = null;
            String str3 = null;
            if (title != null) {
                str = title.text;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = (TextView) c446700HfQ.getContentView().findViewById(R.id.cbv);
            C0SVC c0svc = C0SVC.LIZ;
            Title title2 = bottomTabBubble.title;
            if (title2 != null) {
                str2 = title2.color;
            } else {
                str2 = null;
            }
            textView2.setTextColor(C0SVC.LIZIZ(c0svc, str2));
            View viewFindViewById = c446700HfQ.getContentView().findViewById(R.id.cbv);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i = bottomTabBubble.gradientType;
            if (i == 0) {
                List<String> list = bottomTabBubble.backgroundColor;
                if (list != null && list.size() >= 1) {
                    List<String> list2 = bottomTabBubble.backgroundColor;
                    if (list2 != null) {
                        str3 = (String) ListProtector.get(list2, 0);
                    }
                    gradientDrawable.setColor(C0SVC.LIZIZ(c0svc, str3));
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                            } else {
                                orientation = GradientDrawable.Orientation.TR_BL;
                            }
                        } else {
                            orientation = GradientDrawable.Orientation.TL_BR;
                        }
                    } else {
                        orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    }
                } else {
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                }
                List<String> list3 = bottomTabBubble.backgroundColor;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<String> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, it2.next())));
                    }
                    iArrLLII = C13LP.LLII(arrayList);
                }
                gradientDrawable.setColors(iArrLLII);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setShape(0);
                gradientDrawable.setOrientation(orientation);
            }
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(14));
            viewFindViewById.setBackground(gradientDrawable);
            C01U6.LIZIZ(new AwS425S0200000_24((TuxIconView) c446700HfQ.getContentView().findViewById(R.id.cbw), bottomTabBubble, 56));
            C786410Ut5.Ob(c446700HfQ.getContentView(), 0.3f);
            C786410Ut5.pc(c446700HfQ.getContentView(), 0.3f);
            C786410Ut5.T4(c446700HfQ.getContentView(), 0.0f);
            c446700HfQ.showAtLocation(c1592950rYT, 0, -10000, -10000);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(c446700HfQ);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            HandlerHook.viewPost(c1592950rYT, new ARunnableS57S0300000_24(c1592950rYT, c446700HfQ, bottomTabBubble, 13));
            C786410Ut5.LJLIIL(((long) bottomTabBubble.disappearCountDown) * 1000, new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(c446700HfQ, 163));
            C446700HfQ c446700HfQ2 = this.LLJJIJIIJIL;
            if (c446700HfQ2 != null && (contentView = c446700HfQ2.getContentView()) != null) {
                C786410Ut5.I7(new ACListenerS88S0300000_24(bottomTabBubble, this, activityLJIILL, 4), contentView);
            }
            C710890RuZ.LIZ.LJ("_type_bottom_tab_bubble");
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = bottomTabBubble.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i2, linkedHashMap, null, null, null, "");
        }
    }

    public static void LJJJ(CoinBottomTab coinBottomTab, String str) {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = coinBottomTab.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("notification_name", coinBottomTab.notificationName);
        linkedHashMap.put("sub_type", str);
        c1894320zOY.getClass();
        C1894320zOY.LJIJJ(i, linkedHashMap, null, null, null, "");
    }

    @Override // X.AbstractC1592930rYR
    public final boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z) {
        EnumC1571190qzN enumC1571190qzN2 = this.LLILLJJLI;
        if (enumC1571190qzN2 == enumC1571190qzN || enumC1571190qzN2 == enumC1571190qzN) {
            return false;
        }
        this.LLILLJJLI = enumC1571190qzN;
        return true;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
