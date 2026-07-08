package X;

import Y.ALAdapterS1S0110000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C430560GuU extends TuxTextView {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public boolean LLJJJJ;
    public ViewTreeObserverOnGlobalLayoutListenerC462870IDd LLJJJJJIL;
    public ViewTreeObserverOnPreDrawListenerC462850IDb LLJJJJLIIL;
    public CharSequence LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public CharSequence LLJLL;
    public Animator LLJLLIL;
    public SpannableString LLJLLL;
    public StaticLayout LLJZ;

    private final int getFoldLineCount() {
        return 6;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.LLJLLIL;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public final String getExpandAction() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getExpandActionColor() {
        return this.LLJLIL;
    }

    public final int getLimitedMaxLines() {
        return this.LLJL;
    }

    public final CharSequence getOriginalText() {
        return this.LLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(int r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C430560GuU.LJJJJL(int):void");
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setExpandAction(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
        int length = String.valueOf((char) 8230).length();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLL = spannableString;
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), length, this.LLJLLL.length(), 33);
        C786410Ut5.p2(this.LLJLLL, new AbstractC430520GuQ() { // from class: X.0GuR
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) throws Throwable {
                this.LL = false;
                C430560GuU c430560GuU = this.LLILLJJLI;
                if (!Intrinsics.LJFF(c430560GuU.LLJJL, c430560GuU.LLJLL)) {
                    int height = c430560GuU.getHeight();
                    c430560GuU.setMaxLines(c430560GuU.LLJL + 6);
                    c430560GuU.setText(c430560GuU.LLJJL);
                    C439870HMr.LIZJ(c430560GuU, null);
                    c430560GuU.measure(View.MeasureSpec.makeMeasureSpec(c430560GuU.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c430560GuU.getHeight(), 0));
                    int measuredHeight = c430560GuU.getMeasuredHeight();
                    Animator animator = c430560GuU.LLJLLIL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
                    if (jAbs > 300) {
                        jAbs = 300;
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
                    valueAnimatorOfInt.setInterpolator(new C12DM());
                    valueAnimatorOfInt.setDuration(jAbs);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(c430560GuU, 189));
                    valueAnimatorOfInt.addListener(new ALAdapterS1S0110000_6(c430560GuU, false, 8));
                    valueAnimatorOfInt.start();
                    c430560GuU.LLJLLIL = valueAnimatorOfInt;
                }
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
                textPaint.setColor(Color.argb((int) (Color.alpha(this.LLILLJJLI.getExpandActionColor()) * f), Color.red(this.LLILLJJLI.getExpandActionColor()), Color.green(this.LLILLJJLI.getExpandActionColor()), Color.blue(this.LLILLJJLI.getExpandActionColor())));
            }
        }, length, this.LLJLLL.length(), 33);
    }

    public final void setExpandActionColor(int i) {
        this.LLJLIL = i;
    }

    public final void setLimitedMaxLines(int i) {
        if (this.LLJL == i) {
            return;
        }
        this.LLJL = i;
        LJJJJL((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd());
    }

    public final void setOriginalText(CharSequence charSequence) {
        this.LLJJL = charSequence;
        setText(charSequence);
        setMaxLines(getFoldLineCount());
        setLimitedMaxLines(getFoldLineCount());
        if (this.LLJJJJ) {
            setMaxLines(this.LLJL);
            this.LLJJJJLIIL = new ViewTreeObserverOnPreDrawListenerC462850IDb(this, 0);
            C786410Ut5.y3(getViewTreeObserver(), this.LLJJJJLIIL);
            ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd = this.LLJJJJJIL;
            if (viewTreeObserverOnGlobalLayoutListenerC462870IDd != null) {
                C786410Ut5.C3(getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
            }
            this.LLJJJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 9);
            C786410Ut5.x3(getViewTreeObserver(), this.LLJJJJJIL);
            return;
        }
        LJJJJL(getWidth());
    }

    public C430560GuU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C430560GuU(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        this.LLJJJJ = true;
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = context.getResources().getString(2131825209);
        this.LLJL = 6;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJLIL = iIntValue;
        this.LLJLLL = new SpannableString("");
        setEllipsize(TextUtils.TruncateAt.END);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
    }

    public final StaticLayout LJJJJJ(int i, int i2, CharSequence charSequence) {
        if (i2 < 0) {
            i2 = 0;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i2).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }
}
