package X;

import Y.AAListenerS139S0300000_17;
import Y.ARunnableS82S0200000_13;
import Y.AUListenerS224S0200000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ezc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110060ezc extends C1110070ezd {
    public static final String LLLLIILLL = "&";
    public CharSequence LLJLLL;
    public boolean LLJZ;
    public SpannableStringBuilder LLJZIJLIL;
    public SpannableStringBuilder LLL;
    public int LLLF;
    public int LLLFF;
    public Animator LLLFFI;
    public int LLLFZ;
    public Animator LLLI;
    public Function1<? super Boolean, Unit> LLLII;
    public Function0<Unit> LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public final int LLLIIL;
    public SpannableStringBuilder LLLIILIL;
    public SpannableStringBuilder LLLIL;
    public Layout LLLILZ;
    public CharSequence LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final long LLLJ;
    public boolean LLLJIL;
    public Function0<Unit> LLLJL;
    public Function0<Unit> LLLL;
    public boolean LLLLII;
    public final Paint LLLLIIIILLL;
    public int LLLLIIL;
    public float LLLLIILL;

    public final void LJJLIIIJLLLLLLLZ() {
        if (this.LLLF <= 0 || this.LLLJIL) {
            return;
        }
        setExpandableText(this.LLJLLL);
    }

    public final boolean getCanFoldFromOut() {
        Layout layout = this.LLLILZ;
        return layout != null && layout.getLineCount() > this.LLLIIIL;
    }

    public final int getCurrentHeight() {
        return this.LLLIZZ ? this.LLLFF : this.LLLFZ;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLF = 0;
    }

    public final Function0<Unit> getAnimEndCallback() {
        return this.LLLL;
    }

    public final Function0<Unit> getAnimStartCallback() {
        return this.LLLJL;
    }

    public final boolean getAutoExpand() {
        return this.LLLLII;
    }

    public final boolean getCanFold() {
        return this.LLLILZLLLI;
    }

    public final int getFoldedLines() {
        return this.LLLIIIIL;
    }

    public final Function0<Unit> getMeasureListener() {
        return this.LLLIIII;
    }

    public final CharSequence getOriginText() {
        return this.LLJLLL;
    }

    public final Function1<Boolean, Unit> getStateChangedListener() {
        return this.LLLII;
    }

    public final CharSequence getSuffix() {
        return this.LLLILZJ;
    }

    private final void setExpandableText(CharSequence charSequence) {
        boolean z;
        setOriginText(charSequence);
        int i = this.LLLIIIIL;
        if (this.LLLF <= 0) {
            return;
        }
        CharSequence charSequenceAppend = new SpannableStringBuilder(this.LLJLLL).append(this.LLLILZJ);
        Layout layoutLJJLIIIJLJLI = LJJLIIIJLJLI(charSequenceAppend);
        int lineCount = layoutLJJLIIIJLJLI.getLineCount();
        if (lineCount > i) {
            z = true;
        } else {
            z = false;
        }
        this.LLLILZLLLI = z;
        if (this.LLJZ) {
            this.LLLIZZ = z;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Layout layoutLJJLIIIJLJLI2 = LJJLIIIJLJLI(charSequence);
        this.LLLILZ = layoutLJJLIIIJLJLI2;
        if (this.LLLILZLLLI) {
            this.LLLLIILL = getPaddingTop() + layoutLJJLIIIJLJLI2.getLineTop(i);
            if (!TextUtils.isEmpty(this.LLJLLL)) {
                int i2 = this.LLLIIL;
                if (lineCount > i2) {
                    CharSequence charSequenceSubSequence = this.LLJLLL.subSequence(0, layoutLJJLIIIJLJLI2.getLineEnd(i2 - 1));
                    CharSequence charSequenceAppend2 = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.LLLIL);
                    while (LJJLIIIJLJLI(charSequenceAppend2).getLineCount() > this.LLLIIL) {
                        charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                        charSequenceAppend2 = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.LLLIL);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceAppend2);
                    this.LLJZIJLIL = spannableStringBuilder;
                    this.LLLFZ = LJJLIIIJLJLI(spannableStringBuilder).getHeight() + getPaddingTop() + getPaddingBottom();
                } else {
                    CharSequence charSequence2 = this.LLJLLL;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence2).append(this.LLLILZJ);
                    this.LLJZIJLIL = spannableStringBuilderAppend;
                    this.LLLFZ = LJJLIIIJLJLI(spannableStringBuilderAppend).getHeight() + getPaddingTop() + getPaddingBottom();
                }
            }
            LJJLIIIJJIZ(i, layoutLJJLIIIJLJLI2);
            if (this.LLLLII) {
                this.LLLLIIL = 0;
                layoutParams.height = this.LLLFZ;
                setText(this.LLJZIJLIL);
                this.LLLIZZ = false;
            } else if (this.LLLIZZ) {
                layoutParams.height = this.LLLFF;
                setText(this.LLL);
            } else {
                layoutParams.height = this.LLLFZ;
                setText(this.LLJZIJLIL);
            }
            HandlerHook.viewPost(this, new ARunnableS82S0200000_13(layoutParams, this, 17));
            return;
        }
        int height = layoutLJJLIIIJLJLI.getHeight() + getPaddingTop() + getPaddingBottom();
        this.LLLFZ = height;
        layoutParams.height = height;
        setText(charSequenceAppend);
    }

    public final Layout LJJLIIIJLJLI(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), this.LLLF);
            builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setTextDirection(textDirectionHeuristic);
            builderObtain.setUseLineSpacingFromFallbacks(isFallbackLineSpacing());
            return builderObtain.build();
        }
        return new StaticLayout(charSequence, getPaint(), this.LLLF, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    public final void LJJLIIJ(boolean z) {
        if (((!z && getLineCount() > this.LLLIIIIL) || this.LLLILZLLLI) && !this.LLLJIL) {
            this.LLLLII = false;
            this.LLJZ = false;
            boolean z2 = !this.LLLIZZ;
            this.LLLIZZ = z2;
            this.LLLII.invoke(Boolean.valueOf(z2));
            if (this.LLLIZZ) {
                Animator animator = this.LLLFFI;
                if (animator != null) {
                    animator.start();
                    return;
                }
                return;
            }
            Animator animator2 = this.LLLI;
            if (animator2 == null) {
                return;
            }
            animator2.start();
        }
    }

    @Override // X.C16F9, com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.LLLILZLLLI) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), this.LLLFZ, null);
            z = true;
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.LLLILZLLLI) {
            this.LLLLIIIILLL.setAlpha(this.LLLLIIL);
            canvas.drawRect(0.0f, this.LLLLIILL, getWidth(), this.LLLFZ, this.LLLLIIIILLL);
        }
        if (z) {
            canvas.restore();
        }
    }

    public final void setAnimEndCallback(Function0<Unit> function0) {
        this.LLLL = function0;
    }

    public final void setAnimStartCallback(Function0<Unit> function0) {
        this.LLLJL = function0;
    }

    public final void setAutoExpand(boolean z) {
        this.LLLLII = z;
    }

    public final void setFoldedLines(int i) {
        Layout layout;
        if (i == -1) {
            i = this.LLLIIIL;
        }
        if (i < this.LLLIIIIL && (layout = this.LLLILZ) != null) {
            int i2 = this.LLLFF;
            LJJLIIIJJIZ(i, layout);
            if (this.LLLIZZ) {
                LJJLIIIJL(i2, this.LLLFF, new AwS596S0100000_17(this, 679), new AwS561S0100000_17(this, 634), new AwS561S0100000_17(this, 635)).start();
            }
        }
        this.LLLIIIIL = i;
    }

    public final void setMaxFoldedLinesWithoutRefresh(int i) {
        this.LLLIIIL = i;
        setFoldedLines(i);
    }

    public final void setMeasureListener(Function0<Unit> function0) {
        this.LLLIIII = function0;
    }

    public final void setOriginText(CharSequence charSequence) {
        if (!Intrinsics.LJFF(this.LLJLLL, charSequence)) {
            this.LLJZ = true;
            this.LLLF = 0;
            this.LLLLII = false;
        }
        this.LLJLLL = charSequence;
        requestLayout();
    }

    public final void setStateChangedListener(Function1<? super Boolean, Unit> function1) {
        this.LLLII = function1;
    }

    public final void setSuffix(CharSequence charSequence) {
        this.LLLILZJ = charSequence;
        String str = LLLLIILLL;
        this.LLLIILIL = new SpannableStringBuilder(str).append(charSequence);
        this.LLLIL = new SpannableStringBuilder(str).append(this.LLLILZJ);
        requestLayout();
    }

    public C1110060ezc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJLLL = "";
        this.LLJZ = true;
        this.LLJZIJLIL = new SpannableStringBuilder("");
        this.LLL = new SpannableStringBuilder("");
        this.LLLII = AFwS231S0000000_3.get$arr$(263);
        this.LLLIIIIL = -1;
        this.LLLIILIL = new SpannableStringBuilder("");
        this.LLLIL = new SpannableStringBuilder("");
        this.LLLILZJ = "";
        this.LLLILZLLLI = true;
        this.LLLIZZ = true;
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLLLIIIILLL = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.ExpandableTextView_expandableText);
        setOriginText(strXd != null ? strXd : "");
        this.LLLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_expandDuration, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLLIIIL = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_foldLines, 2);
        this.LLLIIL = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableTextView_expandLines, 5);
        CharSequence charSequence = this.LLLILZJ;
        String str = LLLLIILLL;
        this.LLLIILIL = new SpannableStringBuilder(str).append(charSequence);
        this.LLLIL = new SpannableStringBuilder(str).append(this.LLLILZJ);
        setHighlightColor(Color.argb(0, 0, 0, 0));
        setFoldedLines(this.LLLIIIL);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LJJLIIIJJIZ(int i, Layout layout) {
        if (TextUtils.isEmpty(this.LLJLLL)) {
            return;
        }
        CharSequence charSequenceSubSequence = this.LLJLLL.subSequence(0, layout.getLineEnd(i - 1));
        CharSequence charSequenceAppend = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.LLLIILIL);
        while (LJJLIIIJLJLI(charSequenceAppend).getLineCount() > i) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
            charSequenceAppend = new SpannableStringBuilder(charSequenceSubSequence).append((CharSequence) this.LLLIILIL);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceAppend);
        this.LLL = spannableStringBuilder;
        int height = LJJLIIIJLJLI(spannableStringBuilder).getHeight() + getPaddingTop() + getPaddingBottom();
        this.LLLFF = height;
        this.LLLFFI = LJJLIIIJL(this.LLLFZ, height, new AwS596S0100000_17(this, 677), new AwS561S0100000_17(this, 630), new AwS561S0100000_17(this, 631));
        this.LLLI = LJJLIIIJL(this.LLLFF, this.LLLFZ, new AwS596S0100000_17(this, 678), new AwS561S0100000_17(this, 632), new AwS561S0100000_17(this, 633));
    }

    @Override // X.C16F9, com.bytedance.android.live.design.widget.SimpleLiveTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.LLLF;
        if ((i3 == 0 || i3 != getMeasuredWidth()) && !this.LLLJIL) {
            this.LLLF = getMeasuredWidth();
            Function0<Unit> function0 = this.LLLIIII;
            if (function0 != null) {
                function0.invoke();
            }
            setExpandableText(this.LLJLLL);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), getLayoutParams().height);
        }
    }

    public final ValueAnimator LJJLIIIJL(int i, int i2, Function1<? super ValueAnimator, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(this.LLLJ);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS224S0200000_17(this, function1, 4));
        valueAnimatorOfInt.addListener(new AAListenerS139S0300000_17(this, function0, function02, 0));
        return valueAnimatorOfInt;
    }
}
