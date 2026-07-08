package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679330Qkl extends GradientDrawable {
    public float LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(387));
    public final RectF LIZJ = new RectF();

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.LIZJ.set(getBounds());
        RectF rectF = this.LIZJ;
        float f = this.LIZIZ;
        canvas.drawRoundRect(rectF, f, f, (Paint) this.LIZ.getValue());
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.LIZ.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.LIZ.getValue()).setColorFilter(colorFilter);
    }
}
