package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376380EpI extends View {
    public final Paint LL;
    public final Path LLILLJJLI;
    public final Matrix LLILLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() - 3.0f;
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLILLJJLI.reset();
        this.LLILLJJLI.addRoundRect(0.0f, 0.0f, getWidth() - 3.0f, height, new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ}, Path.Direction.CW);
        this.LLILLL.reset();
        this.LLILLL.setScale(2.0f, 2.0f);
        this.LLILLL.postTranslate(2.0f, -height);
        this.LLILLJJLI.transform(this.LLILLL);
        canvas.drawPath(this.LLILLJJLI, this.LL);
    }

    public C376380EpI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        this.LL = paint;
        this.LLILLJJLI = new Path();
        this.LLILLL = new Matrix();
    }
}
