package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0GST, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GST extends View {
    public List<float[]> LL;
    public final Paint LLILLJJLI;
    public final Path LLILLL;

    public final List<float[]> getPoints() {
        return this.LL;
    }

    public C0GST(Context context) {
        super(context);
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        this.LLILLL = new Path();
        paint.setColor(C960203pA.LIZ(R.attr.bx, getContext()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<float[]> list = this.LL;
        if (list != null) {
            for (float[] fArr : list) {
                if (fArr != null) {
                    this.LLILLL.reset();
                    this.LLILLL.moveTo(fArr[0], fArr[1]);
                    this.LLILLL.lineTo(fArr[2], fArr[3]);
                    this.LLILLL.lineTo(fArr[6], fArr[7]);
                    this.LLILLL.lineTo(fArr[4], fArr[5]);
                    this.LLILLL.close();
                    if (canvas != null) {
                        canvas.drawPath(this.LLILLL, this.LLILLJJLI);
                    }
                }
            }
        }
    }

    public final void setPoints(List<float[]> list) {
        this.LL = list;
    }
}
