package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.OverScroller;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355780lNw {
    public final Context LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final ViewOnTouchListenerC1355770lNv LIZJ;
    public final C424580Gkq LIZLLL;
    public final ViewGroup LJ;
    public final InterfaceC1355840lO2 LJFF;
    public EnumC1355810lNz LJI = EnumC1355810lNz.NONE;
    public final Matrix LJII = new Matrix();
    public final float[] LJIIIIZZ = new float[9];
    public final RectF LJIIIZ = new RectF();
    public float LJIIJ = 1.0f;
    public ValueAnimator LJIIJJI;
    public final C01GW LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public boolean LJIJJLI;
    public VelocityTracker LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJJII;
    public final C01GW LJJIII;
    public final C01GW LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;

    public final Pair<Float, Float> LJFF() {
        C1331050kk3 c1331050kk3;
        Drawable drawable;
        Drawable drawable2 = this.LIZLLL.getDrawable();
        if ((drawable2 instanceof C1321120kU2) && (c1331050kk3 = (C1331050kk3) drawable2) != null && (drawable = c1331050kk3.LL) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float fMin = Math.min(this.LIZLLL.getWidth() / f, this.LIZLLL.getHeight() / f2);
                return new Pair<>(Float.valueOf(f * fMin), Float.valueOf(f2 * fMin));
            }
        }
        return null;
    }

    public final OverScroller LJII() {
        return (OverScroller) this.LJIIL.getValue();
    }

    public final float LJIIIIZZ() {
        this.LJII.getValues(this.LJIIIIZZ);
        return this.LJIIIIZZ[2];
    }

    public final float LJIIIZ() {
        this.LJII.getValues(this.LJIIIIZZ);
        return this.LJIIIIZZ[5];
    }

    public final Pair<PointF, PointF> LJIIJ() {
        Pair pair;
        Pair pair2;
        float width = this.LJ.getWidth();
        float height = this.LJ.getHeight();
        RectF rectFLJI = LJI();
        float fLJIIIIZZ = LJIIIIZZ();
        float fLJIIIZ = LJIIIZ();
        if (rectFLJI.width() > width) {
            pair = new Pair(Float.valueOf((width + fLJIIIIZZ) - rectFLJI.right), Float.valueOf(fLJIIIIZZ - rectFLJI.left));
        } else {
            float fLIZLLL = (fLJIIIIZZ + LIZLLL(rectFLJI.width(), this.LIZLLL.getLeft(), this.LIZLLL.getWidth(), width)) - rectFLJI.centerX();
            pair = new Pair(Float.valueOf(fLIZLLL), Float.valueOf(fLIZLLL));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        if (rectFLJI.height() > height) {
            pair2 = new Pair(Float.valueOf((height + fLJIIIZ) - rectFLJI.bottom), Float.valueOf(fLJIIIZ - rectFLJI.top));
        } else {
            float fLIZLLL2 = (fLJIIIZ + LIZLLL(rectFLJI.height(), this.LIZLLL.getTop(), this.LIZLLL.getHeight(), height)) - rectFLJI.centerY();
            pair2 = new Pair(Float.valueOf(fLIZLLL2), Float.valueOf(fLIZLLL2));
        }
        return new Pair<>(new PointF(fFloatValue, ((Number) pair2.getFirst()).floatValue()), new PointF(fFloatValue2, ((Number) pair2.getSecond()).floatValue()));
    }

    public final void LJIIJJI() {
        if (C294430BgP.LIZIZ) {
            this.LIZLLL.setCornerRadius(0.0f);
        }
        float alpha = this.LIZLLL.getAlpha();
        LJII().forceFinished(true);
        LIZ(new Matrix(this.LJII), new Matrix(), new C12DM(), new AwS565S0100000_21(this, 1683), new C1350910lG5(this, alpha), new AwS565S0100000_21(this, 1684));
    }

    public final void LJ() {
        Pair<PointF, PointF> pairLJIIJ = LJIIJ();
        float fLJIIIIZZ = LJIIIIZZ();
        float fLJIIIZ = LJIIIZ();
        float f = pairLJIIJ.getFirst().x;
        float f2 = pairLJIIJ.getSecond().x;
        float fLIZLLL = f < f2 ? C13LZ.LIZLLL(fLJIIIIZZ, f, f2) : C13LZ.LIZLLL(fLJIIIIZZ, f2, f);
        float f3 = pairLJIIJ.getFirst().y;
        float f4 = pairLJIIJ.getSecond().y;
        float f5 = fLIZLLL - fLJIIIIZZ;
        float fLIZLLL2 = (f3 < f4 ? C13LZ.LIZLLL(fLJIIIZ, f3, f4) : C13LZ.LIZLLL(fLJIIIZ, f4, f3)) - fLJIIIZ;
        if (f5 == 0.0f && fLIZLLL2 == 0.0f) {
            return;
        }
        this.LJII.postTranslate(f5, fLIZLLL2);
        this.LIZJ.setDisplayMatrix(this.LJII);
    }

    public final RectF LJI() {
        Pair<Float, Float> pairLJFF = LJFF();
        if (pairLJFF == null) {
            this.LJIIIZ.setEmpty();
            return this.LJIIIZ;
        }
        float fFloatValue = pairLJFF.getFirst().floatValue();
        float fFloatValue2 = pairLJFF.getSecond().floatValue();
        float width = (this.LIZLLL.getWidth() - fFloatValue) / 2.0f;
        float height = (this.LIZLLL.getHeight() - fFloatValue2) / 2.0f;
        this.LJIIIZ.set(width, height, fFloatValue + width, fFloatValue2 + height);
        this.LJII.mapRect(this.LJIIIZ);
        return this.LJIIIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF LIZJ(float r6, float r7, android.graphics.RectF r8) {
        /*
            r5 = this;
            float r0 = r8.left
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r3 = 0
            if (r0 > 0) goto L1b
            float r0 = r8.top
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L1b
            float r0 = r8.right
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L1b
            float r0 = r8.bottom
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L1b
            return r3
        L1b:
            float r0 = r8.width()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L85
            float r2 = r8.width()
            X.0Gkq r0 = r5.LIZLLL
            int r0 = r0.getLeft()
            float r1 = (float) r0
            X.0Gkq r0 = r5.LIZLLL
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r6 = LIZLLL(r2, r1, r0, r6)
            float r1 = r8.centerX()
        L3d:
            float r6 = r6 - r1
        L3e:
            float r0 = r8.height()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L6a
            float r2 = r8.height()
            X.0Gkq r0 = r5.LIZLLL
            int r0 = r0.getTop()
            float r1 = (float) r0
            X.0Gkq r0 = r5.LIZLLL
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r7 = LIZLLL(r2, r1, r0, r7)
            float r1 = r8.centerY()
        L60:
            float r7 = r7 - r1
        L61:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto La0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto La0
            return r3
        L6a:
            float r1 = r8.top
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L78
            float r0 = r8.bottom
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L78
            float r7 = -r1
            goto L61
        L78:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L83
            float r1 = r8.bottom
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L83
            goto L60
        L83:
            r7 = 0
            goto L61
        L85:
            float r1 = r8.left
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L93
            float r0 = r8.right
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L93
            float r6 = -r1
            goto L3e
        L93:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9e
            float r1 = r8.right
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L9e
            goto L3d
        L9e:
            r6 = 0
            goto L3e
        La0:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1355780lNw.LIZJ(float, float, android.graphics.RectF):android.graphics.PointF");
    }

    public static float LIZLLL(float f, float f2, float f3, float f4) {
        float f5 = f2 + (f3 / 2.0f);
        float f6 = f4 / 2.0f;
        if (f3 >= f4) {
            return f6;
        }
        return f5 + ((f6 - f5) * C13LZ.LIZLLL((f - f3) / (f4 - f3), 0.0f, 1.0f));
    }

    public C1355780lNw(Context context, InterfaceC665370Q7z interfaceC665370Q7z, ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv, C424580Gkq c424580Gkq, ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv2, InterfaceC1355840lO2 interfaceC1355840lO2) {
        this.LIZ = context;
        this.LIZIZ = interfaceC665370Q7z;
        this.LIZJ = viewOnTouchListenerC1355770lNv;
        this.LIZLLL = c424580Gkq;
        this.LJ = viewOnTouchListenerC1355770lNv2;
        this.LJFF = interfaceC1355840lO2;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1688));
        this.LJJIFFI = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1680));
        this.LJJII = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1681));
        this.LJJIII = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1689));
        this.LJJIIJ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1682));
    }

    public final void LIZ(Matrix matrix, Matrix matrix2, C12DM c12dm, final Function0 function0, final Function1 function1, final Function0 function02) {
        ValueAnimator valueAnimator = this.LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float[] fArr = new float[9];
        matrix.getValues(fArr);
        final float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        final float[] fArr3 = new float[9];
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(c12dm);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0lNy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i = 0;
                do {
                    float[] fArr4 = fArr3;
                    float f = fArr[i];
                    fArr4[i] = f + ((fArr2[i] - f) * fFloatValue);
                    i++;
                } while (i < 9);
                this.LJII.setValues(fArr3);
                C1355780lNw c1355780lNw = this;
                c1355780lNw.LJII.getValues(c1355780lNw.LJIIIIZZ);
                c1355780lNw.LJIIJ = c1355780lNw.LJIIIIZZ[0];
                C1355780lNw c1355780lNw2 = this;
                c1355780lNw2.LIZJ.setDisplayMatrix(c1355780lNw2.LJII);
                Function1<Float, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Float.valueOf(fFloatValue));
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0lO1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                C1355780lNw c1355780lNw = this;
                if (c1355780lNw.LJIIJJI == valueAnimatorOfFloat) {
                    c1355780lNw.LJIIJJI = null;
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1355780lNw c1355780lNw = this;
                if (c1355780lNw.LJIIJJI == valueAnimatorOfFloat) {
                    c1355780lNw.LJIIJJI = null;
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        this.LJIIJJI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }
}
