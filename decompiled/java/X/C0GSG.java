package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GSG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSG extends Drawable {
    public final Context LIZ;
    public float LIZIZ = 0.0f;
    public final Paint LIZJ = new Paint(1);
    public final float LIZLLL = C418440Gaw.LIZIZ(200);
    public final C01GW LJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1627));

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C0GSG(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LIZIZ == fLIZLLL) {
            return;
        }
        this.LIZIZ = fLIZLLL;
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isAttachedToWindow()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iIntValue;
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        Paint paint = this.LIZJ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, this.LIZ);
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        Paint paint2 = this.LIZJ;
        RectF rectF = new RectF(0.0f, 0.0f, fWidth, fHeight);
        float f = this.LIZLLL;
        canvas.drawRoundRect(rectF, f, f, paint2);
        if (this.LIZIZ > 0.0f) {
            Paint paint3 = this.LIZJ;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.LIZ);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            paint3.setColor(iIntValue2);
            float fLIZLLL = ((fWidth - fHeight) * C13LZ.LIZLLL(this.LIZIZ, 0.0f, 1.0f)) + fHeight;
            if (((Boolean) this.LJ.getValue()).booleanValue()) {
                Paint paint4 = this.LIZJ;
                RectF rectF2 = new RectF(fWidth - fLIZLLL, 0.0f, fWidth, fHeight);
                float f2 = this.LIZLLL;
                canvas.drawRoundRect(rectF2, f2, f2, paint4);
                return;
            }
            Paint paint5 = this.LIZJ;
            RectF rectF3 = new RectF(0.0f, 0.0f, fLIZLLL, fHeight);
            float f3 = this.LIZLLL;
            canvas.drawRoundRect(rectF3, f3, f3, paint5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZJ.setColorFilter(colorFilter);
    }
}
