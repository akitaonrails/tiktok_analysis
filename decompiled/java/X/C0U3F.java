package X;

import Y.AAListenerS264S0200000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U3F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3F {
    public final FrameLayout LIZ;
    public final KaraokeViewModel LIZIZ;
    public final ImageView LIZJ;
    public final ImageView LIZLLL;
    public Animator LJ;
    public Animator LJFF;
    public Animator LJI;
    public Animator LJII;

    public static void LIZIZ(View view) {
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.T4(view, 1.0f);
    }

    public C0U3F(FrameLayout frameLayout, Fragment fragment, KaraokeViewModel karaokeViewModel) {
        this.LIZ = frameLayout;
        this.LIZIZ = karaokeViewModel;
        ImageView imageView = new ImageView(frameLayout.getContext());
        C786410Ut5.c6(imageView, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(48.0f), (int) C497740JfY.LIZIZ(48.0f)));
        this.LIZJ = imageView;
        ImageView imageView2 = new ImageView(frameLayout.getContext());
        C786410Ut5.c6(imageView2, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(48.0f), (int) C497740JfY.LIZIZ(48.0f)));
        this.LIZLLL = imageView2;
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        C500260Jjc.LJIILIIL(imageView);
        C500260Jjc.LJIILIIL(imageView2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C764790TzJ(this, null), 3);
    }

    public static Animator LIZ(View view, Function0 function0, Function0 function02) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.3f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.8f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.8f));
        animatorSet.addListener(new AAListenerS264S0200000_12(function0, function02, 2));
        return animatorSet;
    }

    public final Animator LIZJ(final View view, final View view2, final View view3, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        Pair pair;
        if (Intrinsics.LJFF(view.getTag(), Long.valueOf(j))) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                i2 = rect.left;
                i = rect.top;
            } else {
                i = 0;
                i2 = 0;
            }
            Pair pair2 = new Pair(Float.valueOf(i2), Float.valueOf(i));
            Rect rect2 = new Rect();
            if (view3.getGlobalVisibleRect(rect2)) {
                i4 = rect2.left;
                i3 = rect2.top;
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (i4 == 0 && i3 == 0) {
                pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else {
                pair = new Pair(Float.valueOf((i4 + (view3.getWidth() / 2)) - (view.getWidth() / 2)), Float.valueOf((i3 + (view3.getHeight() / 2)) - (view.getHeight() / 2)));
            }
            if ((((Number) pair2.getFirst()).floatValue() != 0.0f || ((Number) pair2.getSecond()).floatValue() != 0.0f) && (((Number) pair.getFirst()).floatValue() != 0.0f || ((Number) pair.getSecond()).floatValue() != 0.0f)) {
                C500260Jjc.LLFFF(view2);
                C786410Ut5.T4(view2, 0.3f);
                C786410Ut5.Ob(view2, 0.8f);
                C786410Ut5.pc(view2, 0.8f);
                Path path = new Path();
                path.moveTo(((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue());
                path.quadTo(((Number) pair.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue(), ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(550L);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.3f, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.X, (Property<View, Float>) View.Y, path));
                AnimatorSet animatorSet2 = new AnimatorSet();
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setDuration(350L);
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.3f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.8f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.8f, 1.0f));
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(200L);
                animatorSet4.setStartDelay(350L);
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 1.0f, 1.2f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.2f));
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.setDuration(350L);
                animatorSet5.setStartDelay(550L);
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 0.8f, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.8f, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_X, 1.2f, 1.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, 1.2f, 1.0f));
                animatorSet2.playTogether(animatorSet3, animatorSet4, animatorSet, animatorSet5);
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0U3G
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        C0U3F c0u3f = this;
                        View view4 = view;
                        c0u3f.getClass();
                        C0U3F.LIZIZ(view4);
                        C0U3F c0u3f2 = this;
                        View view5 = view3;
                        c0u3f2.getClass();
                        C0U3F.LIZIZ(view5);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C500260Jjc.LJIILIIL(view2);
                    }
                });
                animatorSet2.start();
                return animatorSet2;
            }
        }
        LIZIZ(view);
        return null;
    }
}
