package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418340Gam extends C418350Gan {
    public final Paint LLJJIJIIJIL;
    public float LLJJIJIL;
    public final float LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public Paint.FontMetrics LLJJJJJIL;

    public void setAdjustSize(float f) {
        this.LLJJJJ = f;
    }

    @Override // X.C418350Gan
    public void setEnableFitSize(boolean z) {
        this.LLJJJIL = z;
    }

    public C418340Gam(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.LLJJIJIIJIL = textPaint;
        this.LLJJJ = 6.0f;
        this.LLJJJIL = true;
        this.LLJJJJ = 0.0f;
        this.LLJJJJJIL = null;
        textPaint.set((Paint) getPaint());
        this.LLJJIJIL = getTextSize();
    }

    @Override // X.C418350Gan, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        LJJJJIZL(getWidth(), getHeight(), charSequence.toString());
    }

    public final void LJJJJIZL(int i, int i2, String str) {
        if (i > 0 && this.LLJJJIL) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
            float f = this.LLJJIJIL;
            this.LLJJIJIIJIL.setTextSize(f);
            while (true) {
                if (this.LLJJIJIIJIL.measureText(str) <= paddingLeft) {
                    break;
                }
                f -= 1.0f;
                float f2 = this.LLJJJ;
                if (f <= f2) {
                    f = f2;
                    break;
                }
                this.LLJJIJIIJIL.setTextSize(f);
            }
            this.LLJJJJJIL = this.LLJJIJIIJIL.getFontMetrics();
            int iCeil = (int) Math.ceil(r0.descent - r0.ascent);
            while (true) {
                if (iCeil <= paddingTop) {
                    break;
                }
                f -= 1.0f;
                float f3 = this.LLJJJ;
                if (f <= f3) {
                    f = f3;
                    break;
                }
                this.LLJJIJIIJIL.setTextSize(f);
                Paint.FontMetrics fontMetrics = this.LLJJJJJIL;
                iCeil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                this.LLJJJJJIL = this.LLJJIJIIJIL.getFontMetrics();
            }
            float f4 = this.LLJJJJ;
            if (f4 != 0.0f) {
                f += f4;
            }
            setTextSize(f / getContext().getResources().getDisplayMetrics().scaledDensity);
        }
    }

    @Override // X.C418350Gan, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            LJJJJIZL(i, i2, getText().toString());
        }
    }
}
