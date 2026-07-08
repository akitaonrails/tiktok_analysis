package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0STS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0STS extends C0STT {
    public boolean LIZLLL;

    public C0STS() {
        PointF pointF = this.LIZIZ;
        pointF.x = 0.33f;
        pointF.y = 0.86f;
        PointF pointF2 = this.LIZJ;
        pointF2.x = 0.2f;
        pointF2.y = 1.0f;
    }

    @Override // X.C0STT, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.LIZLLL) {
            return super.getInterpolation(f);
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
