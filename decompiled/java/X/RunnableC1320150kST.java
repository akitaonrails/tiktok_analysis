package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: X.0kST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1320150kST extends C1331050kk3 implements Runnable {
    public final int LLILZIL;
    public final boolean LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AutoRotateDrawable@f04e.run");
        try {
            this.LLIZLLLIL = false;
            this.LLIZ += (int) ((20.0f / this.LLILZIL) * 360.0f);
            invalidateSelf();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoRotateDrawable@f04e.run");
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.LLIZ;
        if (!this.LLILZLL) {
            f = 360.0f - f;
        }
        canvas.rotate(f, r1 + (i / 2), r3 + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC1320150kST(Drawable drawable, int i) {
        super(drawable);
        drawable.getClass();
        this.LLIZ = 0.0f;
        this.LLIZLLLIL = false;
        this.LLILZIL = i;
        this.LLILZLL = true;
    }
}
