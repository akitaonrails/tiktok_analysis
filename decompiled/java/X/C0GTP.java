package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GTP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTP extends Path {
    public RectF LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        float f;
        float f2 = this.LIZLLL;
        if (f2 > 0.0f) {
            f = rectF.left + f2;
        } else {
            f = rectF.right;
        }
        rectF.set(rectF.left, this.LIZIZ, f, this.LIZJ);
        this.LIZ = rectF;
        super.addRect(rectF, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        float f5 = this.LIZLLL;
        if (f5 > 0.0f) {
            f3 = f + f5;
        }
        this.LIZ = new RectF(f, this.LIZIZ, f3, this.LIZJ);
        super.addRect(f, this.LIZIZ, f3, this.LIZJ, direction);
    }
}
