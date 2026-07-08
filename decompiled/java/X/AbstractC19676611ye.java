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

/* JADX INFO: renamed from: X.11ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19676611ye extends C187I {
    public final C01GW LJIIJ;
    public boolean LJIIJJI;

    public abstract AnimatorListenerAdapter LJJIFFI();

    public static final String LJJI(long j) {
        if (j > 999) {
            return "999+ ";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append((char) 160);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AnimatorSet LJJII(TuxTextView tuxTextView) {
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 0.0f);
        ObjectAnimator objectAnimatorLJI = AnonymousClass1888.LJI(tuxTextView, 200L, 12);
        ObjectAnimator objectAnimatorLJFF = AnonymousClass1888.LJFF(tuxTextView, 200L, 12);
        tuxTextView.setPivotX(0.0f);
        tuxTextView.setPivotY(tuxTextView.getHeight() / 2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorLJI).with(objectAnimatorLJFF);
        animatorSet.addListener(LJJIFFI());
        return animatorSet;
    }

    public AbstractC19676611ye(int i, ViewGroup viewGroup) {
        super(viewGroup, i);
        this.LJIIJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(398));
    }

    public final void LJJIIJ(TuxTextView tuxTextView, TuxTextView tuxTextView2, boolean z) {
        try {
            int measuredWidth = tuxTextView.getMeasuredWidth();
            int iMeasureText = (int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
            if (z) {
                this.LJIIJJI = false;
            }
            if (!this.LJIIJJI && measuredWidth < iMeasureText) {
                float f = iMeasureText;
                ObjectAnimator objectAnimatorLIZLLL = AnonymousClass1888.LIZLLL(tuxTextView, -f, new AwS167S0101000_29(tuxTextView, iMeasureText, 12), new AwS573S0100000_29(tuxTextView, 970));
                ObjectAnimator objectAnimatorLIZLLL2 = AnonymousClass1888.LIZLLL(tuxTextView2, -(f + C418440Gaw.LIZIZ(4)), new AwS167S0101000_29(tuxTextView2, iMeasureText, 13), new AwS573S0100000_29(tuxTextView2, 971));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(50L);
                animatorSet.play(objectAnimatorLIZLLL).with(objectAnimatorLIZLLL2);
                animatorSet.start();
                this.LJIIJJI = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIII(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2, float f, float f2) {
        C19676211ya c19676211yaLIZ = C19676111yZ.LIZ(this.LIZLLL, f, tuxTextView, tuxTextView2, str, str2, f2);
        if (!Intrinsics.LJFF(str2, "")) {
            ValueAnimator valueAnimatorLIZJ = AnonymousClass1888.LIZJ(viewGroup, viewGroup.getWidth(), c19676211yaLIZ.LIZIZ, null, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676211yaLIZ, str, str2, 6), 8);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorLIZJ).before(LJJII(tuxTextView2));
            animatorSet.start();
            return;
        }
        ValueAnimator valueAnimatorLIZJ2 = AnonymousClass1888.LIZJ(viewGroup, viewGroup.getWidth(), c19676211yaLIZ.LIZIZ, new AwS10S2400000_29(viewGroup, tuxTextView, tuxTextView2, c19676211yaLIZ, str, str2, 7), null, 16);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorLIZJ2);
        ObjectAnimator objectAnimatorLJ = AnonymousClass1888.LJ(tuxTextView2, new AwS573S0100000_29(tuxTextView2, 969));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(objectAnimatorLJ);
        builderPlay.after(animatorSet3);
        animatorSet2.start();
    }

    public final void LJJ(ViewGroup viewGroup, AppCompatImageView appCompatImageView, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, String str, String str2, float f, float f2) {
        float fFloatValue;
        float fFloatValue2;
        C1210230hbB.LIZ(12, this.LIZLLL);
        C1210230hbB.LIZ(12, this.LIZLLL);
        Pair pairLIZJ = C19676111yZ.LIZJ(this.LIZLLL, f, tuxTextView, tuxTextView3, str, str2);
        if (((Boolean) pairLIZJ.getSecond()).booleanValue()) {
            C786410Ut5.LLILIL(appCompatImageView, 8);
            Pair pairLIZJ2 = C19676111yZ.LIZJ(this.LIZLLL, f + f2, tuxTextView, tuxTextView3, str, str2);
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
