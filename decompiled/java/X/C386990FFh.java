package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386990FFh extends C386980FFg {
    public final int LJI;
    public final int LJII;
    public final Paint LJIIIIZZ;
    public final Path LJIIIZ;

    @Override // X.C386980FFg
    public final int LIZJ() {
        return this.LJII;
    }

    @Override // X.C386980FFg
    public final float LIZ(float f) {
        return this.LJII + C418440Gaw.LIZIZ(Float.valueOf(f)) + this.LJI;
    }

    @Override // X.C386980FFg, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.LJIIIZ.rewind();
        this.LJIIIZ.moveTo(C386980FFg.LIZIZ(53.5f), C386980FFg.LIZIZ(13.5f));
        this.LJIIIZ.lineTo(C386980FFg.LIZIZ(54.0f), C386980FFg.LIZIZ(13.5f));
        this.LJIIIZ.lineTo(C386980FFg.LIZIZ(54.0f), C386980FFg.LIZIZ(37.5f));
        this.LJIIIZ.lineTo(C386980FFg.LIZIZ(53.5f), C386980FFg.LIZIZ(37.5f));
        this.LJIIIZ.close();
        canvas.drawPath(this.LJIIIZ, this.LJIIIIZZ);
    }

    public C386990FFh(Context context, int i, int i2, int i3) {
        int iIntValue;
        super(i, i2, context);
        this.LJI = i3;
        this.LJII = i / 2;
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ne, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LJIIIIZZ = paint;
        this.LJIIIZ = new Path();
    }
}
