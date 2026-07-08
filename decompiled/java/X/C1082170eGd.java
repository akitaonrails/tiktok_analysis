package X;

import Y.ARunnableS86S0200000_17;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: X.0eGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082170eGd extends AbstractC1082160eGc {
    public final View LJIIIIZZ;
    public final C0J5T LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public C1082190eGf LJIILLIIL;
    public C1082190eGf LJIIZILJ;
    public boolean LJIJ;
    public final PointF LJIJI;

    @Override // X.AbstractC1082160eGc, X.InterfaceC1082220eGi
    public final boolean LIZ(C1082200eGg c1082200eGg) {
        if (this.LJIIJJI) {
            View view = this.LIZIZ;
            if (view != null) {
                view.setPivotX(this.LJIILJJIL);
                view.setPivotY(this.LJIILL);
            }
            super.LIZ(c1082200eGg);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1078100eA4
    public final boolean LIZJ(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int iFindPointerIndex2;
        float pivotX;
        ViewGroup viewGroup;
        C0IEW c0iew;
        C1082190eGf c1082190eGf;
        C1082190eGf c1082190eGf2;
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6 && this.LJIIJJI && (((c1082190eGf = this.LJIILLIIL) != null && c1082190eGf.LIZ == motionEvent.getPointerId(motionEvent.getActionIndex())) || ((c1082190eGf2 = this.LJIIZILJ) != null && c1082190eGf2.LIZ == motionEvent.getPointerId(motionEvent.getActionIndex())))) {
                                this.LJIIJ = true;
                                this.LJIJ = true;
                                LJII(false, EnumC1083180eIG.ZOOM_OUT);
                            }
                        } else if (pointerCount == 2) {
                            this.LJIIZILJ = new C1082190eGf(motionEvent);
                            float f = 2;
                            this.LJIJI.x = (motionEvent.getX(0) + motionEvent.getX(1)) / f;
                            this.LJIJI.y = (motionEvent.getY(0) + motionEvent.getY(1)) / f;
                            View view = this.LIZIZ;
                            float pivotY = 0.0f;
                            if (view != null) {
                                pivotX = view.getPivotX();
                            } else {
                                pivotX = 0.0f;
                            }
                            this.LJIIL = pivotX;
                            View view2 = this.LIZIZ;
                            if (view2 != null) {
                                pivotY = view2.getPivotY();
                            }
                            this.LJIILIIL = pivotY;
                            if (!this.LJIIJJI) {
                                this.LJIIJJI = true;
                                this.LIZJ.LJJJIL();
                                C0J5T c0j5t = this.LJIIIZ;
                                if (c0j5t != null && (c0iew = ((C463460IFk) c0j5t).LIZ.c0) != null) {
                                    c0iew.LLLLZLL(false);
                                }
                                View view3 = this.LJIIIIZZ;
                                if ((view3 instanceof ViewGroup) && (viewGroup = (ViewGroup) view3) != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    } else {
                        this.LJIILLIIL = null;
                        this.LJIIZILJ = null;
                        LJI(false, EnumC1083180eIG.OTHER);
                    }
                } else if (motionEvent.getPointerCount() >= 2) {
                    C1082190eGf c1082190eGf3 = this.LJIILLIIL;
                    if (c1082190eGf3 != null) {
                        iFindPointerIndex = motionEvent.findPointerIndex(c1082190eGf3.LIZ);
                    } else {
                        iFindPointerIndex = 0;
                    }
                    C1082190eGf c1082190eGf4 = this.LJIIZILJ;
                    if (c1082190eGf4 != null) {
                        iFindPointerIndex2 = motionEvent.findPointerIndex(c1082190eGf4.LIZ);
                    } else {
                        iFindPointerIndex2 = 1;
                    }
                    if (iFindPointerIndex != -1 && iFindPointerIndex < pointerCount && iFindPointerIndex2 != -1 && iFindPointerIndex2 < pointerCount) {
                        float f2 = 2;
                        this.LJIILJJIL = (motionEvent.getX(iFindPointerIndex) + motionEvent.getX(iFindPointerIndex2)) / f2;
                        float y = (motionEvent.getY(iFindPointerIndex) + motionEvent.getY(iFindPointerIndex2)) / f2;
                        this.LJIILL = y;
                        float f3 = this.LJIILJJIL;
                        PointF pointF = this.LJIJI;
                        float f4 = f3 - pointF.x;
                        float f5 = y - pointF.y;
                        if (!this.LJIIJJI) {
                            return true;
                        }
                        View view4 = this.LIZIZ;
                        if (view4 != null) {
                            C786410Ut5.Jc(view4, f4);
                        }
                        View view5 = this.LIZIZ;
                        if (view5 != null) {
                            C786410Ut5.ed(view5, f5);
                        }
                    } else {
                        return this.LJIIJJI;
                    }
                }
            } else {
                LJI(false, EnumC1083180eIG.ZOOM_OUT);
                this.LJIILLIIL = null;
                this.LJIIZILJ = null;
            }
        } else {
            this.LJIIJ = false;
            this.LJIILLIIL = new C1082190eGf(motionEvent);
        }
        if (!this.LJIIJ && !this.LJIIJJI) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1082160eGc
    public final void LJI(boolean z, EnumC1083180eIG enumC1083180eIG) {
        C0IEW c0iew;
        ViewGroup viewGroup;
        if (this.LJIJ || this.LJIIJJI) {
            View view = this.LJIIIIZZ;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
            C0J5T c0j5t = this.LJIIIZ;
            if (c0j5t != null && (c0iew = ((C463460IFk) c0j5t).LIZ.c0) != null) {
                c0iew.LLLLZLL(true);
            }
        }
        this.LJIJ = false;
        LJII(z, enumC1083180eIG);
    }

    @Override // X.AbstractC1082160eGc
    public final void LJII(boolean z, EnumC1083180eIG enumC1083180eIG) {
        float scaleX;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationX;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        if (this.LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reset reason = ");
            sbLIZ.append(enumC1083180eIG.getReason());
            C20441214yg.LJIIIZ("LivePinch", C2188811AlT.LIZIZ(sbLIZ));
            this.LJIIJJI = false;
            InterfaceC1082180eGe interfaceC1082180eGe = this.LIZJ;
            View view = this.LIZIZ;
            if (view != null) {
                scaleX = view.getScaleX();
            } else {
                scaleX = 1.0f;
            }
            interfaceC1082180eGe.LJ(scaleX, enumC1083180eIG);
            if (enumC1083180eIG == EnumC1083180eIG.OTHER) {
                View view2 = this.LIZIZ;
                if (view2 != null) {
                    view2.setPivotX(this.LJIIL);
                    this.LIZIZ.setPivotY(this.LJIILIIL);
                    C786410Ut5.ed(this.LIZIZ, 0.0f);
                    C786410Ut5.Jc(this.LIZIZ, 0.0f);
                    LJIIIIZZ(1.0f);
                    C786410Ut5.Ob(this.LIZIZ, this.LJI);
                    C786410Ut5.pc(this.LIZIZ, this.LJI);
                }
                this.LIZJ.LIZJ(enumC1083180eIG);
                return;
            }
            View view3 = this.LIZIZ;
            if (view3 == null || (viewPropertyAnimatorAnimate = view3.animate()) == null || (viewPropertyAnimatorTranslationX = viewPropertyAnimatorAnimate.translationX(0.0f)) == null || (viewPropertyAnimatorTranslationY = viewPropertyAnimatorTranslationX.translationY(0.0f)) == null || (interpolator = viewPropertyAnimatorTranslationY.setInterpolator(new DecelerateInterpolator())) == null || (viewPropertyAnimatorScaleX = interpolator.scaleX(1.0f)) == null || (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) == null || (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorScaleY.withEndAction(new ARunnableS86S0200000_17(this, enumC1083180eIG, 41))) == null) {
                return;
            }
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1082170eGd(View view, View view2, C0J5T c0j5t, InterfaceC1082180eGe interfaceC1082180eGe) {
        ViewGroup viewGroup;
        if (c0j5t != null) {
            viewGroup = ((C463460IFk) c0j5t).LIZ.LLLLLJLJLL;
        } else {
            viewGroup = null;
        }
        super(view2, viewGroup, interfaceC1082180eGe);
        this.LJIIIIZZ = view;
        this.LJIIIZ = c0j5t;
        this.LJIJI = new PointF();
    }
}
