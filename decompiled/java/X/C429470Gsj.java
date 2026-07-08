package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0Gsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429470Gsj extends C16F5 {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        CharSequence text;
        Layout layout;
        int lineVisibleEnd;
        if (getEllipsize() == TextUtils.TruncateAt.END && (text = getText()) != null && (layout = getLayout()) != null && text.length() > (lineVisibleEnd = layout.getLineVisibleEnd(0))) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = lineVisibleEnd - 4;
            if (i <= 0) {
                i = 0;
            }
            spannableStringBuilder.append(text.subSequence(0, i)).append((CharSequence) "...");
            setText(spannableStringBuilder);
        }
        super.draw(canvas);
    }

    public C429470Gsj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
