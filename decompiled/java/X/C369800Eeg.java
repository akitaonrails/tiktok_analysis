package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Eeg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C369800Eeg extends View {
    public Paint LL;
    public Path LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.LLILLJJLI;
        if (path != null) {
            path.reset();
        }
        if (this.LLILZIL == 0 || this.LLILZLL == 0) {
            this.LLILZIL = getWidth();
            this.LLILZLL = getHeight();
        }
        this.LLIZ = getPaddingLeft();
        this.LLIZLLLIL = getPaddingRight();
        this.LLJ = getPaddingTop();
        this.LLJI = getPaddingBottom();
        this.LLILLJJLI.moveTo(this.LLIZ, this.LLJ);
        this.LLILLJJLI.lineTo(this.LLILZIL - this.LLIZLLLIL, this.LLILZLL - this.LLJI);
        this.LLILLJJLI.moveTo(this.LLIZ, this.LLILZLL - this.LLJI);
        this.LLILLJJLI.lineTo(this.LLILZIL - this.LLIZLLLIL, this.LLJ);
        canvas.save();
        canvas.drawPath(this.LLILLJJLI, this.LL);
        canvas.restore();
    }

    public C369800Eeg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CloseView);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.CloseView_lineColor, -16777216);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CloseView_lineWidth, C341940Daq.LIZ(1.0d));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LL = paint;
        paint.setColor(this.LLILLL);
        this.LL.setStrokeWidth(this.LLILZ);
        this.LL.setAntiAlias(true);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeJoin(Paint.Join.ROUND);
        this.LL.setStrokeCap(Paint.Cap.ROUND);
        this.LLILLJJLI = new Path();
    }
}
