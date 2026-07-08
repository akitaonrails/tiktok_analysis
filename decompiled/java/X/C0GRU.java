package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRU extends View {
    public final Path LL;
    public final Paint LLILLJJLI;
    public final float LLILLL;

    public C0GRU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = this.LLILLL * getWidth();
        float f = 0.56f * width;
        Path path = this.LL;
        path.lineTo(f, 0.0f);
        path.quadTo(width, getHeight() * 0.21f, width, getHeight() * 0.5f);
        path.quadTo(width, getHeight() * 0.78f, f, getHeight());
        path.lineTo(0.0f, getHeight());
        path.lineTo(0.0f, 0.0f);
        path.close();
        canvas.drawPath(this.LL, this.LLILLJJLI);
    }

    public C0GRU(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new Path();
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e9, context);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LLILLJJLI = paint;
        float f = C0A0M.LIZ;
        this.LLILLL = (f <= 0.0f || f > 0.5f) ? 0.25f : f;
    }
}
