package X;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0vwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761500vwK {
    public final TextView LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;

    public final SpannableString LIZ(SpannableString spannableString, int i) {
        TextView textView = this.LIZ;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.LIZ.getTextSize());
        StaticLayout staticLayoutLIZLLL = C20588115hH.LIZLLL(textView, spannableString, textPaint, i, null, true);
        if (staticLayoutLIZLLL.getLineCount() <= this.LIZJ) {
            return spannableString;
        }
        int i2 = 1;
        this.LIZLLL = true;
        Typeface typeface = this.LIZ.getPaint().getTypeface();
        this.LIZ.getPaint().setTypeface(Typeface.defaultFromStyle(1));
        TextPaint paint = this.LIZ.getPaint();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ...");
        sbLIZ.append(this.LIZIZ);
        float fMeasureText = paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.getPaint().setTypeface(typeface);
        int lineStart = staticLayoutLIZLLL.getLineStart(this.LIZJ - 1);
        int lineStart2 = staticLayoutLIZLLL.getLineStart(this.LIZJ) - 1;
        float fMeasureText2 = this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart, lineStart2).toString());
        float f = (int) (i - fMeasureText);
        if (fMeasureText2 > f) {
            float f2 = fMeasureText2 - f;
            while (i2 < lineStart2 && this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart2 - i2, lineStart2).toString()) <= f2) {
                i2++;
            }
        } else {
            i2 = 0;
        }
        return SpannableString.valueOf(spannableString.subSequence(0, lineStart2 - i2));
    }

    public C1761500vwK(TuxTextView tuxTextView, String str, int i) {
        this.LIZ = tuxTextView;
        this.LIZIZ = str;
        this.LIZJ = 4;
        this.LIZJ = i;
    }
}
