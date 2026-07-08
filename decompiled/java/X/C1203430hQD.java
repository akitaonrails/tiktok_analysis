package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203430hQD extends AbstractC1203440hQE {
    public InterfaceC1203470hQH LLJIJIL;

    @Override // X.AbstractC1203440hQE
    public final void LIZ(float f) {
    }

    public final InterfaceC1203480hQI getOnValueChangeListener() {
        return null;
    }

    public final void setOnValueChangeListener(InterfaceC1203480hQI interfaceC1203480hQI) {
    }

    public final int getValue() {
        return (int) getRatingValue();
    }

    public final InterfaceC1203470hQH getOnValueSelectedListener() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZIZ(float f) {
        InterfaceC1203470hQH interfaceC1203470hQH = this.LLJIJIL;
        if (interfaceC1203470hQH != null) {
            interfaceC1203470hQH.LIZ((int) f);
        }
    }

    @Override // X.AbstractC1203440hQE, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getRatingEnableTouch() && isEnabled() && motionEvent.getAction() == 3) {
            LIZIZ(getRatingValue());
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
        super.setEnabled(z);
    }

    public final void setOnValueSelectedListener(InterfaceC1203470hQH interfaceC1203470hQH) {
        this.LLJIJIL = interfaceC1203470hQH;
    }

    public final void setRatingTouchEnable(boolean z) {
        setRatingEnableTouch(z);
    }

    public final void setValue(int i) {
        setRatingValue(i);
    }

    public C1203430hQD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yk);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        setRatingEnableTouch(true);
        setHasOffset(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRatingInput, R.attr.yk, 0);
        setValue(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxRatingInput_tux_ratingInputValue, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
