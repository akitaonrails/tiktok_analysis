package X;

import Y.AAListenerS322S0100000_11;
import Y.AAListenerS87S0400000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Sp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732920Sp0 extends C09AY implements Function2<VideoCommentAssem, C291001Au<? extends String>, Unit> {
    public C732920Sp0() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, C291001Au<? extends String> c291001Au) {
        String strLIZ;
        C732910Soz c732910Soz;
        AnimatorSet animatorSet;
        VideoCommentAssem videoCommentAssem2 = videoCommentAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (strLIZ = c291001Au2.LIZ()) != null && (c732910Soz = videoCommentAssem2.LLLILZJ) != null && ((Keva) c732910Soz.LJFF.getValue()).getInt(C732910Soz.LIZ(), 0) < 3 && strLIZ.length() > 0) {
            TuxTextView tuxTextView = videoCommentAssem2.LLLIIIL;
            TuxTextView tuxTextView2 = null;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            TuxTextView tuxTextView3 = videoCommentAssem2.LLLIIIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setText(strLIZ);
            C732910Soz c732910Soz2 = videoCommentAssem2.LLLILZJ;
            if (c732910Soz2 != null) {
                View view = videoCommentAssem2.LLLIIL;
                if (view == null) {
                    view = null;
                }
                TuxTextView tuxTextView4 = videoCommentAssem2.LLLIIIL;
                if (tuxTextView4 != null) {
                    tuxTextView2 = tuxTextView4;
                }
                AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(videoCommentAssem2, 1386);
                AnimatorSet animatorSet2 = c732910Soz2.LIZ;
                if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = c732910Soz2.LIZ) != null) {
                    animatorSet.cancel();
                }
                C732910Soz.LIZIZ(view, tuxTextView2);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_X, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_Y, 1.0f);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet3.setInterpolator((TimeInterpolator) c732910Soz2.LJ.getValue());
                animatorSet3.setDuration(496L);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_X, 0.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(tuxTextView2, (Property<TuxTextView, Float>) View.SCALE_Y, 0.0f);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8);
                animatorSet4.setInterpolator((TimeInterpolator) c732910Soz2.LJ.getValue());
                animatorSet4.setDuration(496L);
                animatorSet4.setStartDelay(2000L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playSequentially(animatorSet3, animatorSet4);
                animatorSet5.addListener(new AAListenerS322S0100000_11(c732910Soz2, 20));
                animatorSet5.addListener(new AAListenerS87S0400000_11(c732910Soz2, view, tuxTextView2, awS555S0100000_11, 0));
                animatorSet5.addListener(new AAListenerS322S0100000_11(awS555S0100000_11, 19));
                c732910Soz2.LIZ = animatorSet5;
                animatorSet5.start();
            }
        }
        return Unit.LIZ;
    }
}
