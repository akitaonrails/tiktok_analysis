package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21651519oP {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public float LIZJ = 1.0f;
    public float LIZLLL = 1.0f;
    public float LJ = 4.0f;
    public PointF LJFF = new PointF();
    public PointF LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILIIL;
    public MotionEvent LJIILJJIL;
    public final ScaleGestureDetector LJIILL;
    public InterfaceC707080RoQ LJIILLIIL;
    public View LJIIZILJ;
    public ViewGroup LJIJ;
    public ViewGroup LJIJI;
    public View LJIJJ;
    public final RectF LJIJJLI;

    public final void LIZIZ() {
        this.LJII = false;
        InterfaceC707080RoQ interfaceC707080RoQ = this.LJIILLIIL;
        if (interfaceC707080RoQ != null) {
            interfaceC707080RoQ.jl(this.LIZJ);
        }
        if (this.LIZ) {
            InterfaceC707080RoQ interfaceC707080RoQ2 = this.LJIILLIIL;
            if (interfaceC707080RoQ2 != null) {
                interfaceC707080RoQ2.LJZL();
                return;
            }
            return;
        }
        this.LJIILIIL = 2;
        View view = this.LJIIZILJ;
        if (view == null) {
            return;
        }
        view.animate().x(this.LJIIIIZZ).y(this.LJIIIZ).setInterpolator(new DecelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).withEndAction(new ARunnableS133S0100000_33(this, 115)).start();
        ViewGroup viewGroup = this.LJIJI;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().x(this.LJIIIIZZ).y(this.LJIIIZ).setInterpolator(new DecelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).start();
    }

    public final void LIZLLL() {
        this.LIZJ = 1.0f;
        this.LJIILIIL = 0;
        this.LJFF = new PointF();
        this.LJI = null;
        this.LJIIJ = false;
        this.LJII = false;
        View view = this.LJIIZILJ;
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
            C786410Ut5.Fd(view, this.LJIIIIZZ);
            C786410Ut5.Ld(view, this.LJIIIZ);
        }
        ViewGroup viewGroup = this.LJIJI;
        if (viewGroup != null) {
            C786410Ut5.Lb(1.0f, viewGroup);
            C786410Ut5.mc(1.0f, viewGroup);
            C786410Ut5.Ed(this.LJIIIIZZ, viewGroup);
            C786410Ut5.Kd(this.LJIIIZ, viewGroup);
        }
    }

    public final void LIZ(View view) {
        if (!this.LIZIZ) {
            return;
        }
        float f = 1;
        float pivotX = this.LJIIIIZZ - ((this.LJIJJLI.right - view.getPivotX()) * (view.getScaleX() - f));
        float pivotX2 = this.LJIIIIZZ - ((this.LJIJJLI.left - view.getPivotX()) * (view.getScaleX() - f));
        float pivotY = this.LJIIIZ - ((this.LJIJJLI.bottom - view.getPivotY()) * (view.getScaleY() - f));
        float pivotY2 = this.LJIIIZ - ((this.LJIJJLI.top - view.getPivotY()) * (view.getScaleY() - f));
        C786410Ut5.Fd(view, C13LZ.LIZLLL(view.getX(), pivotX, pivotX2));
        C786410Ut5.Ld(view, C13LZ.LIZLLL(view.getY(), pivotY, pivotY2));
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x;
        float y;
        if (motionEvent.getPointerCount() <= 2) {
            this.LJIILL.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && this.LJIILIIL == 1) {
                            try {
                                MotionEvent motionEvent2 = this.LJIILJJIL;
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                this.LJIILJJIL = null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1386360mBG.LIZLLL().LJ(String.valueOf(e.getMessage()));
                                C1AF0.LJ(e);
                            }
                            LIZIZ();
                            return true;
                        }
                    } else if (this.LJIILIIL == 0 && motionEvent.getPointerCount() == 2) {
                        View view = this.LJIIZILJ;
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup3 = (ViewGroup) view;
                            if (viewGroup3 != null) {
                                viewGroup3.requestDisallowInterceptTouchEvent(true);
                            }
                        } else {
                            ViewGroup viewGroup4 = this.LJIJ;
                            if (viewGroup4 != null) {
                                viewGroup4.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        ViewGroup viewGroup5 = this.LJIJI;
                        if (viewGroup5 != null) {
                            viewGroup5.requestDisallowInterceptTouchEvent(true);
                        }
                        this.LJIILIIL = 1;
                        if (!this.LJIIJ) {
                            View view2 = this.LJIIZILJ;
                            if (view2 != null) {
                                x = view2.getX();
                            } else {
                                x = 0.0f;
                            }
                            this.LJIIIIZZ = x;
                            View view3 = this.LJIIZILJ;
                            if (view3 != null) {
                                y = view3.getY();
                            } else {
                                y = 0.0f;
                            }
                            this.LJIIIZ = y;
                            View view4 = this.LJIIZILJ;
                            if (view4 != null && this.LIZIZ) {
                                View view5 = this.LJIJJ;
                                if (view5 == null) {
                                    this.LJIJJLI.set(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                } else {
                                    int[] iArr = new int[2];
                                    int[] iArr2 = new int[2];
                                    view4.getLocationOnScreen(iArr);
                                    view5.getLocationOnScreen(iArr2);
                                    float f = iArr2[0] - iArr[0];
                                    float f2 = iArr2[1] - iArr[1];
                                    this.LJIJJLI.set(f, f2, view5.getWidth() + f, view5.getHeight() + f2);
                                }
                            }
                            this.LJIIJ = true;
                        }
                        InterfaceC707080RoQ interfaceC707080RoQ = this.LJIILLIIL;
                        if (interfaceC707080RoQ != null) {
                            interfaceC707080RoQ.LJJJIL();
                        }
                        try {
                            MotionEvent motionEvent3 = this.LJIILJJIL;
                            if (motionEvent3 != null) {
                                motionEvent3.recycle();
                            }
                            this.LJIILJJIL = MotionEvent.obtain(motionEvent);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C1386360mBG.LIZLLL().LJ(String.valueOf(e2.getMessage()));
                            C1AF0.LJ(e2);
                        }
                        float f3 = 2;
                        this.LJFF.x = (motionEvent.getX(0) + motionEvent.getX(1)) / f3;
                        this.LJFF.y = (motionEvent.getY(0) + motionEvent.getY(1)) / f3;
                        return true;
                    }
                } else if (this.LJIILIIL == 1) {
                    LIZIZ();
                    View view6 = this.LJIIZILJ;
                    if (view6 instanceof ViewGroup) {
                        if ((view6 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view6) != null) {
                            viewGroup2.requestDisallowInterceptTouchEvent(false);
                        }
                    } else {
                        ViewGroup viewGroup6 = this.LJIJ;
                        if (viewGroup6 != null) {
                            viewGroup6.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    ViewGroup viewGroup7 = this.LJIJI;
                    if (viewGroup7 != null) {
                        viewGroup7.requestDisallowInterceptTouchEvent(false);
                    }
                    return false;
                }
            } else if (this.LJIILIIL == 1 && motionEvent.getPointerCount() == 2) {
                float f4 = 2;
                float x2 = (motionEvent.getX(0) + motionEvent.getX(1)) / f4;
                float y2 = (motionEvent.getY(0) + motionEvent.getY(1)) / f4;
                View view7 = this.LJIIZILJ;
                if (view7 != null) {
                    C786410Ut5.Fd(view7, view7.getX() - (this.LJFF.x - x2));
                    C786410Ut5.Ld(view7, view7.getY() - (this.LJFF.y - y2));
                    LIZ(view7);
                }
                ViewGroup viewGroup8 = this.LJIJI;
                if (viewGroup8 != null) {
                    C786410Ut5.Ed(viewGroup8.getX() - (this.LJFF.x - x2), viewGroup8);
                    C786410Ut5.Kd(viewGroup8.getY() - (this.LJFF.y - y2), viewGroup8);
                    LIZ(viewGroup8);
                }
                PointF pointF = this.LJFF;
                pointF.x = x2;
                pointF.y = y2;
                return true;
            }
        } else {
            if (this.LJIILIIL == 1) {
                this.LJIILIIL = 0;
            }
            View view8 = this.LJIIZILJ;
            if (view8 instanceof ViewGroup) {
                if ((view8 instanceof ViewGroup) && (viewGroup = (ViewGroup) view8) != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                ViewGroup viewGroup9 = this.LJIJ;
                if (viewGroup9 != null) {
                    viewGroup9.requestDisallowInterceptTouchEvent(false);
                }
            }
            ViewGroup viewGroup10 = this.LJIJI;
            if (viewGroup10 != null) {
                viewGroup10.requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return true;
    }

    public final void LJ(View view, boolean z) {
        PointF pointF;
        if (view == null) {
            return;
        }
        if (z && (pointF = this.LJI) != null) {
            float pivotX = view.getPivotX();
            float pivotY = view.getPivotY();
            float x = view.getX();
            float y = view.getY();
            view.setPivotX(pointF.x);
            view.setPivotY(pointF.y);
            float f = 1;
            C786410Ut5.Fd(view, x + ((pivotX - pointF.x) * (f - view.getScaleX())));
            C786410Ut5.Ld(view, y + ((pivotY - pointF.y) * (f - view.getScaleY())));
        }
        C786410Ut5.Ob(view, this.LIZJ);
        C786410Ut5.pc(view, this.LIZJ);
        LIZ(view);
    }

    public C21651519oP(Context context, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.19oQ
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector2) {
                boolean z3;
                PointF pointF;
                C21651519oP c21651519oP = this.LL;
                if (c21651519oP.LJII) {
                    return true;
                }
                c21651519oP.LIZJ *= scaleGestureDetector2.getScaleFactor();
                this.LL.LIZJ = Math.round(r2.LIZJ * 100) / 100.0f;
                C21651519oP c21651519oP2 = this.LL;
                c21651519oP2.LIZJ = Math.max(c21651519oP2.LIZLLL, Math.min(c21651519oP2.LJ, c21651519oP2.LIZJ));
                C21651519oP c21651519oP3 = this.LL;
                if (c21651519oP3.LIZ) {
                    if (c21651519oP3.LJI == null) {
                        View view = c21651519oP3.LJIIZILJ;
                        if (view != null) {
                            float focusX = scaleGestureDetector2.getFocusX();
                            float focusY = scaleGestureDetector2.getFocusY();
                            c21651519oP3.getClass();
                            float f = 1;
                            pointF = new PointF(C13LZ.LIZLLL((focusX - (view.getX() + (view.getPivotX() * (f - view.getScaleX())))) / view.getScaleX(), 0.0f, view.getWidth()), C13LZ.LIZLLL((focusY - (view.getY() + (view.getPivotY() * (f - view.getScaleY())))) / view.getScaleY(), 0.0f, view.getHeight()));
                        } else {
                            pointF = null;
                        }
                        c21651519oP3.LJI = pointF;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C21651519oP c21651519oP4 = this.LL;
                    c21651519oP4.LJ(c21651519oP4.LJIIZILJ, z3);
                    C21651519oP c21651519oP5 = this.LL;
                    c21651519oP5.LJ(c21651519oP5.LJIJI, z3);
                } else {
                    View view2 = c21651519oP3.LJIIZILJ;
                    if (view2 != null) {
                        C786410Ut5.Ob(view2, c21651519oP3.LIZJ);
                        C786410Ut5.pc(view2, c21651519oP3.LIZJ);
                        view2.setPivotX(scaleGestureDetector2.getFocusX());
                        view2.setPivotY(scaleGestureDetector2.getFocusY());
                    }
                    C21651519oP c21651519oP6 = this.LL;
                    ViewGroup viewGroup = c21651519oP6.LJIJI;
                    if (viewGroup != null) {
                        C786410Ut5.Lb(c21651519oP6.LIZJ, viewGroup);
                        C786410Ut5.mc(c21651519oP6.LIZJ, viewGroup);
                        viewGroup.setPivotX(scaleGestureDetector2.getFocusX());
                        viewGroup.setPivotY(scaleGestureDetector2.getFocusY());
                    }
                }
                C21651519oP c21651519oP7 = this.LL;
                InterfaceC707080RoQ interfaceC707080RoQ = c21651519oP7.LJIILLIIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScale(c21651519oP7.LIZJ);
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector2) {
                this.LL.LJI = null;
                if (((Number) C265700AbA.LIZ.getValue()).intValue() == 1) {
                    C21651519oP c21651519oP = this.LL;
                    View view = c21651519oP.LJIIZILJ;
                    if (view != null) {
                        c21651519oP.LJIIJJI = view.getPivotX();
                        c21651519oP.LJIIL = view.getPivotY();
                    }
                    C21651519oP c21651519oP2 = this.LL;
                    ViewGroup viewGroup = c21651519oP2.LJIJI;
                    if (viewGroup != null) {
                        c21651519oP2.LJIIJJI = viewGroup.getPivotX();
                        c21651519oP2.LJIIL = viewGroup.getPivotY();
                    }
                }
                InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LJIILLIIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScaleBegin();
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector2) {
                InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LJIILLIIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScaleEnd();
                }
                if (!this.LL.LIZ && ((Number) C265700AbA.LIZ.getValue()).intValue() == 1) {
                    C21651519oP c21651519oP = this.LL;
                    View view = c21651519oP.LJIIZILJ;
                    if (view != null) {
                        view.setPivotX(c21651519oP.LJIIJJI);
                        view.setPivotY(c21651519oP.LJIIL);
                    }
                    C21651519oP c21651519oP2 = this.LL;
                    ViewGroup viewGroup = c21651519oP2.LJIJI;
                    if (viewGroup != null) {
                        viewGroup.setPivotX(c21651519oP2.LJIIJJI);
                        viewGroup.setPivotY(c21651519oP2.LJIIL);
                    }
                }
            }
        });
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.LJIILL = scaleGestureDetector;
        this.LJIJJLI = new RectF();
    }
}
