package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13D1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13D1<T> implements InterfaceC19973313Cx<T> {
    public final Function1<InterfaceC1670270tZB, T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13D1) && Intrinsics.LJFF(this.LIZ, ((C13D1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComputedValueHolder(compute=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13D1(Function1<? super InterfaceC1670270tZB, ? extends T> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC19973313Cx
    public final T readValue(C13D2 c13d2) {
        return this.LIZ.invoke(c13d2);
    }
}
