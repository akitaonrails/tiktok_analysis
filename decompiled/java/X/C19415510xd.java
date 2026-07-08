package X;

import Y.AAListenerS339S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415510xd extends C12O8 {
    public final long LJ;
    public final View LJFF;
    public final View LJI;
    public final C16F5 LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public final C01GW LJIIJ;
    public boolean LJIIJJI;
    public final int LJIIL;

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
        View view = this.LJFF;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 54));
        valueAnimatorOfFloat.start();
        C473410IhP.LIZJ(new ARunnableS129S0100000_29(this, 193), this.LJ);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJFF;
    }

    @Override // X.C12O8
    public final Map<String, String> LJIIJ(String str) {
        return C2097908Jt.LIZJ(new Pair("preview_viewer_cnt", String.valueOf(this.LJIIIZ)));
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        this.LJIIJJI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 53));
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(c12ob, 20));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        super.LJIILLIIL(c19mb);
        long j = this.LJIIIZ;
        if (j >= 0) {
            if (this.LJIIJJI) {
                this.LJIIIZ = j;
                return;
            }
            int length = String.valueOf(j).length();
            if (length != this.LJIIIIZZ) {
                View view = this.LJFF;
                if (view != null) {
                    view.setMinimumWidth(((Number) this.LJIIJ.getValue()).intValue() + (((int) C497740JfY.LIZIZ(8.0f)) * length));
                    view.requestLayout();
                }
                this.LJIIIIZZ = length;
            }
            int i = (int) j;
            SpannableString spannableString = new SpannableString(C497740JfY.LJIIL(2131755926, i, Integer.valueOf(i)));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.LJIIL);
            int iLJJJ = a0.LJJJ(spannableString, String.valueOf(j), 0, false, 6);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("find ");
            sbLIZ.append(j);
            sbLIZ.append(": ");
            sbLIZ.append(iLJJJ);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJIIIIZZ);
            C20441214yg.LIZIZ("LiveWhiteBoxState", C2188811AlT.LIZIZ(sbLIZ));
            int i2 = this.LJIIIIZZ + iLJJJ;
            if (iLJJJ < 0 || i2 > spannableString.length()) {
                return;
            }
            try {
                C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, i2, 17);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C16F5 c16f5 = this.LJII;
            if (c16f5 == null) {
                return;
            }
            c16f5.setText(spannableString);
        }
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public C19415510xd(long j, View view) {
        super(C12OE.PREVIEW_WATCH, 6);
        this.LJ = 10000L;
        this.LJIIIIZZ = 1;
        this.LJIIJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(513));
        this.LJIIIZ = j;
        this.LJFF = view.findViewById(R.id.rsm);
        this.LJI = view.findViewById(R.id.rso);
        this.LJII = (C16F5) view.findViewById(R.id.rsp);
        this.LJIIL = C497740JfY.LIZLLL(R.attr.c5q, view.getContext());
    }
}
