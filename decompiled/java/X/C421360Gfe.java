package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0Gfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421360Gfe extends C16F5 {
    public final Paint LLJJ;
    public boolean LLJJI;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLJJI) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLJJ);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setGray(boolean z) {
        this.LLJJI = z;
    }

    public C421360Gfe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.LLJJ = paint;
    }
}
