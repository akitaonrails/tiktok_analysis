package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19508311Ub extends TuxTextView {
    public final C01GW LLJJJJ;
    public LinearGradient LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    private final Matrix getGradientMatrix() {
        return (Matrix) this.LLJJJJLIIL.getValue();
    }

    private final ValueAnimator getHighlightAnim() {
        return (ValueAnimator) this.LLJLIL.getValue();
    }

    private final Integer getHightLightColor() {
        return (Integer) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final float getLightWidth() {
        return ((Number) this.LLJLL.getValue()).floatValue();
    }

    private final ValueAnimator getResetGrayAnim() {
        return (ValueAnimator) this.LLJLILLLLZIIL.getValue();
    }

    private final Integer getStartTextColor() {
        return (Integer) this.LLJJL.getValue();
    }

    @Override // android.widget.TextView
    public final Paint getPaint() {
        return (Paint) this.LLJJJJ.getValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getHighlightAnim().isRunning()) {
            getGradientMatrix().setTranslate(this.LLJL * getWidth(), 0.0f);
            LinearGradient linearGradient = this.LLJJJJJIL;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(getGradientMatrix());
            }
        }
        super.onDraw(canvas);
    }

    public C19508311Ub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 914));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(366));
        this.LLJJL = C452501pT.LIZIZ(new AwS560S0100000_16(context, 750));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(context, 749));
        this.LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 912));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 94));
        this.LLJLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 913));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJJJJJIL == null) {
            float f = i;
            float fTan = f * ((float) Math.tan((float) Math.toRadians(30.0f)));
            Integer startTextColor = getStartTextColor();
            Integer hightLightColor = getHightLightColor();
            Integer startTextColor2 = getStartTextColor();
            if (startTextColor != null && hightLightColor != null && startTextColor2 != null) {
                float f2 = 2;
                this.LLJJJJJIL = new LinearGradient(0.0f, 0.0f, f, fTan, new int[]{startTextColor.intValue(), hightLightColor.intValue(), startTextColor2.intValue()}, new float[]{0.5f - ((getLightWidth() / f2) / f), 0.5f, ((getLightWidth() / f2) / f) + 0.5f}, Shader.TileMode.CLAMP);
            }
        }
    }
}
