package X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19Z1 {
    public static final C14JQ LJIL = C194V.LIZJ;
    public static final int[] LJJ = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] LJJI = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] LJJIFFI = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] LJJII = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] LJJIII = {R.attr.state_enabled};
    public static final int[] LJJIIJ = new int[0];
    public C19RX LIZ;
    public boolean LIZIZ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public C194T LJI;
    public C194T LJII;
    public Animator LJIIIIZZ;
    public C194T LJIIIZ;
    public C194T LJIIJ;
    public float LJIIJJI;
    public int LJIILIIL;
    public ArrayList<Animator.AnimatorListener> LJIILJJIL;
    public ArrayList<Animator.AnimatorListener> LJIILL;
    public ArrayList<C19ZI> LJIILLIIL;
    public final C19Z0 LJIIZILJ;
    public final C19ZN LJIJ;
    public final Matrix LJIJJ;
    public C19Z6 LJIJJLI;
    public boolean LIZJ = true;
    public float LJIIL = 1.0f;
    public final Rect LJIJI = new Rect();

    public float LIZJ() {
        throw null;
    }

    public void LJ() {
        throw null;
    }

    public void LJFF() {
        throw null;
    }

    public void LJI(int[] iArr) {
        throw null;
    }

    public void LJII(float f, float f2, float f3) {
        throw null;
    }

    public void LJIIIZ() {
        throw null;
    }

    public void LJIIJ() {
        throw null;
    }

    public final void LJIIIIZZ() {
        ArrayList<C19ZI> arrayList = this.LJIILLIIL;
        if (arrayList != null) {
            Iterator<C19ZI> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
        }
    }

    public final void LJIIJJI() {
        LIZLLL(this.LJIJI);
        C08IF.LIZLLL(null, "Didn't initialize content background");
        throw null;
    }

    public static ValueAnimator LIZIZ(C19ZB c19zb) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(LJIL);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(c19zb);
        valueAnimator.addUpdateListener(c19zb);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void LIZLLL(Rect rect) {
        float fLIZJ;
        int sizeDimension = 0;
        if (this.LIZIZ) {
            sizeDimension = (0 - this.LJIIZILJ.getSizeDimension()) / 2;
        }
        if (this.LIZJ) {
            fLIZJ = LIZJ() + this.LJFF;
        } else {
            fLIZJ = 0.0f;
        }
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fLIZJ));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fLIZJ * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public C19Z1(C19Z0 c19z0, C19ZH c19zh) {
        new RectF();
        new RectF();
        this.LJIJJ = new Matrix();
        this.LJIIZILJ = c19z0;
        this.LJIJ = c19zh;
        C19ZK c19zk = new C19ZK();
        final C19Z2 c19z2 = (C19Z2) this;
        c19zk.LIZ(LJJ, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZC
            public final /* synthetic */ C19Z1 LLILLL;

            @Override // X.C19ZB
            public final float LIZ() {
                C19Z1 c19z1 = this.LLILLL;
                return c19z1.LIZLLL + c19z1.LJFF;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c19z2);
                this.LLILLL = c19z2;
            }
        }));
        c19zk.LIZ(LJJI, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZA
            public final /* synthetic */ C19Z1 LLILLL;

            @Override // X.C19ZB
            public final float LIZ() {
                C19Z1 c19z1 = this.LLILLL;
                return c19z1.LIZLLL + c19z1.LJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c19z2);
                this.LLILLL = c19z2;
            }
        }));
        c19zk.LIZ(LJJIFFI, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZA
            public final /* synthetic */ C19Z1 LLILLL;

            @Override // X.C19ZB
            public final float LIZ() {
                C19Z1 c19z1 = this.LLILLL;
                return c19z1.LIZLLL + c19z1.LJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c19z2);
                this.LLILLL = c19z2;
            }
        }));
        c19zk.LIZ(LJJII, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZA
            public final /* synthetic */ C19Z1 LLILLL;

            @Override // X.C19ZB
            public final float LIZ() {
                C19Z1 c19z1 = this.LLILLL;
                return c19z1.LIZLLL + c19z1.LJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c19z2);
                this.LLILLL = c19z2;
            }
        }));
        c19zk.LIZ(LJJIII, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZD
            public final /* synthetic */ C19Z1 LLILLL;

            @Override // X.C19ZB
            public final float LIZ() {
                return this.LLILLL.LIZLLL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c19z2);
                this.LLILLL = c19z2;
            }
        }));
        c19zk.LIZ(LJJIIJ, LIZIZ(new C19ZB(c19z2) { // from class: X.19ZE
            @Override // X.C19ZB
            public final float LIZ() {
                return 0.0f;
            }
        }));
        this.LJIIJJI = c19z0.getRotation();
    }

    public final AnimatorSet LIZ(C194T c194t, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C19Z0, Float>) View.ALPHA, f);
        c194t.LIZJ("opacity").LIZ(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C19Z0, Float>) View.SCALE_X, f2);
        c194t.LIZJ("scale").LIZ(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new TypeEvaluator<Float>() { // from class: X.0HtJ
                public final FloatEvaluator LIZ = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final Float evaluate(float f4, Float f5, Float f6) {
                    float fFloatValue = this.LIZ.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    if (fFloatValue < 0.1f) {
                        fFloatValue = 0.0f;
                    }
                    return Float.valueOf(fFloatValue);
                }
            });
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C19Z0, Float>) View.SCALE_Y, f2);
        c194t.LIZJ("scale").LIZ(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new TypeEvaluator<Float>() { // from class: X.0HtJ
                public final FloatEvaluator LIZ = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final Float evaluate(float f4, Float f5, Float f6) {
                    float fFloatValue = this.LIZ.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    if (fFloatValue < 0.1f) {
                        fFloatValue = 0.0f;
                    }
                    return Float.valueOf(fFloatValue);
                }
            });
        }
        arrayList.add(objectAnimatorOfFloat3);
        this.LJIJJ.reset();
        this.LJIIZILJ.getDrawable();
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.LJIIZILJ, (Property<C19Z0, V>) new Property<ImageView, Matrix>() { // from class: X.0Gsr
            public final Matrix LIZ = new Matrix();

            @Override // android.util.Property
            public final Matrix get(ImageView imageView) {
                this.LIZ.set(imageView.getImageMatrix());
                return this.LIZ;
            }

            @Override // android.util.Property
            public final void set(ImageView imageView, Matrix matrix) {
                imageView.setImageMatrix(matrix);
            }
        }, (TypeEvaluator) new C19727812Gm() { // from class: X.19Z9
            @Override // X.C19727812Gm
            /* JADX INFO: renamed from: LIZ */
            public final Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                this.LIZLLL.LJIIL = f4;
                return super.evaluate(f4, matrix, matrix2);
            }

            @Override // X.C19727812Gm, android.animation.TypeEvaluator
            public final /* bridge */ /* synthetic */ Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                return evaluate(f4, matrix, matrix2);
            }
        }, (Object[]) new Matrix[]{new Matrix(this.LJIJJ)});
        c194t.LIZJ("iconScale").LIZ(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C15E4.LIZ(animatorSet, arrayList);
        return animatorSet;
    }
}
