package X;

import Y.AAListenerS339S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415610xe extends C12O8 {
    public final View LJ;
    public final View LJFF;
    public final C16F5 LJI;
    public int LJII;
    public long LJIIIIZZ;
    public final C01GW LJIIIZ;
    public boolean LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 75;
    }

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 2;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 150L;
        View view = this.LJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 41));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJ;
    }

    public C19415610xe(View view) {
        super(C12OE.COLD_START, 1);
        this.LJII = 1;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(514));
        this.LJIIIIZZ = 0L;
        this.LJ = view.findViewById(R.id.yh9);
        this.LJFF = view.findViewById(R.id.yh_);
        this.LJI = (C16F5) view.findViewById(R.id.yha);
        this.LJIIJJI = C497740JfY.LIZLLL(R.attr.c5q, view.getContext());
        this.LJIIL = C497740JfY.LJIJI(2131844571);
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        this.LJIIJ = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 62));
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(c12ob, 15));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        super.LJIILLIIL(c19mb);
        LJIJJ(this.LJIIIIZZ);
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public final void LJIJJ(long j) {
        if (j < 0) {
            return;
        }
        if (this.LJIIJ) {
            this.LJIIIIZZ = j;
            return;
        }
        int length = String.valueOf(j).length();
        if (length != this.LJII) {
            View view = this.LJ;
            if (view != null) {
                view.setMinimumWidth(((Number) this.LJIIIZ.getValue()).intValue() + (((int) C497740JfY.LIZIZ(8.0f)) * length));
                view.requestLayout();
            }
            this.LJII = length;
        }
        SpannableString spannableString = new SpannableString(u.LJJIFFI(this.LJIIL, "{num}", String.valueOf(j), false));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.LJIIJJI);
        int iLJJJ = a0.LJJJ(spannableString, String.valueOf(j), 0, false, 6);
        int iLJJJ2 = a0.LJJJ(spannableString, "+", 0, false, 6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find ");
        sbLIZ.append(j);
        sbLIZ.append(": ");
        sbLIZ.append(iLJJJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJII);
        C20441214yg.LIZIZ("LiveColdStartState", C2188811AlT.LIZIZ(sbLIZ));
        int iMin = Math.min(iLJJJ, iLJJJ2);
        int iMax = Math.max(iLJJJ + this.LJII, iLJJJ2 + 1);
        if (iMin >= 0 && iMax <= spannableString.length()) {
            try {
                C786410Ut5.p2(spannableString, foregroundColorSpan, iMin, iMax, 17);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C16F5 c16f5 = this.LJI;
            if (c16f5 != null) {
                c16f5.setText(spannableString);
            }
        }
    }
}
