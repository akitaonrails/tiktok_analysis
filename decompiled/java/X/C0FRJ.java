package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0FRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FRJ extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;

    public int getColor() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width, this.LL);
        canvas.drawCircle(width, width, width - (this.LLILLL / 2.0f), this.LLILLJJLI);
    }

    public C0FRJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iLIZIZ = (int) C11VU.LIZIZ(2.0f, getContext());
        this.LLILLL = iLIZIZ;
        this.LLILZ = -1;
        this.LLILZIL = false;
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setColor(-1);
        this.LLILLJJLI.setAntiAlias(true);
        this.LLILLJJLI.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI.setStrokeWidth(iLIZIZ);
        Paint paint2 = new Paint();
        this.LL = paint2;
        paint2.setColor(this.LLILZ);
        this.LL.setAntiAlias(true);
        this.LL.setStyle(Paint.Style.FILL);
        this.LL.setStrokeWidth(iLIZIZ);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
