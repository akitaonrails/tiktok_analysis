package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZQ extends C21412118qt implements C0HZT {
    public final boolean LLILZIL;
    public Function0<Boolean> LLILZLL;
    public boolean LLIZ;
    public final C413090GHr LLIZLLLIL;
    public final C413070GHp LLJ;
    public final C413100GHs LLJI;
    public final Drawable LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public final C01GW LLJJIJI;
    public final RectF LLJJIJIIJIL;

    public C0HZQ(Context context) {
        this(context, null, 6);
    }

    public C0HZQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final Paint getMaskPaint() {
        return (Paint) this.LLJJIJI.getValue();
    }

    public final void LIZIZ() {
        this.LLIZLLLIL.LIZLLL(this.LLJILLL, this.LLJJ, this.LLJILJILJ);
        this.LLJ.LIZJ(this.LLJILLL, this.LLJJ, this.LLJILJILJ);
        this.LLJI.LIZLLL(this.LLJILLL, this.LLJJ, this.LLJILJILJ);
        C427690Gpr.LJ(this, this.LLJJ ? this.LLJILJIL / 2.0f : C418440Gaw.LIZIZ(Float.valueOf(this.LLJILLL)));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        Function0<Boolean> function0 = this.LLILZLL;
        if (function0 == null || !function0.invoke().booleanValue()) {
            super.toggle();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.LLIZ) {
            drawable = this.LLJI;
        } else {
            drawable = this.LLJIJIL;
            if (drawable == null) {
                return;
            }
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float f = intrinsicHeight;
        float height = getHeight() / f;
        canvas.save();
        canvas.scale(height, height);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (this.LLJJI) {
            getMaskPaint().setColor(this.LLJJIII);
            if (this.LLJJ) {
                float f2 = intrinsicWidth / 2.0f;
                canvas.drawCircle(f2, f / 2.0f, 0.875f * f2, getMaskPaint());
            } else {
                float f3 = intrinsicWidth;
                this.LLJJIJIIJIL.set(f3 * 0.1f, 0.1f * f, f3 * 0.9f, f * 0.9f);
                float f4 = height * 1.726f;
                canvas.drawRoundRect(this.LLJJIJIIJIL, f4, f4, getMaskPaint());
            }
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setCheckBoxCheckedColor(int i) {
        this.LLIZLLLIL.LJ(i);
        this.LLJI.LJ(i);
        invalidate();
    }

    public final void setCheckBoxInnerShapeColor(int i) {
        this.LLIZLLLIL.LJ.setColor(i);
        invalidate();
    }

    public final void setCheckBoxMaskColor(int i) {
        this.LLJJIII = i;
        invalidate();
    }

    public final void setCheckBoxUncheckedColor(int i) {
        this.LLJ.LIZIZ.setColor(i);
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LLILZIL) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.y5(this, f);
        }
    }

    public final void setIndeterminate(boolean z) {
        Drawable drawable;
        this.LLIZ = z;
        if (z) {
            LIZIZ();
            drawable = this.LLJI;
        } else {
            drawable = this.LLJIJIL;
        }
        setButtonDrawable(drawable);
    }

    public final void setInnerMaskVisibility(boolean z) {
        this.LLJJI = z;
        invalidate();
    }

    @Override // X.C0HZT
    public void setInterceptToggleListener(Function0<Boolean> function0) {
        this.LLILZLL = function0;
    }

    public final void setShape(int i) {
        boolean z = true;
        if (i != 0 && i == 1) {
            z = false;
        }
        this.LLJJ = z;
        LIZIZ();
        invalidate();
    }

    public final void setSize(int i) {
        C0HZR c0hzr;
        if (i == 0 || i != 1) {
            c0hzr = new C0HZR(16, false, 4);
        } else {
            c0hzr = new C0HZR(24, true, 6);
        }
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c0hzr.LIZ)));
        this.LLJILJILJ = c0hzr.LIZIZ;
        this.LLJILLL = c0hzr.LIZJ;
        LIZIZ();
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLJILJIL;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int i4 = this.LLJILJIL;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0HZQ(Context context, AttributeSet attributeSet, int i) {
        int i2;
        float f;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xn;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        C413090GHr c413090GHr = new C413090GHr();
        this.LLIZLLLIL = c413090GHr;
        C413070GHp c413070GHp = new C413070GHp();
        this.LLJ = c413070GHp;
        C413100GHs c413100GHs = new C413100GHs();
        this.LLJI = c413100GHs;
        this.LLJJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(23));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCheckBox, i2, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCheckBox_tux_checkBoxShape, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCheckBox_tux_checkBoxSize, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCheckBox_tux_checkBoxCheckedColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCheckBox_tux_checkBoxUncheckedColor, 0);
        this.LLJJIII = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCheckBox_tux_checkBoxInnerMaskColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZIL = true;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, c413090GHr);
        stateListDrawable.addState(new int[0], c413070GHp);
        this.LLJIJIL = stateListDrawable;
        c413090GHr.LJ(color);
        c413070GHp.LIZIZ.setColor(color2);
        c413100GHs.LJ(color);
        setButtonDrawable(stateListDrawable);
        setShape(i3);
        setSize(i4);
        if (isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        C786410Ut5.y5(this, f);
        setGravity(51);
        setBackground(null);
        this.LLJJIJIIJIL = new RectF();
    }
}
