package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19676811yg extends C187I {
    public final C01GW LJIIJ;

    public static final AnimatorSet LJJ(TuxTextView tuxTextView) {
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextView, null, 14);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1888.LJFF(tuxTextView, null, 14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        return animatorSet;
    }

    public AbstractC19676811yg(int i, ViewGroup viewGroup) {
        super(viewGroup, i);
        this.LJIIJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(397));
    }
}
