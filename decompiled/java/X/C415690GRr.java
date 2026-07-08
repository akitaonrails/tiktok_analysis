package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C415690GRr extends View {
    public float LL;
    public float LLILLJJLI;
    public int LLILLL;
    public Paint LLILZ;
    public Path LLILZIL;

    public final void LIZ() {
        this.LLILZIL.reset();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.LLILZIL.moveTo(this.LLILLJJLI, getHeight() / 2.0f);
        this.LLILZIL.lineTo(getWidth() / 2.0f, (getHeight() / 2.0f) + (this.LLILLL * this.LL));
        this.LLILZIL.lineTo(getWidth() - this.LLILLJJLI, getHeight() / 2.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.LLILZIL, this.LLILZ);
    }

    public void setOffset(float f) {
        this.LL = f;
        LIZ();
        invalidate();
    }

    public C415690GRr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.LLILZ = paint;
        paint.setColor(C20736316Cj.LIZIZ(R.attr.fxi, getContext()));
        this.LLILZ.setStyle(Paint.Style.STROKE);
        this.LLILZ.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.a52));
        this.LLILLJJLI = this.LLILZ.getStrokeWidth() / 2.0f;
        this.LLILZ.setStrokeCap(Paint.Cap.ROUND);
        this.LLILZ.setStrokeJoin(Paint.Join.ROUND);
        this.LLILZIL = new Path();
        this.LLILLL = getContext().getResources().getDimensionPixelSize(R.dimen.a51);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
