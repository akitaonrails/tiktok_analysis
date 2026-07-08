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
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415710xf extends C12O8 {
    public final long LJ;
    public final View LJFF;
    public final View LJI;
    public final C16F5 LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public final String LJIIJ;
    public final C01GW LJIIJJI;
    public boolean LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;

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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 49));
        valueAnimatorOfFloat.start();
        C473410IhP.LIZJ(new ARunnableS129S0100000_29(this, 188), this.LJ);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJFF;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        this.LJIIL = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 46));
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(c12ob, 17));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        super.LJIILLIIL(c19mb);
        LJIJJ(this.LJIIIZ, this.LJIIJ);
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public final void LJIJJ(long j, String str) {
        SpannableString spannableString;
        if (j < 0) {
            return;
        }
        if (this.LJIIL) {
            this.LJIIIZ = j;
            return;
        }
        int length = String.valueOf(j).length();
        if (length != this.LJIIIIZZ) {
            View view = this.LJFF;
            if (view != null) {
                view.setMinimumWidth(((Number) this.LJIIJJI.getValue()).intValue() + (((int) C497740JfY.LIZIZ(8.0f)) * length));
                view.requestLayout();
            }
            this.LJIIIIZZ = length;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.LJIILIIL);
        if (C123100dR.LIZ(str)) {
            try {
                if (a0.LJJIJ(str, '[') && a0.LJJIJ(str, ']')) {
                    String strSubstring = str.substring(a0.LJJIZ(str, '[', 0, false, 6) + 1, a0.LJJIZ(str, ']', 0, false, 6));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(strSubstring);
                    sbLIZ2.append(']');
                    sbLIZ.append(u.LJJIFFI(str, C2188811AlT.LIZIZ(sbLIZ2), "", false));
                    sbLIZ.append(strSubstring);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    spannableString = new SpannableString(strLIZIZ);
                    try {
                        C786410Ut5.p2(spannableString, foregroundColorSpan, a0.LJJJ(strLIZIZ, strSubstring, 0, false, 6), a0.LJJJ(strLIZIZ, strSubstring, 0, false, 6) + strSubstring.length(), 17);
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    spannableString = new SpannableString(str);
                }
            } catch (Exception e2) {
                e = e2;
                spannableString = null;
            }
        } else {
            spannableString = new SpannableString(u.LJJIFFI(this.LJIILJJIL, "{num}", String.valueOf(j), false));
            int iLJJJ = a0.LJJJ(spannableString, String.valueOf(j), 0, false, 6);
            int iLJJJ2 = a0.LJJJ(spannableString, "+", 0, false, 6);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("find ");
            sbLIZ3.append(j);
            sbLIZ3.append(": ");
            sbLIZ3.append(iLJJJ);
            sbLIZ3.append(", ");
            sbLIZ3.append(this.LJIIIIZZ);
            C20441214yg.LIZIZ("LiveWhiteBoxState", C2188811AlT.LIZIZ(sbLIZ3));
            int iMin = Math.min(iLJJJ, iLJJJ2);
            int iMax = Math.max(iLJJJ + this.LJIIIIZZ, iLJJJ2 + 1);
            if (iMin >= 0 && iMax <= spannableString.length()) {
                try {
                    C786410Ut5.p2(spannableString, foregroundColorSpan, iMin, iMax, 17);
                } catch (IndexOutOfBoundsException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            } else {
                return;
            }
        }
        C16F5 c16f5 = this.LJII;
        if (c16f5 != null) {
            c16f5.setText(spannableString);
        }
    }

    public C19415710xf(long j, long j2, View view, String str) {
        super(C12OE.WHITE_BOX_2, 1);
        this.LJ = j2;
        this.LJIIIIZZ = 1;
        this.LJIIJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(512));
        this.LJIIIZ = j;
        this.LJIIJ = str;
        this.LJFF = view.findViewById(R.id.yh9);
        this.LJI = view.findViewById(R.id.yh_);
        this.LJII = (C16F5) view.findViewById(R.id.yha);
        this.LJIILIIL = C497740JfY.LIZLLL(R.attr.c5q, view.getContext());
        this.LJIILJJIL = C497740JfY.LJIJI(2131844571);
    }
}
