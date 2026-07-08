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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hOP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202310hOP extends TuxTextView {
    public String LLJJJJ;
    public String LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public Animator LLJLILLLLZIIL;
    public SpannableString LLJLL;
    public StaticLayout LLJLLIL;
    public CharSequence LLJLLL;

    public final boolean getExpanded() {
        return !this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.LLJLILLLLZIIL;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final boolean getCollapsed() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getExpandAction() {
        return this.LLJJJJJIL;
    }

    public final int getExpandActionColor() {
        return this.LLJJL;
    }

    public final int getLimitedMaxLines() {
        return this.LLJJJJLIIL;
    }

    public final String getOriginalText() {
        return this.LLJJJJ;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setExpandAction(String str) {
        this.LLJJJJJIL = str;
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLL = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(42, false), length, this.LLJLL.length(), 33);
        C786410Ut5.p2(this.LLJLL, new ForegroundColorSpan(this.LLJJL), length, this.LLJLL.length(), 33);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), true);
    }

    public final void setExpandActionColor(int i) {
        this.LLJJL = i;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = String.valueOf((char) 8230).length();
        SpannableString spannableString = this.LLJLL;
        C786410Ut5.p2(spannableString, foregroundColorSpan, length, spannableString.length(), 33);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), true);
    }

    public final void setExpandable(boolean z) {
        this.LLJL = z;
    }

    public final void setExpanded$topic_release(boolean z) {
        CharSequence charSequence;
        if (this.LLJJLIIIJLLLLLLLZ) {
            charSequence = this.LLJLLL;
        } else {
            charSequence = this.LLJJJJ;
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
        this.LLJJJJLIIL = i;
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i != -1 && this.LLJJJJLIIL > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n                maxLines (");
            sbLIZ.append(i);
            sbLIZ.append(") must be greater than or equal to limitedMaxLines (");
            sbLIZ.append(this.LLJJJJLIIL);
            sbLIZ.append("). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
            String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            strLIZJ.toString();
            throw new IllegalStateException(strLIZJ);
        }
        super.setMaxLines(i);
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    public final void setOriginalText(String str) {
        this.LLJJJJ = str;
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd(), false);
    }

    public C1202310hOP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = 3;
        this.LLJJL = C446980Hfs.LIZ(context, R.color.holo_purple);
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLL = new SpannableString("");
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        setExpandAction(context.getString(2131827869));
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1p, context);
        if (numLIZJ != null) {
            setExpandActionColor(numLIZJ.intValue());
        }
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_rawText);
        setOriginalText(strXd == null ? this.LLJJJJ : strXd);
        setLimitedMaxLines(typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_collapsedMaxLines, this.LLJJJJLIIL));
        if (getMaxLines() != -1 && this.LLJJJJLIIL > getMaxLines()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n                maxLines (");
            sbLIZ.append(getMaxLines());
            sbLIZ.append(") must be greater than or equal to limitedMaxLines (");
            sbLIZ.append(this.LLJJJJLIIL);
            sbLIZ.append("). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
            String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            strLIZJ.toString();
            throw new IllegalStateException(strLIZJ);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0hOP, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void LJJJJL(int i, boolean z) {
        float lineWidth;
        CharSequence text;
        DynamicLayout dynamicLayout;
        if (i <= 0) {
            return;
        }
        StaticLayout staticLayoutLJJJJJ = LJJJJJ(this.LLJJJJLIIL, i, this.LLJJJJ);
        if (z) {
            this.LLJLLIL = LJJJJJ(1, i, this.LLJLL);
        }
        ?? text2 = staticLayoutLJJJJJ.getText();
        if (!Intrinsics.LJFF(text2.toString(), this.LLJJJJ)) {
            this.LLJL = true;
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, staticLayoutLJJJJJ.getLineCount()).iterator();
            int lineWidth2 = 0;
            while (it2.LLILLL) {
                lineWidth2 += (int) staticLayoutLJJJJJ.getLineWidth(it2.nextInt());
            }
            float f = lineWidth2;
            StaticLayout staticLayout = this.LLJLLIL;
            if (staticLayout != null) {
                lineWidth = staticLayout.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.LLJJJJ, getPaint(), f - lineWidth, TextUtils.TruncateAt.END);
            int iLJJIZ = a0.LJJIZ(charSequenceEllipsize, (char) 8230, 0, false, 6);
            CharSequence text3 = null;
            if (Intrinsics.LJFF(charSequenceEllipsize, "")) {
                StaticLayout staticLayout2 = this.LLJLLIL;
                text2 = staticLayout2 != null ? staticLayout2.getText() : 0;
            } else if (iLJJIZ != -1) {
                int i2 = iLJJIZ + 1;
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(charSequenceEllipsize);
                StaticLayout staticLayout3 = this.LLJLLIL;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                } else {
                    text = null;
                }
                text2 = spannableStringBuilderAppend.replace(iLJJIZ, i2, text);
                int width = staticLayoutLJJJJJ.getWidth();
                if (Build.VERSION.SDK_INT >= 28) {
                    dynamicLayout = DynamicLayout.Builder.obtain(text2, getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
                } else {
                    dynamicLayout = new DynamicLayout(text2, text2, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
                }
                StaticLayout staticLayout4 = this.LLJLLIL;
                if (staticLayout4 != null) {
                    text3 = staticLayout4.getText();
                }
                for (int iLJJJ = a0.LJJJ(text2, String.valueOf(text3), 0, false, 6) - 1; iLJJJ >= 0 && dynamicLayout.getLineCount() > this.LLJJJJLIIL; iLJJJ--) {
                    text2.delete(iLJJJ, iLJJJ + 1);
                }
            }
        } else {
            this.LLJL = false;
            text2 = this.LLJJJJ;
        }
        this.LLJLLL = text2;
        ?? r7 = text2;
        if (!this.LLJJLIIIJLLLLLLLZ) {
            r7 = this.LLJJJJ;
        }
        setText(r7);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Animator animator;
        int size = (View.MeasureSpec.getSize(i) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        if (size == this.LLJLIL || ((animator = this.LLJLILLLLZIIL) != null && animator.isRunning())) {
            super.onMeasure(i, i2);
            return;
        }
        this.LLJLIL = size;
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
