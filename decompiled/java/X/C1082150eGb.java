package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS18S0210000_17;
import Y.ARunnableS5S0100001_17;
import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082150eGb extends AbstractC1082160eGc {
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public C1082190eGf LJIIJJI;
    public C1082190eGf LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public View LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final View LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;

    public final int LJIIL() {
        return ((Number) this.LJJI.getValue()).intValue();
    }

    public final float[] LJIILIIL() {
        return (float[]) this.LJIJ.getValue();
    }

    public final int LJIILJJIL() {
        return ((Number) this.LJJ.getValue()).intValue();
    }

    public final float LJIILL() {
        return ((Number) this.LJIJJ.getValue()).floatValue();
    }

    public final float LJIILLIIL() {
        return ((Number) this.LJIJJLI.getValue()).floatValue();
    }

    public final int LJIIZILJ() {
        if (this.LJIJI == null) {
            return -1;
        }
        if (this.LJI <= 1.1000000014901161d) {
            return 0;
        }
        LJIJJ();
        float fLJIILLIIL = this.LJJIII - LJIILLIIL();
        float fLJIILLIIL2 = this.LJJIII + LJIILLIIL();
        float f = LJIILIIL()[0];
        if (fLJIILLIIL <= f && f <= fLJIILLIIL2) {
            float fLJIILLIIL3 = this.LJJIIJ - LJIILLIIL();
            float fLJIILLIIL4 = this.LJJIIJ + LJIILLIIL();
            float f2 = LJIILIIL()[1];
            if (fLJIILLIIL3 <= f2 && f2 <= fLJIILLIIL4) {
                return 1;
            }
        }
        return -1;
    }

    public final void LJIJI() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        View view = this.LJIJI;
        int width = view != null ? view.getWidth() : 0;
        float f = this.LJI;
        float f2 = (this.LJJII / (width * f)) * f;
        View view2 = this.LIZIZ;
        if (view2 == null || (viewPropertyAnimatorAnimate = view2.animate()) == null || (interpolator = viewPropertyAnimatorAnimate.setInterpolator(new DecelerateInterpolator())) == null || (viewPropertyAnimatorScaleX = interpolator.scaleX(f2)) == null || (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(f2)) == null || (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorScaleY.withEndAction(new ARunnableS5S0100001_17(this, f2, 1))) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    public final void LJIJJ() {
        View view = this.LJIJI;
        if (view == null) {
            return;
        }
        view.getLocationOnScreen((int[]) this.LJIIZILJ.getValue());
        int i = ((int[]) this.LJIIZILJ.getValue())[0];
        int width = ((int) (this.LJI * (this.LJIJI != null ? r0.getWidth() : 0))) + i;
        LJIILIIL()[0] = i;
        LJIILIIL()[1] = width;
        int i2 = ((int[]) this.LJIIZILJ.getValue())[1];
        int height = ((int) (this.LJI * (this.LJIJI != null ? r0.getHeight() : 0))) + i2;
        LJIILIIL()[2] = i2;
        LJIILIIL()[3] = height;
    }

    @Override // X.AbstractC1082160eGc
    public final void LIZLLL() {
        super.LIZLLL();
        LJIIJ(false);
    }

    @Override // X.AbstractC1082160eGc
    public final void LJIIIZ() {
        super.LJIIIZ();
        if (LJIIZILJ() == 1) {
            return;
        }
        LJIJJ();
        LJIJI();
    }

    @Override // X.C1078110eA5, X.InterfaceC1082220eGi
    public final void onScaleEnd() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationX;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        if (LJIIZILJ() != 0) {
            if (LJIIZILJ() != 1) {
                this.LIZJ.LIZLLL(this.LJI, -1, false);
                return;
            } else {
                LJIJI();
                ((C194310110i) this.LJJIFFI.getValue()).LIZ();
                return;
            }
        }
        View view = this.LIZIZ;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorTranslationX = viewPropertyAnimatorAnimate.translationX(0.0f)) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorTranslationX.translationY(0.0f)) != null && (interpolator = viewPropertyAnimatorTranslationY.setInterpolator(new DecelerateInterpolator())) != null && (viewPropertyAnimatorScaleX = interpolator.scaleX(1.0f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) != null && (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorScaleY.withEndAction(new ARunnableS117S0100000_17(this, 166))) != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        ((C194310110i) this.LJJIFFI.getValue()).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    @Override // X.AbstractC1082160eGc, X.InterfaceC1082220eGi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1082200eGg r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1082150eGb.LIZ(X.0eGg):boolean");
    }

    @Override // X.AbstractC1082160eGc, X.InterfaceC1082220eGi
    public final void LIZIZ(C1082200eGg c1082200eGg) {
        this.LJIILL = false;
        LJIIJJI(false);
        this.LIZJ.LJJJIL();
        super.LIZIZ(c1082200eGg);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233 A[PHI: r5 r8
      0x0233: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:118:0x021e, B:121:0x022d] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r8v1 float) = (r8v0 float), (r8v2 float) binds: [B:118:0x021e, B:121:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0252  */
    @Override // X.AbstractC1078100eA4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1082150eGb.LIZJ(android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC1082160eGc
    public final void LJ(boolean z) {
        int iLJIIL;
        int iLJIIL2;
        super.LJ(z);
        if (!C497740JfY.LJJ()) {
            if (z) {
                this.LJJII -= LJIIL();
                iLJIIL2 = this.LJJIIJ - LJIIL();
            } else {
                this.LJJII += LJIIL();
                iLJIIL2 = this.LJJIIJ + LJIIL();
            }
            this.LJJIIJ = iLJIIL2;
            return;
        }
        if (z) {
            this.LJJII -= LJIIL() + C497740JfY.LJIJ();
            iLJIIL = LJIIL() + C497740JfY.LJIJ();
        } else {
            this.LJJII += LJIIL() + C497740JfY.LJIJ();
            iLJIIL = 0;
        }
        this.LJJIII = iLJIIL;
        LJIIJ(z);
    }

    @Override // X.AbstractC1082160eGc
    public final void LJFF(float f) {
        boolean z;
        if (!this.LJIILL) {
            return;
        }
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        LJIIJJI(z);
    }

    public final void LJIIJ(boolean z) {
        View view;
        Context context;
        ViewGroup viewGroup;
        if (!C497740JfY.LJJ()) {
            return;
        }
        Context context2 = null;
        View decorView = null;
        try {
            if (z) {
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    context = view2.getContext();
                } else {
                    context = null;
                }
                Activity activityLJIJ = C520010KaN.LJIJ(context, false);
                if (activityLJIJ != null) {
                    int iLJIJ = C497740JfY.LJIJ();
                    if (this.LJIILLIIL == null) {
                        this.LJIILLIIL = new View(activityLJIJ);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLJIJ, -1);
                        layoutParams.gravity = 8388613;
                        View view3 = this.LJIILLIIL;
                        if (view3 != null) {
                            view3.setBackground(new ColorDrawable(-16777216));
                        }
                        View view4 = this.LJIILLIIL;
                        if (view4 != null) {
                            C786410Ut5.W5(view4, layoutParams);
                        }
                        View view5 = this.LJIILLIIL;
                        if (view5 != null) {
                            C786410Ut5.LJLLLLLL(0, view5);
                        }
                    }
                    Window window = activityLJIJ.getWindow();
                    if (window != null) {
                        decorView = window.getDecorView();
                    }
                    if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                        viewGroup.addView(this.LJIILLIIL);
                        return;
                    }
                    return;
                }
                return;
            }
            View view6 = this.LIZIZ;
            if (view6 != null) {
                context2 = view6.getContext();
            }
            Activity activityLJIJ2 = C520010KaN.LJIJ(context2, false);
            if (activityLJIJ2 != null && (view = this.LIZIZ) != null) {
                HandlerHook.viewPost(view, new ARunnableS82S0200000_13(this, activityLJIJ2, 55));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LandScapePinchGestureListener", e);
        }
    }

    public final void LJIIJJI(boolean z) {
        ViewGroup viewGroup;
        View view = this.LIZ;
        if (view instanceof C21601619gM) {
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.requestDisallowInterceptTouchEvent(!z);
            }
            if (z) {
                ((C21601619gM) this.LIZ).setEnabled(this.LJFF);
            } else {
                ((C21601619gM) this.LIZ).setEnabled(z);
            }
            ((ViewGroup) this.LIZ).requestDisallowInterceptTouchEvent(false);
        }
    }

    public final float LJIJ(MotionEvent motionEvent) {
        int i;
        int i2;
        if (motionEvent.getPointerCount() >= 2) {
            C1082190eGf c1082190eGf = this.LJIIJJI;
            if (c1082190eGf != null) {
                i = c1082190eGf.LIZIZ;
            } else {
                i = 0;
            }
            float x = motionEvent.getX(i);
            C1082190eGf c1082190eGf2 = this.LJIIL;
            if (c1082190eGf2 != null) {
                i2 = c1082190eGf2.LIZIZ;
            } else {
                i2 = 1;
            }
            float x2 = x - motionEvent.getX(i2);
            float y = motionEvent.getY(0) - motionEvent.getY(1);
            return (float) Math.sqrt((x2 * x2) + (y * y));
        }
        return 0.0f;
    }

    @Override // X.AbstractC1082160eGc
    public final void LJII(boolean z, EnumC1083180eIG enumC1083180eIG) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationX;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        if (!this.LJII) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset reason = ");
        sbLIZ.append(enumC1083180eIG.getReason());
        C20441214yg.LJIIIZ("LivePinch", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LIZIZ;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorTranslationX = viewPropertyAnimatorAnimate.translationX(0.0f)) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorTranslationX.translationY(0.0f)) != null && (interpolator = viewPropertyAnimatorTranslationY.setInterpolator(new DecelerateInterpolator())) != null && (viewPropertyAnimatorScaleX = interpolator.scaleX(1.0f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) != null && (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorScaleY.withEndAction(new ARunnableS18S0210000_17(this, enumC1083180eIG, z, 2))) != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
        LJIIIIZZ(1.0f);
    }

    public C1082150eGb(View view, View view2, InterfaceC1082180eGe interfaceC1082180eGe) {
        Context context;
        super(view, view2, interfaceC1082180eGe);
        this.LJIILIIL = true;
        this.LJIILL = true;
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(153));
        this.LJIJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(154));
        this.LJIJJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(156));
        this.LJIJJLI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(157));
        this.LJIL = C452501pT.LIZIZ(new AwS561S0100000_17(view, 342));
        this.LJJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(155));
        this.LJJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(152));
        this.LJJIFFI = C452501pT.LIZIZ(new AwS561S0100000_17(view, 343));
        int iLJIIL = 0;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if ((viewGroup.getChildAt(i) instanceof C1A7I) || (viewGroup.getChildAt(i) instanceof C1A7J)) {
                    this.LJIJI = viewGroup.getChildAt(i);
                    break;
                }
            }
        }
        if (view2 != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        Activity activityLJIJ = C520010KaN.LJIJ(context, false);
        int iLJFF = C14KS.LJFF();
        iLJFF = C2075608Be.LIZJ(activityLJIJ) ? iLJFF + C497740JfY.LJIJ() : iLJFF;
        if (C497740JfY.LJJ()) {
            if (!Intrinsics.LJFF(InterfaceC465670INx.LJLILLLLZI.LIZIZ(), Boolean.TRUE)) {
                LJIIJ(true);
                iLJIIL = LJIIL() + C497740JfY.LJIJ();
            }
            this.LJJIII = iLJIIL;
            this.LJJII = iLJFF - iLJIIL;
            this.LJJIIJ = iLJFF;
            return;
        }
        this.LJJIII = 0;
        if (Intrinsics.LJFF(InterfaceC465670INx.LJLILLLLZI.LIZIZ(), Boolean.TRUE)) {
            this.LJJII = iLJFF;
        } else {
            this.LJJII = iLJFF - LJIIL();
            iLJFF -= LJIIL();
        }
        this.LJJIIJ = iLJFF;
    }
}
