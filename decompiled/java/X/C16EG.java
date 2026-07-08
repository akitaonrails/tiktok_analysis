package X;

import Y.ALAdapterS25S0100000_31;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.ui.AudioControlView$AudioControlHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16EG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16EG extends View {
    public Paint LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public C16EH LLILZLL;
    public ValueAnimator LLIZ;
    public boolean LLIZLLLIL;
    public HandlerThread LLJ;
    public AudioControlView$AudioControlHandler LLJI;
    public volatile boolean LLJIJIL;

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
        duration.addListener(new ALAdapterS25S0100000_31(this, 12));
        return duration;
    }

    public final void LIZ() {
        if (this.LLJ == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-Api-Thread");
            this.LLJ = handlerThread;
            handlerThread.start();
            this.LLJI = new AudioControlView$AudioControlHandler(C786410Ut5.W2(this.LLJ), this);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJIJIL = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.LLIZ.cancel();
            this.LLIZ = null;
        }
        this.LLILZLL = null;
        HandlerThread handlerThread = this.LLJ;
        if (handlerThread != null) {
            handlerThread.quit();
            this.LLJ = null;
            this.LLJI = null;
        }
        this.LLJIJIL = true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZLLLIL) {
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL;
            canvas.drawLine(i, i2 / 2, i - (i * this.LLILZIL), i2 / 2, this.LL);
        } else {
            int i3 = this.LLILLL;
            canvas.drawLine(0.0f, i3 / 2, this.LLILLJJLI * this.LLILZIL, i3 / 2, this.LL);
        }
    }

    public void setForegroundColor(int i) {
        this.LLILZ = i;
        Paint paint = this.LL;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setOnAudioControlViewHideListener(C16EH c16eh) {
        this.LLILZLL = c16eh;
    }

    public void setProgress(float f) {
        this.LLILZIL = f;
    }

    public C16EG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioControlView);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.AudioControlView_foregroundColor, C446980Hfs.LIZ(context, R.color.u_));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        this.LL.setColor(this.LLILZ);
        this.LL.setStyle(Paint.Style.FILL);
        this.LL.setStrokeWidth(2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredWidth();
        this.LLILLL = getMeasuredHeight();
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLIZLLLIL = z;
    }
}
