package X;

import Y.ATListenerS6S0200001_1;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03GK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, EnumC1358190lRp enumC1358190lRp, Function2 function2, int i) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        if (view != null) {
            C259800zU c259800zU = new C259800zU();
            int i2 = C1358200lRq.LIZ[enumC1358190lRp.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        if (i2 == 5) {
                            view.setOnTouchListener(null);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C427690Gpr.LJI(view, function2);
                    return;
                }
                C427690Gpr.LJFF(view, C418440Gaw.LIZIZ(36));
                return;
            }
            view.setOnTouchListener(new ATListenerS6S0200001_1(c259800zU, function2, 0.0f, 0));
        }
    }
}
