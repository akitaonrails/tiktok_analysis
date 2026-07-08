package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Gun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C430750Gun<T extends View> extends ReplacementSpan {
    public final T LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C430750Gun(T t) {
        this.LL = t;
        C786410Ut5.W5(this.LL, new ViewGroup.LayoutParams(-2, -2));
        t.setLayoutDirection(C426750GoL.LIZLLL(t.getContext()) ? 1 : 0);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        this.LL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        T t = this.LL;
        t.layout(0, 0, t.getMeasuredWidth(), this.LL.getMeasuredHeight());
        return this.LL.getMeasuredWidth() + this.LLILLJJLI + this.LLILLL;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        if (C426750GoL.LJ(this.LL)) {
            i6 = this.LLILLL;
        } else {
            i6 = this.LLILLJJLI;
        }
        float f2 = f + i6;
        float measuredHeight = i3 + (((i5 - i3) - this.LL.getMeasuredHeight()) / 2.0f);
        canvas.translate(f2, measuredHeight);
        this.LL.draw(canvas);
        canvas.translate(-f2, -measuredHeight);
    }
}
