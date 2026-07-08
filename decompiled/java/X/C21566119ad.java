package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21566119ad extends View {
    public final Path LL;
    public final RectF LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final long LLJILJILJ;
    public boolean LLJILLL;
    public final BPEAHandler LLJJ;
    public InterfaceC21566219ae LLJJI;
    public final int LLJJIII;
    public final Paint LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final ARunnableS133S0100000_33 LLJJJ;

    public final float getMaxCount() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.LLJJIJIIJIL) {
            return;
        }
        RectF rectF = this.LLILLJJLI;
        float f = this.LLJIJIL;
        float f2 = this.LLIZ;
        float f3 = this.LLJILJIL;
        rectF.set(f, f, f2 - f3, this.LLIZLLLIL - f3);
        float f4 = this.LLIZ / 2;
        this.LL.reset();
        this.LL.addRoundRect(this.LLILLJJLI, f4, f4, Path.Direction.CCW);
        this.LLJJIJI.setColor(this.LLJJIII);
        this.LLJJIJI.setAlpha(51);
        this.LLJJIJI.setStyle(Paint.Style.STROKE);
        this.LLJJIJI.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        canvas.drawPath(this.LL, this.LLJJIJI);
        canvas.save();
        canvas.clipPath(this.LL);
        float f5 = this.LLILZLL / this.LLILZIL;
        if (this.LLJJIJIL) {
            RectF rectF2 = this.LLILLL;
            int i = this.LLIZ;
            rectF2.set(i * (1 - f5), 0.0f, i, this.LLIZLLLIL);
        } else {
            RectF rectF3 = this.LLILLL;
            float f6 = this.LLJIJIL;
            rectF3.set(f6, f6, this.LLIZ * f5, this.LLIZLLLIL);
        }
        this.LLJJIJI.setColor(this.LLJJIII);
        this.LLJJIJI.setAlpha(51);
        this.LLJJIJI.setStyle(Paint.Style.FILL);
        canvas.drawRect(this.LLILLL, this.LLJJIJI);
        canvas.restore();
        canvas.save();
        if (this.LLJJIJIL) {
            this.LLILZ.set(this.LLILLL.left, 0.0f, this.LLIZ, this.LLIZLLLIL);
        } else {
            this.LLILZ.set(0.0f, 0.0f, this.LLILLL.right, this.LLIZLLLIL);
        }
        canvas.clipRect(this.LLILZ);
        this.LLJJIJI.setColor(this.LLJJIII);
        this.LLJJIJI.setAlpha(102);
        this.LLJJIJI.setStyle(Paint.Style.STROKE);
        this.LLJJIJI.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        canvas.drawPath(this.LL, this.LLJJIJI);
        canvas.restore();
    }

    public final void setCurrentCount(float f) {
        float f2 = this.LLILZIL;
        if (f > f2) {
            f = f2;
        }
        this.LLILZLL = f;
        invalidate();
    }

    public final void setMaxCount(float f) {
        this.LLILZIL = f;
    }

    public C21566119ad(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LL = new Path();
        this.LLILLJJLI = new RectF();
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        this.LLILZIL = 100.0f;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = 50L;
        this.LLJJ = new BPEAHandler(Looper.getMainLooper());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJJIII = iIntValue;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLJJIJI = paint;
        this.LLJJIJIIJIL = true;
        this.LLJJJ = new ARunnableS133S0100000_33(this, 45);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLIZ = getMeasuredWidth();
        this.LLIZLLLIL = getMeasuredHeight();
    }
}
