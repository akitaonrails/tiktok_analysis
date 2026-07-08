package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GS8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GS8 extends View {
    public final Paint LL;
    public final Path LLILLJJLI;
    public RectF LLILLL;

    public C0GS8(Context context) {
        int iIntValue;
        super(context, null);
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILLJJLI.reset();
        this.LLILLJJLI.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        Path path = new Path();
        path.addRect(this.LLILLL, Path.Direction.CW);
        this.LLILLJJLI.op(path, Path.Op.DIFFERENCE);
        canvas.drawPath(this.LLILLJJLI, this.LL);
    }

    public final void setHoleRect$explore_release(Rect rect) {
        this.LLILLL = new RectF(rect);
        invalidate();
    }
}
