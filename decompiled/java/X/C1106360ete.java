package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ete, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106360ete extends C21538719Qz {
    public float LLILZIL;
    public final Drawable LLILZLL;
    public boolean LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        float width;
        float fWidth;
        float f;
        super.dispatchDraw(canvas);
        float f2 = this.LLILZIL;
        if (f2 <= 0.0f || f2 >= 1.0f || (drawable = this.LLILZLL) == null) {
            return;
        }
        if (this.LLIZ) {
            width = getWidth();
            fWidth = drawable.getBounds().width() + getWidth();
            f = this.LLILZIL;
        } else {
            width = getWidth();
            fWidth = drawable.getBounds().width() + getWidth();
            f = 1 - this.LLILZIL;
        }
        canvas.save();
        canvas.translate(width - (fWidth * f), 0.0f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLIZ = z;
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            C16G6.LIZIZ(drawable, getLayoutDirection());
        }
    }

    public final void setSweepRatio(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public C1106360ete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new Paint(1);
        this.LLILZIL = -1.0f;
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.ecm);
        if (drawableLIZIZ != null) {
            drawableLIZIZ.setAutoMirrored(true);
        } else {
            drawableLIZIZ = null;
        }
        this.LLILZLL = drawableLIZIZ;
        new GradientDrawable().setColors(new int[]{0, -1, 0});
    }

    @Override // X.C21538719Qz, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, (intrinsicWidth * i2) / intrinsicHeight, intrinsicHeight);
        }
    }
}
