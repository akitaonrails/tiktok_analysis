package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1621806Wq {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Function0<Integer> LIZ;
    public final Function0<Integer> LIZIZ;
    public final Function0<View> LIZJ;
    public final Function0<Unit> LIZLLL;
    public float LJ = 1.0f;
    public int LJFF;
    public C0H25 LJI;
    public ValueAnimator LJII;

    public final void LIZ() {
        int iIntValue = ((int) ((1.0f - this.LJ) * this.LIZ.invoke().intValue())) + this.LJFF;
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        View viewInvoke = this.LIZJ.invoke();
        if (viewInvoke != null) {
            ViewGroup.LayoutParams layoutParams = viewInvoke.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iIntValue;
            C786410Ut5.W5(viewInvoke, layoutParams);
        }
    }

    public C1621806Wq(AwS546S0100000_2 awS546S0100000_2, AwS546S0100000_2 awS546S0100000_22, AwS546S0100000_2 awS546S0100000_23, AwS546S0100000_2 awS546S0100000_24) {
        this.LIZ = awS546S0100000_2;
        this.LIZIZ = awS546S0100000_22;
        this.LIZJ = awS546S0100000_23;
        this.LIZLLL = awS546S0100000_24;
    }
}
