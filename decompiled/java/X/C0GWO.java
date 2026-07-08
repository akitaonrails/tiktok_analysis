package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GWO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWO extends View {
    public final Paint LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background == null) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        background.draw(canvas);
        canvas.drawRect(this.LLILLL, 0.0f, this.LLILZ, getHeight(), this.LL);
        canvas.restoreToCount(iSaveLayer);
    }

    public final void setColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setLength(int i) {
        this.LLILLJJLI = i;
        int i2 = this.LLILLL;
        this.LLILZ = C419990GdR.LIZIZ(i + i2, i2, getWidth() - getPaddingRight());
        invalidate();
    }

    public final void setStart(int i) {
        this.LLILLL = i;
        this.LLILZ = C419990GdR.LIZIZ(this.LLILLJJLI + i, i, getWidth() - getPaddingRight());
        invalidate();
    }

    public C0GWO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsKTVView, 0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsKTVView_android_color, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColor(color);
    }
}
