package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19727912Gn extends View {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;

    private final Paint getStatusPaint() {
        return (Paint) this.LLJI.getValue();
    }

    public final int getActiveStatusColor() {
        return this.LLILZIL;
    }

    public final boolean getAutoLayout() {
        return this.LL;
    }

    public final boolean getDrawStroke() {
        return this.LLILLJJLI;
    }

    public final int getInactiveStatusColor() {
        return this.LLILZLL;
    }

    public final int getStrokeColor() {
        return this.LLILZ;
    }

    public final int getStrokeWidth() {
        return this.LLILLL;
    }

    public final void LIZ(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            setStrokeColor(numLIZJ.intValue());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        int i3 = this.LLIZLLLIL;
        float f = i3 * 0.5f;
        float f2 = i3 * 0.5f;
        if (this.LLILLJJLI) {
            getStatusPaint().setColor(this.LLIZ);
            canvas.drawCircle(f, f2, f, getStatusPaint());
            if (this.LLILZ != this.LLIZ) {
                getStatusPaint().setColor(this.LLILZ);
                canvas.drawCircle(f, f2, f, getStatusPaint());
            }
            Paint statusPaint = getStatusPaint();
            if (this.LLJ) {
                i2 = this.LLILZIL;
            } else {
                i2 = this.LLILZLL;
            }
            statusPaint.setColor(i2);
            canvas.drawCircle(f, f2, f - this.LLILLL, getStatusPaint());
            return;
        }
        Paint statusPaint2 = getStatusPaint();
        if (this.LLJ) {
            i = this.LLILZIL;
        } else {
            i = this.LLILZLL;
        }
        statusPaint2.setColor(i);
        canvas.drawCircle(f, f2, f, getStatusPaint());
    }

    public final void setActive(boolean z) {
        this.LLJ = z;
        invalidate();
    }

    public final void setActiveStatusColor(int i) {
        if (i == this.LLILZIL) {
            return;
        }
        this.LLILZIL = i;
        invalidate();
    }

    public final void setAutoLayout(boolean z) {
        if (z == this.LL) {
            return;
        }
        this.LL = z;
        invalidate();
    }

    public final void setDrawStroke(boolean z) {
        if (z == this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = z;
        invalidate();
    }

    public final void setInactiveStatusColor(int i) {
        if (i == this.LLILZLL) {
            return;
        }
        this.LLILZLL = i;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        if (i == this.LLILZ) {
            return;
        }
        this.LLILZ = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        if (i == this.LLILLL) {
            return;
        }
        this.LLILLL = i;
        invalidate();
    }

    public C19727912Gn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        TypedArray typedArrayObtainStyledAttributes = (C960203pA.LIZIZ(context) ? new C1361400lX0(context, R.style.y0) : new C1361400lX0(context, R.style.xx)).obtainStyledAttributes(attributeSet, R$styleable.ActivityStatusView);
        try {
            setAutoLayout(typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActivityStatusView_autolayout, true));
            setDrawStroke(typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActivityStatusView_drawStatusStroke, false));
            setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActivityStatusView_statusStrokeWidth, 0));
            setStrokeColor(typedArrayObtainStyledAttributes.getColor(R$styleable.ActivityStatusView_statusStrokeColor, 0));
            setActiveStatusColor(typedArrayObtainStyledAttributes.getColor(R$styleable.ActivityStatusView_activeStatusColor, 0));
            setInactiveStatusColor(typedArrayObtainStyledAttributes.getColor(R$styleable.ActivityStatusView_inactiveStatusColor, 0));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
            this.LLIZ = numLIZJ != null ? numLIZJ.intValue() : 0;
            typedArrayObtainStyledAttributes.recycle();
            this.LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 30));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LL) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.LLILLL * 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i) + i3, View.MeasureSpec.getSize(i2) + i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL = i;
    }
}
