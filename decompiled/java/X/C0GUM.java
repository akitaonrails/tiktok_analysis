package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0GUM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GUM extends ConstraintLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final RectF LLILZIL;
    public final float[] LLILZLL;
    public final Path LLIZ;
    public final Paint LLIZLLLIL;

    public final RectF getRect() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.LL == 0 && this.LLILLL == 0 && this.LLILLJJLI == 0 && this.LLILZ == 0) {
            return;
        }
        this.LLIZ.reset();
        this.LLIZ.setFillType(Path.FillType.INVERSE_WINDING);
        this.LLIZ.addRoundRect(this.LLILZIL, this.LLILZLL, Path.Direction.CW);
        canvas.drawPath(this.LLIZ, this.LLIZLLLIL);
    }

    public C0GUM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0GUM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = new RectF();
        this.LLILZLL = new float[8];
        this.LLIZ = new Path();
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLIZLLLIL = paint;
    }

    public final void e0(int i, int i2, int i3, int i4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        float[] fArr = this.LLILZLL;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i3;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i4;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i2;
        fArr[6] = f4;
        fArr[7] = f4;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
    }
}
