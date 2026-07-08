package X;

import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15B3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B3 {
    public final boolean LIZ = false;
    public final List<C15AK<?>> LIZIZ = new ArrayList();

    public final C15B1 LIZJ() {
        return new C15B1(this.LIZIZ, this.LIZ);
    }

    public final void LIZ(C15AK c15ak) {
        ((ArrayList) this.LIZIZ).add(c15ak);
    }

    public static void LIZIZ(C15B3 c15b3, C1782410wU3 c1782410wU3, int i) {
        LinearInterpolator linearInterpolator;
        if ((i & 8) != 0) {
            linearInterpolator = new LinearInterpolator();
        } else {
            linearInterpolator = null;
        }
        ((ArrayList) c15b3.LIZIZ).add(new C15AK(0L, 0L, linearInterpolator, C15AG.TRANSLATE, c1782410wU3, 2));
    }
}
