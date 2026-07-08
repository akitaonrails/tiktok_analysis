package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Gw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431580Gw8 {
    public static StaticLayout LIZ(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, boolean z2) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, 0, i, textPaint, i2).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i3).setMaxLines(i4).setTextDirection(TextDirectionHeuristics.LTR).setBreakStrategy(0).setHyphenationFrequency(0).setIndents(null, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            indents.setJustificationMode(0);
            if (i5 >= 28) {
                indents.setUseLineSpacingFromFallbacks(z2);
            }
        }
        return indents.build();
    }
}
