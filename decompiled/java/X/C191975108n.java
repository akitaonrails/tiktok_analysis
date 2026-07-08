package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.108n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191975108n {
    public static final void LIZ(C191995109h c191995109h, int i, Function1 function1) {
        C191976108o c191976108o = new C191976108o(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c191995109h.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(c191976108o.LJIIIIZZ);
        c191976108o.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        function1.invoke(c191976108o);
        ((ArrayList) c191995109h.LJIIIIZZ).add(c191976108o);
    }

    public static final void LIZIZ(C107N c107n, int i, Function1 function1) {
        C105M c105m = new C105M(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c107n.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(c105m.LJIIIIZZ);
        c105m.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        function1.invoke(c105m);
        c107n.LJIIJJI.add(c105m);
    }

    public static final C191995109h LIZJ(String str, String str2, Function1<? super C191995109h, Unit> function1) {
        C191995109h c191995109h = new C191995109h(str, str2);
        function1.invoke(c191995109h);
        return c191995109h;
    }
}
