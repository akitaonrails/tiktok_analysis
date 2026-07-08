package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.19Rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21541319Rz extends C21538919Rb {
    public final Paint LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public int LLJJL;

    public C21541319Rz() {
        this(null);
    }

    public C21541319Rz(C19RX c19rx) {
        super(c19rx == null ? new C19RX() : c19rx);
        Paint paint = new Paint(1);
        this.LLJJJJJIL = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLJJJJLIIL = new RectF();
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.LLJJL = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.LLJJJJLIIL, this.LLJJJJJIL);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.LLJJL);
        }
    }

    public final void LJIJJ(float f, float f2, float f3, float f4) {
        RectF rectF = this.LLJJJJLIIL;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
