package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415520GRa extends View {
    public float LL;
    public final float LLILLJJLI;
    public final Path LLILLL;
    public final boolean LLILZ;
    public final Paint LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float f = 0.0f;
        if (this.LL <= 0.0f) {
            float f2 = 2;
            canvas.drawLine(this.LLILLJJLI / f2, height, getWidth() - (this.LLILLJJLI / f2), height, this.LLILZIL);
            return;
        }
        float width = getWidth() / 2.0f;
        this.LLILLL.reset();
        float f3 = 2;
        this.LLILLL.moveTo(this.LLILLJJLI / f3, height);
        if (!this.LLILZ) {
            Path path = this.LLILLL;
            float f4 = height - this.LL;
            if (f4 >= 0.0f) {
                f = f4;
            }
            path.lineTo(width, f);
        } else {
            Path path2 = this.LLILLL;
            float f5 = this.LL + height;
            float height2 = getHeight();
            if (f5 > height2) {
                f5 = height2;
            }
            path2.lineTo(width, f5);
        }
        this.LLILLL.lineTo(getWidth() - (this.LLILLJJLI / f3), height);
        canvas.drawPath(this.LLILLL, this.LLILZIL);
    }

    public final void setArrowColor(int i) {
        this.LLILZIL.setColor(i);
        invalidate();
    }

    public final void setArrowH(float f) {
        this.LL = f;
        invalidate();
    }

    public C415520GRa(Context context, AttributeSet attributeSet) {
        int iLIZIZ;
        super(context, attributeSet, 0);
        float fLIZIZ = C418440Gaw.LIZIZ(4);
        this.LLILLJJLI = fLIZIZ;
        this.LLILLL = new Path();
        this.LLILZ = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        if (C467860IWi.LIZ(context)) {
            iLIZIZ = C475630Ikz.LIZIZ(R.attr.f496ec, context);
        } else {
            iLIZIZ = C475630Ikz.LIZIZ(R.attr.bp, context);
        }
        paint.setColor(iLIZIZ);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fLIZIZ);
        this.LLILZIL = paint;
    }
}
