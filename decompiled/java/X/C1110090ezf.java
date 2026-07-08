package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.BreakIterator;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0ezf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110090ezf {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL(C1110060ezc c1110060ezc) {
        int width = (c1110060ezc.getWidth() - c1110060ezc.getPaddingLeft()) - c1110060ezc.getPaddingRight();
        if (width > 0) {
            return width;
        }
        int measuredWidth = (c1110060ezc.getMeasuredWidth() - c1110060ezc.getPaddingLeft()) - c1110060ezc.getPaddingRight();
        if (measuredWidth < 0) {
            return 0;
        }
        return measuredWidth;
    }

    public static String LJFF(String str) {
        String strSubstring;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int next = characterInstance.next(9);
        if (next != -1) {
            strSubstring = str.substring(0, next);
        } else {
            strSubstring = str;
        }
        strSubstring.toString();
        if (strSubstring.length() < str.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append("...");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static CharSequence LIZ(C1110060ezc c1110060ezc, CharSequence charSequence) {
        IntRange intRangeLJIILJJIL;
        int iLIZLLL = LIZLLL(c1110060ezc);
        if (iLIZLLL > 0) {
            int i = 1;
            if (charSequence.length() != 0) {
                TextPaint paint = c1110060ezc.getPaint();
                if (LIZJ(iLIZLLL, paint, charSequence)) {
                    c1110060ezc.setMaxLines(1);
                    return charSequence;
                }
                boolean z = charSequence instanceof Spanned;
                if (z) {
                    Spanned spanned = (Spanned) charSequence;
                    Object objLJJIFFI = C13LQ.LJJIFFI(spanned.getSpans(0, charSequence.length(), C1110030ezZ.class));
                    if (objLJJIFFI != null) {
                        int spanStart = spanned.getSpanStart(objLJJIFFI);
                        int spanEnd = spanned.getSpanEnd(objLJJIFFI);
                        if (spanStart >= 0 && spanEnd > spanStart && (intRangeLJIILJJIL = C13LZ.LJIILJJIL(spanStart, spanEnd)) != null) {
                            String strLJFF = LJFF(charSequence.subSequence(intRangeLJIILJJIL.LL, intRangeLJIILJJIL.LLILLJJLI + 1).toString());
                            if (!z) {
                                charSequence = new SpannableStringBuilder(charSequence).replace(intRangeLJIILJJIL.LL, intRangeLJIILJJIL.LLILLJJLI + 1, (CharSequence) strLJFF);
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder.replace(intRangeLJIILJJIL.LL, intRangeLJIILJJIL.LLILLJJLI + 1, (CharSequence) strLJFF);
                                charSequence = spannableStringBuilder;
                            }
                        }
                    }
                }
                if (!LIZJ(iLIZLLL, paint, charSequence)) {
                    i = Integer.MAX_VALUE;
                }
                c1110060ezc.setMaxLines(i);
                return charSequence;
            }
        }
        return charSequence;
    }

    public static int LJ(AbstractC1114210f6J abstractC1114210f6J, int i) {
        if (abstractC1114210f6J.getLabelStart().getVisibility() == 0 && abstractC1114210f6J.getLabelStart().getWidth() > 0) {
            i -= abstractC1114210f6J.getLabelStart().getWidth() + abstractC1114210f6J.getGap();
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.AbstractC1114210f6J r8, android.widget.TextView r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1110090ezf.LIZIZ(X.0f6J, android.widget.TextView, java.lang.String):void");
    }

    public static boolean LIZJ(int i, TextPaint textPaint, CharSequence charSequence) {
        if (i <= 0 || StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setMaxLines(1).build().getLineCount() <= 1) {
            return true;
        }
        return false;
    }
}
