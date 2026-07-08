package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429960GtW extends Path {
    public float LIZ = 0.0f;
    public int LIZIZ = 0;

    @Override // android.graphics.Path
    public final void addRect(RectF rectF, Path.Direction direction) {
        float f = rectF.left;
        float f2 = rectF.top;
        rectF.set(f, f2, rectF.right, (this.LIZIZ + f2) - this.LIZ);
        super.addRect(rectF, direction);
    }

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        super.addRect(f, f2, f3, (this.LIZIZ + f2) - this.LIZ, direction);
    }
}
