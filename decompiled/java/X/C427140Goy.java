package X;

import android.R;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Goy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427140Goy extends TuxTextView {
    public C427140Goy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int maxWidth = getMaxWidth();
        if (maxWidth > 0 && measuredWidth >= maxWidth) {
            int lineCount = layout.getLineCount();
            float fMax = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                fMax = Math.max(fMax, layout.getLineWidth(i3));
            }
            int compoundPaddingLeft = (int) (fMax + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (compoundPaddingLeft < measuredWidth) {
                setMeasuredDimension(compoundPaddingLeft, getMeasuredHeight());
            }
        }
    }
}
