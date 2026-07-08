package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419180Gc8 extends TuxTextView {
    public final Paint LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    private final ValueAnimator getAnimator() {
        return (ValueAnimator) this.LLJJL.getValue();
    }

    private final ValueAnimator getBackgroundColorAnimator() {
        return (ValueAnimator) this.LLJL.getValue();
    }

    private final ValueAnimator getTextColorAnimator() {
        return (ValueAnimator) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final AnimatorSet getAnimatorSet() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getAnimator(), getBackgroundColorAnimator(), getTextColorAnimator());
        return animatorSet;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        int iIntValue2;
        super.onDraw(canvas);
        if (getAnimator().isRunning()) {
            float f = this.LLJJJJLIIL;
            float f2 = this.LLJJJJJIL * f;
            float f3 = f + f2;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LLJJJJ.setShader(new LinearGradient(f2, 0.0f, f3, 0.0f, iIntValue2, iIntValue, Shader.TileMode.CLAMP));
            canvas.drawRect(f2, 0.0f, f3, getHeight(), this.LLJJJJ);
            this.LLJJJJ.setColor(iIntValue);
            canvas.drawRect(f3, 0.0f, f3 + this.LLJJJJLIIL, getHeight(), this.LLJJJJ);
        }
    }

    public C419180Gc8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLJJJJ = paint;
        this.LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1230));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 74));
        this.LLJL = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 73));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJJJLIIL = i;
    }
}
