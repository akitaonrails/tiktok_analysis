package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427240nFC extends FrameLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public AnimatorSet LLILZLL;

    public final void setText(String str) {
        this.LL.setText(str);
        this.LLILLJJLI.setText(str);
    }

    public final void setTextColorAttr(int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, this.LL.getCurrentTextColor());
            this.LL.setTextColor(color);
            this.LLILLJJLI.setTextColor(color);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setTextSizeSp(float f) {
        this.LL.setTextSize(f);
        this.LLILLJJLI.setTextSize(f);
    }

    public final void setTuxFont(int i) {
        this.LL.setTuxFont(i);
        this.LLILLJJLI.setTuxFont(i);
    }

    public C1427240nFC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 4, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, 4, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 16;
        C786410Ut5.R6(tuxTextView2, layoutParams2);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.LLLLZLL(tuxTextView2, 4);
        this.LLILLJJLI = tuxTextView2;
        addView(tuxTextView);
        addView(tuxTextView2);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void LIZ(C1422970n8J c1422970n8J, Function1<? super String, Unit> function1) {
        int iIntValue;
        float textSize;
        String str = c1422970n8J.LIZJ;
        if (str == null) {
            str = "";
        }
        final String str2 = c1422970n8J.LIZLLL;
        boolean z = c1422970n8J.LJ;
        if (Intrinsics.LJFF(str, this.LLILLL) && Intrinsics.LJFF(str2, this.LLILZ) && z == this.LLILZIL) {
            return;
        }
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
        if (z && str2 != null && str2.length() != 0) {
            AnimatorSet animatorSet = this.LLILZLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLILZLL = null;
            this.LL.setText(str);
            C786410Ut5.B5(this.LL, 1.0f);
            C786410Ut5.wd(this.LL, 0.0f);
            Integer numValueOf = Integer.valueOf(getHeight());
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                Integer numValueOf2 = Integer.valueOf(this.LL.getMeasuredHeight());
                if (numValueOf2.intValue() > 0) {
                    iIntValue = numValueOf2.intValue();
                }
                textSize = this.LL.getTextSize();
                this.LLILLJJLI.setText(str2);
                C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
                C786410Ut5.B5(this.LLILLJJLI, 0.0f);
                C786410Ut5.wd(this.LLILLJJLI, textSize);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<TuxTextView, Float>) FrameLayout.TRANSLATION_Y, 0.0f, -textSize);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, (Property<TuxTextView, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxTextView, Float>) FrameLayout.TRANSLATION_Y, textSize, 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxTextView, Float>) FrameLayout.ALPHA, 0.0f, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(800L);
                animatorSet2.setInterpolator(C1619980sG4.LIZLLL());
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.0nFD
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        this.LL.LL.setText(str2);
                        C786410Ut5.B5(this.LL.LL, 1.0f);
                        C786410Ut5.wd(this.LL.LL, 0.0f);
                        C786410Ut5.LLLLZLL(this.LL.LLILLJJLI, 4);
                        C786410Ut5.B5(this.LL.LLILLJJLI, 0.0f);
                        C786410Ut5.wd(this.LL.LLILLJJLI, 0.0f);
                        this.LL.LLILZLL = null;
                    }
                });
                this.LLILZLL = animatorSet2;
                animatorSet2.start();
                return;
            }
            if (iIntValue > 0) {
                textSize = iIntValue;
            } else {
                textSize = this.LL.getTextSize();
            }
            this.LLILLJJLI.setText(str2);
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            C786410Ut5.B5(this.LLILLJJLI, 0.0f);
            C786410Ut5.wd(this.LLILLJJLI, textSize);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LL, (Property<TuxTextView, Float>) FrameLayout.TRANSLATION_Y, 0.0f, -textSize);
            ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(this.LL, (Property<TuxTextView, Float>) FrameLayout.ALPHA, 1.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat32 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxTextView, Float>) FrameLayout.TRANSLATION_Y, textSize, 0.0f);
            ObjectAnimator objectAnimatorOfFloat42 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<TuxTextView, Float>) FrameLayout.ALPHA, 0.0f, 1.0f);
            AnimatorSet animatorSet22 = new AnimatorSet();
            animatorSet22.setDuration(800L);
            animatorSet22.setInterpolator(C1619980sG4.LIZLLL());
            animatorSet22.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat22, objectAnimatorOfFloat32, objectAnimatorOfFloat42);
            animatorSet22.addListener(new AnimatorListenerAdapter() { // from class: X.0nFD
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LL.LL.setText(str2);
                    C786410Ut5.B5(this.LL.LL, 1.0f);
                    C786410Ut5.wd(this.LL.LL, 0.0f);
                    C786410Ut5.LLLLZLL(this.LL.LLILLJJLI, 4);
                    C786410Ut5.B5(this.LL.LLILLJJLI, 0.0f);
                    C786410Ut5.wd(this.LL.LLILLJJLI, 0.0f);
                    this.LL.LLILZLL = null;
                }
            });
            this.LLILZLL = animatorSet22;
            animatorSet22.start();
            return;
        }
        AnimatorSet animatorSet3 = this.LLILZLL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.LLILZLL = null;
        this.LL.setText(str);
        C786410Ut5.B5(this.LL, 1.0f);
        C786410Ut5.wd(this.LL, 0.0f);
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 4);
        C786410Ut5.B5(this.LLILLJJLI, 0.0f);
        C786410Ut5.wd(this.LLILLJJLI, 0.0f);
        function1.invoke(str);
    }
}
