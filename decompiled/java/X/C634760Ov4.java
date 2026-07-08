package X;

import androidx.compose.foundation.selection.ToggleableElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS5S0320000_9;

/* JADX INFO: renamed from: X.0Ov4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634760Ov4 {
    public static final InterfaceC1685750ty9 LIZ(C1685760tyA c1685760tyA, boolean z, InterfaceC595010NVj interfaceC595010NVj, C1680220tpE c1680220tpE, boolean z2, C20279814Wu c20279814Wu, Function1 function1) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        if (c1680220tpE instanceof InterfaceC1693230uAD) {
            interfaceC1685750ty9LIZIZ = new ToggleableElement(z, interfaceC595010NVj, c1680220tpE, z2, c20279814Wu, function1);
        } else if (c1680220tpE == null) {
            interfaceC1685750ty9LIZIZ = new ToggleableElement(z, interfaceC595010NVj, null, z2, c20279814Wu, function1);
        } else if (interfaceC595010NVj != null) {
            interfaceC1685750ty9LIZIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, c1680220tpE).LIZ(new ToggleableElement(z, interfaceC595010NVj, null, z2, c20279814Wu, function1));
        } else {
            interfaceC1685750ty9LIZIZ = C1685720ty6.LIZIZ(InterfaceC1685750ty9.LIZ, new AwS5S0320000_9(c1680220tpE, z, z2, c20279814Wu, function1, 1));
        }
        c1685760tyA.getClass();
        return interfaceC1685750ty9LIZIZ;
    }
}
