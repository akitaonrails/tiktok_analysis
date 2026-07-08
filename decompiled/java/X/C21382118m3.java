package X;

import android.graphics.Paint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21382118m3 {
    public static C21370918kF LIZ(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new C21370918kF(C21382218m4.LIZJ(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        C21382018m2 c21382018m2 = new C21382018m2(textPaint);
        c21382018m2.LIZIZ = C21382318m5.LIZ(textView);
        c21382018m2.LIZJ = C21382318m5.LIZLLL(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = false;
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    break;
            }
        }
        c21382018m2.LIZ = textDirectionHeuristic;
        return new C21370918kF(textPaint, textDirectionHeuristic, c21382018m2.LIZIZ, c21382018m2.LIZJ);
    }

    public static ActionMode.Callback LJIIIIZZ(ActionMode.Callback callback) {
        if ((callback instanceof ActionModeCallbackC21510319Gb) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionModeCallbackC21510319Gb) callback).LL;
        }
        return callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C20745716Fz.LJII(textView, i);
        } else {
            if (!(textView instanceof InterfaceC20745616Fy)) {
                return;
            }
            ((InterfaceC20745616Fy) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void LIZLLL(TextView textView, int i) {
        int i2;
        C08IF.LIZJ(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C21382218m4.LIZLLL(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void LJ(TextView textView, int i) {
        int i2;
        C08IF.LIZJ(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void LJFF(TextView textView, int i) {
        C08IF.LIZJ(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void LJII(TextView textView, C21371318kJ c21371318kJ) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = c21371318kJ.LL;
            if (spannable instanceof PrecomputedText) {
                precomputedText = (PrecomputedText) spannable;
            } else {
                precomputedText = null;
            }
            C21382218m4.LIZ(precomputedText);
            textView.setText(precomputedText);
            return;
        }
        if (LIZ(textView).LIZ(c21371318kJ.LLILLJJLI)) {
            textView.setText(c21371318kJ);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static ActionMode.Callback LJIIIZ(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ActionModeCallbackC21510319Gb) && callback != null) {
            return new ActionModeCallbackC21510319Gb(callback, textView);
        }
        return callback;
    }

    public static void LJI(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C21382418m6.LIZ(textView, i, f);
        } else {
            LJFF(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            C20745716Fz.LJFF(textView, i, i2, i3, i4);
        } else {
            if (!(textView instanceof InterfaceC20745616Fy)) {
                return;
            }
            ((InterfaceC20745616Fy) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }
}
