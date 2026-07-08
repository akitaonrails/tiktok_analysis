package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157480gE6<T> extends AbstractC1157490gE7<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157480gE6) && Intrinsics.LJFF(this.LIZ, ((C1157480gE6) obj).LIZ);
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
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1157480gE6(InterfaceC1791790wjB interfaceC1791790wjB) {
        this.LIZ = interfaceC1791790wjB;
    }
}
