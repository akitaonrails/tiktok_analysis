package X;

import android.content.Context;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431000GvC extends TuxTextView {
    public C431000GvC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Spanned spanned;
        Object[] spans;
        super.onMeasure(i, i2);
        if (getTypeface() == null || !getTypeface().isItalic()) {
            CharSequence text = getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null && (spans = spanned.getSpans(0, ((Spanned) text).length(), StyleSpan.class)) != null) {
                C089E c089e = new C089E(spans);
                while (c089e.hasNext()) {
                    if ((((StyleSpan) c089e.next()).getStyle() & 2) != 0) {
                    }
                }
                return;
            }
            return;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(getMeasuredWidth() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), getMeasuredHeight());
        }
    }
}
