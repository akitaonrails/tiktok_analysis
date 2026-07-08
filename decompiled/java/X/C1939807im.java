package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1939807im implements InterfaceC1939907in {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1939807im) && this.LIZ == ((C1939807im) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sticky(distinct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1939907in
    public final <T> void LIZ(Iterable<? extends T> iterable, Function1<? super T, Unit> function1) {
        if (this.LIZ) {
            iterable = C13LP.LJLJJLL(C13LP.LLIIJI(C13LP.LJLJJLL(iterable)));
        }
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }
}
