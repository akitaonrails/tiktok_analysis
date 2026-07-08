package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371530EhT extends View {
    public final float LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;

    public final int getColor() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        float fMin = Math.min(getWidth(), getHeight()) / f;
        canvas.drawCircle(getWidth() / f, getHeight() / f, fMin - (this.LL / f), this.LLILLL);
        this.LLILZ.setColor(this.LLILLJJLI);
        canvas.drawCircle(getWidth() / f, getHeight() / f, fMin - this.LL, this.LLILZ);
    }

    public final void setColor(int i) {
        this.LLILLJJLI = i;
        invalidate();
    }

    public C371530EhT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C11VU.LIZIZ(3.0f, context);
        this.LLILLJJLI = -16777216;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context);
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C418440Gaw.LIZIZ(3));
            paint.setAntiAlias(true);
            this.LLILLL = paint;
            Paint paint2 = new Paint();
            paint2.setColor(-16777216);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            this.LLILZ = paint2;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
