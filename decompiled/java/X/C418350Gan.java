package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418350Gan extends C16F5 {
    public final Paint LLJJ;
    public float LLJJI;
    public final float LLJJIII;
    public boolean LLJJIJI;

    public void setEnableFitSize(boolean z) {
        this.LLJJIJI = z;
    }

    public C418350Gan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.LLJJ = textPaint;
        this.LLJJIII = 6.0f;
        this.LLJJIJI = true;
        textPaint.set((Paint) getPaint());
        this.LLJJI = getTextSize();
    }

    public final void LJJJJI(int i, String str) {
        if (i > 0 && this.LLJJIJI) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.LLJJI;
            this.LLJJ.setTextSize(f);
            while (true) {
                if (this.LLJJ.measureText(str) <= paddingLeft) {
                    break;
                }
                f -= 1.0f;
                float f2 = this.LLJJIII;
                if (f <= f2) {
                    f = f2;
                    break;
                }
                this.LLJJ.setTextSize(f);
            }
            setTextSize(f / getContext().getResources().getDisplayMetrics().scaledDensity);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        LJJJJI(getWidth(), charSequence.toString());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            LJJJJI(i, getText().toString());
        }
    }
}
