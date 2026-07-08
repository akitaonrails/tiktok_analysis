package X;

import Y.ALAdapterS26S0100000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21368618js {
    public static final int LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(184));
    public final View LIZ;
    public final AbstractC1452680nuE LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public float LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public ValueAnimator LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public ViewOutlineProvider LJIILIIL;
    public boolean LJIILJJIL;
    public ViewOutlineProvider LJIILL;
    public boolean LJIILLIIL;
    public final C19LX LJIIZILJ;

    public final void LJ() {
        if (this.LJIILLIIL) {
            return;
        }
        this.LJIILLIIL = true;
        ValueAnimator valueAnimator = this.LJIIJ;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.LJIIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LJIIJ = null;
        LJFF();
        this.LIZ.removeOnAttachStateChangeListener(this.LJIIZILJ);
    }

    public final void LJFF() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.ed(view, 0.0f);
            if (this.LJI) {
                C786410Ut5.Ob(view, 1.0f);
                C786410Ut5.pc(view, 1.0f);
            }
        }
        if (this.LJIIJJI) {
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setOutlineProvider(this.LJIILIIL);
                view2.setClipToOutline(this.LJIIL);
            }
            SurfaceView surfaceViewLJIJJLI = this.LIZIZ.LJJ().LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                surfaceViewLJIJJLI.setOutlineProvider(this.LJIILL);
                surfaceViewLJIJJLI.setClipToOutline(this.LJIILJJIL);
            }
            this.LJIILIIL = null;
            this.LJIILL = null;
            this.LJIIJJI = false;
        }
        this.LJII = 0.0f;
    }

    public final void LIZLLL(float f) {
        this.LJII = f;
        float fFloatValue = (-f) * ((Number) this.LJIIIIZZ.getValue()).floatValue();
        if (this.LJI) {
            float f2 = 1.0f - (f * 0.123076975f);
            View view = this.LIZJ;
            if (view != null) {
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                C786410Ut5.ed(view, fFloatValue);
                C786410Ut5.Ob(view, f2);
                C786410Ut5.pc(view, f2);
                view.invalidateOutline();
            }
            SurfaceView surfaceViewLJIJJLI = this.LIZIZ.LJJ().LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                surfaceViewLJIJJLI.invalidateOutline();
                return;
            }
            return;
        }
        View view2 = this.LIZJ;
        if (view2 == null) {
            return;
        }
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        C786410Ut5.ed(view2, fFloatValue);
    }

    public final void LIZIZ(Function0<Unit> function0, Function0<Unit> function02) {
        if (this.LJIILLIIL) {
            return;
        }
        function0.invoke();
        if (this.LJI && !this.LJIIJJI) {
            final View view = this.LIZJ;
            if (view != null) {
                this.LJIILIIL = view.getOutlineProvider();
                this.LJIIL = view.getClipToOutline();
                view.setOutlineProvider(new ViewOutlineProvider(view) { // from class: X.18ZJ
                    public final View LIZ;

                    {
                        this.LIZ = view;
                    }

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view2, Outline outline) {
                        float fFloatValue = ((Number) this.LIZIZ.LJIIIZ.getValue()).floatValue() * this.LIZIZ.LJII;
                        int width = view2.getWidth();
                        int height = view2.getHeight();
                        if (width > 0 && height > 0) {
                            int i = (int) (width / 0.75f);
                            if (i > height) {
                                i = height;
                            }
                            int i2 = (height - i) / 2;
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            outline.setRoundRect(0, i2, width, i2 + i, fFloatValue);
                            return;
                        }
                        outline.setRoundRect(0, 0, width, height, fFloatValue);
                    }
                });
                view.setClipToOutline(true);
            }
            final SurfaceView surfaceViewLJIJJLI = this.LIZIZ.LJJ().LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                this.LJIILL = surfaceViewLJIJJLI.getOutlineProvider();
                this.LJIILJJIL = surfaceViewLJIJJLI.getClipToOutline();
                surfaceViewLJIJJLI.setOutlineProvider(new ViewOutlineProvider(surfaceViewLJIJJLI) { // from class: X.18ZJ
                    public final View LIZ;

                    {
                        this.LIZ = surfaceViewLJIJJLI;
                    }

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view2, Outline outline) {
                        float fFloatValue = ((Number) this.LIZIZ.LJIIIZ.getValue()).floatValue() * this.LIZIZ.LJII;
                        int width = view2.getWidth();
                        int height = view2.getHeight();
                        if (width > 0 && height > 0) {
                            int i = (int) (width / 0.75f);
                            if (i > height) {
                                i = height;
                            }
                            int i2 = (height - i) / 2;
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            outline.setRoundRect(0, i2, width, i2 + i, fFloatValue);
                            return;
                        }
                        outline.setRoundRect(0, 0, width, height, fFloatValue);
                    }
                });
                surfaceViewLJIJJLI.setClipToOutline(true);
            }
            this.LJIIJJI = true;
        }
        LIZLLL(0.0f);
        LIZ(0.0f, 1.0f, new AwS576S0100000_32(function02, 788));
        C12C5.LIZLLL(this.LIZ, 0L, LJIJ, 0.0f, C1619980sG4.LJIILIIL(), null, 41);
    }

    public final void LIZJ(Function0<Unit> function0, Function0<Unit> function02) {
        if (this.LJIILLIIL) {
            return;
        }
        function0.invoke();
        LIZ(this.LJII, 0.0f, new AwS433S0200000_32(this, (C21368618js) function02, (Function0<Unit>) 80));
        C12C5.LIZLLL(this.LIZ, 0L, 0.0f, LJIJ, C1619980sG4.LJIILIIL(), null, 41);
    }

    public final void LIZ(float f, float f2, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.LJIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 28));
        valueAnimatorOfFloat.addListener(new ALAdapterS26S0100000_32(function0, 20));
        this.LJIIJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public C21368618js(View view, AbstractC1452680nuE abstractC1452680nuE, View view2, int i, int i2, int i3) {
        this.LIZ = view;
        this.LIZIZ = abstractC1452680nuE;
        this.LIZJ = view2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        C1446760nkg.LIZ.getClass();
        this.LJI = C1446760nkg.LIZJ();
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 789));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1535));
        C19LX c19lx = new C19LX(this, 7);
        this.LJIIZILJ = c19lx;
        view.addOnAttachStateChangeListener(c19lx);
    }
}
