package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19677111yj extends C187K {
    public final C01GW LJIIIZ;

    public abstract int LJJIFFI();

    public static final AnimatorSet LJJI(TuxTextView tuxTextView) {
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextView, null, 14);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1889.LJFF(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        return animatorSet;
    }

    public AbstractC19677111yj(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(350));
    }

    public final AnimatorSet LJJ(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        C786410Ut5.LJLZ(0, viewGroup);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(LJJI(tuxTextView2)).after(AnonymousClass1889.LIZ(viewGroup, LJJIFFI(), null, 12));
        return animatorSet;
    }

    public final void LJIL(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, int i, int i2) {
        Pair<Float, Float> pairLIZIZ = C19676311yb.LIZIZ(this.LIZJ, f, tuxTextView2, tuxTextView, str, str2, i, i2);
        tuxTextView2.LJJJJI(pairLIZIZ.getFirst().floatValue());
        tuxTextView.LJJJJI(pairLIZIZ.getFirst().floatValue());
        tuxTextView2.setText(str);
        tuxTextView.setText(str2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        viewGroup.requestLayout();
    }
}
