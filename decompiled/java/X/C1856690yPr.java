package X;

import Y.AUListenerS275S0100000_27;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0yPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856690yPr extends TuxIconDrawable {
    public float LJIIZILJ;
    public final ValueAnimator LJIJ;

    @Override // com.bytedance.tux.drawable.TuxIconDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LJIIIZ() {
        if (Looper.myLooper() == null) {
            return;
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ROTATE", 0, 360);
        ValueAnimator valueAnimator = this.LJIJ;
        valueAnimator.setValues(propertyValuesHolderOfInt);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 99));
        this.LJIJ.start();
    }

    public final void LJIIJ() {
        if (Looper.myLooper() == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIJ;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
    }

    @Override // com.bytedance.tux.drawable.TuxIconDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        canvas.save();
        canvas.rotate(this.LJIIZILJ, getBounds().left + (iWidth / 2.0f), getBounds().top + (iHeight / 2.0f));
        super.draw(canvas);
        canvas.restore();
    }

    public C1856690yPr(Context context, int i) {
        super(context, i);
        this.LJIJ = new ValueAnimator();
    }
}
