package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841350y17 extends C21412018qs implements C0HZT {
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public boolean LLILZIL;
    public Function0<Boolean> LLILZLL;
    public C1841330y15 LLIZ;
    public C1841340y16 LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public Function0<Unit> LLJILJIL;

    public C1841350y17(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        Function0<Boolean> function0 = this.LLILZLL;
        if (function0 == null || !function0.invoke().booleanValue()) {
            super.toggle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (this.LLJILJIL != null && !isEnabled()) {
            if (motionEvent != null && motionEvent.getAction() == 1 && (function0 = this.LLJILJIL) != null) {
                function0.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    public final void setDisableListener$tux_theme_release(Function0<Unit> function0) {
        this.LLJILJIL = function0;
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
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(f);
            setInnerMaskVisibility(!isEnabled());
        }
    }

    public final void setInnerMaskVisibility(boolean z) {
        this.LLIZLLLIL.LJI = z;
        invalidate();
    }

    @Override // X.C0HZT
    public void setInterceptToggleListener(Function0<Boolean> function0) {
        this.LLILZLL = function0;
    }

    public final void setSize(EnumC1841290y11 enumC1841290y11) {
        this.LLIZ = new C1841330y15(this.LLJ, enumC1841290y11);
        C1841340y16 c1841340y16 = new C1841340y16(this.LLJI, enumC1841290y11);
        c1841340y16.LJII = this.LLJIJIL;
        this.LLIZLLLIL = c1841340y16;
        LIZ(this.LLJ, this.LLJI);
        this.LLILZIL = true;
        setBackground(null);
        int i = C1841300y12.LIZ[enumC1841290y11.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C427690Gpr.LJ(this, LLJILLL / 2.0f);
                setTextSize(C418440Gaw.LIZIZ(1));
            } else {
                throw new C1954807lC();
            }
        } else {
            C427690Gpr.LJ(this, LLJILJILJ / 2.0f);
        }
        requestLayout();
        invalidate();
    }

    public final void LIZ(int i, int i2) {
        float f;
        if (this.LLILZIL) {
            this.LLIZ.LIZ = i;
            this.LLIZLLLIL.LIZ = i2;
            invalidate();
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.LLIZ);
        stateListDrawable.addState(new int[0], this.LLIZLLLIL);
        setButtonDrawable(stateListDrawable);
        if (isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
        setInnerMaskVisibility(!isEnabled());
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null) {
            charSequence.length();
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1841350y17(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = com.zhiliaoapp.musically.R.attr.yi;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRadio, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxRadio_tux_radioCheckedColor, 0);
        this.LLJ = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxRadio_tux_radioUncheckedColor, 0);
        this.LLJI = color2;
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxRadio_tux_radioInnerMaskColor, 0);
        this.LLJIJIL = color3;
        typedArrayObtainStyledAttributes.recycle();
        this.LLIZ = new C1841330y15(color);
        C1841340y16 c1841340y16 = new C1841340y16(color2);
        c1841340y16.LJII = color3;
        this.LLIZLLLIL = c1841340y16;
        LIZ(color, color2);
        this.LLILZIL = true;
        setBackground(null);
        C427690Gpr.LJ(this, LLJILJILJ / 2.0f);
    }
}
