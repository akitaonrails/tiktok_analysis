package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203270hPx extends AbstractC1203440hQE {
    public InterfaceC1048990dP7 LLJIJIL;
    public InterfaceC1191210h6V LLJILJIL;

    public final int getValue() {
        return (int) getRatingValue();
    }

    public final InterfaceC1048990dP7 getOnValueChangeListener() {
        return this.LLJIJIL;
    }

    public final InterfaceC1191210h6V getOnValueSelectedListener() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZ(float f) {
        InterfaceC1048990dP7 interfaceC1048990dP7 = this.LLJIJIL;
        if (interfaceC1048990dP7 != null) {
            interfaceC1048990dP7.LIZ((int) f);
        }
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZIZ(float f) {
        InterfaceC1191210h6V interfaceC1191210h6V = this.LLJILJIL;
        if (interfaceC1191210h6V != null) {
            interfaceC1191210h6V.LIZ((int) f);
        }
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

    public final void setOnValueChangeListener(InterfaceC1048990dP7 interfaceC1048990dP7) {
        this.LLJIJIL = interfaceC1048990dP7;
    }

    public final void setOnValueSelectedListener(InterfaceC1191210h6V interfaceC1191210h6V) {
        this.LLJILJIL = interfaceC1191210h6V;
    }

    public final void setValue(int i) {
        setRatingValue(i);
    }

    public C1203270hPx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yk);
        setRatingSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        setRatingSpacing(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        setRatingEnableTouch(true);
        setHasOffset(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRatingInput, R.attr.yk, 0);
        setValue(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxRatingInput_tux_ratingInputValue, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
