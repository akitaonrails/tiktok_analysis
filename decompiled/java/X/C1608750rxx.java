package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608750rxx {
    public final C1609400rz0 LIZ = new C1609400rz0(null);
    public C1608760rxy LIZIZ = new C1608760rxy(null, EnumC992190bvV.DEFAULT);
    public final C1606830rur LIZJ = new C1606830rur(0);

    public final void LIZ(Function1<? super C1609400rz0, Unit> function1) {
        function1.invoke(this.LIZ);
    }

    public final void LIZIZ(Function1<? super C1606830rur, Unit> function1) {
        function1.invoke(this.LIZJ);
    }

    public final void LIZJ(InterfaceC1608860ry8<? extends InterfaceC426680GoE> interfaceC1608860ry8) {
        Set setSingleton;
        Set<? extends InterfaceC1608860ry8<?>> set = this.LIZIZ.LIZ;
        if (set != null) {
            setSingleton = C15442062u.LJIIIIZZ(interfaceC1608860ry8, set);
        } else {
            setSingleton = Collections.singleton(interfaceC1608860ry8);
        }
        this.LIZIZ = new C1608760rxy(setSingleton, this.LIZIZ.LIZIZ);
    }

    public final void LIZLLL(InterfaceC1608860ry8<? extends InterfaceC426680GoE>... interfaceC1608860ry8Arr) {
        Iterable iterableLJLIIL;
        Set<? extends InterfaceC1608860ry8<?>> set = this.LIZIZ.LIZ;
        if (set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(set.size() + interfaceC1608860ry8Arr.length));
            linkedHashSet.addAll(set);
            C19719612Di.LJJII(linkedHashSet, interfaceC1608860ry8Arr);
            iterableLJLIIL = linkedHashSet;
        } else {
            iterableLJLIIL = C13LQ.LJLIIL(interfaceC1608860ry8Arr);
        }
        this.LIZIZ = new C1608760rxy(C13LP.LLIIJI(C13LP.LJJJJLI(iterableLJLIIL)), this.LIZIZ.LIZIZ);
    }
}
