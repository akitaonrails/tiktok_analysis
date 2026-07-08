package X;

import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS78S0100100_33;

/* JADX INFO: renamed from: X.1AB1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AB1 extends C09AY implements Function1<C1ABF, Unit> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AB1(LabelContainerWidget labelContainerWidget) {
        super(1);
        this.LL = labelContainerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1ABF c1abf) {
        long j;
        Number numberValueOf;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        C1ABF c1abf2 = c1abf;
        C1ACA c1acaZ1 = this.LL.z1();
        if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null) {
            j = liveRoomStruct2.allowPreviewTime;
        } else {
            j = -1;
        }
        if (j >= 0 || c1abf2.LIZ) {
            int i = 2131856631;
            C1ABV c1abv = null;
            if (c1abf2.LIZ) {
                LivePreviewPlayerVM livePreviewPlayerVMS1 = this.LL.S1();
                if (livePreviewPlayerVMS1 != null) {
                    livePreviewPlayerVMS1.LLJJJJLIIL = C1ABV.SHOW;
                }
                C1AB2 c1ab2 = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1ab2 != null) {
                    c1ab2.cancel();
                }
                final LabelContainerWidget labelContainerWidget = this.LL;
                final long j2 = c1abf2.LIZIZ;
                if (!labelContainerWidget.h2()) {
                    i = 2131844248;
                }
                final String strLJIJI = C497740JfY.LJIJI(i);
                int width = labelContainerWidget.R1().getWidth();
                TextPaint paint = labelContainerWidget.R1().getPaint();
                if (paint != null) {
                    numberValueOf = Float.valueOf(paint.measureText(strLJIJI));
                } else {
                    numberValueOf = 0L;
                }
                final String strB2 = LabelContainerWidget.b2(j2);
                labelContainerWidget.R1().setText(strLJIJI);
                labelContainerWidget.g2(3, strB2, null);
                C1ACA c1acaZ12 = labelContainerWidget.z1();
                if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
                    liveRoomStruct.videoFeedTag = strLJIJI;
                }
                C2268791DrB c2268791DrB = new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator duration = ObjectAnimator.ofFloat(labelContainerWidget.LLJILJILJ.getValue(), (Property<Object, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L);
                duration.setInterpolator(c2268791DrB);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(labelContainerWidget.R1(), (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(labelContainerWidget.R1(), (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(100L);
                duration3.addListener(new AnimatorListenerAdapter() { // from class: X.0bzD
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        labelContainerWidget.R1().setText(strLJIJI);
                    }
                });
                animatorSet2.playSequentially(duration2, duration3);
                ValueAnimator duration4 = ValueAnimator.ofInt(width, numberValueOf.intValue()).setDuration(200L);
                duration4.setInterpolator(c2268791DrB);
                duration4.addUpdateListener(new AUListenerS265S0100000_16(labelContainerWidget, 29));
                animatorSet.playTogether(duration, animatorSet2, duration4);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.1AB6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ViewGroup.LayoutParams layoutParams = labelContainerWidget.R1().getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = -2;
                        }
                        LivePreviewPlayerVM livePreviewPlayerVMS12 = labelContainerWidget.S1();
                        if (livePreviewPlayerVMS12 != null) {
                            livePreviewPlayerVMS12.wQ2(new AwS78S0100100_33(j2, labelContainerWidget, 2), false);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        labelContainerWidget.a2().setText(strB2);
                    }
                });
                animatorSet.start();
            } else {
                LivePreviewPlayerVM livePreviewPlayerVMS12 = this.LL.S1();
                if (livePreviewPlayerVMS12 != null) {
                    c1abv = livePreviewPlayerVMS12.LLJJJJLIIL;
                }
                if (c1abv == C1ABV.SHOW) {
                    C1ACA c1acaZ13 = this.LL.z1();
                    LabelContainerWidget labelContainerWidget2 = this.LL;
                    C0K9P.LIZIZ(c1acaZ13, labelContainerWidget2.LLJL, labelContainerWidget2.dataChannel);
                }
                if (j <= 0 || c1abf2.LIZIZ < 0) {
                    LivePreviewPlayerVM livePreviewPlayerVMS13 = this.LL.S1();
                    if (livePreviewPlayerVMS13 != null) {
                        livePreviewPlayerVMS13.LLJJJJLIIL = C1ABV.STOP;
                    }
                    C1AB2 c1ab22 = this.LL.LLJJLIIIJLLLLLLLZ;
                    if (c1ab22 != null) {
                        c1ab22.cancel();
                    }
                }
                if (!this.LL.h2()) {
                    i = 2131844248;
                }
                this.LL.R1().setText(C497740JfY.LJIJI(i));
            }
        }
        return Unit.LIZ;
    }
}
