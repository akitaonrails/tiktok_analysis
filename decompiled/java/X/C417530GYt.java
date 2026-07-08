package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417530GYt implements LineBackgroundSpan {
    public final int LL;
    public TuxTextView LLILLJJLI;
    public final RectF LLILLL = new RectF();
    public final Paint LLILZ = new Paint(1);

    public C417530GYt(int i) {
        this.LL = i;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        CharSequence text;
        Spanned spanned;
        Spanned spanned2;
        Layout layout;
        int i9 = i6;
        int i10 = i7;
        int i11 = i5 - i3;
        if (i11 <= 0) {
            return;
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        CharSequence text2 = null;
        if (tuxTextView != null) {
            text = tuxTextView.getText();
        } else {
            text = null;
        }
        if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
            int spanStart = spanned.getSpanStart(this);
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                text2 = tuxTextView2.getText();
            }
            if ((text2 instanceof Spanned) && (spanned2 = (Spanned) text2) != null) {
                int spanEnd = spanned2.getSpanEnd(this);
                if (spanEnd <= i10) {
                    i10 = spanEnd;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                if (spanStart >= i9) {
                    i9 = spanStart;
                }
                TuxTextView tuxTextView3 = this.LLILLJJLI;
                if (tuxTextView3 != null && (layout = tuxTextView3.getLayout()) != null) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(i9);
                    float secondaryHorizontal = layout.getSecondaryHorizontal(i9);
                    if (primaryHorizontal > secondaryHorizontal) {
                        primaryHorizontal = secondaryHorizontal;
                    }
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(i10);
                    float secondaryHorizontal2 = layout.getSecondaryHorizontal(i10);
                    if (primaryHorizontal2 < secondaryHorizontal2) {
                        primaryHorizontal2 = secondaryHorizontal2;
                    }
                    float f = i3 + (i11 / 2.0f);
                    this.LLILZ.setColor(this.LL);
                    if (primaryHorizontal2 <= primaryHorizontal) {
                        this.LLILLL.set(primaryHorizontal2, f, primaryHorizontal, i5);
                    } else {
                        this.LLILLL.set(primaryHorizontal, f, primaryHorizontal2, i5);
                    }
                    canvas.drawRect(this.LLILLL, this.LLILZ);
                }
            }
        }
    }
}
