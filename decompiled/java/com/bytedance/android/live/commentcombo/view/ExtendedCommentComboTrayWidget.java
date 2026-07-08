package com.bytedance.android.live.commentcombo.view;

import X.AbstractC1098790ehR;
import X.C0GY9;
import X.C1090040eTK;
import X.C1090090eTP;
import X.C1119920fFW;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendedCommentComboTrayWidget extends CommentComboTrayWidget {
    public Animator LLJJIJIL;
    public Animator LLJJJ;

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, X.InterfaceC1090070eTN
    public final void LJJLIIJ() {
        this.LLJI = null;
        y1();
        View view = getView();
        if (view != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            float[] fArr = {0.0f, view.getHeight() + ((int) C497740JfY.LIZIZ(8.0f))};
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), objectAnimatorOfFloat);
            animatorSet.addListener(new ALAdapterS13S0100000_17(this, 95));
            animatorSet.start();
            this.LLJJJ = animatorSet;
        }
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hya;
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget
    public final void y1() {
        Animator animator = this.LLJJIJIL;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        Animator animator2 = this.LLJJJ;
        if (animator2 != null && animator2.isRunning()) {
            animator2.cancel();
        }
        super.y1();
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, X.InterfaceC1090070eTN
    public final void LLZILL(C1090090eTP c1090090eTP) {
        this.LLJI = c1090090eTP;
        y1();
        C1(c1090090eTP.LIZ, c1090090eTP.LIZIZ, c1090090eTP.LIZJ, c1090090eTP.LIZLLL, c1090090eTP.LJIIIZ, c1090090eTP.LJIIJ, c1090090eTP.LJIIIIZZ, c1090090eTP.LJIIJJI);
        View view = getView();
        if (view != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 1.0f, 1.0f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, view.getHeight() + ((int) C497740JfY.LIZIZ(8.0f)), 0.0f), objectAnimatorOfFloat);
            animatorSet.addListener(new ALAdapterS13S0100000_17(this, 96));
            animatorSet.start();
            this.LLJJIJIL = animatorSet;
        }
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = true;
        super.onInit(objArr);
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        C1090040eTK.LLILLL = null;
        y1();
        hide();
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        C1090040eTK.LLILLL = this;
        C1090040eTK.LJ();
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget
    public final SpannableStringBuilder z1(CharSequence charSequence, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ)).append(charSequence);
        C1119920fFW.LJIIIZ(this.context, spannableStringBuilderAppend, 0, str.length(), 33, 6);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, this.context)), 0, str.length(), 33);
        C1119920fFW.LJIIIZ(this.context, spannableStringBuilderAppend, str.length(), spannableStringBuilderAppend.length(), 33, 6);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9i, this.context)), str.length(), spannableStringBuilderAppend.length(), 33);
        C786410Ut5.q2(spannableStringBuilderAppend, new AbstractC1098790ehR() { // from class: X.0eTS
            @Override // X.AbstractC431510Gw1
            public final void LIZ() {
                this.B1();
            }

            @Override // X.AbstractC1098790ehR
            public final void LIZIZ(View view) {
                this.B1();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 0, spannableStringBuilderAppend.length(), 33);
        x1(spannableStringBuilderAppend);
        return spannableStringBuilderAppend;
    }
}
