package X;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0FWC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWC {
    public static final void LIZ(TextView textView, CharSequence charSequence) {
        int width;
        textView.setText(charSequence);
        if (textView.getWidth() == 0) {
            width = textView.getMaxWidth();
        } else {
            width = textView.getWidth();
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(textView.getHeight(), 1073741824));
        textView.layout(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
    }
}
