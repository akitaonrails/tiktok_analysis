package X;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.14JT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14JT {
    public final C14JZ LIZ;

    public final int LIZ() {
        return this.LIZ.LIZJ();
    }

    public C14JT(final WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ = new C14JZ(windowInsetsAnimation) { // from class: X.14JP
                public final WindowInsetsAnimation LJ;

                @Override // X.C14JZ
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C14JZ
                public final float LIZIZ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C14JZ
                public final int LIZJ() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C14JZ
                public final void LIZLLL(float f) {
                    this.LJ.setFraction(f);
                }
            };
        }
    }

    public final void LIZIZ(float f) {
        this.LIZ.LIZLLL(f);
    }

    public C14JT(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            final WindowInsetsAnimation windowInsetsAnimation = new WindowInsetsAnimation(i, interpolator, j);
            this.LIZ = new C14JZ(windowInsetsAnimation) { // from class: X.14JP
                public final WindowInsetsAnimation LJ;

                @Override // X.C14JZ
                public final long LIZ() {
                    return this.LJ.getDurationMillis();
                }

                @Override // X.C14JZ
                public final float LIZIZ() {
                    return this.LJ.getInterpolatedFraction();
                }

                @Override // X.C14JZ
                public final int LIZJ() {
                    return this.LJ.getTypeMask();
                }

                {
                    super(0, null, 0L);
                    this.LJ = windowInsetsAnimation;
                }

                @Override // X.C14JZ
                public final void LIZLLL(float f) {
                    this.LJ.setFraction(f);
                }
            };
        } else {
            this.LIZ = new C14JU(i, interpolator, j);
        }
    }
}
