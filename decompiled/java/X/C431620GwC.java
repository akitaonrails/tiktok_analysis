package X;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431620GwC extends C16F5 {
    public static final String LLJJIJI = "  ";
    public static final String LLJJIJIIJIL = " &  ";
    public int LLJJ;
    public CharSequence LLJJI;
    public CharSequence LLJJIII;

    public final Layout LJJJJI(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), getMeasuredWidth());
            builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            builderObtain.setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier());
            builderObtain.setIncludePad(getIncludeFontPadding());
            builderObtain.setBreakStrategy(getBreakStrategy());
            builderObtain.setHyphenationFrequency(getHyphenationFrequency());
            builderObtain.setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR);
            builderObtain.setUseLineSpacingFromFallbacks(isFallbackLineSpacing());
            return builderObtain.build();
        }
        return new StaticLayout(charSequence, getPaint(), getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    public final void setOriginalText(CharSequence charSequence) {
        if (TextUtils.equals(this.LLJJI, charSequence)) {
            return;
        }
        this.LLJJI = charSequence;
        requestLayout();
    }

    public final void setSuffixText(CharSequence charSequence) {
        if (TextUtils.equals(this.LLJJIII, charSequence)) {
            return;
        }
        this.LLJJIII = charSequence;
        requestLayout();
    }

    public C431620GwC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = "";
        this.LLJJIII = "";
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int height;
        int paddingBottom;
        super.onMeasure(i, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLJJI);
        if (this.LLJJIII.length() > 0) {
            spannableStringBuilder.append((CharSequence) LLJJIJI);
            spannableStringBuilder.append(this.LLJJIII);
        }
        if (LJJJJI(spannableStringBuilder).getLineCount() <= getMaxLines()) {
            CharSequence charSequenceAppend = new SpannableStringBuilder(this.LLJJI).append((CharSequence) new SpannableStringBuilder(LLJJIJI).append(this.LLJJIII));
            setText(charSequenceAppend);
            height = LJJJJI(charSequenceAppend).getHeight() + getPaddingTop();
            paddingBottom = getPaddingBottom();
        } else {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(LLJJIJIIJIL).append(this.LLJJIII);
            CharSequence charSequence = this.LLJJI;
            CharSequence charSequenceSubSequence = charSequence.subSequence(0, LJJJJI(charSequence).getLineEnd(getMaxLines() - 1));
            CharSequence charSequenceAppend2 = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) spannableStringBuilderAppend);
            while (charSequenceSubSequence.length() > 0 && LJJJJI(charSequenceAppend2).getLineCount() > getMaxLines()) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                charSequenceAppend2 = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) spannableStringBuilderAppend);
            }
            setText(charSequenceAppend2);
            height = LJJJJI(charSequenceAppend2).getHeight() + getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        this.LLJJ = height + paddingBottom;
        setMeasuredDimension(getMeasuredWidth(), this.LLJJ);
    }
}
