package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369040EdS extends View {
    public final Paint LL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            canvas.drawRoundRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), 10.0f, 10.0f, this.LL);
        }
    }

    public C369040EdS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setColor(0);
        float fLIZIZ = C418440Gaw.LIZIZ(7);
        float fLIZIZ2 = C418440Gaw.LIZIZ(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ft, context);
        paint.setShadowLayer(fLIZIZ, 0.0f, fLIZIZ2, numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LL = paint;
        setLayerType(1, paint);
    }
}
