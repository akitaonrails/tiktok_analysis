package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GTV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTV extends Path {
    public float LIZ;
    public float LIZIZ;

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        rectF.set(rectF.left, this.LIZ, rectF.right, this.LIZIZ);
        super.addRect(rectF, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        super.addRect(f, this.LIZ, f3, this.LIZIZ, direction);
    }
}
