package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391610mJj {
    public static final int LJIILJJIL = ColorProtector.parseColor("#FF00C6E9");
    public static final C0HU6 LJIILL = new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(37.7f));
    public static final List<C19746412Nq> LJIILLIIL = C1697810uHb.LJIIJJI(new C19746412Nq("Show_ScaleX", new C0HIW(0.0f, 1.0f)), new C19746412Nq("Show_ScaleY", new C0HIX(0.0f, 1.0f)), new C19746412Nq("Show_Alpha", new C0HUY(0.0f, 1.0f)));
    public static final List<C19746412Nq> LJIIZILJ = C1697810uHb.LJIIJJI(new C19746412Nq("Dismiss_ScaleX", new C0HIW(1.0f, 0.0f)), new C19746412Nq("Dismiss_ScaleY", new C0HIX(1.0f, 0.0f)), new C19746412Nq("Dismiss_Alpha", new C0HUY(1.0f, 0.0f)));
    public static final C1776900wLA LJIJ = new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75);
    public static final List<C19746412Nq> LJIJI = Collections.singletonList(new C19746412Nq("Show_Alpha", new C0HUY(0.0f, 1.0f)));
    public static final List<C19746412Nq> LJIJJ = Collections.singletonList(new C19746412Nq("Dismiss_Alpha", new C0HUY(1.0f, 0.0f)));
    public final Context LIZ;
    public C1391600mJi LIZIZ;
    public final C0P0T LIZJ;
    public final View LIZLLL;
    public final boolean LJ;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIILIIL;
    public final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1528));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1529));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1530));
    public final C1391620mJk LJIIL = new C1391620mJk();

    public final int LIZ() {
        View rootView;
        if (!this.LJ) {
            return this.LJIILIIL;
        }
        int i = this.LJIILIIL;
        View view = this.LIZIZ.LIZIZ;
        return i + ((view == null || (rootView = view.getRootView()) == null || (rootView.getSystemUiVisibility() & 1024) != 0) ? 0 : C497820Jfg.LIZJ(this.LIZ));
    }

    public final int LIZIZ() {
        return C497820Jfg.LIZ(this.LIZ) + C497820Jfg.LIZJ(this.LIZ);
    }

    public final C1391720mJu LIZJ() {
        return (C1391720mJu) this.LJIIIZ.getValue();
    }

    public final void LJFF() {
        if (C426750GoL.LIZLLL(this.LIZ)) {
            C1391600mJi c1391600mJi = this.LIZIZ;
            EnumC1235690iGF enumC1235690iGF = c1391600mJi.LIZLLL;
            EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.START;
            if (enumC1235690iGF == enumC1235690iGF2) {
                c1391600mJi.LIZLLL = EnumC1235690iGF.END;
            } else if (enumC1235690iGF == EnumC1235690iGF.END) {
                c1391600mJi.LIZLLL = enumC1235690iGF2;
            }
            EnumC1235690iGF enumC1235690iGF3 = c1391600mJi.LIZLLL;
            if (enumC1235690iGF3 == EnumC1235690iGF.TOP || enumC1235690iGF3 == EnumC1235690iGF.BOTTOM) {
                c1391600mJi.LJI = -c1391600mJi.LJI;
            }
            c1391600mJi.LJ = -c1391600mJi.LJ;
            ((View) this.LJIIJ.getValue()).setLayoutDirection(1);
        }
    }

    public final void LJI() {
        this.LIZJ.LJIIIZ(this.LIZIZ.LJJI);
        this.LIZJ.LJIJ(this.LIZIZ.LJJIFFI);
        C1391600mJi c1391600mJi = this.LIZIZ;
        this.LJIILIIL = c1391600mJi.LJIIIIZZ;
        long j = c1391600mJi.LJII;
        if (j < 0 && j != -1001) {
            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        if (c1391600mJi.LJIIJ < 0) {
            c1391600mJi.LJIIJ = 250L;
        }
        this.LIZJ.LIZLLL(c1391600mJi.LJIJJ);
        C0P0T c0p0t = this.LIZJ;
        C1391600mJi c1391600mJi2 = this.LIZIZ;
        c0p0t.LJJII(c1391600mJi2.LJJ, c1391600mJi2.LJIL);
    }

    public final void LJII() {
        C1391600mJi c1391600mJi = this.LIZIZ;
        if (c1391600mJi.LJIILLIIL != null) {
            C1391720mJu c1391720mJuLIZJ = LIZJ();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1391720mJuLIZJ, null);
            c1391720mJuLIZJ.removeAllViews();
            LIZJ().addView(this.LIZIZ.LJIILLIIL);
            LIZJ().setBackground(null);
            this.LIZIZ.LJIIL = false;
        } else {
            if (c1391600mJi.LJIIZILJ != null) {
                C786410Ut5.LJJJJIZL((FrameLayout) this.LJIIJ.getValue());
                ((ViewGroup) this.LJIIJ.getValue()).addView(this.LIZIZ.LJIIZILJ);
            }
            C1391600mJi c1391600mJi2 = this.LIZIZ;
            if (c1391600mJi2.LIZ == null) {
                Integer numLIZLLL = C1308910kAL.LIZLLL(this.LIZ, R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipActionBgColor);
                if (numLIZLLL == null) {
                    numLIZLLL = Integer.valueOf(LJIILJJIL);
                }
                c1391600mJi2.LIZ = numLIZLLL;
            }
            Integer num = this.LIZIZ.LIZ;
            if (num != null) {
                LIZJ().setColor(num.intValue());
                LIZJ().setWillNotDraw(false);
            }
        }
        View view = this.LIZIZ.LJIJ;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams != null) {
                Iterator it2 = C1697810uHb.LJIIJJI(10, 5, 7, 3, 6, 8, 1).iterator();
                while (it2.hasNext()) {
                    layoutParams.addRule(((Number) it2.next()).intValue(), 0);
                }
                layoutParams.addRule(17, 0);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            if (view.getId() == -1) {
                view.setId(R.id.z1j);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) LIZJ().getLayoutParams();
            int i = C1235740iGK.LIZ[this.LIZIZ.LJIJI.ordinal()];
            if (i == 1) {
                C426750GoL.LJIIIZ(LIZJ(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 0, 0, false, 16);
                layoutParams.addRule(10);
                layoutParams.addRule(5, R.id.cxs);
                layoutParams.addRule(7, R.id.cxs);
                layoutParams2.addRule(3, view.getId());
            } else if (i == 2) {
                C426750GoL.LJIIIZ(LIZJ(), 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), false, 16);
                layoutParams.addRule(10, 0);
                layoutParams.addRule(5, R.id.cxs);
                layoutParams.addRule(7, R.id.cxs);
                layoutParams.addRule(3, R.id.cxs);
            } else if (i == 3) {
                C426750GoL.LJIIIZ(LIZJ(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 0, 0, 0, false, 16);
                layoutParams.addRule(10, 0);
                layoutParams.addRule(6, R.id.cxs);
                layoutParams.addRule(8, R.id.cxs);
                layoutParams2.addRule(17, view.getId());
            } else {
                if (i != 4) {
                    throw new C1954807lC();
                }
                C426750GoL.LJIIIZ(LIZJ(), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 0, false, 16);
                layoutParams.addRule(10, 0);
                layoutParams.addRule(6, R.id.cxs);
                layoutParams.addRule(8, R.id.cxs);
                layoutParams.addRule(17, R.id.cxs);
            }
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            }
            ((ViewGroup) this.LJIIJJI.getValue()).addView(view, layoutParams);
        } else {
            C426750GoL.LJIIIZ(LIZJ(), 0, 0, 0, 0, false, 16);
        }
        LIZJ().LIZIZ(this.LIZIZ.LJIIL);
        LIZJ().LIZ(this.LIZIZ.LJJIII);
    }

    public final boolean LJIIIZ() {
        int i;
        LIZJ().setPosition(this.LIZIZ.LIZLLL);
        int i2 = C1235740iGK.LIZ[this.LIZIZ.LIZLLL.ordinal()];
        if (i2 == 1) {
            i = 0;
            C426750GoL.LJIIJJI((View) this.LJIIJJI.getValue(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), 0, false);
        } else if (i2 == 2) {
            i = 0;
            C426750GoL.LJIIJJI((View) this.LJIIJJI.getValue(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), false);
        } else if (i2 == 3) {
            i = 0;
            C426750GoL.LJIIJJI((View) this.LJIIJJI.getValue(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), false);
        } else {
            if (i2 != 4) {
                throw new C1954807lC();
            }
            i = 0;
            C426750GoL.LJIIJJI((View) this.LJIIJJI.getValue(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), false);
        }
        this.LIZLLL.measure(0, 0);
        this.LJII = this.LIZLLL.getMeasuredWidth();
        this.LJIIIIZZ = this.LIZLLL.getMeasuredHeight();
        C1391600mJi c1391600mJi = this.LIZIZ;
        View view = c1391600mJi.LIZIZ;
        if (view == null) {
            return LJIIIIZZ(c1391600mJi.LIZLLL, this.LJIIL, i, i, c1391600mJi.LJIILJJIL, c1391600mJi.LJIILL);
        }
        int width = view.getWidth();
        int height = this.LIZIZ.LIZIZ.getHeight();
        int[] iArr = new int[2];
        this.LIZIZ.LIZIZ.getLocationInWindow(iArr);
        return LJIIIIZZ(this.LIZIZ.LIZLLL, this.LJIIL, width, height, iArr[0], iArr[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.EnumC1235690iGF r12, X.C1391620mJk r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391610mJj.LIZLLL(X.0iGF, X.0mJk):void");
    }

    public final void LJIIJ(C1391620mJk c1391620mJk, boolean z) {
        C19746312Np c19746312Np;
        C1391600mJi c1391600mJi = this.LIZIZ;
        if (c1391600mJi.LJIIJJI) {
            Function2<? super View, ? super Boolean, AnimatorSet> function2 = c1391600mJi.LJJII;
            if (function2 != null) {
                AnimatorSet animatorSetInvoke = function2.invoke(this.LIZLLL, Boolean.valueOf(z));
                animatorSetInvoke.setDuration(this.LIZIZ.LJIIJ);
                animatorSetInvoke.start();
            } else {
                if (z) {
                    if (C07XO.LIZ) {
                        c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, LJIJ, LJIJI);
                    } else {
                        c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, LJIILL, LJIILLIIL);
                    }
                } else if (C07XO.LIZ) {
                    c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, LJIJ, LJIJJ);
                } else {
                    c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, LJIILL, LJIIZILJ);
                }
                new C21647019ng(this.LIZ, this.LIZLLL, c19746312Np, false).LJI(true);
            }
            this.LIZLLL.setPivotX(c1391620mJk.LIZJ - c1391620mJk.LIZ);
            this.LIZLLL.setPivotY(c1391620mJk.LIZLLL - c1391620mJk.LIZIZ);
        }
    }

    public final boolean LJ(EnumC1235690iGF enumC1235690iGF, C1391620mJk c1391620mJk, int i) {
        if (i == 0) {
            int i2 = C1235740iGK.LIZ[enumC1235690iGF.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new C1954807lC();
                }
                if (c1391620mJk.LIZIZ + this.LJI < LIZ()) {
                    c1391620mJk.LIZIZ = LIZ() - this.LJI;
                } else if ((c1391620mJk.LIZIZ + this.LJIIIIZZ) - this.LJI > LIZIZ() - this.LJIILIIL) {
                    c1391620mJk.LIZIZ = ((LIZIZ() - this.LJIIIIZZ) - this.LJIILIIL) + this.LJI;
                    return true;
                }
            } else {
                if (c1391620mJk.LIZIZ + this.LJI < LIZ()) {
                    c1391620mJk.LIZIZ = LIZ() - this.LJI;
                    return false;
                }
                if ((c1391620mJk.LIZIZ + this.LJIIIIZZ) - this.LJI <= LIZIZ() - this.LJIILIIL) {
                    return true;
                }
                c1391620mJk.LIZIZ = ((LIZIZ() - this.LJIILIIL) - this.LJIIIIZZ) + this.LJI;
                return false;
            }
        } else {
            int i3 = C1235740iGK.LIZ[enumC1235690iGF.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3 && i3 != 4) {
                    throw new C1954807lC();
                }
                int i4 = c1391620mJk.LIZ;
                int i5 = this.LJI;
                int i6 = i4 + i5;
                int i7 = this.LJIILIIL;
                if (i6 < i7) {
                    c1391620mJk.LIZ = i7 - i5;
                    return false;
                }
                if ((i4 + this.LJII) - i5 <= C497820Jfg.LIZIZ(this.LIZ) - this.LJIILIIL) {
                    return true;
                }
                c1391620mJk.LIZ = ((C497820Jfg.LIZIZ(this.LIZ) - this.LJII) - this.LJIILIIL) + this.LJI;
                return false;
            }
            int i8 = c1391620mJk.LIZ;
            int i9 = this.LJI;
            int i10 = i8 + i9;
            int i11 = this.LJIILIIL;
            if (i10 < i11) {
                c1391620mJk.LIZ = i11 - i9;
                return true;
            }
            if ((i8 + this.LJII) - i9 > C497820Jfg.LIZIZ(this.LIZ) - this.LJIILIIL) {
                c1391620mJk.LIZ = ((C497820Jfg.LIZIZ(this.LIZ) - this.LJII) - this.LJIILIIL) + this.LJI;
                return true;
            }
        }
        return true;
    }

    public C1391610mJj(Context context, C1391600mJi c1391600mJi, C0P0T c0p0t, View view, boolean z) {
        this.LIZ = context;
        this.LIZIZ = c1391600mJi;
        this.LIZJ = c0p0t;
        this.LIZLLL = view;
        this.LJ = z;
    }

    public final boolean LJIIIIZZ(EnumC1235690iGF enumC1235690iGF, C1391620mJk c1391620mJk, int i, int i2, int i3, int i4) {
        int i5 = C1235740iGK.LIZ[enumC1235690iGF.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        int i6 = i3 + i + this.LJFF;
                        C1391600mJi c1391600mJi = this.LIZIZ;
                        c1391620mJk.LIZ = i6 + c1391600mJi.LJ;
                        int i7 = ((i4 + i4) + i2) / 2;
                        c1391620mJk.LIZIZ = (i7 - (this.LJIIIIZZ / 2)) + c1391600mJi.LJFF;
                        LJ(enumC1235690iGF, c1391620mJk, 0);
                        int i8 = c1391620mJk.LIZ;
                        C1391600mJi c1391600mJi2 = this.LIZIZ;
                        c1391620mJk.LIZJ = i8 + c1391600mJi2.LJ;
                        c1391620mJk.LIZLLL = i7 + c1391600mJi2.LJI;
                        LIZLLL(enumC1235690iGF, c1391620mJk);
                        return LJ(enumC1235690iGF, c1391620mJk, 1);
                    }
                    throw new C1954807lC();
                }
                int i9 = (i3 - this.LJII) - this.LJFF;
                C1391600mJi c1391600mJi3 = this.LIZIZ;
                c1391620mJk.LIZ = i9 + c1391600mJi3.LJ;
                int i10 = ((i4 + i4) + i2) / 2;
                c1391620mJk.LIZIZ = (i10 - (this.LJIIIIZZ / 2)) + c1391600mJi3.LJFF;
                LJ(enumC1235690iGF, c1391620mJk, 0);
                int i11 = i3 - this.LJFF;
                C1391600mJi c1391600mJi4 = this.LIZIZ;
                c1391620mJk.LIZJ = i11 + c1391600mJi4.LJ;
                c1391620mJk.LIZLLL = i10 + c1391600mJi4.LJI;
                LIZLLL(enumC1235690iGF, c1391620mJk);
                return LJ(enumC1235690iGF, c1391620mJk, 1);
            }
            int i12 = ((i3 + i3) + i) / 2;
            int i13 = i12 - (this.LJII / 2);
            C1391600mJi c1391600mJi5 = this.LIZIZ;
            c1391620mJk.LIZ = i13 + c1391600mJi5.LJ;
            int i14 = i4 + i2;
            c1391620mJk.LIZIZ = this.LJFF + i14 + c1391600mJi5.LJFF;
            LJ(enumC1235690iGF, c1391620mJk, 1);
            C1391600mJi c1391600mJi6 = this.LIZIZ;
            c1391620mJk.LIZJ = i12 + c1391600mJi6.LJI;
            c1391620mJk.LIZLLL = i14 + this.LJFF + c1391600mJi6.LJFF;
            LIZLLL(enumC1235690iGF, c1391620mJk);
            return LJ(this.LIZIZ.LIZLLL, c1391620mJk, 0);
        }
        int i15 = ((i3 + i3) + i) / 2;
        int i16 = i15 - (this.LJII / 2);
        C1391600mJi c1391600mJi7 = this.LIZIZ;
        c1391620mJk.LIZ = i16 + c1391600mJi7.LJ;
        c1391620mJk.LIZIZ = ((i4 - this.LJIIIIZZ) - this.LJFF) + c1391600mJi7.LJFF;
        LJ(enumC1235690iGF, c1391620mJk, 1);
        C1391600mJi c1391600mJi8 = this.LIZIZ;
        c1391620mJk.LIZJ = i15 + c1391600mJi8.LJI;
        c1391620mJk.LIZLLL = (i4 + c1391600mJi8.LJFF) - this.LJFF;
        LIZLLL(enumC1235690iGF, c1391620mJk);
        return LJ(enumC1235690iGF, c1391620mJk, 0);
    }
}
