package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20286814Zm extends AbstractC19368810q6 implements C0SUN, C0J0Y {
    public static final float LJJLIL = C418440Gaw.LIZIZ(2);
    public static final float LJJLJ = C418440Gaw.LIZIZ(30);
    public static final float LJJLJLI = C418440Gaw.LIZIZ(150);
    public float LIZIZ;
    public float LIZJ;
    public Function1<? super Float, Unit> LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C20293414aq LJI;
    public AwS574S0100000_30 LJII;
    public CellAdaptionComponentAbility LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public final float LJIJI;
    public boolean LJIJJ;
    public AwS609S0100000_30 LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public C0J0X LJJIIJ;
    public Context LJJIIJZLJL;
    public InterfaceC665370Q7z LJJIIZ;
    public SmartImageView LJJIIZI;
    public GradientDrawable LJJIJ;
    public View LJJIJIIJI;
    public SmartImageView LJJIJIIJIL;
    public View LJJIJIL;
    public View LJJIJL;
    public View LJJIJLIJ;
    public View LJJIL;
    public View LJJIZ;
    public View LJJJ;
    public View LJJJI;
    public View LJJJIL;
    public View LJJJJ;
    public View LJJJJI;
    public InterfaceC20289314aB LJJJJIZL;
    public View LJJJJJ;
    public View LJJJJJL;
    public View LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public Aweme LJJJJZI;
    public String LJJJLIIL;
    public InterfaceC20289914aH LJJJLL;
    public final float LJJJLZIJ;
    public final float LJJJZ;
    public boolean LJJL;
    public String LJJLI;
    public boolean LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public HomePageViewPagerAbility LJJLIIIJILLIZJL;
    public HomeViewPagerAbility LJJLIIIJJI;
    public C20288314a1 LJJLIIIJJIZ;
    public C20288414a2 LJJLIIIJL;
    public InterfaceC20286314Zh LJJLIIIJLJLI;
    public InterfaceC1049140dPM LJJLIIIJLLLLLLLZ;
    public ValueAnimator LJJLIIJ;

    public final void LJIJI() {
        LJI(false);
        LJJIIJ(this.LJJIJIIJI, 0.0f);
        InterfaceC1049140dPM interfaceC1049140dPM = this.LJJLIIIJLLLLLLLZ;
        LJJIIJ(interfaceC1049140dPM != null ? interfaceC1049140dPM.LIZ() : null, 0.0f);
        View view = this.LJJIJIL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        View view2 = this.LJJIJL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        View view3 = this.LJJIJLIJ;
        if (view3 != null) {
            C786410Ut5.T4(view3, 1.0f);
        }
        View view4 = this.LJJIL;
        if (view4 != null) {
            C786410Ut5.T4(view4, 1.0f);
        }
        View view5 = this.LJJIZ;
        if (view5 != null) {
            C786410Ut5.T4(view5, 1.0f);
        }
        LJIIJJI(false, true);
        View view6 = this.LJJJJ;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(4, view6);
        }
        View view7 = this.LJJJJ;
        if (view7 != null) {
            view7.setClickable(false);
        }
        C0J0X c0j0x = this.LJJIIJ;
        if (c0j0x != null) {
            C786410Ut5.U4(c0j0x, 0.0f);
        }
        LJJII(0.0f);
    }

    public final void LJJI() {
        this.LJJJJZ = false;
        this.LJJJJLL = false;
        LJI(false);
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LJJJJZI;
        c20285414YyLIZ.LJII(aweme != null ? aweme.getAid() : null, new C14Z2(C20286114Zf.LIZ(this.LJJJJZI) ? C14Z5.COMMON_BACKGROUND_LYNX.getType() : C14Z5.BACKGROUND.getType(), this.LJIJJ));
        LJIJI();
    }

    public final boolean LJIIJ() {
        SmartImageView smartImageView;
        Aweme aweme;
        View view;
        VideoMaskInfo reportMaskInfo;
        if ((!Intrinsics.LJFF(this.LJJJLIIL, "homepage_hot") && !C2277711EDh.LIZIZ.LIZLLL(this.LJJJLIIL) && !Intrinsics.LJFF(this.LJJJLIIL, "others_homepage")) || !this.LJJIII || !this.LJJJJZ || this.LJIIIZ <= 0.0f || this.LJJJJZI == null || (((smartImageView = this.LJJIJIIJIL) != null && smartImageView.getVisibility() == 0) || ((aweme = this.LJJJJZI) != null && aweme.getAwemeType() == 40))) {
            return false;
        }
        Aweme aweme2 = this.LJJJJZI;
        if ((aweme2 != null && (reportMaskInfo = aweme2.getReportMaskInfo()) != null && Intrinsics.LJFF(reportMaskInfo.showMask, Boolean.TRUE)) || ((view = this.LJJJJI) != null && view.getVisibility() == 0)) {
            return false;
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return (C586380MzE.LIZ().LIZJ(this.LJJJLIIL) && C0COM.LIZ()) ? false : true;
    }

    public final float LJIIL() {
        float f;
        float f2;
        if (this.LJJL) {
            f = this.LJIIIZ + this.LJIJI;
            f2 = this.LJIIJ;
        } else {
            f = this.LJIIIZ;
            f2 = this.LJIIJ;
        }
        return f + f2;
    }

    public final float LJIILIIL() {
        if (!this.LJJLIIIIJ) {
            return LJIIL();
        }
        if (this.LJ) {
            return LJIIL() + (this.LIZJ / 2);
        }
        return ((int) ((this.LJIILJJIL * this.LJIIJJI) / 2)) + LJIIL();
    }

    public final float LJIILJJIL() {
        float f = this.LJIIJJI;
        return f == 0.0f ? this.LJIILIIL : this.LIZJ / f;
    }

    public final float LJIILL() {
        float f = this.LJIIL;
        return f == 0.0f ? this.LJIILJJIL : this.LIZIZ / f;
    }

    public final void LJIIZILJ() {
        if (!this.LJIJJ) {
            HomePageViewPagerAbility homePageViewPagerAbility = this.LJJLIIIJILLIZJL;
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.LLIFFJFJJ(true);
                return;
            }
            return;
        }
        this.LJIIJJI = this.LJJIJIIJI != null ? r0.getMeasuredHeight() : 0.0f;
        this.LJIIL = this.LJJIJIIJI != null ? r0.getMeasuredWidth() : 0.0f;
        this.LJIILIIL = LJIILJJIL();
        this.LJIILJJIL = LJIILL();
        HomePageViewPagerAbility homePageViewPagerAbility2 = this.LJJLIIIJILLIZJL;
        if (homePageViewPagerAbility2 != null) {
            homePageViewPagerAbility2.LLIFFJFJJ(false);
        }
        if (this.LJJLIIIIJ) {
            LJJIIJ(this.LJJIJIIJI, 1.0f);
            InterfaceC1049140dPM interfaceC1049140dPM = this.LJJLIIIJLLLLLLLZ;
            LJJIIJ(interfaceC1049140dPM != null ? interfaceC1049140dPM.LIZ() : null, 1.0f);
        }
    }

    public final void LJIJ() {
        if (this.LJIJJ) {
            View view = this.LJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LJJJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = this.LJJJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        }
        HomePageViewPagerAbility homePageViewPagerAbility = this.LJJLIIIJILLIZJL;
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.LLIFFJFJJ(true);
        }
    }

    public final void LJIJJLI() {
        View viewLIZ;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY2;
        View view = this.LJJIJIIJI;
        if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null && (viewPropertyAnimatorTranslationY2 = viewPropertyAnimatorAnimate2.translationY(-(this.LJIIIZ + this.LJIIJ))) != null) {
            viewPropertyAnimatorTranslationY2.start();
        }
        InterfaceC1049140dPM interfaceC1049140dPM = this.LJJLIIIJLLLLLLLZ;
        if (interfaceC1049140dPM == null || (viewLIZ = interfaceC1049140dPM.LIZ()) == null || (viewPropertyAnimatorAnimate = viewLIZ.animate()) == null || (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate.translationY(-(this.LJIIIZ + this.LJIIJ))) == null) {
            return;
        }
        viewPropertyAnimatorTranslationY.start();
    }

    public final void LJJIII() {
        View view;
        View view2;
        View view3;
        View view4 = this.LJJJ;
        if ((view4 != null && view4.getVisibility() == 0) && (view3 = this.LJJJ) != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        View view5 = this.LJJJI;
        if (view5 != null && view5.getVisibility() == 0 && (view2 = this.LJJJI) != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        View view6 = this.LJJJIL;
        if (view6 == null || view6.getVisibility() != 0 || (view = this.LJJJIL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view);
    }

    public C20286814Zm() {
        FeedDescSeeMoreConfig feedDescSeeMoreConfig;
        this.LIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(C0HCN.LIZ() ? 60 : 120));
        this.LIZJ = C418440Gaw.LIZIZ(Integer.valueOf(C0HCN.LIZ() ? 80 : 160));
        this.LJI = new C20293414aq("video_scale");
        this.LJIILIIL = -1.0f;
        this.LJIILJJIL = -1.0f;
        this.LJIJ = C293910BfZ.LIZJ ? 0.0f : C418440Gaw.LIZIZ(8);
        this.LJIJI = C418440Gaw.LIZIZ(Double.valueOf(56.0d));
        this.LJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 461));
        this.LJJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 460));
        this.LJJJLIIL = "";
        float f = 0.18f;
        try {
            feedDescSeeMoreConfig = (FeedDescSeeMoreConfig) C715940S6m.LIZ.getValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            feedDescSeeMoreConfig = new FeedDescSeeMoreConfig(0, 0.18f);
        }
        if (feedDescSeeMoreConfig != null) {
            float f2 = feedDescSeeMoreConfig.opacity;
            if (0.18f <= f2 && f2 <= 0.7f) {
                f = f2;
            }
        }
        this.LJJJLZIJ = f;
        this.LJJJZ = 0.3f;
        this.LJJLI = "";
    }

    @Override // X.C0SUN
    public final boolean LIZJ() {
        return this.LJIJJ;
    }

    @Override // X.C0SUN
    public final boolean LJ() {
        return this.LJJII;
    }

    @Override // X.C0J0Y
    public final boolean LIZ(int i) {
        boolean z;
        if (this.LJJLIIIJ) {
            z = false;
        } else {
            z = this.LJIJJ;
        }
        if ((!Intrinsics.LJFF(this.LJJJLIIL, "homepage_hot") && !C2277711EDh.LIZIZ.LIZLLL(this.LJJJLIIL)) || i <= 0 || !z) {
            return false;
        }
        return true;
    }

    @Override // X.C0J0Y
    public final boolean LIZIZ(int i) {
        if (LJIIJ()) {
            if (i < 0) {
                if (!this.LJIJJ) {
                    return false;
                }
                return true;
            }
            if (i <= 0 || this.LJIJJ) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    @Override // X.C0SUN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20286814Zm.LIZLLL(android.view.MotionEvent):void");
    }

    public final void LJFF(float f) {
        C0J0X c0j0x;
        this.LJIIIZ = f;
        View view = this.LJJIJIIJI;
        if (view != null && (c0j0x = this.LJJIIJ) != null) {
            HandlerHook.viewPost(view, new RunnableC20287214Zq(view, c0j0x, this));
        }
    }

    public final void LJI(boolean z) {
        if (this.LJIJJ == z) {
            return;
        }
        this.LJIJJ = z;
        AwS609S0100000_30 awS609S0100000_30 = this.LJIJJLI;
        if (awS609S0100000_30 != null) {
            awS609S0100000_30.invoke(Boolean.valueOf(z));
        }
    }

    public final void LJIIIIZZ(View view) {
        this.LJJJJ = view;
        if (this.LJIJJ) {
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            View view2 = this.LJJJJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        View view3 = this.LJJJJ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view3);
    }

    public final void LJIJJ(boolean z) {
        boolean z2;
        if (!z && !this.LJIJJ) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LJJJJZ = z2;
        this.LJJJJLL = z2;
        if (z) {
            C0J0X c0j0x = this.LJJIIJ;
            if (c0j0x != null) {
                C786410Ut5.LJZ(0, c0j0x);
                return;
            }
            return;
        }
        C0J0X c0j0x2 = this.LJJIIJ;
        if (c0j0x2 == null) {
            return;
        }
        C786410Ut5.LJZ(8, c0j0x2);
    }

    public final void LJIL(int i) {
        C0J0X c0j0x;
        View view = this.LJJIJIIJI;
        if (view != null) {
            C786410Ut5.ed(view, i - (this.LJIIIZ + this.LJIIJ));
        }
        View view2 = this.LJJIJIIJI;
        if (view2 != null && (c0j0x = this.LJJIIJ) != null) {
            HandlerHook.viewPost(view2, new RunnableC20287214Zq(view2, c0j0x, this));
        }
    }

    public final void LJJII(float f) {
        View view;
        ViewOutlineProvider outlineProvider;
        View view2;
        Object parent;
        View view3;
        if (this.LJJIIJZLJL == null) {
            return;
        }
        ViewOutlineProvider outlineProvider2 = null;
        if (this.LJJIJ == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            this.LJJIJ = gradientDrawable;
            if (this.LJJLIIIIJ) {
                View view4 = this.LJJIJIIJI;
                if (view4 != null) {
                    parent = view4.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof FrameLayout) && (view3 = (View) parent) != null) {
                    view3.setForeground(this.LJJIJ);
                }
            } else {
                View view5 = this.LJJIJIIJI;
                if ((view5 instanceof FrameLayout) && view5 != null) {
                    view5.setForeground(gradientDrawable);
                }
            }
        }
        if (this.LJJLIIIJL == null) {
            this.LJJLIIIJL = new C20288414a2(Float.valueOf(this.LJIJ));
        }
        View view6 = this.LJJIJIIJI;
        if (view6 == null || view6.getOutlineProvider() == null || ((view = this.LJJIJIIJI) != null && !view.getClipToOutline())) {
            View view7 = this.LJJIJIIJI;
            if (view7 != null) {
                view7.setOutlineProvider(this.LJJLIIIJL);
            }
            View view8 = this.LJJIJIIJI;
            if (view8 != null) {
                view8.setClipToOutline(true);
            }
        } else if (this.LJFF) {
            View view9 = this.LJJIJIIJI;
            if (view9 != null) {
                outlineProvider = view9.getOutlineProvider();
            } else {
                outlineProvider = null;
            }
            if (outlineProvider instanceof C20288414a2) {
                View view10 = this.LJJIJIIJI;
                if (view10 != null) {
                    outlineProvider2 = view10.getOutlineProvider();
                }
                C20288414a2 c20288414a2 = this.LJJLIIIJL;
                if (outlineProvider2 != c20288414a2 && (view2 = this.LJJIJIIJI) != null) {
                    view2.setOutlineProvider(c20288414a2);
                }
            }
        }
        float f2 = (this.LJIJ * f) / this.LJIILIIL;
        if (this.LJJLIIIIJ) {
            if (this.LJ) {
                if (f == 1.0f) {
                    int i = ((int) (this.LJIIL - ((this.LIZIZ / this.LIZJ) * this.LJIIJJI))) / 2;
                    if (i < 0) {
                        i = 0;
                    }
                    C20288414a2 c20288414a22 = this.LJJLIIIJL;
                    if (c20288414a22 != null) {
                        c20288414a22.LIZJ = i;
                        c20288414a22.LIZLLL = 0;
                    }
                }
            } else if (f == 1.0f) {
                int i2 = ((int) (this.LJIIJJI - ((this.LIZJ / this.LIZIZ) * this.LJIIL))) / 2;
                if (i2 < 0) {
                    i2 = 0;
                }
                C20288414a2 c20288414a23 = this.LJJLIIIJL;
                if (c20288414a23 != null) {
                    c20288414a23.LIZJ = 0;
                    c20288414a23.LIZLLL = i2;
                }
            }
        }
        C20288414a2 c20288414a24 = this.LJJLIIIJL;
        if (c20288414a24 != null) {
            c20288414a24.LIZ = Float.valueOf(f2);
        }
        C20288414a2 c20288414a25 = this.LJJLIIIJL;
        if (c20288414a25 != null) {
            c20288414a25.LIZIZ = f;
        }
        View view11 = this.LJJIJIIJI;
        if (view11 != null) {
            view11.invalidateOutline();
        }
    }

    public final void LJII(Aweme aweme, String str) {
        String aid;
        boolean z;
        this.LJJJJZI = aweme;
        if (str == null) {
            str = "";
        }
        this.LJJJLIIL = str;
        this.LJJJJZ = false;
        this.LJJJJLL = false;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZ(aid) && C14Z4.LIZIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        this.LJI.LJIIJ("[bindData] video is scaling", aweme);
        LJI(z);
        this.LJJL = false;
    }

    public final void LJIIJJI(boolean z, boolean z2) {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        View view = this.LJJIJIL;
        if (view != null) {
            C2180521AVm.LIZ(view, EnumC2180541AVo.V_VISIBLITY, (C1AV2) C1AVH.LJIIJ.getValue());
        }
        View view2 = this.LJJIJL;
        if (view2 != null) {
            C2180521AVm.LIZ(view2, EnumC2180541AVo.V_VISIBLITY, (C1AV2) C1AVH.LJIIJ.getValue());
        }
        if (z) {
            View view3 = this.LJJIJIL;
            if (view3 != null) {
                C2180521AVm.LIZ(view3, EnumC2180541AVo.V_ALPHA, (C1AV2) C1AVH.LJIIJ.getValue());
            }
            View view4 = this.LJJIJL;
            if (view4 != null) {
                C2180521AVm.LIZ(view4, EnumC2180541AVo.V_ALPHA, (C1AV2) C1AVH.LJIIJ.getValue());
            }
            View view5 = this.LJJIJIL;
            if (view5 != null) {
                C786410Ut5.T4(view5, 0.0f);
            }
            View view6 = this.LJJIJL;
            if (view6 != null) {
                C786410Ut5.T4(view6, 0.0f);
            }
            View view7 = this.LJJIJLIJ;
            if (view7 != null) {
                C786410Ut5.T4(view7, 0.0f);
            }
            View view8 = this.LJJIL;
            if (view8 != null) {
                C786410Ut5.T4(view8, 0.0f);
            }
            View view9 = this.LJJIZ;
            if (view9 != null) {
                C786410Ut5.T4(view9, 0.0f);
            }
            View view10 = this.LJJIJIL;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(8, view10);
            }
            View view11 = this.LJJIJL;
            if (view11 != null) {
                C786410Ut5.LJLLLLLL(8, view11);
            }
            View view12 = this.LJJIJLIJ;
            if (view12 != null) {
                C786410Ut5.LJLLLLLL(8, view12);
            }
            View view13 = this.LJJIL;
            if (view13 != null) {
                C786410Ut5.LJLLLLLL(8, view13);
            }
            View view14 = this.LJJIZ;
            if (view14 != null) {
                C786410Ut5.LJLLLLLL(8, view14);
            }
            if (C0COQ.LIZ(this.LJJJLIIL)) {
                View view15 = this.LJJIJIIJI;
                if ((view15 instanceof SurfaceView) && (surfaceView2 = (SurfaceView) view15) != null) {
                    surfaceView2.setZOrderOnTop(true);
                }
            }
            LJJIII();
            LJIILLIIL(this.LJJJJIZL, true);
            return;
        }
        if (C0COQ.LIZ(this.LJJJLIIL)) {
            View view16 = this.LJJIJIIJI;
            if ((view16 instanceof SurfaceView) && (surfaceView = (SurfaceView) view16) != null) {
                surfaceView.setZOrderOnTop(false);
            }
        }
        if (!z2) {
            View view17 = this.LJJIJIL;
            if (view17 != null) {
                C786410Ut5.LJLLLLLL(8, view17);
            }
            View view18 = this.LJJIJL;
            if (view18 != null) {
                C786410Ut5.LJLLLLLL(8, view18);
            }
            View view19 = this.LJJIJLIJ;
            if (view19 != null) {
                C786410Ut5.LJLLLLLL(8, view19);
            }
            View view20 = this.LJJIL;
            if (view20 != null) {
                C786410Ut5.LJLLLLLL(8, view20);
            }
            View view21 = this.LJJIZ;
            if (view21 != null) {
                C786410Ut5.LJLLLLLL(8, view21);
            }
        } else {
            View view22 = this.LJJIJIL;
            if (view22 != null) {
                C786410Ut5.LJLLLLLL(0, view22);
            }
            View view23 = this.LJJIJL;
            if (view23 != null) {
                C786410Ut5.LJLLLLLL(0, view23);
            }
            View view24 = this.LJJIJLIJ;
            if (view24 != null) {
                C786410Ut5.LJLLLLLL(0, view24);
            }
            View view25 = this.LJJIL;
            if (view25 != null) {
                C786410Ut5.LJLLLLLL(0, view25);
            }
            View view26 = this.LJJIZ;
            if (view26 != null) {
                C786410Ut5.LJLLLLLL(0, view26);
            }
        }
        LJIILLIIL(this.LJJJJIZL, false);
    }

    public final void LJIILLIIL(InterfaceC20289314aB interfaceC20289314aB, boolean z) {
        View viewFindViewById;
        View viewFindViewById2;
        if (interfaceC20289314aB != null && interfaceC20289314aB.LIZ() != null) {
            if (interfaceC20289314aB.getScene() != C0RQC.ACE_SURVEY && interfaceC20289314aB.getScene() != C0RQC.AD_EXT_LAYER && interfaceC20289314aB.getScene() != C0RQC.AD_SURVEY) {
                return;
            }
            View viewFindViewById3 = null;
            if (this.LJJJJJ == null) {
                View rootView = interfaceC20289314aB.getRootView();
                if (rootView != null) {
                    viewFindViewById2 = rootView.findViewById(R.id.spark_ad_sticker_view);
                } else {
                    viewFindViewById2 = null;
                }
                this.LJJJJJ = viewFindViewById2;
            }
            if (this.LJJJJJL == null) {
                View rootView2 = interfaceC20289314aB.getRootView();
                if (rootView2 != null) {
                    viewFindViewById = rootView2.findViewById(R.id.hs4);
                } else {
                    viewFindViewById = null;
                }
                this.LJJJJJL = viewFindViewById;
            }
            if (this.LJJJJL == null) {
                View rootView3 = interfaceC20289314aB.getRootView();
                if (rootView3 != null) {
                    viewFindViewById3 = rootView3.findViewById(R.id.ad_feed_card_container);
                }
                this.LJJJJL = viewFindViewById3;
            }
            if (z) {
                View view = this.LJJJJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                View view2 = this.LJJJJJL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                    return;
                }
                return;
            }
            View view3 = this.LJJJJJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            View view4 = this.LJJJJJL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            View view5 = this.LJJJJL;
            if (view5 != null && view5.getVisibility() == 0) {
                View view6 = this.LJJIJL;
                if (view6 != null) {
                    C2180521AVm.LIZ(view6, EnumC2180541AVo.V_VISIBLITY, (C1AV2) C1AVH.LJIIJ.getValue());
                }
                View view7 = this.LJJIJL;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
            }
        }
    }

    public final void LJJIFFI(float f, boolean z) {
        boolean z2;
        View view;
        Function1<? super Float, Unit> function1;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IPausePanelAbility iPausePanelAbility;
        boolean z3;
        float f2 = 1;
        float fMax = Math.max(f2 - ((LJJLJLI * f) / LJJLJ), -0.0f);
        if (fMax > 0.0f) {
            View view2 = this.LJJIJIL;
            if (view2 != null) {
                C786410Ut5.T4(view2, fMax);
            }
            View view3 = this.LJJIJL;
            if (view3 != null) {
                C786410Ut5.T4(view3, fMax);
            }
            View view4 = this.LJJIJLIJ;
            if (view4 != null) {
                C786410Ut5.T4(view4, fMax);
            }
            View view5 = this.LJJIL;
            if (view5 != null) {
                C786410Ut5.T4(view5, fMax);
            }
            View view6 = this.LJJIZ;
            if (view6 != null) {
                C786410Ut5.T4(view6, fMax);
            }
            float f3 = this.LJJJZ * fMax;
            View view7 = this.LJJJ;
            if (view7 != null) {
                C786410Ut5.T4(view7, f3);
            }
            View view8 = this.LJJJI;
            if (view8 != null) {
                C786410Ut5.T4(view8, f3);
            }
            View view9 = this.LJJJIL;
            if (view9 != null) {
                C786410Ut5.T4(view9, f3);
            }
            if (f <= 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIIJJI(false, z3);
        } else {
            if (f <= 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            LJIIJJI(true, z2);
        }
        if (fMax < 0.9d && (interfaceC665370Q7z = this.LJJIIZ) != null && (iPausePanelAbility = (IPausePanelAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPausePanelAbility.class, null)) != null) {
            iPausePanelAbility.NC(true);
        }
        if (f > 0.0f) {
            View view10 = this.LJJJJ;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(0, view10);
            }
            View view11 = this.LJJJJ;
            if (view11 != null) {
                C786410Ut5.T4(view11, f);
            }
        } else {
            View view12 = this.LJJJJ;
            if (view12 != null) {
                C786410Ut5.LJLLLLLL(4, view12);
            }
        }
        if (z && (function1 = this.LIZ) != null) {
            function1.invoke(Float.valueOf(f));
        }
        View view13 = this.LJJJJI;
        if (view13 != null && view13.getVisibility() == 0 && (view = this.LJJJJI) != null) {
            C786410Ut5.T4(view, Math.max(Math.min(this.LJJJLZIJ, f2 - f), 0.0f));
        }
        C0J0X c0j0x = this.LJJIIJ;
        if (c0j0x != null) {
            C786410Ut5.U4(c0j0x, f);
        }
    }

    public final void LJJIIJ(View view, float f) {
        if (view != null) {
            if (this.LJJLIIIIJ) {
                C786410Ut5.ed(view, (-LJIILIIL()) * f);
                if (this.LJ) {
                    float f2 = 1 - f;
                    C786410Ut5.Ob(view, (this.LJIILIIL * f) + f2);
                    C786410Ut5.pc(view, f2 + (this.LJIILIIL * f));
                } else {
                    float f3 = 1 - f;
                    C786410Ut5.Ob(view, (this.LJIILJJIL * f) + f3);
                    C786410Ut5.pc(view, f3 + (this.LJIILJJIL * f));
                }
            } else {
                C786410Ut5.ed(view, (-LJIIL()) * f);
                float f4 = 1 - f;
                C786410Ut5.Ob(view, (this.LJIILIIL * f) + f4);
                C786410Ut5.pc(view, f4 + (this.LJIILIIL * f));
            }
            Function1<? super Float, Unit> function1 = this.LIZLLL;
            if (function1 != null) {
                function1.invoke(Float.valueOf(f));
            }
        }
    }

    public final void LJJ(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.5f, 0.32f, 0.3f, 1.0f));
        valueAnimatorOfFloat.setDuration(Math.max(((long) Math.abs(f2 - f)) * ((long) 500), 400L));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 63));
        if (z) {
            valueAnimatorOfFloat.addListener((C20287014Zo) this.LJIL.getValue());
        } else {
            valueAnimatorOfFloat.addListener((C20287014Zo) this.LJJ.getValue());
        }
        valueAnimatorOfFloat.start();
        this.LJJLIIJ = valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0215  */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.0Ias, X.14a1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r9, X.InterfaceC690490R6p r10, X.C0J0X r11, android.view.View r12, com.bytedance.lighten.loader.SmartImageView r13, android.view.View r14, android.view.View r15, android.view.View r16, android.view.View r17, android.view.View r18, android.view.View r19, android.view.View r20, android.view.View r21, android.view.View r22, X.InterfaceC20289314aB r23, X.InterfaceC1049140dPM r24) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20286814Zm.LJIIIZ(android.content.Context, X.0R6p, X.0J0X, android.view.View, com.bytedance.lighten.loader.SmartImageView, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, X.14aB, X.0dPM):void");
    }
}
