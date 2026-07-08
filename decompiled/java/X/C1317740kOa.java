package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: X.0kOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317740kOa extends BitmapDrawable {
    public final Bitmap LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final InterfaceC1320380kSq LIZLLL;
    public final Paint LJ;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        double dMax;
        if (this.LIZIZ > 0 && this.LIZJ > 0) {
            if (this.LIZLLL == InterfaceC1320380kSq.LIZJ) {
                dMax = Math.min((((double) canvas.getWidth()) * 1.0d) / ((double) this.LIZIZ), (((double) canvas.getHeight()) * 1.0d) / ((double) this.LIZJ));
            } else {
                dMax = Math.max((((double) canvas.getWidth()) * 1.0d) / ((double) this.LIZIZ), (((double) canvas.getHeight()) * 1.0d) / ((double) this.LIZJ));
            }
            double d = ((double) this.LIZIZ) * dMax;
            double d2 = ((double) this.LIZJ) * dMax;
            double width = (((double) canvas.getWidth()) - d) / 2.0d;
            double height = (((double) canvas.getHeight()) - d2) / 2.0d;
            canvas.drawBitmap(this.LIZ, (Rect) null, new Rect((int) width, (int) height, (int) (width + d), (int) (height + d2)), this.LJ);
            return;
        }
        super.draw(canvas);
    }

    public C1317740kOa(Bitmap bitmap, int i, int i2, InterfaceC1320380kSq interfaceC1320380kSq) {
        super(bitmap);
        Paint paint = new Paint();
        this.LJ = paint;
        this.LIZ = bitmap;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = interfaceC1320380kSq;
        paint.setAntiAlias(true);
    }
}
