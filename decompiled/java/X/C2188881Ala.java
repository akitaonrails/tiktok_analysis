package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import Y.AUListenerS235S0200000_33;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ala, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188881Ala implements C0T9G {
    public String LIZ;
    public long LIZIZ = 3000;
    public long LIZJ = 15000;
    public View LIZLLL;
    public C1295960jpS LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public ViewGroup LJII;
    public Function0<Unit> LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.C0T9G
    public final void LIZJ() {
        this.LIZIZ = 3000L;
    }

    @Override // X.C0T9G
    public final void LJJJJL() {
        View view = this.LIZLLL;
        if (view != null) {
            C0H0N.LJII(view);
        }
        C1295960jpS c1295960jpS = this.LJ;
        if (c1295960jpS != null) {
            C0H0N.LJII(c1295960jpS);
        }
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            C0H0N.LJIIIIZZ(viewGroup);
        }
        this.LJIIIZ = false;
    }

    @Override // X.C0T9G
    public final void LJLJLJ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        String str = this.LIZ;
        if (str == null || str.length() == 0) {
            TuxTextView tuxTextView = this.LJI;
            if (tuxTextView != null) {
                C0H0N.LJII(tuxTextView);
            }
        } else {
            TuxTextView tuxTextView2 = this.LJI;
            if (tuxTextView2 != null) {
                C0H0N.LJIILJJIL(tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(this.LIZ);
            }
        }
        View view = this.LIZLLL;
        if (view != null) {
            C0H0N.LJIILJJIL(view);
        }
        C1295960jpS c1295960jpS = this.LJ;
        if (c1295960jpS != null) {
            C0H0N.LJIILJJIL(c1295960jpS);
        }
        long j = this.LIZIZ;
        if (j <= 0) {
            j = 3000;
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS133S0100000_33(this, 124), j);
        }
        long j2 = this.LIZJ;
        if (j2 <= 0) {
            j2 = 15000;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 50);
        ValueAnimator valueAnimator = null;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration((long) (j2 * 0.2d));
            valueAnimatorOfInt.addUpdateListener(new AUListenerS235S0200000_33(valueAnimatorOfInt, this, 9));
        } else {
            valueAnimatorOfInt = null;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(51, 95);
        if (valueAnimatorOfInt2 != null) {
            valueAnimatorOfInt2.setDuration((long) (j2 * 0.8d));
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS235S0200000_33(valueAnimatorOfInt2, this, 10));
            valueAnimator = valueAnimatorOfInt2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimator);
        animatorSet.start();
    }

    @Override // X.C0T9G
    public final void LIZIZ(String str) {
        this.LIZ = str;
    }

    @Override // X.C0T9G
    public final void LIZLLL(long j) {
        this.LIZJ = j;
    }

    @Override // X.C0T9G
    public final void LJ(Function0<Unit> function0) {
        this.LJIIIIZZ = function0;
    }

    public final void LJFF(int i) {
        C1295960jpS c1295960jpS = this.LJ;
        if (c1295960jpS != null) {
            c1295960jpS.setProgress(i / 100.0f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
    }

    @Override // X.C0T9G
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.afa, viewGroup, true);
        C1295960jpS c1295960jpS = (C1295960jpS) viewTd.findViewById(R.id.nmu);
        c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_aihexloadingbig);
        this.LJ = c1295960jpS;
        this.LJFF = (TuxTextView) viewTd.findViewById(R.id.du6);
        this.LJI = (TuxTextView) viewTd.findViewById(R.id.du5);
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.aoz);
        this.LJII = viewGroup2;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS167S0100000_33(this, 105));
        }
        this.LIZLLL = viewTd;
        C0H0N.LJII(viewTd);
        return viewTd;
    }
}
