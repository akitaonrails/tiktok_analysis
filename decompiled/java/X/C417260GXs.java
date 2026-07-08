package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417260GXs extends C16F5 {
    public BitmapShader LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final Matrix LLJJIJI;
    public ValueAnimator LLJJIJIIJIL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        super.onDraw(canvas);
        if (this.LLJJIII != Integer.MIN_VALUE) {
            getPaint().setShader(this.LLJJ);
            getPaint().getShader().getLocalMatrix(this.LLJJIJI);
            this.LLJJIJI.postTranslate(this.LLJJIII, 0.0f);
            getPaint().getShader().setLocalMatrix(this.LLJJIJI);
            super.onDraw(canvas);
        }
    }

    public final void setTextInternal$liverevenue_impl_release(CharSequence charSequence) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.LLJJIJIIJIL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LLJJIJIIJIL) != null) {
            valueAnimator.cancel();
        }
        setText(charSequence);
    }

    public C417260GXs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIII = Integer.MIN_VALUE;
        this.LLJJIJI = new Matrix();
    }
}
