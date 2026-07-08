package X;

/* JADX INFO: renamed from: X.19Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21527219Mo extends AbstractInterpolatorC21527619Ms {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final /* synthetic */ C21526919Ml LIZLLL;

    @Override // X.AbstractInterpolatorC21527619Ms
    public final float LIZ() {
        return this.LIZLLL.LLILLL;
    }

    public C21527219Mo(C21526919Ml c21526919Ml) {
        this.LIZLLL = c21526919Ml;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3;
        float f4 = this.LIZ;
        if (f4 > 0.0f) {
            float f5 = this.LIZJ;
            if (f4 / f5 < f) {
                f = f4 / f5;
            }
            this.LIZLLL.LLILLL = f4 - (f5 * f);
            f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
            f3 = this.LIZIZ;
        } else {
            float f6 = this.LIZJ;
            if ((-f4) / f6 < f) {
                f = (-f4) / f6;
            }
            this.LIZLLL.LLILLL = (f6 * f) + f4;
            f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
            f3 = this.LIZIZ;
        }
        return f2 + f3;
    }
}
