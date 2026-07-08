package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651820t5Q {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 204));

    public final void LIZ() {
        C786410Ut5.LJLZ(4, this.LIZ);
        ((ValueAnimator) this.LIZJ.getValue()).cancel();
    }

    public final void LIZIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = this.LIZIZ;
        if (context == null) {
            context = this.LIZ.getContext();
        }
        C578880Mn8.LIZIZ(context, this.LIZ);
        ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i = C578100Mls.LIZIZ;
            if (i < 0) {
                C578100Mls.LIZ(context);
                i = C578100Mls.LIZIZ;
            }
            marginLayoutParams.bottomMargin = i;
        }
        C786410Ut5.LJLZ(0, this.LIZ);
        if (C2281551ESb.LIZIZ.LJI()) {
            C786410Ut5.R4(0.5f, this.LIZ);
        } else {
            ((ValueAnimator) this.LIZJ.getValue()).start();
        }
    }

    public C1651820t5Q(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = context;
    }
}
