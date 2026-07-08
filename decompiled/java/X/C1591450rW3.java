package X;

import Y.AAListenerS334S0100000_24;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS13S0201000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.experiment.TabUIOptConfig;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591450rW3 {
    public final Context LIZ;
    public final C1592450rXf LIZIZ;
    public final FrameLayout LIZJ;
    public final InterfaceC1589880rTW LIZLLL;
    public final boolean LJ;
    public final ITabStrip LJFF;
    public boolean LJI;
    public TuxIconView LJIIIIZZ;
    public final boolean LJIIIZ;
    public MainBusinessAbility LJIIJ;
    public int LJII = R.drawable.bvr;
    public boolean LJIIJJI = true;

    public final void LIZLLL() {
        TuxIconView tuxIconView = this.LJIIIIZZ;
        if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
            return;
        }
        TuxIconView tuxIconView2 = this.LJIIIIZZ;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        Function1<Boolean, Unit> backToFirstIconVisibilityListener = this.LIZIZ.getBackToFirstIconVisibilityListener();
        if (backToFirstIconVisibilityListener != null) {
            backToFirstIconVisibilityListener.invoke(Boolean.FALSE);
        }
    }

    public final int LIZJ() {
        Boolean bool;
        int width;
        TabUIOptConfig tabUIOptConfigLIZJ = C1591480rW6.LIZJ();
        if (tabUIOptConfigLIZJ == null || (bool = tabUIOptConfigLIZJ.topTabUiOptBackToFirstButton) == null || !bool.booleanValue()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-16));
        }
        View viewLJIILJJIL = this.LIZIZ.LJIILJJIL(r1.getTabCount() - 1);
        return (viewLJIILJJIL == null || (width = viewLJIILJJIL.getWidth()) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-24)) : -width;
    }

    public final void LJ() {
        TuxIconView tuxIconView;
        ViewGroup viewGroup;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("makeBackIconViewVisible:  ");
        TuxIconView tuxIconView2 = this.LJIIIIZZ;
        sbLIZ.append(tuxIconView2 != null ? Integer.valueOf(tuxIconView2.getVisibility()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        FrameLayout frameLayout = this.LIZJ;
        if ((frameLayout != null ? frameLayout.getChildCount() : 0) > 0 && ((tuxIconView = this.LJIIIIZZ) == null || tuxIconView.getParent() == null)) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            TuxIconView tuxIconView3 = new TuxIconView(this.LIZ, null, 0, 6, null);
            tuxIconView3.setIconWidth(iLIZIZ);
            tuxIconView3.setIconHeight(iLIZIZ);
            TabUIOptConfig tabUIOptConfigLIZJ = C1591480rW6.LIZJ();
            if (((tabUIOptConfigLIZJ == null || (bool = tabUIOptConfigLIZJ.topTabUiOptBackToFirstButton) == null) ? false : bool.booleanValue()) && C1591480rW6.LIZ() != 2 && C1591480rW6.LIZ() != 3) {
                HandlerHook.viewPost(tuxIconView3, new ARunnableS13S0201000_6(this, iLIZIZ, tuxIconView3, 9));
            } else if (this.LJIIIZ) {
                tuxIconView3.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
            } else {
                tuxIconView3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0, 0);
            }
            int iLIZ = C1591480rW6.LIZ();
            int i = R.drawable.bvp;
            if (iLIZ == 2) {
                this.LJII = R.drawable.bvq;
                if (!this.LJI) {
                    i = R.drawable.bvq;
                }
                tuxIconView3.setImageResource(i);
                tuxIconView3.getDrawable().setAutoMirrored(true);
            } else if (C1591480rW6.LIZ() == 3) {
                this.LJII = R.drawable.bvr;
                if (!this.LJI) {
                    i = R.drawable.bvr;
                }
                tuxIconView3.setImageResource(i);
                LIZIZ(tuxIconView3, this.LJI);
                tuxIconView3.getDrawable().setAutoMirrored(true);
            } else {
                tuxIconView3.setIconRes(R.raw.icon_chevron_right_circle_ltr);
                LIZIZ(tuxIconView3, this.LJI);
            }
            tuxIconView3.setAdjustViewBounds(true);
            tuxIconView3.setClickable(true);
            tuxIconView3.setFocusable(true);
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            tuxIconView3.setTintColorRes(R.attr.bx);
            tuxIconView3.setId(R.id.jqj);
            FrameLayout.LayoutParams layoutParams = C1581510rG1.LIZ() ? new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) : new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            if (!C1581510rG1.LIZ() && (C1591480rW6.LIZ() == 2 || C1591480rW6.LIZ() == 3)) {
                layoutParams.setMarginEnd(-C341940Daq.LIZ(4.0d));
                FrameLayout frameLayout2 = this.LIZJ;
                ViewParent parent = frameLayout2 != null ? frameLayout2.getParent() : null;
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setClipChildren(false);
                }
            }
            C786410Ut5.M6(tuxIconView3, layoutParams);
            C786410Ut5.a9(tuxIconView3, new ACListenerS126S0200000_24(this, tuxIconView3, 26));
            C2271391DvN.LIZ(tuxIconView3, (C1A5L) C2271381DvM.LJJJJJL.getValue());
            this.LJIIIIZZ = tuxIconView3;
            FrameLayout frameLayout3 = this.LIZJ;
            if (frameLayout3 != null) {
                frameLayout3.addView(tuxIconView3);
            }
        }
        TuxIconView tuxIconView4 = this.LJIIIIZZ;
        if (tuxIconView4 == null || tuxIconView4.getVisibility() != 0) {
            if (C1581510rG1.LJ()) {
                TuxIconView tuxIconView5 = this.LJIIIIZZ;
                if (tuxIconView5 != null) {
                    ObjectAnimator objectAnimatorLIZ = C1593710rZh.LIZ(tuxIconView5);
                    objectAnimatorLIZ.addListener(new AAListenerS334S0100000_24(this, 7));
                    C786410Ut5.Pd(objectAnimatorLIZ);
                }
            } else {
                TuxIconView tuxIconView6 = this.LJIIIIZZ;
                if (tuxIconView6 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
                }
            }
            C20684815ws.onEventV3("show_return_hot_icon");
            Function1<Boolean, Unit> backToFirstIconVisibilityListener = this.LIZIZ.getBackToFirstIconVisibilityListener();
            if (backToFirstIconVisibilityListener != null) {
                backToFirstIconVisibilityListener.invoke(Boolean.TRUE);
            }
        }
    }

    public final void LIZ(boolean z) {
        Drawable drawable;
        this.LJI = z;
        if (z) {
            TuxIconView tuxIconView = this.LJIIIIZZ;
            if (tuxIconView != null) {
                tuxIconView.setImageResource(R.drawable.bvp);
            }
        } else if (C1591480rW6.LIZ() != 2 && C1591480rW6.LIZ() != 3) {
            TuxIconView tuxIconView2 = this.LJIIIIZZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_chevron_right_circle_ltr);
            }
        } else {
            TuxIconView tuxIconView3 = this.LJIIIIZZ;
            if (tuxIconView3 != null) {
                tuxIconView3.setImageResource(this.LJII);
            }
        }
        TuxIconView tuxIconView4 = this.LJIIIIZZ;
        if (tuxIconView4 != null && (drawable = tuxIconView4.getDrawable()) != null) {
            drawable.setAutoMirrored(true);
        }
        TuxIconView tuxIconView5 = this.LJIIIIZZ;
        if (tuxIconView5 != null) {
            LIZIZ(tuxIconView5, z);
        }
    }

    public static void LIZIZ(TuxIconView tuxIconView, boolean z) {
        if (!C1581510rG1.LIZ()) {
            return;
        }
        int iLIZ = C1591480rW6.LIZ();
        if (iLIZ != 0) {
            if (iLIZ == 3) {
                if (z) {
                    C426750GoL.LJIIL(tuxIconView, 0, 0, 0, 0, 16);
                    return;
                } else {
                    C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                    return;
                }
            }
            return;
        }
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
    }

    public final void LJFF(int i, boolean z) {
        if (!this.LJIIJJI) {
            return;
        }
        if (C296130Bj9.LIZ()) {
            View viewLJIILJJIL = this.LIZIZ.LJIILJJIL(this.LJFF.Km2());
            if (viewLJIILJJIL != null) {
                int width = viewLJIILJJIL.getWidth();
                int width2 = this.LIZIZ.getWidth();
                int right = viewLJIILJJIL.getRight();
                int i2 = right - width2;
                if (!this.LJIIIZ) {
                    if (!z && i2 > 0 && i2 >= LIZJ() + width && (i2 - i) - width >= LIZJ()) {
                        LJ();
                        return;
                    } else {
                        LIZLLL();
                        return;
                    }
                }
                if (!z && i > 0 && i > right + LIZJ()) {
                    LJ();
                    return;
                } else {
                    LIZLLL();
                    return;
                }
            }
            return;
        }
        View viewLJIILJJIL2 = this.LIZIZ.LJIILJJIL(r1.getTabCount() - 1);
        if (viewLJIILJJIL2 == null) {
            return;
        }
        int tabLayoutScrollRange = this.LIZIZ.getTabLayoutScrollRange();
        int width3 = viewLJIILJJIL2.getWidth();
        if (!this.LJIIIZ) {
            if (!z && tabLayoutScrollRange > 0 && tabLayoutScrollRange >= LIZJ() + width3 && (tabLayoutScrollRange - i) - width3 >= LIZJ()) {
                LJ();
                return;
            } else {
                LIZLLL();
                return;
            }
        }
        if (!z && tabLayoutScrollRange > 0 && tabLayoutScrollRange > LIZJ() + width3 && i - width3 > LIZJ()) {
            LJ();
        } else {
            LIZLLL();
        }
    }

    public final void LJI(boolean z, boolean z2) {
        this.LJIIJJI = z;
        if (z) {
            if (z2) {
                int scrollX = this.LIZIZ.getScrollX();
                this.LIZIZ.getScrollY();
                LJFF(scrollX, false);
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        LIZLLL();
    }

    public C1591450rW3(C19EG c19eg, C1592450rXf c1592450rXf, C705890RmV c705890RmV, InterfaceC1589880rTW interfaceC1589880rTW, boolean z, ITabStrip iTabStrip) {
        this.LIZ = c19eg;
        this.LIZIZ = c1592450rXf;
        this.LIZJ = c705890RmV;
        this.LIZLLL = interfaceC1589880rTW;
        this.LJ = z;
        this.LJFF = iTabStrip;
        this.LJIIIZ = C444960Hcc.LIZJ(c19eg);
    }
}
