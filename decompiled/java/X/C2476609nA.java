package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.09nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476609nA extends View {
    public final Paint LL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, C418440Gaw.LIZIZ(2), this.LL);
    }

    public C2476609nA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LL = paint;
    }
}
