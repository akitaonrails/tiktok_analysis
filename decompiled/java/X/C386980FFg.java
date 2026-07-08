package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C386980FFg extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final Path LJ;
    public final int LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.LIZLLL.getAlpha();
    }

    public int LIZJ() {
        return this.LJFF;
    }

    public static float LIZIZ(float f) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
    }

    public float LIZ(float f) {
        return LIZJ() + C418440Gaw.LIZIZ(Float.valueOf(f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.LJ.rewind();
        this.LJ.moveTo(LIZ(-13.5f), LIZIZ(49.0f));
        this.LJ.cubicTo(LIZ(-8.0f), LIZIZ(50.0f), LIZ(-8.0f), LIZIZ(50.0f), LIZ(-6.0f), LIZIZ(52.0f));
        this.LJ.lineTo(LIZ(-1.0f), LIZIZ(57.3f));
        this.LJ.cubicTo(LIZ(0.0f), LIZIZ(58.0f), LIZ(0.0f), LIZIZ(58.0f), LIZ(1.0f), LIZIZ(57.3f));
        this.LJ.lineTo(LIZ(6.0f), LIZIZ(52.0f));
        this.LJ.cubicTo(LIZ(8.0f), LIZIZ(50.0f), LIZ(8.0f), LIZIZ(50.0f), LIZ(13.5f), LIZIZ(49.0f));
        this.LJ.close();
        Float fValueOf = Float.valueOf(4.0f);
        canvas.drawRoundRect(LIZIZ(4.0f), LIZIZ(4.0f), this.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))), LIZIZ(8.0f), LIZIZ(8.0f), this.LIZLLL);
        canvas.drawPath(this.LJ, this.LIZLLL);
        canvas.drawRoundRect(LIZIZ(4.0f), LIZIZ(4.0f), this.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), this.LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(11.8f))), LIZIZ(8.0f), LIZIZ(8.0f), this.LIZJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LIZLLL.getAlpha() != i) {
            this.LIZLLL.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C386980FFg(int i, int i2, Context context) {
        int iIntValue;
        int iIntValue2;
        this.LIZ = i;
        this.LIZIZ = i2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        Paint paint = new Paint(1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LIZJ = paint;
        Paint paint2 = new Paint(1);
        if (numLIZJ != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint2.setColor(iIntValue2);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nd, context);
        paint2.setShadowLayer(12.0f, 0.0f, 0.0f, numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        this.LIZLLL = paint2;
        this.LJ = new Path();
        this.LJFF = i / 2;
    }
}
