package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS10S2400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19676911yh extends C187K {
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public abstract int LJJII();

    public final String LJJIIJ() {
        return (String) this.LJIIIZ.getValue();
    }

    public static final String LJJI(long j) {
        if (j > 999) {
            return "999+  ";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("  ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final AnimatorSet LJJIFFI(TuxTextView tuxTextView) {
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextView, null, 14);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1889.LJFF(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        return animatorSet;
    }

    public AbstractC19676911yh(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(349));
        this.LJIIJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(348));
    }

    public final AnimatorSet LJJIII(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(AnonymousClass1889.LIZ(viewGroup, LJJII(), null, 12));
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextView, null, 14);
        AtmosphereTag atmosphereTag = this.LJ;
        Animator animator = objectAnimatorLJI;
        if (atmosphereTag != null) {
            animator = objectAnimatorLJI;
            if (atmosphereTag.count > 0) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(objectAnimatorLJI).with(LJJIFFI(tuxTextView2));
                animator = animatorSet2;
            }
        }
        builderPlay.before(animator);
        return animatorSet;
    }

    public final void LJIL(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, int i, int i2) {
        Pair<Float, Float> pairLIZIZ = C19676311yb.LIZIZ(this.LIZJ, f, tuxTextView, tuxTextView2, str, str2, i, i2);
        tuxTextView.LJJJJI(pairLIZIZ.getFirst().floatValue());
        tuxTextView2.LJJJJI(pairLIZIZ.getFirst().floatValue());
        tuxTextView.setText(str);
        tuxTextView2.setText(str2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        viewGroup.requestLayout();
    }

    public final void LJJIIJZLJL(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, int i, int i2, float f2) {
        C19676411yc c19676411ycLIZ = C19676311yb.LIZ(this.LIZJ, f, tuxTextView, tuxTextView2, str, str2, i, i2, f2);
        if (!Intrinsics.LJFF(str2, "")) {
            ValueAnimator valueAnimatorLIZJ = AnonymousClass1889.LIZJ(viewGroup, viewGroup.getWidth(), c19676411ycLIZ.LIZIZ, null, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676411ycLIZ, str, str2, 0), 8);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorLIZJ).before(LJJIFFI(tuxTextView2));
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorLIZJ2 = AnonymousClass1889.LIZJ(viewGroup, viewGroup.getWidth(), c19676411ycLIZ.LIZIZ, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676411ycLIZ, str, str2, 1), null, 16);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorLIZJ2);
        ObjectAnimator objectAnimatorLJ = AnonymousClass1889.LJ(tuxTextView2, new AwS573S0100000_29(tuxTextView2, 888));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(objectAnimatorLJ);
        builderPlay.after(animatorSet3);
        animatorSet2.start();
    }
}
