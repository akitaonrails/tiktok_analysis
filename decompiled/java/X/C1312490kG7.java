package X;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0kG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312490kG7 {
    public int LIZ;
    public final C1312480kG6 LIZIZ;
    public final C1312480kG6 LIZJ;
    public final Interpolator LIZLLL;

    public final void LIZ() {
        C1312480kG6 c1312480kG6 = this.LIZIZ;
        c1312480kG6.LIZIZ = c1312480kG6.LIZLLL;
        c1312480kG6.LJIIJJI = true;
        C1312480kG6 c1312480kG62 = this.LIZJ;
        c1312480kG62.LIZIZ = c1312480kG62.LIZLLL;
        c1312480kG62.LJIIJJI = true;
    }

    public final boolean LIZLLL() {
        return this.LIZIZ.LJIIJJI && this.LIZJ.LJIIJJI;
    }

    public final boolean LIZIZ() {
        if (LIZLLL()) {
            return false;
        }
        int i = this.LIZ;
        if (i != 0) {
            if (i == 1) {
                C1312480kG6 c1312480kG6 = this.LIZIZ;
                if (!c1312480kG6.LJIIJJI && !c1312480kG6.LJFF() && !this.LIZIZ.LIZIZ()) {
                    C1312480kG6 c1312480kG62 = this.LIZIZ;
                    c1312480kG62.LIZIZ = c1312480kG62.LIZLLL;
                    c1312480kG62.LJIIJJI = true;
                }
                C1312480kG6 c1312480kG63 = this.LIZJ;
                if (!c1312480kG63.LJIIJJI && !c1312480kG63.LJFF() && !this.LIZJ.LIZIZ()) {
                    C1312480kG6 c1312480kG64 = this.LIZJ;
                    c1312480kG64.LIZIZ = c1312480kG64.LIZLLL;
                    c1312480kG64.LJIIJJI = true;
                }
            }
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1312480kG6 c1312480kG65 = this.LIZIZ;
        long j = jCurrentAnimationTimeMillis - c1312480kG65.LJII;
        int i2 = c1312480kG65.LJIIIIZZ;
        if (j >= i2) {
            LIZ();
            return true;
        }
        float interpolation = this.LIZLLL.getInterpolation(j / i2);
        C1312480kG6 c1312480kG66 = this.LIZIZ;
        c1312480kG66.LIZJ = c1312480kG66.LIZIZ;
        c1312480kG66.LIZIZ = c1312480kG66.LIZ + Math.round((c1312480kG66.LIZLLL - r1) * interpolation);
        C1312480kG6 c1312480kG67 = this.LIZJ;
        c1312480kG67.LIZJ = c1312480kG67.LIZIZ;
        c1312480kG67.LIZIZ = c1312480kG67.LIZ + Math.round(interpolation * (c1312480kG67.LIZLLL - r1));
        return true;
    }

    public C1312490kG7(Context context, Interpolator interpolator) {
        this.LIZLLL = interpolator;
        this.LIZIZ = new C1312480kG6(context);
        this.LIZJ = new C1312480kG6(context);
    }

    public final void LIZJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12 = i9;
        int i13 = i4;
        int i14 = i3;
        if (!LIZLLL()) {
            float f = this.LIZIZ.LJFF;
            float f2 = this.LIZJ.LJFF;
            float f3 = i14;
            if (Math.signum(f3) == Math.signum(f)) {
                float f4 = i13;
                if (Math.signum(f4) == Math.signum(f2)) {
                    i14 = (int) (f3 + f);
                    i13 = (int) (f4 + f2);
                }
            }
        }
        this.LIZ = 1;
        C1312480kG6 c1312480kG6 = this.LIZIZ;
        if (i14 >= 0.0f) {
            i11 = i12;
        } else {
            i11 = i10;
        }
        c1312480kG6.LIZJ(i, i14, i5, i6, 0, i11);
        C1312480kG6 c1312480kG62 = this.LIZJ;
        if (i13 < 0.0f) {
            i12 = i10;
        }
        c1312480kG62.LIZJ(i2, i13, i7, i8, 0, i12);
    }
}
