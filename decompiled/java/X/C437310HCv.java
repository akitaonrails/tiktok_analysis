package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437310HCv extends TuxTextView {
    public CharSequence LLJJJJ;
    public CharSequence LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public final SpannableStringBuilder LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    public C437310HCv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean LJJJJL(Layout layout) {
        if (layout.getLineCount() > this.LLJJLIIIJLLLLLLLZ) {
            return false;
        }
        int lineCount = getLineCount() - 1;
        if (lineCount < 0) {
            lineCount = 0;
        }
        if (layout.getEllipsisCount(lineCount) != 0) {
            return false;
        }
        return true;
    }

    public final void LJJJJLI(int i) {
        SpannableStringBuilder spannableStringBuilderLJJJJJ;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequenceLJJJJJ;
        CharSequence charSequenceLJJJJJ2;
        int lineEnd = getLayout().getLineEnd(this.LLJJLIIIJLLLLLLLZ - 1);
        int length = this.LLJJJJLIIL.length();
        if (lineEnd > length) {
            lineEnd = length;
        }
        int i2 = lineEnd + 1;
        int length2 = this.LLJJJJLIIL.length();
        if (i2 <= length2) {
            boolean z = false;
            while (true) {
                int i3 = lineEnd;
                lineEnd = i2;
                if (!C1108004Va.LIZ()) {
                    SpannableStringBuilder spannableStringBuilder2 = this.LLJJL;
                    spannableStringBuilder2.clear();
                    spannableStringBuilder2.clearSpans();
                    this.LLJJL.append(this.LLJJJJLIIL.subSequence(0, i2)).append(this.LLJJJJ).append(this.LLJJJJJIL);
                }
                if (C1108004Va.LIZ()) {
                    charSequenceLJJJJJ = LJJJJJ(this.LLJJJJLIIL.subSequence(0, i2), this.LLJJJJ, this.LLJJJJJIL);
                } else {
                    charSequenceLJJJJJ = this.LLJJL;
                }
                if (LJJJJL(C336740DIa.LIZ(this, charSequenceLJJJJJ, i))) {
                    if (i2 == length2) {
                        break;
                    }
                    i2++;
                    z = true;
                } else {
                    if (z) {
                        if (!C1108004Va.LIZ()) {
                            SpannableStringBuilder spannableStringBuilder3 = this.LLJJL;
                            spannableStringBuilder3.clear();
                            spannableStringBuilder3.clearSpans();
                            this.LLJJL.append(this.LLJJJJLIIL.subSequence(0, i3)).append(this.LLJJJJ).append(this.LLJJJJJIL);
                        }
                        if (C1108004Va.LIZ()) {
                            charSequenceLJJJJJ2 = LJJJJJ(this.LLJJJJLIIL.subSequence(0, i3), this.LLJJJJ, this.LLJJJJJIL);
                        } else {
                            charSequenceLJJJJJ2 = this.LLJJL;
                        }
                        setText(charSequenceLJJJJJ2);
                        return;
                    }
                    lineEnd = i3;
                }
            }
        }
        CharSequence charSequenceSubSequence = this.LLJJJJLIIL.subSequence(0, lineEnd);
        while (true) {
            if (!C1108004Va.LIZ()) {
                SpannableStringBuilder spannableStringBuilder4 = this.LLJJL;
                spannableStringBuilder4.clear();
                spannableStringBuilder4.clearSpans();
                this.LLJJL.append(charSequenceSubSequence).append(this.LLJJJJ).append(this.LLJJJJJIL);
            }
            spannableStringBuilderLJJJJJ = LJJJJJ(charSequenceSubSequence, this.LLJJJJ, this.LLJJJJJIL);
            if (C1108004Va.LIZ()) {
                spannableStringBuilder = spannableStringBuilderLJJJJJ;
            } else {
                spannableStringBuilder = this.LLJJL;
            }
            if (LJJJJL(C336740DIa.LIZ(this, spannableStringBuilder, i)) || charSequenceSubSequence.length() == 0) {
                break;
            } else {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
            }
        }
        if (!C1108004Va.LIZ()) {
            spannableStringBuilderLJJJJJ = this.LLJJL;
        }
        setText(spannableStringBuilderLJJJJJ);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(truncateAt);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        super.setMaxLines(i);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C437310HCv(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z4;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        setEllipsize(TextUtils.TruncateAt.END);
        this.LLJJJJ = "…";
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = "";
        this.LLJJL = new SpannableStringBuilder();
        this.LLJJLIIIJLLLLLLLZ = 1;
    }

    public final C1360500lVY LJJJJJ(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        SpannableStringBuilder spannableStringBuilder = this.LLJJL;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        this.LLJJL.append(charSequence).append(charSequence2);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(this.LLJJL);
        c1360520lVa.LIZ.append(charSequence3);
        return c1360520lVa.LIZ;
    }

    public static void LJJJJLL(C437310HCv c437310HCv, CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        String str;
        if ((i & 2) != 0) {
            str = "…";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            charSequence2 = "";
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c437310HCv.LLJJJJLIIL = charSequence;
        c437310HCv.LLJJJJ = str;
        c437310HCv.LLJJJJJIL = charSequence2;
        SpannableStringBuilder spannableStringBuilder = c437310HCv.LLJJL;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        c437310HCv.LLJJL.append(c437310HCv.LLJJJJLIIL).append(c437310HCv.LLJJJJJIL);
        c437310HCv.setText(c437310HCv.LLJJL);
        if (z) {
            C786410Ut5.x3(c437310HCv.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(c437310HCv, 5));
        }
    }
}
