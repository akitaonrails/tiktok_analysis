package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0STN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STN implements View.OnTouchListener {
    public static final /* synthetic */ int LLJJJ = 0;
    public final float LL;
    public final float LLILLJJLI;
    public final C01GW LLILLL;
    public EnumC584550MwH LLILZ;
    public ScaleGestureDetector LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1482650ogZ LLJI;
    public FrameLayout LLJIJIL;
    public InterfaceC707080RoQ LLJILJIL;
    public EnumC585170MxH LLJILJILJ;
    public PointF LLJILLL;
    public PointF LLJJ;
    public PointF LLJJI;
    public float LLJJIII;
    public View LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public final C0STO LLJJIJIL;

    public final void LIZJ() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorX;
        ViewPropertyAnimator viewPropertyAnimatorY;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout == null || (viewPropertyAnimatorAnimate = frameLayout.animate()) == null || (viewPropertyAnimatorX = viewPropertyAnimatorAnimate.x(this.LLJJI.x)) == null || (viewPropertyAnimatorY = viewPropertyAnimatorX.y(this.LLJJI.y)) == null || (viewPropertyAnimatorScaleX = viewPropertyAnimatorY.scaleX(1.0f)) == null || (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.0f)) == null || (interpolator = viewPropertyAnimatorScaleY.setInterpolator(new DecelerateInterpolator())) == null || (viewPropertyAnimatorWithStartAction = interpolator.withStartAction(new ARunnableS111S0100000_11(this, 132))) == null || (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorWithStartAction.withEndAction(new ARunnableS109S0100000_9(this, 183))) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    public final void LJ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        InterfaceC1482650ogZ interfaceC1482650ogZ;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.LLJ || C0BKF.LIZIZ) {
            FrameLayout frameLayout = this.LLJIJIL;
            if (frameLayout != null && (viewPropertyAnimatorAnimate = frameLayout.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            InterfaceC1482650ogZ interfaceC1482650ogZ2 = this.LLJI;
            if (interfaceC1482650ogZ2 != null) {
                interfaceC1482650ogZ2.LIZ();
            }
            if (C291140Bb6.LIZ() && (interfaceC1482650ogZ = this.LLJI) != null) {
                interfaceC1482650ogZ.LIZJ();
            }
            View view = this.LLIZLLLIL;
            if (view != null && (viewGroup4 = this.LLIZ) != null && viewGroup4.indexOfChild(view) != -1 && (viewGroup5 = this.LLIZ) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup5);
            }
            FrameLayout frameLayout2 = this.LLJIJIL;
            if (frameLayout2 != null) {
                ViewGroup viewGroup6 = this.LLIZ;
                if (viewGroup6 != null && viewGroup6.indexOfChild(frameLayout2) != -1 && (viewGroup3 = this.LLIZ) != null) {
                    C786410Ut5.LJJJLZIJ(frameLayout2, viewGroup3);
                }
                View childAt = frameLayout2.getChildAt(0);
                if (childAt != null) {
                    C786410Ut5.LJJJZ(childAt, frameLayout2);
                    if (C287800BPu.LIZ() && (viewGroup2 = this.LLILZLL) != null && viewGroup2.getChildCount() == 0) {
                        ViewGroup viewGroup7 = this.LLILZLL;
                        if (viewGroup7 != null) {
                            viewGroup7.addView(childAt);
                        }
                    } else {
                        ViewGroup viewGroup8 = this.LLILZLL;
                        if (viewGroup8 != null) {
                            viewGroup8.addView(childAt);
                        }
                    }
                    View view2 = this.LLJJIJI;
                    if (view2 != null && this.LLJJIJIIJIL != null) {
                        C786410Ut5.LJJJZ(view2, frameLayout2);
                        View view3 = this.LLJJIJI;
                        if (view3 != null) {
                            try {
                                ViewGroup viewGroup9 = this.LLJJIJIIJIL;
                                if (viewGroup9 != null && viewGroup9.indexOfChild(view3) != -1 && (viewGroup = this.LLJJIJIIJIL) != null) {
                                    C786410Ut5.LJJJLZIJ(view3, viewGroup);
                                }
                                ViewGroup viewGroup10 = this.LLJJIJIIJIL;
                                if (viewGroup10 != null) {
                                    viewGroup10.addView(view3);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                ((AbstractC1604130rqV) this.LLILLL.getValue()).LJII(AFwS198S0000000_11.get$arr$(427));
                            }
                        }
                    }
                }
            }
            ViewGroup viewGroup11 = this.LLILZLL;
            if (viewGroup11 != null) {
                C786410Ut5.LJLZ(0, viewGroup11);
            }
            this.LLJIJIL = null;
            this.LLIZLLLIL = null;
            this.LLJJIII = 1.0f;
            this.LLJJ = new PointF();
            this.LLJILLL = new PointF();
            this.LLJ = false;
            this.LLJILJILJ = EnumC585170MxH.IDLE;
            InterfaceC707080RoQ interfaceC707080RoQ = this.LLJILJIL;
            if (interfaceC707080RoQ != null) {
                interfaceC707080RoQ.LJZL();
            }
            ((AbstractC1604130rqV) this.LLILLL.getValue()).LJIIJJI(AFwS198S0000000_11.get$arr$(428));
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0STO] */
    public C0STN() {
        this.LL = C716990SAn.LIZ() ? PinchToClearModeSettings.LIZ().minScale : 1.0f;
        this.LLILLJJLI = C716990SAn.LIZ() ? PinchToClearModeSettings.LIZ().maxScale : 4.0f;
        this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new C587730N3j());
        this.LLILZ = EnumC584550MwH.VIDEO;
        this.LLJILJILJ = EnumC585170MxH.IDLE;
        this.LLJILLL = new PointF();
        this.LLJJ = new PointF();
        this.LLJJI = new PointF();
        this.LLJJIII = 1.0f;
        this.LLJJIJIL = new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.0STO
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C0STN c0stn = this.LL;
                float scaleFactor = c0stn.LLJJIII * scaleGestureDetector.getScaleFactor();
                c0stn.LLJJIII = scaleFactor;
                c0stn.LLJJIII = Math.max(c0stn.LL, Math.min(scaleFactor, c0stn.LLILLJJLI));
                FrameLayout frameLayout = c0stn.LLJIJIL;
                if (frameLayout != null) {
                    C786410Ut5.Pb(frameLayout, c0stn.LLJJIII);
                    C786410Ut5.qc(frameLayout, c0stn.LLJJIII);
                    frameLayout.setPivotX((scaleGestureDetector.getFocusX() - frameLayout.getTranslationX()) - frameLayout.getLeft());
                    frameLayout.setPivotY((scaleGestureDetector.getFocusY() - frameLayout.getTranslationY()) - frameLayout.getTop());
                }
                InterfaceC707080RoQ interfaceC707080RoQ = c0stn.LLJILJIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScale(c0stn.LLJJIII);
                    return true;
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJILJIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScaleBegin();
                    return true;
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                InterfaceC707080RoQ interfaceC707080RoQ = this.LL.LLJILJIL;
                if (interfaceC707080RoQ != null) {
                    interfaceC707080RoQ.onScaleEnd();
                }
            }
        };
    }

    public final void LIZLLL() {
        LJ();
        this.LLIZ = null;
        this.LLILZLL = null;
        this.LLJI = null;
        this.LLJILJIL = null;
        this.LLILZIL = null;
        ((AbstractC1604130rqV) this.LLILLL.getValue()).LJIIJJI(new C0STP());
    }

    public static void LIZIZ(MotionEvent motionEvent, PointF pointF) {
        if (motionEvent.getPointerCount() == 2) {
            float f = 2;
            pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / f, (motionEvent.getY(0) + motionEvent.getY(1)) / f);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf;
        View childAt;
        Object parent;
        Drawable background;
        ColorDrawable colorDrawable;
        View view2;
        View viewFindViewById;
        ViewParent parent2;
        ViewGroup viewGroup;
        InterfaceC1482650ogZ interfaceC1482650ogZ;
        ScaleGestureDetector scaleGestureDetector;
        if (!this.LLJ && motionEvent != null && motionEvent.getPointerCount() <= 2 && motionEvent != null && (scaleGestureDetector = this.LLILZIL) != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        Integer numValueOf2 = null;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 5) {
                if (this.LLJILJILJ == EnumC585170MxH.IDLE && motionEvent.getPointerCount() == 2) {
                    this.LLJILJILJ = EnumC585170MxH.ZOOM;
                    LIZIZ(motionEvent, this.LLJILLL);
                    ViewGroup viewGroup2 = this.LLILZLL;
                    if (viewGroup2 != null && (childAt = viewGroup2.getChildAt(0)) != null) {
                        InterfaceC707080RoQ interfaceC707080RoQ = this.LLJILJIL;
                        if (interfaceC707080RoQ != null) {
                            interfaceC707080RoQ.LJJJIL();
                        }
                        viewGroup2.requestDisallowInterceptTouchEvent(true);
                        this.LLJIJIL = new FrameLayout(viewGroup2.getContext());
                        FrameLayout frameLayout = this.LLJIJIL;
                        if (frameLayout != null) {
                            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(viewGroup2.getWidth(), viewGroup2.getHeight()));
                        }
                        if ((childAt instanceof C1473870oSP) || (childAt instanceof C1473810oSJ) || (childAt instanceof C1473990oSb) || this.LLILZ == EnumC584550MwH.IMAGE) {
                            InterfaceC1482650ogZ interfaceC1482650ogZ2 = this.LLJI;
                            if (interfaceC1482650ogZ2 != null) {
                                interfaceC1482650ogZ2.LIZ();
                            }
                            if (C291140Bb6.LIZ() && (interfaceC1482650ogZ = this.LLJI) != null) {
                                interfaceC1482650ogZ.LIZJ();
                            }
                            C786410Ut5.LJJJLZIJ(childAt, viewGroup2);
                            FrameLayout frameLayout2 = this.LLJIJIL;
                            if (frameLayout2 != null) {
                                frameLayout2.addView(childAt);
                            }
                            View view3 = this.LLJJIJI;
                            if (view3 != null) {
                                ViewParent parent3 = view3.getParent();
                                if (parent3 instanceof ViewGroup) {
                                    viewGroup = (ViewGroup) parent3;
                                } else {
                                    viewGroup = null;
                                }
                                this.LLJJIJIIJIL = viewGroup;
                                if (viewGroup != null) {
                                    C786410Ut5.LJJJLZIJ(this.LLJJIJI, viewGroup);
                                }
                                FrameLayout frameLayout3 = this.LLJIJIL;
                                if (frameLayout3 != null) {
                                    frameLayout3.addView(this.LLJJIJI);
                                }
                            }
                            viewGroup2.getLocationInWindow(new int[2]);
                            PointF pointF = new PointF(r6[0], r6[1]);
                            this.LLJJI = pointF;
                            FrameLayout frameLayout4 = this.LLJIJIL;
                            if (frameLayout4 != null) {
                                C786410Ut5.Gd(frameLayout4, pointF.x);
                            }
                            FrameLayout frameLayout5 = this.LLJIJIL;
                            if (frameLayout5 != null) {
                                C786410Ut5.Md(frameLayout5, this.LLJJI.y);
                            }
                            ViewParent parent4 = viewGroup2.getParent();
                            if (parent4 != null && (parent2 = parent4.getParent()) != null) {
                                parent = parent2.getParent();
                            } else {
                                parent = null;
                            }
                            if ((parent instanceof View) && (view2 = (View) parent) != null && (viewFindViewById = view2.findViewById(R.id.long_press_layout)) != null) {
                                background = viewFindViewById.getBackground();
                            } else {
                                background = null;
                            }
                            if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
                                numValueOf2 = Integer.valueOf(colorDrawable.getColor());
                            }
                            View view4 = new View(viewGroup2.getContext());
                            view4.setBackgroundResource(0);
                            if (numValueOf2 != null && numValueOf2.intValue() != 0) {
                                view4.setBackgroundColor(numValueOf2.intValue());
                            } else {
                                view4.setBackgroundColor(-16777216);
                            }
                            view4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0STQ
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view5, MotionEvent motionEvent2) {
                                    return true;
                                }
                            });
                            this.LLIZLLLIL = view4;
                            ViewGroup viewGroup3 = this.LLIZ;
                            if (viewGroup3 != null) {
                                viewGroup3.addView(view4);
                                viewGroup3.addView(this.LLJIJIL);
                            }
                            C786410Ut5.LJLZ(4, viewGroup2);
                        }
                    }
                    ((AbstractC1604130rqV) this.LLILLL.getValue()).LJIIJJI(AFwS198S0000000_11.get$arr$(429));
                }
            } else if (numValueOf.intValue() == 2) {
                if (this.LLJILJILJ == EnumC585170MxH.ZOOM && motionEvent.getPointerCount() == 2) {
                    LIZIZ(motionEvent, this.LLJJ);
                    PointF pointF2 = this.LLJJ;
                    float f = pointF2.x;
                    PointF pointF3 = this.LLJILLL;
                    float f2 = f - pointF3.x;
                    pointF2.x = f2;
                    float f3 = pointF2.y - pointF3.y;
                    pointF2.y = f3;
                    PointF pointF4 = this.LLJJI;
                    pointF2.x = f2 + pointF4.x;
                    pointF2.y = f3 + pointF4.y;
                    FrameLayout frameLayout6 = this.LLJIJIL;
                    if (frameLayout6 != null) {
                        C786410Ut5.Gd(frameLayout6, pointF2.x);
                    }
                    FrameLayout frameLayout7 = this.LLJIJIL;
                    if (frameLayout7 != null) {
                        C786410Ut5.Md(frameLayout7, this.LLJJ.y);
                        return true;
                    }
                }
            } else if (numValueOf.intValue() == 1) {
                if (this.LLJILJILJ == EnumC585170MxH.ZOOM) {
                    this.LLJILJILJ = EnumC585170MxH.IDLE;
                }
                ViewGroup viewGroup4 = this.LLILZLL;
                if (viewGroup4 != null) {
                    viewGroup4.requestDisallowInterceptTouchEvent(false);
                }
                if (this.LLJ) {
                    return false;
                }
            } else if (numValueOf.intValue() == 6) {
                if (this.LLJILJILJ == EnumC585170MxH.ZOOM) {
                    LIZJ();
                    return true;
                }
            } else if (numValueOf.intValue() == 3 && this.LLJILJILJ == EnumC585170MxH.ZOOM) {
                LIZJ();
                ViewGroup viewGroup5 = this.LLILZLL;
                if (viewGroup5 != null) {
                    viewGroup5.requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        }
        return true;
    }

    public final void LIZ(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC1482650ogZ interfaceC1482650ogZ, InterfaceC707080RoQ interfaceC707080RoQ, EnumC584550MwH enumC584550MwH, View view) {
        ScaleGestureDetector scaleGestureDetector;
        if (this.LLIZ != null && this.LLILZLL != null && ((this.LLJI != null || this.LLILZ != EnumC584550MwH.VIDEO) && this.LLJILJIL != null && this.LLILZIL != null)) {
            LIZLLL();
        }
        this.LLIZ = viewGroup;
        this.LLILZLL = viewGroup2;
        this.LLJI = interfaceC1482650ogZ;
        this.LLJJIJI = view;
        this.LLILZ = enumC584550MwH;
        this.LLJILJIL = interfaceC707080RoQ;
        if (context != null) {
            scaleGestureDetector = new ScaleGestureDetector(context, this.LLJJIJIL);
            scaleGestureDetector.setQuickScaleEnabled(false);
        } else {
            scaleGestureDetector = null;
        }
        this.LLILZIL = scaleGestureDetector;
        ((AbstractC1604130rqV) this.LLILLL.getValue()).LJIIJJI(AFwS195S0000000_9.get$arr$(506));
    }
}
