package X;

import X.InterfaceC0148002o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OI6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI6<S extends InterfaceC0148002o> {
    public final C0OI4 LIZ;
    public final List<InterfaceC346201Wa<Function1<S, S>>> LIZIZ = new ArrayList();

    public C0OI6(C0OI4 c0oi4) {
        this.LIZ = c0oi4;
    }

    public final <T> void LIZ(C0OIH<T> c0oih, Function2<? super S, ? super T, ? extends S> function2) {
        ((ArrayList) this.LIZIZ).add(new C638940P4i(function2, new C05RH(this.LIZ.LJ(c0oih)), 1));
    }
}
