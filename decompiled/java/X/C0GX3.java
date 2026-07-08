package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GX3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX3 extends C21413918rB implements SeekBar.OnSeekBarChangeListener {
    public C415440GQs LLILLJJLI;
    public C415430GQr LLILLL;
    public SeekBar.OnSeekBarChangeListener LLILZ;
    public C0GX5 LLILZIL;
    public int LLILZLL;
    public Function1<? super Integer, Integer> LLIZ;
    public final float LLIZLLLIL;
    public final Paint LLJ;

    public final int getBottomDotProgress() {
        return this.LLILZLL;
    }

    public final C0GX5 getOnInterTouchListener() {
        return this.LLILZIL;
    }

    public final Function1<Integer, Integer> getProgressSnapper() {
        return this.LLIZ;
    }

    public final float LJI(int i) {
        float min;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            min = (i - getMin()) * 1.0f;
        } else {
            if (getMax() <= 0) {
                return 0.0f;
            }
            min = i * 1.0f;
            max = getMax();
        }
        return min / max;
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float fLJI = LJI(getProgress());
        boolean zLJI = C11VU.LJI(this);
        canvas.save();
        C415440GQs c415440GQs = this.LLILLJJLI;
        LJI(getSecondaryProgress());
        c415440GQs.LJI = fLJI;
        c415440GQs.LJII = zLJI;
        C415430GQr c415430GQr = this.LLILLL;
        LJI(getSecondaryProgress());
        Rect bounds = this.LLILLJJLI.getBounds();
        c415430GQr.LJIIIIZZ = fLJI;
        c415430GQr.LJIIIZ = bounds;
        c415430GQr.LJFF = zLJI;
        canvas.translate(getPaddingStart(), 0.0f);
        this.LLILLJJLI.draw(canvas);
        this.LLILLL.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LLILLL.getClass();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LLILLL.getClass();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1<? super Integer, Integer> function1;
        int iIntValue;
        C0GX5 c0gx5 = this.LLILZIL;
        if (c0gx5 != null && c0gx5.LIZ(motionEvent)) {
            return true;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (isEnabled() && (function1 = this.LLIZ) != null && (iIntValue = function1.invoke(Integer.valueOf(getProgress())).intValue()) != getProgress()) {
            setProgress(iIntValue);
        }
        return zOnTouchEvent;
    }

    public final void setBottomDotProgress(int i) {
        if (this.LLILZLL != i) {
            this.LLILZLL = i;
            invalidate();
            Object parent = getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                view.invalidate();
                parent = view.getParent();
            }
        }
    }

    public final void setOnInterTouchListener(C0GX5 c0gx5) {
        this.LLILZIL = c0gx5;
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        super.setOnSeekBarChangeListener(this);
        this.LLILZ = onSeekBarChangeListener;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
    }

    public final void setProgressColor(int i) {
        this.LLILLJJLI.LIZ = i;
    }

    public final void setProgressSnapper(Function1<? super Integer, Integer> function1) {
        this.LLIZ = function1;
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgress(int i) {
        super.setSecondaryProgress(i);
    }

    public final void setSliderProgressDrawable(C415440GQs c415440GQs) {
        this.LLILLJJLI = c415440GQs;
        setProgressDrawable(c415440GQs);
        invalidate();
    }

    public final void setSliderThumbDrawable(C415430GQr c415430GQr) {
        this.LLILLL = c415430GQr;
        setThumb(c415430GQr);
        invalidate();
    }

    public C0GX3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new C415440GQs(context);
        this.LLILLL = new C415430GQr();
        this.LLILZLL = -1;
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, context);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LLJ = paint;
        setProgressDrawable(this.LLILLJJLI);
        setThumb(this.LLILLL);
        setLayerType(1, null);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }
}
