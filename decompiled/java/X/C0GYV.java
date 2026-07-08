package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYV extends AppCompatImageView {
    public final Paint LL;
    public ValueAnimator LLILLJJLI;
    public float LLILLL;
    public final int[] LLILZ;
    public final float[] LLILZIL;
    public LinearGradient LLILZLL;
    public final RectF LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C20597815iq.LIZ(this);
    }

    public final void LIZJ(Canvas canvas) {
        LinearGradient linearGradient;
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0 && (linearGradient = this.LLILZLL) != null) {
            this.LL.setShader(linearGradient);
            int iSave = canvas.save();
            try {
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.LL);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C0GYV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int LIZ(float f, int i) {
        return (C13LZ.LJ((int) (f * 255), 0, 255) << 24) | 16777215;
    }

    public C0GYV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Paint(1);
        this.LLILZ = new int[]{LIZ(0.0f, -1), LIZ(0.3f, -1), LIZ(0.5f, -1), LIZ(0.3f, -1), LIZ(0.0f, -1)};
        this.LLILZIL = new float[]{0.0f, 0.35f, 0.5f, 0.65f, 1.0f};
        this.LLIZ = new RectF();
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = (float) Math.sqrt((r1 * r1) + (r0 * r0));
        this.LLIZ.set(0.0f, 0.0f, this.LLIZLLLIL, this.LLJ);
    }
}
