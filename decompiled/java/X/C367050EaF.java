package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0EaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367050EaF extends Drawable {
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawArc(new RectF(0.0f, getBounds().centerY() - 0.0f, 2 * 0.0f, getBounds().centerY() + 0.0f), 90.0f, 180.0f, true, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
