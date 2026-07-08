package X;

import Y.ALAdapterS8S0100000_11;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719840SLm {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final C719790SLh LIZJ;
    public boolean LIZLLL;
    public float LJ = 1.0f;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public ValueAnimator LJIIIIZZ;
    public Drawable LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public Drawable LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public Map<View, Pair<Integer, Integer>> LJIJI;
    public ValueAnimator LJIJJ;
    public ValueAnimator LJIJJLI;

    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LJIJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIJJLI = null;
        ValueAnimator valueAnimator2 = this.LJIJJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LJIJJ = null;
        ValueAnimator valueAnimator3 = this.LJIIIIZZ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.LJIIIIZZ = null;
    }

    public final void LJ() {
        C19ME c19me;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LJIILL) {
            return;
        }
        this.LIZJ.LIZ();
        int[] iArr = new int[2];
        this.LIZ.getLocationOnScreen(iArr);
        final int i = iArr[1];
        final int height = this.LIZ.getHeight();
        final int height2 = this.LIZ.getRootView().getHeight();
        if (height2 <= height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        this.LJIILLIIL = ((ViewGroup.MarginLayoutParams) c19me).height;
        this.LJIIZILJ = c19me.matchConstraintPercentHeight;
        this.LJIJ = this.LIZ.getTranslationY();
        c19me.matchConstraintPercentHeight = 0.0f;
        int childCount = this.LIZ.getChildCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LIZ.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                linkedHashMap.put(childAt, new Pair(Integer.valueOf(marginLayoutParams.height), Integer.valueOf(marginLayoutParams.topMargin)));
            }
        }
        this.LJIJI = linkedHashMap;
        final float translationY = this.LIZ.getTranslationY();
        final float f = translationY - i;
        ValueAnimator valueAnimator = this.LJIJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0SLf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewGroup.MarginLayoutParams marginLayoutParams2;
                ViewGroup.MarginLayoutParams marginLayoutParams3;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ViewGroup.LayoutParams layoutParams3 = this.LL.LIZ.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams2.height = (int) (height + ((height2 - r2) * fFloatValue));
                    C786410Ut5.X5(marginLayoutParams2, this.LL.LIZ);
                    ViewGroup viewGroup = this.LL.LIZ;
                    float f2 = translationY;
                    C786410Ut5.bd(f2 + ((f - f2) * fFloatValue), viewGroup);
                    int i3 = (int) (i * fFloatValue);
                    int childCount2 = this.LL.LIZ.getChildCount();
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        View childAt2 = this.LL.LIZ.getChildAt(i4);
                        ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                            marginLayoutParams3.topMargin = i3;
                            marginLayoutParams3.height = height;
                            C786410Ut5.W5(childAt2, marginLayoutParams3);
                        }
                    }
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS8S0100000_11(this, 1));
        valueAnimatorOfFloat.start();
        this.LJIJJ = valueAnimatorOfFloat;
        this.LJIILL = true;
    }

    public final void LJFF() {
        C19ME c19me;
        if (this.LJFF) {
            this.LJFF = false;
            ValueAnimator valueAnimator = this.LJIJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LJIJJ = null;
            C786410Ut5.bd(0.0f, this.LIZ);
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
            c19me.matchConstraintPercentHeight = this.LIZLLL ? 1.0f : this.LJ;
            ((ViewGroup.MarginLayoutParams) c19me).height = 0;
            C786410Ut5.X5(c19me, this.LIZ);
        }
    }

    public final void LJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me;
        if (this.LJIILL) {
            ValueAnimator valueAnimator = this.LJIJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LJIJJ = null;
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).height = this.LJIILLIIL;
                c19me.matchConstraintPercentHeight = this.LJIIZILJ;
                C786410Ut5.X5(c19me, this.LIZ);
            }
            C786410Ut5.bd(this.LJIJ, this.LIZ);
            Map<View, Pair<Integer, Integer>> map = this.LJIJI;
            if (map != null) {
                for (Map.Entry<View, Pair<Integer, Integer>> entry : map.entrySet()) {
                    View key = entry.getKey();
                    Pair<Integer, Integer> value = entry.getValue();
                    ViewGroup.LayoutParams layoutParams2 = key.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.height = value.getFirst().intValue();
                        marginLayoutParams.topMargin = value.getSecond().intValue();
                        C786410Ut5.W5(key, marginLayoutParams);
                    }
                }
            }
            this.LJIJI = null;
            this.LJIILL = false;
        }
    }

    public final void LJII() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19ME c19me;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        LIZJ();
        if (this.LJIILL) {
            Map<View, Pair<Integer, Integer>> map = this.LJIJI;
            if (map != null) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    View view = (View) entry.getKey();
                    Pair pair = (Pair) entry.getValue();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams2.height = ((Number) pair.getFirst()).intValue();
                        marginLayoutParams2.topMargin = ((Number) pair.getSecond()).intValue();
                        C786410Ut5.W5(view, marginLayoutParams2);
                    }
                }
            }
            this.LJIJI = null;
            this.LJIILL = false;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).height = 0;
            c19me.matchConstraintPercentHeight = this.LJ;
            C786410Ut5.X5(c19me, this.LIZ);
        }
        C786410Ut5.bd(0.0f, this.LIZ);
        this.LJFF = false;
        this.LIZLLL = false;
        ValueAnimator valueAnimator = this.LJIIIIZZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIIIIZZ = null;
        if (this.LJIIL) {
            ViewGroup.LayoutParams layoutParams3 = this.LIZ.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.topMargin = this.LJIIJJI;
                C786410Ut5.X5(marginLayoutParams, this.LIZ);
            }
            this.LJIIL = false;
            this.LJIIJJI = 0;
        }
        this.LJII = false;
        this.LJI = 0;
        if (this.LJIILJJIL) {
            this.LIZ.setBackground(this.LJIILIIL);
            this.LJIILJJIL = false;
            this.LJIILIIL = null;
        }
        this.LJIIJ = false;
        this.LJIIIZ = null;
    }

    public final void LIZ(float f) {
        this.LJ = f;
        if (this.LIZLLL) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ConstraintLayout constraintLayout = null;
        this.LJIJJLI = null;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        View view = this.LIZIZ;
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        }
        c721640SSk.getClass();
        C721640SSk.LJIILIIL(constraintLayout, f);
    }

    public final boolean LJIIIZ(float f) {
        if (f <= 0.0f) {
            return false;
        }
        float f2 = this.LIZIZ.getResources().getDisplayMetrics().widthPixels;
        View view = this.LIZIZ;
        if (!(view instanceof ConstraintLayout) || view == null) {
            return false;
        }
        float height = view.getHeight();
        if (f2 <= 0.0f || height <= 0.0f || f >= f2 / height) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(long j, boolean z) {
        int height;
        C19ME c19me;
        if (this.LJFF) {
            return;
        }
        View view = this.LIZIZ;
        if (!(view instanceof ConstraintLayout) || view == null || (height = view.getHeight()) <= 0) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        if (i >= 0 && i > 0) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                this.LJFF = true;
                final int height2 = this.LIZ.getHeight();
                final int i2 = height + i;
                final float translationY = this.LIZ.getTranslationY();
                final float f = -i;
                c19me.matchConstraintPercentHeight = 0.0f;
                if (!z) {
                    ((ViewGroup.MarginLayoutParams) c19me).height = i2;
                    C786410Ut5.X5(c19me, this.LIZ);
                    C786410Ut5.bd(f, this.LIZ);
                    return;
                }
                ValueAnimator valueAnimator = this.LJIJJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0SLd
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams;
                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        ViewGroup.LayoutParams layoutParams2 = this.LL.LIZ.getLayoutParams();
                        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams.height = (int) (height2 + ((i2 - r2) * fFloatValue));
                            C786410Ut5.X5(marginLayoutParams, this.LL.LIZ);
                            ViewGroup viewGroup = this.LL.LIZ;
                            float f2 = translationY;
                            C786410Ut5.bd(f2 + ((f - f2) * fFloatValue), viewGroup);
                        }
                    }
                });
                valueAnimatorOfFloat.addListener(new ALAdapterS8S0100000_11(this, 2));
                valueAnimatorOfFloat.start();
                this.LJIJJ = valueAnimatorOfFloat;
                return;
            }
            return;
        }
        this.LJFF = true;
    }

    public C719840SLm(ViewGroup viewGroup, View view, C719790SLh c719790SLh) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = c719790SLh;
    }

    public final void LIZIZ(int i, ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, long j) {
        ValueAnimator valueAnimator = this.LJIIIIZZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIIIIZZ = null;
        int i2 = marginLayoutParams.topMargin;
        if (i2 == i) {
            return;
        }
        if (!z) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.X5(marginLayoutParams, this.LIZ);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS261S0100000_11(this, 2));
        valueAnimatorOfInt.addListener(new ALAdapterS8S0100000_11(this, 0));
        valueAnimatorOfInt.start();
        this.LJIIIIZZ = valueAnimatorOfInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(boolean r21, boolean r22, long r23, boolean r25, float r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719840SLm.LJIIIIZZ(boolean, boolean, long, boolean, float, kotlin.jvm.functions.Function0):void");
    }
}
