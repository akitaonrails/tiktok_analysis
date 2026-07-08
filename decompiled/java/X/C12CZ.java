package X;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CZ {
    public final C1462760oAU LIZ;
    public final Function0<Unit> LIZIZ;
    public ValueAnimator LIZJ;

    public final void LIZ() {
        C1462760oAU c1462760oAU = this.LIZ;
        if ((c1462760oAU instanceof C1462760oAU) && c1462760oAU != null) {
            c1462760oAU.setCanInterceptTouchEvent(true);
        }
        C1462760oAU c1462760oAU2 = this.LIZ;
        if (c1462760oAU2.LLLIZZ) {
            c1462760oAU2.LJIIL();
        }
        this.LIZIZ.invoke();
    }

    public C12CZ(C1462760oAU c1462760oAU, AwS573S0100000_29 awS573S0100000_29) {
        this.LIZ = c1462760oAU;
        this.LIZIZ = awS573S0100000_29;
    }
}
