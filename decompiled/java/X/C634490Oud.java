package X;

import androidx.compose.foundation.selection.SelectableElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS5S0320000_9;

/* JADX INFO: renamed from: X.0Oud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634490Oud {
    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680320tpO interfaceC1680320tpO, boolean z2, C20279814Wu c20279814Wu, Function0<Unit> function0) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        if (interfaceC1680320tpO instanceof InterfaceC1693230uAD) {
            interfaceC1685750ty9LIZIZ = new SelectableElement(z, interfaceC595010NVj, (InterfaceC1693230uAD) interfaceC1680320tpO, z2, c20279814Wu, function0);
        } else if (interfaceC1680320tpO == null) {
            interfaceC1685750ty9LIZIZ = new SelectableElement(z, interfaceC595010NVj, null, z2, c20279814Wu, function0);
        } else if (interfaceC595010NVj != null) {
            interfaceC1685750ty9LIZIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, interfaceC1680320tpO).LIZ(new SelectableElement(z, interfaceC595010NVj, null, z2, c20279814Wu, function0));
        } else {
            interfaceC1685750ty9LIZIZ = C1685720ty6.LIZIZ(InterfaceC1685750ty9.LIZ, new AwS5S0320000_9(interfaceC1680320tpO, z, z2, c20279814Wu, function0, 0));
        }
        return interfaceC1685750ty9.LIZ(interfaceC1685750ty9LIZIZ);
    }
}
