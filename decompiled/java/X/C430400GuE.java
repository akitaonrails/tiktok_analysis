package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430400GuE {
    public static final void LIZ(TextView textView, int i) {
        ViewGroup.LayoutParams layoutParams;
        textView.setGravity(8388627);
        textView.setTextAlignment(5);
        CharSequence text = textView.getText();
        if (text == null || (layoutParams = textView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
        C786410Ut5.g6(textView, layoutParams);
        if (text.length() == 0) {
            textView.requestLayout();
            return;
        }
        int maxLines = textView.getMaxLines();
        if (maxLines < 1) {
            maxLines = 1;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(textView.getIncludeFontPadding()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setMaxLines(maxLines).setEllipsize(TextUtils.TruncateAt.END).build();
        int iMin = Math.min(staticLayoutBuild.getLineCount(), maxLines);
        float fMax = 0.0f;
        for (int i2 = 0; i2 < iMin; i2++) {
            fMax = Math.max(fMax, staticLayoutBuild.getLineWidth(i2));
        }
        layoutParams.width = C13LZ.LJ((int) Math.ceil(fMax), 1, i);
        C786410Ut5.g6(textView, layoutParams);
        textView.requestLayout();
    }
}
