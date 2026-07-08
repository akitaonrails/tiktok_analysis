package X;

import Y.ALAdapterS3S0110000_11;
import Y.ALAdapterS8S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.PhotoModeNewPinchConfigSettings;
import com.ss.android.ugc.aweme.settings.PinchToClearModeSettings;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0STE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STE implements View.OnTouchListener {
    public final View LL;
    public final ViewGroup LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C0STJ LLILZ;
    public final InterfaceC720380SNo LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Context LLJI;
    public final PhotoModeNewPinchConfigSettings.PhotoModeNewPinchConfig LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public EnumC585210MxL LLJJIJIIJIL;
    public PointF LLJJIJIL;
    public PointF LLJJJ;
    public PointF LLJJJIL;
    public PointF LLJJJJ;
    public PointF LLJJJJJIL;
    public PointF LLJJJJLIIL;
    public PointF LLJJL;
    public PointF LLJJLIIIJLLLLLLLZ;
    public EnumC719760SLe LLJL;
    public EnumC719760SLe LLJLIL;
    public PointF LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public Float LLJLLL;
    public ValueAnimator LLJZ;
    public EnumC1995107rh LLJZIJLIL;
    public EnumC1983407po LLL;
    public ValueAnimator LLLF;
    public float LLLFF;
    public float LLLFFI;
    public String LLLFZ;
    public int LLLI;
    public C0STI LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public float LLLIIL;
    public ValueAnimator LLLIILIL;
    public ValueAnimator LLLIL;
    public ValueAnimator LLLILZ;
    public ValueAnimator LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public ViewOutlineProvider LLLLII;
    public boolean LLLLIIIILLL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1627));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1628));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(484));

    public final void LIZIZ() {
        if (this.LLJL != EnumC719760SLe.ZOOM_FIX) {
            return;
        }
        final float scaleX = this.LL.getScaleX();
        if (scaleX <= this.LLJJ) {
            return;
        }
        final float translationX = this.LL.getTranslationX();
        final float translationY = this.LL.getTranslationY();
        final float fLIZLLL = LIZLLL(this.LL, translationX, true, Float.valueOf(this.LLJJ));
        final float fLIZLLL2 = LIZLLL(this.LL, translationY, false, Float.valueOf(this.LLJJ));
        ValueAnimator valueAnimator = this.LLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLILZ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0STD
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                float f = scaleX;
                C0STE c0ste = this;
                float f2 = f + ((c0ste.LLJJ - f) * fFloatValue);
                C786410Ut5.Ob(c0ste.LL, f2);
                C786410Ut5.pc(this.LL, f2);
                View view = this.LL;
                float f3 = translationX;
                C786410Ut5.Jc(view, f3 + ((fLIZLLL - f3) * fFloatValue));
                View view2 = this.LL;
                float f4 = translationY;
                C786410Ut5.ed(view2, f4 + ((fLIZLLL2 - f4) * fFloatValue));
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS8S0100000_11(this, 9));
        valueAnimatorOfFloat.start();
        this.LLLIL = valueAnimatorOfFloat;
    }

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LLLIILIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LLLILZ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        this.LLJZIJLIL = EnumC1995107rh.LL;
        this.LLJL = EnumC719760SLe.ZOOM_FIX;
        this.LLJJIII = Math.max(this.LLJILLL, Math.min(this.LL.getScaleX(), this.LLJJI));
        this.LLJJJ = new PointF();
        this.LLJJIJIL = new PointF();
        this.LLJJJIL = new PointF();
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = new PointF();
        this.LLJJJJLIIL = new PointF();
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = new PointF();
        this.LLJLL = false;
        this.LLJLLIL = false;
        this.LLJJIJI = false;
        if (this.LLJJIJIIJIL == EnumC585210MxL.ZOOM) {
            this.LLJJIJIIJIL = EnumC585210MxL.IDLE;
        }
    }

    public final void LJI() {
        if (this.LLJL != EnumC719760SLe.ZOOM_FIX) {
            return;
        }
        ValueAnimator valueAnimator = this.LLLIILIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LLLILZ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        this.LLJZIJLIL = EnumC1995107rh.LL;
        this.LLJL = EnumC719760SLe.CLEAR_MODE;
        this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
        LJJIFFI(1.0f);
    }

    public final View LJIIJJI() {
        return (View) this.LLLILZLLLI.getValue();
    }

    public final FrameLayout LJIIL() {
        return (FrameLayout) this.LLJIJIL.getValue();
    }

    public final void LJIILL() {
        ViewGroup viewGroup;
        if (!((Boolean) this.LLJ.getValue()).booleanValue() || (viewGroup = this.LLILLL) == null || viewGroup.indexOfChild(LJIIJJI()) == -1) {
            return;
        }
        ValueAnimator valueAnimator = this.LLLILZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLILZJ = null;
        float alpha = LJIIJJI().getAlpha();
        if (alpha <= 0.0f) {
            C786410Ut5.LJJJLZIJ(LJIIJJI(), viewGroup);
            return;
        }
        long j = (long) (120 * alpha);
        if (j < 1) {
            j = 1;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS261S0100000_11(this, 22));
        valueAnimatorOfFloat.addListener(new ALAdapterS3S0110000_11(this, 2));
        valueAnimatorOfFloat.start();
        this.LLLILZJ = valueAnimatorOfFloat;
    }

    public final boolean LJIJI() {
        return this.LLJL == EnumC719760SLe.ZOOM_FIX;
    }

    public final boolean LJIJJ() {
        return this.LLIZ ? C295550BiD.LIZ() : C294910BhB.LIZ() && !this.LLIZLLLIL;
    }

    public final void LJJI() {
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.LLLILZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLILZJ = null;
        ViewParent parent = LJIIJJI().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(LJIIJJI(), viewGroup);
        }
        if (((Boolean) this.LLJ.getValue()).booleanValue()) {
            C786410Ut5.T4(LJIIJJI(), 0.0f);
        }
    }

    public final void LJJIII() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ValueAnimator valueAnimator = this.LLJZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLIILIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLLF;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LLLIL;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LLLILZ;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LLLILZJ;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        this.LLJZIJLIL = EnumC1995107rh.LL;
        LJIIL().animate().cancel();
        this.LL.animate().cancel();
        this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 178);
        if (((Boolean) C0B04.LIZ.getValue()).booleanValue() && (this.LLILLJJLI.isInLayout() || this.LLILLJJLI.isLayoutRequested() || (((viewGroup = this.LLILLL) != null && viewGroup.isInLayout()) || ((viewGroup2 = this.LLILLL) != null && viewGroup2.isLayoutRequested())))) {
            C786410Ut5.LJJZZIII((Handler) this.LLJILJIL.getValue(), aRunnableS111S0100000_11);
        } else {
            aRunnableS111S0100000_11.run();
        }
        View view = this.LL;
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        this.LLJJIII = 1.0f;
        this.LLJJJ = new PointF();
        this.LLJJIJIL = new PointF();
        this.LLJJJIL = new PointF();
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = new PointF();
        this.LLJJJJLIIL = new PointF();
        this.LLJJL = new PointF();
        this.LLJJLIIIJLLLLLLLZ = new PointF();
        this.LLJL = EnumC719760SLe.NORMAL;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = new PointF();
        this.LLJLL = false;
        this.LLJLLIL = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = EnumC585210MxL.IDLE;
    }

    public final boolean LJJIIJZLJL() {
        return this.LLIZ && C295550BiD.LIZ() && !((Boolean) C286310BKb.LIZ.getValue()).booleanValue();
    }

    public final boolean LJJIIZ() {
        int i = C720440SNu.LIZ[this.LLJL.ordinal()];
        if (i == 1) {
            return (LIZJ(this.LLJJIII) || LJJIIJZLJL() || this.LLJJIII > this.LLJILJILJ.zoomFixedExitThreshold) ? false : true;
        }
        if (i == 2) {
            if (this.LLJLLIL && LIZJ(this.LLJJIII)) {
                return false;
            }
            return LJIJJ() ? this.LLJJIII > this.LLJILJILJ.clearModeExitThreshold : this.LLJJIII >= PinchToClearModeSettings.LIZ().exitScale;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZLLL) {
            return false;
        }
        return LJIJJ() ? this.LLJJIII >= this.LLJILJILJ.clearModeEnterThreshold : this.LLJJIII >= PinchToClearModeSettings.LIZ().enterScale;
    }

    public final boolean LJJIIZI() {
        int i = C720440SNu.LIZ[this.LLJL.ordinal()];
        if (i == 1) {
            if (this.LLJJIII <= (LJJIIJZLJL() ? this.LLJILJILJ.clearModeExitThreshold : this.LLJILJILJ.zoomFixedExitThreshold)) {
                return false;
            }
        } else if (i != 2 || !LJIJJ() || this.LLJJIII <= this.LLJILJILJ.zoomFixedEnterThreshold) {
            return false;
        }
        return true;
    }

    public final boolean LJIJ() {
        return LJIJJ() && !this.LLIZ;
    }

    public static Pair LJIIZILJ(View view) {
        if ((view instanceof C0STF) || (view instanceof ImageView)) {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                return LJIIIZ(drawable, new LinkedHashSet());
            }
        }
        return null;
    }

    public final boolean LIZJ(float f) {
        boolean z;
        if (f <= this.LLJILJILJ.zoomFixedDirectExitThreshold) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLIZ) {
            if (((Boolean) C259460AEu.LIZ.getValue()).booleanValue() && z) {
                return true;
            }
            return false;
        }
        if (((Boolean) C0AEU.LIZ.getValue()).booleanValue() && z) {
            return true;
        }
        return false;
    }

    public final void LJII(boolean z) {
        float x = LJIIL().getX();
        float y = LJIIL().getY();
        float pivotX = LJIIL().getPivotX();
        float pivotY = LJIIL().getPivotY();
        LJIIL().animate().cancel();
        this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
        LJJI();
        float translationX = this.LL.getTranslationX();
        float translationY = this.LL.getTranslationY();
        Pair pairLJIIZILJ = LJIIZILJ(this.LL);
        FrameLayout frameLayoutLJIIL = LJIIL();
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null && viewGroup.indexOfChild(frameLayoutLJIIL) != -1) {
            C786410Ut5.LJJJLZIJ(frameLayoutLJIIL, this.LLILLL);
        }
        if (frameLayoutLJIIL.indexOfChild(this.LL) >= 0) {
            C786410Ut5.LJJJZ(this.LL, frameLayoutLJIIL);
            this.LLILLJJLI.addView(this.LL, 0);
        }
        C786410Ut5.LJLZ(0, this.LLILLJJLI);
        float f = this.LLJJIII;
        C0STB c0stb = new C0STB(this, pairLJIIZILJ, LJIIL().getWidth(), LJIIL().getHeight(), f, translationX, translationY, x, y, pivotX, pivotY);
        EnumC719760SLe enumC719760SLe = EnumC719760SLe.ZOOM_FIX;
        this.LLJL = enumC719760SLe;
        LJJIFFI(f);
        this.LLJLIL = enumC719760SLe;
        AwS129S0110000_11 awS129S0110000_11 = new AwS129S0110000_11(z, this, 7);
        View view = this.LLILLJJLI;
        while (view != null) {
            if (view.isLayoutRequested()) {
                C786410Ut5.y3(this.LLILLJJLI.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC738810SyV(this, c0stb, awS129S0110000_11, 1));
                return;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            } else {
                view = (View) parent;
            }
        }
        c0stb.invoke();
        awS129S0110000_11.invoke();
    }

    public final void LJIIIIZZ(boolean z) {
        if (this.LLJL != EnumC719760SLe.ZOOM_FIX) {
            return;
        }
        ValueAnimator valueAnimator = this.LLLIILIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LLLILZ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        this.LLJZIJLIL = EnumC1995107rh.LL;
        EnumC719760SLe enumC719760SLe = EnumC719760SLe.NORMAL;
        this.LLJL = enumC719760SLe;
        this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
        View view = this.LL;
        view.animate().cancel();
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        LJJIFFI(1.0f);
        if (z) {
            LJIIJ(enumC719760SLe);
        }
    }

    public final void LJIIJ(EnumC719760SLe enumC719760SLe) {
        this.LLILZ.LIZLLL(enumC719760SLe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0aa9, code lost:
    
        if (r4 >= r3) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0557 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 3098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0STE.LJIILJJIL(android.view.MotionEvent):void");
    }

    public final RectF LJIILLIIL(View view) {
        boolean z;
        Pair pair;
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI;
        ImageView.ScaleType scaleType;
        ImageView imageView;
        C1322090kVb c1322090kVb;
        C1331070kk5 c1331070kk5;
        Float f = this.LLJLLL;
        if (view == this.LL) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f = null;
        }
        float f2 = 1.0f;
        if (f != null) {
            pair = new Pair(f, Float.valueOf(1.0f));
        } else {
            if (LJIIZILJ(view) == null) {
                return null;
            }
            pair = new Pair(Float.valueOf(((Number) r1.getFirst()).intValue()), Float.valueOf(((Number) r1.getSecond()).intValue()));
        }
        if ((view instanceof C0STF) && (c1322090kVb = (C1322090kVb) view) != null && (c1331070kk5 = (C1331070kk5) c1322090kVb.getHierarchy()) != null && (c1331070kk5 instanceof C0STV)) {
            interfaceC1320380kSqLJIIJJI = c1331070kk5.LJIIJJI();
        } else {
            interfaceC1320380kSqLJIIJJI = null;
        }
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            scaleType = imageView.getScaleType();
        } else {
            scaleType = null;
        }
        if (scaleType == ImageView.ScaleType.FIT_CENTER) {
            interfaceC1320380kSqLJIIJJI = InterfaceC1320380kSq.LIZJ;
        } else if (this.LLIZ && f != null) {
            interfaceC1320380kSqLJIIJJI = InterfaceC1320380kSq.LIZJ;
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        if (width <= 0.0f || height <= 0.0f || fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
            return null;
        }
        float f3 = width / fFloatValue;
        float f4 = height / fFloatValue2;
        float fMin = Math.min(f3, f4);
        float fMax = Math.max(f3, f4);
        if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LIZ)) {
            return new RectF(0.0f, 0.0f, width, height);
        }
        if (!Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LJI) && !Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LJII)) {
            if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LJFF)) {
                fMin = Math.min(1.0f, fMin);
            } else if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LJ)) {
            }
            float f5 = fFloatValue * fMin;
            float f6 = fFloatValue2 * fMin;
            float f7 = (width - f5) / 2.0f;
            float f8 = (height - f6) / 2.0f;
            return new RectF(f7, f8, f5 + f7, f6 + f8);
        }
        f2 = fMax;
        fMin = f2;
        float f52 = fFloatValue * fMin;
        float f62 = fFloatValue2 * fMin;
        float f72 = (width - f52) / 2.0f;
        float f82 = (height - f62) / 2.0f;
        return new RectF(f72, f82, f52 + f72, f62 + f82);
    }

    public final void LJIL(EnumC719760SLe enumC719760SLe) {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.LLJJIJI) {
            return;
        }
        if (LJIJ()) {
            this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
            if (enumC719760SLe == EnumC719760SLe.NORMAL) {
                this.LLILZ.LJI();
            }
            View view = this.LL;
            view.animate().cancel();
            EnumC719760SLe enumC719760SLe2 = EnumC719760SLe.CLEAR_MODE;
            if (enumC719760SLe == enumC719760SLe2) {
                f = this.LLJJL.x;
            } else {
                f = this.LLJJJJJIL.x;
            }
            C786410Ut5.Jc(view, f);
            if (enumC719760SLe == enumC719760SLe2) {
                f2 = this.LLJJL.y;
            } else {
                f2 = this.LLJJJJJIL.y;
            }
            C786410Ut5.ed(view, f2);
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
            if (enumC719760SLe == enumC719760SLe2) {
                f3 = this.LLJJLIIIJLLLLLLLZ.x;
            } else {
                f3 = this.LLJJJJLIIL.x;
            }
            view.setPivotX(f3);
            if (enumC719760SLe == enumC719760SLe2) {
                f4 = this.LLJJLIIIJLLLLLLLZ.y;
            } else {
                f4 = this.LLJJJJLIIL.y;
            }
            view.setPivotY(f4);
            LJJIFFI(1.0f);
            LJIIJ(enumC719760SLe);
            return;
        }
        LJIIL().animate().cancel();
        this.LLILLJJLI.requestDisallowInterceptTouchEvent(false);
        LJJI();
        FrameLayout frameLayoutLJIIL = LJIIL();
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null && viewGroup.indexOfChild(frameLayoutLJIIL) != -1) {
            C786410Ut5.LJJJLZIJ(frameLayoutLJIIL, this.LLILLL);
        }
        if (frameLayoutLJIIL.getChildCount() > 0) {
            this.LLILZ.LJI();
            View childAt = frameLayoutLJIIL.getChildAt(0);
            if (childAt != null) {
                C786410Ut5.LJJJZ(childAt, frameLayoutLJIIL);
                this.LLILLJJLI.addView(childAt, 0);
            }
        }
        C786410Ut5.LJLZ(0, this.LLILLJJLI);
        LJJIFFI(1.0f);
        LJIIJ(enumC719760SLe);
    }

    public final void LJJIFFI(float f) {
        this.LLJJIII = f;
        this.LLJJJ = new PointF();
        this.LLJJIJIL = new PointF();
        this.LLJJJIL = new PointF();
        this.LLJJJJ = new PointF();
        this.LLJLILLLLZIIL = new PointF();
        this.LLJLL = false;
        this.LLJLLIL = false;
        this.LLJJIJI = false;
        if (this.LLJJIJIIJIL == EnumC585210MxL.ZOOM) {
            this.LLJJIJIIJIL = EnumC585210MxL.IDLE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[PHI: r5
      0x0049: PHI (r5v3 boolean) = (r5v1 boolean), (r5v0 boolean) binds: [B:37:0x0074, B:29:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(boolean r7) {
        /*
            r6 = this;
            X.0SLe r1 = r6.LLJL
            X.0SLe r0 = X.EnumC719760SLe.ZOOM_FIX
            r5 = 1
            r4 = 0
            if (r1 != r0) goto L10
            r3 = 1
        L9:
            boolean r2 = r6.LLLL
            if (r3 != 0) goto L12
            if (r2 != 0) goto L12
            return
        L10:
            r3 = 0
            goto L9
        L12:
            r6.LLLL = r4
            android.animation.ValueAnimator r0 = r6.LLLIILIL
            if (r0 == 0) goto L1b
            r0.cancel()
        L1b:
            android.animation.ValueAnimator r0 = r6.LLLF
            if (r0 == 0) goto L22
            r0.cancel()
        L22:
            android.animation.ValueAnimator r0 = r6.LLLIL
            if (r0 == 0) goto L29
            r0.cancel()
        L29:
            android.animation.ValueAnimator r0 = r6.LLLILZ
            if (r0 == 0) goto L30
            r0.cancel()
        L30:
            X.07rh r0 = X.EnumC1995107rh.LL
            r6.LLJZIJLIL = r0
            boolean r1 = r6.LJJIIJZLJL()
            if (r3 == 0) goto L40
            if (r1 == 0) goto L77
            X.0SLe r0 = X.EnumC719760SLe.NORMAL
        L3e:
            r6.LLJL = r0
        L40:
            android.view.ViewGroup r0 = r6.LLILLJJLI
            r0.requestDisallowInterceptTouchEvent(r4)
            if (r7 == 0) goto L73
            if (r1 != 0) goto L73
        L49:
            X.0STJ r0 = r6.LLILZ
            r0.LJI()
        L4e:
            android.view.View r1 = r6.LL
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r0.cancel()
            r0 = 0
            X.C786410Ut5.Jc(r1, r0)
            X.C786410Ut5.ed(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.Ob(r1, r0)
            X.C786410Ut5.pc(r1, r0)
            r6.LJJIFFI(r0)
            if (r3 == 0) goto L72
            if (r5 == 0) goto L72
            X.0SLe r0 = X.EnumC719760SLe.CLEAR_MODE
            r6.LJIIJ(r0)
        L72:
            return
        L73:
            r5 = 0
            if (r2 == 0) goto L4e
            goto L49
        L77:
            X.0SLe r0 = X.EnumC719760SLe.CLEAR_MODE
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0STE.LJJIIJ(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair LJIIIZ(Drawable drawable, Set set) {
        Pair pairLJIIIZ;
        Pair pairLJIIIZ2;
        if (drawable != 0 && set.add(drawable) && set.size() <= 32) {
            if ((drawable instanceof InterfaceC722050STz) && (pairLJIIIZ2 = LJIIIZ(((InterfaceC722050STz) drawable).LIZ(), set)) != null) {
                return pairLJIIIZ2;
            }
            if (drawable instanceof C1331060kk4) {
                C1331060kk4 c1331060kk4 = (C1331060kk4) drawable;
                int length = c1331060kk4.LLILLL.length;
                for (int i = 0; i < length; i++) {
                    Pair pairLJIIIZ3 = LJIIIZ(c1331060kk4.LIZ(i), set);
                    if (pairLJIIIZ3 != null) {
                        return pairLJIIIZ3;
                    }
                }
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    Pair pairLJIIIZ4 = LJIIIZ(layerDrawable.getDrawable(i2), set);
                    if (pairLJIIIZ4 != null) {
                        return pairLJIIIZ4;
                    }
                }
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                return new Pair(Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight));
            }
            try {
                Drawable current = drawable.getCurrent();
                if (current != null && current != drawable && (pairLJIIIZ = LJIIIZ(current, set)) != null) {
                    return pairLJIIIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static void LJIJJLI(MotionEvent motionEvent, PointF pointF) {
        if (motionEvent.getPointerCount() == 2) {
            float f = 2;
            pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / f, (motionEvent.getY(0) + motionEvent.getY(1)) / f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        if (r2 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1883807Zk LJFF(android.view.View r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0STE.LJFF(android.view.View, boolean):X.07Zk");
    }

    public final float LJJIJ(View view, boolean z) {
        float top;
        int i;
        int top2;
        if (view != LJIIL()) {
            if (z) {
                top2 = view.getLeft();
            } else {
                top2 = view.getTop();
            }
            return top2;
        }
        int[] iArr = new int[2];
        this.LLILLJJLI.getLocationInWindow(iArr);
        if (z) {
            top = view.getLeft();
            i = iArr[0];
        } else {
            top = view.getTop();
            i = iArr[1];
        }
        return top - i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LLLJIL) {
            return false;
        }
        if (this.LLLJL) {
            LJIILJJIL(motionEvent);
        }
        if (this.LLJLIL == null) {
            this.LLILZIL.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public final float LIZLLL(View view, float f, boolean z, Float f2) {
        float scaleY;
        float pivotY;
        int height;
        if (f2 != null) {
            scaleY = f2.floatValue();
            if (z) {
                pivotY = view.getPivotX();
            } else {
                pivotY = view.getPivotY();
            }
        } else if (z) {
            scaleY = view.getScaleX();
            pivotY = view.getPivotX();
        } else {
            scaleY = view.getScaleY();
            pivotY = view.getPivotY();
        }
        float fLJJIJ = LJJIJ(view, z);
        C1883807Zk c1883807ZkLJFF = LJFF(view, z);
        float f3 = c1883807ZkLJFF.LIZ;
        float f4 = c1883807ZkLJFF.LIZIZ;
        if (z) {
            height = this.LLILLJJLI.getWidth();
        } else {
            height = this.LLILLJJLI.getHeight();
        }
        float f5 = height;
        if (f4 > 0.0f && f5 > 0.0f) {
            float f6 = (scaleY - 1.0f) * pivotY;
            float f7 = ((-fLJJIJ) - (f3 * scaleY)) + f6;
            float f8 = ((f5 - fLJJIJ) - ((f3 + f4) * scaleY)) + f6;
            if (f8 <= f7) {
                return C13LZ.LIZLLL(f, f8, f7);
            }
            return (f8 + f7) / 2.0f;
        }
        return f;
    }

    public C0STE(View view, ViewGroup viewGroup, ViewGroup viewGroup2, C0STJ c0stj, InterfaceC720380SNo interfaceC720380SNo, boolean z, boolean z2) {
        float f;
        float f2;
        this.LL = view;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = viewGroup2;
        this.LLILZ = c0stj;
        this.LLILZIL = interfaceC720380SNo;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLJI = view.getContext();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PhotoModeNewPinchConfigSettings.PhotoModeNewPinchConfig photoModeNewPinchConfig = PhotoModeNewPinchConfigSettings.LIZ;
        PhotoModeNewPinchConfigSettings.PhotoModeNewPinchConfig photoModeNewPinchConfig2 = (PhotoModeNewPinchConfigSettings.PhotoModeNewPinchConfig) settingsManagerLIZLLL.LJIIIIZZ("photomode_new_pinch_config", PhotoModeNewPinchConfigSettings.PhotoModeNewPinchConfig.class, photoModeNewPinchConfig);
        photoModeNewPinchConfig = photoModeNewPinchConfig2 != null ? photoModeNewPinchConfig2 : photoModeNewPinchConfig;
        this.LLJILJILJ = photoModeNewPinchConfig;
        if (LJIJJ()) {
            f = photoModeNewPinchConfig.newPinchScaleMin;
        } else if (C716990SAn.LIZ()) {
            f = PinchToClearModeSettings.LIZ().minScale;
        } else {
            f = 1.0f;
        }
        this.LLJILLL = f;
        if (LJIJJ()) {
            f2 = photoModeNewPinchConfig.newPinchScaleMax;
        } else if (C716990SAn.LIZ()) {
            f2 = PinchToClearModeSettings.LIZ().maxScale;
        } else {
            f2 = 4.0f;
        }
        this.LLJJ = f2;
        this.LLJJI = LJIJJ() ? photoModeNewPinchConfig.newPinchInteractiveScaleMax : f2;
        this.LLJJIII = 1.0f;
        this.LLJJIJIIJIL = EnumC585210MxL.IDLE;
        this.LLJJIJIL = new PointF();
        this.LLJJJ = new PointF();
        this.LLJJJIL = new PointF();
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = new PointF();
        this.LLJJJJLIIL = new PointF();
        this.LLJJL = new PointF();
        this.LLJJLIIIJLLLLLLLZ = new PointF();
        this.LLJL = EnumC719760SLe.NORMAL;
        this.LLJLILLLLZIIL = new PointF();
        this.LLJZIJLIL = EnumC1995107rh.LL;
        this.LLL = EnumC1983407po.LL;
        this.LLLII = C0STI.LL;
        this.LLLIIL = 1.0f;
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1626));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLIZZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1630));
        this.LLLJ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 1629));
        this.LLLJIL = true;
        this.LLLJL = true;
        C2271391DvN.LIZ(viewGroup, C2271381DvM.LIZIZ());
    }
}
