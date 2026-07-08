package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421460Gfo extends TuxTextView {
    public float LLJJJJ;
    public float LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;

    public final boolean LJJJJJ() {
        float f = this.LLJJJJJIL;
        if (f == 0.0f || f >= getTextSize() || (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight() <= 0 || getLineCount() < this.LLJJJJLIIL) {
            return false;
        }
        setSavedDefaultTextSize(getTextSize());
        setTextSize(0, this.LLJJJJJIL);
        return true;
    }

    public final void LJJJJL() {
        if (!this.LLJJL || getText().length() <= 0 || getWidth() <= 0) {
            return;
        }
        LJJJJJ();
    }

    public final boolean getAutoSizeEnabled() {
        return this.LLJJL;
    }

    public final int getMaxLinesLimit() {
        return this.LLJJJJLIIL;
    }

    public final float getSavedDefaultTextSize() {
        return this.LLJJJJ;
    }

    public final float getWorkAroundTextSize() {
        return this.LLJJJJJIL;
    }

    public final void setAutoSizeEnabled(boolean z) {
        this.LLJJL = z;
        LJJJJL();
    }

    public final void setMaxLinesLimit(int i) {
        this.LLJJJJLIIL = i;
        setMaxLines(i);
        LJJJJL();
    }

    public final void setSavedDefaultTextSize(float f) {
        this.LLJJJJ = f;
        setTextSize(0, f);
    }

    public final void setWorkAroundTextSize(float f) {
        this.LLJJJJJIL = f;
    }

    public C421460Gfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJLIIL = 2;
        this.LLJJL = true;
        setMaxLines(2);
        setEllipsize(null);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLJJL && getText().length() > 0 && LJJJJJ()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        float f = this.LLJJJJ;
        if (f > 0.0f) {
            setTextSize(0, f);
        }
        super.setText(charSequence, bufferType);
        LJJJJL();
    }
}
