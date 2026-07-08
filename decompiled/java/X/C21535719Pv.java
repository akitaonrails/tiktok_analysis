package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21535719Pv extends AbstractC21534519Pj<ObjectAnimator> {
    public static final int[] LJIIJJI = {533, 567, 850, 750};
    public static final int[] LJIIL = {1267, LSPassThroughRecordSizeConfig.DEFAULT, 333, 0};
    public static final C21535819Pw LJIILIIL;
    public ObjectAnimator LIZLLL;
    public final Interpolator[] LJ;
    public final C19PJ LJFF;
    public int LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public AbstractC21534319Ph LJIIJ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.19Pw] */
    static {
        final Class<Float> cls = Float.class;
        LJIILIIL = new Property<C21535719Pv, Float>(cls) { // from class: X.19Pw
            @Override // android.util.Property
            public final Float get(C21535719Pv c21535719Pv) {
                return Float.valueOf(c21535719Pv.LJIIIIZZ);
            }

            @Override // android.util.Property
            public final void set(C21535719Pv c21535719Pv, Float f) {
                C21535719Pv c21535719Pv2 = c21535719Pv;
                float fFloatValue = f.floatValue();
                c21535719Pv2.LJIIIIZZ = fFloatValue;
                int i = (int) (fFloatValue * 1800.0f);
                int i2 = 0;
                do {
                    c21535719Pv2.LIZIZ[i2] = Math.max(0.0f, Math.min(1.0f, c21535719Pv2.LJ[i2].getInterpolation((i - C21535719Pv.LJIIL[i2]) / C21535719Pv.LJIIJJI[i2])));
                    i2++;
                } while (i2 < 4);
                if (c21535719Pv2.LJII) {
                    Arrays.fill(c21535719Pv2.LIZJ, C19PM.LIZ(c21535719Pv2.LJFF.LIZJ[c21535719Pv2.LJI], c21535719Pv2.LIZ.LLJI));
                    c21535719Pv2.LJII = false;
                }
                c21535719Pv2.LIZ.invalidateSelf();
            }
        };
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZIZ() {
        this.LJI = 0;
        int iLIZ = C19PM.LIZ(this.LJFF.LIZJ[0], this.LIZ.LLJI);
        int[] iArr = this.LIZJ;
        iArr[0] = iLIZ;
        iArr[1] = iLIZ;
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
        if (!this.LIZ.isVisible()) {
            LIZ();
        } else {
            this.LJIIIZ = true;
            this.LIZLLL.setRepeatCount(0);
        }
    }

    @Override // X.AbstractC21534519Pj
    public final void LJ() {
        if (this.LIZLLL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, LJIILIIL, 0.0f, 1.0f);
            this.LIZLLL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new AnimatorListenerAdapter() { // from class: X.19Py
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C21535719Pv c21535719Pv = this.LL;
                    if (c21535719Pv.LJIIIZ) {
                        c21535719Pv.LIZLLL.setRepeatCount(-1);
                        this.LL.LJIIJ.LIZ();
                        this.LL.LJIIIZ = false;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    C21535719Pv c21535719Pv = this.LL;
                    c21535719Pv.LJI = (c21535719Pv.LJI + 1) % c21535719Pv.LJFF.LIZJ.length;
                    c21535719Pv.LJII = true;
                }
            });
        }
        this.LJI = 0;
        int iLIZ = C19PM.LIZ(this.LJFF.LIZJ[0], this.LIZ.LLJI);
        int[] iArr = this.LIZJ;
        iArr[0] = iLIZ;
        iArr[1] = iLIZ;
        C786410Ut5.Pd(this.LIZLLL);
    }

    @Override // X.AbstractC21534519Pj
    public final void LIZJ(C21534219Pg c21534219Pg) {
        this.LJIIJ = c21534219Pg;
    }

    public C21535719Pv(Context context, C19PJ c19pj) {
        super(2);
        this.LJFF = c19pj;
        this.LJ = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.d), AnimationUtils.loadInterpolator(context, R.animator.e), AnimationUtils.loadInterpolator(context, R.animator.f), AnimationUtils.loadInterpolator(context, R.animator.g)};
    }
}
