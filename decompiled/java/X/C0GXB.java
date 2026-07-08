package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GXB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXB extends C21413918rB implements SeekBar.OnSeekBarChangeListener {
    public final C415450GQt LLILLJJLI;
    public final C0GXC LLILLL;
    public SeekBar.OnSeekBarChangeListener LLILZ;

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
        C415450GQt c415450GQt = this.LLILLJJLI;
        float fLJI2 = LJI(getSecondaryProgress());
        c415450GQt.LJI = fLJI;
        c415450GQt.LJII = fLJI2;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LLILLL.LJII = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LLILLL.LJII = false;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (Intrinsics.LJFF(onSeekBarChangeListener, this)) {
            super.setOnSeekBarChangeListener(onSeekBarChangeListener);
        } else {
            this.LLILZ = onSeekBarChangeListener;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
    }

    public final void setProgressColor(int i) {
        this.LLILLJJLI.LIZ = i;
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgress(int i) {
        super.setSecondaryProgress(i);
    }

    public C0GXB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ys);
        C415450GQt c415450GQt = new C415450GQt();
        this.LLILLJJLI = c415450GQt;
        C0GXC c0gxc = new C0GXC();
        this.LLILLL = c0gxc;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSlider, R.attr.ys, 0);
        setProgressDrawable(c415450GQt);
        c415450GQt.LIZJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSlider_tux_backgroundColor, -16777216);
        c415450GQt.LIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSlider_tux_progressColor, -16777216);
        c415450GQt.LIZIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSlider_tux_secondProgressColor, -16777216);
        c415450GQt.LIZLLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSlider_tux_progressHeight, 0.0f);
        setThumb(c0gxc);
        c0gxc.LIZ = typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxSlider_tux_thumbMaxSizeScale, 1.0f);
        c0gxc.LIZIZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSlider_tux_thumbSize, 0.0f);
        c0gxc.LIZJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSlider_tux_thumbColor, -1);
        c0gxc.LIZLLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSlider_tux_thumbShadowOffsetX, 0.0f);
        c0gxc.LJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSlider_tux_thumbShadowOffsetY, 0.0f);
        c0gxc.LJFF = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSlider_tux_thumbShadowRadius, 0.0f);
        c0gxc.LJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSlider_tux_thumbShadowColor, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        setOnSeekBarChangeListener(this);
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
