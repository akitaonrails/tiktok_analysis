package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21535619Pu extends AbstractC21534519Pj<ObjectAnimator> {
    public static final C21535919Px LJIIIZ;
    public ObjectAnimator LIZLLL;
    public final C12DM LJ;
    public final C19PJ LJFF;
    public int LJI;
    public boolean LJII;
    public float LJIIIIZZ;

    @Override // X.AbstractC21534519Pj
    public final void LIZIZ() {
        this.LJII = true;
        this.LJI = 1;
        Arrays.fill(this.LIZJ, C19PM.LIZ(this.LJFF.LIZJ[0], this.LIZ.LLJI));
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZJ(C21534219Pg c21534219Pg) {
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZLLL() {
    }

    @Override // X.AbstractC21534519Pj
    public final void LJFF() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19Px] */
    static {
        final Class<Float> cls = Float.class;
        LJIIIZ = new Property<C21535619Pu, Float>(cls) { // from class: X.19Px
            @Override // android.util.Property
            public final Float get(C21535619Pu c21535619Pu) {
                return Float.valueOf(c21535619Pu.LJIIIIZZ);
            }

            @Override // android.util.Property
            public final void set(C21535619Pu c21535619Pu, Float f) {
                C21535619Pu c21535619Pu2 = c21535619Pu;
                c21535619Pu2.LJIIIIZZ = f.floatValue();
                float[] fArr = c21535619Pu2.LIZIZ;
                fArr[0] = 0.0f;
                float f2 = ((int) (r1 * 333.0f)) / 667;
                float interpolation = c21535619Pu2.LJ.getInterpolation(f2);
                fArr[2] = interpolation;
                fArr[1] = interpolation;
                float[] fArr2 = c21535619Pu2.LIZIZ;
                float interpolation2 = c21535619Pu2.LJ.getInterpolation(f2 + 0.49925038f);
                fArr2[4] = interpolation2;
                fArr2[3] = interpolation2;
                float[] fArr3 = c21535619Pu2.LIZIZ;
                fArr3[5] = 1.0f;
                if (c21535619Pu2.LJII && fArr3[3] < 1.0f) {
                    int[] iArr = c21535619Pu2.LIZJ;
                    iArr[2] = iArr[1];
                    iArr[1] = iArr[0];
                    iArr[0] = C19PM.LIZ(c21535619Pu2.LJFF.LIZJ[c21535619Pu2.LJI], c21535619Pu2.LIZ.LLJI);
                    c21535619Pu2.LJII = false;
                }
                c21535619Pu2.LIZ.invalidateSelf();
            }
        };
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZ() {
        ObjectAnimator objectAnimator = this.LIZLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // X.AbstractC21534519Pj
    public final void LJ() {
        if (this.LIZLLL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, LJIIIZ, 0.0f, 1.0f);
            this.LIZLLL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new AnimatorListenerAdapter() { // from class: X.19Pz
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    C21535619Pu c21535619Pu = this.LL;
                    c21535619Pu.LJI = (c21535619Pu.LJI + 1) % c21535619Pu.LJFF.LIZJ.length;
                    c21535619Pu.LJII = true;
                }
            });
        }
        this.LJII = true;
        this.LJI = 1;
        Arrays.fill(this.LIZJ, C19PM.LIZ(this.LJFF.LIZJ[0], this.LIZ.LLJI));
        C786410Ut5.Pd(this.LIZLLL);
    }

    public C21535619Pu(C19PJ c19pj) {
        super(3);
        this.LJI = 1;
        this.LJFF = c19pj;
        this.LJ = new C12DM();
    }
}
