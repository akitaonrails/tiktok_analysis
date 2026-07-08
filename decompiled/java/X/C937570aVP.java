package X;

import Y.AAListenerS18S0100001_15;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS222S0200000_15;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS66S0101000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.GuideTimeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0aVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937570aVP {
    public final long LIZ;

    public C937570aVP() {
        long j = GuideTimeSetting.INSTANCE.getSettingValue().applyTime;
        this.LIZ = (j <= 0 || !C928030aG1.LIZ()) ? 9000L : j;
    }

    public final Animator LIZJ(View view) {
        ArrayList arrayList = new ArrayList();
        float alpha = view.getAlpha();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.5f).setDuration(400L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.5f).setDuration(400L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, alpha, 0.0f).setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        arrayList.add(animatorSet);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f).setDuration(400L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f).setDuration(400L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, alpha).setDuration(400L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration5, duration6);
        animatorSet2.setStartDelay(this.LIZ - 400);
        arrayList.add(animatorSet2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new AAListenerS18S0100001_15(view, alpha, 1));
        animatorSet3.playSequentially(arrayList);
        return animatorSet3;
    }

    public final Animator LIZIZ(final View view, final TextView textView) {
        ArrayList arrayList = new ArrayList();
        final C817403Hg c817403Hg = new C817403Hg();
        if (view != null) {
            float alpha = view.getAlpha();
            c817403Hg.element = alpha;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, alpha, 0.34f);
            objectAnimatorOfFloat.setDuration(500L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.34f, c817403Hg.element);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat2.setStartDelay((this.LIZ - 500) - 500);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            arrayList.add(animatorSet);
        }
        final C118300cf c118300cf = new C118300cf();
        if (textView != null) {
            c118300cf.element = textView.getCurrentTextColor();
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9m, textView.getContext());
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(c118300cf.element), Integer.valueOf(iLIZIZ));
            valueAnimatorOfObject.addUpdateListener(new AUListenerS222S0200000_15(textView, valueAnimatorOfObject, 7));
            valueAnimatorOfObject.setDuration(500L);
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(iLIZIZ), Integer.valueOf(c118300cf.element));
            valueAnimatorOfObject2.addUpdateListener(new AUListenerS222S0200000_15(textView, valueAnimatorOfObject2, 8));
            valueAnimatorOfObject2.setDuration(500L);
            valueAnimatorOfObject2.setStartDelay((this.LIZ - 500) - 500);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(valueAnimatorOfObject, valueAnimatorOfObject2);
            arrayList.add(animatorSet2);
        }
        if (arrayList.size() > 0) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.addListener(new Animator.AnimatorListener() { // from class: X.0aVQ
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, c817403Hg.element);
                    }
                    TextView textView2 = textView;
                    if (textView2 != null) {
                        textView2.setTextColor(c118300cf.element);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, c817403Hg.element);
                    }
                    TextView textView2 = textView;
                    if (textView2 != null) {
                        textView2.setTextColor(c118300cf.element);
                    }
                }
            });
            animatorSet3.playTogether(arrayList);
            return animatorSet3;
        }
        return null;
    }

    public final Animator LIZ(View view, View view2, final TextView textView, final boolean z, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        long j = 500;
        if (view != null) {
            ArrayList arrayList2 = new ArrayList();
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(500L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration, duration2, duration3);
            arrayList2.add(animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            j = 500;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f).setDuration(500L), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f).setDuration(500L), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(500L));
            animatorSet2.setStartDelay((this.LIZ - 500) - 500);
            arrayList2.add(animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(arrayList2);
            arrayList.add(animatorSet3);
        }
        if (view2 != null) {
            ArrayList arrayList3 = new ArrayList();
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f, 0.5f).setDuration(j);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.5f).setDuration(500L);
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(500L);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(duration4, duration5, duration6);
            arrayList3.add(animatorSet4);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f).setDuration(500L);
            ObjectAnimator duration8 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f).setDuration(500L);
            ObjectAnimator duration9 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 0.5f).setDuration(500L);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(duration7, duration8, duration9);
            animatorSet5.setStartDelay((this.LIZ - 500) - 500);
            arrayList3.add(animatorSet5);
            AnimatorSet animatorSet6 = new AnimatorSet();
            animatorSet6.addListener(new AAListenerS317S0100000_6(view2, 79));
            animatorSet6.playSequentially(arrayList3);
            arrayList.add(animatorSet6);
        }
        if (textView != null) {
            ArrayList arrayList4 = new ArrayList();
            final int currentTextColor = textView.getCurrentTextColor();
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c9i, textView.getContext());
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(currentTextColor), Integer.valueOf(iLIZIZ));
            valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(textView, 176));
            valueAnimatorOfObject.setDuration(500L);
            arrayList4.add(valueAnimatorOfObject);
            if (z) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
                valueAnimatorOfInt.setDuration(1L);
                valueAnimatorOfInt.setStartDelay((this.LIZ - 500) - 500);
                arrayList4.add(valueAnimatorOfInt);
            } else {
                ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(iLIZIZ), Integer.valueOf(currentTextColor));
                valueAnimatorOfObject2.addUpdateListener(new AUListenerS66S0101000_6(textView, currentTextColor, 3));
                valueAnimatorOfObject2.setDuration(500L);
                valueAnimatorOfObject2.setStartDelay((this.LIZ - 500) - 500);
                arrayList4.add(valueAnimatorOfObject2);
            }
            AnimatorSet animatorSet7 = new AnimatorSet();
            animatorSet7.addListener(new Animator.AnimatorListener() { // from class: X.0aVR
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    textView.setTextColor(currentTextColor);
                    if (z) {
                        C786410Ut5.LLIL(textView, 8);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C786410Ut5.LLIL(textView, 0);
                }
            });
            animatorSet7.playSequentially(arrayList4);
            arrayList.add(animatorSet7);
        }
        if (imageView != null) {
            Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.eji);
            imageView.setImageDrawable(drawableLJIIJ);
            ArrayList arrayList5 = new ArrayList();
            if (drawableLJIIJ instanceof LayerDrawable) {
                try {
                    Drawable drawable = ((LayerDrawable) drawableLJIIJ).getDrawable(0);
                    if (drawable != null && (drawable instanceof GradientDrawable)) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(C497740JfY.LIZIZ(10.0f), C497740JfY.LIZIZ(6.0f));
                        valueAnimatorOfFloat.setDuration(1000L);
                        valueAnimatorOfFloat.setRepeatMode(2);
                        valueAnimatorOfFloat.setRepeatCount(7);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(drawable, 23));
                        arrayList5.add(valueAnimatorOfFloat);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 0.0f, 0.15f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setRepeatCount(7);
            arrayList5.add(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 0.8f, 1.5f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setRepeatMode(2);
            objectAnimatorOfFloat2.setRepeatCount(7);
            arrayList5.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 0.8f, 1.5f);
            objectAnimatorOfFloat3.setDuration(1000L);
            objectAnimatorOfFloat3.setRepeatMode(2);
            objectAnimatorOfFloat3.setRepeatCount(7);
            arrayList5.add(objectAnimatorOfFloat3);
            AnimatorSet animatorSet8 = new AnimatorSet();
            animatorSet8.setStartDelay(500L);
            animatorSet8.playTogether(arrayList5);
            arrayList.add(animatorSet8);
        }
        if (arrayList.size() > 0) {
            AnimatorSet animatorSet9 = new AnimatorSet();
            animatorSet9.playTogether(arrayList);
            return animatorSet9;
        }
        return null;
    }
}
