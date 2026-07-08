package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13DM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DM<T> implements InterfaceC19973313Cx<T> {
    public final C05P0<T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13DM) && Intrinsics.LJFF(this.LIZ, ((C13DM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicValueHolder(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13DM(C05P0<T> c05p0) {
        this.LIZ = c05p0;
    }

    @Override // X.InterfaceC19973313Cx
    public final T readValue(C13D2 c13d2) {
        return this.LIZ.getValue();
    }
}
