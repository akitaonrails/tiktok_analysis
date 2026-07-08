package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYT extends FrameLayout {
    public C0GYU LL;
    public final TuxTextView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final Paint LLILZIL;
    public final RectF LLILZLL;
    public final float LLIZ;

    public final int getProgress() {
        return this.LLILZ;
    }

    public final int getProgressPadding() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Integer numLIZJ;
        int iIntValue;
        Integer numLIZJ2;
        Integer numLIZJ3;
        int iIntValue2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer numLIZJ4;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        float fMin = Math.min(width, height) / 2.0f;
        C0GYU c0gyu = this.LL;
        if (c0gyu != null && (num4 = c0gyu.textColor) != null && (numLIZJ4 = C1308910kAL.LIZJ(num4.intValue(), getContext())) != null) {
            this.LLILLJJLI.setTextColor(numLIZJ4.intValue());
        } else {
            this.LLILLJJLI.setTextColorRes(R.attr.a1k);
        }
        this.LLILZIL.setStyle(Paint.Style.FILL);
        Paint paint = this.LLILZIL;
        C0GYU c0gyu2 = this.LL;
        int iIntValue3 = 0;
        if ((c0gyu2 != null && (num3 = c0gyu2.maskColor) != null && (numLIZJ = C1308910kAL.LIZJ(num3.intValue(), getContext())) != null) || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, getContext())) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        canvas.drawCircle(f, f2, fMin, this.LLILZIL);
        float f3 = (this.LLIZ / 2.0f) + this.LLILLL;
        this.LLILZLL.set(f3, f3, width - f3, height - f3);
        this.LLILZIL.setStyle(Paint.Style.STROKE);
        this.LLILZIL.setStrokeWidth(this.LLIZ);
        this.LLILZIL.setStrokeCap(Paint.Cap.BUTT);
        Paint paint2 = this.LLILZIL;
        C0GYU c0gyu3 = this.LL;
        if ((c0gyu3 != null && (num2 = c0gyu3.trackColor) != null && (numLIZJ2 = C1308910kAL.LIZJ(num2.intValue(), getContext())) != null) || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, getContext())) != null) {
            iIntValue3 = numLIZJ2.intValue();
        }
        paint2.setColor(iIntValue3);
        canvas.drawOval(this.LLILZLL, this.LLILZIL);
        Paint paint3 = this.LLILZIL;
        C0GYU c0gyu4 = this.LL;
        if ((c0gyu4 != null && (num = c0gyu4.progressColor) != null && (numLIZJ3 = C1308910kAL.LIZJ(num.intValue(), getContext())) != null) || (numLIZJ3 = C1308910kAL.LIZJ(R.attr.zl, getContext())) != null) {
            iIntValue2 = numLIZJ3.intValue();
        } else {
            iIntValue2 = -1;
        }
        paint3.setColor(iIntValue2);
        this.LLILZIL.setStrokeCap(Paint.Cap.ROUND);
        int i = this.LLILZ;
        float f4 = (i / 100.0f) * 360.0f;
        if (i > 0) {
            canvas.drawArc(this.LLILZLL, -90.0f, f4, false, this.LLILZIL);
        }
    }

    public final void setColorConfig(C0GYU c0gyu) {
        this.LL = c0gyu;
        invalidate();
    }

    public final void setProgress(int i) {
        this.LLILZ = C13LZ.LJ(i, 0, 100);
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        invalidate();
    }

    public final void setProgressPadding(int i) {
        this.LLILLL = i;
    }

    public C0GYT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTuxFont(82);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setText("0%");
        this.LLILLJJLI = tuxTextView;
        this.LLILZIL = new Paint(1);
        this.LLILZLL = new RectF();
        this.LLIZ = C418440Gaw.LIZIZ(2);
        setWillNotDraw(false);
        addView(tuxTextView);
    }
}
