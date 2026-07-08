package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.EditText;

/* JADX INFO: renamed from: X.0Gux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430850Gux {
    public static Layout LIZ(CharSequence charSequence, EditText editText, int i) {
        Layout.Alignment alignment;
        TextDirectionHeuristic textDirectionHeuristic;
        int gravity = editText.getGravity();
        if (gravity != 3) {
            if (gravity != 5) {
                if (gravity != 17) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        int textDirection = editText.getTextDirection();
        if (textDirection != 3) {
            if (textDirection != 4) {
                if (textDirection != 5) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                }
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            }
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), editText.getPaint(), i).setAlignment(alignment).setTextDirection(textDirectionHeuristic).setLineSpacing(editText.getLineSpacingExtra(), editText.getLineSpacingMultiplier()).setIncludePad(editText.getIncludeFontPadding());
        if (Build.VERSION.SDK_INT >= 28) {
            includePad.setUseLineSpacingFromFallbacks(true);
        }
        return includePad.build();
    }
}
