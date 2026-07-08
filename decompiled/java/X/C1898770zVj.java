package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS134S0101000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898770zVj extends C1898700zVc {
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public int LLLLLIL;

    private final C1322110kVd getRewardImg() {
        return (C1322110kVd) this.LLLLJI.getValue();
    }

    public final TuxTextView getRewardText() {
        return (TuxTextView) this.LLLLL.getValue();
    }

    public final LinearLayout getRewardView() {
        return (LinearLayout) this.LLLLJ.getValue();
    }

    public final C1322110kVd getTimerView() {
        return (C1322110kVd) this.LLLLILI.getValue();
    }

    @Override // X.C1898700zVc
    public int getCloseViewLocation() {
        return this.LLLLLIL;
    }

    public C1898770zVj(Context context) {
        int i;
        super(context, null, 0);
        this.LLLLILI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 47));
        this.LLLLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 46));
        this.LLLLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 44));
        this.LLLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 45));
        if (((Boolean) C0A4M.LIZ.getValue()).booleanValue()) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLLLLIL = i;
        C786410Ut5.LLLLLIL(getLottieView(), 8);
        C786410Ut5.LLLLLIL(getBreathLottieView(), 8);
        C786410Ut5.LLLLLIL(getRewardLottieView(), 8);
        C786410Ut5.LLZZLLIL(getTimerView(), 0);
        C786410Ut5.LJZL(4, getRewardView());
        C786410Ut5.LLZZLLIL(getRewardImg(), 0);
        C786410Ut5.LLLLZLL(getRewardText(), 0);
    }

    @Override // X.C1898700zVc
    public void setCloseViewLocation(int i) {
        this.LLLLLIL = i;
    }

    @Override // X.C1898700zVc
    public final void LJIJJLI(C1302030jzF c1302030jzF, Function0 function0) {
        function0.invoke();
    }

    @Override // X.C1898700zVc
    public final void LJJI(Integer num, AwS134S0101000_28 awS134S0101000_28) {
        ValueAnimator valueAnimatorLIZ = C370610Efz.LIZ(getTimerView(), 1.0f, 0.0f, 0L, null, null, new AwS429S0200000_28(this, num, 8), 112);
        ValueAnimator valueAnimatorLIZ2 = C370610Efz.LIZ(getRewardImg(), 0.0f, 1.06f, 0L, null, new AwS607S0100000_28(this, 36), null, 176);
        ValueAnimator valueAnimatorLIZ3 = C370610Efz.LIZ(getRewardImg(), 1.06f, 1.0f, 0L, new DecelerateInterpolator(2.0f), new AwS607S0100000_28(this, 37), null, 144);
        ValueAnimator valueAnimatorLIZ4 = C370610Efz.LIZ(getRewardImg(), 1.0f, 0.0f, 1000L, null, new AwS607S0100000_28(this, 38), new AwS572S0100000_28(this, 43), 32);
        ValueAnimator valueAnimatorLIZ5 = C370610Efz.LIZ(getTimerView(), 0.0f, 1.06f, 0L, null, null, null, 240);
        ValueAnimator valueAnimatorLIZ6 = C370610Efz.LIZ(getTimerView(), 1.06f, 1.0f, 0L, new DecelerateInterpolator(2.0f), null, null, 208);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorLIZ, valueAnimatorLIZ2, valueAnimatorLIZ3, valueAnimatorLIZ4, valueAnimatorLIZ5, valueAnimatorLIZ6);
        animatorSet.start();
    }

    @Override // X.C1898700zVc
    public final void LJJII(String str, String str2) {
        getTimerView().setImageURI(str);
        getRewardImg().setImageURI(str2);
    }

    @Override // X.C1898700zVc
    public final void LJIILL(ProgressInfo progressInfo, TimeInfo timeInfo, int i, boolean z) {
        super.LJIILL(progressInfo, timeInfo, i, z);
        if (z) {
            setPreviousConsumeTime(0);
            getProgressBarTimerView().LIZ(1.0f);
        } else {
            setPreviousConsumeTime(0);
            C786410Ut5.LLLLLILLIL(getProgressBarTimerView(), 4);
        }
    }

    @Override // X.C1898700zVc
    public final void LJIILLIIL(boolean z, boolean z2, Integer num, int i, boolean z3, boolean z4) {
        super.LJIILLIIL(z, z2, num, i, z3, z4);
        if (z3) {
            this.LLJJIJIL = 0;
            getProgressBarTimerView().LIZ(1.0f);
            C786410Ut5.LLLLLILLIL(getProgressBarTimerView(), 0);
        } else {
            setPreviousConsumeTime(0);
            C786410Ut5.LLLLLILLIL(getProgressBarTimerView(), 4);
        }
    }
}
