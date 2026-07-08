package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19202010Ag implements InterfaceC191999109l {
    public static final C19202010Ag LIZ = new C19202010Ag();
    public static final List<Pair<String, InterfaceC191999109l>> LIZIZ = new ArrayList();
    public static final List<InterfaceC191999109l> LIZJ = new ArrayList();

    @Override // X.InterfaceC191999109l
    public final void LIZ(C192008109u c192008109u) {
        LIZJ(c192008109u, new AwS607S0100000_28(c192008109u, 371));
    }

    @Override // X.InterfaceC191999109l
    public final void LIZIZ(C192008109u c192008109u) {
        LIZJ(c192008109u, new AwS607S0100000_28(c192008109u, 375));
    }

    @Override // X.InterfaceC191999109l
    public final void LIZLLL(C192008109u c192008109u) {
        LIZJ(c192008109u, new AwS607S0100000_28(c192008109u, 373));
    }

    @Override // X.InterfaceC191999109l
    public final void LJ(C192008109u c192008109u) {
        LIZJ(c192008109u, new AwS607S0100000_28(c192008109u, 374));
    }

    @Override // X.InterfaceC191999109l
    public final void LJFF(C192008109u c192008109u) {
        LIZJ(c192008109u, new AwS607S0100000_28(c192008109u, 372));
    }

    public static void LIZJ(C192008109u c192008109u, Function1 function1) {
        String str = c192008109u.LIZIZ;
        if (str == null) {
            str = c192008109u.LIZ;
        }
        for (Pair pair : (ArrayList) LIZIZ) {
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            if (Intrinsics.LJFF(str, first)) {
                function1.invoke(second);
            }
        }
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
