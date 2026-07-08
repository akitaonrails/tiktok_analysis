package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EV0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EV0 extends View {
    public final Paint LL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        for (int iLIZIZ = 0; iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + width; iLIZIZ += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))) {
            canvas.drawLine(iLIZIZ, 0, iLIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), this.LL);
        }
    }

    public C0EV0(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        Paint paint = new Paint();
        this.LL = paint;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
    }
}
