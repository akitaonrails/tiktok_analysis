package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0HJ0 extends TuxTextView {
    public SpannableString LLJJJJ;
    public SpannableString LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public C0HJ4 LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    public final void LJJJLIIL() throws Throwable {
        this.LLJLILLLLZIIL = true;
        this.LLJLL = false;
        setMovementMethod(LinkMovementMethod.getInstance());
        setMaxLines(2);
        LJJJJLL();
        C0HJ4 c0hj4 = this.LLJJL;
        if (c0hj4 != null) {
            c0hj4.LIZIZ();
        }
    }

    public final void LJJJLZIJ() {
        this.LLJLILLLLZIIL = false;
        this.LLJLL = true;
        setMaxLines(Integer.MAX_VALUE);
        if (C294410BgN.LIZIZ()) {
            setText(new SpannableStringBuilder().append(this.LLJJJJLIIL));
        } else {
            setText(new SpannableStringBuilder().append(this.LLJJJJLIIL).append((CharSequence) this.LLJJJJJIL));
        }
        C0HJ4 c0hj4 = this.LLJJL;
        if (c0hj4 != null) {
            c0hj4.LIZ();
        }
    }

    public final boolean LJJJJLL() throws Throwable {
        if (LJJJJLI(Integer.MAX_VALUE, getWidth(), this.LLJJJJLIIL).getLineCount() <= getMaxLines()) {
            setText(this.LLJJJJLIIL);
            C439870HMr.LIZJ(this, null);
            this.LLJLILLLLZIIL = false;
            return false;
        }
        StaticLayout staticLayoutLJJJJLI = LJJJJLI(getMaxLines(), getWidth(), C439870HMr.LJFF(this.LLJJJJLIIL, getLineHeight(), C439870HMr.LJ(getContext(), this.LLJJJJLIIL.toString()), null));
        float fMeasureText = getPaint().measureText(this.LLJJJJ.toString());
        if (C294410BgN.LIZIZ()) {
            fMeasureText -= getPaint().measureText("…");
        }
        CharSequence text = staticLayoutLJJJJLI.getText();
        if (Intrinsics.LJFF(text, this.LLJJJJLIIL)) {
            this.LLJLILLLLZIIL = false;
            return false;
        }
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, staticLayoutLJJJJLI.getLineCount() - 1).iterator();
        int lineEnd = 0;
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            lineEnd += staticLayoutLJJJJLI.getLineEnd(iNextInt) - staticLayoutLJJJJLI.getLineStart(iNextInt);
        }
        CharSequence charSequenceSubSequence = text.subSequence(0, lineEnd);
        CharSequence charSequenceSubSequence2 = text.subSequence(lineEnd, staticLayoutLJJJJLI.getEllipsisStart(staticLayoutLJJJJLI.getLineCount() - 1) + lineEnd + 1);
        if (fMeasureText - (staticLayoutLJJJJLI.getWidth() - getPaint().measureText(charSequenceSubSequence2.toString())) > 0.0f) {
            charSequenceSubSequence2 = TextUtils.ellipsize(charSequenceSubSequence2, getPaint(), getWidth() - fMeasureText, TextUtils.TruncateAt.END);
        }
        CharSequence charSequenceLJJJJJ = LJJJJJ(charSequenceSubSequence, charSequenceSubSequence2);
        if (C294410BgN.LIZIZ() && getWidth() > 0) {
            StaticLayout staticLayoutLJJJJLI2 = LJJJJLI(getMaxLines(), getWidth(), charSequenceLJJJJJ);
            int lineCount = staticLayoutLJJJJLI2.getLineCount() - 1;
            if (lineCount < 0) {
                lineCount = 0;
            }
            if (staticLayoutLJJJJLI2.getLineRight(lineCount) > getWidth() - fMeasureText) {
                if (getWidth() <= 0) {
                    charSequenceLJJJJJ = LJJJJJ(charSequenceSubSequence, charSequenceSubSequence2);
                } else {
                    float width = getWidth() - fMeasureText;
                    float f = width >= 0.0f ? width : 0.0f;
                    int iMeasureText = (int) getPaint().measureText(charSequenceSubSequence2.toString());
                    if (iMeasureText < 0) {
                        iMeasureText = 0;
                    }
                    C0HJ1 c0hj1 = new C0HJ1(charSequenceSubSequence2, this, charSequenceSubSequence, f);
                    if (iMeasureText <= 0) {
                        iMeasureText = 0;
                    } else if (!((Boolean) c0hj1.invoke(Integer.valueOf(iMeasureText))).booleanValue()) {
                        int i = 0;
                        int i2 = 0;
                        do {
                            int i3 = (i2 + iMeasureText) >>> 1;
                            if (((Boolean) c0hj1.invoke(Integer.valueOf(i3))).booleanValue()) {
                                i2 = i3 + 1;
                                i = i3;
                            } else {
                                iMeasureText = i3 - 1;
                            }
                        } while (i2 <= iMeasureText);
                        iMeasureText = i;
                    }
                    charSequenceLJJJJJ = LJJJJJ(charSequenceSubSequence, TextUtils.ellipsize(charSequenceSubSequence2, getPaint(), iMeasureText, TextUtils.TruncateAt.END));
                    if (!LJJJJL(charSequenceLJJJJJ, f)) {
                        charSequenceLJJJJJ = TextUtils.ellipsize(charSequenceLJJJJJ, getPaint(), f, TextUtils.TruncateAt.END);
                    }
                }
            }
        }
        int length = charSequenceLJJJJJ.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (charSequenceLJJJJJ.charAt(length) != 8230) {
                    if (i4 < 0) {
                        break;
                    }
                    length = i4;
                } else if (charSequenceLJJJJJ.length() != 0) {
                    if (C294410BgN.LIZIZ()) {
                        setText(charSequenceLJJJJJ);
                    } else {
                        setText(new SpannableStringBuilder().append(charSequenceLJJJJJ).replace(length, length + 1, (CharSequence) this.LLJJJJ));
                    }
                    this.LLJLILLLLZIIL = true;
                    return true;
                }
            }
        }
        setText(this.LLJJJJLIIL);
        this.LLJLILLLLZIIL = false;
        return false;
    }

    public final String getCollapseAction() {
        return this.LLJLIL;
    }

    public final String getExpandAction() {
        return this.LLJL;
    }

    public final int getExpandActionColor() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getIsEllipsized() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getIsExpand() {
        return this.LLJLL;
    }

    public final void setCollapseAction(String str) {
        this.LLJLIL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJJIL = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), 1, this.LLJJJJJIL.length(), 33);
        C786410Ut5.p2(this.LLJJJJJIL, new AbstractC1353420lK8() { // from class: X.0HJ2
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) throws Throwable {
                this.LL = false;
                this.LLILLL.LJJJLIIL();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                float f;
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                if (this.LL) {
                    f = 0.2f;
                } else {
                    f = 1.0f;
                }
                textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
            }
        }, 1, this.LLJJJJJIL.length(), 33);
    }

    public final void setExpandAction(String str) {
        this.LLJL = str;
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJ = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), length, this.LLJJJJ.length(), 33);
        C786410Ut5.p2(this.LLJJJJ, new AbstractC1353420lK8() { // from class: X.0HJ3
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                this.LL = false;
                this.LLILLL.LJJJLZIJ();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                float f;
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                if (this.LL) {
                    f = 0.2f;
                } else {
                    f = 1.0f;
                }
                textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLL.getExpandActionColor()) * f), Color.red(this.LLILLL.getExpandActionColor()), Color.green(this.LLILLL.getExpandActionColor()), Color.blue(this.LLILLL.getExpandActionColor())));
            }
        }, length, this.LLJJJJ.length(), 33);
    }

    public final void setExpandActionColor(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public C0HJ0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = new SpannableString("");
        this.LLJJJJJIL = new SpannableString("");
        this.LLJJJJLIIL = "";
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        this.LLJJLIIIJLLLLLLLZ = numLIZJ != null ? numLIZJ.intValue() : 0;
        this.LLJL = context.getResources().getString(2131825209);
        this.LLJLIL = context.getResources().getString(2131834550);
        setEllipsize(TextUtils.TruncateAt.END);
        setExpandAction(context.getResources().getString(2131825209));
        setCollapseAction(context.getResources().getString(2131834550));
    }

    public static CharSequence LJJJJJ(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(charSequence);
        if (charSequence2 instanceof Spanned) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2.toString());
            Spanned spanned = (Spanned) charSequence2;
            C089E c089e = new C089E(spanned.getSpans(0, charSequence2.length(), Object.class));
            while (c089e.hasNext()) {
                Object next = c089e.next();
                int spanStart = spanned.getSpanStart(next);
                int spanEnd = spanned.getSpanEnd(next);
                int spanFlags = spanned.getSpanFlags(next);
                if (next instanceof ForegroundColorSpan) {
                    next = new ForegroundColorSpan(((ForegroundColorSpan) next).getForegroundColor());
                }
                C786410Ut5.q2(spannableStringBuilder, next, spanStart, spanEnd, spanFlags);
            }
            charSequence2 = spannableStringBuilder;
        }
        return spannableStringBuilderAppend.append(charSequence2);
    }

    public final boolean LJJJJL(CharSequence charSequence, float f) {
        StaticLayout staticLayoutLJJJJLI = LJJJJLI(getMaxLines(), getWidth(), charSequence);
        int lineCount = staticLayoutLJJJJLI.getLineCount() - 1;
        if (lineCount < 0) {
            lineCount = 0;
        }
        if (staticLayoutLJJJJLI.getLineRight(lineCount) <= f) {
            return true;
        }
        return false;
    }

    public final StaticLayout LJJJJLI(int i, int i2, CharSequence charSequence) {
        if (i2 < 0) {
            i2 = 0;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i2).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }
}
