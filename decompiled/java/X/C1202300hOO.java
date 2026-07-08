package X;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0hOO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202300hOO extends TuxTextView {
    public String LLJJJJ;
    public String LLJJJJJIL;
    public SpannableString LLJJJJLIIL;
    public String LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public Function1<? super Boolean, Unit> LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public Animator LLLF;
    public SpannableString LLLFF;
    public StaticLayout LLLFFI;
    public CharSequence LLLFZ;
    public CharSequence LLLI;

    public final boolean getExpanded() {
        return !this.LLJLLL;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.LLLF;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final String getCollapseAction() {
        return this.LLJJL;
    }

    public final int getCollapseActionColor() {
        return this.LLJLILLLLZIIL;
    }

    public final int getCollapseActionSize() {
        return this.LLJLLIL;
    }

    public final boolean getCollapsed() {
        return this.LLJLLL;
    }

    public final int getExpandActionColor() {
        return this.LLJLIL;
    }

    public final int getExpandActionSize() {
        return this.LLJLL;
    }

    public final int getLimitedMaxLines() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final Function1<Boolean, Unit> getOnExpandableSet() {
        return this.LLJZ;
    }

    public final String getOriginalText() {
        return this.LLJJJJJIL;
    }

    private final void setExpandAction(String str) {
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLLFF = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(this.LLJLL, false), length, this.LLLFF.length(), 33);
        C786410Ut5.p2(this.LLLFF, new ForegroundColorSpan(this.LLJLIL), length, this.LLLFF.length(), 33);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), true);
    }

    private final void setShowLessButton(boolean z) {
        this.LLJL = z;
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    public final void setCollapseAction(String str) {
        SpannableString spannableString = new SpannableString(str);
        this.LLJJJJLIIL = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(this.LLJLLIL, false), 0, this.LLJJJJLIIL.length(), 33);
        C786410Ut5.p2(this.LLJJJJLIIL, new ForegroundColorSpan(this.LLJLILLLLZIIL), 0, this.LLJJJJLIIL.length(), 33);
        this.LLJJL = str;
    }

    public final void setCollapseActionColor(int i) {
        this.LLJLILLLLZIIL = i;
        C786410Ut5.p2(this.LLJJJJLIIL, new ForegroundColorSpan(i), 0, this.LLJJJJLIIL.length(), 33);
    }

    public final void setCollapseActionSize(int i) {
        this.LLJLLIL = i;
        C786410Ut5.p2(this.LLJJJJLIIL, new C444920HcY(i, false), 0, this.LLJJJJLIIL.length(), 33);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setExpandActionColor(int i) {
        this.LLJLIL = i;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = String.valueOf((char) 8230).length();
        SpannableString spannableString = this.LLLFF;
        C786410Ut5.p2(spannableString, foregroundColorSpan, length, spannableString.length(), 33);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), true);
    }

    public final void setExpandActionSize(int i) {
        this.LLJLL = i;
        C786410Ut5.p2(this.LLLFF, new C444920HcY(i, false), String.valueOf((char) 8230).length(), this.LLLFF.length(), 33);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), true);
    }

    public final void setExpandable(boolean z) {
        this.LLJZIJLIL = z;
        Function1<? super Boolean, Unit> function1 = this.LLJZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void setExpanded$poi_release(boolean z) {
        CharSequence charSequence;
        this.LLJLLL = !z;
        CharSequence charSequence2 = this.LLLI;
        if (charSequence2 == null || charSequence2.length() == 0) {
            this.LLLI = this.LLJJJJJIL;
        }
        if (this.LLJLLL) {
            charSequence = this.LLLFZ;
        } else {
            charSequence = this.LLLI;
        }
        setText(charSequence);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            C786410Ut5.W5(this, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setLimitedMaxLines(int i) {
        if (getMaxLines() != -1 && i > getMaxLines()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n                    maxLines (");
            sbLIZ.append(getMaxLines());
            sbLIZ.append(") must be greater than or equal to limitedMaxLines (");
            sbLIZ.append(i);
            sbLIZ.append("). \n                    maxLines can be -1 if there is no upper limit for lineCount.\n                ");
            String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            strLIZJ.toString();
            throw new IllegalStateException(strLIZJ);
        }
        this.LLJJLIIIJLLLLLLLZ = i;
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i != -1 && this.LLJJLIIIJLLLLLLLZ > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n                maxLines (");
            sbLIZ.append(i);
            sbLIZ.append(") must be greater than or equal to limitedMaxLines (");
            sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
            sbLIZ.append("). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
            String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            strLIZJ.toString();
            throw new IllegalStateException(strLIZJ);
        }
        super.setMaxLines(i);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    public final void setOnExpandableSet(Function1<? super Boolean, Unit> function1) {
        this.LLJZ = function1;
    }

    public final void setOriginalText(String str) {
        this.LLJJJJJIL = str;
        if (((Number) C262270APp.LIZ.getValue()).intValue() != 1) {
            this.LLJJJJ = u.LJJIFFI(u.LJJIFFI(str, "\r\n", "\n", false), "\n", " ", false);
        } else {
            this.LLJJJJ = "";
        }
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    public C1202300hOO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = new SpannableString("");
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = 3;
        this.LLJL = true;
        this.LLJLIL = C446980Hfs.LIZ(context, R.color.holo_purple);
        this.LLJLILLLLZIIL = C446980Hfs.LIZ(context, R.color.holo_purple);
        this.LLJLL = 61;
        this.LLJLLIL = 61;
        this.LLJLLL = true;
        this.LLLFF = new SpannableString("");
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        setExpandAction(context.getString(2131827869));
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1j, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            setExpandActionColor(iIntValue);
            setCollapseActionColor(iIntValue);
        }
        setCollapseAction(context.getString(2131827868));
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_rawText);
        setOriginalText(strXd == null ? this.LLJJJJJIL : strXd);
        setLimitedMaxLines(typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_collapsedMaxLines, this.LLJJLIIIJLLLLLLLZ));
        setShowLessButton(typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExpandableTextView_showLessButton, this.LLJL));
        if (getMaxLines() != -1 && this.LLJJLIIIJLLLLLLLZ > getMaxLines()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n                maxLines (");
            sbLIZ.append(getMaxLines());
            sbLIZ.append(") must be greater than or equal to limitedMaxLines (");
            sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
            sbLIZ.append("). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
            String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            strLIZJ.toString();
            throw new IllegalStateException(strLIZJ);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0hOO, android.widget.TextView] */
    public final void LJJJJL(int i, boolean z) {
        float lineWidth;
        float f;
        DynamicLayout dynamicLayout;
        CharSequence text;
        if (i <= 0) {
            return;
        }
        String str = this.LLJJJJ;
        if (str.length() == 0) {
            str = this.LLJJJJJIL;
        }
        StaticLayout staticLayoutLJJJJJ = LJJJJJ(this.LLJJLIIIJLLLLLLLZ, i, str);
        if (z) {
            this.LLLFFI = LJJJJJ(1, i, this.LLLFF);
        }
        ?? text2 = staticLayoutLJJJJJ.getText();
        String str2 = this.LLJJJJ;
        if (str2.length() == 0) {
            str2 = this.LLJJJJJIL;
        }
        if (!Intrinsics.LJFF(text2.toString(), str2)) {
            setExpandable(true);
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, staticLayoutLJJJJJ.getLineCount()).iterator();
            int lineWidth2 = 0;
            while (it2.LLILLL) {
                lineWidth2 += (int) staticLayoutLJJJJJ.getLineWidth(it2.nextInt());
            }
            float lineWidth3 = staticLayoutLJJJJJ.getLineWidth(staticLayoutLJJJJJ.getLineCount() - 1);
            StaticLayout staticLayout = this.LLLFFI;
            float lineWidth4 = 0.0f;
            if (staticLayout != null) {
                lineWidth = staticLayout.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            if (lineWidth3 <= lineWidth + 10.0f) {
                f = lineWidth2;
            } else {
                float f2 = lineWidth2;
                StaticLayout staticLayout2 = this.LLLFFI;
                if (staticLayout2 != null) {
                    lineWidth4 = staticLayout2.getLineWidth(0);
                }
                f = f2 - lineWidth4;
            }
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(str2, getPaint(), f, TextUtils.TruncateAt.END);
            int iLJJJJ = a0.LJJJJ(charSequenceEllipsize, (char) 8230, 0, 6);
            CharSequence charSequence = "";
            CharSequence text3 = null;
            if (Intrinsics.LJFF(charSequenceEllipsize, "")) {
                StaticLayout staticLayout3 = this.LLLFFI;
                text2 = staticLayout3 != null ? staticLayout3.getText() : 0;
            } else if (iLJJJJ != -1) {
                if (this.LLJL) {
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) this.LLJJJJJIL);
                    if (this.LLJJJJLIIL.length() > 0) {
                        spannableStringBuilderAppend.append((CharSequence) "\n");
                        spannableStringBuilderAppend.append((CharSequence) this.LLJJJJLIIL);
                    }
                    this.LLLI = spannableStringBuilderAppend;
                } else {
                    this.LLLI = this.LLJJJJJIL;
                }
                int i2 = iLJJJJ + 1;
                SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder().append(charSequenceEllipsize);
                StaticLayout staticLayout4 = this.LLLFFI;
                if (staticLayout4 != null && (text = staticLayout4.getText()) != null) {
                    charSequence = text;
                }
                text2 = spannableStringBuilderAppend2.replace(iLJJJJ, i2, charSequence);
                int width = staticLayoutLJJJJJ.getWidth();
                if (Build.VERSION.SDK_INT >= 28) {
                    dynamicLayout = DynamicLayout.Builder.obtain(text2, getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
                } else {
                    dynamicLayout = new DynamicLayout(text2, text2, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
                }
                StaticLayout staticLayout5 = this.LLLFFI;
                if (staticLayout5 != null) {
                    text3 = staticLayout5.getText();
                }
                for (int iLJJJ = a0.LJJJ(text2, String.valueOf(text3), 0, false, 6) - 1; iLJJJ >= 0 && dynamicLayout.getLineCount() > this.LLJJLIIIJLLLLLLLZ; iLJJJ--) {
                    text2.delete(iLJJJ, iLJJJ + 1);
                }
            }
        } else {
            setExpandable(false);
            this.LLLI = this.LLJJJJJIL;
            text2 = str2;
        }
        this.LLLFZ = text2;
        ?? r12 = text2;
        if (!this.LLJLLL) {
            r12 = this.LLLI;
        }
        setText(r12);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Animator animator;
        int size = (View.MeasureSpec.getSize(i) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        if (size == this.LLL || ((animator = this.LLLF) != null && animator.isRunning())) {
            super.onMeasure(i, i2);
            return;
        }
        this.LLL = size;
        LJJJJL(size, true);
        super.onMeasure(i, i2);
    }

    public final StaticLayout LJJJJJ(int i, int i2, CharSequence charSequence) {
        if (i2 < 0) {
            i2 = 0;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i2).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }
}
