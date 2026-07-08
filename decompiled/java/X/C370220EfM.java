package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370220EfM extends View {
    public final int LL;
    public final Paint LLILLJJLI;
    public Rect LLILLL;
    public Rect LLILZ;
    public final RectF LLILZIL;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Rect getCropRect() {
        return this.LLILZ;
    }

    public final Rect getEditRect() {
        return this.LLILLL;
    }

    public final List<RectF> LIZ(RectF rectF) {
        return C1697810uHb.LJIIJJI(new RectF(0.0f, 0.0f, getMeasuredWidth(), rectF.top), new RectF(0.0f, rectF.top, rectF.left, rectF.bottom), new RectF(rectF.right, rectF.top, getMeasuredWidth(), rectF.bottom), new RectF(0.0f, rectF.bottom, getMeasuredWidth(), getMeasuredHeight()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.LL;
        if (i != -1) {
            if (i == 0) {
                Iterator<RectF> it2 = LIZ(this.LLILZIL).iterator();
                while (it2.hasNext()) {
                    canvas.drawRect(it2.next(), this.LLILLJJLI);
                }
                return;
            }
            return;
        }
        Rect rect = this.LLILLL;
        Iterator<RectF> it3 = LIZ(new RectF(rect.left, rect.top, rect.right, rect.bottom)).iterator();
        while (it3.hasNext()) {
            canvas.drawRect(it3.next(), this.LLILLJJLI);
        }
    }

    public final void setCropRect(Rect rect) {
        this.LLILZ = rect;
    }

    public final void setEditRect(Rect rect) {
        this.LLILLL = rect;
    }

    public C370220EfM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.LLILLJJLI = paint;
        this.LLILLL = new Rect();
        this.LLILZ = new Rect();
        this.LLILZIL = new RectF();
    }
}
