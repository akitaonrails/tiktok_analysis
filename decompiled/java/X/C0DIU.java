package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DIU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIU {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LJ(int i, CharSequence charSequence) {
        int iLJ = C13LZ.LJ(i, 0, charSequence.length());
        while (iLJ > 0) {
            int i2 = iLJ - 1;
            if (!C1244080iTm.LJ(charSequence.charAt(i2))) {
                break;
            }
            iLJ = i2;
        }
        return charSequence.subSequence(0, iLJ);
    }

    public static SpannableStringBuilder LIZJ(CharSequence charSequence, String str, int i, C0DES c0des) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(charSequence).append((CharSequence) "…").append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(i), (spannableStringBuilderAppend.length() - str.length()) - 1, spannableStringBuilderAppend.length(), 33);
        int length = spannableStringBuilderAppend.length() - str.length();
        int length2 = spannableStringBuilderAppend.length();
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(i), length, length2, 33);
        C786410Ut5.q2(spannableStringBuilderAppend, new C346210Dhj(i, c0des, 1), length, length2, 33);
        return spannableStringBuilderAppend;
    }

    public static StaticLayout LIZLLL(int i, TextPaint textPaint, TextView textView, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }

    public static CharSequence LIZIZ(TextView textView, CharSequence charSequence, TextPaint textPaint, int i, int i2, String str, int i3, C0DES c0des) {
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i4 <= length) {
            int i6 = (i4 + length) >>> 1;
            int iLJ = C13LZ.LJ(i6, 0, charSequence.length());
            if (1 <= iLJ && iLJ < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(iLJ))) {
                int i7 = iLJ - 1;
                if (Character.isHighSurrogate(charSequence.charAt(i7))) {
                    iLJ = i7;
                }
            }
            if (LIZLLL(i, textPaint, textView, LIZJ(LJ(iLJ, charSequence), str, i3, c0des)).getLineCount() <= i2) {
                if (iLJ > i5) {
                    i5 = iLJ;
                }
                i4 = i6 + 1;
            } else {
                length = i6 - 1;
            }
        }
        return LIZJ(LJ(i5, charSequence), str, i3, c0des);
    }

    public static void LIZ(final int i, final int i2, final int i3, TextView textView, final CharSequence charSequence, final String str, final String str2, final String str3, final Map map) {
        final TextView textView2 = textView;
        int width = (textView2.getWidth() - textView2.getPaddingLeft()) - textView2.getPaddingRight();
        if (width > 0) {
            TextPaint paint = textView2.getPaint();
            if (paint != null) {
                TextPaint textPaint = new TextPaint(paint);
                if (LIZLLL(width, textPaint, textView2, charSequence).getLineCount() > i) {
                    boolean zLJFF = Intrinsics.LJFF(map.get(str3), Boolean.TRUE);
                    C0DES c0des = new C0DES(i, i2, i3, textView2, charSequence, str3, str, str2, map);
                    textView2.setEllipsize(null);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    if (!zLJFF) {
                        textView2.setMaxLines(i);
                        textView2.setText(LIZIZ(textView2, charSequence, textPaint, width, i, str, i3, c0des));
                        return;
                    }
                    textView2.setMaxLines(i2);
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) " ").append((CharSequence) str2);
                    int length = spannableStringBuilderAppend.length() - str2.length();
                    int length2 = spannableStringBuilderAppend.length();
                    C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(i3), length, length2, 33);
                    C786410Ut5.q2(spannableStringBuilderAppend, new C346210Dhj(i3, c0des, 1), length, length2, 33);
                    int lineCount = LIZLLL(width, textPaint, textView2, spannableStringBuilderAppend).getLineCount();
                    CharSequence charSequenceLIZIZ = spannableStringBuilderAppend;
                    TextView textView3 = textView2;
                    if (lineCount > i2) {
                        TextView textView4 = textView2;
                        charSequenceLIZIZ = LIZIZ(textView4, charSequence, textPaint, width, i2, str2, i3, c0des);
                        textView3 = textView4;
                    }
                    textView3.setText(charSequenceLIZIZ);
                    return;
                }
                textView2.setMovementMethod(null);
                C786410Ut5.T7(textView2, null);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setMaxLines(i);
                textView2.setText(charSequence);
                return;
            }
            return;
        }
        textView2.setMovementMethod(null);
        C786410Ut5.T7(textView2, null);
        textView2.setMaxLines(i);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(charSequence);
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(textView2, new Runnable() { // from class: X.0DER
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExpandableTextBinder@c99d.bind$$inlined$doOnPreDraw$1");
                try {
                    TextView textView5 = textView2;
                    CharSequence charSequence2 = charSequence;
                    C0DIU.LIZ(i, i2, i3, textView5, charSequence2, str, str2, str3, map);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExpandableTextBinder@c99d.bind$$inlined$doOnPreDraw$1");
            }
        });
    }
}
