package X;

import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Izs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484860Izs implements C0SUN, C0J0Y {
    public static final float LJJ = C418440Gaw.LIZIZ(2);
    public static final float LJJI = C418440Gaw.LIZIZ(30);
    public static final float LJJIFFI = C418440Gaw.LIZIZ(150);
    public static final float LJJII = C418440Gaw.LIZIZ(4);
    public float LIZJ;
    public float LIZLLL;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public C0J0X LJIILL;
    public FrameLayout LJIILLIIL;
    public View LJIIZILJ;
    public View LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public InterfaceC484910Izx LJIL;
    public float LIZ = C418440Gaw.LIZIZ(120);
    public float LIZIZ = C418440Gaw.LIZIZ(160);
    public float LJ = -1.0f;
    public float LJFF = -1.0f;
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(289));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 721));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 720));

    public final float LJI() {
        return Math.max(this.LJ, this.LJFF);
    }

    @Override // X.C0SUN
    public final boolean LIZJ() {
        return this.LJIJJLI;
    }

    @Override // X.C0SUN
    public final boolean LJ() {
        return this.LJIILIIL;
    }

    @Override // X.C0J0Y
    public final boolean LIZ(int i) {
        if (i > 0 && this.LJIJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.C0J0Y
    public final boolean LIZIZ(int i) {
        if (this.LJIILJJIL && this.LJIJI && this.LIZLLL > 0.0f && this.LIZJ > 0.0f) {
            if (i < 0) {
                if (this.LJIJJLI) {
                    return true;
                }
            } else if (i > 0 && !this.LJIJJLI) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    @Override // X.C0SUN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C484860Izs.LIZLLL(android.view.MotionEvent):void");
    }

    public final void LJFF(boolean z) {
        if (z) {
            View view = this.LJIIZILJ;
            if (view != null) {
                C786410Ut5.T4(view, 0.0f);
            }
            View view2 = this.LJIIZILJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        View view3 = this.LJIIZILJ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view3);
    }

    public final void LJII(boolean z) {
        boolean z2;
        if (!z && !this.LJIJJLI) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LJIJI = z2;
        if (z) {
            C0J0X c0j0x = this.LJIILL;
            if (c0j0x != null) {
                C786410Ut5.LJZ(0, c0j0x);
                return;
            }
            return;
        }
        C0J0X c0j0x2 = this.LJIILL;
        if (c0j0x2 == null) {
            return;
        }
        C786410Ut5.LJZ(8, c0j0x2);
    }

    public final void LJIIIZ(float f) {
        float f2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5 = this.LJIILLIIL;
        if (frameLayout5 != null) {
            C786410Ut5.ed(frameLayout5, (-this.LIZLLL) * f);
            float f3 = 1 - f;
            C786410Ut5.Ob(frameLayout5, (LJI() * f) + f3);
            C786410Ut5.pc(frameLayout5, f3 + (LJI() * f));
            Rect rect = new Rect();
            FrameLayout frameLayout6 = this.LJIILLIIL;
            if (frameLayout6 != null) {
                frameLayout6.getGlobalVisibleRect(rect);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoSizeChange[227]: progress=");
            sbLIZ.append(f);
            sbLIZ.append(" targetTranslationY=");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" translationY=");
            sbLIZ.append(frameLayout5.getTranslationY());
            sbLIZ.append(" scaleX=");
            sbLIZ.append(frameLayout5.getScaleX());
            sbLIZ.append(" scaleY=");
            sbLIZ.append(frameLayout5.getScaleY());
            sbLIZ.append(" centerY=");
            sbLIZ.append(rect.centerY());
            C20441214yg.LIZIZ("LiveTouchScalingV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        float f4 = 1;
        float f5 = LJJIFFI;
        float f6 = LJJI;
        float fMax = Math.max(f4 - ((f * f5) / f6), -0.0f);
        float f7 = f4 - (f6 / f5);
        if (f < f7) {
            f2 = 0.0f;
        } else {
            f2 = ((f - f7) * f5) / f6;
        }
        if (fMax > 0.0f) {
            View view = this.LJIIZILJ;
            if (view != null) {
                C786410Ut5.T4(view, fMax);
            }
            LJFF(false);
        } else {
            LJFF(true);
        }
        if (f2 > 0.0f) {
            View view2 = this.LJIJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LJIJ;
            if (view3 != null) {
                C786410Ut5.T4(view3, f2);
            }
        } else {
            View view4 = this.LJIJ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(4, view4);
            }
        }
        C0J0X c0j0x = this.LJIILL;
        if (c0j0x != null) {
            C786410Ut5.U4(c0j0x, f);
        }
        FrameLayout frameLayout7 = this.LJIILLIIL;
        if (frameLayout7 == null || frameLayout7.getOutlineProvider() == null || ((frameLayout4 = this.LJIILLIIL) != null && !frameLayout4.getClipToOutline())) {
            FrameLayout frameLayout8 = this.LJIILLIIL;
            if (frameLayout8 != null) {
                frameLayout8.setOutlineProvider((ViewOutlineProvider) this.LJIIIZ.getValue());
            }
            FrameLayout frameLayout9 = this.LJIILLIIL;
            if (frameLayout9 != null) {
                frameLayout9.setClipToOutline(true);
            }
        }
        float fLJI = (LJJII * f) / LJI();
        float fLJI2 = this.LIZ / (this.LJ + ((LJI() - this.LJ) * f));
        float fLJI3 = this.LIZIZ / (this.LJFF + ((LJI() - this.LJFF) * f));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("syncPlayerViewOutline: progress=");
        sbLIZ2.append(f);
        sbLIZ2.append(" radius=");
        sbLIZ2.append(fLJI);
        sbLIZ2.append(" widthMultiple=");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(" heightMultiple=");
        sbLIZ2.append(this.LJFF);
        sbLIZ2.append(" targetMultiple=");
        sbLIZ2.append(LJI());
        sbLIZ2.append(" width=");
        sbLIZ2.append(fLJI2);
        sbLIZ2.append(" height=");
        sbLIZ2.append(fLJI3);
        C20441214yg.LIZIZ("LiveTouchScalingV2", C2188811AlT.LIZIZ(sbLIZ2));
        C482950Iwn c482950Iwn = (C482950Iwn) this.LJIIIZ.getValue();
        c482950Iwn.LIZ = fLJI;
        c482950Iwn.LIZIZ = fLJI2;
        c482950Iwn.LIZJ = fLJI3;
        FrameLayout frameLayout10 = this.LJIILLIIL;
        if (frameLayout10 != null) {
            frameLayout10.invalidateOutline();
        }
        if (f > 0.0f && ((frameLayout3 = this.LJIILLIIL) == null || frameLayout3.getBackground() == null)) {
            FrameLayout frameLayout11 = this.LJIILLIIL;
            if (frameLayout11 != null) {
                frameLayout11.setBackgroundColor(-16777216);
            }
        } else if (f == 0.0f && (frameLayout = this.LJIILLIIL) != null && frameLayout.getBackground() != null && (frameLayout2 = this.LJIILLIIL) != null) {
            frameLayout2.setBackgroundResource(0);
        }
        InterfaceC484910Izx interfaceC484910Izx = this.LJIL;
        if (interfaceC484910Izx != null) {
            interfaceC484910Izx.x02(f);
        }
    }

    public final void LJIIIIZZ(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setInterpolator(new C21388518n5());
        valueAnimatorOfFloat.setDuration(Math.max(((long) Math.abs(f2 - f)) * ((long) 500), 350L));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 30));
        if (z) {
            valueAnimatorOfFloat.addListener((C484880Izu) this.LJIIJ.getValue());
        } else {
            valueAnimatorOfFloat.addListener((C484880Izu) this.LJIIJJI.getValue());
        }
        valueAnimatorOfFloat.start();
    }
}
