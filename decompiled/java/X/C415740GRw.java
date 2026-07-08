package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415740GRw extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;

    public final int getCircleRadius() {
        return this.LLILZ;
    }

    public final float getCircleX() {
        return this.LLILLJJLI;
    }

    public final float getCircleY() {
        return this.LLILLL;
    }

    public C415740GRw(Context context) {
        super(context);
        Paint paint = new Paint();
        this.LL = paint;
        this.LLILLJJLI = -1.0f;
        this.LLILLL = -1.0f;
        this.LLILZ = -1;
        paint.setColor(C20736316Cj.LIZIZ(R.attr.cc9, getContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.LLILLJJLI > 0.0f && this.LLILLL > 0.0f && this.LLILZ > 0) {
            this.LL.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL);
            canvas.restore();
        }
    }

    public final void setCircleRadius(int i) {
        this.LLILZ = i;
    }

    public final void setCircleX(float f) {
        this.LLILLJJLI = f;
    }

    public final void setCircleY(float f) {
        this.LLILLL = f;
    }
}
