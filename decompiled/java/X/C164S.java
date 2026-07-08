package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164S {
    public static final <T extends C0S5Q, E extends InterfaceC710780RuO> void LIZ(C164P<T, E> c164p, Function1<? super C164W<T, E>, Unit> function1) {
        C164W c164w = new C164W();
        function1.invoke(c164w);
        C19719912Dl c19719912Dl = c164w.LIZ;
        if (c19719912Dl != null) {
            Pair pair = new Pair(c19719912Dl, c164w.LIZIZ);
            C13IQ c13iq = (C13IQ) pair.getFirst();
            for (C164T c164t : (List) pair.getSecond()) {
                c164p.LJIILLIIL(c164p, new C164Q<>(c13iq, c164t.LIZIZ, c164t.LIZJ, c164t.LIZLLL, c164t.LJ, c164t.LJFF));
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
