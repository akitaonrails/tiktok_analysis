package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* JADX INFO: renamed from: X.15RT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RT extends View {
    public Paint LL;
    public final C15RU LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public AVMusicWaveBean LLIZ;
    public final RectF LLIZLLLIL;
    public int LLJ;

    public final int getMHeight() {
        return this.LLILZIL;
    }

    public final Paint getMPaint() {
        return this.LL;
    }

    public final AVMusicWaveBean getMusicWaveBean() {
        return this.LLIZ;
    }

    public final int getViewWidth() {
        return this.LLILZ;
    }

    public C15RT(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AVCutMusicView, 0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.AVCutMusicView_android_color, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LL.setColor(color);
        C15RU c15ru = new C15RU();
        this.LLILLJJLI = c15ru;
        c15ru.LIZIZ(context);
        c15ru.LJIILIIL = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        this.LLILLJJLI.LIZJ(canvas);
        canvas.restore();
        canvas.save();
        int i = this.LLILZLL;
        this.LLIZLLLIL.set(i, 0.0f, i + (this.LLILLL * getWidth()), getHeight());
        canvas.clipRect(this.LLIZLLLIL);
        C15RU c15ru = this.LLILLJJLI;
        Paint paint = this.LL;
        int length = c15ru.LJIIJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f = c15ru.LJIIJ[i2];
            int i3 = c15ru.LIZLLL;
            int i4 = (int) (f * i3);
            int i5 = c15ru.LIZJ;
            int i6 = c15ru.LIZIZ;
            int i7 = (i5 + i6) * i2;
            int i8 = c15ru.LJI;
            if (i8 > 0 && i8 > c15ru.LJFF) {
                i6 = 0;
            }
            RectF rectF = new RectF(i7 + i6, ((i3 - i4) / 2) + c15ru.LJ, i5 + r2, i4 + r1);
            float f2 = c15ru.LJII;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            this.LLIZ = aVMusicWaveBean;
            HandlerHook.viewPost(this, new ARunnableS100S0200000_31(this, aVMusicWaveBean, 34));
        }
    }

    public final void setColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public final void setMHeight(int i) {
        this.LLILZIL = i;
    }

    public final void setMPaint(Paint paint) {
        this.LL = paint;
    }

    public final void setMusicWaveBean(AVMusicWaveBean aVMusicWaveBean) {
        this.LLIZ = aVMusicWaveBean;
    }

    public final void setProgressMaxWidth(int i) {
        this.LLJ = i;
    }

    public final void setViewWidth(int i) {
        this.LLILZ = i;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AVMusicWaveBean aVMusicWaveBean = this.LLIZ;
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int i3 = C15R5.LJI.LIZ;
            int i4 = C15R5.LJI.LIZIZ;
            this.LLILZ = ((this.LLIZ.getMusicWavePointArray().length - 1) * (i3 + i4)) + i4;
            int i5 = C15R5.LJI.LIZJ;
            this.LLILZIL = i5;
            setMeasuredDimension(this.LLILZ, i5);
            this.LLILLJJLI.LJ(this.LLILZ, this.LLILZIL);
            return;
        }
        super.onMeasure(i, i2);
    }
}
