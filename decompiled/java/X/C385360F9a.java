package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385360F9a extends View {
    public boolean LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final float LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LL) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.LLILLL.set(getLeft(), getTop(), getRight(), getBottom());
            canvas.drawColor(0);
            RectF rectF = this.LLILLL;
            float f = this.LLILZ;
            canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        canvas.drawColor(0);
    }

    public final void setColor(int i) {
        this.LLILLJJLI.setColor(i);
    }

    public final void setSeleted(boolean z) {
        this.LL = z;
    }

    public C385360F9a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
        Paint paint = new Paint(1);
        this.LLILLJJLI = paint;
        this.LLILLL = new RectF();
        this.LLILZ = C12ES.LIZJ(8.0f, context);
        float fLIZJ = C12ES.LIZJ(4.0f, context);
        paint.setColor(R.attr.a1r);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fLIZJ);
    }
}
