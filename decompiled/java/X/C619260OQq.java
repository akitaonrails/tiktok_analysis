package X;

import Y.ACListenerS144S0100000_9;
import Y.AUListenerS259S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0OQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619260OQq extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final GradientDrawable LLILLL;
    public final GradientDrawable LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public BulletinEmojiItem LLIZ;
    public BulletinCommonAbility LLIZLLLIL;
    public BulletinInteractionAbility LLJ;
    public BulletinEmojiAbility LLJI;
    public BulletinEmojiAnimationAbility LLJIJIL;
    public String LLJILJIL;
    public long LLJILJILJ;
    public Boolean LLJILLL;
    public String LLJJ;

    public C619260OQq(Context context) {
        int iIntValue;
        super(context);
        this.LLJILJILJ = -1L;
        setOrientation(0);
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.gzm);
        tuxTextView.setTuxFont(72);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setId(R.id.gzn);
        tuxTextView2.setTuxFont(72);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setSingleLine(true);
        tuxTextView2.setTextColorRes(R.attr.a1h);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.R6(tuxTextView2, layoutParams2);
        this.LLILLJJLI = tuxTextView2;
        addView(tuxTextView);
        addView(tuxTextView2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZIL = iIntValue;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        GradientDrawable gradientDrawable = (GradientDrawable) c384050F3z.LIZ(context);
        this.LLILZ = gradientDrawable;
        gradientDrawable.setAlpha(0);
        setBackground(gradientDrawable);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z2.LJ = Integer.valueOf(this.LLILZIL);
        GradientDrawable gradientDrawable2 = (GradientDrawable) c384050F3z2.LIZ(context);
        this.LLILLL = gradientDrawable2;
        setForeground(gradientDrawable2);
        View.OnClickListener aCListenerS144S0100000_9 = new ACListenerS144S0100000_9(this, 107);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS144S0100000_9) : aCListenerS144S0100000_9);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setOnLongClickListener(new C0P4F(this, context, 0));
    }

    public final void LIZ(BulletinEmojiItem bulletinEmojiItem, BulletinCommonAbility bulletinCommonAbility, BulletinInteractionAbility bulletinInteractionAbility, BulletinEmojiAbility bulletinEmojiAbility, BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility) {
        this.LLIZLLLIL = bulletinCommonAbility;
        this.LLJ = bulletinInteractionAbility;
        this.LLJI = bulletinEmojiAbility;
        this.LLJIJIL = bulletinEmojiAnimationAbility;
        this.LLIZ = bulletinEmojiItem;
        if (!bulletinEmojiItem.LLILLL && Intrinsics.LJFF(this.LLJILJIL, bulletinEmojiItem.emoji) && this.LLJILJILJ == bulletinEmojiItem.count && Intrinsics.LJFF(this.LLJILLL, Boolean.valueOf(bulletinEmojiItem.isReaction)) && Intrinsics.LJFF(this.LLJJ, bulletinEmojiItem.LL)) {
            return;
        }
        this.LLJILJIL = bulletinEmojiItem.emoji;
        this.LLJILJILJ = bulletinEmojiItem.count;
        this.LLJILLL = Boolean.valueOf(bulletinEmojiItem.isReaction);
        this.LLJJ = bulletinEmojiItem.LL;
        this.LL.setText(bulletinEmojiItem.emoji);
        TuxTextView tuxTextView = this.LLILLJJLI;
        String strLIZ = bulletinEmojiItem.LLILZ;
        if (strLIZ.length() == 0) {
            strLIZ = C498380Jga.LIZ.LIZ(bulletinEmojiItem.count);
        }
        tuxTextView.setText(strLIZ);
        if (bulletinEmojiItem.isReaction) {
            if (bulletinEmojiItem.LLILLL) {
                bulletinEmojiItem.LLILLL = false;
                GradientDrawable gradientDrawable = this.LLILZ;
                if (gradientDrawable != null) {
                    gradientDrawable.setAlpha(0);
                }
                final String str = bulletinEmojiItem.emoji;
                final int iAlpha = Color.alpha(this.LLILZIL);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                valueAnimatorOfInt.setDuration(150L);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJI());
                valueAnimatorOfInt.addUpdateListener(new AUListenerS259S0100000_9(this, 4));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0OQv
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        GradientDrawable gradientDrawable2 = this.LL.LLILLL;
                        if (gradientDrawable2 != null) {
                            gradientDrawable2.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(this.LL.LLILZIL, (int) (iAlpha * (1 - fFloatValue))));
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
                animatorSet.setDuration(200L);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0OQw
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C619260OQq c619260OQq = this.LL;
                        BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility2 = c619260OQq.LLJIJIL;
                        if (bulletinEmojiAnimationAbility2 != null) {
                            bulletinEmojiAnimationAbility2.DE2(str, c619260OQq.LL, c619260OQq, null);
                        }
                    }
                });
                animatorSet.start();
            } else {
                GradientDrawable gradientDrawable2 = this.LLILZ;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setAlpha(255);
                }
            }
            GradientDrawable gradientDrawable3 = this.LLILLL;
            if (gradientDrawable3 != null) {
                gradientDrawable3.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(this.LLILZIL, 0));
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable4 = this.LLILZ;
        if (gradientDrawable4 != null) {
            gradientDrawable4.setAlpha(0);
        }
        int iAlpha2 = Color.alpha(this.LLILZIL);
        GradientDrawable gradientDrawable5 = this.LLILLL;
        if (gradientDrawable5 == null) {
            return;
        }
        gradientDrawable5.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(this.LLILZIL, iAlpha2));
    }
}
