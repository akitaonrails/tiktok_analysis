package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS10S2400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19676711yf extends C187I {
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;

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
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextView, null, 14);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1888.LJFF(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        return animatorSet;
    }

    public AbstractC19676711yf(int i, ViewGroup viewGroup) {
        super(viewGroup, i);
        this.LJIIJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(396));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(395));
    }

    public final void LJJ(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, int i, int i2) {
        Pair pairLIZIZ = C19676111yZ.LIZIZ(this.LIZLLL, f, tuxTextView, tuxTextView2, str, str2);
        tuxTextView.LJJJJI(((Number) pairLIZIZ.getFirst()).floatValue());
        tuxTextView2.LJJJJI(((Number) pairLIZIZ.getFirst()).floatValue());
        tuxTextView.setText(str);
        tuxTextView2.setText(str2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        viewGroup.requestLayout();
    }

    public final void LJJII(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, int i, int i2, float f2) {
        C19676211ya c19676211yaLIZ = C19676111yZ.LIZ(this.LIZLLL, f, tuxTextView, tuxTextView2, str, str2, f2);
        if (!Intrinsics.LJFF(str2, "")) {
            ValueAnimator valueAnimatorLIZJ = AnonymousClass1888.LIZJ(viewGroup, viewGroup.getWidth(), c19676211yaLIZ.LIZIZ, null, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676211yaLIZ, str, str2, 4), 8);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorLIZJ).before(LJJIFFI(tuxTextView2));
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorLIZJ2 = AnonymousClass1888.LIZJ(viewGroup, viewGroup.getWidth(), c19676211yaLIZ.LIZIZ, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676211yaLIZ, str, str2, 5), null, 16);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorLIZJ2);
        ObjectAnimator objectAnimatorLJ = AnonymousClass1888.LJ(tuxTextView2, new AwS573S0100000_29(tuxTextView2, 968));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(objectAnimatorLJ);
        builderPlay.after(animatorSet3);
        animatorSet2.start();
    }
}
