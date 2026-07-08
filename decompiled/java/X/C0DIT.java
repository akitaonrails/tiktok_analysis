package X;

import Y.ACListenerS108S0200000_4;
import Y.ALAdapterS1S0100000_4;
import Y.AUListenerS254S0100000_4;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DIT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIT extends RecyclerView.ViewHolder {
    public final Function1<String, Boolean> LL;
    public final Function1<String, Boolean> LLILLJJLI;
    public final ImageView LLILLL;
    public final View LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final C1203340hQ4 LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;
    public ViewTreeObserverOnPreDrawListenerC346400Di2 LLJI;
    public String LLJIJIL;
    public ValueAnimator LLJILJIL;
    public C0D4T LLJILJILJ;

    public final void N5() {
        ViewTreeObserverOnPreDrawListenerC346400Di2 viewTreeObserverOnPreDrawListenerC346400Di2 = this.LLJI;
        if (viewTreeObserverOnPreDrawListenerC346400Di2 != null && this.LLJ.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(this.LLJ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC346400Di2);
        }
        this.LLJI = null;
    }

    public final void R5() {
        ViewGroup.LayoutParams layoutParams = this.LLJ.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.g6(this.LLJ, layoutParams);
        }
    }

    public static SpannableStringBuilder L5(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(charSequence).append(charSequence2).append((CharSequence) "...See more");
        C786410Ut5.q2(spannableStringBuilderAppend, new StyleSpan(1), spannableStringBuilderAppend.length() - 11, spannableStringBuilderAppend.length(), 33);
        return spannableStringBuilderAppend;
    }

    public final void I5(C0D4T c0d4t, int i) {
        String str = c0d4t.content;
        TextPaint paint = this.LLJ.getPaint();
        StaticLayout staticLayoutP5 = P5(i, paint, str);
        staticLayoutP5.getLineCount();
        if (staticLayoutP5.getLineCount() <= 4) {
            this.LLJ.setText(str);
            C786410Ut5.T7(this.LLJ, null);
            return;
        }
        CharSequence charSequenceSubSequence = str.subSequence(0, staticLayoutP5.getLineEnd(2));
        CharSequence charSequenceSubSequence2 = str.subSequence(staticLayoutP5.getLineStart(3), staticLayoutP5.getLineEnd(3));
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
        float fMeasureText = i - (textPaint.measureText("...See more") + 5.0f);
        if (fMeasureText < 0.0f) {
            fMeasureText = 0.0f;
        }
        String string = a0.LJLILLLLZI(a0.LJJJLL("...", a0.LJJJLL("…", TextUtils.ellipsize(charSequenceSubSequence2, paint, fMeasureText, TextUtils.TruncateAt.END).toString()))).toString();
        CharSequence charSequenceL5 = L5(charSequenceSubSequence, string);
        StaticLayout staticLayoutP52 = P5(i, paint, charSequenceL5);
        while (staticLayoutP52.getLineCount() > 4 && string.length() > 0) {
            string = a0.LJLILLLLZI(C13LN.LJLL(Character.charCount(string.codePointBefore(string.length())), string)).toString();
            charSequenceL5 = L5(charSequenceSubSequence, string);
            staticLayoutP52 = P5(i, paint, charSequenceL5);
        }
        this.LLJ.setText(charSequenceL5);
        C786410Ut5.T7(this.LLJ, new ACListenerS108S0200000_4(c0d4t, this, 20));
    }

    public final void S5(int i, int i2) {
        if (i == i2) {
            R5();
            return;
        }
        long jAbs = ((long) Math.abs(i2 - i)) * 2;
        if (jAbs > 300) {
            jAbs = 300;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new C12DM());
        valueAnimatorOfInt.setDuration(jAbs);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(this, 12));
        valueAnimatorOfInt.addListener(new ALAdapterS1S0100000_4(this, 0));
        valueAnimatorOfInt.start();
        this.LLJILJIL = valueAnimatorOfInt;
    }

    public C0DIT(View view, C331510Cz7 c331510Cz7, C331500Cz6 c331500Cz6) {
        super(view);
        this.LL = c331510Cz7;
        this.LLILLJJLI = c331500Cz6;
        this.LLILLL = (ImageView) view.findViewById(R.id.l7a);
        this.LLILZ = view.findViewById(R.id.i26);
        this.LLILZIL = (TextView) view.findViewById(R.id.z67);
        this.LLILZLL = view.findViewById(R.id.m7h);
        this.LLIZ = (C1203340hQ4) view.findViewById(R.id.ssp);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.z66);
        this.LLJ = (TextView) view.findViewById(R.id.z64);
    }

    public final StaticLayout P5(int i, TextPaint textPaint, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.LLJ.getLineSpacingExtra(), this.LLJ.getLineSpacingMultiplier()).setIncludePad(this.LLJ.getIncludeFontPadding()).setBreakStrategy(this.LLJ.getBreakStrategy()).setHyphenationFrequency(this.LLJ.getHyphenationFrequency()).build();
    }

    public final void T5(C0D4T c0d4t, boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJILJIL = null;
        N5();
        R5();
        if (z) {
            int height = this.LLJ.getHeight();
            if (height > 0 && z2 && this.LLJ.getWidth() > 0) {
                ViewGroup.LayoutParams layoutParams = this.LLJ.getLayoutParams();
                if (layoutParams.height != height) {
                    layoutParams.height = height;
                    C786410Ut5.g6(this.LLJ, layoutParams);
                }
                this.LLJ.setMaxLines(Integer.MAX_VALUE);
                C786410Ut5.T7(this.LLJ, null);
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(c0d4t.content).append((CharSequence) " See less");
                C786410Ut5.q2(spannableStringBuilderAppend, new StyleSpan(1), spannableStringBuilderAppend.length() - 9, spannableStringBuilderAppend.length(), 33);
                this.LLJ.setText(spannableStringBuilderAppend);
                TextView textView = this.LLJ;
                textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.LLJ.getMeasuredHeight();
                C786410Ut5.T7(this.LLJ, new ACListenerS108S0200000_4(c0d4t, this, 20));
                S5(height, measuredHeight);
                return;
            }
            this.LLJ.setMaxLines(Integer.MAX_VALUE);
            C786410Ut5.T7(this.LLJ, null);
            SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder(c0d4t.content).append((CharSequence) " See less");
            C786410Ut5.q2(spannableStringBuilderAppend2, new StyleSpan(1), spannableStringBuilderAppend2.length() - 9, spannableStringBuilderAppend2.length(), 33);
            this.LLJ.setText(spannableStringBuilderAppend2);
            C786410Ut5.T7(this.LLJ, new ACListenerS108S0200000_4(c0d4t, this, 20));
            return;
        }
        int height2 = this.LLJ.getHeight();
        if (height2 > 0 && z2 && this.LLJ.getWidth() > 0) {
            ViewGroup.LayoutParams layoutParams2 = this.LLJ.getLayoutParams();
            if (layoutParams2.height != height2) {
                layoutParams2.height = height2;
                C786410Ut5.g6(this.LLJ, layoutParams2);
            }
            C786410Ut5.T7(this.LLJ, null);
            this.LLJ.setMaxLines(4);
            int width = (this.LLJ.getWidth() - this.LLJ.getPaddingLeft()) - this.LLJ.getPaddingRight();
            if (width <= 0) {
                this.LLJI = new ViewTreeObserverOnPreDrawListenerC346400Di2(this, c0d4t, 1);
                C786410Ut5.y3(this.LLJ.getViewTreeObserver(), this.LLJI);
                return;
            } else {
                I5(c0d4t, width);
                TextView textView2 = this.LLJ;
                textView2.measure(View.MeasureSpec.makeMeasureSpec(textView2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                S5(height2, this.LLJ.getMeasuredHeight());
                return;
            }
        }
        C786410Ut5.T7(this.LLJ, null);
        this.LLJ.setMaxLines(4);
        int width2 = (this.LLJ.getWidth() - this.LLJ.getPaddingLeft()) - this.LLJ.getPaddingRight();
        if (width2 > 0) {
            I5(c0d4t, width2);
        } else {
            this.LLJI = new ViewTreeObserverOnPreDrawListenerC346400Di2(this, c0d4t, 1);
            C786410Ut5.y3(this.LLJ.getViewTreeObserver(), this.LLJI);
        }
    }
}
