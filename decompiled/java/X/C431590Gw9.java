package X;

import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Gw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431590Gw9 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new Object() { // from class: X.0GwB
        };
    }

    public static StaticLayout LIZ(final float f, final float f2, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, int i7, final int i8, final int i9, final int i10, final Layout.Alignment alignment, final TextDirectionHeuristic textDirectionHeuristic, final TextPaint textPaint, final TextUtils.TruncateAt truncateAt, final CharSequence charSequence, final boolean z, final boolean z2, final int[] iArr, final int[] iArr2) {
        new Object(f, f2, i2, i3, i, i4, i5, i6, i8, i9, i10, alignment, textDirectionHeuristic, textPaint, truncateAt, charSequence, z, z2, iArr, iArr2) { // from class: X.0GwA
            {
                if (i2 < 0 || i2 > i3) {
                    C1681000tqU.LIZ("invalid start value");
                }
                int length = charSequence.length();
                if (i3 < 0 || i3 > length) {
                    C1681000tqU.LIZ("invalid end value");
                }
                if (i4 < 0) {
                    C1681000tqU.LIZ("invalid maxLines value");
                }
                if (i < 0) {
                    C1681000tqU.LIZ("invalid width value");
                }
                if (i5 < 0) {
                    C1681000tqU.LIZ("invalid ellipsizedWidth value");
                }
                if (f < 0.0f) {
                    C1681000tqU.LIZ("invalid lineSpacingMultiplier value");
                }
            }
        };
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, i2, i3, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(f2, f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(1);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(iArr, iArr2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            builderObtain.setJustificationMode(i6);
            if (i11 >= 28) {
                builderObtain.setUseLineSpacingFromFallbacks(false);
                if (i11 >= 33) {
                    builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i8).setLineBreakWordStyle(i9).build());
                    if (i11 >= 35) {
                        builderObtain.setUseBoundsForWidth(false);
                    }
                }
            }
        }
        return builderObtain.build();
    }
}
