package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GWD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWD extends View {
    public final Paint LL;
    public final Path LLILLJJLI;

    public C0GWD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : Color.argb(128, 0, 0, 0);
        if (this.LL.getColor() != iIntValue) {
            this.LL.setColor(iIntValue);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int iArgb;
        super.onConfigurationChanged(configuration);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, getContext());
        if (numLIZJ != null) {
            iArgb = numLIZJ.intValue();
        } else {
            iArgb = Color.argb(128, 0, 0, 0);
        }
        if (this.LL.getColor() != iArgb) {
            this.LL.setColor(iArgb);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILLJJLI.isEmpty()) {
            return;
        }
        canvas.drawPath(this.LLILLJJLI, this.LL);
    }

    public C0GWD(Context context, AttributeSet attributeSet, int i) {
        int iArgb;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, getContext());
        if (numLIZJ != null) {
            iArgb = numLIZJ.intValue();
        } else {
            iArgb = Color.argb(128, 0, 0, 0);
        }
        paint.setColor(iArgb);
        this.LL = paint;
        this.LLILLJJLI = new Path();
        setImportantForAccessibility(2);
        setClickable(false);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLJJLI.reset();
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f2 / 2.0f;
            this.LLILLJJLI.moveTo(0.0f, 0.0f);
            float f4 = 0.5522848f * f;
            this.LLILLJJLI.cubicTo(f4, 0.0f, f, f3 * 0.44771522f, f, f3);
            this.LLILLJJLI.cubicTo(f, f3 * 1.5522847f, f4, f2, 0.0f, f2);
            this.LLILLJJLI.close();
        }
    }
}
