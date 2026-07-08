package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19973213Cw<T> implements InterfaceC19973313Cx<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19973213Cw) && Intrinsics.LJFF(this.LIZ, ((C19973213Cw) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StaticValueHolder(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19973213Cw(T t) {
        this.LIZ = t;
    }

    @Override // X.InterfaceC19973313Cx
    public final T readValue(C13D2 c13d2) {
        return this.LIZ;
    }
}
