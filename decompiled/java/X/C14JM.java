package X;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.14JM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14JM {
    public final C14JO LIZ;

    public final int LIZ() {
        return this.LIZ.LIZLLL();
    }

    public C14JM(final WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ = new C14JO(windowInsetsAnimation) { // from class: X.14JN
                public final WindowInsetsAnimation LJ;

                @Override // X.C14JO
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C14JO
                public final float LIZIZ() {
                    return this.LJ.getFraction();
                }

                @Override // X.C14JO
                public final float LIZJ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C14JO
                public final int LIZLLL() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C14JO
                public final void LJ(float f) {
                    this.LJ.setFraction(f);
                }
            };
        }
    }

    public C14JM(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            final WindowInsetsAnimation windowInsetsAnimation = new WindowInsetsAnimation(i, interpolator, j);
            this.LIZ = new C14JO(windowInsetsAnimation) { // from class: X.14JN
                public final WindowInsetsAnimation LJ;

                @Override // X.C14JO
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C14JO
                public final float LIZIZ() {
                    return this.LJ.getFraction();
                }

                @Override // X.C14JO
                public final float LIZJ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C14JO
                public final int LIZLLL() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C14JO
                public final void LJ(float f) {
                    this.LJ.setFraction(f);
                }
            };
        } else {
            this.LIZ = new C14JI(i, interpolator, j);
        }
    }
}
