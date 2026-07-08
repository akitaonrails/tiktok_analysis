package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS10S2400000_29;
import kotlin.jvm.internal.AwS167S0101000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19676511yd extends C187K {
    public final C01GW LJIIIZ;
    public boolean LJIIJ;

    public abstract AnimatorListenerAdapter LJJI();

    public static final String LJJ(long j) {
        if (j > 999) {
            return "999+ ";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append((char) 160);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AnimatorSet LJJIFFI(TuxTextView tuxTextView) {
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1889.LJI(tuxTextView, 200L, 12);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1889.LJFF(tuxTextView, 200L, 12);
        tuxTextView.setPivotX(0.0f);
        tuxTextView.setPivotY(tuxTextView.getHeight() / 2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        animatorSet.addListener(LJJI());
        return animatorSet;
    }

    public AbstractC19676511yd(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(351));
    }

    public final void LJJIII(TuxTextView tuxTextView, TuxTextView tuxTextView2, boolean z) {
        try {
            int measuredWidth = tuxTextView.getMeasuredWidth();
            int iMeasureText = (int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
            if (z) {
                this.LJIIJ = false;
            }
            if (!this.LJIIJ && measuredWidth < iMeasureText) {
                float f = iMeasureText;
                ObjectAnimator objectAnimatorLIZLLL = AnonymousClass1889.LIZLLL(tuxTextView, -f, new AwS167S0101000_29(tuxTextView, iMeasureText, 6), new AwS573S0100000_29(tuxTextView, 890));
                ObjectAnimator objectAnimatorLIZLLL2 = AnonymousClass1889.LIZLLL(tuxTextView2, -(f + C418440Gaw.LIZIZ(4)), new AwS167S0101000_29(tuxTextView2, iMeasureText, 7), new AwS573S0100000_29(tuxTextView2, 891));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(50L);
                animatorSet.play(objectAnimatorLIZLLL).with(objectAnimatorLIZLLL2);
                animatorSet.start();
                this.LJIIJ = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJII(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, float f2) {
        C19676411yc c19676411ycLIZ = C19676311yb.LIZ(this.LIZJ, f, tuxTextView, tuxTextView2, str, str2, 12, 9, f2);
        if (!Intrinsics.LJFF(str2, "")) {
            ValueAnimator valueAnimatorLIZJ = AnonymousClass1889.LIZJ(viewGroup, viewGroup.getWidth(), c19676411ycLIZ.LIZIZ, null, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676411ycLIZ, str, str2, 2), 8);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorLIZJ).before(LJJIFFI(tuxTextView2));
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorLIZJ2 = AnonymousClass1889.LIZJ(viewGroup, viewGroup.getWidth(), c19676411ycLIZ.LIZIZ, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676411ycLIZ, str, str2, 3), null, 16);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorLIZJ2);
        ObjectAnimator objectAnimatorLJ = AnonymousClass1889.LJ(tuxTextView2, new AwS573S0100000_29(tuxTextView2, 889));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(objectAnimatorLJ);
        builderPlay.after(animatorSet3);
        animatorSet2.start();
    }

    public final void LJIL(ViewGroup viewGroup, AppCompatImageView appCompatImageView, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, String str, String str2, float f, float f2) {
        float fFloatValue;
        float fFloatValue2;
        C1210230hbB.LIZ(12, this.LIZJ);
        C1210230hbB.LIZ(12, this.LIZJ);
        Pair pairLIZJ = C19676311yb.LIZJ(this.LIZJ, f, tuxTextView, tuxTextView3, str, str2);
        if (((Boolean) pairLIZJ.getSecond()).booleanValue()) {
            C786410Ut5.LLILIL(appCompatImageView, 8);
            Pair pairLIZJ2 = C19676311yb.LIZJ(this.LIZJ, f + f2, tuxTextView, tuxTextView3, str, str2);
            fFloatValue = ((Number) pairLIZJ2.getFirst()).floatValue();
            fFloatValue2 = ((Number) pairLIZJ2.getFirst()).floatValue();
        } else {
            C786410Ut5.LLILIL(appCompatImageView, 0);
            fFloatValue = ((Number) pairLIZJ.getFirst()).floatValue();
            fFloatValue2 = ((Number) pairLIZJ.getFirst()).floatValue();
        }
        tuxTextView.LJJJJI(fFloatValue);
        tuxTextView2.LJJJJI(fFloatValue);
        tuxTextView3.LJJJJI(fFloatValue2);
        tuxTextView.setText(str);
        tuxTextView2.setText(tuxTextView.getText());
        tuxTextView3.setText(str2);
        viewGroup.requestLayout();
    }
}
