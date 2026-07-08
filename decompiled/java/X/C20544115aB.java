package X;

import Y.ACListenerS165S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20544115aB extends C197039127h {
    public int LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public final Paint LLLIL;
    public final RectF LLLILZ;
    public float LLLILZJ;
    public ValueAnimator LLLILZLLLI;
    public int LLLIZZ;
    public float LLLJ;
    public float LLLJIL;
    public C054G LLLJL;
    public View.OnClickListener LLLL;
    public InterfaceC20544315aD LLLLII;

    @Override // X.C197039127h, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLLILZLLLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C054G c054g = this.LLLJL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
    }

    public final int getRemainingSeconds() {
        return this.LLLIIL;
    }

    public final void LJJLIIIIJ(int i) {
        if (this.LLLIILIL || i <= 0) {
            return;
        }
        this.LLLIIIL = i;
        this.LLLIIL = i;
        this.LLLIILIL = true;
        ValueAnimator valueAnimator = this.LLLILZLLLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long j = ((long) this.LLLIIIL) * 1000;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.1f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 35));
        valueAnimatorOfFloat.start();
        this.LLLILZLLLI = valueAnimatorOfFloat;
        C054G c054g = this.LLLJL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLJL = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C20544215aC(this, null), 3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLLIILIL && this.LLLILZJ > 0.0f) {
            this.LLLILZ.set(0.0f, 0.0f, getWidth() * this.LLLILZJ, getHeight());
            canvas.drawRoundRect(this.LLLILZ, this.LLLJ, this.LLLJIL, this.LLLIL);
        }
        super.onDraw(canvas);
    }

    public final void setColors(int i) {
        this.LLLIZZ = i;
        this.LLLIL.setColor(i);
        if (!this.LLLIILIL) {
            setButtonVariant(0);
        }
        invalidate();
    }

    public final void setCountdownSeconds(int i) {
        if (i <= 0) {
            return;
        }
        this.LLLIIIL = i;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLLL = onClickListener;
    }

    public final void setOnCountdownListener(InterfaceC20544315aD interfaceC20544315aD) {
        this.LLLLII = interfaceC20544315aD;
    }

    public C20544115aB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xj);
        this.LLLIIIL = 10;
        Paint paint = new Paint(1);
        this.LLLIL = paint;
        this.LLLILZ = new RectF();
        setAllCaps(false);
        setButtonSize(2);
        setButtonVariant(0);
        paint.setColor(this.LLLIZZ);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        this.LLLIZZ = iIntValue;
        paint.setColor(iIntValue);
        super.setOnClickListener(new ACListenerS165S0100000_31(this, 149));
    }
}
