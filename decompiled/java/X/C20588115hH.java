package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20588115hH {
    public static final Spanned LIZJ(Context context, int i, Spannable... spannableArr) {
        return C10KE.LIZ(context, i, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }

    public static final void LIZ(Canvas canvas, String str, float f, float f2, C444890HcV c444890HcV, Rect rect) {
        LIZIZ(canvas, str, 0, str.length(), f, f2, c444890HcV, rect);
    }

    public static final StaticLayout LIZLLL(TextView textView, CharSequence charSequence, TextPaint textPaint, int i, Float f, boolean z) {
        if (!Intrinsics.LJFF(textPaint, textView.getPaint())) {
            if (z) {
                textPaint.reset();
                textPaint.set(textView.getPaint());
            }
            if (f != null) {
                textPaint.setTextSize(f.floatValue());
            }
            Layout.Alignment alignment = (Layout.Alignment) C789710UyP.LIZIZ(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int maxLines = textView.getMaxLines();
            TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) C789710UyP.LIZIZ(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (maxLines == -1) {
                maxLines = Integer.MAX_VALUE;
            }
            return hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
        }
        throw new IllegalArgumentException("paint should be a new instance different from current TextView's paint!");
    }

    public static final void LIZIZ(Canvas canvas, String str, int i, int i2, float f, float f2, C444890HcV c444890HcV, Rect rect) {
        c444890HcV.getTextBounds(str, i, i2, rect);
        canvas.drawText(str, i, i2, (f - (rect.width() / 2.0f)) - rect.left, (f2 + (rect.height() / 2.0f)) - rect.bottom, (Paint) c444890HcV);
    }
}
