package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EVM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVM extends View {
    public final float LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final List<Float> LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<Float> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            float fFloatValue = it2.next().floatValue() * ((getWidth() - getPaddingStart()) - getPaddingEnd());
            this.LLILLL.set((getPaddingStart() + fFloatValue) - this.LL, 0.0f, getPaddingStart() + fFloatValue + this.LL, getHeight());
            RectF rectF = this.LLILLL;
            float f = this.LL;
            canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
        }
    }

    public C0EVM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C418440Gaw.LIZIZ(1);
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        this.LLILLL = new RectF();
        this.LLILZ = new ArrayList();
        paint.setAntiAlias(true);
        paint.setColor(C1383370m6R.LJFF(R.attr.ee));
    }
}
