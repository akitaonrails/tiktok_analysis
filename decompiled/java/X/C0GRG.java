package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GRG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRG extends Drawable {
    public float LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(566));
    public final RectF LIZJ = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LIZJ.set(getBounds());
        RectF rectF = this.LIZJ;
        float f = this.LIZIZ;
        canvas.drawRoundRect(rectF, f, f, (Paint) this.LIZ.getValue());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.LIZ.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.LIZ.getValue()).setColorFilter(colorFilter);
    }
}
