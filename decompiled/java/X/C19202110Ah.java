package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19202110Ah implements InterfaceC19202310Aj {
    public static final C19202110Ah LIZ = new C19202110Ah();
    public static final List<Pair<String, InterfaceC19202310Aj>> LIZIZ = new ArrayList();

    @Override // X.InterfaceC19202310Aj
    public final void LIZJ(C19202210Ai c19202210Ai) {
        LIZ(c19202210Ai.LIZ, new AwS607S0100000_28(c19202210Ai, 376));
    }

    @Override // X.InterfaceC19202310Aj
    public final void LJI(C19202210Ai c19202210Ai) {
        LIZ(c19202210Ai.LIZ, new AwS607S0100000_28(c19202210Ai, 377));
    }

    public static void LIZ(String str, Function1 function1) {
        for (Pair pair : (ArrayList) LIZIZ) {
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            if (Intrinsics.LJFF(str, first)) {
                function1.invoke(second);
            }
        }
    }
}
