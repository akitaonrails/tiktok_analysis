package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.19Ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21535419Ps extends AbstractC21534519Pj<ObjectAnimator> {
    public static final int[] LJIIJJI = {0, 1350, 2700, 4050};
    public static final int[] LJIIL = {667, 2017, 3367, 4717};
    public static final int[] LJIILIIL = {LSPassThroughRecordSizeConfig.DEFAULT, 2350, 3700, 5050};
    public static final C21535519Pt LJIILJJIL;
    public static final C19Q1 LJIILL;
    public ObjectAnimator LIZLLL;
    public ObjectAnimator LJ;
    public final C12DM LJFF;
    public final C19PI LJI;
    public int LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public AbstractC21534319Ph LJIIJ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.19Pt] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.19Q1] */
    static {
        final Class<Float> cls = Float.class;
        LJIILJJIL = new Property<C21535419Ps, Float>(cls) { // from class: X.19Pt
            @Override // android.util.Property
            public final Float get(C21535419Ps c21535419Ps) {
                return Float.valueOf(c21535419Ps.LJIIIIZZ);
            }

            @Override // android.util.Property
            public final void set(C21535419Ps c21535419Ps, Float f) {
                C21535419Ps c21535419Ps2 = c21535419Ps;
                float fFloatValue = f.floatValue();
                c21535419Ps2.LJIIIIZZ = fFloatValue;
                int i = (int) (5400.0f * fFloatValue);
                float[] fArr = c21535419Ps2.LIZIZ;
                float f2 = fFloatValue * 1520.0f;
                fArr[0] = (-20.0f) + f2;
                fArr[1] = f2;
                int i2 = 0;
                do {
                    float f3 = 667;
                    float[] fArr2 = c21535419Ps2.LIZIZ;
                    fArr2[1] = fArr2[1] + (c21535419Ps2.LJFF.getInterpolation((i - C21535419Ps.LJIIJJI[i2]) / f3) * 250.0f);
                    float[] fArr3 = c21535419Ps2.LIZIZ;
                    fArr3[0] = fArr3[0] + (c21535419Ps2.LJFF.getInterpolation((i - C21535419Ps.LJIIL[i2]) / f3) * 250.0f);
                    i2++;
                } while (i2 < 4);
                float[] fArr4 = c21535419Ps2.LIZIZ;
                float f4 = fArr4[0];
                float f5 = fArr4[1];
                float f6 = f4 + ((f5 - f4) * c21535419Ps2.LJIIIZ);
                fArr4[0] = f6;
                fArr4[0] = f6 / 360.0f;
                fArr4[1] = f5 / 360.0f;
                int i3 = 0;
                while (true) {
                    float f7 = (i - C21535419Ps.LJIILIIL[i3]) / 333;
                    if (f7 >= 0.0f && f7 <= 1.0f) {
                        int i4 = i3 + c21535419Ps2.LJII;
                        int[] iArr = c21535419Ps2.LJI.LIZJ;
                        int length = i4 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        c21535419Ps2.LIZJ[0] = C20632215oO.LIZ(c21535419Ps2.LJFF.getInterpolation(f7), Integer.valueOf(C19PM.LIZ(iArr[length], c21535419Ps2.LIZ.LLJI)), Integer.valueOf(C19PM.LIZ(c21535419Ps2.LJI.LIZJ[length2], c21535419Ps2.LIZ.LLJI))).intValue();
                        break;
                    }
                    i3++;
                    if (i3 >= 4) {
                        break;
                    }
                }
                c21535419Ps2.LIZ.invalidateSelf();
            }
        };
        final Class<Float> cls2 = Float.class;
        LJIILL = new Property<C21535419Ps, Float>(cls2) { // from class: X.19Q1
            @Override // android.util.Property
            public final Float get(C21535419Ps c21535419Ps) {
                return Float.valueOf(c21535419Ps.LJIIIZ);
            }

            @Override // android.util.Property
            public final void set(C21535419Ps c21535419Ps, Float f) {
                c21535419Ps.LJIIIZ = f.floatValue();
            }
        };
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZIZ() {
        this.LJII = 0;
        this.LIZJ[0] = C19PM.LIZ(this.LJI.LIZJ[0], this.LIZ.LLJI);
        this.LJIIIZ = 0.0f;
    }

    @Override // X.AbstractC21534519Pj
    public final void LJFF() {
        this.LJIIJ = null;
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZ() {
        ObjectAnimator objectAnimator = this.LIZLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZLLL() {
        if (this.LJ.isRunning()) {
            return;
        }
        if (this.LIZ.isVisible()) {
            C786410Ut5.Pd(this.LJ);
        } else {
            LIZ();
        }
    }

    @Override // X.AbstractC21534519Pj
    public final void LJ() {
        if (this.LIZLLL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, LJIILJJIL, 0.0f, 1.0f);
            this.LIZLLL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new AnimatorListenerAdapter() { // from class: X.19Q0
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    C21535419Ps c21535419Ps = this.LL;
                    c21535419Ps.LJII = (c21535419Ps.LJII + 4) % c21535419Ps.LJI.LIZJ.length;
                }
            });
        }
        if (this.LJ == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, LJIILL, 0.0f, 1.0f);
            this.LJ = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.LJ.setInterpolator(this.LJFF);
            this.LJ.addListener(new AnimatorListenerAdapter() { // from class: X.19Pr
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    this.LL.LIZ();
                    this.LL.LJIIJ.LIZ();
                }
            });
        }
        this.LJII = 0;
        this.LIZJ[0] = C19PM.LIZ(this.LJI.LIZJ[0], this.LIZ.LLJI);
        this.LJIIIZ = 0.0f;
        C786410Ut5.Pd(this.LIZLLL);
    }

    public C21535419Ps(C19PI c19pi) {
        super(1);
        this.LJI = c19pi;
        this.LJFF = new C12DM();
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZJ(C21534219Pg c21534219Pg) {
        this.LJIIJ = c21534219Pg;
    }
}
