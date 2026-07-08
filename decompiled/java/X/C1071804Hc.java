package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.04Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071804Hc {
    public static final void LIZ(TextView textView) {
        TuxTextView tuxTextView;
        if (textView == null) {
            return;
        }
        LIZIZ(textView);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setBreakStrategy(0);
        textView.setHyphenationFrequency(0);
        textView.setHorizontallyScrolling(false);
        if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
            tuxTextView.LLJJ = true;
        }
        textView.requestLayout();
        textView.invalidate();
    }

    public static final void LIZIZ(TextView textView) {
        TuxTextView tuxTextView;
        if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
            tuxTextView.setMinTextSizePx(-1);
        }
    }
}
