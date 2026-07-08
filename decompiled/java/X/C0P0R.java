package X;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

/* JADX INFO: renamed from: X.0P0R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0R {
    public static final SpannableStringBuilder LIZ(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2) {
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        float fMeasureText = i - (textPaint.measureText("...") + 0);
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() && '\n' != spannableStringBuilder.charAt(lineStart)) {
            int i3 = lineStart + 1;
            fMeasureText -= textPaint.measureText(spannableStringBuilder, lineStart, i3);
            if (fMeasureText <= 0.0f) {
                break;
            }
            lineStart = i3;
        }
        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length(), spannableStringBuilder.length());
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append(spannableStringBuilder.subSequence(0, lineStart));
        c1360520lVa.LJI("...");
        c1360520lVa.LIZ.append((CharSequence) " ");
        c1360520lVa.LJI(charSequenceSubSequence);
        return new SpannableStringBuilder(c1360520lVa.LIZ);
    }
}
