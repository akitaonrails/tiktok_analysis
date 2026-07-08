package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import u4.q0;

/* JADX INFO: renamed from: X.0F6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384700F6m extends AbstractC1664490tPr<C382890Ezn, C0F0R> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 234));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 231));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 232));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 236));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 238));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 233));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 240));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 241));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 242));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 235));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 237));
    public Boolean LLJLLL;
    public boolean LLJZ;
    public ARunnableS105S0100000_5 LLJZIJLIL;
    public RunnableC384710F6n LLL;

    public final void LLLLLJIL() {
        RunnableC384710F6n runnableC384710F6n;
        View view = this.mView;
        if (view == null || (runnableC384710F6n = this.LLL) == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(view, runnableC384710F6n);
        this.LLL = null;
    }

    public final LinearLayout LLLLLJLJLL() {
        return (LinearLayout) this.LLJJJJJIL.getValue();
    }

    public final C385350F8z LLLLLL() {
        return (C385350F8z) this.LLJJJIL.getValue();
    }

    public final LinearLayout LLLLLLIL() {
        return (LinearLayout) this.LLJJJJLIIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0F6n, java.lang.Runnable] */
    public final void LLLLLLJ() {
        Context sceneContext;
        final InputMethodManager inputMethodManager;
        final View view = this.mView;
        if (view == null || (sceneContext = getSceneContext()) == null) {
            return;
        }
        Object objH2 = C786410Ut5.H2(sceneContext, "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        LLLLLJIL();
        LLLLLL().setFocusable(true);
        LLLLLL().setFocusableInTouchMode(true);
        LLLLLL().requestFocus();
        final C385350F8z c385350F8zLLLLLL = LLLLLL();
        ?? r0 = new Runnable() { // from class: X.0F6n
            public int LL = 6;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EPAIGCEditTextScene@bff1.requestShowImeWithRetry$runnable$1");
                try {
                    int i = this.LL;
                    if (i > 0) {
                        this.LL = i - 1;
                        if (!view.hasWindowFocus() || !inputMethodManager.showSoftInput(c385350F8zLLLLLL, 1)) {
                            HandlerHook.viewPostDelay(view, this, 50L);
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EPAIGCEditTextScene@bff1.requestShowImeWithRetry$runnable$1");
            }
        };
        this.LLL = r0;
        HandlerHook.viewPost(view, r0);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        if (LLLLILI().LIZ.LIZ) {
            LLLLLLJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Drawable drawableMutate;
        super.onActivityCreated(bundle);
        Drawable background = ((View) this.LLJLL.getValue()).getBackground();
        if (background != null) {
            drawableMutate = background.mutate();
        } else {
            drawableMutate = null;
        }
        final float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        final float fMax = Math.max(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)) - (fLIZIZ / 2.0f));
        Drawable layerDrawable = new Drawable(fLIZIZ, fMax) { // from class: X.0F6t
            public final float LIZ;
            public final float LIZIZ;
            public final Paint LIZJ;
            public final RectF LIZLLL;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                RectF rectF = this.LIZLLL;
                float f = this.LIZIZ;
                canvas.drawRoundRect(rectF, f, f, this.LIZJ);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                RectF rectF = this.LIZLLL;
                float f = rect.left;
                float f2 = this.LIZ;
                rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
                float fCenterX = this.LIZLLL.centerX();
                float fCenterY = this.LIZLLL.centerY();
                SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, new int[]{1392508927, 16777215, 1728053247, 872415231, 570425343, 1392508927, 16777215}, new float[]{0.0f, 0.1363f, 0.3702f, 0.4996f, 0.6571f, 0.9995f, 1.0f});
                Matrix matrix = new Matrix();
                matrix.preRotate(90.0f, fCenterX, fCenterY);
                sweepGradient.setLocalMatrix(matrix);
                this.LIZJ.setShader(sweepGradient);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LIZJ.setAlpha(i);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZJ.setColorFilter(colorFilter);
            }

            {
                this.LIZ = fLIZIZ;
                this.LIZIZ = fMax;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fLIZIZ);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.LIZJ = paint;
                this.LIZLLL = new RectF();
            }
        };
        View view = (View) this.LLJLL.getValue();
        if (drawableMutate != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{drawableMutate, layerDrawable});
        }
        view.setBackground(layerDrawable);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F6p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 244));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LJIILIIL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 245));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F6q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LJIIL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 246));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C382890Ezn) obj).LJIIIIZZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 247));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382890Ezn) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 248));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F6r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 249));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F6l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382890Ezn) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 250));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C382890Ezn) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 251));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C382890Ezn) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 252));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F10
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 239));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F01
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382890Ezn) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 242));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382890Ezn) obj).LJIILJJIL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 243));
        C786410Ut5.R7((LinearLayout) this.LLJJJJ.getValue(), new ACListenerS140S0100000_5(this, 16));
        C786410Ut5.R7(LLLLLJLJLL(), new ACListenerS140S0100000_5(this, 17));
        C786410Ut5.R7(LLLLLLIL(), new ACListenerS140S0100000_5(this, 18));
        LLLLLL().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0F6e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z && this.LL.LLLLILI().LIZ.LIZLLL) {
                    this.LL.LLLLIL().LIZIZ.invoke();
                }
            }
        });
        C385350F8z c385350F8zLLLLLL = LLLLLL();
        View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 19);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
        }
        a aVar = new a(aCListenerS140S0100000_5);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c385350F8zLLLLLL);
        }
        c385350F8zLLLLLL.setOnClickListener(aVar);
        final C0F73 c0f73 = (C0F73) this.LLJLLIL.getValue();
        if (!c0f73.LJI) {
            c0f73.LJI = true;
            View view2 = (View) c0f73.LIZLLL.getValue();
            if (view2 != null) {
                if (c0f73.LJII == null) {
                    c0f73.LJII = Float.valueOf(view2.getTranslationY());
                }
                final int i = 1;
                C14K9.LJIJJ(c0f73.LIZ, new C0TVI(c0f73, i) { // from class: X.0FXI
                    public final int $t;
                    public Object l0;

                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                        switch (this.$t) {
                            case 0:
                                return onApplyWindowInsets$0(this, view3, c20246014Ju);
                            case 1:
                                return onApplyWindowInsets$1(this, view3, c20246014Ju);
                            default:
                                return null;
                        }
                    }

                    {
                        this.$t = i;
                        this.l0 = c0f73;
                    }

                    public static final C20246014Ju onApplyWindowInsets$0(C0FXI c0fxi, View view3, C20246014Ju c20246014Ju) {
                        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                        C384700F6m c384700F6m = (C384700F6m) c0fxi.l0;
                        Boolean bool = c384700F6m.LLJLLL;
                        c384700F6m.LLJLLL = Boolean.valueOf(zLJIIIIZZ);
                        if (Intrinsics.LJFF(bool, Boolean.TRUE) && !zLJIIIIZZ && ((C384700F6m) c0fxi.l0).LLLLLL().hasFocus() && ((C384700F6m) c0fxi.l0).mView.hasWindowFocus() && !((C384700F6m) c0fxi.l0).LLLLILI().LIZ.LIZLLL) {
                            ((C384700F6m) c0fxi.l0).LLLLIL().LIZIZ.invoke();
                        }
                        return c20246014Ju;
                    }

                    public static final C20246014Ju onApplyWindowInsets$1(C0FXI c0fxi, View view3, C20246014Ju c20246014Ju) {
                        int i2 = c20246014Ju.LIZ(8).LIZLLL;
                        boolean z = false;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        int i3 = c20246014Ju.LIZ(2).LIZLLL;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        C0F73 c0f732 = (C0F73) c0fxi.l0;
                        c0f732.LJIILL = i3;
                        if (i2 != c0f732.LJIJ || i3 != c0f732.LJIJI) {
                            z = true;
                        }
                        c0f732.LJIJ = i2;
                        c0f732.LJIJI = i3;
                        if (z && !c0f732.LJIILJJIL) {
                            c0f732.LIZ(c0f732.LJIJJ);
                        }
                        return c20246014Ju;
                    }
                });
                q0.LJJII(c0f73.LIZ, new C14JJ() { // from class: X.0F74
                    {
                        super(1);
                    }

                    @Override // X.C14JJ
                    public final void LIZ(C14JM c14jm) {
                        C0F73 c0f732 = c0f73;
                        boolean z = true;
                        int i2 = c0f732.LJIILLIIL - 1;
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        c0f732.LJIILLIIL = i2;
                        if (i2 <= 0) {
                            z = false;
                        }
                        c0f732.LJIILJJIL = z;
                        c0f732.getClass();
                        C0F73 c0f733 = c0f73;
                        if (!c0f733.LJIILJJIL) {
                            c0f733.LIZ(0L);
                        }
                    }

                    @Override // X.C14JJ
                    public final void LIZIZ(C14JM c14jm) {
                        C0F73 c0f732 = c0f73;
                        c0f732.LJIILLIIL++;
                        c0f732.LJIILJJIL = true;
                        c0f732.getClass();
                    }

                    @Override // X.C14JJ
                    public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                        C0F73 c0f732 = c0f73;
                        c20246014Ju.LIZ(8);
                        c0f732.getClass();
                        return c20246014Ju;
                    }
                });
                C20097313kJ.LIZJ(c0f73.LIZ);
            }
        }
        final int i2 = 0;
        C14K9.LJIJJ(this.mView, new C0TVI(this, i2) { // from class: X.0FXI
            public final int $t;
            public Object l0;

            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                switch (this.$t) {
                    case 0:
                        return onApplyWindowInsets$0(this, view3, c20246014Ju);
                    case 1:
                        return onApplyWindowInsets$1(this, view3, c20246014Ju);
                    default:
                        return null;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final C20246014Ju onApplyWindowInsets$0(C0FXI c0fxi, View view3, C20246014Ju c20246014Ju) {
                boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                C384700F6m c384700F6m = (C384700F6m) c0fxi.l0;
                Boolean bool = c384700F6m.LLJLLL;
                c384700F6m.LLJLLL = Boolean.valueOf(zLJIIIIZZ);
                if (Intrinsics.LJFF(bool, Boolean.TRUE) && !zLJIIIIZZ && ((C384700F6m) c0fxi.l0).LLLLLL().hasFocus() && ((C384700F6m) c0fxi.l0).mView.hasWindowFocus() && !((C384700F6m) c0fxi.l0).LLLLILI().LIZ.LIZLLL) {
                    ((C384700F6m) c0fxi.l0).LLLLIL().LIZIZ.invoke();
                }
                return c20246014Ju;
            }

            public static final C20246014Ju onApplyWindowInsets$1(C0FXI c0fxi, View view3, C20246014Ju c20246014Ju) {
                int i22 = c20246014Ju.LIZ(8).LIZLLL;
                boolean z = false;
                if (i22 < 0) {
                    i22 = 0;
                }
                int i3 = c20246014Ju.LIZ(2).LIZLLL;
                if (i3 < 0) {
                    i3 = 0;
                }
                C0F73 c0f732 = (C0F73) c0fxi.l0;
                c0f732.LJIILL = i3;
                if (i22 != c0f732.LJIJ || i3 != c0f732.LJIJI) {
                    z = true;
                }
                c0f732.LJIJ = i22;
                c0f732.LJIJI = i3;
                if (z && !c0f732.LJIILJJIL) {
                    c0f732.LIZ(c0f732.LJIJJ);
                }
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(this.mView);
        LLLLLL().addTextChangedListener(new C0FX5(this, 1));
        LLLLLL().setOnBackPressedPreIme(new AwS549S0100000_5(this, 239));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c1k, viewGroup, false);
    }
}
