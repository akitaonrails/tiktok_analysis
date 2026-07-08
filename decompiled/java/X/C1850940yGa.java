package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0yGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850940yGa implements InterfaceC1844880y6o {
    public final ValueAnimator LIZ;

    @Override // X.InterfaceC1844880y6o
    public final Float LIZ() {
        return null;
    }

    @Override // X.InterfaceC1844880y6o
    public final Boolean W5() {
        return null;
    }

    @Override // X.InterfaceC1844880y6o
    public final float getProgress() {
        return this.LIZ.getAnimatedFraction();
    }

    @Override // X.InterfaceC1844880y6o
    public final float getValue() {
        return ((Float) this.LIZ.getAnimatedValue()).floatValue();
    }

    public C1850940yGa(ValueAnimator valueAnimator) {
        this.LIZ = valueAnimator;
    }
}
