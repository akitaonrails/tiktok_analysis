package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C415680GRq extends View {
    public boolean LL;
    public Paint LLILLJJLI;
    public float LLILLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LL) {
            canvas.save();
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.LLILLL, this.LLILLJJLI);
        }
    }

    public void setShadowed(boolean z) {
        if (this.LL != z) {
            this.LL = z;
            invalidate();
        }
    }

    public C415680GRq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI == null) {
            this.LLILLL = getHeight();
            Paint paint = new Paint(1);
            this.LLILLJJLI = paint;
            paint.setColor(C20736316Cj.LIZIZ(R.attr.ey9, getContext()));
        }
    }
}
