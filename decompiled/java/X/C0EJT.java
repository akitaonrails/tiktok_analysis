package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EJT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJT extends View {
    public static final float LLILZ = C418440Gaw.LIZIZ(Double.valueOf(5.5d));
    public static final float LLILZIL = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final List<Float> LLILLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (int) (getWidth() / LLILZ);
        for (int i = 0; i < width; i++) {
            Float f = (Float) C13LP.LJJJLZIJ(i, this.LLILLL);
            if (f != null) {
                LIZ(f.floatValue() * (getHeight() - LLILZIL), i, canvas, this.LL);
            } else {
                LIZ(0.0f, i, canvas, this.LLILLJJLI);
            }
        }
    }

    public final void set(List<Float> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(C13LP.LJLJJLL(list));
        invalidate();
    }

    public C0EJT(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        float f = LLILZIL;
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1s, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.STROKE);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1s, context);
        paint2.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : -16777216);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI = paint2;
        this.LLILLL = new ArrayList();
    }

    public static void LIZ(float f, int i, Canvas canvas, Paint paint) {
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        if (f < fLIZIZ) {
            f = fLIZIZ;
        }
        float f2 = (i + 0.5f) * LLILZ;
        float f3 = LLILZIL;
        float height = (f3 / 2) + (((canvas.getHeight() - f3) - f) / 2.0f);
        canvas.drawLine(f2, height, f2, height + f, paint);
    }
}
