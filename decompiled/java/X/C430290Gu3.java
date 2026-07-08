package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430290Gu3 extends C427280GpC {
    public final String LLIZLLLIL;
    public final int LLJ;
    public String LLJI;

    private final C416750GVt getImageSpan() {
        C416750GVt c416750GVt = new C416750GVt(getContext(), this.LLJ);
        c416750GVt.LL = (int) C12ES.LIZJ(4.0f, getContext());
        return c416750GVt;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.LLIZLLLIL);
    }

    private final int getSpanWidth() {
        return (int) (Math.ceil(getImageSpan().getDrawable().getIntrinsicWidth()) + ((double) C12ES.LIZJ(4.0f, getContext())));
    }

    public final String getMoreString() {
        return this.LLJI;
    }

    public final SpannableString LJJJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(a0.LJLILLLLZI(str).toString());
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, getImageSpan(), strLIZIZ.length() - 1, strLIZIZ.length(), 33);
        return spannableString;
    }

    public final void setMoreString(String str) {
        this.LLJI = str;
        invalidate();
    }

    public final void setViewLineHeight(int i) {
        int fontMetricsInt;
        if (i >= 0 && i != (fontMetricsInt = getPaint().getFontMetricsInt(null))) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public C430290Gu3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = "...";
        this.LLJ = R.drawable.bge;
        this.LLJI = "";
        setViewLineHeight((int) C12ES.LIZJ(20.0f, context));
    }

    public final String LJJJIL(int i, String str) {
        int i2 = i;
        TextPaint paint = getPaint();
        if (i2 < 0) {
            i2 = 0;
        }
        StaticLayout staticLayout = new StaticLayout(str, paint, i2, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        return str.substring(staticLayout.getLineStart(getMaxLines() - 1), staticLayout.getLineEnd(getMaxLines() - 1));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        SpannableString spannableStringLJJJI;
        int size = View.MeasureSpec.getSize(i);
        String string = getText().toString();
        TextPaint paint = getPaint();
        if (size < 0) {
            i3 = 0;
        } else {
            i3 = size;
        }
        if (new StaticLayout(string, paint, i3, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineCount() < getMaxLines()) {
            spannableStringLJJJI = LJJJI(getText().toString());
        } else {
            if (size > getSpanWidth() + getPaint().measureText(LJJJIL(size, getText().toString()))) {
                spannableStringLJJJI = LJJJI(getText().toString());
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String string2 = getText().toString();
                TextPaint paint2 = getPaint();
                if (size < 0) {
                    i4 = 0;
                } else {
                    i4 = size;
                }
                sbLIZ.append(string2.substring(0, new StaticLayout(string2, paint2, i4, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineStart(getMaxLines() - 1)));
                String string3 = getText().toString();
                int dotWidth = (size - getDotWidth()) - getSpanWidth();
                String strLJJJIL = LJJJIL(size, string3);
                TextPaint paint3 = getPaint();
                if (dotWidth <= 0) {
                    dotWidth = 0;
                }
                StaticLayout staticLayout = new StaticLayout(strLJJJIL, paint3, dotWidth, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                int lineStart = staticLayout.getLineStart(0);
                int lineEnd = staticLayout.getLineEnd(0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJJJIL(size, string3).substring(lineStart, lineEnd));
                sbLIZ2.append(this.LLIZLLLIL);
                sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                spannableStringLJJJI = LJJJI(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        setText(spannableStringLJJJI);
        super.onMeasure(i, i2);
    }
}
