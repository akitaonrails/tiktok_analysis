package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Efk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370460Efk extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;

    public C370460Efk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILLJJLI.getStrokeWidth() <= 0.0f) {
            this.LLILLJJLI.setStrokeWidth(getHeight() * 0.1f);
        }
        int height = getHeight();
        float height2 = getHeight() / 2.0f;
        float height3 = getHeight() / 2.0f;
        float height4 = getHeight() * 0.5f;
        float f = height;
        float f2 = 2;
        float width = (getWidth() - getPaddingRight()) - ((f - height4) / f2);
        float f3 = width - height4;
        float f4 = height4 / f2;
        canvas.drawCircle(height3, height2, f / 2.0f, this.LL);
        canvas.save();
        canvas.rotate(45.0f, height3, height2);
        canvas.drawLine(f3, height2, width, height2, this.LLILLJJLI);
        canvas.drawLine(height3, height2 - f4, height3, height2 + f4, this.LLILLJJLI);
        canvas.restore();
    }

    public final void setButtonBackgroundColor(int i) {
        this.LL.setColor(i);
    }

    public final void setCrossLineColor(int i) {
        this.LLILLJJLI.setColor(i);
    }

    public C370460Efk(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        setButtonBackgroundColor(C960203pA.LIZ(R.attr.a1p, context));
        setCrossLineColor(C960203pA.LIZ(R.attr.bx, context));
    }
}
