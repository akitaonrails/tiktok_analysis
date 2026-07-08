package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9Q extends View {
    public boolean LL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.LL) {
            C444880HcU c444880HcU = C0H9N.LIZ;
        }
    }

    public C0H9Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayerType(1, null);
        new Paint().setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context);
        if (numLIZJ != null) {
            numLIZJ.intValue();
        }
    }
}
