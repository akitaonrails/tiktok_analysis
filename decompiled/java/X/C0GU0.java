package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0GU0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU0 extends Drawable {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public final Paint LIZJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZ.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZ.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, null);
        this.LIZ.draw(canvas);
        int iSaveLayer2 = canvas.saveLayer(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.LIZJ);
        this.LIZIZ.draw(canvas);
        canvas.restoreToCount(iSaveLayer2);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        boolean z;
        int iWidth;
        int iHeight;
        super.onBoundsChange(rect);
        this.LIZ.setBounds(rect);
        Integer numValueOf = Integer.valueOf(this.LIZIZ.getIntrinsicWidth());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iWidth = numValueOf.intValue();
        } else {
            iWidth = rect.width();
        }
        Integer numValueOf2 = Integer.valueOf(this.LIZIZ.getIntrinsicHeight());
        if (numValueOf2.intValue() > 0) {
            iHeight = numValueOf2.intValue();
        } else {
            iHeight = rect.height();
        }
        int iCenterX = rect.centerX() - (iWidth / 2);
        int iCenterY = rect.centerY() - (iHeight / 2);
        this.LIZIZ.setBounds(iCenterX, iCenterY, iWidth + iCenterX, iHeight + iCenterY);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
        this.LIZIZ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C0GU0(C389930FQp c389930FQp, TuxIconDrawable tuxIconDrawable) {
        this.LIZ = c389930FQp;
        this.LIZIZ = tuxIconDrawable;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LIZJ = paint;
    }
}
