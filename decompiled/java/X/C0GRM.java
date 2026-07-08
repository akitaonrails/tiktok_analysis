package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRM extends View {
    public int LL;
    public boolean LLILLJJLI;
    public final Paint LLILLL;

    public final int getBatteryLevel() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        int i = this.LL;
        float f = (i * width) / 100;
        Paint paint = this.LLILLL;
        int iIntValue = -419430401;
        if (this.LLILLJJLI) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nv, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
        } else if (i < 20) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1r, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
        } else {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ef, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            }
        }
        paint.setColor(iIntValue);
        if (getLayoutDirection() == 1) {
            canvas.drawRect(width - f, 0.0f, width, height, this.LLILLL);
        } else {
            canvas.drawRect(0.0f, 0.0f, f, height, this.LLILLL);
        }
    }

    public final void setBatteryLevel(int i) {
        this.LL = i;
    }

    public final void setCharging(boolean z) {
        this.LLILLJJLI = z;
    }

    public C0GRM(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ef, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -419430401;
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
    }
}
